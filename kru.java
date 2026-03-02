import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController.resultReceiver.1;
import java.util.List;
import java.util.concurrent.Executor;

public final class kru extends knu {
    public final Context e;
    public kjk f;
    public Executor g;
    public CancellationSignal h;

    public kru(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
        this.e = context0;
        new CredentialProviderGetSignInIntentController.resultReceiver.1(this, new Handler(Looper.getMainLooper()));
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

    public final void g(kka kka0, kjk kjk0, Executor executor0, CancellationSignal cancellationSignal0) {
        ibuq.f(kka0, "request");
        ibuq.f(kjk0, "callback");
        ibuq.f(executor0, "executor");
        this.h = cancellationSignal0;
        ibuq.f(kjk0, "<set-?>");
        this.f = kjk0;
        ibuq.f(executor0, "<set-?>");
        this.g = executor0;
        if(!knm.a(cancellationSignal0)) {
            try {
                ibuq.f(kka0, "request");
                List list0 = kka0.a;
                if(list0.size() != 1) {
                    throw new klr("GetSignInWithGoogleOption cannot be combined with other options.");
                }
                Object object0 = list0.get(0);
                ibuq.d(object0, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
                fhsc fhsc0 = (fhsc)object0;
                throw null;
            }
            catch(klr klr0) {
                knt.a(cancellationSignal0, new krq(this, klr0));
            }
        }
    }
}

