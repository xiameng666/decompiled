import android.app.PendingIntent;
import com.google.android.gms.backup.settings.component.AutoValue_PhotosEnablementSnackbarInfo;
import j..util.Objects;

final class asiq implements aqzl {
    final asit a;

    public asiq(asit asit0) {
        Objects.requireNonNull(asit0);
        this.a = asit0;
        super();
    }

    @Override  // aqzl
    public final Object a() {
        return gfsx.l(this.a.a());
    }

    @Override  // aqzl
    public final void b(Object object0) {
        AutoValue_PhotosEnablementSnackbarInfo autoValue_PhotosEnablementSnackbarInfo0 = new AutoValue_PhotosEnablementSnackbarInfo(true, null, ((PendingIntent)((gfsx)object0).g()), this.a.d.name);
        this.a.e(autoValue_PhotosEnablementSnackbarInfo0);
    }
}

