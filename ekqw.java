import android.content.Context;
import java.util.concurrent.Executor;
import jeb.synthetic.TWR;

public final class ekqw {
    public static final bboh a;
    public final brzr b;
    public final Executor c;
    public final ekvm d;
    private static final clmq e;
    private static final gful_cronetEngineProvider f;

    static {
        ekqw.a = bboh.b("NetworkScheduler", bbcu.dw);
        ekqw.e = new clmq(((gful_cronetEngineProvider)new ekqt()));
        ekqw.f = gfus.a(((gful_cronetEngineProvider)new ekqs()));
    }

    public ekqw(Context context0, ekvm ekvm0, Executor executor0, ekrl ekrl0) {
        this.d = ekvm0;
        this.c = executor0;
        this.b = new brzr(this.getClass(), 16, "NetworkScheduler", "scheduler");
        gftb.checkTrue(fhcd.h(context0));
        executor0.execute(new ekqu(1, ekvm0, btar.a, null, null, null, null, -1));
        batl.s(ekvm0.b);
        ekrl0.a.put(ekvm0.b, executor0);
    }

    public final void a(clms clms0) {
        ekqu ekqu0 = new ekqu(4, this.d, btar.a, null, clms0, null, null, -1);
        this.c.execute(ekqu0);
    }

    public final void b() {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/scheduler/NetworkScheduler", "contentUriTriggered", 349, "NetworkScheduler_contentUriTriggered")) {
            Runnable runnable0 = gdrx.g(new ekqu(5, this.d, btar.j, null, null, null, null, -1));
            this.c.execute(runnable0);
        }
    }

    public static void c() {
        ekqw ekqw0 = ekrs.b().d;
        if(ekqw0 != null) {
            gdqs gdqs0 = ekqw0.b.k("onGoogleHttpClientResponseImpl");
            try {
                Runnable runnable0 = gdrx.g(new ekqu(6, ekqw0.d, btar.b, null, null, null, null, -1));
                ekqw0.c.execute(runnable0);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(gdqs0, throwable0);
                throw throwable0;
            }
            if(gdqs0 != null) {
                gdqs0.close();
            }
        }
    }

    public final void d(eksc eksc0) {
        ekqu ekqu0 = new ekqu(2, this.d, btar.a, eksc0, null, null, null, -1);
        this.c.execute(ekqu0);
    }

    public static boolean e(eksc eksc0) {
        int v = (int)hthh.a.c().f();
        if(!eksc0.t() && v > 0 && 36 >= v) {
            ((ggtj)((ggtj)ekqw.a.j()).ar(0x3540)).X("The Firebase Job Dispatcher and GmsTaskScheduler are deprecated for apps targeting API %d or newer. Application %s has targetSdkVersion %d. Please migrate to the WorkManager or JobScheduler.", Integer.valueOf(v), eksc0.i().a, Integer.valueOf(36));
            return false;
        }
        clmp clmp0 = eksc0.g();
        return ekqw.e.d(clmp0);
    }

    public static boolean f(eksc eksc0) {
        switch(eksc0.o.i) {
            case 1: {
                return true;
            }
            case 2: {
                return ((Boolean)ekqw.f.mr()).booleanValue();
            }
            default: {
                return false;
            }
        }
    }
}

