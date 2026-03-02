import android.os.OutcomeReceiver;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.CredentialInformationResponse;

public final class byew implements OutcomeReceiver {
    final byex a;

    public byew(byex byex0) {
        this.a = byex0;
        super();
    }

    @Override  // android.os.OutcomeReceiver
    public final void onError(Throwable throwable0) {
        ibuq.f(((Exception)throwable0), "exception");
        this.a.j(Status.d);
    }

    @Override  // android.os.OutcomeReceiver
    public final void onResult(Object object0) {
        CredentialInformationResponse credentialInformationResponse0 = (CredentialInformationResponse)object0;
        ibuq.f(credentialInformationResponse0, "result");
        this.a.a.h(Status.b, credentialInformationResponse0);
    }
}

