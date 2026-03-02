import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.pass.common.template.detail.DetailTemplate;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class dvfm extends dokz implements douk, fshb, fshg {
    public AndroidInjector a;
    public fshk ag;
    public static final int ah;
    private static final bboh ai;
    private static final gucv aj;
    private static final gubi ak;
    private DetailTemplate al;
    private View am;
    public Account b;
    public dspv c;
    public dspu d;

    static {
        dvfm.ai = bboh.b("Pay", bbcu.cZ);
        gulh gulh0 = gulg.a(((gucu)((ProtoLiteMessage)gucv.a).v_newBuilder()));
        gumq gumq0 = gump.a(((ProtoLiteMessage)gupj.a).v_newBuilder());
        guny guny0 = gunx.a(((ProtoLiteMessage)gunw.a).v_newBuilder());
        guny0.c("Unimplemented");
        gunw gunw0 = guny0.a();
        ibuq.f(gunw0, "value");
        ProtoLiteBuilder hftp0 = gumq0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gupj gupj0 = (gupj)hftp0.b_message;
        gunw0.getClass();
        gupj0.c = gunw0;
        gupj0.b |= 1;
        gumo gumo0 = gumn.a(((ProtoLiteMessage)gupi.a).v_newBuilder());
        gufj gufj0 = gufi.a(((ProtoLiteMessage)guez.a).v_newBuilder());
        gueu gueu0 = guet.a(((guex)((ProtoLiteMessage)guey.a).v_newBuilder()));
        gueu0.d();
        gukt gukt0 = guks.a(((ProtoLiteMessage)gufc.a).v_newBuilder());
        gukt0.f();
        gukt0.d(gufa.O);
        gueu0.b(gukt0.a());
        gufj0.c(gueu0.a());
        gufj0.d("Back");
        gumo0.b(gufj0.a());
        gumq0.b(gumo0.a());
        gulh0.b(gumq0.a());
        gulh0.h();
        gulb gulb0 = gula.a(((ProtoLiteMessage)gucn.a).v_newBuilder());
        gulf gulf0 = gule.a(((gucs)((ProtoLiteMessage)guct.a).v_newBuilder()));
        gulf0.d();
        guld guld0 = gulc.a(((ProtoLiteMessage)gucr.a).v_newBuilder());
        gulr gulr0 = gulq.a(((guhj)((ProtoLiteMessage)guhl.a).v_newBuilder()));
        gufl gufl0 = gufk.a(((ProtoLiteMessage)gunu.a).v_newBuilder());
        guny guny1 = gunx.a(((ProtoLiteMessage)gunw.a).v_newBuilder());
        guny1.c("Unimplemented, this is a fallback");
        gufl0.c(guny1.a());
        guny guny2 = gunx.a(((ProtoLiteMessage)gunw.a).v_newBuilder());
        guny2.c("Unimplemented");
        gufl0.b(guny2.a());
        gulr0.c(gufl0.a());
        gufn gufn0 = gufm.a(((ProtoLiteMessage)gufy.a).v_newBuilder());
        gufn0.c(gujx.b);
        gulr0.b(gufn0.a());
        guld0.h(gulr0.a());
        gulf0.c(guld0.a());
        gulb0.b(gulf0.a());
        gulh0.e(gulb0.a());
        dvfm.aj = gulh0.a();
        gukz gukz0 = guky.a(((ProtoLiteMessage)gubi.a).v_newBuilder());
        hjig hjig0 = hjif.a(((ProtoLiteMessage)hjie.a).v_newBuilder());
        hjig0.e(0.909804f);
        hjig0.d(0.917647f);
        hjig0.c(0.933333f);
        gukz0.b(hjig0.a());
        hjig hjig1 = hjif.a(((ProtoLiteMessage)hjie.a).v_newBuilder());
        hjig1.e(0.909804f);
        hjig1.d(0.917647f);
        hjig1.c(0.933333f);
        hjie hjie0 = hjig1.a();
        ibuq.f(hjie0, "value");
        ProtoLiteBuilder hftp1 = gukz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gubi gubi0 = (gubi)hftp1.b_message;
        hjie0.getClass();
        gubi0.c = hjie0;
        gubi0.b |= 1;
        dvfm.ak = gukz0.a();
    }

    @Override  // douk
    public final douj A() {
        return douj.a;
    }

    @Override  // fshg
    public final gfsx bA() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bG() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bH() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gged_interceptors bI() {
        return ggna.a;
    }

    @Override  // fshg
    public final gged_interceptors bJ() {
        return ggna.a;
    }

    @Override  // fshg
    public final guut bK() {
        return guut.a;
    }

    @Override  // fshg
    public final String bL() {
        return "";
    }

    @Override  // fshg
    public final boolean bN() {
        return true;
    }

    @Override  // fshg
    public final boolean bO() {
        return false;
    }

    @Override  // fshg
    public final boolean bP() {
        return false;
    }

    @Override  // fshg
    public final boolean bQ() {
        return false;
    }

    @Override  // fshg
    public final boolean bR() {
        return false;
    }

    @Override  // fshg
    public final boolean bS() {
        return false;
    }

    @Override  // fshg
    public final boolean bT() {
        return false;
    }

    @Override  // fshg
    public final gfsx bt() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bu() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx by() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bz() {
        return gfqx.a;
    }

    @Override  // fshb
    public final int kd() {
        return 2;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.a == null) {
            Preconditions.b(domu.a(AppContextProvider.a()));
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            this.a = new dvfl(dolg0);
        }
        AndroidInjector androidInjector0 = this.a;
        if(androidInjector0 == null) {
            ibuq.j("injector");
            androidInjector0 = null;
        }
        androidInjector0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        fshk fshk1;
        dspu dspu1;
        dspv dspv1;
        gubi gubi0;
        gucv gucv0;
        DetailTemplate detailTemplate2;
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E0D7B, viewGroup0, false);  // layout:wallet_pass_template_info
        this.am = view0;
        if(view0 == null) {
            ibuq.j("fragmentView");
            view0 = null;
        }
        DetailTemplate detailTemplate0 = (DetailTemplate)view0.findViewById(0x7F0B032C);  // id:DetailTemplate
        this.al = detailTemplate0;
        if(detailTemplate0 == null) {
            ibuq.j("detailTemplate");
            detailTemplate0 = null;
        }
        detailTemplate0.i(this, gfqx.a);
        DetailTemplate detailTemplate1 = this.al;
        if(detailTemplate1 == null) {
            ibuq.j("detailTemplate");
            detailTemplate2 = null;
        }
        else {
            detailTemplate2 = detailTemplate1;
        }
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            gucv0 = null;
        }
        else if(bundle1.containsKey("pass_detail_template_info")) {
            byte[] arr_b = bundle1.getByteArray("pass_detail_template_info");
            if(arr_b == null) {
                ((ggtj)dvfm.ai.j()).x("[PTF] Pass detail template info bytes are null.");
                gucv0 = null;
            }
            else {
                ((ggtj)dvfm.ai.h()).B("[PTF] detailTemplate: %s", arr_b);
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gucv.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    gucv0 = (gucv)hftv0;
                }
                catch(hfur hfur0) {
                    a.ae(dvfm.ai.i(), "[PTF] Unable to de-serialize detail template info data", hfur0);
                    gucv0 = null;
                }
            }
        }
        else {
            gucv0 = null;
        }
        if(gucv0 == null) {
            gucv0 = dvfm.aj;
        }
        Bundle bundle2 = this.getArguments();
        if(bundle2 == null) {
            gubi0 = null;
        }
        else if(bundle2.containsKey("pass_color_profile")) {
            byte[] arr_b1 = bundle2.getByteArray("pass_color_profile");
            if(arr_b1 == null) {
                ((ggtj)dvfm.ai.j()).x("[PTF] Pass color profile bytes are null.");
                gubi0 = null;
            }
            else {
                try {
                    hftc hftc1 = hftc.a();
                    ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gubi.a), arr_b1, 0, arr_b1.length, hftc1);
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    gubi0 = (gubi)hftv1;
                }
                catch(hfur hfur1) {
                    a.ae(dvfm.ai.i(), "[PTF] Unable to de-serialize color profile data", hfur1);
                    gubi0 = null;
                }
            }
        }
        else {
            gubi0 = null;
        }
        if(gubi0 == null) {
            gubi0 = dvfm.ak;
        }
        dspv dspv0 = this.c;
        if(dspv0 == null) {
            ibuq.j("defaultPassTargetCallback");
            dspv1 = null;
        }
        else {
            dspv1 = dspv0;
        }
        dspu dspu0 = this.d;
        if(dspu0 == null) {
            ibuq.j("defaultPassSwitchCallback");
            dspu1 = null;
        }
        else {
            dspu1 = dspu0;
        }
        fshk fshk0 = this.ag;
        if(fshk0 == null) {
            ibuq.j("defaultDynamicFormattedValueCallback");
            fshk1 = null;
        }
        else {
            fshk1 = fshk0;
        }
        detailTemplate2.o(gucv0, gubi0, this, dspv1, dspu1, fshk1);
        View view1 = this.am;
        if(view1 == null) {
            ibuq.j("fragmentView");
            return null;
        }
        return view1;
    }
}

