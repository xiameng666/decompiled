package com.google.android.setupdesign;

import a;
import android.animation.Animator.AnimatorListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.PersistableBundle;
import android.provider.Settings.Global;
import android.provider.Settings.SettingNotFoundException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.setupdesign.view.IllustrationVideoView;
import gaea;
import gaec;
import gaed;
import gaee;
import gaff;
import gafq;
import gafs;
import gagl;
import gagm;
import gago;
import gaho;
import gaji;
import gajj;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GlifLoadingLayout extends GlifLayout {
    public static final gafs a;
    View b;
    String c;
    gagm d;
    int e;
    public Runnable f;
    public boolean q;
    public boolean r;
    public List s;
    private Animator.AnimatorListener t;
    private boolean u;

    static {
        GlifLoadingLayout.a = new gafs(GlifLoadingLayout.class);
    }

    public GlifLoadingLayout(Context context0) {
        this(context0, 0, 0);
    }

    public GlifLoadingLayout(Context context0, int v) {
        this(context0, v, 0);
    }

    public GlifLoadingLayout(Context context0, int v, int v1) {
        super(context0, v, v1);
        this.c = "default";
        this.d = gagm.a;
        this.e = 0;
        this.s = new ArrayList();
        this.u = false;
        this.X(null, 0x7F040C1D);  // attr:sudLayoutTheme
    }

    public GlifLoadingLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c = "default";
        this.d = gagm.a;
        this.e = 0;
        this.s = new ArrayList();
        this.u = false;
        this.X(attributeSet0, 0x7F040C1D);  // attr:sudLayoutTheme
    }

    public GlifLoadingLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = "default";
        this.d = gagm.a;
        this.e = 0;
        this.s = new ArrayList();
        this.u = false;
        this.X(attributeSet0, v);
    }

    private void X(AttributeSet attributeSet0, int v) {
        gaff gaff0 = new gaff(this, attributeSet0, v);
        this.v(gaff.class, gaff0);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, gaho.a, v, 0);
        this.e = typedArray0.getResourceId(1, 0);
        String s = typedArray0.getString(0);
        typedArray0.recycle();
        if(this.e == 0) {
            if(s != null) {
                this.i(s);
            }
            this.c();
        }
        else {
            this.c();
            this.m(0).setVisibility(0);
        }
        View view0 = this.r(0x7F0B216F);  // id:sud_layout_loading_content
        if(view0 != null) {
            if(this.gU()) {
                gaji.a(view0);
            }
            this.P(view0);
        }
        View view1 = this.r(0x7F0B2147);  // id:sud_header_scroll_view
        View view2 = this.r(0x7F0B2163);  // id:sud_landscape_content_area
        if(view1 != null) {
            gaec gaec0 = gaec.h(this.getContext());
            gaea gaea0 = gaea.bz;
            if(gaec0.w(gaea0) && view2 == null) {
                view1.getLayoutParams().height = (int)gaec.h(this.getContext()).a(this.getContext(), gaea0);
            }
        }
        this.Q();
        this.q = false;
        this.r = true;
        LottieAnimationView lottieAnimationView0 = this.d();
        if(lottieAnimationView0 != null) {
            gagl gagl0 = new gagl(this);
            this.t = gagl0;
            lottieAnimationView0.b(gagl0);
        }
        this.F();
    }

    private final void Y(int v) {
        View view0 = this.findViewById(0x7F0B2174);  // id:sud_layout_progress_illustration
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    private final void Z(int v) {
        View view0 = this.findViewById(0x7F0B2170);  // id:sud_layout_lottie_illustration
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    private final void aa() {
        LottieAnimationView lottieAnimationView0 = (LottieAnimationView)this.findViewById(0x7F0B217D);  // id:sud_lottie_view
        if(lottieAnimationView0 == null) {
            GlifLoadingLayout.a.d("Lottie view not found, skip set resource. Wait for layout inflated.");
            return;
        }
        if(this.e != 0) {
            try {
                String s = this.getResources().getResourceName(this.e);
                GlifLoadingLayout.a.a("setCustom Lottie resource=" + s);
            }
            catch(Exception unused_ex) {
                GlifLoadingLayout.a.a("setCustom Lottie resource 0x" + Integer.toHexString(this.e));
            }
            lottieAnimationView0.x(this.getResources().openRawResource(this.e));
            lottieAnimationView0.i();
            return;
        }
        gaed gaed0 = gaec.h(this.getContext()).i(this.getContext(), this.d.g);
        if(gaed0 != null) {
            InputStream inputStream0 = gaed0.d.openRawResource(gaed0.c);
            try {
                int v = inputStream0.available();
                GlifLoadingLayout.a.a("setAnimation " + gaed0.b + " length=" + v);
            }
            catch(IOException unused_ex) {
                GlifLoadingLayout.a.d("IOException while length of " + gaed0.b);
            }
            lottieAnimationView0.x(inputStream0);
            lottieAnimationView0.i();
            this.Z(0);
            this.Y(8);
            gajj.a().b(this.getContext(), this.d(), (gaee.a(this.getResources().getConfiguration()) ? this.d.i : this.d.h));
            return;
        }
        gafs gafs0 = GlifLoadingLayout.a;
        gafs0.d("Can not find the resource entry for " + this.d.g.bG);
        this.Z(8);
        this.Y(0);
        if(this.findViewById(0x7F0B2174) == null) {  // id:sud_layout_progress_illustration
            ViewStub viewStub0 = (ViewStub)this.r(0x7F0B217B);  // id:sud_loading_layout_illustration_stub
            if(viewStub0 != null) {
                View view0 = viewStub0.inflate();
                this.b = view0;
                if((view0 instanceof LinearLayout)) {
                    this.ab(((LinearLayout)view0));
                }
                if(this.findViewById(0x7F0B2174) == null) {  // id:sud_layout_progress_illustration
                    gafs0.a("Illustration stub not inflated, skip set resource");
                    return;
                }
                IllustrationVideoView illustrationVideoView0 = (IllustrationVideoView)this.r(0x7F0B2182);  // id:sud_progress_illustration
                ProgressBar progressBar0 = (ProgressBar)this.r(0x7F0B2181);  // id:sud_progress_bar
                gaed gaed1 = gaec.h(this.getContext()).i(this.getContext(), this.d.f);
                if(gaed1 != null) {
                    progressBar0.setVisibility(8);
                    illustrationVideoView0.setVisibility(0);
                    illustrationVideoView0.c(gaed1.c, gaed1.a);
                    return;
                }
                progressBar0.setVisibility(0);
                illustrationVideoView0.setVisibility(8);
            }
        }
    }

    private final void ab(LinearLayout linearLayout0) {
        int v = linearLayout0.getPaddingTop();
        int v1 = linearLayout0.getPaddingLeft();
        int v2 = linearLayout0.getPaddingRight();
        int v3 = linearLayout0.getPaddingBottom();
        gaec gaec0 = gaec.h(this.getContext());
        gaea gaea0 = gaea.bv;
        if(gaec0.w(gaea0)) {
            float f = gaec.h(this.getContext()).a(this.getContext(), gaea0);
            if((f >= 0.0f)) {
                v = (int)f;
            }
        }
        gaec gaec1 = gaec.h(this.getContext());
        gaea gaea1 = gaea.bw;
        if(gaec1.w(gaea1)) {
            float f1 = gaec.h(this.getContext()).a(this.getContext(), gaea1);
            if((f1 >= 0.0f)) {
                v1 = (int)f1;
            }
        }
        gaec gaec2 = gaec.h(this.getContext());
        gaea gaea2 = gaea.bx;
        if(gaec2.w(gaea2)) {
            float f2 = gaec.h(this.getContext()).a(this.getContext(), gaea2);
            if((f2 >= 0.0f)) {
                v2 = (int)f2;
            }
        }
        gaec gaec3 = gaec.h(this.getContext());
        gaea gaea3 = gaea.by;
        if(gaec3.w(gaea3)) {
            float f3 = gaec.h(this.getContext()).a(this.getContext(), gaea3);
            if((f3 >= 0.0f)) {
                v3 = (int)f3;
                gaff gaff0 = (gaff)this.t(gaff.class);
                if(gaff0 != null) {
                    LinearLayout linearLayout1 = gaff0.j;
                    if(linearLayout1 != null) {
                        linearLayout1.measure(View.MeasureSpec.makeMeasureSpec(linearLayout1.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(linearLayout1.getMeasuredHeight(), 0x40000000));
                        v3 -= (int)Math.min(f3, linearLayout1.getMeasuredHeight());
                    }
                }
            }
        }
        linearLayout0.setPadding(v1, v, v2, v3);
    }

    private final void c() {
        if(this.findViewById(0x7F0B2170) == null) {  // id:sud_layout_lottie_illustration
            ViewStub viewStub0 = (ViewStub)this.r(0x7F0B217C);  // id:sud_loading_layout_lottie_stub
            if(viewStub0 != null) {
                View view0 = viewStub0.inflate();
                this.b = view0;
                if((view0 instanceof LinearLayout)) {
                    this.ab(((LinearLayout)view0));
                }
                this.aa();
            }
        }
    }

    public final LottieAnimationView d() {
        return (LottieAnimationView)this.findViewById(0x7F0B217D);  // id:sud_lottie_view
    }

    // Detected as a lambda impl.
    public final void e(Runnable runnable0) {
        synchronized(this) {
            if(this.r) {
                runnable0.run();
            }
            this.r = false;
        }
    }

    public final void g() {
        LottieAnimationView lottieAnimationView0 = this.d();
        if(lottieAnimationView0 != null) {
            lottieAnimationView0.t(-1);
            lottieAnimationView0.i();
        }
    }

    public final void h(Runnable runnable0) {
        this.q = true;
        this.f = runnable0;
        synchronized(this) {
            this.r = true;
            this.s.add(new gago(this, () -> synchronized(this) {
                if(this.r) {
                    runnable0.run();
                }
                this.r = false;
            }));
        }
    }

    public final void i(String s) {
        if(this.e != 0) {
            throw new IllegalStateException("custom illustration already applied, should not set illustration.");
        }
        if(!this.c.equals(s)) {
            this.c = s;
        }
        switch(s) {
            case "account": {
                this.d = gagm.b;
                break;
            }
            case "connection": {
                this.d = gagm.c;
                break;
            }
            case "final_hold": {
                this.d = gagm.e;
                break;
            }
            case "update": {
                this.d = gagm.d;
                break;
            }
            default: {
                this.d = gagm.a;
            }
        }
        this.aa();
    }

    public final boolean j() {
        try {
            return Settings.Global.getFloat(this.getContext().getContentResolver(), "animator_duration_scale") != 0.0f;
        }
        catch(Settings.SettingNotFoundException unused_ex) {
            return true;
        }
        return true;
    }

    public final boolean k() {
        View view0 = this.findViewById(0x7F0B2170);  // id:sud_layout_lottie_illustration
        return view0 != null && view0.getVisibility() == 0;
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected final View l(LayoutInflater layoutInflater0, int v) {
        Context context0 = this.getContext();
        if(v == 0) {
            if(gaec.h(context0).n(context0, gaea.bA, false)) {
                if(GlifLoadingLayout.V(context0)) {
                    return this.R() ? this.s(layoutInflater0, 0x7F160953, 0x7F0E0A30) : this.s(layoutInflater0, 0x7F160953, 0x7F0E0A5A);  // style:SudThemeGlif.Light
                }
                if(this.R()) {
                    return this.s(layoutInflater0, 0x7F160953, 0x7F0E0A31);  // style:SudThemeGlif.Light
                }
                return gafq.a(this.getContext()) ? this.s(layoutInflater0, 0x7F160953, 0x7F0E0A62) : this.s(layoutInflater0, 0x7F160953, 0x7F0E0A5D);  // style:SudThemeGlif.Light
            }
            if(GlifLoadingLayout.V(context0)) {
                return this.R() ? this.s(layoutInflater0, 0x7F160953, 0x7F0E0A3D) : this.s(layoutInflater0, 0x7F160953, 0x7F0E0A70);  // style:SudThemeGlif.Light
            }
            if(this.R()) {
                return this.s(layoutInflater0, 0x7F160953, 0x7F0E0A3E);  // style:SudThemeGlif.Light
            }
            if(gafq.a(this.getContext())) {
                return this.s(layoutInflater0, 0x7F160953, 0x7F0E0A7B);  // style:SudThemeGlif.Light
            }
            v = 0x7F0E0A75;  // layout:sud_glif_loading_template
        }
        return this.s(layoutInflater0, 0x7F160953, v);  // style:SudThemeGlif.Light
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected final ViewGroup m(int v) {
        if(v == 0) {
            v = 0x7F0B2167;  // id:sud_layout_content
        }
        return super.m(v);
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected final void onDetachedFromWindow() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("GlifLayoutType", "LoadingLayout");
        this.i = persistableBundle0;
        super.onDetachedFromWindow();
    }

    @Override  // android.widget.FrameLayout
    protected final void onMeasure(int v, int v1) {
        String s2;
        String s1;
        super.onMeasure(v, v1);
        if(!this.u) {
            this.u = true;
            Context context0 = this.getContext();
            Activity activity0 = this.h;
            String s = "";
            if(activity0 == null) {
                s2 = context0 == null ? "" : "com.google.android.gms";
                s1 = "";
            }
            else {
                Intent intent0 = activity0.getIntent();
                s1 = this.h.getClass().getName();
                if(intent0 != null) {
                    s = intent0.getAction();
                }
                s2 = "com.google.android.gms";
            }
            String s3 = a.au(s, s1, s2, ":", ":");
            GlifLoadingLayout.a.d("SUWLoadingScreen: " + Integer.toHexString(s3.hashCode()) + ":" + s3);
        }
        View view0 = this.b;
        if((view0 instanceof LinearLayout)) {
            this.ab(((LinearLayout)view0));
        }
    }
}

