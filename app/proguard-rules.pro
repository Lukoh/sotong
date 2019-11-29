# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
-dontwarn okhttp3.**
-dontwarn okio.**
-dontwarn org.codehaus.mojo.animal_sniffer.**
-dontwarn javax.annotation.**
-dontwarn org.conscrypt.**
-keep class androidx.core.app.CoreComponentFactory { *; }
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public class * extends com.bumptech.glide.module.AppGlideModule
-keep public enum com.bumptech.glide.load.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}

-keepclassmembers class android.support.design.internal.BottomNavigationMenuView {
    boolean mShiftingMode;
}

-keepclassmembers class android.support.design.internal.BottomNavigationItemView {
    int mShiftAmount;
}

# for DexGuard only
-keepresourcexmlelements manifest/application/meta-data@value=GlideModule

-keepclassmembernames class com.google.android.exoplayer2.ui.PlayerControlView {
  java.lang.Runnable hideAction;
  void hideAfterTimeout();
}

-dontwarn com.squareup.picasso.**
