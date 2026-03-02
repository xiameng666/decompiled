import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

public final class irp extends ContentObserver {
    final icgv a;

    public irp(icgv icgv0, Handler handler0) {
        this.a = icgv0;
        super(handler0);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri0) {
        this.a.b(ibom.a);
    }
}

