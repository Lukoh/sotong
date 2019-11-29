package com.megazone.base.ui.view.customs.indicator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b\u001aJ\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006!"}, d2 = {"Lcom/megazone/base/ui/view/customs/indicator/IndicatorHandler;", "", "count", "", "indicatorMaxCount", "indicatorSize", "indicatorSpacing", "indicatorBound", "listener", "Lcom/megazone/base/ui/view/customs/indicator/IndicatorHandler$ItemScrollListener;", "(IIIIILcom/megazone/base/ui/view/customs/indicator/IndicatorHandler$ItemScrollListener;)V", "indicators", "", "getIndicators$app_debug", "()[I", "setIndicators$app_debug", "([I)V", "scrollAmount", "selectedIndex", "getSelectedIndex$app_debug", "()I", "setSelectedIndex$app_debug", "(I)V", "goTo", "", "direction", "goTo$app_debug", "goToNextWithInMax", "goToNextWithOverMax", "goToPreviousLarge", "goToPreviousSmall", "Companion", "ItemScrollListener", "app_debug"})
public final class IndicatorHandler {
    @org.jetbrains.annotations.NotNull()
    private int[] indicators;
    private int selectedIndex;
    private int scrollAmount;
    private final int indicatorMaxCount = 0;
    private final int indicatorSize = 0;
    private final int indicatorSpacing = 0;
    private final int indicatorBound = 0;
    private final com.megazone.base.ui.view.customs.indicator.IndicatorHandler.ItemScrollListener listener = null;
    public static final int GO_TO_NEXT = 0;
    public static final int GO_TO_PREVIOUS = 1;
    public static final int INDICATOR_DISPLAY = 6;
    private static final int INDICATOR_NOT_DISPLAY = 5;
    public static final com.megazone.base.ui.view.customs.indicator.IndicatorHandler.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getIndicators$app_debug() {
        return null;
    }
    
    public final void setIndicators$app_debug(@org.jetbrains.annotations.NotNull()
    int[] p0) {
    }
    
    public final int getSelectedIndex$app_debug() {
        return 0;
    }
    
    public final void setSelectedIndex$app_debug(int p0) {
    }
    
    public final void goTo$app_debug(int direction) {
    }
    
    private final void goToNextWithInMax() {
    }
    
    private final void goToNextWithOverMax() {
    }
    
    private final void goToPreviousSmall() {
    }
    
    private final void goToPreviousLarge() {
    }
    
    public IndicatorHandler(int count, int indicatorMaxCount, int indicatorSize, int indicatorSpacing, int indicatorBound, @org.jetbrains.annotations.Nullable()
    com.megazone.base.ui.view.customs.indicator.IndicatorHandler.ItemScrollListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/megazone/base/ui/view/customs/indicator/IndicatorHandler$ItemScrollListener;", "", "scrollToItem", "", "item", "", "app_debug"})
    public static abstract interface ItemScrollListener {
        
        public abstract void scrollToItem(int item);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/megazone/base/ui/view/customs/indicator/IndicatorHandler$Companion;", "", "()V", "GO_TO_NEXT", "", "GO_TO_PREVIOUS", "INDICATOR_DISPLAY", "INDICATOR_NOT_DISPLAY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}