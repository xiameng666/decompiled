import android.app.Application;
import com.google.android.chimera.licenses.ChimeraLicense;
import com.google.android.chimera.licenses.ChimeraLicenseSource;
import com.google.android.chimera.licenses.ChimeraLicenses;
import com.google.android.chimera.licenses.License;
import com.google.android.gms.app.phone.settings.licenses.LicenseSourceWrapper;
import com.google.android.gms.app.phone.settings.licenses.LicenseWrapper;
import java.util.Iterator;

public final class abub implements Runnable {
    public final abue a;
    public final LicenseSourceWrapper b;

    public abub(abue abue0, LicenseSourceWrapper licenseSourceWrapper0) {
        this.a = abue0;
        this.b = licenseSourceWrapper0;
    }

    @Override
    public final void run() {
        abue abue0;
        LicenseSourceWrapper licenseSourceWrapper0;
        try {
            licenseSourceWrapper0 = this.b;
            abue0 = this.a;
            lqi lqi0 = abue0.a;
            gfze gfze0 = new gfze(new abuc(), ggmi.a);
            Application application0 = abue0.a();
            ggdy ggdy0 = new ggdy();
            ChimeraLicenseSource chimeraLicenseSource0 = licenseSourceWrapper0.a;
            if(chimeraLicenseSource0 == null) {
                String s = licenseSourceWrapper0.b;
                if(s != null) {
                    Iterator iterator0 = xjx.c(application0, s).iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_22;
                        }
                        Object object0 = iterator0.next();
                        ggdy0.i(new LicenseWrapper(((License)object0), s));
                    }
                }
                throw new AssertionError();
            }
            else {
                ggqk ggqk0 = ((gged_interceptors)ChimeraLicenses.loadLicenses(application0, chimeraLicenseSource0)).E();
                while(ggqk0.hasNext()) {
                    Object object1 = ggqk0.next();
                    ggdy0.i(new LicenseWrapper(((ChimeraLicense)object1)));
                }
            }
        label_22:
            lqi0.ii(gggc.T(gfze0, ggdy0.h()));
        }
        catch(Exception exception0) {
            a.e(abtq.a.i(), "Failed populating licenses for %s", licenseSourceWrapper0, exception0);
            abue0.b.ii(Boolean.valueOf(true));
        }
    }
}

