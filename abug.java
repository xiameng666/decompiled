import android.app.Application;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.licenses.ChimeraLicense;
import com.google.android.chimera.licenses.ChimeraLicenses;
import com.google.android.chimera.licenses.License;
import com.google.android.gms.app.phone.settings.licenses.LicenseWrapper;
import java.io.IOException;

public final class abug implements Runnable {
    public final abui a;
    public final LicenseWrapper b;

    public abug(abui abui0, LicenseWrapper licenseWrapper0) {
        this.a = abui0;
        this.b = licenseWrapper0;
    }

    @Override
    public final void run() {
        String s;
        LicenseWrapper licenseWrapper0;
        abui abui0;
        try {
            abui0 = this.a;
            licenseWrapper0 = this.b;
            lqi lqi0 = abui0.a;
            Application application0 = abui0.a();
            ChimeraLicense chimeraLicense0 = licenseWrapper0.a;
            if(chimeraLicense0 != null) {
                s = ChimeraLicenses.loadLicenseText(application0, chimeraLicense0);
                lqi0.ii(s);
                return;
            }
            License license0 = licenseWrapper0.b;
            if(license0 == null) {
                throw new AssertionError();
            }
            gfuy.e(licenseWrapper0.c);
            s = xjx.a(application0.getPackageManager().getResourcesForApplication(licenseWrapper0.c), licenseWrapper0.c, license0);
            lqi0.ii(s);
        }
        catch(IOException | PackageManager.NameNotFoundException | InvalidConfigException exception0) {
            a.e(abtq.a.i(), "Failed fetching license text for %s", licenseWrapper0, exception0);
            abui0.b.ii(Boolean.valueOf(true));
        }
    }
}

