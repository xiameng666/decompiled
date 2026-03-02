import android.os.SystemClock;

public final class alcd implements Runnable {
    public final alce a;

    public alcd(alce alce0) {
        this.a = alce0;
    }

    @Override
    public final void run() {
        alce alce0 = this.a;
        long v = alce0.c - SystemClock.elapsedRealtime();
        if(hpzc.f() && v <= 0L) {
            alce.a.h("Never received first message so on accelerated termination path", new Object[0]);
        }
        if(Long.compare(v, 0L) <= 0 && alce0.d == 5) {
            baun baun0 = alce.a;
            baun0.h("Proximity ping terminating", new Object[0]);
            alah alah0 = alce0.e;
            if(alah0 != null) {
                if(alah0.a.b.c(alah0.a.c)) {
                    alce0.a();
                    return;
                }
                baun0.f("Termination failed to complete; retrying at regular interval", new Object[0]);
                alcd alcd0 = new alcd(alce0);
                alce0.b.postDelayed(alcd0, 30000L);
                return;
            }
            baun0.f("No termination listener to notify; termination failed", new Object[0]);
            alce0.a();
            return;
        }
        if(v <= 120000L) {
            int v1 = alce0.d - 1;
            if(alce0.d == 0) {
                throw null;
            }
            if(v1 != 1) {
                switch(v1) {
                    case 2: {
                        if(v <= 60000L) {
                            alce.a.h("Proximity ping warning with 60 seconds until disconnection", new Object[0]);
                            alce0.b();
                            alce0.d = 4;
                        }
                        break;
                    }
                    case 3: {
                        if(v <= 30000L) {
                            alce.a.h("Proximity ping warning with 30 seconds until disconnection", new Object[0]);
                            alce0.b();
                            alce0.d = 5;
                        }
                    }
                }
            }
            else if(v <= 90000L) {
                alce.a.h("Proximity ping warning with 90 seconds until disconnection", new Object[0]);
                alce0.b();
                alce0.d = 3;
            }
            alcd alcd1 = new alcd(alce0);
            alce0.b.postDelayed(alcd1, 10000L);
            return;
        }
        alcd alcd2 = new alcd(alce0);
        alce0.b.postDelayed(alcd2, 30000L);
    }
}

