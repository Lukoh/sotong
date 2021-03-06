package com.megazone.base.ui.view.customs.indicator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0003OPQB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u00104\u001a\u000205H\u0002J\u0011\u00106\u001a\u0002052\u0006\u00107\u001a\u000208H\u0086\u0004J\u0011\u00106\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0086\u0004J\u0014\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0<H\u0002J\u0012\u0010=\u001a\u0002052\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\u0018\u0010@\u001a\u0002052\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\bH\u0014J\u0010\u0010C\u001a\u0002052\u0006\u0010D\u001a\u00020\bH\u0016J\u0011\u0010E\u001a\u0002052\u0006\u0010F\u001a\u00020\bH\u0086\u0004J\u0011\u0010G\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0004J\u0011\u0010H\u001a\u0002052\u0006\u0010\u001f\u001a\u00020\bH\u0086\u0004J\u0011\u0010I\u001a\u0002052\u0006\u0010F\u001a\u00020\bH\u0086\u0004J\u0011\u0010J\u001a\u0002052\u0006\u0010(\u001a\u00020\bH\u0086\u0004J\u0011\u0010K\u001a\u0002052\u0006\u0010)\u001a\u00020\bH\u0086\u0004J\u0015\u0010L\u001a\u0002052\u0006\u0010M\u001a\u00020\bH\u0000\u00a2\u0006\u0002\bNR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u000e\u00100\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u00101\u001a\u00020\b*\u00020\b8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00103\u00a8\u0006R"}, d2 = {"Lcom/megazone/base/ui/view/customs/indicator/ItemIndicator;", "Landroid/view/View;", "Lcom/megazone/base/ui/view/customs/indicator/IndicatorHandler$ItemScrollListener;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animInterpolator", "Landroid/view/animation/Interpolator;", "value", "count", "setCount", "(I)V", "duration", "", "indicatorAnimators", "", "Landroid/animation/ValueAnimator;", "[Landroid/animation/ValueAnimator;", "indicatorBound", "indicatorHandler", "Lcom/megazone/base/ui/view/customs/indicator/IndicatorHandler;", "indicatorSizes", "", "initialPadding", "isDefaultColor", "", "isSelectedColor", "maxCount", "pageChangeListener", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "scrollAmount", "scrollAnimator", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "selectedPaint", "Landroid/graphics/Paint;", "size", "spacing", "typedArray", "Landroid/content/res/TypedArray;", "getTypedArray", "()Landroid/content/res/TypedArray;", "typedArray$delegate", "Lkotlin/Lazy;", "unselectedPaint", "dp", "getDp", "(I)I", "animateIndicators", "", "attachTo", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "getDrawingRange", "Lkotlin/Pair;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "scrollToItem", "item", "setDefaultColor", "color", "setDuration", "setMaxCount", "setSelectedColor", "setSize", "setSpacing", "swipe", "direction", "swipe$app_debug", "Companion", "ItemChangeListener", "ScrollListener", "app_debug"})
public final class ItemIndicator extends android.view.View implements com.megazone.base.ui.view.customs.indicator.IndicatorHandler.ItemScrollListener {
    private int[] indicatorSizes;
    private android.animation.ValueAnimator[] indicatorAnimators;
    private final android.graphics.Paint unselectedPaint = null;
    private final android.graphics.Paint selectedPaint = null;
    private int indicatorBound;
    private long duration;
    private android.view.animation.Interpolator animInterpolator;
    private final kotlin.Lazy typedArray$delegate = null;
    private int size;
    private int scrollAmount;
    private int initialPadding;
    private int spacing;
    private int maxCount;
    private boolean isDefaultColor;
    private boolean isSelectedColor;
    private com.megazone.base.ui.view.customs.indicator.IndicatorHandler indicatorHandler;
    private android.animation.ValueAnimator scrollAnimator;
    private androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListener;
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener pageChangeListener;
    private int count;
    private static final int INDICATOR_DEFAULT_SIZE = 4;
    private static final int INDICATOR_DEFAULT_SPACING = 3;
    private static final int INDICATOR_DEFAULT_BOUND = 30;
    private static final int INDICATOR_MAX_COUNT = 4;
    private static final int MOST_VISIBLE_COUNT = 10;
    private static final int DEFAULT_ANIM_DURATION = 200;
    public static final int SWIPE_DIRECTION_PREVIOUS = 0;
    public static final int SWIPE_DIRECTION_NEXT = 1;
    private static final kotlin.Lazy DEFAULT_INTERPOLATOR$delegate = null;
    public static final com.megazone.base.ui.view.customs.indicator.ItemIndicator.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final android.content.res.TypedArray getTypedArray() {
        return null;
    }
    
    private final void setCount(int value) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    public void scrollToItem(int item) {
    }
    
    public final void attachTo(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    public final void attachTo(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager viewPager) {
    }
    
    public final void setSelectedColor(int color) {
    }
    
    public final void setDefaultColor(int color) {
    }
    
    public final void setMaxCount(int maxCount) {
    }
    
    public final void setDuration(long duration) {
    }
    
    public final void setSpacing(int spacing) {
    }
    
    public final void setSize(int size) {
    }
    
    public final void swipe$app_debug(int direction) {
    }
    
    private final void animateIndicators() {
    }
    
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> getDrawingRange() {
        return null;
    }
    
    private final int getDp(int $this$dp) {
        return 0;
    }
    
    public ItemIndicator(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attr, int defStyle) {
        super(null);
    }
    
    public ItemIndicator(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attr) {
        super(null);
    }
    
    public ItemIndicator(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/megazone/base/ui/view/customs/indicator/ItemIndicator$ScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "indicator", "Lcom/megazone/base/ui/view/customs/indicator/ItemIndicator;", "(Lcom/megazone/base/ui/view/customs/indicator/ItemIndicator;Lcom/megazone/base/ui/view/customs/indicator/ItemIndicator;)V", "midPos", "", "scrollX", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "app_debug"})
    public final class ScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
        private int midPos;
        private int scrollX;
        private final com.megazone.base.ui.view.customs.indicator.ItemIndicator indicator = null;
        
        @java.lang.Override()
        public void onScrolled(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
        }
        
        public ScrollListener(@org.jetbrains.annotations.NotNull()
        com.megazone.base.ui.view.customs.indicator.ItemIndicator indicator) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/megazone/base/ui/view/customs/indicator/ItemIndicator$ItemChangeListener;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "indicator", "Lcom/megazone/base/ui/view/customs/indicator/ItemIndicator;", "(Lcom/megazone/base/ui/view/customs/indicator/ItemIndicator;Lcom/megazone/base/ui/view/customs/indicator/ItemIndicator;)V", "selectedPosition", "", "onPageScrollStateChanged", "", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_debug"})
    public final class ItemChangeListener implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private int selectedPosition;
        private final com.megazone.base.ui.view.customs.indicator.ItemIndicator indicator = null;
        
        @java.lang.Override()
        public void onPageScrollStateChanged(int state) {
        }
        
        @java.lang.Override()
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
        
        public ItemChangeListener(@org.jetbrains.annotations.NotNull()
        com.megazone.base.ui.view.customs.indicator.ItemIndicator indicator) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/megazone/base/ui/view/customs/indicator/ItemIndicator$Companion;", "", "()V", "DEFAULT_ANIM_DURATION", "", "DEFAULT_INTERPOLATOR", "Landroid/view/animation/DecelerateInterpolator;", "getDEFAULT_INTERPOLATOR", "()Landroid/view/animation/DecelerateInterpolator;", "DEFAULT_INTERPOLATOR$delegate", "Lkotlin/Lazy;", "INDICATOR_DEFAULT_BOUND", "INDICATOR_DEFAULT_SIZE", "INDICATOR_DEFAULT_SPACING", "INDICATOR_MAX_COUNT", "MOST_VISIBLE_COUNT", "SWIPE_DIRECTION_NEXT", "SWIPE_DIRECTION_PREVIOUS", "app_debug"})
    public static final class Companion {
        
        private final android.view.animation.DecelerateInterpolator getDEFAULT_INTERPOLATOR() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}