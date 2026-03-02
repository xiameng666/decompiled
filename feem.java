import android.os.Message;
import j..util.Objects;

final class feem extends fefk {
    final feeq a;

    public feem(feeq feeq0) {
        Objects.requireNonNull(feeq0);
        this.a = feeq0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "DisconnectingState";
    }

    @Override  // fefk
    public final void b() {
        this.a.x(1);
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        return true;
    }
}

