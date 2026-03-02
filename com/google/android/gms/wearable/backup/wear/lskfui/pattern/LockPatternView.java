package com.google.android.gms.wearable.backup.wear.lskfui.pattern;

import android.animation.Animator;
import android.animation.AnimatorSet.Builder;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import fcow;
import fcwi;
import fcwj;
import fcwk;
import fcwl;
import fcwm;
import fcwn;
import fcwo;
import fcwp;
import fcwr;
import gftb;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jxm;
import zdd;

public class LockPatternView extends View {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private final Interpolator H;
    private final Interpolator I;
    private final fcwr J;
    public final boolean[][] a;
    public boolean b;
    public boolean c;
    public float d;
    public fcow e;
    private final fcwp[][] f;
    private final int g;
    private final int h;
    private final float i;
    private final int j;
    private final Paint k;
    private final Paint l;
    private final ArrayList m;
    private float n;
    private float o;
    private long[] p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private float u;
    private float v;
    private final LinearGradient w;
    private final Path x;
    private final Rect y;
    private final Rect z;

    public LockPatternView(Context context0) {
        this(context0, null);
    }

    public LockPatternView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        Paint paint0 = new Paint();
        this.k = paint0;
        Paint paint1 = new Paint();
        this.l = paint1;
        this.m = new ArrayList(9);
        this.a = new boolean[3][3];
        this.n = -1.0f;
        this.o = -1.0f;
        this.p = new long[9];
        this.q = 0;
        this.b = true;
        this.r = false;
        this.s = true;
        this.c = false;
        this.t = true;
        this.x = new Path();
        this.y = new Rect();
        this.z = new Rect();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, zdd.h, 0x7F040E6B, 0);  // attr:wearableLockPatternStyle
        String s = typedArray0.getString(0);
        if(Objects.equals(s, "square")) {
            this.A = 0;
        }
        else if(Objects.equals(s, "lock_width")) {
            this.A = 1;
        }
        else if(Objects.equals(s, "lock_height")) {
            this.A = 2;
        }
        else {
            this.A = 0;
        }
        this.setClickable(true);
        paint1.setAntiAlias(true);
        paint1.setDither(true);
        this.B = typedArray0.getColor(6, 0);
        this.C = typedArray0.getColor(3, 0);
        this.D = typedArray0.getColor(7, 0);
        int v = typedArray0.getColor(2, this.B);
        this.E = v;
        this.F = typedArray0.getColor(1, v);
        this.G = typedArray0.getBoolean(4, false);
        int v1 = typedArray0.getColor(5, this.B);
        paint1.setColor(v1);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeJoin(Paint.Join.ROUND);
        paint1.setStrokeCap(Paint.Cap.ROUND);
        int v2 = this.getResources().getDimensionPixelSize(0x7F071687);  // dimen:wearable_lock_pattern_dot_line_width
        this.j = v2;
        paint1.setStrokeWidth(((float)v2));
        this.g = this.getResources().getDimensionPixelSize(0x7F071688);  // dimen:wearable_lock_pattern_dot_size
        this.h = this.getResources().getDimensionPixelSize(0x7F071689);  // dimen:wearable_lock_pattern_dot_size_activated
        TypedValue typedValue0 = new TypedValue();
        this.getResources().getValue(0x7F071686, typedValue0, true);  // dimen:wearable_lock_pattern_dot_hit_factor
        this.i = Math.max(Math.min(typedValue0.getFloat(), 1.0f), 0.2f);
        paint0.setAntiAlias(true);
        paint0.setDither(true);
        this.f = new fcwp[3][3];
        for(int v3 = 0; v3 < 3; ++v3) {
            for(int v4 = 0; v4 < 3; ++v4) {
                fcwp[] arr_fcwp = this.f[v3];
                arr_fcwp[v4] = new fcwp();
                this.f[v3][v4].a = ((float)this.g) / 2.0f;
            }
        }
        this.H = AnimationUtils.loadInterpolator(context0, 0x10C000D);
        this.I = AnimationUtils.loadInterpolator(context0, 0x10C000E);
        fcwr fcwr0 = new fcwr(this, this);
        this.J = fcwr0;
        this.setAccessibilityDelegate(fcwr0);
        int v5 = this.getResources().getDimensionPixelSize(0x7F07168A);  // dimen:wearable_lock_pattern_fade_away_gradient_width
        this.w = new LinearGradient(((float)(-v5)) / 2.0f, 0.0f, ((float)v5) / 2.0f, 0.0f, 0, v1, Shader.TileMode.CLAMP);
        typedArray0.recycle();
    }

    public final float a(int v) {
        return ((float)this.getPaddingLeft()) + ((float)v) * this.u + this.u / 2.0f;
    }

    public final float b(int v) {
        return ((float)this.getPaddingTop()) + ((float)v) * this.v + this.v / 2.0f;
    }

    public final fcwo c(float f, float f1) {
        float f2 = this.d * this.d;
        for(int v = 0; v < 3; ++v) {
            for(int v1 = 0; v1 < 3; ++v1) {
                float f3 = this.b(v);
                float f4 = f - this.a(v1);
                float f5 = f1 - f3;
                if((f4 * f4 + f5 * f5 < f2)) {
                    return fcwo.a(v, v1);
                }
            }
        }
        return null;
    }

    public final void d() {
        this.m.clear();
        this.g();
        this.q = 0;
        this.invalidate();
    }

    @Override  // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent0) {
        int v1;
        fcwr fcwr0 = this.J;
        int v = super.dispatchHoverEvent(motionEvent0);
        if(fcwr0.h.isEnabled() && fcwr0.h.isTouchExplorationEnabled()) {
            switch(motionEvent0.getAction()) {
                case 7: 
                case 9: {
                    float f = motionEvent0.getX();
                    float f1 = motionEvent0.getY();
                    LockPatternView lockPatternView0 = fcwr0.m;
                    fcwo fcwo0 = lockPatternView0.c(f, f1);
                    if(fcwo0 == null) {
                        v1 = 0x80000000;
                    }
                    else {
                        v1 = fcwo0.a * 3 + fcwo0.b + 1;
                        if(!lockPatternView0.a[fcwo0.a][fcwo0.b]) {
                            v1 = 0x80000000;
                        }
                    }
                    fcwr0.f(v1);
                    return v1 == 0x80000000 ? v : v | 1;
                }
                case 10: {
                    if(fcwr0.l != 0x80000000) {
                        fcwr0.f(0x80000000);
                        return v | 1;
                    }
                    break;
                }
                default: {
                    return v;
                }
            }
        }
        return v;
    }

    private final fcwo e(float f, float f1) {
        fcwo fcwo3;
        fcwo fcwo0 = this.c(f, f1);
        fcwo fcwo1 = null;
        if(fcwo0 == null || this.a[fcwo0.a][fcwo0.b]) {
            fcwo0 = null;
        }
        if(fcwo0 != null) {
            ArrayList arrayList0 = this.m;
            if(arrayList0.isEmpty()) {
                fcwo3 = null;
            }
            else {
                int v = -1;
                fcwo fcwo2 = (fcwo)arrayList0.get(arrayList0.size() - 1);
                int v1 = fcwo2.a;
                int v2 = fcwo0.a - v1;
                int v3 = fcwo2.b;
                int v4 = fcwo0.b - v3;
                if(Math.abs(v2) == 2 && Math.abs(v4) != 1) {
                    v1 += (v2 <= 0 ? -1 : 1);
                }
                if(Math.abs(v4) == 2 && Math.abs(v2) != 1) {
                    if(v4 > 0) {
                        v = 1;
                    }
                    v3 += v;
                }
                fcwo3 = fcwo2;
                fcwo1 = fcwo.a(v1, v3);
            }
            if(fcwo1 != null && !this.a[fcwo1.a][fcwo1.b]) {
                this.f(fcwo1);
                if(this.G) {
                    this.m(fcwo1);
                }
            }
            if(this.G && fcwo3 != null) {
                this.m(fcwo3);
            }
            this.f(fcwo0);
            if(this.s) {
                this.performHapticFeedback(1, 3);
            }
            return fcwo0;
        }
        return null;
    }

    private final void f(fcwo fcwo0) {
        this.a[fcwo0.a][fcwo0.b] = true;
        this.m.add(fcwo0);
        if(!this.r) {
            this.l(fcwo0, true);
        }
        this.J.b();
    }

    private final void g() {
        for(int v = 0; v < 3; ++v) {
            for(int v1 = 0; v1 < 3; ++v1) {
                this.a[v][v1] = false;
                this.p[v1 * 3 + v] = 0L;
            }
        }
    }

    private final void h() {
        this.j(0x7F15363D);  // string:wearable_lockscreen_access_pattern_cleared "Pattern cleared"
    }

    private final void i() {
        this.j(0x7F15363F);  // string:wearable_lockscreen_access_pattern_start "Pattern started"
    }

    private final void j(int v) {
        this.announceForAccessibility(this.getContext().getString(v));
    }

    private final void k(boolean z) {
        this.c = z;
        this.J.b();
    }

    private final void l(fcwo fcwo0, boolean z) {
        int v = fcwo0.a;
        int v1 = fcwo0.b;
        fcwp fcwp0 = this.f[v][v1];
        Animator animator0 = fcwp0.g;
        if(animator0 != null) {
            animator0.cancel();
        }
        AnimatorSet animatorSet0 = new AnimatorSet();
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator0.addUpdateListener(new fcwm(this));
        valueAnimator0.setStartDelay(0L);
        valueAnimator0.setDuration(0xFAL);
        AnimatorSet.Builder animatorSet$Builder0 = animatorSet0.play(valueAnimator0);
        float f = this.n;
        float f1 = this.o;
        float f2 = this.a(v1);
        float f3 = this.b(v);
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator1.addUpdateListener(new fcwj(this, fcwp0, f, f2, f1, f3));
        Interpolator interpolator0 = this.H;
        valueAnimator1.setInterpolator(interpolator0);
        valueAnimator1.setDuration(50L);
        AnimatorSet.Builder animatorSet$Builder1 = animatorSet$Builder0.with(valueAnimator1);
        int v2 = this.g;
        int v3 = this.h;
        if(v2 != v3) {
            fcwk fcwk0 = new fcwk(this, fcwp0);
            ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[]{((float)v2) / 2.0f, ((float)v3) / 2.0f});
            valueAnimator2.addUpdateListener(fcwk0);
            valueAnimator2.setInterpolator(this.I);
            valueAnimator2.setDuration(0x60L);
            ValueAnimator valueAnimator3 = ValueAnimator.ofFloat(new float[]{((float)v3) / 2.0f, ((float)v2) / 2.0f});
            valueAnimator3.addUpdateListener(fcwk0);
            valueAnimator3.setInterpolator(interpolator0);
            valueAnimator3.setDuration(0xC0L);
            AnimatorSet animatorSet1 = new AnimatorSet();
            animatorSet1.playSequentially(new Animator[]{valueAnimator2, valueAnimator3});
            animatorSet$Builder1.with(animatorSet1);
        }
        if(this.E != this.F) {
            fcwl fcwl0 = new fcwl(this, fcwp0);
            ValueAnimator valueAnimator4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ValueAnimator valueAnimator5 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            valueAnimator4.addUpdateListener(fcwl0);
            valueAnimator5.addUpdateListener(fcwl0);
            valueAnimator4.setInterpolator(interpolator0);
            valueAnimator5.setInterpolator(this.I);
            valueAnimator4.setDuration(50L);
            valueAnimator5.setDuration(50L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            if(this.G) {
                if(!z) {
                    valueAnimator4 = valueAnimator5;
                }
                animatorSet2.play(valueAnimator4);
            }
            else {
                animatorSet2.play(valueAnimator5).after(150L).after(valueAnimator4);
            }
            animatorSet$Builder1.with(animatorSet2);
        }
        animatorSet0.addListener(new fcwn(this, fcwp0));
        fcwp0.g = animatorSet0;
        animatorSet0.start();
    }

    private final void m(fcwo fcwo0) {
        this.l(fcwo0, false);
    }

    private static final int n(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v);
        switch(View.MeasureSpec.getMode(v)) {
            case 0x80000000: {
                return Math.max(v2, v1);
            }
            case 0: {
                return v1;
            }
            default: {
                return v2;
            }
        }
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        int v16;
        int v11;
        Path path1;
        float f10;
        int v3;
        Canvas canvas1 = canvas0;
        ArrayList arrayList0 = this.m;
        int v = arrayList0.size();
        boolean[][] arr2_z = this.a;
        if(this.q == 1) {
            int v1 = (int)(SystemClock.elapsedRealtime() % ((long)((v + 1) * 700)));
            this.g();
            for(int v2 = 0; v2 < v1 / 700; ++v2) {
                fcwo fcwo0 = (fcwo)arrayList0.get(v2);
                arr2_z[fcwo0.a][fcwo0.b] = true;
            }
            if(v1 / 700 > 0 && v1 / 700 < v) {
                fcwo fcwo1 = (fcwo)arrayList0.get(v1 / 700 - 1);
                float f = this.a(fcwo1.b);
                float f1 = this.b(fcwo1.a);
                fcwo fcwo2 = (fcwo)arrayList0.get(v1 / 700);
                float f2 = ((float)(v1 % 700)) / 700.0f;
                float f3 = this.a(fcwo2.b) - f;
                float f4 = this.b(fcwo2.a) - f1;
                this.n = f + f3 * f2;
                this.o = f1 + f2 * f4;
            }
            this.invalidate();
        }
        Path path0 = this.x;
        path0.rewind();
        if(!this.r) {
            Paint paint0 = this.l;
            if(this.c) {
                v3 = this.B;
            }
            else {
                int v4 = this.q;
                if(v4 == 2) {
                    v3 = this.C;
                }
                else {
                    if(v4 != 0 && v4 != 1) {
                        throw new IllegalStateException("unknown display mode " + v4);
                    }
                    v3 = this.D;
                }
            }
            paint0.setColor(v3);
            long v5 = SystemClock.elapsedRealtime();
            float f5 = 0.0f;
            float f6 = 0.0f;
            int v6 = 0;
            boolean z = false;
            while(v6 < v) {
                fcwo fcwo3 = (fcwo)arrayList0.get(v6);
                int v7 = fcwo3.a;
                int v8 = fcwo3.b;
                if(!arr2_z[v7][v8]) {
                    break;
                }
                long[] arr_v = this.p;
                if(arr_v[v6] == 0L) {
                    arr_v[v6] = SystemClock.elapsedRealtime();
                }
                float f7 = this.a(v8);
                float f8 = this.b(v7);
                if(v6 == 0) {
                    v11 = 0;
                    path1 = path0;
                }
                else {
                    fcwp fcwp0 = this.f[v7][v8];
                    path0.rewind();
                    float f9 = fcwp0.e;
                    if(f9 != 1.401298E-45f) {
                        f10 = fcwp0.f;
                        if(f10 != 1.401298E-45f) {
                            goto label_64;
                        }
                    }
                    f9 = f7;
                    f10 = f8;
                label_64:
                    long v9 = this.p[v6];
                    if(this.t) {
                        path1 = path0;
                        long v10 = v5 - v9;
                        if(v10 >= 0xFAL) {
                            v11 = v6;
                        }
                        else {
                            float f11 = Math.max(((float)v10) / 250.0f, 0.0f);
                            paint0.setAlpha(((int)((1.0f - f11) * 255.0f)));
                            paint0.setShader(this.w);
                            canvas1.save();
                            canvas1.translate(f9 * f11 + f5 * (1.0f - f11), f10 * f11 + f6 * (1.0f - f11));
                            float f12 = f10 - f6;
                            float f13 = f9 - f5;
                            float f14 = (float)Math.toDegrees(Math.atan(f12 / f13));
                            if((f13 < 0.0f)) {
                                f14 += 180.0f;
                            }
                            canvas1.rotate(f14);
                            float f15 = (float)Math.hypot(f13, f12);
                            v11 = v6;
                            canvas1.drawLine(-f15 * f11, 0.0f, f15 * (1.0f - f11), 0.0f, paint0);
                            canvas0.restore();
                            paint0.setShader(null);
                            canvas1 = canvas0;
                        }
                    }
                    else {
                        v11 = v6;
                        path1 = path0;
                        paint0.setAlpha(0xFF);
                        canvas1 = canvas0;
                        canvas1.drawLine(f5, f6, f9, f10, paint0);
                    }
                }
                v6 = v11 + 1;
                f5 = f7;
                f6 = f8;
                path0 = path1;
                z = true;
            }
            if((this.c || this.q == 1) && z) {
                path0.rewind();
                path0.moveTo(f5, f6);
                path0.lineTo(this.n, this.o);
                float f16 = this.n - f5;
                float f17 = this.o - f6;
                paint0.setAlpha(((int)(Math.min(1.0f, Math.max(0.0f, (((float)Math.sqrt(f16 * f16 + f17 * f17)) / this.u - 0.3f) * 4.0f)) * 255.0f)));
                canvas1.drawPath(path0, paint0);
            }
        }
        int v12 = 0;
        while(v12 < 3) {
            float f18 = this.b(v12);
            int v13 = 0;
            while(v13 < 3) {
                fcwp fcwp1 = this.f[v12][v13];
                int v14 = (int)this.a(v13);
                float f19 = fcwp1.a;
                boolean z1 = arr2_z[v12][v13];
                float f20 = fcwp1.d;
                if(!this.t) {
                    if(z1) {
                        this.k.setColor(this.F);
                        goto label_135;
                    }
                }
                else if(!this.r) {
                    int v15 = jxm.e(this.E, this.F, f20);
                    this.k.setColor(v15);
                    goto label_135;
                }
                Paint paint1 = this.k;
                if(this.r) {
                    v16 = this.E;
                }
                else {
                    v16 = this.q == 2 ? this.C : this.E;
                }
                paint1.setColor(v16);
            label_135:
                this.k.setAlpha(0xFF);
                canvas1.drawCircle(((float)v14), ((float)(((int)(f18 + 0.0f)))), f19, this.k);
                ++v13;
            }
            ++v12;
        }
    }

    @Override  // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent0) {
        if(((AccessibilityManager)this.getContext().getSystemService(AccessibilityManager.class)).isTouchExplorationEnabled()) {
            int v = motionEvent0.getAction();
            switch(v) {
                case 7: {
                    motionEvent0.setAction(2);
                    break;
                }
                case 9: {
                    motionEvent0.setAction(0);
                    break;
                }
                case 10: {
                    motionEvent0.setAction(1);
                }
            }
            this.onTouchEvent(motionEvent0);
            motionEvent0.setAction(v);
        }
        return super.onHoverEvent(motionEvent0);
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        int v2 = this.getSuggestedMinimumWidth();
        int v3 = this.getSuggestedMinimumHeight();
        int v4 = LockPatternView.n(v, v2);
        int v5 = LockPatternView.n(v1, v3);
        switch(this.A) {
            case 0: {
                v4 = Math.min(v4, v5);
                v5 = v4;
                break;
            }
            case 1: {
                v5 = Math.min(v4, v5);
                break;
            }
            default: {
                v4 = Math.min(v4, v5);
            }
        }
        this.setMeasuredDimension(v4, v5);
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        Collection collection0;
        super.onRestoreInstanceState(((LockPatternView.SavedState)parcelable0).getSuperState());
        byte[] arr_b = ((LockPatternView.SavedState)parcelable0).a.getBytes();
        if(arr_b == null) {
            collection0 = null;
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_b.length; ++v) {
                int v1 = (byte)(arr_b[v] - 49);
                arrayList0.add(fcwo.a(v1 / 3, v1 % 3));
            }
            collection0 = arrayList0;
        }
        this.m.clear();
        this.m.addAll(collection0);
        this.g();
        for(Object object0: ((List)collection0)) {
            this.a[((fcwo)object0).a][((fcwo)object0).b] = true;
        }
        this.q = 0;
        this.invalidate();
        this.q = ((LockPatternView.SavedState)parcelable0).b;
        this.b = ((LockPatternView.SavedState)parcelable0).c;
        this.r = ((LockPatternView.SavedState)parcelable0).d;
        this.s = ((LockPatternView.SavedState)parcelable0).e;
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new LockPatternView.SavedState(super.onSaveInstanceState(), new String(fcwi.a(this.m)), this.q, this.b, this.r, this.s);
    }

    @Override  // android.view.View
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        this.u = ((float)(v - this.getPaddingLeft() - this.getPaddingRight())) / 3.0f;
        this.v = ((float)(v1 - this.getPaddingTop() - this.getPaddingBottom())) / 3.0f;
        this.J.b();
        this.d = Math.min(this.v / 2.0f, this.u / 2.0f) * this.i;
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(this.b && this.isEnabled()) {
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.d();
                    float f = motionEvent0.getX();
                    float f1 = motionEvent0.getY();
                    fcwo fcwo0 = this.e(f, f1);
                    if(fcwo0 != null) {
                        this.k(true);
                        this.q = 0;
                        this.i();
                    }
                    else if(this.c) {
                        this.k(false);
                        this.h();
                    }
                    if(fcwo0 != null) {
                        float f2 = this.a(fcwo0.b);
                        float f3 = this.b(fcwo0.a);
                        this.invalidate(((int)(f2 - this.u / 2.0f)), ((int)(f3 - this.v / 2.0f)), ((int)(f2 + this.u / 2.0f)), ((int)(f3 + this.v / 2.0f)));
                    }
                    this.n = f;
                    this.o = f1;
                    return true;
                }
                case 1: {
                    ArrayList arrayList0 = this.m;
                    if(!arrayList0.isEmpty()) {
                        this.k(false);
                        for(int v1 = 0; v1 < 3; ++v1) {
                            for(int v2 = 0; v2 < 3; ++v2) {
                                fcwp fcwp0 = this.f[v1][v2];
                                Animator animator0 = fcwp0.g;
                                if(animator0 != null) {
                                    animator0.cancel();
                                    fcwp0.g = null;
                                    fcwp0.a = ((float)this.g) / 2.0f;
                                    fcwp0.d = 0.0f;
                                    fcwp0.e = 1.401298E-45f;
                                    fcwp0.f = 1.401298E-45f;
                                }
                            }
                        }
                        if(this.G) {
                            this.m(((fcwo)arrayList0.get(arrayList0.size() - 1)));
                        }
                        this.j(0x7F15363E);  // string:wearable_lockscreen_access_pattern_detected "Pattern completed"
                        fcow fcow0 = this.e;
                        if(fcow0 != null) {
                            fcow0.a.a();
                            gftb.check(arrayList0);
                            gftb.b(((boolean)(arrayList0.isEmpty() ^ 1)), "pattern must not be empty");
                            byte[] arr_b = fcwi.a(arrayList0);
                            fcow0.a.l.d(arr_b);
                        }
                        if(this.t) {
                            this.g();
                            this.q = 0;
                        }
                        this.invalidate();
                    }
                    return true;
                }
                case 2: {
                    int v3 = this.j;
                    int v4 = motionEvent0.getHistorySize();
                    Rect rect0 = this.z;
                    rect0.setEmpty();
                    boolean z = false;
                    for(int v = 0; v < v4 + 1; ++v) {
                        float f4 = v >= v4 ? motionEvent0.getX() : motionEvent0.getHistoricalX(v);
                        float f5 = v >= v4 ? motionEvent0.getY() : motionEvent0.getHistoricalY(v);
                        fcwo fcwo1 = this.e(f4, f5);
                        ArrayList arrayList1 = this.m;
                        int v5 = arrayList1.size();
                        if(fcwo1 != null && v5) {
                            this.k(true);
                            this.i();
                            v5 = true;
                        }
                        if(Float.compare(Math.abs(f4 - this.n), 0.0f) > 0 || (Math.abs(f5 - this.o) > 0.0f)) {
                            z = true;
                        }
                        if(this.c && v5 > 0) {
                            fcwo fcwo2 = (fcwo)arrayList1.get(v5 - 1);
                            float f6 = this.a(fcwo2.b);
                            float f7 = this.b(fcwo2.a);
                            float f8 = Math.min(f6, f4) - ((float)v3);
                            float f9 = Math.max(f6, f4) + ((float)v3);
                            float f10 = Math.min(f7, f5) - ((float)v3);
                            float f11 = Math.max(f7, f5) + ((float)v3);
                            if(fcwo1 != null) {
                                float f12 = this.u * 0.5f;
                                float f13 = this.v * 0.5f;
                                float f14 = this.a(fcwo1.b);
                                float f15 = this.b(fcwo1.a);
                                f8 = Math.min(f14 - f12, f8);
                                f9 = Math.max(f14 + f12, f9);
                                f10 = Math.min(f15 - f13, f10);
                                f11 = Math.max(f15 + f13, f11);
                            }
                            rect0.union(Math.round(f8), Math.round(f10), Math.round(f9), Math.round(f11));
                        }
                    }
                    this.n = motionEvent0.getX();
                    this.o = motionEvent0.getY();
                    if(z) {
                        this.y.union(rect0);
                        this.invalidate(this.y);
                        this.y.set(rect0);
                    }
                    return true;
                }
                case 3: {
                    if(this.c) {
                        this.k(false);
                        this.d();
                        this.h();
                    }
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }
}

