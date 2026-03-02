import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.util.Pair;
import com.google.gms.mdns.MdnsSearchOptions;
import com.google.gms.mdns.MdnsServiceInfo;
import j..util.Map.-EL;
import j..util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class gpqw implements Runnable {
    public final gpqy a;
    public final String b;
    public final MdnsSearchOptions c;
    public final cqrr d;

    public gpqw(gpqy gpqy0, String s, cqrr cqrr0, MdnsSearchOptions mdnsSearchOptions0) {
        this.a = gpqy0;
        this.b = s;
        this.d = cqrr0;
        this.c = mdnsSearchOptions0;
    }

    @Override
    public final void run() {
        boolean z1;
        boolean z;
        gpqy gpqy0 = this.a;
        if(gpqy0.d.a()) {
            try {
                gpqy0.b.a();
            }
            catch(IOException iOException0) {
                gpqn.b(gpqy0.c, "Failed to start discover.", iOException0);
                return;
            }
        }
        MdnsSearchOptions mdnsSearchOptions0 = this.c;
        cqrr cqrr0 = this.d;
        String s = this.b;
        gpso gpso0 = gpqy0.b;
        Objects.requireNonNull(gpqy0);
        if(mdnsSearchOptions0.g != null) {
            throw new IllegalArgumentException("This socket client does not support requesting specific networks");
        }
        gpsy gpsy0 = new gpsy(null, ((gpsm)gpso0).m.a());
        gpqi gpqi0 = gpqy0.e;
        gpqi0.b();
        int v = mdnsSearchOptions0.h;
        if(v > 0 && (gpsy0.a != null || gpsy0.b != v)) {
            gpqn.c(gpqy0.c, "Skipping " + gpsy0.toString() + " as ifIndex " + v + " was requested.");
            return;
        }
        Pair pair0 = new Pair(gpqj.a(s), gpsy0);
        ArrayMap arrayMap0 = gpqy0.d.a;
        gpsh gpsh0 = (gpsh)Map.-EL.getOrDefault(arrayMap0, pair0, null);
        if(gpsh0 == null) {
            gpqi0.b();
            gpsv gpsv0 = gpqy0.c;
            gpqn.d(gpsv0, a.q(s, gpsy0, "createServiceTypeClient for type:", " "));
            String s1 = s + "-" + gpsy0.a + "/" + gpsy0.b;
            Looper looper0 = Looper.myLooper();
            if(gpqy0.g == null) {
                gpqy0.g = new gprx(looper0);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1);
            gpqy0.a.a.add(scheduledThreadPoolExecutor0);
            gpsh0 = new gpsh(s, gpso0, scheduledThreadPoolExecutor0, gpsy0, gpsv0.g(s1), looper0, gpqy0.g, gpqy0.f);
            arrayMap0.put(new Pair(gpqj.a(s), gpsy0), gpsh0);
        }
        Handler handler0 = gpsh0.g;
        gpqo.a(handler0);
        gpsh0.m = mdnsSearchOptions0;
        ArrayMap arrayMap1 = gpsh0.l;
        gpsd gpsd0 = (gpsd)arrayMap1.get(cqrr0);
        gpsd gpsd1 = new gpsd(mdnsSearchOptions0, gpsd0);
        arrayMap1.put(cqrr0, gpsd1);
        if(gpsd0 == null) {
            z = false;
            for(Object object0: gpsh0.i.d(gpsh0.j, true)) {
                gprn gprn0 = (gprn)object0;
                if(gptc.c(gprn0, mdnsSearchOptions0.b, mdnsSearchOptions0.a)) {
                    long v1 = SystemClock.elapsedRealtime();
                    MdnsServiceInfo mdnsServiceInfo0 = gptc.a(gprn0, gpsh0.b, v1);
                    gpsd1.a(mdnsServiceInfo0.c);
                    if(gprn0.s()) {
                        cqrr0.b(mdnsServiceInfo0);
                        z = true;
                    }
                }
            }
        }
        else {
            z = false;
        }
        gpsh0.h();
        int v2 = mdnsSearchOptions0.c;
        if(v2 != 2) {
            z1 = false;
        }
        else if(z) {
            v2 = 2;
            z1 = true;
        }
        else {
            v2 = 2;
            z1 = false;
        }
        if(!z1) {
            gpsh0.h.c();
        }
        gpst gpst0 = new gpst(v2, 0);
        long v3 = SystemClock.elapsedRealtime();
        if(gpsh0.o == 0L) {
            gpsh0.o = v3;
        }
        long v4 = gpsh0.b(v3);
        if(z) {
            gprk gprk0 = gpsh0.h.b(gpst0, v4, v3, gpsh0.o, gpsh0.n, v2, mdnsSearchOptions0.e, z1);
            long v5 = gpsh.a(gprk0, v3);
            gpqn.d(gpsh0.f, String.format("Schedule a query. Next run: sessionId: %d, in %d ms", ((long)gprk0.d), v5));
            handler0.sendMessageDelayed(handler0.obtainMessage(1, gprk0), v5);
        }
        else {
            List list0 = gpsh0.c(gpsh0.e);
            gpsh0.h.a = new gprk(gpst0, v3, v3 + v4, gpsh0.n);
            gpsf gpsf0 = new gpsf(gpsh0, gpsh0.h.a, list0, gpsh0.d(), gpsh.i(arrayMap1), Collections.EMPTY_LIST, mdnsSearchOptions0.d);
            gpsh0.d.submit(gpsf0);
        }
        gpqo.a(gpsh0.i.c);
        gpsh0.i.b.put(gpsh0.j, gpsh0.p);
    }
}

