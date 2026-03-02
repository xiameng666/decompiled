import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import j..util.Objects;

final class ezbj extends clil {
    final ezbn a;

    public ezbj(ezbn ezbn0) {
        Objects.requireNonNull(ezbn0);
        this.a = ezbn0;
        super("trustagent");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        ezbf ezbf0;
        ezbn ezbn0 = this.a;
        synchronized(ezbn0.b) {
            if(iBinder0 == null) {
                ezbf0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.trustagent.common.service.IPreferenceService");
                ezbf0 = (iInterface0 instanceof ezbf) ? ((ezbf)iInterface0) : new ezbd(iBinder0);
            }
            ezbn0.e = ezbf0;
        }
        this.a.l();
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        synchronized(this.a.b) {
            this.a.e = null;
        }
    }
}

