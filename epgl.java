import android.content.Context;
import android.os.IBinder;

public final class epgl implements ibts {
    public final epgz a;
    public final ephb b;

    public epgl(ephb ephb0, epgz epgz0) {
        this.b = ephb0;
        this.a = epgz0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Context)object0), "it");
        IBinder iBinder0 = this.a.asBinder();
        ibuq.e(iBinder0, "asBinder(...)");
        ibuq.f(iBinder0, "listenerKey");
        ibuq.f(iBinder0, "listenerKey");
        iccl.f(this.b.a.a.d);
        return Boolean.valueOf(this.b.a.a.z(iBinder0));
    }
}

