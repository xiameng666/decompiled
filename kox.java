import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInResult;

public final class kox implements ibts {
    public final CancellationSignal a;
    public final kpq b;

    public kox(CancellationSignal cancellationSignal0, kpq kpq0) {
        this.a = cancellationSignal0;
        this.b = kpq0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        CancellationSignal cancellationSignal0 = this.a;
        if(!knm.a(cancellationSignal0)) {
            kpq kpq0 = this.b;
            Intent intent0 = new Intent(kpq0.e, HiddenActivity.class);
            kpq.b(kpq0.i, intent0, "BEGIN_SIGN_IN");
            intent0.putExtra("EXTRA_FLOW_PENDING_INTENT", ((BeginSignInResult)object0).a);
            try {
                kpq0.e.startActivity(intent0);
                return ibom.a;
            }
            catch(Exception unused_ex) {
                knt.a(cancellationSignal0, new kpf(kpq0));
            }
        }
        return ibom.a;
    }
}

