import java.util.concurrent.TimeUnit;

public final class fxdf implements Runnable {
    public final fxdm a;

    public fxdf(fxdm fxdm0) {
        this.a = fxdm0;
    }

    @Override
    public final void run() {
        fxdm fxdm0 = this.a;
        synchronized(fxdm0.c) {
            if(fxdm0.a()) {
                return;
            }
            if(fxdm0.d) {
                return;
            }
            if(fxdm0.g == 0L) {
                ((ggtj)((ggtj)fxdm.a.j()).ar(0x4B1D)).x("urCheck end is 0");
                fxdm0.i.a();
                return;
            }
            long v1 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - fxdm0.g);
            if(v1 >= huwd.c()) {
                fxdm0.h = fxou.b;
                fxdm0.i.a();
            }
            else {
                long v2 = huwd.c() - v1;
                fxdf fxdf0 = new fxdf(fxdm0);
                ((bbll)fxdm0.b).g(fxdf0, v2, TimeUnit.SECONDS);
            }
        }
    }
}

