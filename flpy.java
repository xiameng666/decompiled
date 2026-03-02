import android.database.ContentObserver;
import android.os.Looper;
import j..util.Objects;

final class flpy extends ContentObserver {
    final flpz a;

    public flpy(flpz flpz0) {
        Objects.requireNonNull(flpz0);
        this.a = flpz0;
        super(flpz0.k.e);
    }

    @Override  // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        flbo.a(Looper.getMainLooper() == Looper.myLooper(), "checkMainThread failed");
        this.a.onContentChanged();
    }
}

