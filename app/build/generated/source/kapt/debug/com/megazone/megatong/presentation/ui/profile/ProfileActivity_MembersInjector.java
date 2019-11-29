// Generated by Dagger (https://dagger.dev).
package com.megazone.megatong.presentation.ui.profile;

import com.megazone.base.ui.activity.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProfileActivity_MembersInjector implements MembersInjector<ProfileActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider;

  public ProfileActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<ProfileActivity> create(
      Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider) {
    return new ProfileActivity_MembersInjector(dispatchingAndroidInjectorProvider);}

  @Override
  public void injectMembers(ProfileActivity instance) {
    BaseActivity_MembersInjector.injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
  }
}
