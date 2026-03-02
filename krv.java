import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;

public final class krv implements ibts {
    public final CancellationSignal a;
    public final ksk b;

    public krv(CancellationSignal cancellationSignal0, ksk ksk0) {
        this.a = cancellationSignal0;
        this.b = ksk0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(knm.a(this.a)) {
            return ibom.a;
        }
        Intent intent0 = new Intent(this.b.e, IdentityCredentialApiHiddenActivity.class);
        intent0.setFlags(0x10000);
        intent0.putExtra("RESULT_RECEIVER", ksk.a(this.b.i));
        intent0.putExtra("EXTRA_FLOW_PENDING_INTENT", ((CreateCredentialHandle)object0).a);
        intent0.putExtra("EXTRA_ERROR_NAME", "CREATE_UNKNOWN");
        this.b.e.startActivity(intent0);
        return ibom.a;
    }
}

