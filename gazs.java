import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

public final class gazs {
    public final Handler a;
    public final hdzu b;
    public final List c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;

    public gazs(Handler handler0, hdzu hdzu0) {
        this.a = handler0;
        this.b = hdzu0;
        this.c = new ArrayList();
        this.h = 1;
        this.d = -1L;
        this.e = -1L;
        this.f = -1L;
        this.g = -1L;
    }

    public final Object a() {
        try {
            gawd.a(this.a);
            switch(this.h) {
                case 2: {
                    return ibom.a;
                }
                case 4: {
                    throw new IllegalStateException("watcher has completed monitoring; cannot be restarted");
                }
                default: {
                    this.h = 2;
                    this.d(0);
                    return ibom.a;
                }
            }
        }
        catch(Throwable throwable0) {
            return ibnx.a(throwable0);
        }
    }

    public final Object b() {
        Object object3;
        try {
            gawd.a(this.a);
            switch(this.h) {
                case 3: {
                    throw new IllegalStateException("watcher has been stopped; cannot be restarted");
                }
                case 4: {
                    throw new IllegalStateException("watcher has completed monitoring; cannot be restarted");
                }
                default: {
                    long v = System.currentTimeMillis();
                    long v1 = SystemClock.elapsedRealtime();
                    for(Object object0: this.c) {
                        gazp gazp0 = (gazp)object0;
                        gazo gazo0 = gazp0.b;
                        if(gazo0 != null) {
                            for(Object object1: gazp0.c) {
                                gazd gazd0 = (gazd)object1;
                                Object object2 = gaze.a(gazd0.a, gazo0);
                                if(object2 != null) {
                                    gazd0.c(((gazo)object2), new gazb(gazd0, v, v1));
                                }
                            }
                        }
                    }
                    object3 = new ibnw(this.a());
                }
            }
        }
        catch(Throwable throwable0) {
            object3 = ibnx.a(throwable0);
        }
        Throwable throwable1 = ibnw.a(object3);
        if(throwable1 != null) {
            object3 = new ibnw(ibnx.a(throwable1));
        }
        return ((ibnw)object3).a;
    }

    public final Object c() {
        try {
            gawd.a(this.a);
            this.e((this.h == 4 ? 4 : 3));
            return ibom.a;
        }
        catch(Throwable throwable0) {
            return ibnx.a(throwable0);
        }
    }

    public final void d(int v) {
        gawd.a(this.a);
        this.d = System.currentTimeMillis();
        this.e = SystemClock.elapsedRealtime();
        gazr gazr0 = new gazr(this);
        long v1 = SystemClock.uptimeMillis() + ((long)v);
        this.a.postAtTime(gazr0, this, v1);
    }

    public final void e(int v) {
        this.h = v;
        this.a.removeCallbacksAndMessages(this);
    }
}

