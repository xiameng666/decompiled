import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class cyla implements Runnable {
    public final kba a;
    public final bsaq b;
    public final Set c;

    public cyla(kba kba0, bsaq bsaq0, Set set0) {
        this.a = kba0;
        this.b = bsaq0;
        this.c = set0;
    }

    @Override
    public final void run() {
        Object object0 = this.a.a();
        if(object0 != null && !((cwqd)object0).s() && !((cwqd)object0).r(this.b, 2, false)) {
            ((ggtj)cyjh.a.d().ar(7842)).x("NearbyDeviceManager: muteAwaitConnection receive callback, block all available SassDevices");
            for(Object object1: new HashSet(this.c)) {
                ((ggtj)((cyna)object1).o.d().ar(7900)).B("SassDevice: %s full blocked", ((cyna)object1).j());
                long v = TimeUnit.SECONDS.toMillis(hvpg.am());
                ((cyna)object1).v(((cyna)object1).c().b() + v);
                ((cyna)object1).n(true);
            }
        }
    }
}

