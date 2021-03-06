// Generated by Dagger (https://dagger.dev).
package com.goforer.sotong.presentation.ui.login;

import com.goforer.base.ui.activity.BaseActivity_MembersInjector;
import com.goforer.sotong.presentation.vm.login.UserViewModel;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LogInActivity_MembersInjector implements MembersInjector<LogInActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider;

  private final Provider<UserViewModel> userViewModelProvider;

  public LogInActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider,
      Provider<UserViewModel> userViewModelProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
    this.userViewModelProvider = userViewModelProvider;
  }

  public static MembersInjector<LogInActivity> create(
      Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider,
      Provider<UserViewModel> userViewModelProvider) {
    return new LogInActivity_MembersInjector(dispatchingAndroidInjectorProvider, userViewModelProvider);}

  @Override
  public void injectMembers(LogInActivity instance) {
    BaseActivity_MembersInjector.injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
    injectUserViewModel(instance, userViewModelProvider.get());
  }

  public static void injectUserViewModel(LogInActivity instance, UserViewModel userViewModel) {
    instance.userViewModel = userViewModel;
  }
}
