import android.content.Context;
import com.google.android.gms.libs.identity.ClientIdentity;

public final class cjat implements ibts {
    final ClientIdentity a;

    public cjat(ClientIdentity clientIdentity0) {
        this.a = clientIdentity0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Context)object0), "context");
        return new cjaq(this.a).a(((Context)object0)) == cjav.a ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }
}

