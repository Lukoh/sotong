package com.goforer.sotong.presentation.common.typefacespan

import android.graphics.Paint
import android.graphics.Typeface
import android.text.TextPaint
import android.text.style.TypefaceSpan
import androidx.annotation.ColorInt

class CustomTypeFaceSpan(family: String, private val newType: Typeface,
                         @param:ColorInt @get:ColorInt val foregroundColor: Int): TypefaceSpan(family) {
    override fun updateDrawState(ds: TextPaint) {
        ds.color = foregroundColor
        applyCustomTypeFace(ds, newType)
    }

    override fun updateMeasureState(paint: TextPaint) {
        applyCustomTypeFace(paint, newType)
    }

    private fun applyCustomTypeFace(paint: Paint, tf: Typeface) {
        val oldStyle: Int
        val old = paint.typeface

        oldStyle = old?.style ?: 0

        val fake = oldStyle and tf.style.inv()

        if (fake and Typeface.BOLD != 0) {
            paint.isFakeBoldText = true
        }

        if (fake and Typeface.ITALIC != 0) {
            paint.textSkewX = -0.25f
        }

        paint.typeface = tf
    }
}