import android.content.Intent;
import com.google.android.gms.backup.settings.component.AutoValue_PhotosEnablementSnackbarInfo;
import j..util.Objects;

final class asip implements aqzl {
    final asit a;

    public asip(asit asit0) {
        Objects.requireNonNull(asit0);
        this.a = asit0;
        super();
    }

    @Override  // aqzl
    public final Object a() {
        baun baun0 = this.a.a;
        baun0.j("Photos enablement action (REQUEST_CODE_PHOTOS_ENABLEMENT) finished, attempting photosBackupDataFlavorHandler#recordConsentAndEnableBackup.", new Object[0]);
        aqnk aqnk0 = this.a.e;
        aqvd aqvd0 = this.a.b;
        if(aqnk0.e(this.a.d, aqvd0)) {
            return aqnk0.d(aqvd0);
        }
        baun0.f("Got `false` from recordConsentAndEnableBackup.", new Object[0]);
        throw new gfuz("Unexpected failure when enabling Photos backup");
    }

    @Override  // aqzl
    public final void b(Object object0) {
        asit asit0 = this.a;
        asit0.a.j("Photos enablement action=" + ((gfsx)object0), new Object[0]);
        if(((gfsx)object0) == null) {
            asit0.e(new AutoValue_PhotosEnablementSnackbarInfo(false, null, null, null));
            return;
        }
        if(((gfsx)object0).i()) {
            asit0.i = (Intent)((gfsx)object0).d();
            if(aqnk.g(asit0.i)) {
                asit0.c();
                return;
            }
            if(!aqnk.h(asit0.i) && !aqnk.f(asit0.i)) {
                asit0.e(null);
                return;
            }
            asit0.e(new AutoValue_PhotosEnablementSnackbarInfo(false, asit0.i, null, null));
            return;
        }
        asiq asiq0 = new asiq(asit0);
        asit0.l.b(asiq0);
    }
}

