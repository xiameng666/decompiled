import com.google.android.gms.nearby.sharing.AppInfo;
import com.google.android.gms.nearby.sharing.AppInstallMetadata;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import j..util.Objects;

final class dccu implements dbzg {
    final long a;
    final NearbySharingChimeraService b;

    public dccu(NearbySharingChimeraService nearbySharingChimeraService0, long v) {
        this.a = v;
        Objects.requireNonNull(nearbySharingChimeraService0);
        this.b = nearbySharingChimeraService0;
        super();
    }

    @Override  // dbzg
    public final void a(ShareTarget shareTarget0, AppInstallMetadata appInstallMetadata0) {
        Attachment attachment0 = dizi.c(shareTarget0.e(), this.a);
        batl.s(attachment0);
        AppInfo appInfo0 = dizi.a(attachment0);
        if(appInfo0 != null) {
            attachment0.d().putByteArray("com.google.android.gms.nearby.sharing.EXTRA_APP_INFO_BYTES", bauc.n(dbvh.a(appInfo0.a, appInfo0.b, appInfo0.c, (appInstallMetadata0.a == 1 || appInstallMetadata0.a == 2 || appInstallMetadata0.a == 3 ? 1 : 0), appInfo0.e, appInfo0.f)));
        }
        dcct dcct0 = new dcct(this, shareTarget0, appInstallMetadata0);
        this.b.aj(dcct0);
    }
}

