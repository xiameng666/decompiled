import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import j..time.Duration;

public final class eyek implements ibtw {
    public final eyel a;
    public final ConnectionInfo b;
    public final gzxn c;
    public final gzxo d;
    public final exjx e;

    public eyek(eyel eyel0, ConnectionInfo connectionInfo0, gzxn gzxn0, gzxo gzxo0, exjx exjx0) {
        this.a = eyel0;
        this.b = connectionInfo0;
        this.c = gzxn0;
        this.d = gzxo0;
        this.e = exjx0;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        gzxp gzxp0;
        ibuq.f(((exjm)object0), "code");
        ibuq.f(((Duration)object1), "duration");
        ibuq.f(((exjm)object0), "<this>");
        switch(((exjm)object0).ordinal()) {
            case 0: {
                gzxp0 = gzxp.b;
                break;
            }
            case 1: {
                gzxp0 = gzxp.c;
                break;
            }
            case 2: {
                gzxp0 = gzxp.d;
                break;
            }
            case 3: {
                gzxp0 = gzxp.e;
                break;
            }
            case 4: {
                gzxp0 = gzxp.f;
                break;
            }
            case 5: {
                gzxp0 = gzxp.g;
                break;
            }
            case 6: {
                gzxp0 = gzxp.h;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        gzyj gzyj0 = this.e.e();
        ibuq.f(this.b, "connectionInfo");
        ibuq.f(gzxp0, "result");
        ibuq.f(this.c, "deviceType");
        ibuq.f(this.d, "eventType");
        ibuq.f(((Duration)object1), "latency");
        ibuq.f(gzyj0, "rangingMethod");
        eyfb eyfb0 = new eyfb(gzxp0, this.c, this.d, ((Duration)object1), gzyj0);
        this.a.a.b(this.b, eyfb0);
        return ibom.a;
    }
}

