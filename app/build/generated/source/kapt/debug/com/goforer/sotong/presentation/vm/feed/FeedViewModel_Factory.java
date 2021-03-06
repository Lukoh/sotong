// Generated by Dagger (https://dagger.dev).
package com.goforer.sotong.presentation.vm.feed;

import com.goforer.sotong.domain.usecase.feed.CreateFeedUseCase;
import com.goforer.sotong.domain.usecase.feed.DeleteFeedUseCase;
import com.goforer.sotong.domain.usecase.feed.LoadFeedUseCase;
import com.goforer.sotong.domain.usecase.feed.UpdateFeedUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FeedViewModel_Factory implements Factory<FeedViewModel> {
  private final Provider<LoadFeedUseCase> loadUseCaseProvider;

  private final Provider<CreateFeedUseCase> createUseCaseProvider;

  private final Provider<UpdateFeedUseCase> updateFeedUseCaseProvider;

  private final Provider<DeleteFeedUseCase> deleteFeedUseCaseProvider;

  public FeedViewModel_Factory(Provider<LoadFeedUseCase> loadUseCaseProvider,
      Provider<CreateFeedUseCase> createUseCaseProvider,
      Provider<UpdateFeedUseCase> updateFeedUseCaseProvider,
      Provider<DeleteFeedUseCase> deleteFeedUseCaseProvider) {
    this.loadUseCaseProvider = loadUseCaseProvider;
    this.createUseCaseProvider = createUseCaseProvider;
    this.updateFeedUseCaseProvider = updateFeedUseCaseProvider;
    this.deleteFeedUseCaseProvider = deleteFeedUseCaseProvider;
  }

  @Override
  public FeedViewModel get() {
    return new FeedViewModel(loadUseCaseProvider.get(), createUseCaseProvider.get(), updateFeedUseCaseProvider.get(), deleteFeedUseCaseProvider.get());
  }

  public static FeedViewModel_Factory create(Provider<LoadFeedUseCase> loadUseCaseProvider,
      Provider<CreateFeedUseCase> createUseCaseProvider,
      Provider<UpdateFeedUseCase> updateFeedUseCaseProvider,
      Provider<DeleteFeedUseCase> deleteFeedUseCaseProvider) {
    return new FeedViewModel_Factory(loadUseCaseProvider, createUseCaseProvider, updateFeedUseCaseProvider, deleteFeedUseCaseProvider);
  }

  public static FeedViewModel newInstance(LoadFeedUseCase loadUseCase,
      CreateFeedUseCase createUseCase, UpdateFeedUseCase updateFeedUseCase,
      DeleteFeedUseCase deleteFeedUseCase) {
    return new FeedViewModel(loadUseCase, createUseCase, updateFeedUseCase, deleteFeedUseCase);
  }
}
