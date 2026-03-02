package com.google.android.gms.pay.secard.view.template;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import dyna;
import dzdm;
import dzpv;
import eaos;
import eaot;
import eaou;
import fryh;
import fryk;
import fuhm;
import fuho;
import ggtj;
import hwev;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SePrepaidCardLoadingScreenTemplate extends FrameLayout {
    public SePrepaidCardLoadingScreenTemplate(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public SePrepaidCardLoadingScreenTemplate(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public SePrepaidCardLoadingScreenTemplate(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        FrameLayout.inflate(context0, (hwev.c() ? 0x7F0E0731 : 0x7F0E0732), this);  // layout:pay_se_prepaid_card_loading_screen_template
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, eaot.a);
            ibuq.e(typedArray0, "obtainStyledAttributes(...)");
            try {
                String s = typedArray0.getString(1);
                if(s == null) {
                    s = "";
                }
                this.f(s);
                View view0 = this.findViewById(0x7F0B053C);  // id:LoadingHeaderView
                ibuq.e(view0, "findViewById(...)");
                ibuq.f(((ComposeViewHeader)view0), "<this>");
                if((((ComposeViewHeader)view0).a() instanceof fuhm)) {
                    fuho fuho0 = ((ComposeViewHeader)view0).a();
                    ibuq.d(fuho0, "null cannot be cast to non-null type com.google.android.libraries.tapandpay.ui.compose.viewheader.ViewHeaderState.Default");
                    ((ComposeViewHeader)view0).b(fuhm.a(((fuhm)fuho0), dzpv.j(), null, 6));
                }
                else {
                    ((ggtj)dzpv.a.j()).x("ComposeViewHeader is not Default UI state.");
                }
                this.e(eaou.values()[typedArray0.getInt(0, eaou.a.c)]);
            }
            finally {
                typedArray0.recycle();
            }
            if(hwev.c()) {
                ((ComposeView)this.findViewById(0x7F0B053E)).a(eaos.b);  // id:LoadingLottieAnimation
                return;
            }
            ((LottieAnimationView)this.findViewById(0x7F0B053E)).l(0x7F14024C);  // id:LoadingLottieAnimation
        }
    }

    public SePrepaidCardLoadingScreenTemplate(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void a() {
        View view0 = this.findViewById(0x7F0B053C);  // id:LoadingHeaderView
        ibuq.e(view0, "findViewById(...)");
        ibuq.f(((ComposeViewHeader)view0), "<this>");
        if((((ComposeViewHeader)view0).a() instanceof fuhm)) {
            fuho fuho0 = ((ComposeViewHeader)view0).a();
            ibuq.d(fuho0, "null cannot be cast to non-null type com.google.android.libraries.tapandpay.ui.compose.viewheader.ViewHeaderState.Default");
            ((ComposeViewHeader)view0).b(fuhm.a(((fuhm)fuho0), null, null, 6));
            return;
        }
        ((ggtj)dzpv.a.j()).x("ComposeViewHeader is not Default UI state.");
    }

    public final void b(int v) {
        this.d(new fryh(v));
    }

    public final void c(dyna dyna0) {
        ibuq.f(dyna0, "serviceProvider");
        Object object0 = dzdm.h.get(dyna0);
        if(object0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.b(((dzdm)object0).j);
    }

    public final void d(fryk fryk0) {
        View view0 = this.findViewById(0x7F0B053C);  // id:LoadingHeaderView
        ibuq.e(view0, "findViewById(...)");
        dzpv.b(((ComposeViewHeader)view0), fryk0);
    }

    public final void e(eaou eaou0) {
        ibuq.f(eaou0, "style");
        View view0 = this.findViewById(0x7F0B0510);  // id:LinearProgressIndicator
        ibuq.e(view0, "findViewById(...)");
        int v = 0;
        view0.setVisibility((eaou0 == eaou.b ? 0 : 8));
        View view1 = this.findViewById(0x7F0B053E);  // id:LoadingLottieAnimation
        ibuq.e(view1, "findViewById(...)");
        if(eaou0 != eaou.a) {
            v = 8;
        }
        view1.setVisibility(v);
    }

    public final void f(String s) {
        ibuq.f(s, "title");
        View view0 = this.findViewById(0x7F0B053C);  // id:LoadingHeaderView
        ibuq.e(view0, "findViewById(...)");
        dzpv.d(((ComposeViewHeader)view0), s);
    }
}

