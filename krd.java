import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.resultReceiver.1;
import java.util.concurrent.Executor;

public final class krd extends knu {
    public final Context e;
    public kjk f;
    public Executor g;
    public CancellationSignal h;
    public final CredentialProviderCreatePublicKeyCredentialController.resultReceiver.1 i;

    public krd(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
        this.e = context0;
        this.i = new CredentialProviderCreatePublicKeyCredentialController.resultReceiver.1(this, new Handler(Looper.getMainLooper()));
    }
}

