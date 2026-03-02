import android.os.Parcel;
import com.google.android.libraries.photos.backup.api.BackupDisableRequest;

public final class aqud implements aquz {
    public final aqvd a;

    public aqud(aqvd aqvd0) {
        this.a = aqvd0;
    }

    @Override  // aquz
    public final Object a(fptf fptf0) {
        BackupDisableRequest backupDisableRequest0 = new BackupDisableRequest(aquj.a, this.a.a);
        Parcel parcel0 = fptf0.jo();
        wbz.f(parcel0, backupDisableRequest0);
        fptf0.jp(10, parcel0);
        return null;
    }
}

