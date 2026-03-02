import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.redirect.PopupRedirectChimeraActivity;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;

public final class fccv extends gdfg {
    @Override  // gdfg
    public final Intent Q() {
        Context context0 = this.getContext();
        String s = ((gfcw)this.aA).d;
        int v = gdfl.a(this.bV);
        BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)this.getArguments().getParcelable("buyFlowConfig");
        LogContext logContext0 = this.bZ;
        Intent intent0 = new Intent(context0, StartAndroidAppRedirectActivity.class);
        intent0.putExtra("initialUrl", s);
        intent0.putExtra("activityThemeResId", v);
        intent0.putExtra("logToken", null);
        intent0.putExtra("parentLogContext", logContext0);
        intent0.setClassName(context0, "com.google.android.gms.wallet.redirect.StartAndroidAppRedirectProxyActivity");
        intent0.putExtra("buyFlowConfig", buyFlowConfig0);
        return intent0;
    }

    @Override  // gdfg
    public final Intent R() {
        return PopupRedirectChimeraActivity.a(this.getContext(), ((gfcw)this.aA), this.ah, this.getArguments().getString("title"), gdfl.a(this.bV), null, this.bZ, ((BuyFlowConfig)this.getArguments().getParcelable("buyFlowConfig")), this.oc());
    }

    @Override  // gdfg
    protected final gdfr S(gewu gewu0) {
        return fcab.an(gewu0, this.bU, this.cM());
    }
}

