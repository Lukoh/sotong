package com.megazone.megatong.di.module.activity;

import com.megazone.megatong.presentation.ui.posting.HomePostingActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      HomePostingActivityModule_ContributeHomePostingActivity$app_debug
          .HomePostingActivitySubcomponent.class
)
public abstract class HomePostingActivityModule_ContributeHomePostingActivity$app_debug {
  private HomePostingActivityModule_ContributeHomePostingActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(HomePostingActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomePostingActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface HomePostingActivitySubcomponent extends AndroidInjector<HomePostingActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomePostingActivity> {}
  }
}
