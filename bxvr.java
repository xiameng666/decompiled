import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import java.util.List;

public final class bxvr extends bxvv {
    public final CreateCredentialRequest a;

    public bxvr(Bundle bundle0) {
        super(bundle0);
        Bundle bundle1 = bundle0.getBundle("EXTRA_REQUEST");
        batl.s(bundle1);
        String s = bundle1.getString("type");
        if(s == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle bundle2 = bundle1.getBundle("credentialData");
        if(bundle2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle bundle3 = bundle1.getBundle("candidateQueryData");
        if(bundle3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CreateCredentialRequest createCredentialRequest0 = new CreateCredentialRequest(s, bundle2, bundle3, bundle1.getString("origin"), bundle1.getString("requestJson"), ((ResultReceiver)bundle1.getParcelable("resultReceiver")));
        this.a = createCredentialRequest0;
        batl.s(createCredentialRequest0);
    }

    public bxvr(IBinder iBinder0, String s, CreateCredentialRequest createCredentialRequest0, List list0) {
        super(iBinder0, s, list0);
        this.a = createCredentialRequest0;
    }

    @Override  // bxvv
    protected final void a(Bundle bundle0) {
        super.a(bundle0);
        Bundle bundle1 = new Bundle();
        bundle1.putString("type", this.a.a);
        bundle1.putBundle("credentialData", this.a.b);
        bundle1.putBundle("candidateQueryData", this.a.c);
        bundle1.putString("origin", this.a.d);
        bundle1.putString("requestJson", this.a.e);
        bundle1.putParcelable("resultReceiver", this.a.f);
        bundle0.putBundle("EXTRA_REQUEST", bundle1);
    }
}

