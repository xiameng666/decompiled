import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import j..util.Objects;

final class fczk implements Runnable {
    final ChannelEventParcelable a;
    final fczl b;

    public fczk(fczl fczl0, ChannelEventParcelable channelEventParcelable0) {
        this.a = channelEventParcelable0;
        Objects.requireNonNull(fczl0);
        this.b = fczl0;
        super();
    }

    @Override
    public final void run() {
        this.a.a(this.b.a);
        this.a.a(this.b.a.s);
    }
}

