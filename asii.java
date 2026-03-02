import android.app.PendingIntent;
import com.google.android.gms.backup.settings.component.AutoValue_PhotosEnablementSnackbarInfo;

public final class asii implements Runnable {
    public final asit a;
    public final PendingIntent b;

    public asii(asit asit0, PendingIntent pendingIntent0) {
        this.a = asit0;
        this.b = pendingIntent0;
    }

    @Override
    public final void run() {
        AutoValue_PhotosEnablementSnackbarInfo autoValue_PhotosEnablementSnackbarInfo0 = new AutoValue_PhotosEnablementSnackbarInfo(true, null, this.b, this.a.d.name);
        this.a.e(autoValue_PhotosEnablementSnackbarInfo0);
    }
}

