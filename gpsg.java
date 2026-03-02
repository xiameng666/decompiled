import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.ArrayMap;
import j..util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.Set;

final class gpsg extends Handler {
    final gpsh a;

    public gpsg(gpsh gpsh0, Looper looper0) {
        Objects.requireNonNull(gpsh0);
        this.a = gpsh0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        int v3;
        switch(message0.what) {
            case 1: {
                gprk gprk0 = (gprk)message0.obj;
                List list0 = this.a.c(this.a.e);
                Set set0 = this.a.d();
                boolean z = gpsh.i(this.a.l);
                gpsf gpsf0 = new gpsf(this.a, gprk0, list0, set0, z, Collections.EMPTY_LIST, this.a.m.d);
                this.a.d.submit(gpsf0);
                return;
            }
            case 2: {
                gpse gpse0 = (gpse)message0.obj;
                gprk gprk1 = gpse0.c;
                long v = gprk1.d;
                gpsh gpsh0 = this.a;
                if(v != gpsh0.n) {
                    return;
                }
                int v1 = gpse0.a;
                if(v1 == -1) {
                    v3 = -1;
                }
                else {
                    for(int v2 = 0; true; ++v2) {
                        ArrayMap arrayMap0 = gpsh0.l;
                        if(v2 >= arrayMap0.size()) {
                            break;
                        }
                        ((cqrr)arrayMap0.keyAt(v2)).a.f(gpse0.b, v1);
                    }
                    v3 = v1;
                }
                if(gpsh0.m != null && gpsh0.m.f) {
                    gprx gprx0 = gpsh0.i;
                    gprv gprv0 = gpsh0.j;
                    for(Object object0: gprx0.d(gprv0, false)) {
                        gprn gprn0 = (gprn)object0;
                        if(gprn0.q() && gprn0.b().d(SystemClock.elapsedRealtime()) == 0L) {
                            gprx0.c(gprn0.d(), gprv0);
                            gpsh0.e(gprn0, "TTL expired");
                        }
                    }
                }
                long v4 = SystemClock.elapsedRealtime();
                gpsh0.o = v4;
                long v5 = gpsh0.b(v4);
                gprk gprk2 = gpsh0.h.b(gprk1.a, v5, v4, gpsh0.o, v, gpsh0.m.c, gpsh0.m.e, false);
                long v6 = gpsh.a(gprk2, v4);
                gpqn.d(gpsh0.f, String.format("Query sent with transactionId: %d. Next run: sessionId: %d, in %d ms", v3, ((long)gprk2.d), v6));
                Message message1 = gpsh0.g.obtainMessage(1, gprk2);
                gpsh0.g.sendMessageDelayed(message1, v6);
                return;
            }
            case 3: {
                long v7 = SystemClock.elapsedRealtime();
                this.a.i.f(this.a.j, v7);
                return;
            }
            default: {
                gpqn.a(this.a.f, a.aG(message0, "Unrecognized event "));
            }
        }
    }
}

