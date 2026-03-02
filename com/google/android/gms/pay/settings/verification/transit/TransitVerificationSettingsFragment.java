package com.google.android.gms.pay.settings.verification.transit;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.libraries.tapandpay.ui.rowsecondary.toggle.RowSecondaryToggle;
import com.google.android.libraries.tapandpay.ui.tile.fop.TileFop;
import dagger.internal.Preconditions;
import dmet;
import dokz;
import dolg;
import doma;
import domu;
import domv;
import done;
import douj;
import douk;
import ecqa;
import ecqg;
import ecqh;
import ecqi;
import ecql;
import ecqo;
import ecqq;
import ecqr;
import ecqs;
import ecqt;
import ecqu;
import ecrj;
import ednc;
import edop;
import eeej;
import fhwk;
import fshb;
import fuok;
import fuop;
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
import tyb;

public final class TransitVerificationSettingsFragment extends dokz implements douk, ednc, fshb {
    public fuok a;
    public fhwk ag;
    public tyb ah;
    public View ai;
    public TextView aj;
    public RowSecondaryToggle ak;
    public TileFop al;
    public TextView am;
    public TextView an;
    public ecqg ao;
    private final ibnn ap;
    private RecyclerView aq;
    public ibnf b;
    public ecqa c;
    public dmet d;
    public eeej feedbackProvider;

    public TransitVerificationSettingsFragment() {
        ecqq ecqq0 = new ecqq(this);
        ecqs ecqs0 = new ecqs(new ecqr(this));
        ibnn ibnn0 = ibno.a(ibnp.c, ecqs0);
        this.ap = new lsd(new ibuk(ecrj.class), new ecqt(ibnn0), ecqq0, new ecqu(ibnn0));
    }

    @Override  // douk
    public final douj A() {
        return douj.c;
    }

    public final ecrj B() {
        return (ecrj)this.ap.a();
    }

    public final fhwk D() {
        fhwk fhwk0 = this.ag;
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
        if(this.ao == null) {
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            doma doma0 = new doma(this);
            done done0 = new done();
            edop edop0 = new edop();
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.ao = new ecqg(doma0, dolg0, done0, edop0, domv0);
        }
        ecqg ecqg0 = this.ao;
        if(ecqg0 == null) {
            ibuq.j("injector");
            ecqg0 = null;
        }
        ecqg0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E0BE3, viewGroup0, false);  // layout:transit_verification_settings_fragment
        this.D().f(view0, this.D().a.a(0x361F1));
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        View view1 = view0.findViewById(0x7F0B01ED);  // id:ClosedLoopCards
        ibuq.c(view1);
        this.ai = view1;
        View view2 = view0.findViewById(0x7F0B01EF);  // id:ClosedLoopCardsSubTextView
        ibuq.c(view2);
        this.aj = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0934);  // id:TransitSettingsToggle
        ibuq.c(view3);
        this.ak = (RowSecondaryToggle)view3;
        View view4 = view0.findViewById(0x7F0B0935);  // id:TransitSettingsToggleEmptyStateDescription
        ibuq.c(view4);
        this.an = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B026C);  // id:DefaultCardTileFop
        ibuq.c(view5);
        this.al = (TileFop)view5;
        View view6 = view0.findViewById(0x7F0B03FB);  // id:FopRowDescription
        ibuq.c(view6);
        this.am = (TextView)view6;
        View view7 = view0.findViewById(0x7F0B08D8);  // id:Toolbar
        ibuq.c(view7);
        ((Toolbar)view7).x(new ecqh(this));
        ((Toolbar)view7).t(0x7F151C03);  // string:pay_back "Back"
        ((Toolbar)view7).v(0x7F0804D0);  // drawable:gs_arrow_back_vd_theme_24
        View view8 = view0.findViewById(0x7F0B01EE);  // id:ClosedLoopCardsList
        ibuq.c(view8);
        RecyclerView recyclerView0 = (RecyclerView)view8;
        this.aq = recyclerView0;
        if(recyclerView0 == null) {
            ibuq.j("cardsList");
            recyclerView0 = null;
        }
        view0.getContext();
        recyclerView0.ap(new LinearLayoutManager());
        RecyclerView recyclerView1 = this.aq;
        if(recyclerView1 == null) {
            ibuq.j("cardsList");
            recyclerView1 = null;
        }
        recyclerView1.an(this.y());
        RowSecondaryToggle rowSecondaryToggle0 = this.ak;
        if(rowSecondaryToggle0 == null) {
            ibuq.j("settingsToggleView");
            rowSecondaryToggle0 = null;
        }
        rowSecondaryToggle0.setOnClickListener(new ecqi(this));
        View view9 = view0.findViewById(0x7F0B07F8);  // id:SettingContainer
        ibuq.e(view9, "findViewById(...)");
        int v = this.getResources().getDimensionPixelSize(0x7F070DED);  // dimen:pay_large_spacing
        fuok fuok0 = this.a;
        if(fuok0 == null) {
            ibuq.j("edgeToEdgeStyler");
            fuok0 = null;
        }
        fuop.c(fuok0, view9, v);
        icmq icmq0 = this.B().a.a;
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new ecql(lps0, icmq0, null, this), 3);
        icmq icmq1 = this.B().b.c;
        lps lps1 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps1), null, null, new ecqo(lps1, icmq1, null, this), 3);
    }

    public final ecqa y() {
        ecqa ecqa0 = this.c;
        if(ecqa0 != null) {
            return ecqa0;
        }
        ibuq.j("adapter");
        return null;
    }
}

