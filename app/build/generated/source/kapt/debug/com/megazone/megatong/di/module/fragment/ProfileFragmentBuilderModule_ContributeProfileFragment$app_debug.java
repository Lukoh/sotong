package com.megazone.megatong.di.module.fragment;

import com.megazone.megatong.presentation.ui.profile.fragment.ProfileFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ProfileFragmentBuilderModule_ContributeProfileFragment$app_debug.ProfileFragmentSubcomponent
          .class
)
public abstract class ProfileFragmentBuilderModule_ContributeProfileFragment$app_debug {
  private ProfileFragmentBuilderModule_ContributeProfileFragment$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(ProfileFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProfileFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProfileFragmentSubcomponent extends AndroidInjector<ProfileFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProfileFragment> {}
  }
}
