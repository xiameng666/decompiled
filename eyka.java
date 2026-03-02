import android.hardware.Sensor;
import com.google.android.gms.trustagent.activeunlock.primary.trustagent.unlock.falsing.InPocketDetector.InPocketEventListener;
import j..time.Duration;

public final class eyka extends ibsl implements ibtw {
    int a;
    final InPocketDetector.InPocketEventListener b;
    final eykb c;
    final Duration d;

    public eyka(InPocketDetector.InPocketEventListener inPocketDetector$InPocketEventListener0, eykb eykb0, Duration duration0, ibrl ibrl0) {
        this.b = inPocketDetector$InPocketEventListener0;
        this.c = eykb0;
        this.d = duration0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyka)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyka(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            InPocketDetector.InPocketEventListener inPocketDetector$InPocketEventListener0 = this.b;
            Sensor sensor0 = this.c.e;
            ibuq.f(sensor0, "sensor");
            if(!inPocketDetector$InPocketEventListener0.b) {
                inPocketDetector$InPocketEventListener0.b = true;
                inPocketDetector$InPocketEventListener0.a.registerListener(inPocketDetector$InPocketEventListener0, sensor0, 3);
            }
            this.a = 1;
            if(glya.a(this.d, this) == object1) {
                return object1;
            }
        }
        this.b.c();
        return ibom.a;
    }
}

