import android.accounts.Account;
import com.google.android.gms.nearby.sharing.SharingChimeraTileService;

public final class dcmb implements evqf {
    public final SharingChimeraTileService a;

    public dcmb(SharingChimeraTileService sharingChimeraTileService0) {
        this.a = sharingChimeraTileService0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.a.c("com.google.android.gms.nearby.sharing.quicksettings.QuickSettingsActivity");
        this.a.a.h(this.a.getApplicationContext(), ((Account)object0));
        dcpn dcpn0 = this.a.a;
        ProtoLiteBuilder hftp0 = dcpt.L(40);
        gysk gysk0 = gysk.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gysk0.getClass();
        gysp0.M = gysk0;
        gysp0.c |= 0x400;
        dcpn0.i(new dcow(((gysp)hftp0.N_build())));
    }
}

