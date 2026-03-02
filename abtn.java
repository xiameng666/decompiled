import android.text.format.Formatter;
import com.google.android.gms.app.phone.settings.ManageSpaceChimeraActivity;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import j..util.Objects;

public final class abtn implements evqf {
    final ManageSpaceChimeraActivity a;

    public abtn(ManageSpaceChimeraActivity manageSpaceChimeraActivity0) {
        Objects.requireNonNull(manageSpaceChimeraActivity0);
        this.a = manageSpaceChimeraActivity0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.a.k.setText(Formatter.formatFileSize(this.a, (((StorageInfoResponse)object0) == null ? 0L : ((StorageInfoResponse)object0).b)));
    }
}

