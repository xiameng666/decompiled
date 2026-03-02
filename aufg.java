import com.google.android.gms.cast.CastDevice;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class aufg implements Runnable {
    public final aufi a;

    public aufg(aufi aufi0) {
        this.a = aufi0;
    }

    @Override
    public final void run() {
        gkfz gkfz0;
        CastDevice castDevice1;
        avjh avjh1;
        aufi aufi1;
        aufi aufi0 = this.a;
        augl augl0 = aufi0.d;
        auiz auiz0 = augl0.e;
        synchronized(auiz0) {
            if(augl0.n == null) {
                return;
            }
            avjh avjh0 = aufi0.a;
            avjh0.m("Triggered Adaptive Discovery");
            String s = aufi0.g.b(null);
            if(s == null) {
                avjh0.g("Exiting Adaptive Discovery. Current Network ID is NULL.", new Object[0]);
                return;
            }
            auju auju0 = auiz0.e(s);
            if(auju0 == null) {
                avjh0.g("Exiting Adaptive Discovery. Current NetworkInfo is NULL.", new Object[0]);
                return;
            }
            Collection collection0 = auju0.a(auiz0);
            if(collection0.isEmpty()) {
                avjh0.m("Exiting Adaptive Discovery. CastDeviceInfo list is EMPTY");
                return;
            }
            avjh0.n("%d Cast devices.", Integer.valueOf(collection0.size()));
            long v1 = System.currentTimeMillis();
            for(Object object0: collection0) {
                aujd aujd0 = (aujd)object0;
                CastDevice castDevice0 = aujd0.c;
                if(castDevice0 != null && !castDevice0.n()) {
                    boolean z = aujd0.l(v1, ((Long)aufi0.b.mr()).longValue());
                    Set set0 = augl0.n;
                    HashSet hashSet0 = new HashSet();
                    if(set0 != null) {
                        for(Object object1: set0) {
                            String s1 = (String)object1;
                            if(!aurf.t(s1) && !aujd0.c().contains(s1) && !aujd0.b().contains(s1)) {
                                hashSet0.add(s1);
                            }
                        }
                    }
                    int v2 = hashSet0.isEmpty();
                    int v3 = v2 ^ 1;
                    if(aujd0.e.a == null) {
                        aufi1 = aufi0;
                        avjh1 = avjh0;
                        castDevice1 = castDevice0;
                    }
                    else {
                        aufi1 = aufi0;
                        Set set1 = aujd0.c();
                        avjh1 = avjh0;
                        Set set2 = aujd0.b();
                        castDevice1 = castDevice0;
                        aujd0.a.c("[missingSubtypeMdns=%b]: check (%s) with current supported (%s), current notSupported (%s), current timestamp (%s)", new Object[]{Boolean.valueOf(((boolean)v3)), set0, set1, set2, aujd0.e.a});
                    }
                    boolean z1 = z || v2 == 0 || aujd0.o();
                    avjh1.r("%s missingSubtypeMdns(%b) expired(%b) tcpProbing(%b)", castDevice1, Boolean.valueOf(((boolean)v3)), Boolean.valueOf(z), Boolean.valueOf(z1));
                    if(z1) {
                        if(z) {
                            gkfz0 = gkfz.b;
                        }
                        else {
                            gkfz0 = v2 == 0 ? gkfz.c : gkfz.k;
                        }
                        augl0.m.a(aujd0, gkfz0, false, false);
                    }
                    aufi0 = aufi1;
                    avjh0 = avjh1;
                }
            }
        }
    }
}

