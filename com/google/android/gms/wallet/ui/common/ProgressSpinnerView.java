package com.google.android.gms.wallet.ui.common;

import ProtoLiteMessage;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import clht;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import fbei;
import fbej;
import fbgn;
import fbgo;
import fbzq;
import fbzt;
import gdcb;
import gfgo;
import gfgr;
import gfhe;
import gfho;
import gfhp;
import pbk;
import pbq;

public class ProgressSpinnerView extends LinearLayout implements fbei, fbgo {
    View a;
    View b;
    ImageView c;
    InfoMessageView d;
    TextView e;
    gfhe f;
    public final Handler g;
    public pbq h;
    boolean i;
    gfhp j;
    private int k;
    private String l;

    public ProgressSpinnerView(Context context0) {
        super(context0);
        this.g = new clht();
    }

    public ProgressSpinnerView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = new clht();
    }

    public ProgressSpinnerView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.g = new clht();
    }

    @Override  // fbgo
    public final void H(Bundle bundle0) {
        bundle0.putBoolean("shouldShowProgressSpinner", this.U());
        bundle0.putBoolean("completedAnimationRunning", this.i);
        this.c();
    }

    @Override  // fbgo
    public final void L(gfhe gfhe0, boolean z) {
        this.f = gfhe0;
        this.c();
        if(gfhe0 != null && gdcb.S(this.getContext())) {
            int v = gfhe0.b;
            if((v & 4) != 0 && z) {
                this.e((gfhe0.e == null ? gfgo.a : gfhe0.e), new fbzq(this));
                this.i = true;
                this.h.start();
            }
            else if((v & 1) != 0) {
                this.e((gfhe0.c == null ? gfgo.a : gfhe0.c), new fbzt(this));
            }
            if((gfhe0.d == null ? gfhp.a : gfhe0.d).b.size() > 0) {
                this.j = gfhe0.d == null ? gfhp.a : gfhe0.d;
            }
        }
    }

    @Override  // fbgo
    public final void N(String s) {
        this.l = s;
        gdcb.E(this.e, s);
    }

    @Override  // fbgo
    public final void Q(boolean z) {
        int v = z ? 0 : 8;
        if(this.getVisibility() != v && !this.i) {
            fbgn.w(this, z, this.l);
            this.setVisibility(v);
        }
        if(this.h != null) {
            if(this.U() && !this.h.isRunning()) {
                this.h.start();
            }
            else if(!this.U() && this.h.isRunning()) {
                this.h.a();
                this.h.stop();
            }
        }
        if(this.j != null) {
            if(z) {
                this.k = 0;
                this.b();
                return;
            }
            this.d();
        }
    }

    @Override  // fbgo
    public final boolean U() {
        return this.getVisibility() == 0;
    }

    public final void a() {
        this.i = false;
        this.c();
        this.Q(false);
        gfhe gfhe0 = this.f;
        if(gfhe0 != null) {
            this.e((gfhe0.c == null ? gfgo.a : gfhe0.c), new fbzt(this));
        }
    }

    @Override  // fbei
    public final void aJ(Bundle bundle0) {
        if("handleTextAppearingAnimationEnd".equals(fbej.b(bundle0))) {
            gdcb.x(this.d, 0, 0, 4, fbej.a(this, "handleTextDisappearingAnimationEnd"));
            return;
        }
        if("handleTextDisappearingAnimationEnd".equals(fbej.b(bundle0))) {
            ++this.k;
            this.b();
        }
    }

    private final void b() {
        if(this.k < this.j.b.size()) {
            gfho gfho0 = (gfho)this.j.b.get(this.k);
            this.d.p((gfho0.b == null ? gfgr.a : gfho0.b));
            gdcb.O(this.d, true);
            if(gfho0.c > 0) {
                fbej fbej0 = fbej.a(this, "handleTextAppearingAnimationEnd");
                this.g.postDelayed(fbej0, ((long)gfho0.c));
            }
        }
    }

    private final void c() {
        this.g.removeCallbacksAndMessages(null);
        this.a.setVisibility(0);
        this.b.setVisibility(8);
        pbq pbq0 = this.h;
        if(pbq0 != null) {
            pbq0.a();
            if(this.h.isRunning()) {
                this.h.stop();
            }
            this.h = null;
        }
        this.d();
        this.j = null;
    }

    private final void d() {
        this.d.clearAnimation();
        if(this.d.animate() != null) {
            this.d.animate().setListener(null);
        }
        this.d.setVisibility(4);
    }

    private final void e(gfgo gfgo0, pbk pbk0) {
        if(gfgo0 != null && !((ProtoLiteMessage)gfgo0).equals(gfgo.a)) {
            this.a.setVisibility(8);
            this.b.setVisibility(0);
            this.c.setContentDescription(gfgo0.k);
            int v = gdcb.ah(this.getContext(), gfgo0.d);
            pbq pbq0 = pbq.c(this.getContext(), v);
            this.h = pbq0;
            this.c.setImageDrawable(pbq0);
            ImageWithCaptionView.n(this.getContext(), this.c, gfgo0, false);
            this.h.b(pbk0);
        }
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.setVisibility(8);
        this.a = this.findViewById(0x7F0B10C6);  // id:default_spinner
        this.b = this.findViewById(0x7F0B0BA5);  // id:animation_spinner
        this.c = (ImageView)this.findViewById(0x7F0B0BA6);  // id:animation_spinner_image
        this.d = (InfoMessageView)this.findViewById(0x7F0B1D4D);  // id:progress_text_animation
        this.e = (TextView)this.findViewById(0x7F0B1D4B);  // id:progress_spinner_caption
        if(gdcb.Y(this.getContext())) {
            this.a.setVisibility(8);
            this.a = ((ViewStub)this.findViewById(0x7F0B2467)).inflate();  // id:visdre_spinner
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(new int[]{0x1010031});
            int v = typedArray0.getResourceId(0, -1);
            typedArray0.recycle();
            if(v != -1) {
                this.setBackgroundColor(this.getResources().getColor(v));
            }
        }
    }

    @Override  // fbgo
    public final void x(Bundle bundle0) {
        this.Q(bundle0.getBoolean("shouldShowProgressSpinner", false));
        boolean z = bundle0.getBoolean("completedAnimationRunning");
        this.i = z;
        if(z) {
            this.a();
        }
    }
}

