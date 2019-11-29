package com.goforer.sotong.di.module.activity;

import com.goforer.sotong.presentation.ui.login.LogInActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      LogInActivityModule_ContributeLogInActivity$app_debug.LogInActivitySubcomponent.class
)
public abstract class LogInActivityModule_ContributeLogInActivity$app_debug {
  private LogInActivityModule_ContributeLogInActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(LogInActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LogInActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface LogInActivitySubcomponent extends AndroidInjector<LogInActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LogInActivity> {}
  }
}
