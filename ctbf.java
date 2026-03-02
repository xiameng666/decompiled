import com.android.settingslib.widget.BannerMessagePreference;
import com.google.android.gms.multidevice.featuresettings.multidevicesync.MultideviceSyncLandingFragment;

final class ctbf implements icih {
    final MultideviceSyncLandingFragment a;

    public ctbf(MultideviceSyncLandingFragment multideviceSyncLandingFragment0) {
        this.a = multideviceSyncLandingFragment0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        MultideviceSyncLandingFragment multideviceSyncLandingFragment0 = this.a;
        multideviceSyncLandingFragment0.O(((cswx)object0));
        BannerMessagePreference bannerMessagePreference0 = null;
        if(((cswx)multideviceSyncLandingFragment0.L().b().b()).a().isEmpty()) {
            BannerMessagePreference bannerMessagePreference1 = multideviceSyncLandingFragment0.ah;
            if(bannerMessagePreference1 == null) {
                ibuq.j("permissionBanner");
            }
            else {
                bannerMessagePreference0 = bannerMessagePreference1;
            }
            bannerMessagePreference0.T(false);
            return ibom.a;
        }
        BannerMessagePreference bannerMessagePreference2 = multideviceSyncLandingFragment0.ah;
        if(bannerMessagePreference2 == null) {
            ibuq.j("permissionBanner");
        }
        else {
            bannerMessagePreference0 = bannerMessagePreference2;
        }
        bannerMessagePreference0.T(true);
        return ibom.a;
    }
}

