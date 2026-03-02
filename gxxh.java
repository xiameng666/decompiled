import java.util.concurrent.atomic.AtomicReference;

public final class gxxh implements jqv {
    public final gxxu a;
    public final int b;
    public final long c;
    public final AtomicReference d;

    public gxxh(gxxu gxxu0, int v, long v1, AtomicReference atomicReference0) {
        this.a = gxxu0;
        this.b = v;
        this.c = v1;
        this.d = atomicReference0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        gxxo gxxo0 = new gxxo(this.a, this.b, this.c, jqt0);
        this.a.j(gxxo0);
        this.d.set(gxxo0);
        this.a.f.s(this.a.e, this.a.m, this.b);
        return "BluetoothDeviceConnectionStateManager:tryReconnectProxy";
    }
}

