import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController.resultReceiver.1;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.common.Feature;
import java.util.concurrent.Executor;

public final class kqe extends knu {
    public final Context e;
    public kjk f;
    public Executor g;
    public CancellationSignal h;
    public final CredentialProviderCreatePasswordController.resultReceiver.1 i;

    public kqe(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
        this.e = context0;
        this.i = new CredentialProviderCreatePasswordController.resultReceiver.1(this, new Handler(Looper.getMainLooper()));
    }

    public final void e(kiy kiy0, kjk kjk0, Executor executor0, CancellationSignal cancellationSignal0) {
        ibuq.f(kiy0, "request");
        ibuq.f(kjk0, "callback");
        ibuq.f(executor0, "executor");
        this.h = cancellationSignal0;
        this.f = kjk0;
        this.g = executor0;
        if(knm.a(cancellationSignal0)) {
            return;
        }
        ibuq.f(kiy0, "request");
        SavePasswordRequest savePasswordRequest0 = new SavePasswordRequest(new SignInPassword(kiy0.i, kiy0.j), null, 0);
        batl.s(this.e);
        ahpx ahpx0 = new ahpx();
        ahuo ahuo0 = new ahuo(this.e, ahpx0);
        SavePasswordRequest savePasswordRequest1 = new SavePasswordRequest(savePasswordRequest0.a, ahuo0.a, savePasswordRequest0.c);
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{amju.f};
        azzc0.a = new ahum(ahuo0, savePasswordRequest1);
        azzc0.b = false;
        azzc0.d = 0x600;
        evql evql0 = ahuo0.iG(azzc0.a());
        evql0.b(new kpz(new kpy(cancellationSignal0, this)));
        evql0.A(new kqa(this, cancellationSignal0));
    }
}

