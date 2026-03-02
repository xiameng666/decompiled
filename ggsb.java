import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

public abstract class ggsb extends ggsl implements ggsu {
    protected ggsb(Level level0) {
        super(level0);
    }

    @Override  // ggsl
    protected final ggwr m() {
        return ggwp.a;
    }

    @Override  // ggsl
    protected final boolean n(ggsp ggsp0) {
        int v8;
        ggtc ggtc3;
        ggtc ggtc1;
        ggtc ggtc0;
        ggub ggub0 = this.c();
        int v = ggub0.b();
        int v1 = 0;
        while(v1 < v) {
            if(ggub0.c(v1).a != "eye3tag") {
                ++v1;
                continue;
            }
            else if(ggub0.d(ggsj.a) == null) {
                ggsx ggsx0 = ggsj.i;
                if(ggub0.d(ggsx0) == null) {
                    this.u(ggsx0, ggti.a);
                }
            }
            break;
        }
        ggsk ggsk0 = this.g;
        if(ggsk0 != null) {
            if(ggsp0 != null) {
                long v2 = this.f;
                ggrz ggrz0 = (ggrz)ggsk0.d(ggsj.d);
                if(ggrz0 == null) {
                    ggtc0 = null;
                }
                else {
                    ggtc0 = (ggsa)ggsa.a.b(ggsp0, ggsk0);
                    ggwv.a(v2 >= 0L, "timestamp cannot be negative");
                    AtomicLong atomicLong0 = ggtc0.b;
                    long v3 = atomicLong0.get();
                    if(v3 >= 0L) {
                        long v4 = ggrz0.b.toNanos(((long)ggrz0.a)) + v3;
                        if(v4 < 0L || v2 < v4) {
                            ggtc0 = ggsa.c;
                        }
                        else {
                            atomicLong0.compareAndSet(v3, -v2);
                        }
                    }
                    else {
                        atomicLong0.compareAndSet(v3, -v2);
                    }
                }
                ggsk ggsk1 = this.g;
                Integer integer0 = (Integer)ggsk1.d(ggsj.b);
                if(integer0 == null) {
                    ggtc1 = null;
                }
                else {
                    ggtc1 = (ggrx)ggrx.a.b(ggsp0, ggsk1);
                    if(ggtc1.b.incrementAndGet() < ((long)(((int)integer0)))) {
                        ggtc1 = ggrx.c;
                    }
                }
                ggtc ggtc2 = ggtc.b(ggtc0, ggtc1);
                ggsk ggsk2 = this.g;
                Integer integer1 = (Integer)ggsk2.d(ggsj.c);
                if(integer1 != null && ((int)integer1) > 0) {
                    ggtc3 = (ggtf)ggtf.a.b(ggsp0, ggsk2);
                    if((((Random)ggtf.b.get()).nextInt(integer1.intValue()) == 0 ? ggtc3.e.incrementAndGet() : ggtc3.e.get()) <= 0) {
                        ggtc3 = ggtf.c;
                    }
                }
                else {
                    ggtc3 = null;
                }
                ggtc ggtc4 = ggtc.b(ggtc2, ggtc3);
                this.h = ggtc4;
                if(ggtc4 == ggtc.c) {
                    return false;
                }
            }
            ggsx ggsx1 = ggsj.i;
            ggti ggti0 = (ggti)this.g.d(ggsx1);
            if(ggti0 != null) {
                ggsk ggsk3 = this.g;
                if(ggsk3 != null) {
                    int v5 = ggsk3.a(ggsx1);
                    if(v5 >= 0) {
                        int v6 = v5 + v5;
                        int v7;
                        for(v7 = v6 + 2; true; v7 += 2) {
                            v8 = ggsk3.b;
                            if(v7 >= v8 + v8) {
                                break;
                            }
                            Object object0 = ggsk3.a[v7];
                            if(!object0.equals(ggsx1)) {
                                Object[] arr_object = ggsk3.a;
                                arr_object[v6] = object0;
                                arr_object[v6 + 1] = arr_object[v7 + 1];
                                v6 += 2;
                            }
                        }
                        ggsk3.b = v8 - (v7 - v6 >> 1);
                        while(v6 < v7) {
                            ggsk3.a[v6] = null;
                            ++v6;
                        }
                    }
                }
                ggsx ggsx2 = ggsj.a;
                Throwable throwable0 = (Throwable)this.c().d(ggsx2);
                int v9 = ggti0.f;
                if(v9 <= 0 && v9 != -1) {
                    throw new IllegalArgumentException("invalid maximum depth: 0");
                }
                this.u(ggsx2, new ggss(throwable0, ggti0, ggwu.a.b(ggsl.class, v9)));
            }
        }
        return true;
    }
}

