import com.google.android.gms.nearby.sharing.DeviceVisibility;
import com.google.android.gms.nearby.sharing.SharingChimeraTileService;

public final class dclz implements evqf {
    public final SharingChimeraTileService a;

    public dclz(SharingChimeraTileService sharingChimeraTileService0) {
        this.a = sharingChimeraTileService0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.a.d(((DeviceVisibility)object0).f != 0);
        this.a.e(((DeviceVisibility)object0).f);
    }
}

