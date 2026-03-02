import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class eyfv {
    public final eyfl a;
    public final ConnectionInfo b;

    @AssistedInject
    public eyfv(eyfl eyfl0, @Assisted ConnectionInfo connectionInfo0) {
        this.a = eyfl0;
        this.b = connectionInfo0;
    }

    public final void a(eyfu eyfu0, exjo exjo0) {
        gzyk gzyk0;
        ibuq.f(eyfu0, "reason");
        ibuq.f(exjo0, "relockType");
        ibuq.f(eyfu0, "<this>");
        switch(eyfu0.ordinal()) {
            case 0: {
                gzyk0 = gzyk.c;
                break;
            }
            case 1: {
                gzyk0 = gzyk.d;
                break;
            }
            case 2: {
                gzyk0 = gzyk.h;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        gzym gzym0 = exjo0.a();
        eyfl.h(this.a, gzyk0, this.b, gzym0);
    }
}

