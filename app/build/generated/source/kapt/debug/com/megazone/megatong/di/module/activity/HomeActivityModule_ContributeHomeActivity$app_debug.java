package com.megazone.megatong.di.module.activity;

import com.megazone.megatong.di.module.fragment.HomeFeedFragmentBuilderModule;
import com.megazone.megatong.di.module.fragment.HomePopFeedFragmentBuilderModule;
import com.megazone.megatong.presentation.ui.home.HomeActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = HomeActivityModule_ContributeHomeActivity$app_debug.HomeActivitySubcomponent.class
)
public abstract class HomeActivityModule_ContributeHomeActivity$app_debug {
  private HomeActivityModule_ContributeHomeActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(HomeActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeActivitySubcomponent.Factory builder);

  @Subcomponent(
    modules = {HomeFeedFragmentBuilderModule.class, HomePopFeedFragmentBuilderModule.class}
  )
  public interface HomeActivitySubcomponent extends AndroidInjector<HomeActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomeActivity> {}
  }
}
