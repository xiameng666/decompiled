import android.accounts.Account;
import java.util.concurrent.Callable;

public final class asns implements Callable {
    public final asnw a;

    public asns(asnw asnw0) {
        this.a = asnw0;
    }

    @Override
    public final Object call() {
        asnw asnw0 = this.a;
        asxf asxf0 = asnw0.c;
        gfsx gfsx0 = asxf0.b();
        boolean z = asxf0.e() && gfsx0.i();
        boolean z1 = ((Boolean)asnw.d("isPhotosBackupEnabled", new asnt(asnw0))).booleanValue();
        if(!z && !z1) {
            asnw.a.d("Both general and photos backup are disabled.", new Object[0]);
            return gfsx.l(asnw0.b(0x7F150996, 0x7F150992, asnw.e(false), cmeu.s, ccow.i));  // string:contextual_card_title_backup_off "@com.google.android.gms:string/backup_turned_off_title"
        }
        if(!z) {
            asnw.a.d("General backup is disabled.", new Object[0]);
            return gfsx.l(asnw0.b(0x7F150998, 0x7F150993, asnw.e(false), cmeu.s, ccow.j));  // string:contextual_card_title_general_backup_off "Backup is off for some data"
        }
        if(!z1) {
            asnw.a.d("Photos backup is disabled.", new Object[0]);
            return gfsx.l(asnw0.b(0x7F150999, 0x7F150994, asnw.e(true), cmeu.t, ccow.k));  // string:contextual_card_title_photos_backup_off "Backup is off for photos & videos"
        }
        if(!((Account)gfsx0.d()).equals(asnw0.d)) {
            asnw.a.h("Unable to create Backup contextual card: the active backup account does not match the selected account in Google Settings.", new Object[0]);
            return gfsx.l(null);
        }
        asnw.a.d("Ideal state.", new Object[0]);
        asxz asxz0 = asxf0.a();
        return gfsx.l(asnw0.a("Backup is on", asya.a(asnw0.b, asxz0), "@com.google.android.gms:string/safetycenter_bbg1_information_card_action_label", ccmu.a(asnw.e(false), cmeu.s), ccow.l));
    }
}

