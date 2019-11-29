package com.megazone.megatong.di.module.activity;

import com.megazone.megatong.di.module.fragment.ProfileFragmentBuilderModule;
import com.megazone.megatong.presentation.ui.profile.ProfileActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ProfileActivityModule_ContributeProfileActivity$app_debug.ProfileActivitySubcomponent.class
)
public abstract class ProfileActivityModule_ContributeProfileActivity$app_debug {
  private ProfileActivityModule_ContributeProfileActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(ProfileActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProfileActivitySubcomponent.Factory builder);

  @Subcomponent(modules = ProfileFragmentBuilderModule.class)
  public interface ProfileActivitySubcomponent extends AndroidInjector<ProfileActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProfileActivity> {}
  }
}
