import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import java.util.concurrent.Executor;

public final class kub implements ibts {
    public final CancellationSignal a;
    public final kuf b;
    public final Executor c;
    public final kjk d;

    public kub(CancellationSignal cancellationSignal0, kuf kuf0, Executor executor0, kjk kjk0) {
        this.a = cancellationSignal0;
        this.b = kuf0;
        this.c = executor0;
        this.d = kjk0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        CancellationSignal cancellationSignal0 = this.a;
        if(!knm.a(cancellationSignal0)) {
            Intent intent0 = new Intent(this.b.e, HiddenActivity.class);
            kuf.b(this.b.i, intent0, "BEGIN_SIGN_IN");
            intent0.putExtra("EXTRA_FLOW_PENDING_INTENT", ((PendingGetCredentialHandle)object0).a);
            try {
                this.b.e.startActivity(intent0);
                return ibom.a;
            }
            catch(Exception unused_ex) {
                knt.a(cancellationSignal0, new ktz(this.c, this.d));
            }
        }
        return ibom.a;
    }
}

