import com.google.android.gms.cast.CastDevice;
import java.util.Map;

public final class auhb implements Runnable {
    public final auhh a;
    public final String b;

    public auhb(auhh auhh0, String s) {
        this.a = auhh0;
        this.b = s;
    }

    @Override
    public final void run() {
        auhh auhh0 = this.a;
        avjh avjh0 = auhh0.d;
        avjh0.c("mdnsGoodbyeMessageReceived: %s", new Object[]{this.b});
        Map map0 = auhh0.a;
        auhi auhi0 = (auhi)map0.remove(this.b);
        if(auhi0 != null) {
            avjh0.p("Removed (%s) %s", auhi0.a, auhi0.b);
            CastDevice castDevice0 = auhi0.b;
            if(castDevice0 != null) {
                for(Object object0: map0.values()) {
                    if(castDevice0.q(((auhi)object0).b)) {
                        avjh0.c("Another entry exists for this device. Not notifying offline: %s", new Object[]{castDevice0});
                        return;
                    }
                }
                avjh0.m("notifyDeviceOffline: because it said goodbye");
                auhh0.e(castDevice0);
            }
        }
    }
}

