import android.os.SystemClock;

public final class gpqs implements Runnable {
    public final gpqy a;
    public final gprv b;

    public gpqs(gpqy gpqy0, gprv gprv0) {
        this.a = gpqy0;
        this.b = gprv0;
    }

    @Override
    public final void run() {
        gprv gprv0 = this.b;
        gpqy gpqy0 = this.a;
        for(Object object0: gpqy0.a()) {
            if(((gpsh)object0).j.equals(gprv0)) {
                return;
            }
        }
        gpqn.d(gpqy0.c, "Remove cached services for " + gprv0);
        gprx gprx0 = gpqy0.g;
        gpqo.a(gprx0.c);
        if(gprx0.a.remove(gprv0) != null) {
            gprx0.e = gprx0.a(SystemClock.elapsedRealtime());
        }
    }
}

