import android.os.Message;
import j..util.Objects;

final class feej extends fefk {
    final feeq a;

    public feej(feeq feeq0) {
        Objects.requireNonNull(feeq0);
        this.a = feeq0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "ConnectedState";
    }

    @Override  // fefk
    public final void b() {
        this.a.i.set(0);
        this.a.x(1);
    }

    @Override  // fefk
    public final void c() {
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        return true;
    }
}

