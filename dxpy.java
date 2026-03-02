import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.LowBalanceNotificationSettingsIntentArgs;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import dagger.internal.Preconditions;

public final class dxpy extends dxrr implements ednc {
    dxtn a;
    dxoe ag;
    private Button ah;
    private Button ai;
    private ComposeActionBar aj;
    private View ak;
    private TextView al;
    edrp b;
    fhwk c;
    fuok d;

    @Override  // dxrr
    protected final hjqn B() {
        LowBalanceNotificationSettingsIntentArgs lowBalanceNotificationSettingsIntentArgs0 = ednn.b(this).r;
        if(lowBalanceNotificationSettingsIntentArgs0 == null || lowBalanceNotificationSettingsIntentArgs0.a == null) {
            throw new IllegalArgumentException("Missing google payment method id from intent arguments");
        }
        IntentSource intentSource0 = lowBalanceNotificationSettingsIntentArgs0.b;
        gftb.check(intentSource0);
        this.aH = intentSource0;
        GooglePaymentMethodId googlePaymentMethodId0 = lowBalanceNotificationSettingsIntentArgs0.a;
        gftb.check(googlePaymentMethodId0);
        return ednj.c(googlePaymentMethodId0);
    }

    @Override  // dxrr
    protected final void D() {
        this.W(hagt.cb);
        String s = this.aJ.l;
        if(!TextUtils.isEmpty(s)) {
            TextView textView0 = (TextView)this.ak.findViewById(0x7F0B0563);  // id:MainMessage
            Context context0 = this.getContext();
            gftb.check(context0);
            textView0.setText(context0.getString(0x7F151F50, new Object[]{s}));  // string:pay_low_balance_notification_fragment_title_with_card "Low balance notification 
                                                                                 // for %1$s"
        }
        dxtn dxtn0 = this.b.a ? dxui.A(this.aJ, 0x7F152402) : dxtn.z(this.aJ, 0x7F151F4D);  // string:pay_wallet_low_balance_notification_amount_label "Send when balance is below"
        this.a = dxtn0;
        ca ca0 = new ca(this.getChildFragmentManager());
        ca0.G(0x7F0B00B7, this.a);  // id:BalanceThresholdContainer
        ca0.a();
        int v = 0x7F152406;  // string:pay_wallet_low_balance_notification_on_button "Turn on notifications"
        int v1 = 0x7F15240D;  // string:pay_wallet_low_balance_notification_save_button "Save changes"
        if(hwfk.al()) {
            this.I();
            if(hwfk.al()) {
                if(dxtg.m(this.aI)) {
                    v = 0x7F15240D;  // string:pay_wallet_low_balance_notification_save_button "Save changes"
                }
                ftts ftts0 = ftts.a(new fryr(v), new dxpv(this)).a();
                ftuy ftuy0 = new ftuy();
                ftuy0.h(ftts0);
                ftuy0.e(ftvb.d);
                if(dxtg.m(this.aI)) {
                    ftux ftux0 = ftts.a(new fryr(0x7F152403), new dxpw(this));  // string:pay_wallet_low_balance_notification_disable_button "Turn off notifications"
                    ftux0.c(ftvc.a);
                    ftuy0.i(ftux0.a());
                }
                this.aj.d(ftuy0.a());
            }
        }
        else {
            if(this.aJ.j == 0L) {
                Button button0 = this.ah;
                if(!this.b.a) {
                    v = 0x7F151F51;  // string:pay_low_balance_notification_on_button "Turn on notification"
                }
                button0.setText(v);
                this.ai.setVisibility(4);
            }
            else {
                Button button1 = this.ah;
                if(!this.b.a) {
                    v1 = 0x7F1508FE;  // string:common_update "Update"
                }
                button1.setText(v1);
                this.ai.setVisibility(0);
            }
            this.ah.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                this.X(hagp.f);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtum.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gtum)hftp0.b_message).c = 1;
                gtlg gtlg0 = edok.a(this.a.y(), this.aJ.g);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gtum gtum0 = (gtum)hftp0.b_message;
                gtlg0.getClass();
                gtum0.d = gtlg0;
                gtum0.b |= 1;
                gtum gtum1 = (gtum)hftp0.N_build();
                if(gtuk.b(this.aI.c) != 4) {
                    this.Z(gtum1);
                    return;
                }
                dxup dxup0 = this.az;
                ProtoSafeParcelable protoSafeParcelable0 = ftqe.a(((MessageLite)gtum1));
                dxup0.b(dxup0.b.getString(0x7F1521FE), protoSafeParcelable0);  // string:pay_setting_warning_text_low_balance_notification "Turning on low balance 
                                                                               // notifications will turn off autoload"
            });
            this.ai.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                this.X(hagp.g);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtum.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gtum)hftp0.b_message).c = 3;
                this.Z(((gtum)hftp0.N_build()));
            });
            if(this.b.a) {
                if(this.aJ.j == 0L) {
                    this.al.setText("Set up low balance notifications");
                    return;
                }
                this.al.setText("Manage low balance notifications");
            }
        }
    }

    // Detected as a lambda impl.
    public final void E() {
        this.X(hagp.g);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtum.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtum)hftp0.b_message).c = 3;
        this.Z(((gtum)hftp0.N_build()));
    }

    @Override  // ednc
    public final boolean F() {
        return hwik.h();
    }

    // Detected as a lambda impl.
    public final void H() {
        this.X(hagp.f);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtum.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtum)hftp0.b_message).c = 1;
        gtlg gtlg0 = edok.a(this.a.y(), this.aJ.g);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtum gtum0 = (gtum)hftp0.b_message;
        gtlg0.getClass();
        gtum0.d = gtlg0;
        gtum0.b |= 1;
        gtum gtum1 = (gtum)hftp0.N_build();
        if(gtuk.b(this.aI.c) != 4) {
            this.Z(gtum1);
            return;
        }
        dxup dxup0 = this.az;
        ProtoSafeParcelable protoSafeParcelable0 = ftqe.a(((MessageLite)gtum1));
        dxup0.b(dxup0.b.getString(0x7F1521FE), protoSafeParcelable0);  // string:pay_setting_warning_text_low_balance_notification "Turning on low balance 
                                                                       // notifications will turn off autoload"
    }

    @Override  // dxrr
    protected final void I() {
        if(hwfk.al()) {
            ((ComposeViewHeader)this.ak.findViewById(0x7F0B0558)).b(new fuhm(new fugr(new fujl(new fryj(this.R()))), new fryr((dxtg.m(this.aI) ? 0x7F152404 : 0x7F152405)), null));  // id:LowBalanceNotificationViewHeader
        }
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.ag == null) {
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            doma doma0 = new doma(this);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.ag = new dxoe(doma0, eefy.a(this.Q()), dolg0, domv0);
        }
        this.ag.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        int v;
        if(hwfk.al()) {
            v = 0x7F0E0D6C;  // layout:wallet_low_balance_notification_settings_fragment_with_components
        }
        else {
            v = this.b.a ? 0x7F0E0D53 : 0x7F0E0706;  // layout:wallet_gm3_low_balance_notification_settings_fragment
        }
        View view0 = layoutInflater0.inflate(v, viewGroup0, false);
        this.ak = view0;
        view0.findViewById(0x7F0B01D6).setOnClickListener(new dxpx(this));  // id:CloseButton
        this.c.f(this.ak, this.c.a.a(0x39FCA));
        this.ah = (Button)this.ak.findViewById(0x7F0B0394);  // id:EnableNotificationButton
        this.ai = (Button)this.ak.findViewById(0x7F0B035A);  // id:DisableNotificationButton
        this.aj = (ComposeActionBar)this.ak.findViewById(0x7F0B0012);  // id:ActionBar
        this.al = (TextView)this.ak.findViewById(0x7F0B0557);  // id:LowBalanceNotificationDescription
        gged_interceptors gged0 = gged_interceptors.m(this.ah, this.ai);
        this.V(this.ak.findViewById(0x7F0B06D8), gged0, this.ak.findViewById(0x7F0B01EC), this.ak.findViewById(0x7F0B00B7), "Pay_low_balance_notification_enabled", this.aj);  // id:ProgressBar
        if(hwik.h()) {
            fuop.a(this.d, this.ak.findViewById(0x7F0B0735));  // id:RootView
        }
        return this.ak;
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        Context context0 = this.getContext();
        gftb.check(context0);
        dnqd.c(context0, "Pay_LowBalanceNotificationSettings");
    }

    @Override  // dxrr
    protected final ftej y(fsyk fsyk0, gtum gtum0) {
        return dxtg.d(fsyk0, gtum0, gtlg.a);
    }
}

