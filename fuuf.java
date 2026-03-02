import android.os.SystemClock;
import android.util.Log;

public final class fuuf extends futo {
    public fuuf(futd futd0, fwyd fwyd0) {
        super(futd0);
    }

    @Override  // futo
    public final futn d() {
        String s;
        long v18;
        futd futd2;
        long v10;
        long v9;
        long v8;
        long v3;
        futd futd0 = this.b;
        long v = fyaw.b(futd0.R, super.a());
        long v1 = fyaw.b(futd0.S, (Long.compare(futd0.I, 0x7FFFFFFFFFFFFFFFL) == 0 ? 0x7FFFFFFFFFFFFFFFL : Math.max(0L, futd0.I - futo.c(futd0.C.a))));
        long v2 = futd0.U;
        if(futd0.a() == 0x7FFFFFFFFFFFFFFFL) {
            v3 = 0x7FFFFFFFFFFFFFFFL;
        }
        else {
            v3 = futd0.m.a ? futd0.a() : Math.max(0L, futd0.a() - futo.c(futd0.z.a));
        }
        long v4 = fyaw.b(v2, v3);
        long v5 = this.b();
        futd futd1 = this.b;
        long v6 = futd1.Q == null ? -1L : futd1.Q.a;
        long v7 = SystemClock.elapsedRealtime();
        humr.o();
        if(this.f(futd1.I)) {
            v8 = v6;
            if(fuuf.e(v1, v6, futd1.I, futd1.P)) {
                v1 = fyaw.b(v8, 1000L);
            }
        }
        else {
            v8 = v6;
        }
        if(!this.f(futd1.a())) {
            v9 = v4;
        }
        else if(fuuf.e(v4, v8, futd1.a(), futd1.P)) {
            v9 = fyaw.b(v8, 1000L);
        }
        else {
            v9 = v4;
        }
        if(this.f(futd1.H)) {
            v10 = v9;
            futd2 = futd1;
            boolean z = fuuf.e(v, v8, futd1.H, futd1.P);
            v8 = v8;
            if(z) {
                v = fyaw.b(v8, 1000L);
            }
            else {
                goto label_37;
            }
        }
        else {
            v10 = v9;
            futd2 = futd1;
        label_37:
            if(futd2.C()) {
                long v11 = fyaw.b(futd0.R, Math.max(super.a(), 180000L));
                if(v != v11) {
                    v = v11 <= v1 ? v11 : v1;
                    if(v > v8 && fuuf.e(v11, v8, futd2.H, futd2.P)) {
                        v = fyaw.b(v8, 1000L);
                    }
                }
            }
        }
        long v12 = futd2.aa;
        boolean z1 = futd2.u.h();
        if(!z1 && v12 != -1L) {
            long v13 = fyaw.b(futd2.aa, 45000L);
            if(v13 < SystemClock.elapsedRealtime()) {
                v = Math.min(v, v13);
            }
            futd2.x(-1L);
        }
        long v14 = this.a + 5000L >= SystemClock.elapsedRealtime() ? this.a + 5000L : this.a + 45000L;
        if(v14 >= SystemClock.elapsedRealtime()) {
            v = Math.min(v, v14);
        }
        long v15 = v;
        long v16 = 39L;
        if(Long.compare(v10, v15) < 0 && !futo.e(v10, v15, futd0.a(), 0x7FFFFFFFFFFFFFFFL)) {
            v16 = 4L;
            v15 = v10;
        }
        if(!z1 && v1 < v15 && !futo.e(v1, v15, futd0.I, 0x7FFFFFFFFFFFFFFFL) && !futd0.af.a) {
            v16 = 2L;
            v15 = v1;
        }
        long v17 = !z1 || futd2.a() != 0x7FFFFFFFFFFFFFFFL ? v16 : 0L;
        if(v5 < v15 && !futo.e(v5, v15, futd0.b(), 0x7FFFFFFFFFFFFFFFL)) {
            v17 = 0x20L;
            v18 = v5;
        }
        else {
            v18 = v15;
        }
        long v19 = glxd.f(new long[]{futd2.a(), futd2.H, futd2.I});
        long v20 = futd2.E() || futd2.M ? v19 / 3L : v19 / 8L;
        if(humr.o()) {
            switch(((int)v17)) {
                case 1: {
                    s = "ACTIVITY";
                    break;
                }
                case 2: {
                    s = "TILT";
                    break;
                }
                default: {
                    switch(((int)v17)) {
                        case 4: {
                            s = "PHONE_POSITION";
                            break;
                        }
                        case 8: {
                            s = "OFF_BODY";
                            break;
                        }
                        case 0x20: {
                            s = "SLEEP";
                            break;
                        }
                        case 39: {
                            s = "FULL_TYPE";
                            break;
                        }
                        default: {
                            s = "";
                        }
                    }
                }
            }
            Log.i("ActivityScheduler", "nextTriggerTime: " + v18 + ", in " + (v18 - v7) + "ms, detectorType: " + v17 + ", " + s + " alarmWindowMillis: " + v20);
        }
        return new futn(new fvsx(v18, v20), v17);
    }

    private final boolean f(long v) {
        long v1 = this.b.P;
        if(Long.compare(v, 300000L) < 0 && v1 != 0x7FFFFFFFFFFFFFFFL) {
            int v2 = Long.compare(v, v1);
            long v3 = v2 <= 0 ? v : v1;
            if(v3 != 0L) {
                if(v2 <= 0) {
                    v = v1;
                }
                if(v % v3 != 0L) {
                    double f = ((double)v) / ((double)v3);
                    return f < 8.5 && Math.abs((f + 0.5) % 1.0 - 0.5) < 0.1;
                }
                return true;
            }
        }
        return false;
    }
}

