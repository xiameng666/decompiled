import android.os.CancellationSignal;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import java.util.concurrent.Executor;

public final class koo implements ibts {
    public final CancellationSignal a;
    public final Executor b;
    public final kjk c;

    public koo(CancellationSignal cancellationSignal0, Executor executor0, kjk kjk0) {
        this.a = cancellationSignal0;
        this.b = executor0;
        this.c = kjk0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Executor executor0 = this.b;
        CancellationSignal cancellationSignal0 = this.a;
        kjk kjk0 = this.c;
        GetRestoreCredentialResponse getRestoreCredentialResponse0 = (GetRestoreCredentialResponse)object0;
        try {
            ibuq.c(getRestoreCredentialResponse0);
            ibuq.f(getRestoreCredentialResponse0, "response");
            knt.a(cancellationSignal0, new kov(executor0, kjk0, new kkb(kje.a("androidx.credentials.TYPE_RESTORE_CREDENTIAL", getRestoreCredentialResponse0.a))));
        }
        catch(Exception exception0) {
            knt.a(cancellationSignal0, new kow(executor0, kjk0, exception0));
        }
        return ibom.a;
    }
}

