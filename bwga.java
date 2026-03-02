import android.database.ContentObserver;
import j..util.Objects;

final class bwga extends ContentObserver {
    final bwgb a;

    public bwga(bwgb bwgb0) {
        Objects.requireNonNull(bwgb0);
        this.a = bwgb0;
        super(null);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}

