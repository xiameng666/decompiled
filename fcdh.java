import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.wallet.activity.OrchestrationDelegatorChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.webview.WebViewWidgetResult;
import com.google.android.wallet.clientlog.LogContext;

public final class fcdh extends faya {
    public fcdh(OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity0) {
        super(orchestrationDelegatorChimeraActivity0);
    }

    @Override  // faxx
    public final void a(Bundle bundle0) {
        OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity0 = this.a;
        fbgn.D(orchestrationDelegatorChimeraActivity0, orchestrationDelegatorChimeraActivity0.q(), fbgn.e, true);
        orchestrationDelegatorChimeraActivity0.v(bundle0, hzmn.a.b().e(), 36, gklu.r);
    }

    @Override  // faxx
    public final void b(Bundle bundle0) {
        OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity0 = this.a;
        fayc.c(orchestrationDelegatorChimeraActivity0);
        orchestrationDelegatorChimeraActivity0.setContentView(0x7F0E0C88);  // layout:wallet_activity_common
        orchestrationDelegatorChimeraActivity0.hG(((Toolbar)orchestrationDelegatorChimeraActivity0.findViewById(0x7F0B22D9)));  // id:toolbar
        boolean z = true;
        orchestrationDelegatorChimeraActivity0.hL().o(true);
        fbgn.B(orchestrationDelegatorChimeraActivity0.findViewById(0x7F0B247C));  // id:wallet_root
        if(((fcdl)orchestrationDelegatorChimeraActivity0.r()) == null) {
            Intent intent0 = orchestrationDelegatorChimeraActivity0.getIntent();
            Bundle bundle1 = intent0.getExtras();
            if(!bundle1.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS") && !bundle1.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS")) {
                z = false;
            }
            batl.b(z);
            byte[] arr_b = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
            byte[] arr_b1 = intent0.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_AUTH_TOKEN");
            BuyFlowConfig buyFlowConfig0 = orchestrationDelegatorChimeraActivity0.q();
            String s = orchestrationDelegatorChimeraActivity0.j;
            LogContext logContext0 = orchestrationDelegatorChimeraActivity0.k;
            batl.t(arr_b, "Params must not be null.");
            fcdl fcdl0 = new fcdl();
            Bundle bundle2 = fcdl.cr(buyFlowConfig0, s, logContext0);
            bundle2.putByteArray("parameters", arr_b);
            bundle2.putByteArray("productAuthToken", arr_b1);
            fcdl0.setArguments(bundle2);
            orchestrationDelegatorChimeraActivity0.G(fcdl0, 0x7F0B14C8);  // id:fragment_holder
        }
    }

    @Override  // faya
    public final boolean h(Parcelable parcelable0, boolean z) {
        Intent intent0 = new Intent();
        intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_REFRESH", z);
        if(((WebViewWidgetResult)parcelable0) != null) {
            byte[] arr_b = ((WebViewWidgetResult)parcelable0).a;
            if(arr_b != null && arr_b.length > 0) {
                intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", arr_b);
            }
        }
        this.a.M(-1, intent0);
        return true;
    }

    public static Intent i(Context context0, Intent intent0, BuyFlowConfig buyFlowConfig0, int v) {
        Intent intent1 = OrchestrationDelegatorChimeraActivity.ae(context0, intent0, buyFlowConfig0);
        intent1.setAction("com.google.android.gms.wallet.firstparty.ACTION_WEB_VIEW_WIDGET");
        if(v == 0) {
            throw null;
        }
        intent1.putExtra("entryWidgetType", v - 1);
        return intent1;
    }
}

