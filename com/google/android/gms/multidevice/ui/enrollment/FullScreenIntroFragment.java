package com.google.android.gms.multidevice.ui.enrollment;

import abc;
import abe;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import bthl;
import com.google.android.gms.multidevice.ui.enrollment.views.EnrollmentSingleIllustrationView;
import cudv;
import cudw;
import cudx;
import cudz;
import cuea;
import cueb;
import cuec;
import cued;
import cufe;
import cugm;
import cugn;
import cuir;
import culx;
import cume;
import hvms;
import ibnn;
import ibnz;
import ibts;
import ibuk;
import ibuq;
import icbb;
import lsc;
import lsd;
import xoc;

public final class FullScreenIntroFragment extends cufe {
    public ibts a;
    public View b;
    private final ibnn c;
    private final ibnn d;

    static {
        cume.a(new ibuk(FullScreenIntroFragment.class));
    }

    public FullScreenIntroFragment() {
        ibuk ibuk0 = new ibuk(cugn.class);
        cueb cueb0 = new cueb(this);
        cuec cuec0 = new cuec(this);
        this.c = new lsd(ibuk0, cueb0, new cued(this), cuec0);
        this.d = new ibnz(new cuea(this));
    }

    private final Button C() {
        Object object0 = this.d.a();
        ibuq.e(object0, "getValue(...)");
        return (Button)object0;
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        cugn cugn0 = (cugn)this.c.a();
        icbb.b(lsc.a(cugn0), null, null, new cugm(cugn0, null), 3);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        if(hvms.e()) {
            View view0 = layoutInflater0.inflate(0x7F0E041F, viewGroup0, false);  // layout:fragment_full_screen_intro_e2e_compatible
            ibuq.e(view0, "inflate(...)");
            return view0;
        }
        View view1 = layoutInflater0.inflate(0x7F0E041E, viewGroup0, false);  // layout:fragment_full_screen_intro
        ibuq.e(view1, "inflate(...)");
        return view1;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        View view2;
        ibuq.f(view0, "view");
        this.b = view0;
        View view1 = null;
        if(view0 == null) {
            ibuq.j("rootView");
            view2 = null;
        }
        else {
            view2 = view0;
        }
        View view3 = view2.findViewById(0x7F0B14D6);  // id:full_screen_intro_button_primary
        ibuq.e(view3, "findViewById(...)");
        if(hvms.e()) {
            ((cuir)xoc.b(this)).c(0x7F151305);  // string:full_screen_intro_title "Set up cross-device services"
            ((cuir)xoc.b(this)).d();
            ((Button)view3).setText(this.getText(0x7F15089B));  // string:common_next "Next"
            ((Button)view3).setOnClickListener(new cudv(this));
            abc abc0 = xoc.b(this).getOnBackPressedDispatcher();
            ibuq.e(abc0, "<get-onBackPressedDispatcher>(...)");
            abe.a(abc0, this, new cudw(this));
        }
        else {
            ((cuir)xoc.b(this)).b();
            abc abc1 = xoc.b(this).getOnBackPressedDispatcher();
            ibuq.e(abc1, "<get-onBackPressedDispatcher>(...)");
            abe.a(abc1, this, new cudx(this));
            View view4 = view0.findViewById(0x7F0B125C);  // id:enrollment_nav_up
            ibuq.e(view4, "findViewById(...)");
            view4.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> xoc.b(this).finish());
            this.C().setText(this.getText(0x7F15089B));  // string:common_next "Next"
            this.C().setOnClickListener(new cudz(this));
        }
        View view5 = this.b;
        if(view5 == null) {
            ibuq.j("rootView");
        }
        else {
            view1 = view5;
        }
        ((EnrollmentSingleIllustrationView)view1.findViewById(0x7F0B14DA)).d(0x7F150F2A, new culx(new bthl(xoc.b(this))), false);  // id:full_screen_intro_single_illustration
    }

    public final ibts y() {
        ibts ibts0 = this.a;
        if(ibts0 != null) {
            return ibts0;
        }
        ibuq.j("getNavController");
        return null;
    }

    // Detected as a lambda impl.
    public final void z() {
        xoc.b(this).finish();
    }
}

