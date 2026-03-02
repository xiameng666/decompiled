import android.os.SystemClock;

public final class gazr implements Runnable {
    public final gazs a;

    public gazr(gazs gazs0) {
        this.a = gazs0;
    }

    @Override
    public final void run() {
        gazs gazs0 = this.a;
        gawd.a(gazs0.a);
        long v = System.currentTimeMillis();
        long v1 = SystemClock.elapsedRealtime();
        if(gazs0.h != 3 && gazs0.h != 4) {
            long v2 = gazs0.d;
            hdzu hdzu0 = gazs0.b;
            if(v - v2 <= ((long)hdzu0.c)) {
                long v3 = gazs0.f;
                int v4 = Long.compare(v3, 0L);
                if(v4 >= 0 && v - v3 >= ((long)hdzu0.d)) {
                    long v5 = gazs0.g;
                    for(Object object0: gazs0.c) {
                        gazp gazp0 = (gazp)object0;
                        gazp0.d = null;
                        gazo gazo0 = gazp0.b;
                        gazp0.b = null;
                        if(gazo0 != null) {
                            for(Object object1: gazp0.c) {
                                gazd gazd0 = (gazd)object1;
                                Object object2 = gaze.a(gazd0.a, gazo0);
                                if(object2 != null) {
                                    gazd0.b(((gazo)object2), new gaza(gazd0, v3, v5));
                                }
                            }
                        }
                    }
                    gazs0.e(4);
                    return;
                }
                if(v4 < 0) {
                    if(v3 == -1L) {
                        gazs0.f = v;
                        gazs0.g = v1;
                    }
                    else {
                        if(v3 != -2L) {
                            throw new IllegalStateException("invalid negative timestamp found");
                        }
                        gazs0.f = v2;
                        gazs0.g = gazs0.e;
                        gazs0.d(hdzu0.b);
                        return;
                    }
                }
                gazs0.d(hdzu0.b);
                return;
            }
            gazs0.f = -2L;
            gazs0.g = -2L;
            gazs0.d(hdzu0.b);
        }
    }
}

