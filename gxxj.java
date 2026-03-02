import java.util.concurrent.atomic.AtomicReference;

public final class gxxj implements jqv {
    public final gxxu a;
    public final int b;
    public final long c;
    public final AtomicReference d;

    public gxxj(gxxu gxxu0, int v, long v1, AtomicReference atomicReference0) {
        this.a = gxxu0;
        this.b = v;
        this.c = v1;
        this.d = atomicReference0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        gxxp gxxp0 = new gxxp(this.a, this.b, this.c, jqt0);
        this.a.j(gxxp0);
        this.d.set(gxxp0);
        this.a.f.s(this.a.e, this.a.m, this.b);
        return "BluetoothDeviceConnectionStateManager:tryReconnectProxy";
    }
}

