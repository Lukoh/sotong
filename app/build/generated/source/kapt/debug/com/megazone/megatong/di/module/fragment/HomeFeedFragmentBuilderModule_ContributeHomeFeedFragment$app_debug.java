package com.megazone.megatong.di.module.fragment;

import com.megazone.megatong.presentation.ui.home.feed.fragment.HomeFeedFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      HomeFeedFragmentBuilderModule_ContributeHomeFeedFragment$app_debug
          .HomeFeedFragmentSubcomponent.class
)
public abstract class HomeFeedFragmentBuilderModule_ContributeHomeFeedFragment$app_debug {
  private HomeFeedFragmentBuilderModule_ContributeHomeFeedFragment$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(HomeFeedFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeFeedFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HomeFeedFragmentSubcomponent extends AndroidInjector<HomeFeedFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomeFeedFragment> {}
  }
}
