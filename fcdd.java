import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.wallet.activity.GenericDelegatorChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.redirect.PopupRedirectChimeraActivity;
import com.google.android.gms.wallet.ui.verifypin.KeyPadView;
import com.google.android.gms.wallet.ui.verifypin.PinDotsView;
import com.google.android.wallet.clientlog.TimedEvent;
import java.util.ArrayList;

public final class fcdd extends faxy implements View.OnClickListener, fbei, gcyt {
    public StringBuilder c;
    public TextView d;
    public TimedEvent e;
    public int f;
    Button g;
    final Handler h;
    PinDotsView i;
    fbfn j;
    int k;
    private static final String l;
    private final fcdc m;
    private Button n;
    private BuyFlowConfig o;
    private gcyu p;
    private gevd q;
    private KeyPadView r;
    private boolean s;
    private boolean t;

    static {
        fcdd.l = "verifyPinActivityDelegate:TransactionRetainerFragment";
    }

    public fcdd(GenericDelegatorChimeraActivity genericDelegatorChimeraActivity0) {
        super(genericDelegatorChimeraActivity0);
        this.m = new fcdc(this);
        this.f = 0;
        this.h = new clht();
    }

    @Override  // faxy
    public final void a(Bundle bundle0) {
        super.a(bundle0);
        fbgn.D(this.a, ((BuyFlowConfig)this.a.getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig")), fbgn.e, true);
    }

    @Override  // gcyt
    public final void aA(int v) {
        this.t = v == 1;
    }

    @Override  // fbei
    public final void aJ(Bundle bundle0) {
        int v2;
        String s = fbej.b(bundle0);
        switch(s.hashCode()) {
            case -709064469: {
                if(s.equals("setResultAndFinish")) {
                    String s1 = bundle0.getString("encodedPreauthProofToken");
                    Intent intent0 = new Intent();
                    intent0.putExtra("encodedPreauthProofToken", s1);
                    intent0.putExtra("shouldPerformFingerprintAuthEnrollment", this.t);
                    GenericDelegatorChimeraActivity genericDelegatorChimeraActivity0 = this.a;
                    genericDelegatorChimeraActivity0.setResult(-1, intent0);
                    genericDelegatorChimeraActivity0.finish();
                    return;
                }
                break;
            }
            case -334152750: {
                if(s.equals("doAnimateError")) {
                    this.m(bundle0.getInt("errorCode"));
                    return;
                }
                break;
            }
            case 0x24925F4D: {
                if(s.equals("doAnimateSuccess")) {
                    String s2 = bundle0.getString("encodedPreauthProofToken");
                    this.i.b(2);
                    fbej fbej0 = fbej.a(this, "setResultAndFinish");
                    fbej0.a.putString("encodedPreauthProofToken", s2);
                    long v = this.i.a();
                    this.h.postDelayed(fbej0, v);
                    return;
                }
                break;
            }
            case 0x57960CC0: {
                if(s.equals("handleError")) {
                    int v1 = bundle0.getInt("errorCode");
                    TextView textView0 = this.d;
                    if(v1 == 1) {
                        v2 = 0x7F15354B;  // string:wallet_pin_invalid "Wrong PIN. Please try again."
                    }
                    else if(v1 == 2) {
                        v2 = 0x7F15354C;  // string:wallet_pin_locked "PIN locked. Please reset your PIN."
                    }
                    else {
                        v2 = v1 == 100 ? 0x7F1535AE : 0x7F15354A;  // string:wallet_uic_network_error_message "A network connection is required to complete 
                                                                   // this task. Please connect to a Wi-Fi or data network."
                    }
                    textView0.setText(v2);
                    this.d.setVisibility(0);
                    this.d.announceForAccessibility(this.d.getText());
                    this.c.setLength(0);
                    this.n(true);
                    return;
                }
                break;
            }
        }
    }

    @Override  // faxy
    public final void b(Bundle bundle0) {
        super.b(bundle0);
        GenericDelegatorChimeraActivity genericDelegatorChimeraActivity0 = this.a;
        genericDelegatorChimeraActivity0.setRequestedOrientation(1);
        if(bundle0 == null) {
            this.s = true;
            this.c = new StringBuilder();
        }
        else {
            this.c = new StringBuilder(bundle0.getString("pin", ""));
            this.f = bundle0.getInt("createReauthTokenRetryCount");
            this.k = bundle0.getInt("serviceConnectionSavePoint", -1);
            if(bundle0.containsKey("apiRequestEvent")) {
                this.e = (TimedEvent)bundle0.getParcelable("apiRequestEvent");
            }
            this.t = bundle0.getBoolean("shouldPerformFingerprintAuthEnrollment");
            gcyu gcyu0 = (gcyu)genericDelegatorChimeraActivity0.getSupportFragmentManager().h("confirmationDialog");
            this.p = gcyu0;
            if(gcyu0 != null) {
                gcyu0.ai = this;
            }
        }
        this.o = (BuyFlowConfig)genericDelegatorChimeraActivity0.getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        this.q = (gevd)gciq.b(genericDelegatorChimeraActivity0.getIntent(), "gaiaPinForm", ((Parser)((ProtoLiteMessage)gevd.a).jf(7, null)));
        genericDelegatorChimeraActivity0.setContentView(0x7F0E0C97);  // layout:wallet_activity_verify_pin
        KeyPadView keyPadView0 = (KeyPadView)genericDelegatorChimeraActivity0.findViewById(0x7F0B17A3);  // id:keypad_view
        this.r = keyPadView0;
        keyPadView0.a = this;
        PinDotsView pinDotsView0 = (PinDotsView)genericDelegatorChimeraActivity0.findViewById(0x7F0B1C94);  // id:pin_dots_view
        this.i = pinDotsView0;
        pinDotsView0.c(this.c.length());
        this.d = (TextView)genericDelegatorChimeraActivity0.findViewById(0x7F0B128F);  // id:error_message
        ((TextView)genericDelegatorChimeraActivity0.findViewById(0x7F0B1266)).setText((this.q.c == null ? gewg.a : this.q.c).f);  // id:enter_pin_title
        batl.b(genericDelegatorChimeraActivity0.getIntent().getExtras().containsKey("gaiaPinForm"));
        gevd gevd0 = this.q;
        gevd0.f(gewh.b);
        batl.b(gevd0.s.m(gewh.b.d));
        Button button0 = (Button)genericDelegatorChimeraActivity0.findViewById(0x7F0B14C0);  // id:forgot_pin_button
        this.g = button0;
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)button0.getLayoutParams();
        frameLayout$LayoutParams0.gravity = (this.q.b & 8) == 0 ? 1 : 5;
        this.g.setLayoutParams(frameLayout$LayoutParams0);
        this.g.setOnClickListener(this);
        this.g.setVisibility(0);
        int v = this.q.b;
        if((v & 4) != 0) {
            if((v & 8) != 0) {
                Button button1 = (Button)genericDelegatorChimeraActivity0.findViewById(0x7F0B1233);  // id:enroll_fingerprint_button
                this.n = button1;
                button1.setText((this.q.f == null ? gevs.a : this.q.f).f);
                this.n.setOnClickListener(this);
                this.n.setVisibility(0);
            }
            else if(this.s) {
                this.o();
            }
        }
        if(this.l() == null) {
            this.j = fbfn.y(16, this.o, this.k());
            ca ca0 = new ca(genericDelegatorChimeraActivity0.getSupportFragmentManager());
            ca0.v(this.j, fcdd.l);
            ca0.f();
        }
    }

    @Override  // faxx
    public final void c() {
        this.p();
    }

    @Override  // faxx
    public final void d() {
        this.l().b.d(this.m, this.k);
        this.k = -1;
    }

    @Override  // faxy
    public final void e(Bundle bundle0) {
        super.e(bundle0);
        this.p();
        bundle0.putString("pin", this.c.toString());
        bundle0.putInt("createReauthTokenRetryCount", this.f);
        bundle0.putInt("serviceConnectionSavePoint", this.k);
        bundle0.putBoolean("shouldPerformFingerprintAuthEnrollment", this.t);
        TimedEvent timedEvent0 = this.e;
        if(timedEvent0 != null) {
            bundle0.putParcelable("apiRequestEvent", timedEvent0);
        }
    }

    public final Account k() {
        return this.o.b.b;
    }

    public final fbfn l() {
        if(this.j == null) {
            this.j = (fbfn)this.a.getSupportFragmentManager().h(fcdd.l);
        }
        return this.j;
    }

    public final void m(int v) {
        this.i.b(3);
        fbej fbej0 = fbej.a(this, "handleError");
        fbej0.a.putInt("errorCode", v);
        long v1 = this.i.a();
        this.h.postDelayed(fbej0, v1);
    }

    public final void n(boolean z) {
        this.r.setEnabled(z);
        this.g.setEnabled(z);
        Button button0 = this.n;
        if(button0 != null) {
            button0.setEnabled(z);
        }
    }

    private final void o() {
        if(this.p != null) {
            ca ca0 = new ca(this.a.getSupportFragmentManager());
            ca0.o(this.p);
            ca0.a();
        }
        fbzy fbzy0 = fbzy.B((this.q.e == null ? gevv.a : this.q.e));
        this.p = fbzy0;
        fbzy0.ai = this;
        fbzy0.show(this.a.getSupportFragmentManager(), "confirmationDialog");
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(this.g.getId() == view0.getId()) {
            GenericDelegatorChimeraActivity genericDelegatorChimeraActivity0 = this.a;
            Context context0 = genericDelegatorChimeraActivity0.getBaseContext();
            gevd gevd0 = this.q;
            gevd0.f(gewh.b);
            Object object0 = gevd0.s.k(gewh.b.d);
            genericDelegatorChimeraActivity0.startActivity(PopupRedirectChimeraActivity.a(context0, ((gfcw)(object0 == null ? gewh.b.b : gewh.b.d(object0))), new ArrayList(0), "", genericDelegatorChimeraActivity0.getThemeResId(), null, this.b, this.o, this.k()));
            return;
        }
        if(this.n != null && this.n.getId() == view0.getId()) {
            this.o();
        }
    }

    private final void p() {
        if(this.k < 0) {
            this.k = this.l().b.a(this.m);
        }
    }
}

