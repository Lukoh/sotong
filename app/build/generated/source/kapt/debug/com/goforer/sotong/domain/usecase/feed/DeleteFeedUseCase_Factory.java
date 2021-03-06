// Generated by Dagger (https://dagger.dev).
package com.goforer.sotong.domain.usecase.feed;

import com.goforer.sotong.data.repository.remote.feed.DeleteFeedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DeleteFeedUseCase_Factory implements Factory<DeleteFeedUseCase> {
  private final Provider<DeleteFeedRepository> deleteFeedRepositoryProvider;

  public DeleteFeedUseCase_Factory(Provider<DeleteFeedRepository> deleteFeedRepositoryProvider) {
    this.deleteFeedRepositoryProvider = deleteFeedRepositoryProvider;
  }

  @Override
  public DeleteFeedUseCase get() {
    return new DeleteFeedUseCase(deleteFeedRepositoryProvider.get());
  }

  public static DeleteFeedUseCase_Factory create(
      Provider<DeleteFeedRepository> deleteFeedRepositoryProvider) {
    return new DeleteFeedUseCase_Factory(deleteFeedRepositoryProvider);
  }

  public static DeleteFeedUseCase newInstance(DeleteFeedRepository deleteFeedRepository) {
    return new DeleteFeedUseCase(deleteFeedRepository);
  }
}
