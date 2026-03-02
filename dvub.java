import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;

public final class dvub extends fyfx {
    public Valuable ag;
    public DialogInterface.OnDismissListener ah;
    public gfsx ai;
    dsio aj;
    bbng ak;
    dvfu al;
    public static final int am;
    private static final bboh an;
    private gucj ao;
    private gubi ap;
    private boolean aq;
    private boolean ar;
    private boolean as;

    static {
        dvub.an = bboh.b("Pay", bbcu.cZ);
    }

    public dvub() {
        this.ai = gfqx.a;
    }

    @Override  // de
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        fyfv fyfv0 = (fyfv)this.getDialog();
        if(fyfv0 == null) {
            return;
        }
        fyfv0.b();
        fyfv0.a().I(0);
        fyfv0.setOnShowListener(new dvtt(fyfv0));
        fyfv0.a().y = true;
        fyfv0.setOnDismissListener(this.ah);
    }

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            ((ggtj)dvub.an.i()).x("Valuable detail bottom sheet fragment arguments were null");
            return;
        }
        Valuable valuable0 = (Valuable)bundle1.getParcelable("VALUABLE");
        if(valuable0 != null) {
            this.ag = valuable0;
        }
        try {
            byte[] arr_b = bundle1.getByteArray("bottom_sheet_info");
            if(arr_b != null) {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gucj.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                this.ao = (gucj)hftv0;
            }
            byte[] arr_b1 = bundle1.getByteArray("pass_color_profile");
            if(arr_b1 != null) {
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gubi.a), arr_b1, 0, arr_b1.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                this.ap = (gubi)hftv1;
            }
        }
        catch(hfur hfur0) {
            a.ae(dvub.an.i(), "Cannot parse bottom sheet info or pass color profile to show as bottom sheet fragment.", hfur0);
        }
        if(hwia.c()) {
            this.aq = bundle1.getBoolean("deviceHandoffEducationScreenShownArg", false);
        }
        this.ar = bundle1.getBoolean("nfcEducationScreenShownArg", false);
        this.as = bundle1.getBoolean("shouldShowNfcEducationScreenArg", false);
    }

    @Override  // fyfx
    public final Dialog onCreateDialog(Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        int v = this.getResources().getDimensionPixelSize(0x7F070E40);  // dimen:pay_wallet_rounded_corner_size
        fyus fyus0 = new fyus();
        fyus0.h(((float)v));
        fyus0.f(((float)v));
        fyus0.b(0.0f);
        fyus0.d(0.0f);
        fyuj fyuj0 = new fyuj(new fyut(fyus0));
        Context context0 = this.getContext();
        if(context0 != null) {
            fyuj0.setTint(fipw.d.a(context0));
        }
        ((fyfv)dialog0).a().w(new dvtx(this, fyuj0));
        Window window0 = ((fyfv)dialog0).getWindow();
        if(window0 != null) {
            Context context1 = this.requireContext();
            window0.setNavigationBarColor(fipw.d.a(context1));
        }
        return dialog0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return layoutInflater0.inflate(0x7F0E075D, viewGroup0, true);  // layout:pay_valuable_detail_bottom_sheet_fragment
    }

    @Override  // de
    public final void onStart() {
        super.onStart();
        Context context0 = this.getContext();
        if(context0 != null) {
            fm fm0 = this.getChildFragmentManager();
            if(fm0.h("TAG_BOTTOM_SHEET_FRAGMENT") == null) {
                Intent intent0 = new Intent("com.google.android.gms.pay.pass.valuable.view.detail.VALUABLE_DETAIL_BOTTOM_SHEET").setClassName(context0, "com.google.android.gms.pay.main.PayActivity").putExtra("bottom_sheet_info", this.ao.toBytesArray()).putExtra("pass_color_profile", this.ap.toBytesArray()).putExtra("VALUABLE", this.ag).putExtra("KEY_USE_WALLET", true);
                if(hwia.c()) {
                    intent0.putExtra("deviceHandoffEducationScreenShownArg", this.aq);
                }
                intent0.putExtra("nfcEducationScreenShownArg", this.ar);
                intent0.putExtra("shouldShowNfcEducationScreenArg", this.as);
                dvts dvts0 = dvts.y(intent0);
                dvts0.an = this.ai;
                ca ca0 = new ca(fm0);
                ca0.u(0x7F0B1140, dvts0, "TAG_BOTTOM_SHEET_FRAGMENT");  // id:dialog_bottom_sheet_container
                ca0.f();
            }
            if(hwia.c()) {
                Dialog dialog0 = this.getDialog();
                if(dialog0 != null) {
                    if(hwev.c()) {
                        ComposeActionBar composeActionBar0 = (ComposeActionBar)this.getView().findViewById(0x7F0B0333);  // id:DeviceHandoffComposeActionBar
                        if(composeActionBar0 != null) {
                            dvty dvty0 = new dvty(this, dialog0);
                            ftts ftts0 = ftts.a(new fryr(0x7F150870), dvty0).a();  // string:common_got_it "Got it"
                            ftuy ftuy0 = new ftuy();
                            ftuy0.h(ftts0);
                            ftuy0.d(new frxp(0));
                            composeActionBar0.d(ftuy0.a());
                            composeActionBar0.setVisibility(0);
                        }
                    }
                    else {
                        ActionBar actionBar0 = (ActionBar)this.getView().findViewById(0x7F0B0332);  // id:DeviceHandoffActionBar
                        if(actionBar0 != null) {
                            actionBar0.l(new ftrz("Got it", new dvtu(this, dialog0)), null);
                            actionBar0.setVisibility(0);
                        }
                    }
                }
            }
            Dialog dialog1 = this.getDialog();
            if(dialog1 != null) {
                gftb.z(this.aj, "interactionStateManager must be set in init() method before");
                gftb.z(this.ak, "clock must be set in init() method before");
                gftb.z(this.al, "analyticsUtil must be set in init() method before");
                if(hwev.c()) {
                    ComposeActionBar composeActionBar1 = (ComposeActionBar)this.getView().findViewById(0x7F0B05E7);  // id:NfcEducationComposeActionBar
                    if(composeActionBar1 != null) {
                        dvtz dvtz0 = new dvtz(this, dialog1);
                        ftts ftts1 = ftts.a(new fryr(0x7F150870), dvtz0).a();  // string:common_got_it "Got it"
                        dvua dvua0 = new dvua(this, dialog1);
                        ftux ftux0 = ftts.a(new fryr(0x7F150821), dvua0);  // string:common_dont_show_again "Don\'t show again"
                        ftux0.c(ftvc.a);
                        ftts ftts2 = ftux0.a();
                        ftuy ftuy1 = new ftuy();
                        ftuy1.h(ftts1);
                        ftuy1.i(ftts2);
                        ftuy1.d(new frxp(0));
                        composeActionBar1.d(ftuy1.a());
                        composeActionBar1.setVisibility(0);
                    }
                }
                else {
                    ActionBar actionBar1 = (ActionBar)this.getView().findViewById(0x7F0B05E6);  // id:NfcEducationActionBar
                    if(actionBar1 != null) {
                        actionBar1.l(new ftrz("Got it", new dvtv(this, dialog1)), new ftrz("Don\'t show again", new dvtw(this, dialog1)));
                        actionBar1.setVisibility(0);
                    }
                }
            }
        }
    }

    public static dvub y(gucj gucj0, gubi gubi0, Valuable valuable0, boolean z, boolean z1, boolean z2) {
        dvub dvub0 = new dvub();
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("bottom_sheet_info", gucj0.toBytesArray());
        bundle0.putByteArray("pass_color_profile", gubi0.toBytesArray());
        if(hwia.c()) {
            bundle0.putBoolean("deviceHandoffEducationScreenShownArg", z);
        }
        bundle0.putBoolean("nfcEducationScreenShownArg", z1);
        bundle0.putBoolean("shouldShowNfcEducationScreenArg", z2);
        if(valuable0 != null) {
            bundle0.putParcelable("VALUABLE", valuable0);
        }
        dvub0.setArguments(bundle0);
        return dvub0;
    }

    public final void z(dsio dsio0, bbng bbng0, dvfu dvfu0) {
        this.aj = dsio0;
        this.ak = bbng0;
        this.al = dvfu0;
    }
}

