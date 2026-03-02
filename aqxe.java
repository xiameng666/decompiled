import android.app.backup.SelectBackupTransportCallback;
import j..util.Objects;

final class aqxe extends SelectBackupTransportCallback {
    final aqxf a;

    public aqxe(aqxf aqxf0) {
        Objects.requireNonNull(aqxf0);
        this.a = aqxf0;
        super();
    }

    public final void onFailure(int v) {
        aqxf.a.f("Failed to select %s. Reason: %d", new Object[]{this.a.b, v});
        this.a.c();
    }

    public final void onSuccess(String s) {
        aqxf.a.d("Successfully selected transport: %s", new Object[]{s});
        this.a.c();
    }
}

