import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

public final class ezfk extends clil {
    public ezfj a;
    private ezdu b;

    static {
        bboh.b("TrustAgent", bbcu.aR);
    }

    public ezfk() {
        super("trustagent");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        ezdu ezdu0;
        if(iBinder0 == null) {
            ezdu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.trustagent.internal.ITrustletService");
            ezdu0 = (iInterface0 instanceof ezdu) ? ((ezdu)iInterface0) : new ezds(iBinder0);
        }
        this.b = ezdu0;
        this.a.a(ezdu0);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        this.a.b();
    }
}

