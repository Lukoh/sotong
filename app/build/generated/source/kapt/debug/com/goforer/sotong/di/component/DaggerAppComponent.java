// Generated by Dagger (https://dagger.dev).
package com.goforer.sotong.di.component;

import android.app.Application;
import com.goforer.base.ui.activity.BaseActivity_MembersInjector;
import com.goforer.sotong.Sotong;
import com.goforer.sotong.Megatong_MembersInjector;
import com.goforer.sotong.data.datasource.model.cache.Cache;
import com.goforer.sotong.data.datasource.model.dao.remote.feed.FeedDao;
import com.goforer.sotong.data.datasource.model.dao.remote.profile.UserDao;
import com.goforer.sotong.data.datasource.network.rest.ServiceAPI;
import com.goforer.sotong.data.repository.remote.feed.CreateFeedRepository;
import com.goforer.sotong.data.repository.remote.feed.CreateFeedRepository_Factory;
import com.goforer.sotong.data.repository.remote.feed.DeleteFeedRepository;
import com.goforer.sotong.data.repository.remote.feed.DeleteFeedRepository_Factory;
import com.goforer.sotong.data.repository.remote.feed.EditFeedRepository;
import com.goforer.sotong.data.repository.remote.feed.EditFeedRepository_Factory;
import com.goforer.sotong.data.repository.remote.feed.LoadFeedRepository;
import com.goforer.sotong.data.repository.remote.feed.LoadFeedRepository_Factory;
import com.goforer.sotong.data.repository.remote.login.UserRepository;
import com.goforer.sotong.data.repository.remote.login.UserRepository_Factory;
import com.goforer.sotong.di.module.AppModule;
import com.goforer.sotong.di.module.AppModule_ProvideCache$app_debugFactory;
import com.goforer.sotong.di.module.AppModule_ProvideFeedDao$app_debugFactory;
import com.goforer.sotong.di.module.AppModule_ProvideServiceAPI$app_debugFactory;
import com.goforer.sotong.di.module.AppModule_ProvideUserDao$app_debugFactory;
import com.goforer.sotong.di.module.activity.HomeActivityModule_ContributeHomeActivity$app_debug;
import com.goforer.sotong.di.module.activity.HomePostingActivityModule_ContributeHomePostingActivity$app_debug;
import com.goforer.sotong.di.module.activity.LogInActivityModule_ContributeLogInActivity$app_debug;
import com.goforer.sotong.di.module.activity.ProfileActivityModule_ContributeProfileActivity$app_debug;
import com.goforer.sotong.di.module.fragment.HomeFeedFragmentBuilderModule_ContributeHomeFeedFragment$app_debug;
import com.goforer.sotong.di.module.fragment.HomePopFeedFragmentBuilderModule_ContributeHomePopFeedFragment$app_debug;
import com.goforer.sotong.di.module.fragment.ProfileFragmentBuilderModule_ContributeProfileFragment$app_debug;
import com.goforer.sotong.domain.usecase.feed.CreateFeedUseCase;
import com.goforer.sotong.domain.usecase.feed.CreateFeedUseCase_Factory;
import com.goforer.sotong.domain.usecase.feed.DeleteFeedUseCase;
import com.goforer.sotong.domain.usecase.feed.DeleteFeedUseCase_Factory;
import com.goforer.sotong.domain.usecase.feed.LoadFeedUseCase;
import com.goforer.sotong.domain.usecase.feed.LoadFeedUseCase_Factory;
import com.goforer.sotong.domain.usecase.feed.UpdateFeedUseCase;
import com.goforer.sotong.domain.usecase.feed.UpdateFeedUseCase_Factory;
import com.goforer.sotong.domain.usecase.login.UserUseCase;
import com.goforer.sotong.domain.usecase.login.UserUseCase_Factory;
import com.goforer.sotong.presentation.ui.home.HomeActivity;
import com.goforer.sotong.presentation.ui.home.HomeActivity_MembersInjector;
import com.goforer.sotong.presentation.ui.home.feed.fragment.HomeFeedFragment;
import com.goforer.sotong.presentation.ui.home.feed.fragment.HomePopFeedFragment;
import com.goforer.sotong.presentation.ui.login.LogInActivity;
import com.goforer.sotong.presentation.ui.login.LogInActivity_MembersInjector;
import com.goforer.sotong.presentation.ui.posting.HomePostingActivity;
import com.goforer.sotong.presentation.ui.posting.HomePostingActivity_MembersInjector;
import com.goforer.sotong.presentation.ui.profile.ProfileActivity;
import com.goforer.sotong.presentation.ui.profile.fragment.ProfileFragment;
import com.goforer.sotong.presentation.ui.profile.fragment.ProfileFragment_MembersInjector;
import com.goforer.sotong.presentation.vm.feed.FeedViewModel;
import com.goforer.sotong.presentation.vm.feed.FeedViewModel_Factory;
import com.goforer.sotong.presentation.vm.login.UserViewModel;
import com.goforer.sotong.presentation.vm.login.UserViewModel_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<LogInActivityModule_ContributeLogInActivity$app_debug.LogInActivitySubcomponent.Factory> logInActivitySubcomponentFactoryProvider;

  private Provider<HomeActivityModule_ContributeHomeActivity$app_debug.HomeActivitySubcomponent.Factory> homeActivitySubcomponentFactoryProvider;

  private Provider<HomePostingActivityModule_ContributeHomePostingActivity$app_debug.HomePostingActivitySubcomponent.Factory> homePostingActivitySubcomponentFactoryProvider;

  private Provider<ProfileActivityModule_ContributeProfileActivity$app_debug.ProfileActivitySubcomponent.Factory> profileActivitySubcomponentFactoryProvider;

  private Provider<Application> appProvider;

  private Provider<Cache> provideCache$app_debugProvider;

  private Provider<UserDao> provideUserDao$app_debugProvider;

  private Provider<ServiceAPI> provideServiceAPI$app_debugProvider;

  private Provider<UserRepository> userRepositoryProvider;

  private Provider<UserUseCase> userUseCaseProvider;

  private Provider<UserViewModel> userViewModelProvider;

  private Provider<FeedDao> provideFeedDao$app_debugProvider;

  private Provider<LoadFeedRepository> loadFeedRepositoryProvider;

  private Provider<LoadFeedUseCase> loadFeedUseCaseProvider;

  private Provider<CreateFeedRepository> createFeedRepositoryProvider;

  private Provider<CreateFeedUseCase> createFeedUseCaseProvider;

  private Provider<EditFeedRepository> editFeedRepositoryProvider;

  private Provider<UpdateFeedUseCase> updateFeedUseCaseProvider;

  private Provider<DeleteFeedRepository> deleteFeedRepositoryProvider;

  private Provider<DeleteFeedUseCase> deleteFeedUseCaseProvider;

  private Provider<FeedViewModel> feedViewModelProvider;

  private DaggerAppComponent(AppModule appModuleParam, Application appParam) {

    initialize(appModuleParam, appParam);
  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(4).put(LogInActivity.class, (Provider) logInActivitySubcomponentFactoryProvider).put(HomeActivity.class, (Provider) homeActivitySubcomponentFactoryProvider).put(HomePostingActivity.class, (Provider) homePostingActivitySubcomponentFactoryProvider).put(ProfileActivity.class, (Provider) profileActivitySubcomponentFactoryProvider).build();}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final Application appParam) {
    this.logInActivitySubcomponentFactoryProvider = new Provider<LogInActivityModule_ContributeLogInActivity$app_debug.LogInActivitySubcomponent.Factory>() {
      @Override
      public LogInActivityModule_ContributeLogInActivity$app_debug.LogInActivitySubcomponent.Factory get(
          ) {
        return new LogInActivitySubcomponentFactory();}
    };
    this.homeActivitySubcomponentFactoryProvider = new Provider<HomeActivityModule_ContributeHomeActivity$app_debug.HomeActivitySubcomponent.Factory>() {
      @Override
      public HomeActivityModule_ContributeHomeActivity$app_debug.HomeActivitySubcomponent.Factory get(
          ) {
        return new HomeActivitySubcomponentFactory();}
    };
    this.homePostingActivitySubcomponentFactoryProvider = new Provider<HomePostingActivityModule_ContributeHomePostingActivity$app_debug.HomePostingActivitySubcomponent.Factory>() {
      @Override
      public HomePostingActivityModule_ContributeHomePostingActivity$app_debug.HomePostingActivitySubcomponent.Factory get(
          ) {
        return new HomePostingActivitySubcomponentFactory();}
    };
    this.profileActivitySubcomponentFactoryProvider = new Provider<ProfileActivityModule_ContributeProfileActivity$app_debug.ProfileActivitySubcomponent.Factory>() {
      @Override
      public ProfileActivityModule_ContributeProfileActivity$app_debug.ProfileActivitySubcomponent.Factory get(
          ) {
        return new ProfileActivitySubcomponentFactory();}
    };
    this.appProvider = InstanceFactory.create(appParam);
    this.provideCache$app_debugProvider = DoubleCheck.provider(AppModule_ProvideCache$app_debugFactory.create(appModuleParam, appProvider));
    this.provideUserDao$app_debugProvider = DoubleCheck.provider(AppModule_ProvideUserDao$app_debugFactory.create(appModuleParam, provideCache$app_debugProvider));
    this.provideServiceAPI$app_debugProvider = DoubleCheck.provider(AppModule_ProvideServiceAPI$app_debugFactory.create(appModuleParam));
    this.userRepositoryProvider = DoubleCheck.provider(UserRepository_Factory.create(provideUserDao$app_debugProvider, provideServiceAPI$app_debugProvider));
    this.userUseCaseProvider = DoubleCheck.provider(UserUseCase_Factory.create(userRepositoryProvider));
    this.userViewModelProvider = DoubleCheck.provider(UserViewModel_Factory.create(userUseCaseProvider));
    this.provideFeedDao$app_debugProvider = DoubleCheck.provider(AppModule_ProvideFeedDao$app_debugFactory.create(appModuleParam, provideCache$app_debugProvider));
    this.loadFeedRepositoryProvider = DoubleCheck.provider(LoadFeedRepository_Factory.create(provideFeedDao$app_debugProvider, provideServiceAPI$app_debugProvider));
    this.loadFeedUseCaseProvider = DoubleCheck.provider(LoadFeedUseCase_Factory.create(loadFeedRepositoryProvider));
    this.createFeedRepositoryProvider = DoubleCheck.provider(CreateFeedRepository_Factory.create(provideFeedDao$app_debugProvider, provideServiceAPI$app_debugProvider));
    this.createFeedUseCaseProvider = DoubleCheck.provider(CreateFeedUseCase_Factory.create(createFeedRepositoryProvider));
    this.editFeedRepositoryProvider = DoubleCheck.provider(EditFeedRepository_Factory.create(provideFeedDao$app_debugProvider, provideServiceAPI$app_debugProvider));
    this.updateFeedUseCaseProvider = DoubleCheck.provider(UpdateFeedUseCase_Factory.create(editFeedRepositoryProvider));
    this.deleteFeedRepositoryProvider = DoubleCheck.provider(DeleteFeedRepository_Factory.create(provideFeedDao$app_debugProvider, provideServiceAPI$app_debugProvider));
    this.deleteFeedUseCaseProvider = DoubleCheck.provider(DeleteFeedUseCase_Factory.create(deleteFeedRepositoryProvider));
    this.feedViewModelProvider = DoubleCheck.provider(FeedViewModel_Factory.create(loadFeedUseCaseProvider, createFeedUseCaseProvider, updateFeedUseCaseProvider, deleteFeedUseCaseProvider));
  }

  @Override
  public void inject(Sotong sotong) {
    injectMegatong(sotong);}

  private Sotong injectMegatong(Sotong instance) {
    Megatong_MembersInjector.injectDispatchingAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent create(Application app) {
      Preconditions.checkNotNull(app);
      return new DaggerAppComponent(new AppModule(), app);
    }
  }

  private final class LogInActivitySubcomponentFactory implements LogInActivityModule_ContributeLogInActivity$app_debug.LogInActivitySubcomponent.Factory {
    @Override
    public LogInActivityModule_ContributeLogInActivity$app_debug.LogInActivitySubcomponent create(
        LogInActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new LogInActivitySubcomponentImpl(arg0);
    }
  }

  private final class LogInActivitySubcomponentImpl implements LogInActivityModule_ContributeLogInActivity$app_debug.LogInActivitySubcomponent {
    private LogInActivitySubcomponentImpl(LogInActivity arg0) {

    }

    @Override
    public void inject(LogInActivity arg0) {
      injectLogInActivity(arg0);}

    private LogInActivity injectLogInActivity(LogInActivity instance) {
      BaseActivity_MembersInjector.injectDispatchingAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      LogInActivity_MembersInjector.injectUserViewModel(instance, DaggerAppComponent.this.userViewModelProvider.get());
      return instance;
    }
  }

  private final class HomeActivitySubcomponentFactory implements HomeActivityModule_ContributeHomeActivity$app_debug.HomeActivitySubcomponent.Factory {
    @Override
    public HomeActivityModule_ContributeHomeActivity$app_debug.HomeActivitySubcomponent create(
        HomeActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new HomeActivitySubcomponentImpl(arg0);
    }
  }

  private final class HomeActivitySubcomponentImpl implements HomeActivityModule_ContributeHomeActivity$app_debug.HomeActivitySubcomponent {
    private Provider<HomeFeedFragmentBuilderModule_ContributeHomeFeedFragment$app_debug.HomeFeedFragmentSubcomponent.Factory> homeFeedFragmentSubcomponentFactoryProvider;

    private Provider<HomePopFeedFragmentBuilderModule_ContributeHomePopFeedFragment$app_debug.HomePopFeedFragmentSubcomponent.Factory> homePopFeedFragmentSubcomponentFactoryProvider;

    private HomeActivitySubcomponentImpl(HomeActivity arg0) {

      initialize(arg0);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(6).put(LogInActivity.class, (Provider) DaggerAppComponent.this.logInActivitySubcomponentFactoryProvider).put(HomeActivity.class, (Provider) DaggerAppComponent.this.homeActivitySubcomponentFactoryProvider).put(HomePostingActivity.class, (Provider) DaggerAppComponent.this.homePostingActivitySubcomponentFactoryProvider).put(ProfileActivity.class, (Provider) DaggerAppComponent.this.profileActivitySubcomponentFactoryProvider).put(HomeFeedFragment.class, (Provider) homeFeedFragmentSubcomponentFactoryProvider).put(HomePopFeedFragment.class, (Provider) homePopFeedFragmentSubcomponentFactoryProvider).build();}

    private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

    @SuppressWarnings("unchecked")
    private void initialize(final HomeActivity arg0) {
      this.homeFeedFragmentSubcomponentFactoryProvider = new Provider<HomeFeedFragmentBuilderModule_ContributeHomeFeedFragment$app_debug.HomeFeedFragmentSubcomponent.Factory>() {
        @Override
        public HomeFeedFragmentBuilderModule_ContributeHomeFeedFragment$app_debug.HomeFeedFragmentSubcomponent.Factory get(
            ) {
          return new HomeFeedFragmentSubcomponentFactory();}
      };
      this.homePopFeedFragmentSubcomponentFactoryProvider = new Provider<HomePopFeedFragmentBuilderModule_ContributeHomePopFeedFragment$app_debug.HomePopFeedFragmentSubcomponent.Factory>() {
        @Override
        public HomePopFeedFragmentBuilderModule_ContributeHomePopFeedFragment$app_debug.HomePopFeedFragmentSubcomponent.Factory get(
            ) {
          return new HomePopFeedFragmentSubcomponentFactory();}
      };
    }

    @Override
    public void inject(HomeActivity arg0) {
      injectHomeActivity(arg0);}

    private HomeActivity injectHomeActivity(HomeActivity instance) {
      BaseActivity_MembersInjector.injectDispatchingAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
      HomeActivity_MembersInjector.injectFeedViewModel(instance, DaggerAppComponent.this.feedViewModelProvider.get());
      return instance;
    }

    private final class HomeFeedFragmentSubcomponentFactory implements HomeFeedFragmentBuilderModule_ContributeHomeFeedFragment$app_debug.HomeFeedFragmentSubcomponent.Factory {
      @Override
      public HomeFeedFragmentBuilderModule_ContributeHomeFeedFragment$app_debug.HomeFeedFragmentSubcomponent create(
          HomeFeedFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new HomeFeedFragmentSubcomponentImpl(arg0);
      }
    }

    private final class HomeFeedFragmentSubcomponentImpl implements HomeFeedFragmentBuilderModule_ContributeHomeFeedFragment$app_debug.HomeFeedFragmentSubcomponent {
      private HomeFeedFragmentSubcomponentImpl(HomeFeedFragment arg0) {

      }

      @Override
      public void inject(HomeFeedFragment arg0) {
      }
    }

    private final class HomePopFeedFragmentSubcomponentFactory implements HomePopFeedFragmentBuilderModule_ContributeHomePopFeedFragment$app_debug.HomePopFeedFragmentSubcomponent.Factory {
      @Override
      public HomePopFeedFragmentBuilderModule_ContributeHomePopFeedFragment$app_debug.HomePopFeedFragmentSubcomponent create(
          HomePopFeedFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new HomePopFeedFragmentSubcomponentImpl(arg0);
      }
    }

    private final class HomePopFeedFragmentSubcomponentImpl implements HomePopFeedFragmentBuilderModule_ContributeHomePopFeedFragment$app_debug.HomePopFeedFragmentSubcomponent {
      private HomePopFeedFragmentSubcomponentImpl(HomePopFeedFragment arg0) {

      }

      @Override
      public void inject(HomePopFeedFragment arg0) {
      }
    }
  }

  private final class HomePostingActivitySubcomponentFactory implements HomePostingActivityModule_ContributeHomePostingActivity$app_debug.HomePostingActivitySubcomponent.Factory {
    @Override
    public HomePostingActivityModule_ContributeHomePostingActivity$app_debug.HomePostingActivitySubcomponent create(
        HomePostingActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new HomePostingActivitySubcomponentImpl(arg0);
    }
  }

  private final class HomePostingActivitySubcomponentImpl implements HomePostingActivityModule_ContributeHomePostingActivity$app_debug.HomePostingActivitySubcomponent {
    private HomePostingActivitySubcomponentImpl(HomePostingActivity arg0) {

    }

    @Override
    public void inject(HomePostingActivity arg0) {
      injectHomePostingActivity(arg0);}

    private HomePostingActivity injectHomePostingActivity(HomePostingActivity instance) {
      BaseActivity_MembersInjector.injectDispatchingAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      HomePostingActivity_MembersInjector.injectFeedViewModel(instance, DaggerAppComponent.this.feedViewModelProvider.get());
      return instance;
    }
  }

  private final class ProfileActivitySubcomponentFactory implements ProfileActivityModule_ContributeProfileActivity$app_debug.ProfileActivitySubcomponent.Factory {
    @Override
    public ProfileActivityModule_ContributeProfileActivity$app_debug.ProfileActivitySubcomponent create(
        ProfileActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new ProfileActivitySubcomponentImpl(arg0);
    }
  }

  private final class ProfileActivitySubcomponentImpl implements ProfileActivityModule_ContributeProfileActivity$app_debug.ProfileActivitySubcomponent {
    private Provider<ProfileFragmentBuilderModule_ContributeProfileFragment$app_debug.ProfileFragmentSubcomponent.Factory> profileFragmentSubcomponentFactoryProvider;

    private ProfileActivitySubcomponentImpl(ProfileActivity arg0) {

      initialize(arg0);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(5).put(LogInActivity.class, (Provider) DaggerAppComponent.this.logInActivitySubcomponentFactoryProvider).put(HomeActivity.class, (Provider) DaggerAppComponent.this.homeActivitySubcomponentFactoryProvider).put(HomePostingActivity.class, (Provider) DaggerAppComponent.this.homePostingActivitySubcomponentFactoryProvider).put(ProfileActivity.class, (Provider) DaggerAppComponent.this.profileActivitySubcomponentFactoryProvider).put(ProfileFragment.class, (Provider) profileFragmentSubcomponentFactoryProvider).build();}

    private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

    @SuppressWarnings("unchecked")
    private void initialize(final ProfileActivity arg0) {
      this.profileFragmentSubcomponentFactoryProvider = new Provider<ProfileFragmentBuilderModule_ContributeProfileFragment$app_debug.ProfileFragmentSubcomponent.Factory>() {
        @Override
        public ProfileFragmentBuilderModule_ContributeProfileFragment$app_debug.ProfileFragmentSubcomponent.Factory get(
            ) {
          return new ProfileFragmentSubcomponentFactory();}
      };
    }

    @Override
    public void inject(ProfileActivity arg0) {
      injectProfileActivity(arg0);}

    private ProfileActivity injectProfileActivity(ProfileActivity instance) {
      BaseActivity_MembersInjector.injectDispatchingAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
      return instance;
    }

    private final class ProfileFragmentSubcomponentFactory implements ProfileFragmentBuilderModule_ContributeProfileFragment$app_debug.ProfileFragmentSubcomponent.Factory {
      @Override
      public ProfileFragmentBuilderModule_ContributeProfileFragment$app_debug.ProfileFragmentSubcomponent create(
          ProfileFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new ProfileFragmentSubcomponentImpl(arg0);
      }
    }

    private final class ProfileFragmentSubcomponentImpl implements ProfileFragmentBuilderModule_ContributeProfileFragment$app_debug.ProfileFragmentSubcomponent {
      private ProfileFragmentSubcomponentImpl(ProfileFragment arg0) {

      }

      @Override
      public void inject(ProfileFragment arg0) {
        injectProfileFragment(arg0);}

      private ProfileFragment injectProfileFragment(ProfileFragment instance) {
        ProfileFragment_MembersInjector.injectFeedViewModel(instance, DaggerAppComponent.this.feedViewModelProvider.get());
        ProfileFragment_MembersInjector.injectUserViewModel(instance, DaggerAppComponent.this.userViewModelProvider.get());
        return instance;
      }
    }
  }
}
