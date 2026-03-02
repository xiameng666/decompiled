import com.google.android.gms.nearby.sharing.SharingChimeraTileService;

public final class dcmc implements evqc {
    public final SharingChimeraTileService a;

    public dcmc(SharingChimeraTileService sharingChimeraTileService0) {
        this.a = sharingChimeraTileService0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        SharingChimeraTileService sharingChimeraTileService0 = this.a;
        if(djak.a(sharingChimeraTileService0)) {
            sharingChimeraTileService0.c("com.google.android.gms.nearby.sharing.quicksettings.QuickSettingsActivity");
        }
        else {
            sharingChimeraTileService0.c("com.google.android.gms.nearby.sharing.receive.ReceiveActivity");
        }
        sharingChimeraTileService0.a.h(sharingChimeraTileService0.getApplicationContext(), null);
    }
}

