import android.os.Bundle;
import android.os.Message;
import com.google.android.gms.wallet.ow.ShowLockScreenChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.tapandpay.TapAndPayConsumerVerificationRequest;

public final class fccr extends gdfu {
    public final fbnw a;
    private static final String an;
    private BuyFlowConfig ao;
    private fbfn ap;
    int b;

    static {
        fccr.an = "TPConsumerVerifFrag:TransactionRetainerFragment";
    }

    public fccr() {
        this.a = new fccq(this);
    }

    final fbfn Q() {
        if(this.ap == null) {
            this.ap = fccr.aa(((xob)this.getContext()));
        }
        return this.ap;
    }

    public static fccr R(du du0) {
        return (fccr)du0.getChildFragmentManager().h("GcoreTapAndPayConsumerVerificationFragment");
    }

    public static void S(du du0) {
        fccr fccr0 = fccr.R(du0);
        if(fccr0 != null) {
            fccr0.lr();
            ca ca0 = new ca(du0.getChildFragmentManager());
            ca0.o(fccr0);
            ca0.a();
        }
    }

    @Override  // gdfu
    protected final void U() {
        fbnp fbnp0 = this.Q().b;
        TapAndPayConsumerVerificationRequest tapAndPayConsumerVerificationRequest0 = new TapAndPayConsumerVerificationRequest(((gfdf)this.aA), this.ai);
        Message.obtain(fbnp0.u, 60, tapAndPayConsumerVerificationRequest0).sendToTarget();
    }

    @Override  // gdfu
    protected final void V() {
        this.getContext().getApplicationContext();
        this.startActivityForResult(ShowLockScreenChimeraActivity.g(this.ao), 501);
    }

    @Override  // gdfu
    protected final boolean W() {
        return this.Q() != null && this.Q().a;
    }

    public static fccr Z(du du0, gfdf gfdf0, LogContext logContext0, BuyFlowConfig buyFlowConfig0) {
        fccr.S(du0);
        fccr fccr0 = new fccr();
        batl.c(((boolean)(gfdf0.d.isEmpty() ^ 1)), "clientInstrumentId cannot be null or empty!");
        Bundle bundle0 = fccr.al(0x7F161034, ((MessageLite)gfdf0), logContext0);  // style:WalletEmptyStyle
        bundle0.putParcelable("buyFlowConfig", buyFlowConfig0);
        fccr0.setArguments(bundle0);
        ca ca0 = new ca(du0.getChildFragmentManager());
        ca0.v(fccr0, "GcoreTapAndPayConsumerVerificationFragment");
        ca0.a();
        return fccr0;
    }

    static final fbfn aa(xob xob0) {
        return (fbfn)xob0.getSupportFragmentManager().h(fccr.an);
    }

    private final void ao() {
        if(this.b == -1) {
            this.b = this.Q().b.a(this.a);
        }
    }

    @Override  // gdfu
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        batl.t(bundle1, "args is required");
        BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)bundle1.getParcelable("buyFlowConfig");
        this.ao = buyFlowConfig0;
        batl.t(buyFlowConfig0, "buyFlowConfig is required");
        if(bundle0 == null) {
            this.b = -1;
            xob xob0 = (xob)this.getContext();
            fbfn fbfn0 = fccr.aa(xob0);
            if(fbfn0 != null) {
                ca ca0 = new ca(xob0.getSupportFragmentManager());
                ca0.o(fbfn0);
                ca0.a();
            }
            this.ap = fbfn.y(4, this.ao, this.oc());
            ca ca1 = new ca(xob0.getSupportFragmentManager());
            ca1.v(this.ap, fccr.an);
            ca1.a();
            return;
        }
        this.b = bundle0.getInt("serviceConnectionSavePoint");
    }

    @Override  // gdfu
    public final void onPause() {
        super.onPause();
        this.ab().removeCallbacksAndMessages(null);
        this.ao();
    }

    @Override  // gdfu
    public final void onResume() {
        super.onResume();
        fccp fccp0 = new fccp(this);
        if(this.Q().a) {
            fccp0.run();
            return;
        }
        this.ab().post(fccp0);
    }

    @Override  // gdfu
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.ao();
        bundle0.putInt("serviceConnectionSavePoint", this.b);
    }
}

