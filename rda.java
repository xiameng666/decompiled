import android.content.Intent;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;

public final class rda implements acn {
    public final ProxyBillingActivityV2 a;

    public rda(ProxyBillingActivityV2 proxyBillingActivityV20) {
        this.a = proxyBillingActivityV20;
    }

    @Override  // acn
    public final void jN(Object object0) {
        Intent intent0 = ((ActivityResult)object0).b;
        int v = rdk.b(intent0, "ProxyBillingActivityV2");
        ProxyBillingActivityV2 proxyBillingActivityV20 = this.a;
        ResultReceiver resultReceiver0 = proxyBillingActivityV20.b;
        if(resultReceiver0 != null) {
            resultReceiver0.send(v, (intent0 == null ? null : intent0.getExtras()));
        }
        int v1 = ((ActivityResult)object0).a;
        if(v1 != -1) {
            rdk.h("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing\'s responseCode: %s", v1, v));
        }
        else if(v != 0) {
            rdk.h("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing\'s responseCode: %s", ((int)-1), v));
        }
        proxyBillingActivityV20.finish();
    }
}

