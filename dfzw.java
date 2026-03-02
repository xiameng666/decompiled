import android.os.HandlerThread;
import j..util.Objects;

final class dfzw extends HandlerThread {
    final dfzx a;

    public dfzw(dfzx dfzx0) {
        Objects.requireNonNull(dfzx0);
        this.a = dfzx0;
        super("StreamAttachmentCloser");
    }

    @Override  // android.os.HandlerThread
    public final void onLooperPrepared() {
        this.a.d = new dfzv(this, this.getLooper());
    }
}

