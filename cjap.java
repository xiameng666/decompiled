import android.content.Context;
import com.google.android.gms.libs.identity.ClientIdentity;

public final class cjap implements ibts {
    public final ClientIdentity a;

    public cjap(ClientIdentity clientIdentity0) {
        this.a = clientIdentity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Context)object0), "context");
        ClientIdentity clientIdentity0 = this.a;
        if(clientIdentity0.h == null) {
            clientIdentity0.h = bbna.b(((Context)object0), clientIdentity0.e);
        }
        Object object1 = clientIdentity0.h;
        ibuq.c(object1);
        ((Integer)object1).intValue();
        return object1;
    }
}

