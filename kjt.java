import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;

public final class kjt implements OutcomeReceiver {
    final kjk a;
    final kis b;

    public kjt(kjk kjk0, kis kis0) {
        this.a = kjk0;
        this.b = kis0;
        super();
    }

    @Override  // android.os.OutcomeReceiver
    public final void onError(Throwable throwable0) {
        CreateCredentialException createCredentialException0 = (CreateCredentialException)throwable0;
        ibuq.f(createCredentialException0, "error");
        Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
        ibuq.f(createCredentialException0, "error");
        String s = createCredentialException0.getType();
        ibuq.e(s, "getType(...)");
        this.a.a(kmo.a(s, createCredentialException0.getMessage()));
    }

    @Override  // android.os.OutcomeReceiver
    public final void onResult(Object object0) {
        CreateCredentialResponse createCredentialResponse0 = (CreateCredentialResponse)object0;
        ibuq.f(createCredentialResponse0, "response");
        Log.i("CredManProvService", "Create Result returned from framework: ");
        Bundle bundle0 = createCredentialResponse0.getData();
        ibuq.e(bundle0, "getData(...)");
        kiu kiu0 = kit.a(this.b.a, bundle0);
        this.a.b(kiu0);
    }
}

