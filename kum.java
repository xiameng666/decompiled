import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController.resultReceiver.1;
import java.util.concurrent.Executor;

public final class kum extends knu {
    public final Context e;
    public kjk f;
    public Executor g;
    public CancellationSignal h;
    public final CredentialProviderGetDigitalCredentialController.resultReceiver.1 i;

    public kum(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
        this.e = context0;
        this.i = new CredentialProviderGetDigitalCredentialController.resultReceiver.1(this, new Handler(Looper.getMainLooper()));
    }

    public final kjk e() {
        kjk kjk0 = this.f;
        if(kjk0 != null) {
            return kjk0;
        }
        ibuq.j("callback");
        return null;
    }

    public final Executor f() {
        Executor executor0 = this.g;
        if(executor0 != null) {
            return executor0;
        }
        ibuq.j("executor");
        return null;
    }
}

