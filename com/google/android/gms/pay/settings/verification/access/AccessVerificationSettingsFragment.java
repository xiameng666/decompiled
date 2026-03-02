package com.google.android.gms.pay.settings.verification.access;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;
import dokz;
import dolg;
import doma;
import domu;
import domv;
import done;
import douj;
import douk;
import ecns;
import ecnt;
import ecnw;
import ecnz;
import ecob;
import ecoc;
import ecod;
import ecoe;
import ecof;
import ecok;
import ecop;
import ecou;
import ednc;
import eeej;
import fhwk;
import fshb;
import fuok;
import fuop;
import hwfk;
import ibnf;
import ibnn;
import ibno;
import ibnp;
import ibuk;
import ibuq;
import icbb;
import icmq;
import lps;
import lpt;
import lsd;

public final class AccessVerificationSettingsFragment extends dokz implements douk, ednc, fshb {
    public fuok a;
    public ecou ag;
    private final ibnn ah;
    public ibnf b;
    public fhwk c;
    public ecop d;
    public eeej feedbackProvider;

    public AccessVerificationSettingsFragment() {
        ecob ecob0 = new ecob(this);
        ecod ecod0 = new ecod(new ecoc(this));
        ibnn ibnn0 = ibno.a(ibnp.c, ecod0);
        this.ah = new lsd(new ibuk(ecok.class), new ecoe(ibnn0), ecob0, new ecof(ibnn0));
    }

    @Override  // douk
    public final douj A() {
        return douj.c;
    }

    public final ecop B() {
        ecop ecop0 = this.d;
        if(ecop0 != null) {
            return ecop0;
        }
        ibuq.j("toggleAdapter");
        return null;
    }

    public final fhwk D() {
        fhwk fhwk0 = this.c;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.ag == null) {
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            doma doma0 = new doma(this);
            done done0 = new done();
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.ag = new ecou(doma0, dolg0, done0, domv0);
        }
        ecou ecou0 = this.ag;
        if(ecou0 == null) {
            ibuq.j("injector");
            ecou0 = null;
        }
        ecou0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate((hwfk.a.b().bJ() ? 0x7F0E0C82 : 0x7F0E0C81), viewGroup0, false);  // layout:wallet_access_verification_settings_fragment_updated
        this.D().f(view0, this.D().a.a(0x361EF));
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        View view1 = view0.findViewById(0x7F0B08D8);  // id:Toolbar
        ibuq.c(view1);
        ((Toolbar)view1).x(new ecns(this));
        ((Toolbar)view1).t(0x7F151C03);  // string:pay_back "Back"
        ((Toolbar)view1).v(0x7F0804D0);  // drawable:gs_arrow_back_vd_theme_24
        View view2 = view0.findViewById(0x7F0B0008);  // id:AccessVerificationToggleList
        ibuq.c(view2);
        ((RecyclerView)view2).getContext();
        ((RecyclerView)view2).ap(new LinearLayoutManager());
        ((RecyclerView)view2).an(this.B());
        ((RecyclerView)view2).ao(null);
        ecop ecop0 = this.B();
        ecop0.e = new ecnt(this);
        View view3 = view0.findViewById(0x7F0B07F8);  // id:SettingContainer
        ibuq.e(view3, "findViewById(...)");
        int v = this.getResources().getDimensionPixelSize(0x7F070DED);  // dimen:pay_large_spacing
        fuok fuok0 = this.a;
        if(fuok0 == null) {
            ibuq.j("edgeToEdgeStyler");
            fuok0 = null;
        }
        fuop.c(fuok0, view3, v);
        icmq icmq0 = this.y().b.a;
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new ecnw(lps0, icmq0, null, this), 3);
        icmq icmq1 = this.y().c.c;
        lps lps1 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps1), null, null, new ecnz(lps1, icmq1, null, this), 3);
    }

    public final ecok y() {
        return (ecok)this.ah.a();
    }
}

