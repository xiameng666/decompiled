import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;

public final class aan extends acw {
    final aao a;

    public aan(aao aao0) {
        this.a = aao0;
        super();
    }

    @Override  // acw
    public final void a(int v, adc adc0, Object object0) {
        int v1;
        Bundle bundle1;
        ibuq.f(adc0, "contract");
        aao aao0 = this.a;
        adb adb0 = adc0.c(aao0, object0);
        if(adb0 != null) {
            new Handler(Looper.getMainLooper()).post(new aal(this, v, adb0));
            return;
        }
        Intent intent0 = adc0.a(aao0, object0);
        if(intent0.getExtras() != null) {
            Bundle bundle0 = intent0.getExtras();
            ibuq.c(bundle0);
            if(bundle0.getClassLoader() == null) {
                intent0.setExtrasClassLoader(aao0.getClassLoader());
            }
        }
        if(intent0.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle1 = intent0.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intent0.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        else {
            bundle1 = null;
        }
        if(ibuq.m("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intent0.getAction())) {
            String[] arr_s = intent0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if(arr_s == null) {
                arr_s = new String[0];
            }
            jwe.e(aao0, arr_s, v);
            return;
        }
        if(ibuq.m("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intent0.getAction())) {
            IntentSenderRequest intentSenderRequest0 = (IntentSenderRequest)intent0.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                v1 = v;
                ibuq.c(intentSenderRequest0);
                v1 = v;
                aao0.startIntentSenderForResult(intentSenderRequest0.a, v1, intentSenderRequest0.b, intentSenderRequest0.c, intentSenderRequest0.d, 0, bundle1);
            }
            catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                new Handler(Looper.getMainLooper()).post(new aam(this, v1, intentSender$SendIntentException0));
            }
            return;
        }
        aao0.startActivityForResult(intent0, v, bundle1);
    }
}

