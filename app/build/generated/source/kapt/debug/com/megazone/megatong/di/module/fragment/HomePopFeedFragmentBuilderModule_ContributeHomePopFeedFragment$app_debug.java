package com.megazone.megatong.di.module.fragment;

import com.megazone.megatong.presentation.ui.home.feed.fragment.HomePopFeedFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      HomePopFeedFragmentBuilderModule_ContributeHomePopFeedFragment$app_debug
          .HomePopFeedFragmentSubcomponent.class
)
public abstract class HomePopFeedFragmentBuilderModule_ContributeHomePopFeedFragment$app_debug {
  private HomePopFeedFragmentBuilderModule_ContributeHomePopFeedFragment$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(HomePopFeedFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomePopFeedFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HomePopFeedFragmentSubcomponent extends AndroidInjector<HomePopFeedFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomePopFeedFragment> {}
  }
}
