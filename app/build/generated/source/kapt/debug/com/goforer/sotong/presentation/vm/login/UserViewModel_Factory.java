// Generated by Dagger (https://dagger.dev).
package com.goforer.sotong.presentation.vm.login;

import com.goforer.sotong.domain.usecase.login.UserUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserViewModel_Factory implements Factory<UserViewModel> {
  private final Provider<UserUseCase> useCaseProvider;

  public UserViewModel_Factory(Provider<UserUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public UserViewModel get() {
    return new UserViewModel(useCaseProvider.get());
  }

  public static UserViewModel_Factory create(Provider<UserUseCase> useCaseProvider) {
    return new UserViewModel_Factory(useCaseProvider);
  }

  public static UserViewModel newInstance(UserUseCase useCase) {
    return new UserViewModel(useCase);
  }
}