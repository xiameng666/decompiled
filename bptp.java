import java.util.concurrent.atomic.AtomicReference;

public final class bptp implements AutoCloseable {
    public final bptx a;
    public final AtomicReference b;

    public bptp(bptx bptx0, AtomicReference atomicReference0) {
        this.a = bptx0;
        this.b = atomicReference0;
    }

    @Override
    public final void close() {
        bptk bptk0 = (bptk)this.b.get();
        if(bptk0 != null) {
            azyd_linstner azyd0 = azyg.b(bptk0, this.a.b.B, "DataListener").listener_;
            batl.t(azyd0, "Key must not be null");
            this.a.b.jm(azyd0, 24005);
        }
    }
}

