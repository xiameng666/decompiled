import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;

public final class gaov extends gaok {
    private final gaoq b;

    public gaov(gamx gamx0, gaoq gaoq0) {
        super(gamx0);
        this.b = gaoq0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        ibuq.f(gano0, "request");
        long v = SystemClock.elapsedRealtime();
        gaxl.a();
        long v1 = v + ((long)(((int)hzqi.a.b().a())));
        try {
            this.b.b();
            ibuq.f(gano0, "<this>");
            fbyf fbyf0 = (fbyf)gawi.i(gano0.a, "extra_callback_input", ((MessageLite)fbyf.a));
            gaxl.a();
            int v3 = (int)hzqi.a.b().b();
            fbyg fbyg0 = this.b.a(fbyf0, v3);
            long v4 = v1 - SystemClock.elapsedRealtime();
            if(v4 > 0L) {
                SystemClock.sleep(v4);
            }
            ganp ganp0 = new ganp(ganp.e(0));
            gawi.q(ganp0.a, "extra_callback_output", ((MessageLite)fbyg0));
            return ganp0;
        }
        catch(RemoteException remoteException0) {
            Log.e("IntegCallbackAction", "Bender3IntegratorCallbackAction failed!", remoteException0);
            return ganp.h(3);
        }
        finally {
            this.b.c();
        }
    }
}

