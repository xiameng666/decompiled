import java.util.concurrent.atomic.AtomicBoolean;

public final class blu implements blv {
    private final AtomicBoolean a;
    private final blv b;

    public blu(blv blv0) {
        this.a = new AtomicBoolean(false);
        this.b = blv0;
    }

    @Override  // blv
    public final void a(bmb bmb0) {
        if(!this.a.get()) {
            this.b.a(bmb0);
        }
    }

    public final void b() {
        this.a.set(true);
    }
}

