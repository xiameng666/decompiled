package com.google.android.libraries.onegoogle.accountmanagement;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import fnfm;
import fngf;
import fnia;
import fnib;
import fnic;
import fnid;
import gfsx;
import gftb;
import kfe;

public final class SelectedAccountView extends ConstraintLayout implements fnic {
    public final AccountParticleDisc h;
    public final ImageView i;
    final ObjectAnimator j;
    private static final Property k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final ImageView o;
    private final FrameLayout p;
    private final String q;
    private final String r;
    private fnib s;
    private boolean t;
    private fnid u;
    private String v;
    private String w;
    private fnia x;

    static {
        SelectedAccountView.k = Property.of(ImageView.class, Float.class, "rotation");
    }

    public SelectedAccountView(Context context0) {
        this(context0, null);
    }

    public SelectedAccountView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public SelectedAccountView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.u = fnid.a().a();
        LayoutInflater.from(context0).inflate(0x7F0E0923, this);  // layout:selected_account_view
        this.c(this.getResources().getDimensionPixelSize(0x7F0700A3));  // dimen:account_menu_header_signed_in_layout_min_height
        this.l = (TextView)this.findViewById(0x7F0B1AFE);  // id:og_primary_account_information
        this.m = (TextView)this.findViewById(0x7F0B1B00);  // id:og_secondary_account_information
        this.n = (TextView)this.findViewById(0x7F0B1014);  // id:counter
        this.h = (AccountParticleDisc)this.findViewById(0x7F0B0A5D);  // id:account_avatar
        ImageView imageView0 = (ImageView)this.findViewById(0x7F0B1ADD);  // id:og_collapsed_chevron
        this.o = imageView0;
        this.j = ObjectAnimator.ofFloat(imageView0, SelectedAccountView.k, new float[]{360.0f, 180.0f});
        this.i = (ImageView)this.findViewById(0x7F0B1AEA);  // id:og_custom_icon
        this.p = (FrameLayout)this.findViewById(0x7F0B1B16);  // id:og_trailing_drawable_container
        this.q = "Account list collapsed.";
        this.r = "Account list expanded.";
    }

    @Override  // fnic
    public final TextView g() {
        return this.n;
    }

    @Override  // fnic
    public final TextView h() {
        return this.l;
    }

    @Override  // fnic
    public final TextView i() {
        return this.m;
    }

    @Override  // fnic
    public final AccountParticleDisc j() {
        return this.h;
    }

    public final void k(boolean z) {
        if(z == this.t) {
            return;
        }
        this.t = z;
        this.r(z);
        if(z) {
            this.j.start();
            return;
        }
        this.j.reverse();
    }

    public final void l(fngf fngf0, fnfm fnfm0, fnid fnid0, fnia fnia0, String s, String s1) {
        this.u = fnid0;
        this.q();
        this.s = new fnib(this, fnfm0, fnid0);
        this.h.h(fngf0, fnfm0);
        this.v = s;
        this.w = s1;
        this.x = fnia0;
        this.t = false;
        this.o.setRotation(360.0f);
        this.r(false);
    }

    public final void m(Object object0) {
        gftb.r(this.s != null, "Initialize must be called before setting an account.");
        this.s.a(object0, this.x);
    }

    public final void n(long v) {
        this.j.setDuration(v);
    }

    public final void o(Interpolator interpolator0) {
        this.j.setInterpolator(interpolator0);
    }

    public final void p(int v) {
        int v1 = 0;
        this.i.setVisibility((v == 2 ? 0 : 8));
        this.o.setVisibility((v == 1 ? 0 : 8));
        FrameLayout frameLayout0 = this.p;
        if(v == 3) {
            v1 = 8;
        }
        frameLayout0.setVisibility(v1);
        this.q();
    }

    private final void q() {
        gfsx gfsx0 = this.u.a;
        if(gfsx0.i()) {
            gfsx0.d();
        }
    }

    private final void r(boolean z) {
        this.o.setImportantForAccessibility(1);
        this.o.setContentDescription((z ? this.v : this.w));
        kfe.l(this, (z ? this.r : this.q));
    }
}

