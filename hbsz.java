import android.os.SystemClock;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class hbsz extends havz {
    public static final hbtu d;
    static boolean e;
    public final hbrq f;
    public boolean g;
    private final hbta h;
    private final hbqy i;
    private final hbra j;
    private final hbtr k;

    static {
        hbsz.d = hbtu.a;
        hbsz.e = true;
    }

    public hbsz(hawd hawd0, hbrq hbrq0, hbta hbta0, hbqy hbqy0) {
        this.k = new hbtr();
        batl.t(hawd0, "MlKitContext can not be null");
        batl.t(hbrq0, "BarcodeScannerOptions can not be null");
        this.f = hbrq0;
        this.h = hbta0;
        this.i = hbqy0;
        this.j = new hbra(hawd0.a());
    }

    @Override  // havz
    public final Object a(hbtp hbtp0) {
        return this.e(hbtp0);
    }

    @Override  // hawl
    public final void c() {
        synchronized(this) {
            this.g = this.h.c();
        }
    }

    @Override  // hawl
    public final void d() {
        synchronized(this) {
            this.h.b();
            hbsz.e = true;
            hbkp hbkp0 = new hbkp();
            hbkp0.c = this.g ? hbkm.c : hbkm.b;
            hbla hbla0 = new hbla();
            hbla0.b = hbsq.a(this.f);
            hbkp0.f = new hblb(hbla0);
            hbrb hbrb0 = new hbrb(hbkp0, 0);
            this.i.e(hbrb0, hbko.l);
        }
    }

    public final List e(hbtp hbtp0) {
        List list0;
        hbtp hbtp1;
        hbsz hbsz0;
        Throwable throwable2;
        LinkedList linkedList0;
        long v1;
        hbtr hbtr0;
        long v;
        __monitor_enter(this);
        try {
            v = SystemClock.elapsedRealtime();
            if(hbtp0.g == -1) {
                hbtr0 = this.k;
                v1 = SystemClock.elapsedRealtime();
                linkedList0 = hbtr0.b;
                linkedList0.add(Long.valueOf(v1));
                if(linkedList0.size() > 5) {
                    goto label_8;
                }
                goto label_9;
            }
            goto label_20;
        }
        catch(Throwable throwable0) {
            hbsz0 = this;
            goto label_36;
        }
        try {
        label_8:
            linkedList0.removeFirst();
        label_9:
            if(linkedList0.size() == 5) {
                Long long0 = (Long)linkedList0.peekFirst();
                batl.s(long0);
                if(v1 - ((long)long0) < 5000L && (hbtr0.c == -1L || v1 - hbtr0.c >= TimeUnit.SECONDS.toMillis(5L))) {
                    hbtr0.c = v1;
                    hbtr.a.d("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            hbsz0 = this;
            goto label_37;
        }
        try {
        label_20:
            hbsz0 = this;
            hbtp1 = hbtp0;
            list0 = this.h.a(hbtp0);
            hbsz0 = this;
            hbtp1 = hbtp0;
            goto label_29;
        }
        catch(havd havd0) {
            goto label_33;
        }
        catch(Throwable throwable0) {
        }
        try {
            hbsz0 = this;
            goto label_36;
            try {
            label_29:
                hbsz0.f(hbkn.a, v, hbtp1, list0);
                hbsz.e = false;
                goto label_39;
            }
            catch(havd havd0) {
            label_33:
                hbsz0.f((havd0.a == 14 ? hbkn.k : hbkn.aG), v, hbtp1, null);
                throw havd0;
            }
        label_36:
            throwable2 = throwable0;
        label_37:
            __monitor_exit(hbsz0);
        }
        catch(Throwable throwable0) {
            goto label_36;
        }
        throw throwable2;
    label_39:
        __monitor_exit(hbsz0);
        return list0;
    }

    private final void f(hbkn hbkn0, long v, hbtp hbtp0, List list0) {
        ggdy ggdy0 = new ggdy();
        ggdy ggdy1 = new ggdy();
        if(list0 != null) {
            for(Object object0: list0) {
                int v1 = ((hbsn)object0).a();
                hbky hbky0 = (hbky)hbsq.a.get(v1);
                if(hbky0 == null) {
                    hbky0 = hbky.a;
                }
                ggdy0.i(hbky0);
                int v2 = ((hbsn)object0).b();
                hbkz hbkz0 = (hbkz)hbsq.b.get(v2);
                if(hbkz0 == null) {
                    hbkz0 = hbkz.a;
                }
                ggdy1.i(hbkz0);
            }
        }
        long v3 = SystemClock.elapsedRealtime() - v;
        hbsx hbsx0 = new hbsx(this, v3, hbkn0, ggdy0, ggdy1, hbtp0);
        this.i.c(hbsx0, hbko.j);
        haxf haxf0 = new haxf();
        haxf0.a = hbkn0;
        haxf0.b = Boolean.valueOf(hbsz.e);
        haxf0.c = hbsq.a(this.f);
        haxf0.d = ggdy0.h();
        haxf0.e = ggdy1.h();
        haxg haxg0 = new haxg(haxf0);
        hbsy hbsy0 = new hbsy(this);
        this.i.d(haxg0, v3, hbko.be, hbsy0);
        long v4 = System.currentTimeMillis();
        this.j.a((this.g ? 24302 : 24301), hbkn0.aH, v4 - v3, v4);
    }
}

