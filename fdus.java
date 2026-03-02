import java.util.concurrent.atomic.AtomicBoolean;

public abstract class fdus {
    public final AtomicBoolean d;

    public fdus() {
        this.d = new AtomicBoolean(false);
    }

    public abstract void a(fduq arg1);

    public final boolean b() {
        return this.d.get();
    }
}

