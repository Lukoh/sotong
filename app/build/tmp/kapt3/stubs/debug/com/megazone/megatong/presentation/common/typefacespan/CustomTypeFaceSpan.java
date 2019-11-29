package com.megazone.megatong.presentation.common.typefacespan;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0012H\u0016R\u0013\u0010\u0006\u001a\u00020\u00078\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/megazone/megatong/presentation/common/typefacespan/CustomTypeFaceSpan;", "Landroid/text/style/TypefaceSpan;", "family", "", "newType", "Landroid/graphics/Typeface;", "foregroundColor", "", "(Ljava/lang/String;Landroid/graphics/Typeface;I)V", "getForegroundColor", "()I", "applyCustomTypeFace", "", "paint", "Landroid/graphics/Paint;", "tf", "updateDrawState", "ds", "Landroid/text/TextPaint;", "updateMeasureState", "app_debug"})
public final class CustomTypeFaceSpan extends android.text.style.TypefaceSpan {
    private final android.graphics.Typeface newType = null;
    private final int foregroundColor = 0;
    
    @java.lang.Override()
    public void updateDrawState(@org.jetbrains.annotations.NotNull()
    android.text.TextPaint ds) {
    }
    
    @java.lang.Override()
    public void updateMeasureState(@org.jetbrains.annotations.NotNull()
    android.text.TextPaint paint) {
    }
    
    private final void applyCustomTypeFace(android.graphics.Paint paint, android.graphics.Typeface tf) {
    }
    
    @androidx.annotation.ColorInt()
    public final int getForegroundColor() {
        return 0;
    }
    
    public CustomTypeFaceSpan(@org.jetbrains.annotations.NotNull()
    java.lang.String family, @org.jetbrains.annotations.NotNull()
    android.graphics.Typeface newType, @androidx.annotation.ColorInt()
    int foregroundColor) {
        super(null);
    }
}