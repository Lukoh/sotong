package com.megazone.megatong.data.datasource.model.dao.remote.feed;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed;
import com.megazone.megatong.data.datasource.model.cache.entity.user.User;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FeedDao_Impl implements FeedDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Feed> __insertionAdapterOfFeed;

  private final EntityDeletionOrUpdateAdapter<Feed> __deletionAdapterOfFeed;

  private final EntityDeletionOrUpdateAdapter<Feed> __updateAdapterOfFeed;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByFeedId;

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  public FeedDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFeed = new EntityInsertionAdapter<Feed>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Feeds` (`id`,`createdAt`,`updatedAt`,`media`,`likes`,`ranking`,`description`,`userid`,`useremail`,`useremailVerified`,`username`,`userproviderId`,`userphone`,`userphoto`,`videoid`,`videourl`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feed value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getCreatedAt());
        stmt.bindLong(3, value.getUpdatedAt());
        if (value.getMedia() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMedia());
        }
        stmt.bindLong(5, value.getLikes());
        stmt.bindLong(6, value.getRanking());
        if (value.getDescription() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDescription());
        }
        final User _tmpUser = value.getUser();
        if(_tmpUser != null) {
          if (_tmpUser.getId() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpUser.getId());
          }
          if (_tmpUser.getEmail() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpUser.getEmail());
          }
          final int _tmp;
          _tmp = _tmpUser.getEmailVerified() ? 1 : 0;
          stmt.bindLong(10, _tmp);
          if (_tmpUser.getName() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpUser.getName());
          }
          if (_tmpUser.getProviderId() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpUser.getProviderId());
          }
          if (_tmpUser.getPhone() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpUser.getPhone());
          }
          if (_tmpUser.getPhoto() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpUser.getPhoto());
          }
        } else {
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
        }
        final Feed.Video _tmpVideo = value.getVideo();
        if(_tmpVideo != null) {
          if (_tmpVideo.getId() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindString(15, _tmpVideo.getId());
          }
          if (_tmpVideo.getUrl() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindString(16, _tmpVideo.getUrl());
          }
        } else {
          stmt.bindNull(15);
          stmt.bindNull(16);
        }
      }
    };
    this.__deletionAdapterOfFeed = new EntityDeletionOrUpdateAdapter<Feed>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Feeds` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feed value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfFeed = new EntityDeletionOrUpdateAdapter<Feed>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `Feeds` SET `id` = ?,`createdAt` = ?,`updatedAt` = ?,`media` = ?,`likes` = ?,`ranking` = ?,`description` = ?,`userid` = ?,`useremail` = ?,`useremailVerified` = ?,`username` = ?,`userproviderId` = ?,`userphone` = ?,`userphoto` = ?,`videoid` = ?,`videourl` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feed value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getCreatedAt());
        stmt.bindLong(3, value.getUpdatedAt());
        if (value.getMedia() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMedia());
        }
        stmt.bindLong(5, value.getLikes());
        stmt.bindLong(6, value.getRanking());
        if (value.getDescription() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDescription());
        }
        final User _tmpUser = value.getUser();
        if(_tmpUser != null) {
          if (_tmpUser.getId() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpUser.getId());
          }
          if (_tmpUser.getEmail() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpUser.getEmail());
          }
          final int _tmp;
          _tmp = _tmpUser.getEmailVerified() ? 1 : 0;
          stmt.bindLong(10, _tmp);
          if (_tmpUser.getName() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpUser.getName());
          }
          if (_tmpUser.getProviderId() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpUser.getProviderId());
          }
          if (_tmpUser.getPhone() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpUser.getPhone());
          }
          if (_tmpUser.getPhoto() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpUser.getPhoto());
          }
        } else {
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
        }
        final Feed.Video _tmpVideo = value.getVideo();
        if(_tmpVideo != null) {
          if (_tmpVideo.getId() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindString(15, _tmpVideo.getId());
          }
          if (_tmpVideo.getUrl() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindString(16, _tmpVideo.getUrl());
          }
        } else {
          stmt.bindNull(15);
          stmt.bindNull(16);
        }
        if (value.getId() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteByFeedId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Feeds WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Feeds";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Feed[] obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFeed.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final Feed obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFeed.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<Feed> obj, final Continuation<Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFeed.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Feed obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFeed.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Feed[] obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFeed.handleMultiple(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Feed obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFeed.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteByFeedId(final String feedId, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByFeedId.acquire();
        int _argIndex = 1;
        if (feedId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, feedId);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteByFeedId.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object clearAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public DataSource.Factory<Integer, Feed> getFeeds() {
    final String _sql = "SELECT * FROM Feeds";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Feed>() {
      @Override
      public LimitOffsetDataSource<Feed> create() {
        return new LimitOffsetDataSource<Feed>(__db, _statement, false , "Feeds") {
          @Override
          protected List<Feed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(cursor, "createdAt");
            final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(cursor, "updatedAt");
            final int _cursorIndexOfMedia = CursorUtil.getColumnIndexOrThrow(cursor, "media");
            final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(cursor, "likes");
            final int _cursorIndexOfRanking = CursorUtil.getColumnIndexOrThrow(cursor, "ranking");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(cursor, "description");
            final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(cursor, "userid");
            final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(cursor, "useremail");
            final int _cursorIndexOfEmailVerified = CursorUtil.getColumnIndexOrThrow(cursor, "useremailVerified");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "username");
            final int _cursorIndexOfProviderId = CursorUtil.getColumnIndexOrThrow(cursor, "userproviderId");
            final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(cursor, "userphone");
            final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(cursor, "userphoto");
            final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(cursor, "videoid");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "videourl");
            final List<Feed> _res = new ArrayList<Feed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Feed _item;
              final String _tmpId;
              _tmpId = cursor.getString(_cursorIndexOfId);
              final long _tmpCreatedAt;
              _tmpCreatedAt = cursor.getLong(_cursorIndexOfCreatedAt);
              final long _tmpUpdatedAt;
              _tmpUpdatedAt = cursor.getLong(_cursorIndexOfUpdatedAt);
              final String _tmpMedia;
              _tmpMedia = cursor.getString(_cursorIndexOfMedia);
              final int _tmpLikes;
              _tmpLikes = cursor.getInt(_cursorIndexOfLikes);
              final int _tmpRanking;
              _tmpRanking = cursor.getInt(_cursorIndexOfRanking);
              final String _tmpDescription;
              _tmpDescription = cursor.getString(_cursorIndexOfDescription);
              final User _tmpUser;
              if (! (cursor.isNull(_cursorIndexOfId_1) && cursor.isNull(_cursorIndexOfEmail) && cursor.isNull(_cursorIndexOfEmailVerified) && cursor.isNull(_cursorIndexOfName) && cursor.isNull(_cursorIndexOfProviderId) && cursor.isNull(_cursorIndexOfPhone) && cursor.isNull(_cursorIndexOfPhoto))) {
                final String _tmpId_1;
                _tmpId_1 = cursor.getString(_cursorIndexOfId_1);
                final String _tmpEmail;
                _tmpEmail = cursor.getString(_cursorIndexOfEmail);
                final boolean _tmpEmailVerified;
                final int _tmp;
                _tmp = cursor.getInt(_cursorIndexOfEmailVerified);
                _tmpEmailVerified = _tmp != 0;
                final String _tmpName;
                _tmpName = cursor.getString(_cursorIndexOfName);
                final String _tmpProviderId;
                _tmpProviderId = cursor.getString(_cursorIndexOfProviderId);
                final String _tmpPhone;
                _tmpPhone = cursor.getString(_cursorIndexOfPhone);
                final String _tmpPhoto;
                _tmpPhoto = cursor.getString(_cursorIndexOfPhoto);
                _tmpUser = new User(_tmpId_1,_tmpEmail,_tmpEmailVerified,_tmpName,_tmpProviderId,_tmpPhone,_tmpPhoto);
              }  else  {
                _tmpUser = null;
              }
              final Feed.Video _tmpVideo;
              if (! (cursor.isNull(_cursorIndexOfId_2) && cursor.isNull(_cursorIndexOfUrl))) {
                final String _tmpId_2;
                _tmpId_2 = cursor.getString(_cursorIndexOfId_2);
                final String _tmpUrl;
                _tmpUrl = cursor.getString(_cursorIndexOfUrl);
                _tmpVideo = new Feed.Video(_tmpId_2,_tmpUrl);
              }  else  {
                _tmpVideo = null;
              }
              _item = new Feed(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpMedia,_tmpLikes,_tmpRanking,_tmpDescription,_tmpUser,_tmpVideo);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public LiveData<Feed> getLatestFeed() {
    final String _sql = "SELECT * FROM Feeds ORDER BY createdAt DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Feeds"}, false, new Callable<Feed>() {
      @Override
      public Feed call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfMedia = CursorUtil.getColumnIndexOrThrow(_cursor, "media");
          final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "likes");
          final int _cursorIndexOfRanking = CursorUtil.getColumnIndexOrThrow(_cursor, "ranking");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "userid");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "useremail");
          final int _cursorIndexOfEmailVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "useremailVerified");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfProviderId = CursorUtil.getColumnIndexOrThrow(_cursor, "userproviderId");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "userphone");
          final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "userphoto");
          final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "videoid");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "videourl");
          final Feed _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpMedia;
            _tmpMedia = _cursor.getString(_cursorIndexOfMedia);
            final int _tmpLikes;
            _tmpLikes = _cursor.getInt(_cursorIndexOfLikes);
            final int _tmpRanking;
            _tmpRanking = _cursor.getInt(_cursorIndexOfRanking);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final User _tmpUser;
            if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfEmail) && _cursor.isNull(_cursorIndexOfEmailVerified) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfProviderId) && _cursor.isNull(_cursorIndexOfPhone) && _cursor.isNull(_cursorIndexOfPhoto))) {
              final String _tmpId_1;
              _tmpId_1 = _cursor.getString(_cursorIndexOfId_1);
              final String _tmpEmail;
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
              final boolean _tmpEmailVerified;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfEmailVerified);
              _tmpEmailVerified = _tmp != 0;
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpProviderId;
              _tmpProviderId = _cursor.getString(_cursorIndexOfProviderId);
              final String _tmpPhone;
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
              final String _tmpPhoto;
              _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
              _tmpUser = new User(_tmpId_1,_tmpEmail,_tmpEmailVerified,_tmpName,_tmpProviderId,_tmpPhone,_tmpPhoto);
            }  else  {
              _tmpUser = null;
            }
            final Feed.Video _tmpVideo;
            if (! (_cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfUrl))) {
              final String _tmpId_2;
              _tmpId_2 = _cursor.getString(_cursorIndexOfId_2);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              _tmpVideo = new Feed.Video(_tmpId_2,_tmpUrl);
            }  else  {
              _tmpVideo = null;
            }
            _result = new Feed(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpMedia,_tmpLikes,_tmpRanking,_tmpDescription,_tmpUser,_tmpVideo);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Feed> getLatestUpdatedFeed() {
    final String _sql = "SELECT * FROM Feeds ORDER BY updatedAt  DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Feeds"}, false, new Callable<Feed>() {
      @Override
      public Feed call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfMedia = CursorUtil.getColumnIndexOrThrow(_cursor, "media");
          final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "likes");
          final int _cursorIndexOfRanking = CursorUtil.getColumnIndexOrThrow(_cursor, "ranking");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "userid");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "useremail");
          final int _cursorIndexOfEmailVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "useremailVerified");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfProviderId = CursorUtil.getColumnIndexOrThrow(_cursor, "userproviderId");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "userphone");
          final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "userphoto");
          final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "videoid");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "videourl");
          final Feed _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpMedia;
            _tmpMedia = _cursor.getString(_cursorIndexOfMedia);
            final int _tmpLikes;
            _tmpLikes = _cursor.getInt(_cursorIndexOfLikes);
            final int _tmpRanking;
            _tmpRanking = _cursor.getInt(_cursorIndexOfRanking);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final User _tmpUser;
            if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfEmail) && _cursor.isNull(_cursorIndexOfEmailVerified) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfProviderId) && _cursor.isNull(_cursorIndexOfPhone) && _cursor.isNull(_cursorIndexOfPhoto))) {
              final String _tmpId_1;
              _tmpId_1 = _cursor.getString(_cursorIndexOfId_1);
              final String _tmpEmail;
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
              final boolean _tmpEmailVerified;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfEmailVerified);
              _tmpEmailVerified = _tmp != 0;
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpProviderId;
              _tmpProviderId = _cursor.getString(_cursorIndexOfProviderId);
              final String _tmpPhone;
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
              final String _tmpPhoto;
              _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
              _tmpUser = new User(_tmpId_1,_tmpEmail,_tmpEmailVerified,_tmpName,_tmpProviderId,_tmpPhone,_tmpPhoto);
            }  else  {
              _tmpUser = null;
            }
            final Feed.Video _tmpVideo;
            if (! (_cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfUrl))) {
              final String _tmpId_2;
              _tmpId_2 = _cursor.getString(_cursorIndexOfId_2);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              _tmpVideo = new Feed.Video(_tmpId_2,_tmpUrl);
            }  else  {
              _tmpVideo = null;
            }
            _result = new Feed(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpMedia,_tmpLikes,_tmpRanking,_tmpDescription,_tmpUser,_tmpVideo);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public DataSource.Factory<Integer, Feed> getFeedsOrderByLikes() {
    final String _sql = "SELECT * FROM Feeds ORDER BY likes ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Feed>() {
      @Override
      public LimitOffsetDataSource<Feed> create() {
        return new LimitOffsetDataSource<Feed>(__db, _statement, false , "Feeds") {
          @Override
          protected List<Feed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(cursor, "createdAt");
            final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(cursor, "updatedAt");
            final int _cursorIndexOfMedia = CursorUtil.getColumnIndexOrThrow(cursor, "media");
            final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(cursor, "likes");
            final int _cursorIndexOfRanking = CursorUtil.getColumnIndexOrThrow(cursor, "ranking");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(cursor, "description");
            final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(cursor, "userid");
            final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(cursor, "useremail");
            final int _cursorIndexOfEmailVerified = CursorUtil.getColumnIndexOrThrow(cursor, "useremailVerified");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "username");
            final int _cursorIndexOfProviderId = CursorUtil.getColumnIndexOrThrow(cursor, "userproviderId");
            final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(cursor, "userphone");
            final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(cursor, "userphoto");
            final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(cursor, "videoid");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "videourl");
            final List<Feed> _res = new ArrayList<Feed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Feed _item;
              final String _tmpId;
              _tmpId = cursor.getString(_cursorIndexOfId);
              final long _tmpCreatedAt;
              _tmpCreatedAt = cursor.getLong(_cursorIndexOfCreatedAt);
              final long _tmpUpdatedAt;
              _tmpUpdatedAt = cursor.getLong(_cursorIndexOfUpdatedAt);
              final String _tmpMedia;
              _tmpMedia = cursor.getString(_cursorIndexOfMedia);
              final int _tmpLikes;
              _tmpLikes = cursor.getInt(_cursorIndexOfLikes);
              final int _tmpRanking;
              _tmpRanking = cursor.getInt(_cursorIndexOfRanking);
              final String _tmpDescription;
              _tmpDescription = cursor.getString(_cursorIndexOfDescription);
              final User _tmpUser;
              if (! (cursor.isNull(_cursorIndexOfId_1) && cursor.isNull(_cursorIndexOfEmail) && cursor.isNull(_cursorIndexOfEmailVerified) && cursor.isNull(_cursorIndexOfName) && cursor.isNull(_cursorIndexOfProviderId) && cursor.isNull(_cursorIndexOfPhone) && cursor.isNull(_cursorIndexOfPhoto))) {
                final String _tmpId_1;
                _tmpId_1 = cursor.getString(_cursorIndexOfId_1);
                final String _tmpEmail;
                _tmpEmail = cursor.getString(_cursorIndexOfEmail);
                final boolean _tmpEmailVerified;
                final int _tmp;
                _tmp = cursor.getInt(_cursorIndexOfEmailVerified);
                _tmpEmailVerified = _tmp != 0;
                final String _tmpName;
                _tmpName = cursor.getString(_cursorIndexOfName);
                final String _tmpProviderId;
                _tmpProviderId = cursor.getString(_cursorIndexOfProviderId);
                final String _tmpPhone;
                _tmpPhone = cursor.getString(_cursorIndexOfPhone);
                final String _tmpPhoto;
                _tmpPhoto = cursor.getString(_cursorIndexOfPhoto);
                _tmpUser = new User(_tmpId_1,_tmpEmail,_tmpEmailVerified,_tmpName,_tmpProviderId,_tmpPhone,_tmpPhoto);
              }  else  {
                _tmpUser = null;
              }
              final Feed.Video _tmpVideo;
              if (! (cursor.isNull(_cursorIndexOfId_2) && cursor.isNull(_cursorIndexOfUrl))) {
                final String _tmpId_2;
                _tmpId_2 = cursor.getString(_cursorIndexOfId_2);
                final String _tmpUrl;
                _tmpUrl = cursor.getString(_cursorIndexOfUrl);
                _tmpVideo = new Feed.Video(_tmpId_2,_tmpUrl);
              }  else  {
                _tmpVideo = null;
              }
              _item = new Feed(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpMedia,_tmpLikes,_tmpRanking,_tmpDescription,_tmpUser,_tmpVideo);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public LiveData<Feed> getFeed(final String feedId) {
    final String _sql = "SELECT * FROM Feeds WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (feedId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, feedId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"Feeds"}, false, new Callable<Feed>() {
      @Override
      public Feed call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfMedia = CursorUtil.getColumnIndexOrThrow(_cursor, "media");
          final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "likes");
          final int _cursorIndexOfRanking = CursorUtil.getColumnIndexOrThrow(_cursor, "ranking");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "userid");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "useremail");
          final int _cursorIndexOfEmailVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "useremailVerified");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfProviderId = CursorUtil.getColumnIndexOrThrow(_cursor, "userproviderId");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "userphone");
          final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "userphoto");
          final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "videoid");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "videourl");
          final Feed _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpMedia;
            _tmpMedia = _cursor.getString(_cursorIndexOfMedia);
            final int _tmpLikes;
            _tmpLikes = _cursor.getInt(_cursorIndexOfLikes);
            final int _tmpRanking;
            _tmpRanking = _cursor.getInt(_cursorIndexOfRanking);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final User _tmpUser;
            if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfEmail) && _cursor.isNull(_cursorIndexOfEmailVerified) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfProviderId) && _cursor.isNull(_cursorIndexOfPhone) && _cursor.isNull(_cursorIndexOfPhoto))) {
              final String _tmpId_1;
              _tmpId_1 = _cursor.getString(_cursorIndexOfId_1);
              final String _tmpEmail;
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
              final boolean _tmpEmailVerified;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfEmailVerified);
              _tmpEmailVerified = _tmp != 0;
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpProviderId;
              _tmpProviderId = _cursor.getString(_cursorIndexOfProviderId);
              final String _tmpPhone;
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
              final String _tmpPhoto;
              _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
              _tmpUser = new User(_tmpId_1,_tmpEmail,_tmpEmailVerified,_tmpName,_tmpProviderId,_tmpPhone,_tmpPhoto);
            }  else  {
              _tmpUser = null;
            }
            final Feed.Video _tmpVideo;
            if (! (_cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfUrl))) {
              final String _tmpId_2;
              _tmpId_2 = _cursor.getString(_cursorIndexOfId_2);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              _tmpVideo = new Feed.Video(_tmpId_2,_tmpUrl);
            }  else  {
              _tmpVideo = null;
            }
            _result = new Feed(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpMedia,_tmpLikes,_tmpRanking,_tmpDescription,_tmpUser,_tmpVideo);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
