package com.goforer.sotong.data.datasource.model.cache;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.goforer.sotong.data.datasource.model.dao.remote.feed.FeedDao;
import com.goforer.sotong.data.datasource.model.dao.remote.feed.FeedDao_Impl;
import com.goforer.sotong.data.datasource.model.dao.remote.profile.UserDao;
import com.goforer.sotong.data.datasource.model.dao.remote.profile.UserDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Cache_Impl extends Cache {
  private volatile UserDao _userDao;

  private volatile FeedDao _feedDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `User` (`id` TEXT NOT NULL, `email` TEXT, `emailVerified` INTEGER NOT NULL, `name` TEXT, `providerId` TEXT, `phone` TEXT, `photo` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Feeds` (`id` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, `media` TEXT NOT NULL, `likes` INTEGER NOT NULL, `ranking` INTEGER NOT NULL, `description` TEXT NOT NULL, `userid` TEXT NOT NULL, `useremail` TEXT, `useremailVerified` INTEGER NOT NULL, `username` TEXT, `userproviderId` TEXT, `userphone` TEXT, `userphoto` TEXT, `videoid` TEXT NOT NULL, `videourl` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '66466d5cbb29a4888553e41bdcd29d92')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `User`");
        _db.execSQL("DROP TABLE IF EXISTS `Feeds`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(7);
        _columnsUser.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("emailVerified", new TableInfo.Column("emailVerified", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("providerId", new TableInfo.Column("providerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("phone", new TableInfo.Column("phone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("photo", new TableInfo.Column("photo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("User", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "User");
        if (! _infoUser.equals(_existingUser)) {
          return new RoomOpenHelper.ValidationResult(false, "User(com.megazone.megatong.data.datasource.model.cache.entity.user.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsFeeds = new HashMap<String, TableInfo.Column>(16);
        _columnsFeeds.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("media", new TableInfo.Column("media", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("likes", new TableInfo.Column("likes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("ranking", new TableInfo.Column("ranking", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("userid", new TableInfo.Column("userid", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("useremail", new TableInfo.Column("useremail", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("useremailVerified", new TableInfo.Column("useremailVerified", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("username", new TableInfo.Column("username", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("userproviderId", new TableInfo.Column("userproviderId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("userphone", new TableInfo.Column("userphone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("userphoto", new TableInfo.Column("userphoto", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("videoid", new TableInfo.Column("videoid", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeeds.put("videourl", new TableInfo.Column("videourl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFeeds = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFeeds = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFeeds = new TableInfo("Feeds", _columnsFeeds, _foreignKeysFeeds, _indicesFeeds);
        final TableInfo _existingFeeds = TableInfo.read(_db, "Feeds");
        if (! _infoFeeds.equals(_existingFeeds)) {
          return new RoomOpenHelper.ValidationResult(false, "Feeds(com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed).\n"
                  + " Expected:\n" + _infoFeeds + "\n"
                  + " Found:\n" + _existingFeeds);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "66466d5cbb29a4888553e41bdcd29d92", "c46d143308943793ec44a7b0e923ecaa");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "User","Feeds");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `User`");
      _db.execSQL("DELETE FROM `Feeds`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public FeedDao feedDao() {
    if (_feedDao != null) {
      return _feedDao;
    } else {
      synchronized(this) {
        if(_feedDao == null) {
          _feedDao = new FeedDao_Impl(this);
        }
        return _feedDao;
      }
    }
  }
}
