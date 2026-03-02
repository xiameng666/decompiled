package com.google.android.gms.pay.pass.common.template.closedloop;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.pay.pass.common.securityanimation.SecurityAnimation;
import dmgv;
import dsme;
import dsnh;
import dsoy;
import dspl;
import efky;
import fsda;
import funx;
import gfsx;
import gfta;
import gged_interceptors;
import guab;
import guag;
import gubi;
import gukv;
import gunw;
import hjie;
import upd;

public class CardHeaderTemplate extends dsme {
    public CardHeaderTemplate(Context context0) {
        this(context0, null);
    }

    public CardHeaderTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public CardHeaderTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        dmgv.d();
    }

    @Override  // dsme
    protected int a() {
        return 0x7F0E067D;  // layout:pay_closed_loop_card_header_template_security_animation
    }

    @Override  // dsme
    protected final View b() {
        return null;
    }

    @Override  // dsme
    protected final ImageView c() {
        return (ImageView)this.findViewById(0x7F0B01DB);  // id:ClosedLoopCardHeaderLogo
    }

    @Override  // dsme
    protected final ImageView d() {
        return null;
    }

    @Override  // dsme
    protected final TextView e() {
        return null;
    }

    @Override  // dsme
    protected final TextView f() {
        return (TextView)this.findViewById(0x7F0B01DF);  // id:ClosedLoopCardHeaderSubtitle
    }

    @Override  // dsme
    protected final TextView g() {
        return (TextView)this.findViewById(0x7F0B01E1);  // id:ClosedLoopCardHeaderTitle
    }

    @Override  // dsme
    protected final TextView h() {
        return (TextView)this.findViewById(0x7F0B01E2);  // id:ClosedLoopCardHeaderTitleLabel
    }

    @Override  // dsme
    protected final void k(guag guag0, gubi gubi0, boolean z, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2) {
        View view0 = this.findViewById(0x7F0B01DE);  // id:ClosedLoopCardHeaderLogoWrapper
        if(view0 == null) {
            super.k(guag0, gubi0, z, gfsx0, gfsx1, gfsx2);
            return;
        }
        int v = (int)efky.e((gubi0.f == null ? hjie.a : gubi0.f));
        int v1 = (int)efky.e((gubi0.g == null ? hjie.a : gubi0.g));
        TextView textView0 = this.l;
        if(textView0 != null) {
            textView0.setTextColor(v);
        }
        TextView textView1 = this.m;
        if(textView1 != null) {
            textView1.setTextColor(v);
        }
        TextView textView2 = this.k;
        if(textView2 != null) {
            textView2.setTextColor(v1);
        }
        gukv gukv0 = guag0.c == null ? gukv.a : guag0.c;
        ImageView imageView0 = this.i;
        if(imageView0 != null && (!gfta.c(gukv0.c) || !gfta.c(gukv0.d))) {
            Drawable drawable0 = this.getResources().getDrawable(0x7F0802EB, this.getContext().getTheme());  // drawable:closed_loop_photo_logo_bg
            dsoy dsoy0 = this.e.b(new fsda(imageView0), gukv0);
            dsoy0.i = z;
            dsoy0.b(drawable0);
            dsoy0.c();
            if(gfsx0.i()) {
                dsoy0.e(((Long)gfsx0.d()).longValue());
            }
            if(gfsx2.i()) {
                dsoy0.d(((upd)gfsx2.d()));
            }
            this.e.d(dsoy0);
        }
        else {
            view0.setVisibility(8);
        }
        if(textView0 != null) {
            funx.e(textView0, dspl.d((guag0.e == null ? gunw.a : guag0.e)));
        }
        if(textView1 != null) {
            funx.e(textView1, dspl.d((guag0.h == null ? gunw.a : guag0.h)));
        }
        if(textView2 != null) {
            funx.e(textView2, dspl.d((guag0.g == null ? gunw.a : guag0.g)));
        }
        SecurityAnimation securityAnimation0 = (SecurityAnimation)this.findViewById(0x7F0B01DD);  // id:ClosedLoopCardHeaderLogoSecurityAnimation
        securityAnimation0.a(gged_interceptors.m(guab.d, guab.c));
        securityAnimation0.setClipToOutline(true);
        CardView cardView0 = (CardView)this.findViewById(0x7F0B07D4);  // id:SecurityAnimationCard
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)cardView0.getLayoutParams();
        frameLayout$LayoutParams0.setMargins(0, 0, 0, 0);
        cardView0.setLayoutParams(frameLayout$LayoutParams0);
    }

    public final int m(int v, int v1) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = this.i == null ? new ViewGroup.MarginLayoutParams(0, 0) : ((ViewGroup.MarginLayoutParams)this.i.getLayoutParams());
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams1 = (ViewGroup.MarginLayoutParams)this.s().getLayoutParams();
        return v + viewGroup$MarginLayoutParams0.getMarginStart() + viewGroup$MarginLayoutParams0.getMarginEnd() + viewGroup$MarginLayoutParams1.getMarginStart() + v1;
    }

    public final void n(int v, boolean z) {
        boolean z1 = true;
        if(this.s().getWidth() > 0) {
            TextView textView0 = this.l;
            if(textView0 != null) {
                textView0.measure(0, 0);
                if(textView0.getMeasuredWidth() < this.s().getWidth()) {
                    z1 = false;
                }
                this.p(z1);
            }
        }
        else if(z) {
            ImageView imageView0 = this.i;
            if(imageView0 != null) {
                imageView0.measure(0, 0);
            }
            TextView textView1 = this.l;
            if(textView1 != null) {
                textView1.measure(0, 0);
                if(this.m((imageView0 == null ? 0 : imageView0.getMeasuredWidth()), textView1.getMeasuredWidth()) < v) {
                    z1 = false;
                }
                this.p(z1);
            }
        }
        else {
            ImageView imageView1 = this.i;
            if(imageView1 != null) {
                imageView1.post(new dsnh(this, v));
            }
        }
    }

    public final void p(boolean z) {
        int v = 1;
        TextView textView0 = this.l;
        if(textView0 != null) {
            if(z) {
                v = 2;
            }
            textView0.setLines(v);
        }
    }

    private final LinearLayout s() {
        return (LinearLayout)this.findViewById(0x7F0B01F4);  // id:ClosedLoopHeaderInformation
    }
}

