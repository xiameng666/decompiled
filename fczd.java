import com.google.android.gms.wearable.internal.MessageEventParcelable;
import j..util.Objects;

final class fczd implements Runnable {
    final MessageEventParcelable a;
    final fczl b;

    public fczd(fczl fczl0, MessageEventParcelable messageEventParcelable0) {
        this.a = messageEventParcelable0;
        Objects.requireNonNull(fczl0);
        this.b = fczl0;
        super();
    }

    @Override
    public final void run() {
        this.b.a.a(this.a);
    }
}

