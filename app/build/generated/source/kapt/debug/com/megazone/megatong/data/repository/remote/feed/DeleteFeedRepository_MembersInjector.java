// Generated by Dagger (https://dagger.dev).
package com.megazone.megatong.data.repository.remote.feed;

import com.megazone.megatong.data.datasource.network.rest.ServiceAPI;
import com.megazone.megatong.data.repository.BaseRepository_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DeleteFeedRepository_MembersInjector implements MembersInjector<DeleteFeedRepository> {
  private final Provider<ServiceAPI> serviceAPIProvider;

  public DeleteFeedRepository_MembersInjector(Provider<ServiceAPI> serviceAPIProvider) {
    this.serviceAPIProvider = serviceAPIProvider;
  }

  public static MembersInjector<DeleteFeedRepository> create(
      Provider<ServiceAPI> serviceAPIProvider) {
    return new DeleteFeedRepository_MembersInjector(serviceAPIProvider);}

  @Override
  public void injectMembers(DeleteFeedRepository instance) {
    BaseRepository_MembersInjector.injectServiceAPI(instance, serviceAPIProvider.get());
  }
}
