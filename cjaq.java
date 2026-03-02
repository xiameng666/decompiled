import android.content.Context;
import com.google.android.gms.libs.identity.ClientIdentity;

public final class cjaq implements ibts {
    public final ClientIdentity a;

    public cjaq(ClientIdentity clientIdentity0) {
        this.a = clientIdentity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cjav cjav0;
        ibuq.f(((Context)object0), "context");
        ClientIdentity clientIdentity0 = this.a;
        if(clientIdentity0.j == null) {
            String s = clientIdentity0.e;
            if(cjbc.a(((Context)object0), clientIdentity0.c, s)) {
                cjav0 = cjav.a;
            }
            else {
                cjav0 = azql.c(((Context)object0)).g(s) ? cjav.b : cjav.c;
            }
            clientIdentity0.j = cjav0;
        }
        Object object1 = clientIdentity0.j;
        ibuq.c(object1);
        return object1;
    }
}

