import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.MaterialFieldLayout;
import com.google.android.wallet.ui.common.MaterialFieldRegionCodeView;
import com.google.android.wallet.ui.common.RegionCodeView;
import com.google.android.wallet.ui.common.SummaryTextLayout;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;

public final class fcan extends gdak implements gami, gdbh {
    int a;
    gcwf ag;
    public gdak ah;
    fcbz ai;
    final ArrayList aj;
    private ArrayList ak;
    private final gdew al;
    private String am;
    private gklu an;
    private final gamj ao;
    MaterialFieldRegionCodeView b;
    SummaryExpanderWrapper c;
    SummaryExpanderWrapper d;

    public fcan() {
        this.a = 0;
        this.al = new gdew();
        this.aj = new ArrayList();
        this.ao = new gamj(0x681);
    }

    @Override  // gami
    public final gamj B() {
        return this.ao;
    }

    @Override  // gdak
    protected final gewg C() {
        this.aj();
        gewg gewg0 = ((gexj)this.aA).c;
        return gewg0 == null ? gewg.a : gewg0;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gexj.a).jf(7, null);
    }

    public static fcan G(gexj gexj0, int v, String s, gklu gklu0, LogContext logContext0) {
        if((gexj0.b & 2) != 0 && (gexj0.b & 4) != 0 && !new hfuh((gexj0.e == null ? geui.d : gexj0.e).B, geui.a).contains(geud.b)) {
            throw new IllegalArgumentException("Customer form with both a legal country selector and a legal address form containing a country selector is not supported");
        }
        fcan fcan0 = new fcan();
        Bundle bundle0 = fcan.al(v, ((MessageLite)gexj0), logContext0);
        bundle0.putString("flowAnalyticsId", s);
        bundle0.putSerializable("flowType", gklu0);
        fcan0.setArguments(bundle0);
        return fcan0;
    }

    public final gexk I() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gexk.a).v_newBuilder();
        ArrayList arrayList0 = this.aj;
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            Object object0 = ((gczs)arrayList0.get(v1)).e;
            if((object0 instanceof gcwg)) {
                geuj geuj0 = ((gcwg)object0).J(Bundle.EMPTY);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gexk gexk0 = (gexk)hftp0.b_message;
                geuj0.getClass();
                gexk0.d = geuj0;
                gexk0.b |= 2;
                ++v1;
                continue;
            }
            if((object0 instanceof gdak) && fbgn.I(((gdak)object0))) {
                geyh geyh0 = fbgn.s(((gdak)object0), Bundle.EMPTY);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gexk gexk1 = (gexk)hftp0.b_message;
                geyh0.getClass();
                gexk1.c = geyh0;
                gexk1.b |= 1;
                ++v1;
                continue;
            }
            if((object0 instanceof fccs)) {
                gfdp gfdp0 = ((fccs)object0).U();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gexk gexk2 = (gexk)hftp0.b_message;
                gfdp0.getClass();
                gexk2.g = gfdp0;
                gexk2.b |= 16;
                ++v1;
                continue;
            }
            if(!(object0 instanceof RegionCodeView)) {
                throw new IllegalStateException(object0 + " is not supported");
            }
            String s = gcha.c(this.b.b());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gexk gexk3 = (gexk)hftp0.b_message;
            s.getClass();
            gexk3.b |= 8;
            gexk3.f = s;
            ++v1;
            continue;
        }
        fcbz fcbz0 = this.ai;
        if(fcbz0 != null) {
            gfbr gfbr0 = fcbz0.b;
            if(gfbr0 != null) {
                String s1 = gfbr0.i;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gexk gexk4 = (gexk)hftp0.b_message;
                s1.getClass();
                gexk4.b |= 4;
                gexk4.e = s1;
            }
        }
        return (gexk)hftp0.N_build();
    }

    @Override  // gdbh
    public final void J(int v, int v1, boolean z) {
        if(this.a != v) {
            this.a = v;
            String s = gcha.c(v);
            if((((gexj)this.aA).b & 2) != 0 && v1 == this.b.getId()) {
                geuk geuk0 = ((gexj)this.aA).d;
                if(geuk0 == null) {
                    geuk0 = geuk.a;
                }
                if(!geuk0.d.equals(s)) {
                    Bundle bundle0 = new Bundle();
                    gewg gewg0 = ((gexj)this.aA).c;
                    if(gewg0 == null) {
                        gewg0 = gewg.a;
                    }
                    bundle0.putString("EventListener.EXTRA_FORM_ID", gewg0.c);
                    bundle0.putInt("EventListener.EXTRA_FIELD_ID", 1);
                    this.T(3, bundle0);
                }
            }
            fcbz fcbz0 = this.ai;
            if(fcbz0 != null) {
                fcbz0.R(gcha.c(v));
            }
        }
        if(v != 0) {
            SummaryExpanderWrapper summaryExpanderWrapper0 = this.c;
            if(summaryExpanderWrapper0 != null) {
                summaryExpanderWrapper0.a.l(this.isResumed());
            }
        }
    }

    @Override  // gdcm
    public final void M() {
        boolean z = this.ca;
        ArrayList arrayList0 = this.aj;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = ((gczs)arrayList0.get(v1)).e;
            if((object0 instanceof gdbw)) {
                ((gdbw)object0).ll(z);
            }
            else if((object0 instanceof View)) {
                ((View)object0).setEnabled(z);
            }
        }
        SummaryExpanderWrapper summaryExpanderWrapper0 = this.c;
        if(summaryExpanderWrapper0 != null) {
            summaryExpanderWrapper0.setEnabled(z);
        }
        SummaryExpanderWrapper summaryExpanderWrapper1 = this.d;
        if(summaryExpanderWrapper1 != null) {
            summaryExpanderWrapper1.setEnabled(z);
        }
        fcbz fcbz0 = this.ai;
        if(fcbz0 != null) {
            fcbz0.ll(z);
        }
    }

    @Override  // gdaa
    public final boolean la() {
        ArrayList arrayList0 = this.aj;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if((((gczs)arrayList0.get(v1)).e instanceof gdaa) && !((gdaa)((gczs)arrayList0.get(v1)).e).la()) {
                return false;
            }
        }
        return true;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.aj;
    }

    @Override  // gami
    public final List li() {
        List list0 = new ArrayList();
        ArrayList arrayList0 = this.aj;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = ((gczs)arrayList0.get(v1)).e;
            if((object0 instanceof gami)) {
                ((ArrayList)list0).add(((gami)object0));
            }
            else if((object0 instanceof RegionCodeView)) {
                ((ArrayList)list0).add(new gamh());
            }
        }
        return list0;
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        String s = (getg0.b == null ? gesr.a : getg0.b).b;
        gewg gewg0 = ((gexj)this.aA).c;
        if(gewg0 == null) {
            gewg0 = gewg.a;
        }
        if(s.equals(gewg0.c)) {
            throw new IllegalArgumentException("Unknown FormFieldMessage fieldId: " + (getg0.b == null ? gesr.a : getg0.b).c);
        }
        ArrayList arrayList0 = this.aj;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if((((gczs)arrayList0.get(v1)).e instanceof gdaa) && ((gdaa)((gczs)arrayList0.get(v1)).e).ly(getg0)) {
                return true;
            }
        }
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.al;
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            this.a = bundle0.getInt("selectedRegionCode", 0);
        }
        this.am = this.getArguments().getString("flowAnalyticsId");
        this.an = (gklu)this.getArguments().getSerializable("flowType");
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putIntegerArrayList("regionCodes", this.ak);
        bundle0.putInt("selectedRegionCode", this.a);
    }

    @Override  // du
    public final void onViewStateRestored(Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        this.T(6, Bundle.EMPTY);
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0D2B, null, false);  // layout:wallet_fragment_customer_form
        gexj gexj0 = (gexj)this.aA;
        if((gexj0.b & 2) != 0) {
            if(bundle0 == null) {
                if((gexj0.d == null ? geuk.a : gexj0.d).c.size() <= 0) {
                    throw new IllegalArgumentException("LegalCountrySelector\'s allowed country codes cannot be empty");
                }
                geuk geuk0 = ((gexj)this.aA).d;
                if(geuk0 == null) {
                    geuk0 = geuk.a;
                }
                this.ak = gcgq.g(gcgq.h(geuk0.c));
            }
            else {
                this.ak = bundle0.getIntegerArrayList("regionCodes");
            }
            MaterialFieldRegionCodeView materialFieldRegionCodeView0 = (MaterialFieldRegionCodeView)view0.findViewById(0x7F0B1E2E);  // id:region_code_view
            this.b = materialFieldRegionCodeView0;
            materialFieldRegionCodeView0.d(this.cM());
            MaterialFieldRegionCodeView materialFieldRegionCodeView1 = this.b;
            geuk geuk1 = ((gexj)this.aA).d;
            if(geuk1 == null) {
                geuk1 = geuk.a;
            }
            materialFieldRegionCodeView1.c((geuk1.b == null ? gewg.a : geuk1.b));
            String s = this.getString(0x7F15357A);  // string:wallet_uic_address_field_country "Country"
            this.b.c = s;
            MaterialFieldLayout materialFieldLayout0 = this.b.a;
            if(materialFieldLayout0 != null) {
                materialFieldLayout0.g(s);
            }
            this.b.h = this;
            this.b.a(this.ak);
            MaterialFieldRegionCodeView materialFieldRegionCodeView2 = this.b;
            geuk geuk2 = ((gexj)this.aA).d;
            if(geuk2 == null) {
                geuk2 = geuk.a;
            }
            materialFieldRegionCodeView2.g(gcha.b(geuk2.d));
            SummaryExpanderWrapper summaryExpanderWrapper0 = (SummaryExpanderWrapper)view0.findViewById(0x7F0B17DD);  // id:legal_country_selector_wrapper
            this.c = summaryExpanderWrapper0;
            summaryExpanderWrapper0.setVisibility(0);
            SummaryTextLayout summaryTextLayout0 = (SummaryTextLayout)this.c.findViewById(0x7F0B17DE);  // id:legal_country_summary
            this.al.d(this.c);
            this.c.l(0x7F0B17DE);  // id:legal_country_summary
            this.c.k(0x7F0B17DC);  // id:legal_country_image
            summaryTextLayout0.b(s);
            this.c.d(new gczs(0L, this.b, null));
            this.c.h();
            ArrayList arrayList0 = this.aj;
            MaterialFieldRegionCodeView materialFieldRegionCodeView3 = this.b;
            geuk geuk3 = ((gexj)this.aA).d;
            if(geuk3 == null) {
                geuk3 = geuk.a;
            }
            arrayList0.add(new gczs(0L, materialFieldRegionCodeView3, geuk3.d));
            String s1 = this.am;
            OrchestrationViewEvent.d(this.getContext(), s1, new gamj(0x684));
        }
        if(((gexj)this.aA).h.size() > 1) {
            throw new IllegalArgumentException("Customer form with multiple tax info forms is not supported");
        }
        if(((gexj)this.aA).h.size() == 1) {
            SummaryExpanderWrapper summaryExpanderWrapper1 = (SummaryExpanderWrapper)view0.findViewById(0x7F0B2249);  // id:tax_info_form_wrapper
            this.d = summaryExpanderWrapper1;
            summaryExpanderWrapper1.setVisibility(0);
            ViewGroup viewGroup1 = (ViewGroup)this.d.findViewById(0x7F0B0FCE);  // id:container
            int v = this.cH().a();
            viewGroup1.setId(v);
            fccs fccs0 = (fccs)this.getChildFragmentManager().h("Tax_Info_Tag");
            if(fccs0 == null) {
                fccs0 = fccs.Q(((gfdn)((gexj)this.aA).h.get(0)), this.bU, this.cM());
                ca ca0 = new ca(this.getChildFragmentManager());
                ca0.z(v, fccs0, "Tax_Info_Tag");
                ca0.a();
            }
            fccs0.cb = this.cb;
            ((ImageView)this.d.findViewById(0x7F0B16B9)).setImageResource(gdcb.al(this.bV, 99, -1));  // id:icon
            ((SummaryTextLayout)this.d.findViewById(0x7F0B218D)).b(((gfdn)((gexj)this.aA).h.get(0)).e);  // id:summary_text
            this.d.m = this;
            this.d.g(fccs0, 0x7F0B16B9, 0x7F0B218D, 0x7F0B2193);  // id:icon
            this.al.d(fccs0);
            gczs gczs0 = new gczs(fccs0);
            this.aj.add(gczs0);
            String s2 = this.am;
            OrchestrationViewEvent.d(this.getContext(), s2, fccs0.c);
        }
        if((((gexj)this.aA).b & 4) != 0) {
            gcwf gcwf0 = (gcwf)this.getChildFragmentManager().g(0x7F0B0B47);  // id:address_fragment_holder
            this.ag = gcwf0;
            if(gcwf0 == null) {
                geui geui0 = ((gexj)this.aA).e;
                if(geui0 == null) {
                    geui0 = geui.d;
                }
                this.ag = gcwf.S(geui0, this.bU, this.cM());
                ca ca1 = new ca(this.getChildFragmentManager());
                ca1.t(0x7F0B0B47, this.ag);  // id:address_fragment_holder
                ca1.a();
            }
            this.ag.ac(this);
            this.al.d(this.ag);
            gczs gczs1 = new gczs(this.ag);
            this.aj.add(gczs1);
            String s3 = this.am;
            gamj gamj0 = this.ag.ak;
            OrchestrationViewEvent.d(this.getContext(), s3, gamj0);
        }
        if((((gexj)this.aA).b & 8) != 0) {
            gdak gdak0 = (gdak)this.getChildFragmentManager().g(0x7F0B174B);  // id:instrument_fragment_holder
            this.ah = gdak0;
            if(gdak0 == null) {
                geyg geyg0 = ((gexj)this.aA).f;
                if(geyg0 == null) {
                    geyg0 = geyg.a;
                }
                int v1 = this.bU;
                gewg gewg0 = ((gexj)this.aA).c;
                if(gewg0 == null) {
                    gewg0 = gewg.a;
                }
                this.ah = fbgn.p(geyg0, v1, gewg0.f, this.am, this.an, this.cM(), null);
                ca ca2 = new ca(this.getChildFragmentManager());
                ca2.t(0x7F0B174B, this.ah);  // id:instrument_fragment_holder
                ca2.a();
            }
            this.al.d(this.ah);
            gczs gczs2 = new gczs(this.ah);
            this.aj.add(gczs2);
            String s4 = this.am;
            OrchestrationViewEvent.d(this.getContext(), s4, this.ah.B());
        }
        if((((gexj)this.aA).b & 16) != 0) {
            view0.findViewById(0x7F0B107B).setVisibility(0);  // id:customer_legal_message_holder
            fcbz fcbz0 = (fcbz)this.getChildFragmentManager().g(0x7F0B107B);  // id:customer_legal_message_holder
            this.ai = fcbz0;
            if(fcbz0 == null) {
                gfbt gfbt0 = ((gexj)this.aA).g;
                if(gfbt0 == null) {
                    gfbt0 = gfbt.a;
                }
                this.ai = fcbz.Q(gfbt0, this.bU, this.cM());
                ca ca3 = new ca(this.getChildFragmentManager());
                ca3.t(0x7F0B107B, this.ai);  // id:customer_legal_message_holder
                ca3.a();
            }
            String s5 = this.am;
            gamj gamj1 = this.ai.c;
            OrchestrationViewEvent.d(this.getContext(), s5, gamj1);
        }
        return view0;
    }
}

