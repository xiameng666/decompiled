import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public final class crph {
    public final Context a;

    public crph(Context context0) {
        this.a = context0;
    }

    public final IBinder a(Intent intent0) {
        if(intent0 == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String s = intent0.getAction();
        if("com.google.android.gms.measurement.START".equals(s)) {
            return new crih(crqq.y(this.a), null);
        }
        Log.w("FA", "onBind received unknown action: " + s);
        return null;
    }

    public final void b() {
        this.a.getClass();
    }

    public final void c() {
        this.a.getClass();
    }

    public final void d(Runnable runnable0) {
        this.e(crqq.y(this.a), runnable0);
    }

    public final void e(crqq crqq0, Runnable runnable0) {
        crqq0.aK().f(new crpf(this, crqq0, runnable0));
    }

    public static final void f(Intent intent0) {
        if(intent0 == null) {
            Log.e("FA", "onRebind called with null intent");
            return;
        }
        intent0.getAction();
    }

    public final void g(Intent intent0, int v) {
        if(intent0 == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return;
        }
        crkt crkt0 = crkt.i(this.a);
        crji crji0 = crkt0.aJ();
        String s = intent0.getAction();
        if(crkt0.c.a) {
            crji0.k.c("Device PackageMeasurementTaskService called. startId, action", Integer.valueOf(v), s);
        }
        else {
            crji0.k.c("Local AppMeasurementService called. startId, action", Integer.valueOf(v), s);
        }
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            this.d(new crpd(this, v, crji0, intent0));
        }
    }

    public static final void h(Intent intent0) {
        if(intent0 == null) {
            Log.e("FA", "onUnbind called with null intent");
            return;
        }
        intent0.getAction();
    }
}

