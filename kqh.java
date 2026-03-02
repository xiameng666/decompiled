import android.app.PendingIntent;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;

public final class kqh implements ibts {
    public final CancellationSignal a;
    public final krd b;

    public kqh(CancellationSignal cancellationSignal0, krd krd0) {
        this.a = cancellationSignal0;
        this.b = krd0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((PendingIntent)object0), "result");
        CancellationSignal cancellationSignal0 = this.a;
        if(!knm.a(cancellationSignal0)) {
            krd krd0 = this.b;
            Intent intent0 = new Intent(krd0.e, HiddenActivity.class);
            krd.b(krd0.i, intent0, "CREATE_PUBLIC_KEY_CREDENTIAL");
            intent0.putExtra("EXTRA_FLOW_PENDING_INTENT", ((PendingIntent)object0));
            try {
                krd0.e.startActivity(intent0);
                return ibom.a;
            }
            catch(Exception unused_ex) {
                knt.a(cancellationSignal0, new kqt(krd0));
            }
        }
        return ibom.a;
    }
}

