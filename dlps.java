import android.accounts.Account;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class dlps extends dokz implements ednc {
    public static final Set a;
    public fhwb ag;
    public fhvw ah;
    public fich ai;
    public domj aj;
    public edtj ak;
    public fhwk al;
    public ednv am;
    public dlqg an;
    public fuok ao;
    public acp ap;
    public ficj aq;
    public azts ar;
    private final ibnn as;
    private AndroidInjector at;
    private final ibnn au;
    private final ibnn av;
    private final ibnn aw;
    public Account b;
    public du c;
    public dmgi d;

    static {
        dlps.a = ibqg.c(new gjil[]{gjil.j, gjil.s, gjil.p});
    }

    public dlps() {
        dlpf dlpf0 = new dlpf(this);
        dlpp dlpp0 = new dlpp(new dlpo(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dlpp0);
        this.as = new lsd(new ibuk(dlqf.class), new dlpq(ibnn0), dlpf0, new dlpr(ibnn0));
        this.au = new ibnz(new dlpg(this));
        this.av = new ibnz(new dlph(this));
        this.aw = new ibnz(new dloy(this));
    }

    public final dlqf A() {
        return (dlqf)this.as.a();
    }

    public final edtj B() {
        edtj edtj0 = this.ak;
        if(edtj0 != null) {
            return edtj0;
        }
        ibuq.j("walletBenderApi");
        return null;
    }

    public final fhwb C() {
        fhwb fhwb0 = this.ag;
        if(fhwb0 != null) {
            return fhwb0;
        }
        ibuq.j("semanticLogger");
        return null;
    }

    public final gjil D() {
        return (gjil)this.aw.a();
    }

    public final String E() {
        return (String)this.au.a();
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    public final boolean G() {
        return ((Boolean)this.av.a()).booleanValue();
    }

    public final void H(dlqf dlqf0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xFCFC2CAC);
        if((((v & 6) == 0 ? (goz1.Z(dlqf0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            dlqh dlqh0 = dlqf0.a();
            gui gui0 = ltd.c(dlqf0.d.a, dlqh0, goz1);
            hey hey0 = hfc.e;
            hfc hfc0 = cci.b(dls.v(hey0));
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v1 = dlox.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            dlqt dlqt0 = ((dlqh)gui0.a()).a;
            goz1.M(0xDEE83781);
            if((dlqt0 instanceof dlqr) || ibuq.m(dlqt0, dlqs.a)) {
                hfc hfc2 = dls.v(hey0);
                iau iau1 = dii.a(dho.e, hei.n, goz1, 54);
                int v2 = dlox.a(gol.c(goz1));
                gzk gzk1 = goz1.ak();
                hfc hfc3 = hew.c(goz1, hfc2);
                goz1.O();
                if(goz1.x) {
                    goz1.t(ibth0);
                }
                else {
                    goz1.T();
                }
                guo.b(goz1, iau1, ibtw0);
                guo.b(goz1, gzk1, ibtw1);
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                    Integer integer1 = v2;
                    goz1.P(integer1);
                    goz1.p(integer1, ibtw2);
                }
                guo.a(goz1, ibts0);
                guo.b(goz1, hfc3, ibtw3);
                ftyy.b(new frxv(new fryn(fuqd.a, 0, 6), new frxt(0x7FFFFFFF, 6)), null, dls.e(dls.o(hey0, 120.0f), 120.0f), null, null, 0.0f, new hlb(fpu.a(goz1).a, 5), goz1, 440, 56);
                goz1.z();
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dlpa(this, dlqf0, v);
        }
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.at == null) {
            doly doly0 = dolz.a(this);
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            dxed dxed0 = dxee.a(doly0);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.at = new dlqm(dolg0, dxed0, doly0, domv0);
        }
        AndroidInjector androidInjector0 = this.at;
        if(androidInjector0 == null) {
            throw new IllegalStateException("component was null after injection");
        }
        androidInjector0.inject(this);
        this.ap = this.registerForActivityResult(new adt(), new dloz(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        if(hwev.c()) {
            View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
            if(viewGroup0 == null) {
                throw new IllegalStateException("root container is not available");
            }
            ((ComposeView)view0).a(new gze(0xE9656D85, true, new dlpj(this)));
            return view0;
        }
        View view1 = layoutInflater0.inflate(0x7F0E0063, viewGroup0, false);  // layout:add_bank_account_fragment
        ViewStub viewStub0 = (ViewStub)view1.findViewById(0x7F0B06E8);  // id:ProgressStub
        if(viewStub0 != null) {
            viewStub0.setLayoutResource(0x7F0E0064);  // layout:add_bank_account_progress
            viewStub0.inflate();
        }
        fuok fuok0 = this.ao;
        if(fuok0 == null) {
            ibuq.j("edgeToEdgeStyler");
            fuok0 = null;
        }
        ibuq.c(view1);
        fuop.g(fuok0, view1);
        ibuq.c(view1);
        ViewGroup viewGroup1 = (ViewGroup)view1.findViewById(0x7F0B06D7);  // id:Progress
        viewGroup1.setVisibility(0);
        Drawable drawable0 = ((ImageView)viewGroup1.findViewById(0x7F0B2325)).getDrawable();  // id:tp_progress
        ibuq.d(drawable0, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
        ((Animatable)drawable0).start();
        return view1;
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        ficj ficj0 = this.aq;
        if(ficj0 == null) {
            ibuq.j("veSloSpan");
            ficj0 = null;
        }
        fhwb fhwb0 = this.C();
        fhvz fhvz0 = fhwa.a(257900);
        fhvz0.c(fhwp.b(this.y().name));
        fhvz0.b(ficj0.a());
        fhwb0.a(fhvz0.a());
        ficj0.close();
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        dmgi dmgi0 = this.d;
        if(dmgi0 == null) {
            ibuq.j("clearcutEventLogger");
            dmgi0 = null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hana.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hana)hftp1.b_message).b = "ADD_BANK_ACCOUNT_PAGE";
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hana hana0 = (hana)hftp1.N_build();
        hana0.getClass();
        hapr0.r = hana0;
        hapr0.b |= 0x200;
        dmgi0.b(((hapr)hftp0.N_build()));
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        if(hwfk.a.b().ct()) {
            icbb.b(lpt.a(this), null, null, new dlpn(this, null), 3);
        }
        fich fich0 = this.ai;
        if(fich0 == null) {
            ibuq.j("veSloManager");
            fich0 = null;
        }
        this.aq = fich0.a(1L, TimeUnit.MINUTES);
        fhwb fhwb0 = this.C();
        fhvz fhvz0 = fhwa.a(0x399F2);
        fhvz0.c(fhwp.b(this.y().name));
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        gjip gjip0 = gjio.a(((ProtoLiteMessage)gjcf.a).v_newBuilder());
        gjil gjil0 = this.D();
        ibuq.f(gjil0, "value");
        ProtoLiteBuilder hftp0 = gjip0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjcf gjcf0 = (gjcf)hftp0.b_message;
        gjcf0.e = gjil0.a();
        gjcf0.b |= 4;
        String s = this.E();
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjcf gjcf1 = (gjcf)hftp0.b_message;
            gjcf1.b |= 2;
            gjcf1.d = s;
        }
        gjca0.d(gjip0.a());
        fhvz0.b(douc.a(gjca0.a()));
        fhwb0.a(fhvz0.a());
        icmq icmq0 = this.A().c.c;
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new dlpm(lps0, icmq0, null, this), 3);
        if(hwpv.c()) {
            ednv ednv0 = this.am;
            if(ednv0 == null) {
                ibuq.j("deviceLockChecker");
                ednv0 = null;
            }
            if(!ednv0.a()) {
                fhwb fhwb1 = this.C();
                fhvz fhvz1 = fhwa.a(0x3DC17);
                fhvz1.c(fhwp.b(this.y().name));
                fhwb1.a(fhvz1.a());
                xob xob0 = this.ao();
                dlpb dlpb0 = new dlpb(this);
                dlpc dlpc0 = new dlpc(this);
                fyju fyju0 = new fyju(xob0, 0x7F160DA5);  // style:ThemeOverlay.GoogleMaterial.MaterialAlertDialog
                fyju0.N(0x7F1520D6);  // string:pay_screen_lock_title "Pix requires a screen lock"
                fyju0.C(0x7F1520D4);  // string:pay_screen_lock_body "You need to set up a screen lock to use Pix"
                fyju0.L(0x7F1520D5, dlpb0);  // string:pay_screen_lock_cta "Set up screen lock"
                fyju0.F(0x7F15081F, new edws(dlpc0));  // string:common_dismiss "Dismiss"
                fyju0.I(dlpc0);
                fyju0.create().show();
                return;
            }
        }
        dlqf dlqf0 = this.A();
        dlow dlow0 = new dlow(this.G(), this.E());
        if(hwfk.d() && ibuq.m(dlqf0.e.d("HAS_STARTED_BENDER_KEY"), Boolean.valueOf(true)) || !ibuq.m(dlqf0.a().a, dlqr.a)) {
            return;
        }
        icbb.b(lsc.a(dlqf0), null, null, new dlqc(dlqf0, dlow0, null), 3);
    }

    public final Account y() {
        Account account0 = this.b;
        if(account0 != null) {
            return account0;
        }
        ibuq.j("account");
        return null;
    }

    public final du z() {
        du du0 = this.c;
        if(du0 != null) {
            return du0;
        }
        ibuq.j("fragment");
        return null;
    }
}

