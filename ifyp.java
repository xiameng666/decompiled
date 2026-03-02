import java.nio.ByteBuffer;

public final class ifyp implements igad {
    public final ifyw a;
    public final boolean b;

    public ifyp(ifyw ifyw0, boolean z) {
        this.a = ifyw0;
        this.b = z;
    }

    @Override  // igad
    public final void a() {
        ifyw ifyw0 = this.a;
        igar igar0 = ifyw0.c;
        long v = igar0.getLength();
        ifyw0.e = v;
        int v1 = Long.compare(v, 0L);
        if(v1 == 0) {
            ifyw0.f();
            return;
        }
        ifyw0.d = v1 > 0 && v < 0x2000L ? ByteBuffer.allocateDirect(((int)v) + 1) : ByteBuffer.allocateDirect(0x2000);
        long v2 = ifyw0.e;
        if(v2 > 0L) {
            ifyw0.h.setFixedLengthStreamingMode(v2);
        }
        else {
            ifyw0.h.setChunkedStreamingMode(0x2000);
        }
        if(this.b) {
            ifyw0.c();
            return;
        }
        ifyw0.a.set(1);
        igar0.rewind(ifyw0);
    }
}

