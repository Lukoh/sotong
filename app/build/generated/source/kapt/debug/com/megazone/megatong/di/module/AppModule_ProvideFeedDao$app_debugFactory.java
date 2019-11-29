// Generated by Dagger (https://dagger.dev).
package com.megazone.megatong.di.module;

import com.megazone.megatong.data.datasource.model.cache.Cache;
import com.megazone.megatong.data.datasource.model.dao.remote.feed.FeedDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideFeedDao$app_debugFactory implements Factory<FeedDao> {
  private final AppModule module;

  private final Provider<Cache> cacheProvider;

  public AppModule_ProvideFeedDao$app_debugFactory(AppModule module,
      Provider<Cache> cacheProvider) {
    this.module = module;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public FeedDao get() {
    return provideFeedDao$app_debug(module, cacheProvider.get());
  }

  public static AppModule_ProvideFeedDao$app_debugFactory create(AppModule module,
      Provider<Cache> cacheProvider) {
    return new AppModule_ProvideFeedDao$app_debugFactory(module, cacheProvider);
  }

  public static FeedDao provideFeedDao$app_debug(AppModule instance, Cache cache) {
    return Preconditions.checkNotNull(instance.provideFeedDao$app_debug(cache), "Cannot return null from a non-@Nullable @Provides method");
  }
}
