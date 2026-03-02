package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import fnfm;
import fnfv;
import fnfx;
import fnfy;
import fnfz;
import fnga;
import fngc;
import fngd;
import fnge;
import fngf;
import fngw;
import fnhb;
import fnhc;
import fnhe;
import fnhj;
import fnhq;
import fnhr;
import fnhs;
import fnhu;
import fnhy;
import fnxf;
import fnxn;
import fodo;
import frbi;
import gfqx;
import gfsx;
import gftb;
import java.util.concurrent.CopyOnWriteArrayList;

public class AccountParticleDisc extends FrameLayout {
    public final AvatarView a;
    public final BadgeFrameLayout b;
    public final RingFrameLayout c;
    public final fnhs d;
    public fnhj e;
    public boolean f;
    public boolean g;
    public fngf h;
    public fnhe i;
    public Object j;
    public fnhc k;
    public fnfm l;
    private final boolean m;
    private final CopyOnWriteArrayList n;
    private final fnhb o;
    private final boolean p;
    private final int q;
    private final fnhu r;
    private fnhy s;
    private fodo t;
    private gfsx u;
    private gfsx v;

    public AccountParticleDisc(Context context0) {
        this(context0, null);
    }

    public AccountParticleDisc(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040928);  // attr:ogAccountParticleDiscStyle
    }

    public AccountParticleDisc(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        int v2;
        this.n = new CopyOnWriteArrayList();
        this.o = new fnfz(this);
        this.d = new fnhs(new fnga(this));
        this.u = gfqx.a;
        this.v = gfqx.a;
        LayoutInflater.from(context0).inflate(0x7F0E003A, this, true);  // layout:account_particle_disc
        AvatarView avatarView0 = (AvatarView)this.findViewById(0x7F0B1A88);  // id:og_apd_internal_image_view
        this.a = avatarView0;
        this.b = (BadgeFrameLayout)this.findViewById(0x7F0B0C87);  // id:badge_wrapper
        this.c = (RingFrameLayout)this.findViewById(0x7F0B1E8C);  // id:ring_wrapper
        this.r = new fnhu(this.getResources());
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, fnhq.a, v, 0x7F160556);  // style:OneGoogle.AccountParticleDisc.DayNight
        try {
            v2 = typedArray0.getDimensionPixelSize(5, 0x80000000);
            if(v2 == 0x80000000) {
                v2 = typedArray0.getDimensionPixelSize(4, 0x80000000);
            }
            this.m = typedArray0.getBoolean(0, true);
            this.g = typedArray0.getBoolean(1, false);
            this.p = typedArray0.getBoolean(3, false);
            this.q = typedArray0.getDimensionPixelSize(2, this.getResources().getDimensionPixelSize(0x7F070D2E));  // dimen:og_apd_default_disc_min_touch_target_size
            boolean z = typedArray0.getBoolean(6, true);
            Resources resources0 = avatarView0.getResources();
            int v3 = 0x7F060799;  // color:google_grey100
            avatarView0.b.setColor(resources0.getColor((z ? 0x7F0607A8 : 0x7F060799)));  // color:google_grey900
            avatarView0.b.setAlpha(30);
            Drawable drawable0 = avatarView0.c;
            Resources resources1 = avatarView0.getResources();
            if(!z) {
                v3 = 0x7F0607A4;  // color:google_grey800
            }
            fnxf.d(drawable0, resources1.getColor(v3));
            avatarView0.c = drawable0;
            Resources resources2 = avatarView0.getResources();
            avatarView0.a.setColor(resources2.getColor((z ? 0x7F060814 : 0x7F060D80)));  // color:google_white
        }
        finally {
            typedArray0.recycle();
        }
        this.n();
        if(v2 != 0x80000000) {
            this.p(v2);
        }
    }

    public final int a() {
        return this.a.d;
    }

    public final int b() {
        return this.v.i() ? this.r.b(this.a()) : this.a();
    }

    public static fngw c(fnhc fnhc0) {
        if(fnhc0 != null) {
            return fnhc0.a == null ? null : ((fngw)fnhc0.a.a.g());
        }
        return null;
    }

    public final String d() {
        return this.v.i() ? ((fnhr)this.v.d()).a : null;
    }

    public final void e(fnge fnge0) {
        this.n.add(fnge0);
    }

    public final void f(fodo fodo0) {
        if(this.f || this.g) {
            this.t = fodo0;
            this.v();
            if(this.f) {
                this.b.d();
                this.b.b(fodo0);
            }
            if(this.g) {
                this.c.d();
                this.c.b(fodo0);
            }
        }
    }

    public final void g() {
        if(this.f) {
            return;
        }
        gftb.r(((boolean)(this.t() ^ 1)), "enableBadges is only allowed before calling initialize.");
        this.f = true;
    }

    public final void h(fngf fngf0, fnfm fnfm0) {
        gftb.check(fngf0);
        this.h = fngf0;
        this.l = fnfm0;
        if(this.p && this.u.i()) {
            int v = (int)(((Integer)this.u.d()));
            int v1 = this.q - v;
            int v2 = Math.max(0, ((int)Math.ceil(((float)(v1 - this.getPaddingLeft() - this.getPaddingRight())) / 2.0f)));
            int v3 = Math.max(0, ((int)Math.ceil(((float)(v1 - this.getPaddingTop() - this.getPaddingBottom())) / 2.0f)));
            this.setPadding(this.getPaddingLeft() + v2, this.getPaddingTop() + v3, this.getPaddingRight() + v2, this.getPaddingBottom() + v3);
        }
        if(this.f) {
            this.setClipChildren(false);
            this.setClipToPadding(false);
        }
        fnxn.a(new fnfy(this, fnfm0));
        if(this.g) {
            this.s = new fnhy(this.a, this.c);
        }
        if(this.f) {
            this.e = new fnhj(this.b, this.a);
        }
        this.v();
    }

    public final void i(Object object0, AvatarView avatarView0) {
        frbi.c();
        avatarView0.i(object0 != null);
        fngd fngd0 = new fngd(this, object0, avatarView0);
        avatarView0.i = fngd0;
        if(avatarView0.d != 0x80000000) {
            fngd0.run();
        }
    }

    public final void j() {
        for(Object object0: this.n) {
            ((fnge)object0).a();
        }
    }

    public final void k(fnge fnge0) {
        this.n.remove(fnge0);
    }

    public final void l(Object object0) {
        fnxn.a(new fngc(this, object0));
    }

    public final void m(boolean z) {
        if(z == this.g) {
            return;
        }
        gftb.r(((boolean)(this.t() ^ 1)), "setAllowRings is only allowed before calling initialize.");
        this.g = z;
    }

    public final void n() {
        this.a.setImageDrawable(this.a.c);
        this.a.i(true);
    }

    public final void o(fnhe fnhe0) {
        gftb.r(this.f, "setDecorationRetriever is not allowed with false allowBadges.");
        this.i = fnhe0;
        this.w(this.j);
        if(this.g) {
            fnxn.a(new fnfv(this, fnhe0));
        }
        this.q();
        this.j();
    }

    public final void p(int v) {
        gftb.r(((boolean)(this.t() ^ 1)), "setMaxDiscContentSize is only allowed before calling initialize.");
        this.u = gfsx.m(Integer.valueOf(v));
        int v1 = this.f || this.g || this.m ? ((int)this.getResources().getDimension((((float)v) > this.getResources().getDimension(0x7F070D38) ? 0x7F070D3A : 0x7F070D39))) : 0;  // dimen:og_apd_min_avatar_size_for_legacy_large_ring
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.getLayoutParams();
        viewGroup$LayoutParams0.width = v;
        viewGroup$LayoutParams0.height = v;
        int v2 = v - (v1 + v1);
        this.a.h = true;
        this.a.k(v2);
        this.a.g(v2);
    }

    public final void q() {
        fnxn.a(new fnfx(this));
    }

    public final void r(Object object0) {
        frbi.c();
        this.d.c(this.d.b, this.d.c);
        this.d.c(this.d.a, this.d.c);
        this.d.c = object0;
        this.d.b(this.d.b, object0);
        this.d.b(this.d.a, object0);
        gfsx gfsx0 = this.u();
        this.v = gfsx0;
        fnhy fnhy0 = this.s;
        if(fnhy0 != null) {
            fnhy0.b(gfsx0);
        }
        this.w(object0);
        fnhj fnhj0 = this.e;
        if(fnhj0 != null) {
            fnhj0.a(AccountParticleDisc.c(this.k), false);
        }
    }

    public final void s() {
        frbi.c();
        gfsx gfsx0 = this.u();
        if(gfsx0.equals(this.v)) {
            return;
        }
        this.v = gfsx0;
        fnhy fnhy0 = this.s;
        if(fnhy0 != null) {
            frbi.c();
            fnhy0.a(gfsx0, true);
        }
        this.j();
    }

    public final boolean t() {
        return this.h != null;
    }

    private final gfsx u() {
        frbi.c();
        if(this.g) {
            fnhs fnhs0 = this.d;
            frbi.c();
            Object object0 = fnhs0.c;
            if(object0 == null) {
                return gfqx.a;
            }
            fnhe fnhe0 = fnhs0.b;
            if(fnhe0 != null) {
                gfsx gfsx0 = fnhs.a(fnhe0.a(object0));
                if(gfsx0.i()) {
                    return gfsx0;
                }
            }
            fnhe fnhe1 = fnhs0.a;
            return fnhe1 != null ? fnhs.a(fnhe1.a(fnhs0.c)) : gfqx.a;
        }
        return gfqx.a;
    }

    private final void v() {
        fodo fodo0 = this.t;
        if(fodo0 != null) {
            fnhj fnhj0 = this.e;
            if(fnhj0 != null) {
                fnhj0.c = fodo0;
                if(fnhj0.e != null) {
                    fnhj0.a.mn(fodo0);
                    fnhj0.a.c(fodo0, fnhj0.e);
                }
            }
            fnhy fnhy0 = this.s;
            if(fnhy0 != null) {
                fodo fodo1 = this.t;
                fnhy0.d = fodo1;
                if(fnhy0.c != null) {
                    fnhy0.b.mn(fodo1);
                    fnhy0.b.c(fodo1, fnhy0.c);
                }
            }
        }
    }

    private final void w(Object object0) {
        fnhc fnhc0 = this.k;
        if(fnhc0 != null) {
            fnhc0.b(this.o);
        }
        fnhc fnhc1 = this.i == null || object0 == null ? null : this.i.a(object0);
        this.k = fnhc1;
        if(fnhc1 != null) {
            fnhc1.a(this.o);
        }
    }
}

