import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import java.util.concurrent.TimeUnit;

public final class gard extends gaok {
    final etgl b;

    public gard(gamx gamx0) {
        super(gamx0);
        this.b = new etgl(gamx0.a);
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        Intent intent0 = gano0.a;
        if(intent0.getBooleanExtra("skipLockScreen", false)) {
            this.b.cN();
        }
        RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest0 = (RetrieveInAppPaymentCredentialRequest)intent0.getParcelableExtra("retrieveInAppPaymentCredentialRequest");
        if(retrieveInAppPaymentCredentialRequest0 == null) {
            return new ganp(ganp.d(100));
        }
        etgl etgl0 = this.b;
        eskw eskw0 = (eskw)etgl0.h(retrieveInAppPaymentCredentialRequest0).t(22000L, TimeUnit.MILLISECONDS);
        boolean z = intent0.getBooleanExtra("isReRunBoolean", false);
        int v = eskw0.a().i;
        switch(v) {
            case 0: {
                etgl0.g().t(10L, TimeUnit.SECONDS);
                Intent intent2 = ganp.e(0);
                intent2.putExtra("retrieveInAppPaymentCredentialResponse", eskw0.b());
                return new ganp(intent2);
            }
            case 16: {
                return new ganp(ganp.e(1));
            }
            default: {
                Log.w("TapAndPayVerification", "retrieveInAppPaymentCredentialResult failed. Status Code: " + v + "\n response: \n" + eskw0.b());
                if(z) {
                    return new ganp(ganp.d(101));
                }
                Status status0 = eskw0.a();
                Intent intent1 = ganp.d(status0.i);
                PendingIntent pendingIntent0 = status0.k;
                if(pendingIntent0 != null) {
                    intent1.putExtra("extraIntentSender", pendingIntent0.getIntentSender());
                }
                return new ganp(intent1);
            }
        }
    }
}

