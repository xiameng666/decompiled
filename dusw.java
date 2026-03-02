import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class dusw extends dokz implements ednc {
    public static final dusk a;
    public ibnf b;
    public AndroidInjector c;
    private final ibnn d;

    static {
        dusw.a = new dusk();
    }

    public dusw() {
        dusr dusr0 = new dusr(this);
        dust dust0 = new dust(new duss(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dust0);
        this.d = new lsd(new ibuk(duux.class), new dusu(ibnn0), dusr0, new dusv(ibnn0));
    }

    @Override  // ednc
    public final boolean F() {
        return hwev.c();
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.c == null) {
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            dmgr dmgr0 = new dmgr("com.google.android.gms");
            doma doma0 = new doma(this);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.c = new dush(dmgr0, doma0, dolg0, domv0);
        }
        AndroidInjector androidInjector0 = this.c;
        if(androidInjector0 == null) {
            ibuq.j("injector");
            androidInjector0 = null;
        }
        androidInjector0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        gtxf gtxf0 = gtxf.b(bundle1.getInt("mdoc_type", 0));
        if(gtxf0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if(hwmp.o()) {
            boolean z = hwmp.n();
            int v = gtxf0.ordinal();
            if(v != 1) {
                switch(v) {
                    case 2: {
                        if(!z || !hwpi.g()) {
                            goto label_16;
                        }
                        break;
                    }
                    case 3: {
                        if(!z || !hwrn.d() || !hwrn.c()) {
                            goto label_16;
                        }
                        break;
                    }
                    default: {
                        goto label_16;
                    }
                }
            }
            else if(!z || !hwly.m()) {
            label_16:
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(hwpi.e())).addFlags(0x10000000);
                ibuq.e(intent0, "addFlags(...)");
                this.requireContext().startActivity(intent0);
                this.ar();
            }
        }
        duux duux0 = this.z();
        duut duut0 = duut.a(((duut)duux0.d.b()), null, true, null, 1);
        duux0.d.g(duut0);
        icbb.b(lsc.a(duux0), null, null, new duuw(duux0, gtxf0, null), 3);
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ComposeView)view0).a(new gze(0x5B2F75A9, true, new dusp(this, gtxf0)));
        return view0;
    }

    public final void y(gtxf gtxf0, ibts ibts0, ibth ibth0, ibth ibth1, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        ibuq.f(ibts0, "onIssuerSelected");
        ibuq.f(ibth0, "onNavIconClick");
        ibuq.f(ibth1, "onIdPassTipClicked");
        goz goz1 = goz0.ao(0x10B8E742);
        int v1 = (v & 6) == 0 ? (goz1.V(gtxf0.ordinal()) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        int v2 = (0x30000 & v) == 0 ? v1 | 0x6000 | (goz1.Z(this) ? 0x20000 : 0x10000) : v1 | 0x6000;
        if((74899 & v2) == 74898 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc.e;
            duut duut0 = (duut)gtr.a(this.z().c, goz1).a();
            if(duut0.b) {
                goz1.M(0xC61C4A22);
                duus.f(hfc1, goz1, v2 >> 12 & 14);
                goz1.x();
            }
            else if(duut0.c == null) {
                hkam hkam0 = duut0.a;
                if(hkam0 == null || hkam0.b.isEmpty()) {
                    goz1.M(0xC61C63C1);
                    duus.d(hfc1, ibth0, goz1, v2 >> 12 & 14 | v2 >> 3 & 0x70);
                    goz1.x();
                }
                else if(hkam0.b.size() == 1) {
                    goz1.M(-971213620);
                    goz1.x();
                    hfuo hfuo0 = hkam0.b;
                    ibuq.e(hfuo0, "getIssuerList(...)");
                    Object object0 = ibpo.R(hfuo0);
                    ibuq.e(object0, "first(...)");
                    ibts0.a(object0);
                }
                else {
                    goz1.M(-971210295);
                    hfuo hfuo1 = hkam0.b;
                    ibuq.e(hfuo1, "getIssuerList(...)");
                    duus.c(hfc1, gtxf0, hfuo1, ibts0, ibth0, ibth1, goz1, v2 >> 12 & 14 | v2 << 3 & 0x70 | v2 << 6 & 0x1C00 | 0xE000 & v2 << 6 | v2 << 6 & 0x70000);
                    goz1.x();
                }
            }
            else {
                goz1.M(0xC61C63C1);
                duus.d(hfc1, ibth0, goz1, v2 >> 12 & 14 | v2 >> 3 & 0x70);
                goz1.x();
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dusj(this, gtxf0, ibts0, ibth0, ibth1, hfc1, v);
        }
    }

    private final duux z() {
        return (duux)this.d.a();
    }
}

