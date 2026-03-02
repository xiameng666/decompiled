import android.os.Bundle;
import android.os.CancellationSignal;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import java.util.concurrent.Executor;

public final class kok implements ibts {
    public final CancellationSignal a;
    public final Executor b;
    public final kjk c;

    public kok(CancellationSignal cancellationSignal0, Executor executor0, kjk kjk0) {
        this.a = cancellationSignal0;
        this.b = executor0;
        this.c = kjk0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Executor executor0 = this.b;
        CancellationSignal cancellationSignal0 = this.a;
        kjk kjk0 = this.c;
        CreateRestoreCredentialResponse createRestoreCredentialResponse0 = (CreateRestoreCredentialResponse)object0;
        try {
            ibuq.c(createRestoreCredentialResponse0);
            ibuq.f(createRestoreCredentialResponse0, "response");
            Bundle bundle0 = createRestoreCredentialResponse0.a;
            ibuq.f(bundle0, "data");
            String s = bundle0.getString("androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE");
            if(s == null) {
                throw new kli("The response bundle did not contain the response data. This should not happen.");
            }
            knt.a(cancellationSignal0, new koh(executor0, kjk0, new kjd(s, bundle0)));
        }
        catch(Exception exception0) {
            knt.a(cancellationSignal0, new koi(executor0, kjk0, exception0));
        }
        return ibom.a;
    }
}

