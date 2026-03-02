import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;

public final class dfxq implements Runnable {
    public final dfzz a;
    public final TracingBroadcastReceiver b;
    public final String c;

    public dfxq(dfzz dfzz0, TracingBroadcastReceiver tracingBroadcastReceiver0, String s) {
        this.a = dfzz0;
        this.b = tracingBroadcastReceiver0;
        this.c = s;
    }

    @Override
    public final void run() {
        cutr.f(this.a.i, this.b);
        dcvz.a.b().h("Timed out waiting for package %s to be installed", this.c);
    }
}

