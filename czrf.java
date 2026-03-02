import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.WorkSource;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class czrf extends czvg {
    public cupv a;
    public final List b;
    public final ScanSettings c;
    public final ScanCallback d;
    public final WorkSource e;
    private final Context f;
    private final String g;
    private final Runnable h;
    private final ScheduledExecutorService i;
    private cumn j;

    public czrf(Context context0, String s, List list0, ScanSettings scanSettings0, ScanCallback scanCallback0, WorkSource workSource0, Runnable runnable0, ScheduledExecutorService scheduledExecutorService0, cump cump0) {
        super(35, cump0);
        this.f = context0;
        this.g = s;
        this.b = list0;
        this.c = scanSettings0;
        this.e = workSource0;
        this.d = scanCallback0;
        this.h = runnable0;
        this.i = scheduledExecutorService0;
    }

    @Override  // czvg
    public final czvf a() {
        long v1;
        cupv cupv0 = cupv.a(this.f, "BluetoothLowEnergy");
        if(cupv0 == null) {
            czke.i(this.g, 6, gylz.d, gymd.P);
            return czvf.d;
        }
        gmcu gmcu0 = new gmcu();
        ScheduledExecutorService scheduledExecutorService0 = this.i;
        scheduledExecutorService0.execute(new czrc(this, cupv0, gmcu0));
        try {
            hvog hvog0 = hvog.a;
            gmcu0.v(hvog0.bk().aa(), TimeUnit.SECONDS);
            this.a = cupv0;
            cunf cunf0 = czkq.a;
            Runnable runnable0 = this.h;
            ScanSettings scanSettings0 = this.c;
            int v = scanSettings0.getScanMode();
            switch(v) {
                case -1: {
                    v1 = hvog0.bk().q();
                    break;
                }
                case 0: {
                    v1 = hvog0.bk().p();
                    break;
                }
                default: {
                    v1 = v == 2 ? hvog0.bk().o() : hvog0.bk().n();
                }
            }
            this.j = cumn.c(cunf0, runnable0, ((long)(((int)v1))), scheduledExecutorService0);
            cunf0.d().h("Started BLE scanning. isExtended : %s", Boolean.valueOf(czrf.e(scanSettings0)));
            return czvf.b;
        }
        catch(InterruptedException unused_ex) {
            gymr gymr0 = czrf.e(this.c) ? gymr.c : gymr.b;
            czke.i(this.g, 6, gymr0, gymd.t);
            Thread.currentThread().interrupt();
            if(hvol.aH()) {
                this.d(cupv0, this.d);
            }
            return czvf.c;
        }
        catch(ExecutionException unused_ex) {
            gymr gymr1 = czrf.e(this.c) ? gymr.c : gymr.b;
            String s = czrf.c(this.c);
            czke.j(this.g, 6, gymr1, gymd.u, s);
        }
        catch(TimeoutException unused_ex) {
            gymr gymr2 = czrf.e(this.c) ? gymr.c : gymr.b;
            String s1 = czrf.c(this.c);
            czke.j(this.g, 6, gymr2, gymd.y, s1);
        }
        if(hvol.aH()) {
            this.d(cupv0, this.d);
        }
        return czvf.d;
    }

    static String c(ScanSettings scanSettings0) {
        int v = scanSettings0.getScanMode();
        String s = gxyf.a(gxye.d, v);
        int v1 = scanSettings0.getCallbackType();
        switch(v1) {
            case 1: {
                return "ScanSettings [" + s + ", callbackType=" + "CALLBACK_TYPE_ALL_MATCHES" + ", reportDelayMillis=" + scanSettings0.getReportDelayMillis() + ", legacy=" + ((boolean)(czrf.e(scanSettings0) ^ 1)) + "]";
            }
            case 2: {
                return "ScanSettings [" + s + ", callbackType=" + "CALLBACK_TYPE_FIRST_MATCH" + ", reportDelayMillis=" + scanSettings0.getReportDelayMillis() + ", legacy=" + ((boolean)(czrf.e(scanSettings0) ^ 1)) + "]";
            }
            case 4: {
                return "ScanSettings [" + s + ", callbackType=" + "CALLBACK_TYPE_MATCH_LOST" + ", reportDelayMillis=" + scanSettings0.getReportDelayMillis() + ", legacy=" + ((boolean)(czrf.e(scanSettings0) ^ 1)) + "]";
            }
            default: {
                return "ScanSettings [" + s + ", callbackType=" + a.f(v1, "UNKNOWN CALLBACK TYPE(", ")") + ", reportDelayMillis=" + scanSettings0.getReportDelayMillis() + ", legacy=" + ((boolean)(czrf.e(scanSettings0) ^ 1)) + "]";
            }
        }
    }

    private final void d(cupv cupv0, ScanCallback scanCallback0) {
        czkq.a.b().p("Tear down previous scan request due to errors.", new Object[0]);
        czrd czrd0 = new czrd(cupv0, scanCallback0);
        this.i.execute(czrd0);
    }

    private static boolean e(ScanSettings scanSettings0) {
        return !scanSettings0.getLegacy();
    }

    @Override  // czvg
    public final void g() {
        cumn cumn0 = this.j;
        if(cumn0 != null) {
            cumn0.b();
            this.j = null;
        }
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        czre czre0 = new czre(this, countDownLatch0);
        this.i.execute(czre0);
        try {
            if(!countDownLatch0.await(hvog.a.bk().ab(), TimeUnit.SECONDS)) {
                gymx gymx0 = czrf.e(this.c) ? gymx.c : gymx.b;
                czke.i(this.g, 7, gymx0, gymd.y);
            }
        }
        catch(InterruptedException unused_ex) {
            gymx gymx1 = czrf.e(this.c) ? gymx.c : gymx.b;
            czke.i(this.g, 7, gymx1, gymd.t);
            Thread.currentThread().interrupt();
        }
    }
}

