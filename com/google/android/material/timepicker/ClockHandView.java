package com.google.android.material.timepicker;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import fycp;
import fynt;
import fyoy;
import fyse;
import fzaw;
import fzax;
import fzay;
import fzaz;
import fzbh;
import fzbn;
import java.util.ArrayList;
import java.util.List;

public class ClockHandView extends View {
    public boolean a;
    public boolean b;
    public final int c;
    public final RectF d;
    public fzay e;
    public int f;
    public int g;
    private final int h;
    private final TimeInterpolator i;
    private final ValueAnimator j;
    private float k;
    private float l;
    private boolean m;
    private final int n;
    private final List o;
    private final float p;
    private final Paint q;
    private final int r;
    private float s;
    private boolean t;
    private double u;

    public ClockHandView(Context context0) {
        this(context0, null);
    }

    public ClockHandView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F04086B);  // attr:materialClockStyle
    }

    public ClockHandView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        ValueAnimator valueAnimator0 = new ValueAnimator();
        this.j = valueAnimator0;
        this.o = new ArrayList();
        Paint paint0 = new Paint();
        this.q = paint0;
        this.d = new RectF();
        this.g = 1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, fzbh.b, v, 0x7F1614E2);  // style:Widget.MaterialComponents.TimePicker.Clock
        this.h = fyse.a(context0, 0x7F0408CD, 200);  // attr:motionDurationLong2
        this.i = fyoy.a(context0, 0x7F0408DD, fycp.b);  // attr:motionEasingEmphasizedInterpolator
        this.f = typedArray0.getDimensionPixelSize(1, 0);
        this.c = typedArray0.getDimensionPixelSize(2, 0);
        Resources resources0 = this.getResources();
        this.r = resources0.getDimensionPixelSize(0x7F070BAD);  // dimen:material_clock_hand_stroke_width
        this.p = (float)resources0.getDimensionPixelSize(0x7F070BAB);  // dimen:material_clock_hand_center_dot_radius
        int v1 = typedArray0.getColor(0, 0);
        paint0.setAntiAlias(true);
        paint0.setColor(v1);
        this.b(0.0f);
        this.n = ViewConfiguration.get(context0).getScaledTouchSlop();
        this.setImportantForAccessibility(2);
        typedArray0.recycle();
        valueAnimator0.addUpdateListener(new fzaw(this));
        valueAnimator0.addListener(new fzax(this));
    }

    public final void a(fzaz fzaz0) {
        this.o.add(fzaz0);
    }

    public final void b(float f) {
        this.c(f, false);
    }

    public final void c(float f, boolean z) {
        ValueAnimator valueAnimator0 = this.j;
        valueAnimator0.cancel();
        if(z) {
            float f1 = this.s;
            if((Math.abs(f1 - f) > 180.0f)) {
                if(Float.compare(f1, 180.0f) > 0 && (f < 180.0f)) {
                    f += 360.0f;
                }
                if((f1 < 180.0f) && (f > 180.0f)) {
                    f1 += 360.0f;
                }
            }
            Pair pair0 = new Pair(f1, f);
            valueAnimator0.setFloatValues(new float[]{((float)(((Float)pair0.first))), ((float)(((Float)pair0.second)))});
            valueAnimator0.setDuration(((long)this.h));
            valueAnimator0.setInterpolator(this.i);
            valueAnimator0.start();
            return;
        }
        this.d(f, false);
    }

    public final void d(float f, boolean z) {
        this.s = f % 360.0f;
        this.u = Math.toRadians(-90.0f + f % 360.0f);
        int v = this.getHeight() / 2;
        int v1 = this.getWidth() / 2;
        float f1 = (float)this.f(this.g);
        float f2 = ((float)v) + ((float)Math.sin(this.u)) * f1;
        float f3 = ((float)v1) + f1 * ((float)Math.cos(this.u));
        this.d.set(f3 - ((float)this.c), f2 - ((float)this.c), f3 + ((float)this.c), f2 + ((float)this.c));
        for(Object object0: this.o) {
            ((fzaz)object0).g(f % 360.0f, z);
        }
        this.invalidate();
    }

    private final int e(float f, float f1) {
        int v = this.getWidth() / 2;
        int v1 = (int)Math.toDegrees(Math.atan2(f1 - ((float)(this.getHeight() / 2)), f - ((float)v)));
        return v1 + 90 >= 0 ? v1 + 90 : v1 + 450;
    }

    private final int f(int v) {
        return v == 2 ? Math.round(((float)this.f) * 0.66f) : this.f;
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        int v = this.getHeight() / 2;
        int v1 = this.getWidth() / 2;
        int v2 = this.f(this.g);
        float f = (float)v2;
        float f1 = (float)Math.cos(this.u);
        float f2 = (float)Math.sin(this.u);
        this.q.setStrokeWidth(0.0f);
        float f3 = (float)v1;
        float f4 = (float)v;
        canvas0.drawCircle(f * f1 + f3, f2 * f + f4, ((float)this.c), this.q);
        double f5 = (double)(((float)(v2 - this.c)));
        double f6 = Math.cos(this.u) * f5;
        double f7 = f5 * Math.sin(this.u);
        this.q.setStrokeWidth(((float)this.r));
        canvas0.drawLine(f3, f4, ((float)(v1 + ((int)f6))), ((float)(v + ((int)f7))), this.q);
        canvas0.drawCircle(f3, f4, this.p, this.q);
    }

    @Override  // android.view.View
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(!this.j.isRunning()) {
            this.b(this.s);
        }
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        int v6;
        boolean z2;
        boolean z1;
        boolean z;
        int v = 2;
        int v1 = motionEvent0.getActionMasked();
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        if(v1 == 0) {
            this.k = f;
            this.l = f1;
            this.m = true;
            this.t = false;
            z1 = true;
            z = false;
            z2 = false;
        }
        else if(v1 != 1 && v1 != 2) {
            z = false;
            z1 = false;
            z2 = false;
        }
        else {
            int v2 = (int)(f1 - this.l);
            int v3 = (int)(f - this.k);
            this.m = v3 * v3 + v2 * v2 > this.n;
            z2 = this.t;
            z = v1 == 1;
            if(this.b) {
                if(((float)Math.hypot(f - ((float)(this.getWidth() / 2)), f1 - ((float)(this.getHeight() / 2)))) > ((float)this.f(2)) + fynt.a(this.getContext(), 12)) {
                    v = 1;
                }
                this.g = v;
            }
            z1 = false;
        }
        int v4 = this.t;
        int v5 = this.e(f, f1);
        float f2 = this.s;
        if(!z1) {
            if(f2 == ((float)v5)) {
            label_36:
                if(z2) {
                    this.c(((float)v5), z && this.a);
                    v6 = 1;
                }
                else {
                    v6 = 0;
                }
            }
            else {
                this.c(((float)v5), z && this.a);
                v6 = 1;
            }
        }
        else if(f2 != ((float)v5)) {
            v6 = 1;
        }
        else {
            goto label_36;
        }
        int v7 = v6 | v4;
        this.t = v7;
        if(v7 != 0 && z) {
            fzay fzay0 = this.e;
            if(fzay0 != null) {
                float f3 = (float)this.e(f, f1);
                boolean z3 = this.m;
                ((fzbn)fzay0).e = true;
                TimeModel timeModel0 = ((fzbn)fzay0).b;
                int v8 = timeModel0.e;
                int v9 = timeModel0.d;
                if(timeModel0.f == 10) {
                    ((fzbn)fzay0).a.g(((fzbn)fzay0).d, false);
                    AccessibilityManager accessibilityManager0 = (AccessibilityManager)((fzbn)fzay0).a.getContext().getSystemService(AccessibilityManager.class);
                    if(accessibilityManager0 == null || !accessibilityManager0.isTouchExplorationEnabled()) {
                        ((fzbn)fzay0).d(12, true);
                    }
                }
                else {
                    int v10 = Math.round(f3);
                    if(!z3) {
                        timeModel0.f((v10 + 15) / 30 * 5);
                        ((fzbn)fzay0).c = (float)(timeModel0.e * 6);
                    }
                    ((fzbn)fzay0).a.g(((fzbn)fzay0).c, z3);
                }
                ((fzbn)fzay0).e = false;
                ((fzbn)fzay0).f();
                ((fzbn)fzay0).c(v9, v8);
            }
        }
        return true;
    }
}

