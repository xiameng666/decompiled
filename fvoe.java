import android.content.Context;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.util.concurrent.CountDownLatch;
import jeb.synthetic.FIN;

public final class fvoe implements fvnb {
    private final fybc a;
    private final CountDownLatch b;
    private boolean c;
    private final fvod d;

    public fvoe(fwzp fwzp0, Context context0, fvlh fvlh0, fvsd fvsd0, fwzx fwzx0, int v, fvlt fvlt0, fybc fybc0, fvwz fvwz0, String s) {
        this.c = false;
        gftb.check(context0);
        this.a = fybc0;
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        this.b = countDownLatch0;
        this.d = new fvod(fwzp0, context0, fvlh0, countDownLatch0, fvsd0, fwzx0, v, fvlt0, fybc0, fvwz0, s);
    }

    @Override  // fvnb
    public final void a() {
        fvod fvod0 = this.d;
        synchronized(fvod0.a) {
            if(fvod0.b != null && fvod0.isAlive()) {
                fvnk fvnk0 = fvod0.b;
                fvnk0.a();
                fvls fvls0 = fvnk0.e;
                if(fvls0 != null) {
                    fvls0.b();
                }
                if(fvnk0.h != null) {
                    fvlh fvlh0 = fvnk0.i;
                    if(fvlh0 != null) {
                        for(Object object1: ((RealCollectorConfig)fvlh0).c) {
                            fvnk0.h.d(fvnk0.g, ((fvns)object1));
                        }
                    }
                }
            }
        }
    }

    @Override  // fvnb
    public final void b() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        gftb.b(((boolean)(this.c ^ 1)), "Start should be called only once!");
        this.c = true;
        this.d.start();
        try {
            this.b.await();
            FIN.finallyExec$NT(v);
        }
        catch(InterruptedException unused_ex) {
            FIN.finallyCodeBegin$NT(v);
        }
    }

    @Override  // fvnb
    public final void c() {
        fvod fvod0 = this.d;
        synchronized(fvod0.a) {
            if(fvod0.b != null && fvod0.isAlive()) {
                fvod0.b.a();
            }
        }
    }
}

