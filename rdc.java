import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;

public final class rdc implements acn {
    public final ProxyBillingActivityV2 a;

    public rdc(ProxyBillingActivityV2 proxyBillingActivityV20) {
        this.a = proxyBillingActivityV20;
    }

    @Override  // acn
    public final void jN(Object object0) {
        Intent intent0 = ((ActivityResult)object0).b;
        Bundle bundle0 = intent0 == null ? null : intent0.getExtras();
        int v = ((ActivityResult)object0).a;
        if(v != -1) {
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            Integer integer0 = v;
            rdk.h("ProxyBillingActivityV2", String.format("Launch external link flow finished with resultCode: %s", integer0));
            bundle0.putInt("INTERNAL_LOG_ERROR_REASON", 0x86);
            bundle0.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("Launch external link flow finished with error resultCode: %s", integer0));
        }
        ProxyBillingActivityV2 proxyBillingActivityV20 = this.a;
        int v1 = rdk.b(intent0, "ProxyBillingActivityV2");
        ResultReceiver resultReceiver0 = proxyBillingActivityV20.d;
        if(resultReceiver0 == null) {
            rdk.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        else {
            resultReceiver0.send(v1, bundle0);
        }
        if(v1 != 0) {
            rdk.h("ProxyBillingActivityV2", String.format("Launch external link flow finished with billing responseCode: %s", v1));
        }
        proxyBillingActivityV20.finish();
    }
}

