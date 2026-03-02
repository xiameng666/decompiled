import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import java.util.ArrayList;
import java.util.List;

public final class fcbr extends gdak {
    gcwf a;
    private final gdew ag;
    private String ah;
    fcbm b;
    gdak c;
    final ArrayList d;

    public fcbr() {
        this.ag = new gdew();
        this.d = new ArrayList(3);
    }

    @Override  // gami
    public final gamj B() {
        return null;
    }

    @Override  // gdak
    protected final gewg C() {
        this.aj();
        gewg gewg0 = ((geyq)this.aA).c;
        return gewg0 == null ? gewg.a : gewg0;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)geyq.a).jf(7, null);
    }

    @Override  // gdcm
    protected final void M() {
        boolean z = this.ca;
        gcwf gcwf0 = this.a;
        if(gcwf0 != null) {
            gcwf0.ll(z);
        }
        fcbm fcbm0 = this.b;
        if(fcbm0 != null) {
            fcbm0.ll(z);
        }
        gdak gdak0 = this.c;
        if(gdak0 != null) {
            gdak0.ll(z);
        }
    }

    @Override  // gdak
    public final ArrayList aY() {
        return null;
    }

    @Override  // gdak
    public final void lW(int v) {
    }

    @Override  // gdaa
    public final boolean la() {
        return this.b == null || this.b.la() ? this.c == null || this.c.la() : false;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.d;
    }

    @Override  // gami
    public final List li() {
        List list0 = new ArrayList(3);
        gcwf gcwf0 = this.a;
        if(gcwf0 != null) {
            ((ArrayList)list0).add(gcwf0);
        }
        fcbm fcbm0 = this.b;
        if(fcbm0 != null) {
            ((ArrayList)list0).add(fcbm0);
        }
        gdak gdak0 = this.c;
        if(gdak0 != null) {
            ((ArrayList)list0).add(gdak0);
        }
        return list0;
    }

    @Override  // gdak
    public final void lr() {
        super.lr();
        gcwf gcwf0 = this.a;
        if(gcwf0 != null) {
            gcwf0.lr();
        }
        fcbm fcbm0 = this.b;
        if(fcbm0 != null) {
            fcbm0.lr();
        }
        gdak gdak0 = this.c;
        if(gdak0 != null) {
            gdak0.lr();
        }
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        if(this.a != null && this.a.ly(getg0)) {
            return true;
        }
        return this.b == null || !this.b.ly(getg0) ? this.c != null && this.c.ly(getg0) : true;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ag;
    }

    @Override  // gcyg
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.ah = this.getArguments().getString("analyticsSessionId");
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0D34, viewGroup0, false);  // layout:wallet_fragment_fix_info_form
        fm fm0 = this.getChildFragmentManager();
        geyq geyq0 = (geyq)this.aA;
        if((geyq0.b & 4) != 0) {
            gcwf gcwf0 = (gcwf)fm0.h((geyq0.d == null ? geui.d : geyq0.d).g);
            this.a = gcwf0;
            if(gcwf0 == null) {
                geui geui0 = ((geyq)this.aA).d;
                if(geui0 == null) {
                    geui0 = geui.d;
                }
                this.a = gcwf.S(geui0, this.bU, this.cM());
                ca ca0 = new ca(fm0);
                gcwf gcwf1 = this.a;
                geui geui1 = ((geyq)this.aA).d;
                if(geui1 == null) {
                    geui1 = geui.d;
                }
                ca0.z(0x7F0B0B47, gcwf1, geui1.g);  // id:address_fragment_holder
                ca0.a();
            }
            this.ag.d(this.a);
            gczs gczs0 = new gczs(this.a);
            this.d.add(gczs0);
            String s = this.ah;
            gamj gamj0 = this.a.ak;
            OrchestrationViewEvent.d(this.getContext(), s, gamj0);
        }
        geyq geyq1 = (geyq)this.aA;
        if((geyq1.b & 8) != 0) {
            fcbm fcbm0 = (fcbm)fm0.h((geyq1.e == null ? gfaq.b : geyq1.e).e);
            this.b = fcbm0;
            if(fcbm0 == null) {
                gfaq gfaq0 = ((geyq)this.aA).e;
                if(gfaq0 == null) {
                    gfaq0 = gfaq.b;
                }
                this.b = fcbm.Q(gfaq0, this.bU, this.cM());
                ca ca1 = new ca(fm0);
                fcbm fcbm1 = this.b;
                gfaq gfaq1 = ((geyq)this.aA).e;
                if(gfaq1 == null) {
                    gfaq1 = gfaq.b;
                }
                ca1.z(0x7F0B1066, fcbm1, gfaq1.e);  // id:credit_card_update_fragment_holder
                ca1.a();
            }
            this.ag.d(this.b);
            gczs gczs1 = new gczs(this.b);
            this.d.add(gczs1);
            String s1 = this.ah;
            gamj gamj1 = this.b.ag;
            OrchestrationViewEvent.d(this.getContext(), s1, gamj1);
        }
        if((((geyq)this.aA).b & 16) != 0) {
            gdak gdak0 = (gdak)fm0.g(0x7F0B174B);  // id:instrument_fragment_holder
            this.c = gdak0;
            if(gdak0 == null) {
            label_54:
                geyg geyg1 = ((geyq)this.aA).f;
                if(geyg1 == null) {
                    geyg1 = geyg.a;
                }
                int v = this.bU;
                gewg gewg0 = ((geyq)this.aA).c;
                if(gewg0 == null) {
                    gewg0 = gewg.a;
                }
                this.c = fbgn.p(geyg1, v, gewg0.f, this.ah, gklu.b, this.cM(), null);
                ca ca2 = new ca(fm0);
                ca2.G(0x7F0B174B, this.c);  // id:instrument_fragment_holder
                ca2.a();
            }
            else {
                geyg geyg0 = ((geyq)this.aA).f;
                if(geyg0 == null) {
                    geyg0 = geyg.a;
                }
                if(!fbgn.H(gdak0, geyg0)) {
                    goto label_54;
                }
            }
            this.ag.d(this.c);
            gczs gczs2 = new gczs(this.c);
            this.d.add(gczs2);
            String s2 = this.ah;
            OrchestrationViewEvent.d(this.getContext(), s2, this.c.B());
        }
        return view0;
    }
}

