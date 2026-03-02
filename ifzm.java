import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class ifzm implements igad {
    public final igac a;
    public final ByteBuffer b;

    public ifzm(igac igac0, ByteBuffer byteBuffer0) {
        this.a = igac0;
        this.b = byteBuffer0;
    }

    @Override  // igad
    public final void a() {
        int v;
        igac igac0 = this.a;
        ReadableByteChannel readableByteChannel0 = igac0.n;
        ByteBuffer byteBuffer0 = this.b;
        if(readableByteChannel0 == null) {
            v = -1;
        }
        else {
            ++igac0.v;
            v = readableByteChannel0.read(byteBuffer0);
        }
        if(v != -1) {
            ifzs ifzs0 = new ifzs(igac0.b, igac0.o, byteBuffer0);
            igac0.b.a(ifzs0, "onReadCompleted");
            return;
        }
        ReadableByteChannel readableByteChannel1 = igac0.n;
        if(readableByteChannel1 != null) {
            readableByteChannel1.close();
        }
        if(igac0.g.compareAndSet(5, 7)) {
            igac0.f();
            ifzp ifzp0 = new ifzp(igac0.b, igac0.o);
            igac0.b.b(ifzp0, "onSucceeded");
        }
    }
}

