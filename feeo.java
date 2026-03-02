import android.os.Message;
import j..util.Objects;

final class feeo extends fefk {
    final feeq a;

    public feeo(feeq feeq0) {
        Objects.requireNonNull(feeq0);
        this.a = feeq0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "ServiceOffState";
    }

    @Override  // fefk
    public final void b() {
        feeq feeq0 = this.a;
        if(feeq0.h.compareAndSet(true, false)) {
            feeq0.a.unregisterReceiver(feeq0.j);
        }
        if(((fczq)feeq0.g.get()).f) {
            feeq0.x(3);
        }
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        return true;
    }
}

