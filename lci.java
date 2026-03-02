import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class lci implements lae {
    public final File a;
    public final ldr b;
    private final AtomicBoolean c;

    public lci(File file0, ldr ldr0) {
        ibuq.f(file0, "file");
        super();
        this.a = file0;
        this.b = ldr0;
        this.c = new AtomicBoolean(false);
    }

    @Override  // lae
    public final void a() {
        this.c.set(true);
    }

    protected final void b() {
        if(!this.c.get()) {
            return;
        }
        throw new IllegalStateException("This scope has already been closed.");
    }
}

