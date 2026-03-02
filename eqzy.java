import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.quickstart.QuickStartConnectionResult;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartOptions;
import java.util.concurrent.CountDownLatch;

public final class eqzy extends eqzx {
    private static final baun c;
    private Integer d;
    private final CountDownLatch e;
    private final CountDownLatch f;
    private final TargetQuickStartOptions g;
    private final int h;
    private final erad i;
    private final eqwx j;
    private final eqxa n;
    private final eqwu o;

    static {
        eqzy.c = new erqc(new String[]{"StartAdvertisingAndConnectOperation"});
    }

    public eqzy(eraf eraf0, TargetQuickStartOptions targetQuickStartOptions0, int v, erad erad0, eqwx eqwx0, eqxa eqxa0, eqwu eqwu0, azug azug0) {
        super("StartAdvertisingAndConnectOperation", eraf0, azug0);
        this.e = new CountDownLatch(1);
        this.f = new CountDownLatch(1);
        this.g = targetQuickStartOptions0;
        this.h = v;
        this.i = erad0;
        this.j = eqwx0;
        this.n = eqxa0;
        this.o = eqwu0;
    }

    @Override  // eqzx
    public final void b() {
        super.b();
        eqzy.c.d("Cancelling operation", new Object[0]);
        this.e.countDown();
        this.f.countDown();
    }

    @Override  // eqzx
    protected final void d(Context context0) {
        baun baun0 = eqzy.c;
        baun0.d("Starting operation %s", new Object[]{this.q()});
        int v = this.h;
        Status status0 = eqrn.d(context0).a(true, v == 3);
        if(!status0.e()) {
            throw new cjuh(status0.i, "Failed to initialize Bluetooth");
        }
        baun0.d("Successfully initialized Bluetooth!", new Object[0]);
        this.n.f(v, this.g, this.o);
        if(v == 3 && this.g.a) {
            this.k(0);
        }
        try {
            this.e.await();
        }
        catch(InterruptedException interruptedException0) {
            eqzy.c.g("Interrupted while waiting for incoming connection", interruptedException0, new Object[0]);
            throw new cjuh(8, "Interrupted while waiting for incoming connection");
        }
        this.h();
        QuickStartTargetEventData quickStartTargetEventData0 = new QuickStartTargetEventData(3, null, null, 0, false, null, 0, null, false, null, 0);
        this.j.b(quickStartTargetEventData0);
        try {
            baun0.d("Waiting for user verification to complete", new Object[0]);
            this.f.await();
        }
        catch(InterruptedException interruptedException1) {
            eqzy.c.g("Interrupted while waiting for user verification", interruptedException1, new Object[0]);
            throw new cjuh(8, "Interrupted while waiting for user verification");
        }
        this.h();
        baun0.d("User verification completed with result %d", new Object[]{this.d});
        if(hyja.c()) {
            this.b.e(this, Status.b);
        }
        QuickStartConnectionResult quickStartConnectionResult0 = new QuickStartConnectionResult(erei.a(this.d.intValue()));
        this.i.b(Status.b, quickStartConnectionResult0);
    }

    @Override  // eqzx
    protected final void e(Status status0) {
        this.n.j();
        this.i.b(status0, null);
    }

    @Override  // eqzx
    protected final void g(int v) {
        super.g(v);
        eqzy.c.f("QuickStart error occurred during operation: %d", new Object[]{v});
        this.e.countDown();
        this.f.countDown();
    }

    @Override  // eqzx
    protected final void i() {
        eqzy.c.d("onConnected()", new Object[0]);
        this.e.countDown();
    }

    @Override  // eqzx
    protected final void k(int v) {
        if(this.d != null) {
            eqzy.c.f("Unexpected duplicate onUserVerificationCompleted call", new Object[0]);
            this.g(8);
            return;
        }
        this.d = v;
        this.f.countDown();
    }
}

