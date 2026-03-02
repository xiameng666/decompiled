package com.google.android.gms.pay.pass.closedloop.view.shared;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import dsgo;
import dsgp;
import frxq;
import fryh;
import fryj;
import fryk;
import fryu;
import fugr;
import fugv;
import fuhm;
import fujl;
import fups;
import fupu;
import fupv;
import fuqd;
import hll;
import hwev;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ProcessingTemplate extends FrameLayout {
    private ComposeViewHeader a;

    public ProcessingTemplate(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public ProcessingTemplate(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public ProcessingTemplate(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        FrameLayout.inflate(context0, (hwev.c() ? 0x7F0E0D93 : 0x7F0E0D94), this);  // layout:wallet_processing_template
        this.a = (ComposeViewHeader)this.findViewById(0x7F0B020D);  // id:ComposeViewHeader
    }

    public ProcessingTemplate(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void a(String s, String s1, fugv fugv0, dsgp dsgp0) {
        ibuq.f(s, "titleString");
        ibuq.f(dsgp0, "loadingStyle");
        ComposeViewHeader composeViewHeader0 = this.a;
        fryu fryu0 = null;
        if(composeViewHeader0 == null) {
            ibuq.j("viewHeader");
            composeViewHeader0 = null;
        }
        fryu fryu1 = new fryu(s);
        if(s1 != null) {
            fryu0 = new fryu(s1);
        }
        composeViewHeader0.b(new fuhm(fugv0, fryu1, fryu0));
        if(dsgp0.ordinal() != 1) {
            LottieAnimationView lottieAnimationView0 = (LottieAnimationView)this.findViewById(0x7F0B053E);  // id:LoadingLottieAnimation
            ibuq.c(lottieAnimationView0);
            lottieAnimationView0.setVisibility(0);
            View view0 = this.findViewById(0x7F0B0510);  // id:LinearProgressIndicator
            ibuq.e(view0, "findViewById(...)");
            view0.setVisibility(8);
            if(hwev.c()) {
                Context context0 = this.getContext();
                ibuq.e(context0, "getContext(...)");
                fupv fupv0 = fupu.a(context0);
                fups.a(fuqd.a, lottieAnimationView0, fupv0).d(new dsgo(lottieAnimationView0));
                return;
            }
            lottieAnimationView0.l(0x7F14024C);  // raw:shape_loader_lottie
            lottieAnimationView0.t(-1);
            lottieAnimationView0.i();
            return;
        }
        View view1 = this.findViewById(0x7F0B053E);  // id:LoadingLottieAnimation
        ibuq.e(view1, "findViewById(...)");
        view1.setVisibility(8);
        View view2 = this.findViewById(0x7F0B0510);  // id:LinearProgressIndicator
        ibuq.e(view2, "findViewById(...)");
        view2.setVisibility(0);
    }

    public final void b(String s, String s1, fryk fryk0, dsgp dsgp0) {
        ibuq.f(s, "titleString");
        ibuq.f(dsgp0, "loadingStyle");
        this.a(s, s1, (fryk0 == null ? null : new fugr(new fujl(fryk0, null, null, new frxq(hll.h), false, null, false, 0xF6))), dsgp0);
    }

    public final void c(String s, String s1, String s2, dsgp dsgp0) {
        ibuq.f(s, "titleString");
        ibuq.f(dsgp0, "loadingStyle");
        this.b(s, s1, (s2 == null ? null : new fryj(s2, null, null, null, 14)), dsgp0);
    }

    public static void d(ProcessingTemplate processingTemplate0, String s, fugv fugv0, dsgp dsgp0, int v) {
        if((v & 8) != 0) {
            dsgp0 = dsgp.a;
        }
        if((v & 4) != 0) {
            fugv0 = null;
        }
        processingTemplate0.a(s, null, fugv0, dsgp0);
    }

    public static void e(ProcessingTemplate processingTemplate0, String s, int v) {
        ibuq.f(s, "titleString");
        ibuq.f(dsgp.a, "loadingStyle");
        processingTemplate0.b(s, null, new fryh(v), dsgp.a);
    }

    public static void f(ProcessingTemplate processingTemplate0, String s, String s1) {
        processingTemplate0.c(s, null, s1, dsgp.a);
    }
}

