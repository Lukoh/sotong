// Generated by Dagger (https://dagger.dev).
package com.goforer.sotong.data.repository.remote.feed;

import com.goforer.sotong.data.datasource.model.dao.remote.feed.FeedDao;
import com.goforer.sotong.data.datasource.network.rest.ServiceAPI;
import com.goforer.sotong.data.repository.BaseRepository_MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CreateFeedRepository_Factory implements Factory<CreateFeedRepository> {
  private final Provider<FeedDao> daoProvider;

  private final Provider<ServiceAPI> serviceAPIProvider;

  public CreateFeedRepository_Factory(Provider<FeedDao> daoProvider,
      Provider<ServiceAPI> serviceAPIProvider) {
    this.daoProvider = daoProvider;
    this.serviceAPIProvider = serviceAPIProvider;
  }

  @Override
  public CreateFeedRepository get() {
    CreateFeedRepository instance = new CreateFeedRepository(daoProvider.get());
    BaseRepository_MembersInjector.injectServiceAPI(instance, serviceAPIProvider.get());
    return instance;
  }

  public static CreateFeedRepository_Factory create(Provider<FeedDao> daoProvider,
      Provider<ServiceAPI> serviceAPIProvider) {
    return new CreateFeedRepository_Factory(daoProvider, serviceAPIProvider);
  }

  public static CreateFeedRepository newInstance(FeedDao dao) {
    return new CreateFeedRepository(dao);
  }
}
