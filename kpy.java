import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.auth.api.identity.SavePasswordResult;

public final class kpy implements ibts {
    public final CancellationSignal a;
    public final kqe b;

    public kpy(CancellationSignal cancellationSignal0, kqe kqe0) {
        this.a = cancellationSignal0;
        this.b = kqe0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        CancellationSignal cancellationSignal0 = this.a;
        if(!knm.a(cancellationSignal0)) {
            kqe kqe0 = this.b;
            Intent intent0 = new Intent(kqe0.e, HiddenActivity.class);
            kqe.b(kqe0.i, intent0, "CREATE_PASSWORD");
            intent0.putExtra("EXTRA_FLOW_PENDING_INTENT", ((SavePasswordResult)object0).a);
            try {
                kqe0.e.startActivity(intent0);
                return ibom.a;
            }
            catch(Exception unused_ex) {
                knt.a(cancellationSignal0, new kpu(kqe0));
            }
        }
        return ibom.a;
    }
}

