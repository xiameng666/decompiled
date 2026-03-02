import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class bva implements bpd {
    final bvb a;
    final bam b;
    final Context c;

    public bva(bvb bvb0, bam bam0, Context context0) {
        this.a = bvb0;
        this.b = bam0;
        this.c = context0;
        super();
    }

    @Override  // bpd
    public final void a(Throwable throwable0) {
        gmcd gmcd0;
        bvb bvb0 = this.a;
        buw buw0 = new buw(bvb0);
        if(boj.d()) {
            buw0.run();
        }
        else {
            CountDownLatch countDownLatch0 = new CountDownLatch(1);
            kay.d(boj.a().post(new boi(buw0, countDownLatch0)), "Unable to post to main thread");
            try {
                if(!countDownLatch0.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            }
            catch(InterruptedException interruptedException0) {
                throw new boa(interruptedException0);
            }
        }
        if(bvb0.d()) {
            bam bam0 = bvb0.e;
            ibuq.c(bam0);
            Object object0 = bam0.d;
            __monitor_enter(object0);
            int v = FIN.finallyOpen$NT();
            bam0.g.removeCallbacksAndMessages("retry_token");
            int v1 = bam0.o - 1;
            if(bam0.o == 0) {
                throw null;
            }
            switch(v1) {
                case 0: {
                    bam0.o = 5;
                    gmcd0 = bpt.b(null);
                label_43:
                    FIN.finallyCodeBegin$NT(v);
                    break;
                }
                case 1: {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                default: {
                    if(v1 == 2 || v1 == 3) {
                        bam0.o = 5;
                        Integer integer0 = bam0.n;
                        Object object1 = bam.a;
                        __monitor_enter(object1);
                        int v2 = FIN.finallyOpen$NT();
                        if(integer0 != null) {
                            SparseArray sparseArray0 = bam.b;
                            int v3 = ((int)(((Integer)sparseArray0.get(integer0.intValue())))) - 1;
                            if(v3 == 0) {
                                sparseArray0.remove(integer0.intValue());
                            }
                            else {
                                sparseArray0.put(integer0.intValue(), Integer.valueOf(v3));
                            }
                            bam.c();
                        }
                        FIN.finallyCodeBegin$NT(v2);
                        __monitor_exit(object1);
                        FIN.finallyCodeEnd$NT(v2);
                        bam0.m = jqy.a(new bal(bam0));
                    }
                    gmcd0 = bam0.m;
                    goto label_43;
                }
            }
        }
        else {
            gmcd0 = bpt.b(null);
        }
        ibuq.c(gmcd0);
        __monitor_enter(bvb0.a);
        int v4 = FIN.finallyOpen$NT();
        bvb0.c = null;
        bvb0.d = gmcd0;
        bvb0.h.clear();
        bvb0.i.clear();
        FIN.finallyCodeBegin$NT(v4);
        __monitor_exit(bvb0.a);
        FIN.finallyCodeEnd$NT(v4);
        bvb0.a(null, null);
    }

    @Override  // bpd
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        Context context0 = bnm.a(this.c);
        this.a.a(this.b, context0);
    }
}

