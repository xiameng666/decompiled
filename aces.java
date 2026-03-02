import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet.Builder;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;

public final class aces {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final float F;
    private final ColorStateList G;
    private final Drawable H;
    private final Drawable I;
    private AnimatorSet J;
    private AnimatorSet K;
    private int L;
    private int M;
    private boolean N;
    private Object[] O;
    private boolean P;
    private boolean Q;
    private SectionIndexer R;
    private boolean S;
    private boolean T;
    private final int U;
    private final boolean V;
    private float W;
    private long X;
    private final int Y;
    private int Z;
    public final int a;
    private final GradientDrawable aa;
    private GradientDrawable ab;
    private final Runnable ac;
    private final Animator.AnimatorListener ad;
    public boolean b;
    public long c;
    public int d;
    public tk e;
    public int f;
    public int g;
    public int h;
    public final aceu i;
    private static final int[] j;
    private static final int[] k;
    private static final long l;
    private static final Property m;
    private static final Property n;
    private static final Property o;
    private static final Property p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final TextView t;
    private final TextView u;
    private final ImageView v;
    private final ImageView w;
    private final View x;
    private final int[] y;
    private final int z;

    static {
        aces.j = new int[]{0x10100A7};
        aces.k = new int[0];
        aces.l = 100L;
        aces.m = new aceo();
        aces.n = new acep();
        aces.o = new aceq();
        aces.p = new acer();
    }

    public aces(ViewGroup viewGroup0, aceu aceu0) {
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        int[] arr_v = new int[2];
        this.y = arr_v;
        this.L = -1;
        this.M = -1;
        this.X = -1L;
        this.ac = new acem(this);
        this.ad = new acen(this);
        this.i = aceu0;
        this.g = aceu0.m == null ? 0 : aceu0.m.b();
        this.h = aceu0.getChildCount();
        Context context0 = aceu0.getContext();
        this.Y = ViewConfiguration.get(context0).getScaledTouchSlop();
        this.f = aceu0.getScrollBarStyle();
        this.d = 1;
        this.V = true;
        ImageView imageView0 = new ImageView(context0);
        this.w = imageView0;
        imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView1 = new ImageView(context0);
        this.v = imageView1;
        imageView1.setScaleType(ImageView.ScaleType.FIT_XY);
        View view0 = new View(context0);
        this.x = view0;
        view0.setAlpha(0.0f);
        TextView textView0 = this.r(context0);
        this.t = textView0;
        TextView textView1 = this.r(context0);
        this.u = textView1;
        this.z = context0.getResources().getDimensionPixelSize(0x7F070135);  // dimen:appinvite_fast_scroller_minimum_touch_target
        Resources resources0 = aceu0.getContext().getResources();
        int v = resources0.getDimensionPixelSize(0x7F070140);  // dimen:appinvite_fastscroller_thumbMinWidth
        this.D = v;
        int v1 = resources0.getDimensionPixelSize(0x7F07013F);  // dimen:appinvite_fastscroller_thumbMinHeight
        this.E = v1;
        float f = (float)resources0.getDimensionPixelSize(0x7F07013E);  // dimen:appinvite_fastscroller_textSize
        this.F = f;
        int v2 = resources0.getDimensionPixelSize(0x7F07013C);  // dimen:appinvite_fastscroller_minWidth
        this.B = v2;
        int v3 = resources0.getDimensionPixelSize(0x7F07013B);  // dimen:appinvite_fastscroller_minHeight
        this.C = v3;
        this.A = resources0.getDimensionPixelSize(0x7F07013D);  // dimen:appinvite_fastscroller_padding
        int v4 = resources0.getDimensionPixelSize(0x7F070139);  // dimen:appinvite_fastscroll_thumb_jb2_width
        int v5 = resources0.getDimensionPixelSize(0x7F070138);  // dimen:appinvite_fastscroll_thumb_jb2_height
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        this.aa = gradientDrawable0;
        gradientDrawable0.setShape(0);
        gradientDrawable0.setSize(v4, v5);
        gradientDrawable0.setColor(this.Z);
        GradientDrawable gradientDrawable1 = new GradientDrawable();
        gradientDrawable1.setShape(0);
        gradientDrawable1.setSize(v4, v5);
        gradientDrawable1.setColor(resources0.getColor(0x7F06004C));  // color:appinvite_medium_black
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        stateListDrawable0.addState(aces.j, gradientDrawable0);
        stateListDrawable0.addState(aces.k, gradientDrawable1);
        this.H = stateListDrawable0;
        Drawable drawable0 = resources0.getDrawable(0x7F0801FF);  // drawable:appinvite_fastscroll_track_material
        this.I = drawable0;
        arr_v[1] = 0x7F0801FE;  // drawable:appinvite_fastscroll_label_right_material
        arr_v[0] = 0x7F0801FD;  // drawable:appinvite_fastscroll_label_left_material
        this.U = 2;
        ColorStateList colorStateList0 = ColorStateList.valueOf(resources0.getColor(0x1060001));
        this.G = colorStateList0;
        imageView0.setImageDrawable(drawable0);
        int v6 = drawable0 == null ? 0 : Math.max(0, drawable0.getIntrinsicWidth());
        imageView1.setImageDrawable(stateListDrawable0);
        imageView1.setMinimumWidth(v);
        imageView1.setMinimumHeight(v1);
        this.a = Math.max(Math.max(v6, stateListDrawable0.getIntrinsicWidth()), v);
        view0.setMinimumWidth(v2);
        view0.setMinimumHeight(v3);
        if(colorStateList0 != null) {
            textView0.setTextColor(colorStateList0);
            textView1.setTextColor(colorStateList0);
        }
        if((f > 0.0f)) {
            textView0.setTextSize(0, f);
            textView1.setTextSize(0, f);
        }
        int v7 = Math.max(0, v3);
        textView0.setMinimumWidth(v7);
        textView0.setMinimumHeight(v7);
        textView0.setIncludeFontPadding(false);
        textView1.setMinimumWidth(v7);
        textView1.setMinimumHeight(v7);
        textView1.setIncludeFontPadding(false);
        this.z();
        ViewGroupOverlay viewGroupOverlay0 = viewGroup0.getOverlay();
        viewGroupOverlay0.add(imageView0);
        viewGroupOverlay0.add(imageView1);
        viewGroupOverlay0.add(view0);
        viewGroupOverlay0.add(textView0);
        viewGroupOverlay0.add(textView1);
        this.v();
        this.i(this.h, this.g);
        this.e(aceu0.getVerticalScrollbarPosition());
        this.c();
    }

    private final void A(float f) {
        int v9;
        aceu aceu0 = this.i;
        int v = aceu0.m.b();
        Object[] arr_object = this.O;
        int v1 = 0;
        int v2 = arr_object == null ? 0 : arr_object.length;
        tk tk0 = aceu0.m;
        int v3 = -1;
        if((tk0 instanceof acdc)) {
            ((acdc)tk0).Z(aceu0);
            int v4 = arr_object == null ? 0 : arr_object.length - 1;
            float f1 = ((float)((acdc)tk0).X(((acdc)tk0).b() - 1)) * f;
            while(v1 < v) {
                if(((int)f1) <= ((acdc)tk0).X(v1)) {
                    aceu0.al(v1);
                    v3 = this.R.getSectionForPosition(v1);
                    goto label_56;
                }
                ++v1;
            }
            v3 = v4;
        }
        else if(arr_object != null && v2 > 1) {
            int v5 = acez.b(((int)(f * ((float)v2))), v2 - 1);
            int v6 = this.R.getPositionForSection(v5);
            int v7 = v5 + 1;
            int v8 = v5 >= v2 - 1 ? v : this.R.getPositionForSection(v7);
            if(v8 == v6) {
                v9 = v5;
                int v10 = v6;
                while(v9 > 0) {
                    --v9;
                    v10 = this.R.getPositionForSection(v9);
                    if(v10 != v6) {
                        v1 = v9;
                        goto label_39;
                    }
                    if(v9 != 0) {
                        continue;
                    }
                    v9 = v5;
                    goto label_39;
                }
                v1 = v5;
                v9 = v1;
            label_39:
                v6 = v10;
            }
            else {
                v1 = v5;
                v9 = v1;
            }
            for(int v11 = v5 + 2; v11 < v2 && this.R.getPositionForSection(v11) == v8; ++v11) {
                ++v7;
            }
            float f2 = ((float)v9) / ((float)v2);
            float f3 = f - f2;
            if(v9 != v5 || f3 >= (v == 0 ? 3.402823E+38f : 0.125f / ((float)v))) {
                v6 += (int)(((float)(v8 - v6)) * f3 / (((float)v7) / ((float)v2) - f2));
            }
            aceu0.al(acez.b(v6, v - 1));
            v3 = v1;
        }
        else {
            aceu0.al(acez.b(((int)(f * ((float)v))), v - 1));
        }
    label_56:
        if(this.L != v3) {
            this.L = v3;
            boolean z = this.E(v3);
            boolean z1 = this.Q;
            if(!z1 && z) {
                this.B();
                return;
            }
            if(z1 && !z) {
                this.C();
            }
        }
    }

    private final void B() {
        AnimatorSet animatorSet0 = this.J;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
        Animator animator0 = aces.q(View.ALPHA, 1.0f, new View[]{this.v, this.w, this.x}).setDuration(150L);
        Animator animator1 = aces.q(View.TRANSLATION_X, 0.0f, new View[]{this.v, this.w}).setDuration(150L);
        AnimatorSet animatorSet1 = new AnimatorSet();
        this.J = animatorSet1;
        animatorSet1.playTogether(new Animator[]{animator0, animator1});
        this.J.start();
        this.Q = true;
    }

    private final void C() {
        AnimatorSet animatorSet0 = this.J;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
        Animator animator0 = aces.q(View.ALPHA, 1.0f, new View[]{this.v, this.w}).setDuration(150L);
        Animator animator1 = aces.q(View.ALPHA, 0.0f, new View[]{this.x, this.t, this.u}).setDuration(300L);
        Animator animator2 = aces.q(View.TRANSLATION_X, 0.0f, new View[]{this.v, this.w}).setDuration(150L);
        AnimatorSet animatorSet1 = new AnimatorSet();
        this.J = animatorSet1;
        animatorSet1.playTogether(new Animator[]{animator0, animator1, animator2});
        this.J.start();
        this.Q = false;
    }

    private final boolean D(float f, float f1) {
        ImageView imageView0 = this.v;
        float f2 = imageView0.getTranslationX();
        float f3 = ((float)imageView0.getLeft()) + f2;
        float f4 = ((float)imageView0.getRight()) + f2;
        float f5 = (float)this.z;
        float f6 = f5 - (f4 - f3);
        float f7 = 0.0f;
        boolean z = this.S;
        if(Float.compare(f6, 0.0f) <= 0) {
            f6 = 0.0f;
        }
        if(z) {
            if(f < ((float)imageView0.getLeft()) - f6) {
                return false;
            }
        }
        else if(f > ((float)imageView0.getRight()) + f6) {
            return false;
        }
        if(this.I == null) {
            float f8 = imageView0.getTranslationY();
            float f9 = ((float)imageView0.getTop()) + f8;
            float f10 = ((float)imageView0.getBottom()) + f8;
            float f11 = f5 - (f10 - f9);
            if((f11 > 0.0f)) {
                f7 = f11 / 2.0f;
            }
            return f1 >= f9 - f7 ? f1 <= f10 + f7 : false;
        }
        return true;
    }

    private final boolean E(int v) {
        TextView textView1;
        TextView textView0;
        Object[] arr_object = this.O;
        CharSequence charSequence0 = null;
        if(arr_object != null && v >= 0 && v < arr_object.length) {
            Object object0 = arr_object[v];
            if(object0 != null) {
                charSequence0 = object0.toString();
            }
        }
        Rect rect0 = this.q;
        View view0 = this.x;
        if(this.b) {
            textView0 = this.t;
            textView1 = this.u;
        }
        else {
            textView0 = this.u;
            textView1 = this.t;
        }
        textView1.setText(charSequence0);
        this.w(textView1, rect0);
        this.s(textView1, rect0);
        AnimatorSet animatorSet0 = this.K;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
        Animator animator0 = aces.o(textView1, 1.0f).setDuration(50L);
        Animator animator1 = aces.o(textView0, 0.0f).setDuration(50L);
        animator1.addListener(this.ad);
        rect0.left -= view0.getPaddingLeft();
        rect0.top -= view0.getPaddingTop();
        rect0.right += view0.getPaddingRight();
        rect0.bottom += view0.getPaddingBottom();
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofPropertyValuesHolder(view0, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(aces.m, new int[]{rect0.left}), PropertyValuesHolder.ofInt(aces.n, new int[]{rect0.top}), PropertyValuesHolder.ofInt(aces.o, new int[]{rect0.right}), PropertyValuesHolder.ofInt(aces.p, new int[]{rect0.bottom})});
        objectAnimator0.setDuration(100L);
        AnimatorSet animatorSet1 = new AnimatorSet();
        this.K = animatorSet1;
        AnimatorSet.Builder animatorSet$Builder0 = animatorSet1.play(animator1).with(animator0);
        animatorSet$Builder0.with(objectAnimator0);
        int v1 = view0.getWidth() - view0.getPaddingLeft() - view0.getPaddingRight();
        int v2 = textView1.getWidth();
        if(v2 > v1) {
            textView1.setScaleX(((float)v1) / ((float)v2));
            animatorSet$Builder0.with(aces.p(textView1, 1.0f).setDuration(100L));
        }
        else {
            textView1.setScaleX(1.0f);
        }
        int v3 = textView0.getWidth();
        if(v3 > v2) {
            animatorSet$Builder0.with(aces.p(textView0, ((float)v2) / ((float)v3)).setDuration(100L));
        }
        this.K.start();
        return !TextUtils.isEmpty(charSequence0);
    }

    public final float a(int v, int v1, int v2) {
        int v9;
        int v8;
        aceu aceu0 = this.i;
        tk tk0 = aceu0.m;
        float f = 0.0f;
        if((tk0 instanceof acdc)) {
            if(v2 > 0 && v > 0) {
                ((acdc)tk0).Z(aceu0);
                return acez.a(((float)((acdc)tk0).X(v - 1)) / ((float)(((acdc)tk0).X(v2 - 1) - aceu0.getHeight())), 0.0f, 1.0f);
            }
            return 0.0f;
        }
        if(this.R == null || this.e == null) {
            this.v();
        }
        if(this.R != null && (this.O != null && this.O.length > 0 && this.V)) {
            if(v < 0) {
                return 0.0f;
            }
            View view0 = aceu0.getChildAt(0);
            float f1 = view0 == null || view0.getHeight() == 0 ? 0.0f : ((float)(aceu0.getPaddingTop() - view0.getTop())) / ((float)view0.getHeight());
            int v3 = this.R.getSectionForPosition(v);
            int v4 = this.R.getPositionForSection(v3);
            int v5 = this.O.length;
            int v6 = v3 >= v5 - 1 ? v2 - v4 : (v3 + 1 >= v5 ? v2 - 1 : this.R.getPositionForSection(v3 + 1)) - v4;
            if(v6 != 0) {
                f = (((float)v) + f1 - ((float)v4)) / ((float)v6);
            }
            float f2 = (((float)v3) + f) / ((float)v5);
            if(v > 0 && v + v1 == v2) {
                View view1 = aceu0.getChildAt(v1 - 1);
                int v7 = aceu0.getPaddingBottom();
                if(aceu0.n.bc()) {
                    v8 = view1.getHeight();
                    v9 = aceu0.getHeight() - v7 - view1.getTop();
                    return v9 <= 0 || v8 <= 0 ? f2 : f2 + (1.0f - f2) * (((float)v9) / ((float)v8));
                }
                v8 = view1.getHeight() + v7;
                v9 = aceu0.getHeight() - view1.getTop();
                return v9 <= 0 || v8 <= 0 ? f2 : f2 + (1.0f - f2) * (((float)v9) / ((float)v8));
            }
            return f2;
        }
        return ((float)v) / ((float)(v2 - v1));
    }

    public final void b() {
        this.e = null;
    }

    public final void c() {
        this.i.removeCallbacks(this.ac);
        this.i.postDelayed(this.ac, 1500L);
    }

    public final void d(int v) {
        this.Z = v;
        this.aa.setColor(v);
        GradientDrawable gradientDrawable0 = this.ab;
        if(gradientDrawable0 != null) {
            gradientDrawable0.setColor(this.Z);
        }
    }

    public final void e(int v) {
        boolean z = true;
        if(v == 0) {
            v = this.i.getLayoutDirection() == 1 ? 1 : 2;
        }
        if(this.M != v) {
            this.M = v;
            if(v == 1) {
                z = false;
            }
            this.S = z;
            View view0 = this.x;
            view0.setBackgroundResource(this.y[z]);
            Drawable drawable0 = view0.getBackground();
            if(drawable0 != null) {
                drawable0.getPadding(this.q);
                this.q.offset(this.A, this.A);
                view0.setPadding(this.q.left, this.q.top, this.q.right, this.q.bottom);
                if((drawable0 instanceof GradientDrawable)) {
                    this.ab = (GradientDrawable)drawable0;
                    ((GradientDrawable)drawable0).setColor(this.Z);
                }
            }
            this.h();
        }
    }

    public final void f(int v) {
        this.i.removeCallbacks(this.ac);
        if(v == this.d) {
            return;
        }
        switch(v) {
            case 0: {
                AnimatorSet animatorSet0 = this.J;
                if(animatorSet0 != null) {
                    animatorSet0.cancel();
                }
                Animator animator0 = aces.q(View.ALPHA, 0.0f, new View[]{this.v, this.w, this.x, this.t, this.u}).setDuration(300L);
                int v1 = this.S ? this.v.getWidth() : -this.v.getWidth();
                Animator animator1 = aces.q(View.TRANSLATION_X, ((float)v1), new View[]{this.v, this.w}).setDuration(300L);
                AnimatorSet animatorSet1 = new AnimatorSet();
                this.J = animatorSet1;
                animatorSet1.playTogether(new Animator[]{animator0, animator1});
                this.J.start();
                this.Q = false;
                break;
            }
            case 1: {
                this.C();
                break;
            }
            default: {
                if(this.E(this.L)) {
                    this.B();
                }
                else {
                    this.C();
                }
            }
        }
        this.d = v;
        this.z();
    }

    public final void g(float f) {
        int v = this.s.top;
        int v1 = this.s.bottom;
        float f1 = (float)this.w.getTop();
        float f2 = f * (((float)this.w.getBottom()) - f1) + f1;
        float f3 = f2 - ((float)(this.v.getHeight() / 2));
        this.v.setTranslationY(f3);
        View view0 = this.x;
        float f4 = (float)view0.getHeight();
        switch(this.U) {
            case 1: {
                break;
            }
            case 2: {
                f2 -= f4 / 2.0f;
                break;
            }
            default: {
                f2 = 0.0f;
            }
        }
        float f5 = acez.a(f2, ((float)v) + f4 / 2.0f, ((float)v1) - f4 / 2.0f) - f4 / 2.0f;
        view0.setTranslationY(f5);
        this.t.setTranslationY(f5);
        this.u.setTranslationY(f5);
    }

    public final void h() {
        if(this.P) {
            return;
        }
        this.P = true;
        aceu aceu0 = this.i;
        Rect rect0 = this.s;
        rect0.left = 0;
        rect0.top = 0;
        rect0.right = aceu0.getWidth();
        rect0.bottom = aceu0.getHeight();
        int v = this.f;
        switch(v) {
            case 0: {
                v = 0;
                goto label_13;
            }
            case 0x1000000: {
            label_13:
                rect0.left += aceu0.getPaddingLeft();
                rect0.top += aceu0.getPaddingTop();
                rect0.right -= aceu0.getPaddingRight();
                rect0.bottom -= aceu0.getPaddingBottom();
                if(v == 0x1000000) {
                    int v1 = this.a;
                    if(this.M == 2) {
                        rect0.right += v1;
                    }
                    else {
                        rect0.left -= v1;
                    }
                }
            }
        }
        Rect rect1 = this.q;
        this.x(this.v, null, null, rect1);
        this.s(this.v, rect1);
        this.w.measure(View.MeasureSpec.makeMeasureSpec(rect0.width(), 0x80000000), 0);
        int v2 = this.w.getMeasuredWidth();
        int v3 = this.v == null ? 0 : this.v.getHeight() / 2;
        int v4 = this.v.getLeft() + (this.v.getWidth() - v2) / 2;
        this.w.layout(v4, rect0.top + v3, v2 + v4, rect0.bottom - v3);
        this.w(this.t, rect1);
        this.s(this.t, rect1);
        this.w(this.u, rect1);
        this.s(this.u, rect1);
        View view0 = this.x;
        if(view0 != null) {
            rect1.left -= view0.getPaddingLeft();
            rect1.top -= view0.getPaddingTop();
            rect1.right += view0.getPaddingRight();
            rect1.bottom += view0.getPaddingBottom();
            this.s(view0, rect1);
        }
        this.P = false;
    }

    public final void i(int v, int v1) {
        aceu aceu0 = this.i;
        boolean z = true;
        if((aceu0.m instanceof acdc) && aceu0.getHeight() > 0) {
            acdc acdc0 = (acdc)aceu0.m;
            acdc0.aa(aceu0);
            if((v1 <= 0 ? 0 : acdc0.X(v1 - 1)) / aceu0.getHeight() < 4) {
                z = false;
            }
        }
        else if(v >= v1) {
            z = false;
        }
        if(this.N != z) {
            this.N = z;
            this.y(false);
        }
    }

    public final boolean j() {
        return this.T && this.N;
    }

    public final boolean k(MotionEvent motionEvent0) {
        if(this.j()) {
            switch(motionEvent0.getActionMasked()) {
                case 0: {
                    if(this.D(motionEvent0.getX(), motionEvent0.getY())) {
                        for(ViewParent viewParent0 = this.i.getParent(); (viewParent0 instanceof ViewGroup); viewParent0 = viewParent0.getParent()) {
                            if(((ViewGroup)viewParent0).shouldDelayChildPressedState()) {
                                this.t();
                                return true;
                            }
                        }
                        this.W = motionEvent0.getY();
                        this.X = SystemClock.uptimeMillis() + aces.l;
                        return false;
                    }
                    break;
                }
                case 2: {
                    if(!this.D(motionEvent0.getX(), motionEvent0.getY())) {
                        this.u();
                        return false;
                    }
                    if(this.X >= 0L && this.X <= SystemClock.uptimeMillis()) {
                        this.t();
                        this.A(this.n(this.W));
                        return this.l(motionEvent0);
                    }
                    break;
                }
                case 1: 
                case 3: {
                    this.u();
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean l(MotionEvent motionEvent0) {
        if(this.j()) {
            int v = motionEvent0.getActionMasked();
            switch(v) {
                case 1: {
                    if(this.X >= 0L) {
                        this.t();
                        float f = this.n(motionEvent0.getY());
                        this.g(f);
                        this.A(f);
                    }
                    if(this.d == 2) {
                        aceu aceu0 = this.i;
                        if(aceu0 != null) {
                            aceu0.requestDisallowInterceptTouchEvent(false);
                            aceu0.a(0);
                        }
                        this.f(1);
                        this.c();
                        return true;
                    }
                    break;
                }
                case 2: {
                    if(this.X >= 0L && (Math.abs(motionEvent0.getY() - this.W) > ((float)this.Y))) {
                        this.t();
                    }
                    if(this.d == 2) {
                        float f1 = this.n(motionEvent0.getY());
                        this.g(f1);
                        this.A(f1);
                        return true;
                    }
                    break;
                }
                default: {
                    if(v == 3) {
                        this.u();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void m() {
        if(!this.T) {
            this.T = true;
            this.y(true);
        }
    }

    private final float n(float f) {
        float f1 = (float)this.w.getTop();
        float f2 = ((float)this.w.getBottom()) - f1;
        return f2 <= 0.0f ? 0.0f : acez.a((f - f1) / f2, 0.0f, 1.0f);
    }

    private static Animator o(View view0, float f) {
        return ObjectAnimator.ofFloat(view0, View.ALPHA, new float[]{f});
    }

    private static Animator p(View view0, float f) {
        return ObjectAnimator.ofFloat(view0, View.SCALE_X, new float[]{f});
    }

    private static Animator q(Property property0, float f, View[] arr_view) {
        Animator animator0 = new AnimatorSet();
        int v = arr_view.length - 1;
        AnimatorSet.Builder animatorSet$Builder0 = null;
        while(v >= 0) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(arr_view[v], property0, new float[]{f});
            if(animatorSet$Builder0 == null) {
                animatorSet$Builder0 = ((AnimatorSet)animator0).play(objectAnimator0);
            }
            else {
                animatorSet$Builder0.with(objectAnimator0);
            }
            --v;
        }
        return animator0;
    }

    private final TextView r(Context context0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-2, -2);
        TextView textView0 = new TextView(context0);
        textView0.setLayoutParams(viewGroup$LayoutParams0);
        textView0.setSingleLine(true);
        textView0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView0.setGravity(17);
        textView0.setAlpha(0.0f);
        textView0.setLayoutDirection(this.i.getLayoutDirection());
        return textView0;
    }

    private final void s(View view0, Rect rect0) {
        view0.layout(rect0.left, rect0.top, rect0.right, rect0.bottom);
        view0.setPivotX((this.S ? ((float)(rect0.right - rect0.left)) : 0.0f));
    }

    private final void t() {
        this.X = -1L;
        this.f(2);
        if(this.e == null && this.i != null) {
            this.v();
        }
        aceu aceu0 = this.i;
        if(aceu0 != null) {
            aceu0.requestDisallowInterceptTouchEvent(true);
            aceu0.a(1);
        }
        MotionEvent motionEvent0 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        aceu0.onTouchEvent(motionEvent0);
        motionEvent0.recycle();
    }

    private final void u() {
        this.X = -1L;
    }

    private final void v() {
        this.R = null;
        tk tk0 = this.i.m;
        if((tk0 instanceof SectionIndexer)) {
            this.e = tk0;
            this.R = (SectionIndexer)tk0;
            this.O = ((SectionIndexer)tk0).getSections();
            return;
        }
        this.e = tk0;
        this.O = null;
    }

    private final void w(View view0, Rect rect0) {
        Rect rect1 = this.r;
        rect1.left = this.x.getPaddingLeft();
        rect1.top = this.x.getPaddingTop();
        rect1.right = this.x.getPaddingRight();
        rect1.bottom = this.x.getPaddingBottom();
        if(this.U == 0) {
            int v = rect1.left;
            int v1 = rect1.top;
            int v2 = rect1.right;
            int v3 = this.s.width();
            view0.measure(View.MeasureSpec.makeMeasureSpec(v3 - v - v2, 0x80000000), 0);
            int v4 = this.s.height();
            int v5 = view0.getMeasuredWidth();
            int v6 = v4 / 10 + v1 + this.s.top;
            int v7 = view0.getMeasuredHeight() + v6;
            int v8 = (v3 - v5) / 2 + this.s.left;
            rect0.set(v8, v6, v5 + v8, v7);
            return;
        }
        this.x(view0, this.v, rect1, rect0);
    }

    private final void x(View view0, View view1, Rect rect0, Rect rect1) {
        int v7;
        int v6;
        int v2;
        int v1;
        int v;
        if(rect0 == null) {
            v = 0;
            v1 = 0;
            v2 = 0;
        }
        else {
            v1 = rect0.left;
            v2 = rect0.top;
            v = rect0.right;
        }
        Rect rect2 = this.s;
        int v3 = rect2.width();
        if(view1 != null) {
            v3 = this.S ? view1.getLeft() : v3 - view1.getRight();
        }
        int v4 = v3 - v1 - v;
        view0.measure(View.MeasureSpec.makeMeasureSpec(v4, 0x80000000), 0);
        int v5 = Math.min(v4, view0.getMeasuredWidth());
        if(this.S) {
            v6 = (view1 == null ? rect2.right : view1.getLeft()) - v;
            v7 = v6 - v5;
        }
        else {
            v7 = (view1 == null ? rect2.left : view1.getRight()) + v1;
            v6 = v7 + v5;
        }
        rect1.set(v7, v2, v6, view0.getMeasuredHeight() + v2);
    }

    private final void y(boolean z) {
        if(this.j()) {
            switch(this.d) {
                case 1: {
                    this.c();
                    return;
                }
                case 2: {
                    break;
                }
                default: {
                    if(z) {
                        this.f(1);
                        this.c();
                        return;
                    }
                }
            }
            return;
        }
        this.f(0);
    }

    private final void z() {
        boolean z = this.d == 2;
        this.v.setPressed(z);
        this.w.setPressed(z);
    }
}

