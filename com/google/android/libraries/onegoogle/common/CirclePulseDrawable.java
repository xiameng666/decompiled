package com.google.android.libraries.onegoogle.common;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import fnwj;

public final class CirclePulseDrawable extends Drawable implements Drawable.Callback {
    public final Drawable a;
    public int b;
    private final RectF c;
    private final fnwj d;
    private final fnwj e;
    private final int f;
    private final int g;

    public CirclePulseDrawable(Drawable drawable0, int v, int v1) {
        this.a = drawable0;
        RectF rectF0 = new RectF(drawable0.getBounds());
        this.c = rectF0;
        this.b = (int)rectF0.width();
        drawable0.setCallback(this);
        this.d = new fnwj(v);
        this.f = Color.alpha(v);
        this.e = new fnwj(v1);
        this.g = Color.alpha(v1);
    }

    public final void a() {
        Rect rect0 = this.getBounds();
        int v = (this.getBounds().width() - this.b) / 2;
        int v1 = (this.getBounds().height() - this.b) / 2;
        this.a.setBounds(rect0.left + v, rect0.top + v1, rect0.right - v, rect0.bottom - v1);
        Rect rect1 = this.a.getBounds();
        this.c.set(rect1);
        CirclePulseDrawable.c(this.d, this.c);
        CirclePulseDrawable.c(this.e, this.c);
    }

    private final void b(fnwj fnwj0, int v) {
        fnwj0.c = v;
        CirclePulseDrawable.c(fnwj0, this.c);
        this.a.invalidateSelf();
    }

    private static void c(fnwj fnwj0, RectF rectF0) {
        float f = (float)fnwj0.c;
        RectF rectF1 = new RectF(rectF0.left - f, rectF0.top - f, rectF0.right + f, rectF0.bottom + f);
        fnwj0.b.reset();
        fnwj0.b.addOval(rectF1, Path.Direction.CW);
        fnwj0.b.addOval(rectF0, Path.Direction.CCW);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        this.a.draw(canvas0);
        canvas0.drawPath(this.d.b, this.d.a);
        canvas0.drawPath(this.e.b, this.e.a);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.getAlpha();
    }

    public int getFirstPulseSize() {
        return this.d.c;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public int getSecondPulseSize() {
        return this.e.c;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.a();
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        this.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.d.a.setAlpha(this.f * v / 0xFF);
        this.e.a.setAlpha(this.g * v / 0xFF);
        this.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
    }

    public void setFirstPulseSize(int v) {
        this.b(this.d, v);
    }

    public void setSecondPulseSize(int v) {
        this.b(this.e, v);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        this.unscheduleSelf(runnable0);
    }
}

