import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import j..time.Duration;

public final class eyge {
    private final eyfl a;

    public eyge(eyfl eyfl0) {
        this.a = eyfl0;
    }

    public final void a(Duration duration0, eygd eygd0, ConnectionInfo connectionInfo0) {
        gzyx gzyx0;
        ibuq.f(duration0, "enrolledDuration");
        ibuq.f(eygd0, "unenrollmentReason");
        ibuq.f(eygd0, "<this>");
        switch(eygd0.ordinal()) {
            case 0: {
                gzyx0 = gzyx.b;
                break;
            }
            case 1: {
                gzyx0 = gzyx.c;
                break;
            }
            case 2: {
                gzyx0 = gzyx.a;
                break;
            }
            case 3: {
                gzyx0 = gzyx.d;
                break;
            }
            case 4: {
                gzyx0 = gzyx.e;
                break;
            }
            case 5: {
                gzyx0 = gzyx.f;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        ibuq.f(gzyx0, "event");
        ibuq.f(duration0, "enrolledDuration");
        eyfc eyfc0 = new eyfc(gzyx0, this.a, duration0);
        this.a.b(connectionInfo0, eyfc0);
    }
}

