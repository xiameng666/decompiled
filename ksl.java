import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;

public final class ksl implements ibts {
    public final CancellationSignal a;
    public final kta b;

    public ksl(CancellationSignal cancellationSignal0, kta kta0) {
        this.a = cancellationSignal0;
        this.b = kta0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        CancellationSignal cancellationSignal0 = this.a;
        if(!knm.a(cancellationSignal0)) {
            kta kta0 = this.b;
            Intent intent0 = new Intent(kta0.e, HiddenActivity.class);
            kta.b(kta0.i, intent0, "CREATE_PASSWORD");
            intent0.putExtra("EXTRA_FLOW_PENDING_INTENT", ((CreateCredentialHandle)object0).a);
            try {
                kta0.e.startActivity(intent0);
                return ibom.a;
            }
            catch(Exception unused_ex) {
                knt.a(cancellationSignal0, new ksw(kta0));
            }
        }
        return ibom.a;
    }
}

