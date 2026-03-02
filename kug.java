import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;

public final class kug implements ibts {
    public final CancellationSignal a;
    public final kum b;

    public kug(CancellationSignal cancellationSignal0, kum kum0) {
        this.a = cancellationSignal0;
        this.b = kum0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(knm.a(this.a)) {
            return ibom.a;
        }
        Intent intent0 = new Intent(this.b.e, IdentityCredentialApiHiddenActivity.class);
        intent0.setFlags(0x10000);
        intent0.putExtra("RESULT_RECEIVER", kum.a(this.b.i));
        intent0.putExtra("EXTRA_FLOW_PENDING_INTENT", ((PendingGetCredentialHandle)object0).a);
        intent0.putExtra("EXTRA_ERROR_NAME", "GET_UNKNOWN");
        this.b.e.startActivity(intent0);
        return ibom.a;
    }
}

