package com.google.android.wallet.ui.address;

import a;
import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import gcwv;
import gcwz;
import gday;
import java.util.ArrayList;

public class DynamicAddressFieldsLayout extends gday implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    View a;
    RelativeLayout b;
    public gcwz c;
    private ValueAnimator d;
    private ValueAnimator e;
    private ValueAnimator f;
    private int g;
    private ArrayList h;
    private boolean i;
    private SparseBooleanArray j;
    private final ArrayList k;
    private final ArrayList l;

    public DynamicAddressFieldsLayout(Context context0) {
        this(context0, null);
    }

    public DynamicAddressFieldsLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public DynamicAddressFieldsLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.g = 1;
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    protected final void a(ArrayList arrayList0) {
        this.b.removeViews(1, this.b.getChildCount() - 1);
        int v = arrayList0.size();
        this.j = new SparseBooleanArray(v);
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)arrayList0.get(v1);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
            if(v1 > 0) {
                relativeLayout$LayoutParams0.addRule(3, ((View)arrayList0.get(v1 - 1)).getId());
            }
            this.j.put(view0.getId(), view0.getVisibility() != 0);
            this.b.addView(view0, relativeLayout$LayoutParams0);
        }
    }

    public final void b(View view0, View view1) {
        if(this.g != 3 && this.g != 4) {
            int v = this.b.indexOfChild(view0);
            if(v < 0) {
                throw new IllegalArgumentException(a.O(view0, "oldView: ", " is not present in the fields container"));
            }
            if(this.b.indexOfChild(view1) >= 0) {
                throw new IllegalArgumentException(a.O(view1, "newView: ", " is already present in the fields container"));
            }
            if(v > 1) {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
                relativeLayout$LayoutParams0.addRule(3, this.b.getChildAt(v - 1).getId());
                view1.setLayoutParams(relativeLayout$LayoutParams0);
                if(v < this.b.getChildCount() - 1) {
                    ((RelativeLayout.LayoutParams)this.b.getChildAt(v + 1).getLayoutParams()).addRule(3, view1.getId());
                }
            }
            this.b.removeViewAt(v);
            this.b.addView(view1, v);
            return;
        }
        this.k.add(view0);
        this.l.add(view1);
    }

    protected final void c(int v) {
        int v1 = this.b.getChildCount();
        for(int v2 = 1; v2 < v1; ++v2) {
            View view0 = this.b.getChildAt(v2);
            if(!this.j.get(view0.getId())) {
                view0.setVisibility(v);
            }
        }
    }

    public final void d(ArrayList arrayList0) {
        switch(this.g) {
            case 1: {
                this.a(arrayList0);
                this.c(8);
                return;
            }
            case 2: {
                this.a(arrayList0);
                return;
            }
            case 3: 
            case 4: {
                this.h = arrayList0;
                ArrayList arrayList1 = this.k;
                if(!arrayList1.isEmpty()) {
                    arrayList1.clear();
                    this.l.clear();
                }
            }
        }
    }

    public final void e() {
        switch(this.g) {
            case 1: {
                this.c(0);
                this.g = 4;
                this.f.setFloatValues(new float[]{0.0f, 1.0f});
                this.f.start();
                return;
            }
            case 3: {
                this.i = true;
            }
        }
    }

    public final void f() {
        switch(this.g) {
            case 2: {
                this.g = 3;
                this.a.setVisibility(0);
                this.f.setFloatValues(new float[]{1.0f, 0.0f});
                this.f.setStartDelay(200L);
                this.f.setCurrentPlayTime(0L);
                this.f.start();
                return;
            }
            case 4: {
                this.g = 3;
                this.f.reverse();
            }
        }
    }

    private final int g() {
        return this.a.getMeasuredHeight();
    }

    private final void h(float f) {
        gcwz gcwz0 = this.c;
        if(gcwz0 != null) {
            TextView textView0 = ((gcwv)gcwz0).l;
            if(textView0 != null && textView0.getVisibility() == 0) {
                ((gcwv)gcwz0).l.setTranslationY(f);
            }
            View[] arr_view = ((gcwv)gcwz0).m;
            for(int v = 0; v < arr_view.length; ++v) {
                View view0 = arr_view[v];
                if(view0.getVisibility() == 0) {
                    view0.setTranslationY(f);
                }
            }
        }
    }

    private final void i(int v) {
        int v1 = this.b.getChildCount();
        for(int v2 = 1; v2 < v1; ++v2) {
            this.b.getChildAt(v2).setLayerType(v, null);
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationCancel(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationEnd(Animator animator0) {
        this.i(0);
        this.f.setStartDelay(0L);
        int v = this.g;
        int v1 = 8;
        if(v == 4) {
            this.g = 2;
            int v2 = this.j.size();
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                v4 += this.j.valueAt(v3) ^ 1;
            }
            if(v4 != 0) {
                v1 = 4;
            }
            this.a.setVisibility(v1);
        }
        else if(v == 3) {
            this.g = 1;
            this.c(8);
        }
        ArrayList arrayList0 = this.h;
        if(arrayList0 != null) {
            this.d(arrayList0);
            this.h = null;
        }
        ArrayList arrayList1 = this.k;
        int v5 = arrayList1.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            this.b(((View)arrayList1.get(v6)), ((View)this.l.get(v6)));
        }
        arrayList1.clear();
        this.l.clear();
        if(this.i && this.g == 1) {
            this.i = false;
            ValueAnimator valueAnimator0 = this.d;
            this.f = this.f == valueAnimator0 ? this.e : valueAnimator0;
            this.e();
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationRepeat(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationStart(Animator animator0) {
        this.i(2);
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        int v = this.b.getChildCount();
        for(int v1 = 1; v1 < v; ++v1) {
            View view0 = this.b.getChildAt(v1);
            view0.setAlpha(f);
            view0.setY(((float)view0.getTop()) * f);
        }
        this.a.setAlpha(1.0f - f);
        this.h((1.0f - f) * ((float)(this.g() - this.getMeasuredHeight())));
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = ((ViewStub)this.findViewById(0x7F0B1D35)).inflate();  // id:progress_bar
        this.b = (RelativeLayout)this.findViewById(0x7F0B11BE);  // id:dynamic_address_fields_container
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f});
        this.d = valueAnimator0;
        valueAnimator0.addUpdateListener(this);
        this.d.addListener(this);
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{0.0f});
        this.e = valueAnimator1;
        valueAnimator1.addUpdateListener(this);
        this.e.addListener(this);
        this.f = this.d;
    }

    @Override  // android.view.View
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.h((1.0f - ((float)(((Float)this.f.getAnimatedValue())))) * ((float)(this.g() - v1)));
    }
}

