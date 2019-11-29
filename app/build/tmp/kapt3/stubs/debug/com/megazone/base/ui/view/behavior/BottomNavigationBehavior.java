package com.megazone.base.ui.view.behavior;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J@\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bH\u0016J8\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0016J(\u0010%\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u000bH\u0016J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020(H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/megazone/base/ui/view/behavior/BottomNavigationBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isSnappingEnabled", "", "lastStartedType", "", "getLastStartedType$annotations", "()V", "offsetAnimator", "Landroid/animation/ValueAnimator;", "animateBarVisibility", "", "child", "Landroid/view/View;", "isVisible", "createValueAnimator", "layoutDependsOn", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "dependency", "onNestedPreScroll", "coordinatorLayout", "target", "dx", "dy", "consumed", "", "type", "onStartNestedScroll", "directTargetChild", "axes", "onStopNestedScroll", "updateSnackbar", "snackbarLayout", "Lcom/google/android/material/snackbar/Snackbar$SnackbarLayout;", "app_debug"})
public final class BottomNavigationBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.bottomnavigation.BottomNavigationView> {
    private int lastStartedType;
    private android.animation.ValueAnimator offsetAnimator;
    private boolean isSnappingEnabled;
    
    @androidx.core.view.ViewCompat.NestedScrollType()
    private static void getLastStartedType$annotations() {
    }
    
    @java.lang.Override()
    public boolean layoutDependsOn(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView child, @org.jetbrains.annotations.NotNull()
    android.view.View dependency) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView child, @org.jetbrains.annotations.NotNull()
    android.view.View directTargetChild, @org.jetbrains.annotations.NotNull()
    android.view.View target, int axes, int type) {
        return false;
    }
    
    @java.lang.Override()
    public void onNestedPreScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int dx, int dy, @org.jetbrains.annotations.NotNull()
    int[] consumed, int type) {
    }
    
    @java.lang.Override()
    public void onStopNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int type) {
    }
    
    private final void animateBarVisibility(android.view.View child, boolean isVisible) {
    }
    
    private final void createValueAnimator(android.view.View child) {
    }
    
    private final void updateSnackbar(android.view.View child, com.google.android.material.snackbar.Snackbar.SnackbarLayout snackbarLayout) {
    }
    
    public BottomNavigationBehavior(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super();
    }
}