import com.google.android.gms.nearby.sharing.DeviceVisibility;
import com.google.android.gms.nearby.sharing.SharingChimeraTileService.1;

public final class dcmd implements evqf {
    public final SharingChimeraTileService.1 a;

    public dcmd(SharingChimeraTileService.1 sharingChimeraTileService$10) {
        this.a = sharingChimeraTileService$10;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.a.a.d(((DeviceVisibility)object0).f != 0);
        this.a.a.e(((DeviceVisibility)object0).f);
    }
}

