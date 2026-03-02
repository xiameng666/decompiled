import android.os.Handler;

public class bcqo extends bbln {
    private final Handler a;

    public bcqo(Handler handler0) {
        super(9);
        gftb.check(handler0);
        this.a = handler0;
    }

    // Detected as a lambda impl.
    public void a() {
        throw null;
    }

    public void b() {
    }

    @Override
    public final void run() {
        this.b();
        bcqn bcqn0 = () -> throw null;
        this.a.post(bcqn0);
    }
}

