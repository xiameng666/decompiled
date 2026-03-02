import android.content.ComponentName;
import android.os.IBinder;
import j..util.Objects;

final class arjg extends clil {
    final arjh a;

    public arjg(arjh arjh0) {
        Objects.requireNonNull(arjh0);
        this.a = arjh0;
        super("backup");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        aqql aqql0 = arjh.p;
        aqql0.d("#doServiceConnected", new Object[0]);
        arjh arjh0 = this.a;
        if(!arjh0.D) {
            aqql0.m("doServiceConnected called without an active connection, returning.", new Object[0]);
            return;
        }
        arjh0.A = ((arca)iBinder0).a;
        arjh0.r.countDown();
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        arjh.p.d("#doServiceDisconnected", new Object[0]);
        this.a.A = null;
        this.a.D = false;
    }
}

