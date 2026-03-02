import android.app.Application;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Pair;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.licenses.ChimeraLicenseSource;
import com.google.android.chimera.licenses.ChimeraLicenses;
import com.google.android.gms.app.phone.settings.licenses.LicenseSourceWrapper;

public final class abtz implements Runnable {
    public final abua a;

    public abtz(abua abua0) {
        this.a = abua0;
    }

    @Override
    public final void run() {
        abua abua0;
        try {
            abua0 = this.a;
            lqi lqi0 = abua0.b;
            ggdy ggdy0 = new ggdy();
            ggqk ggqk0 = ((gged_interceptors)ChimeraLicenses.loadLicenseSources(abua0.a())).E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                ggdy0.i(new LicenseSourceWrapper(((ChimeraLicenseSource)object0), ((ChimeraLicenseSource)object0).getDisplayName()));
            }
            gged_interceptors gged0 = abua.a;
            int v = ((ggna)gged0).c;
            for(int v1 = 0; true; ++v1) {
                if(v1 >= v) {
                    ggfp ggfp0 = ggfp.G(hrpd.a.b().b().b);
                    ggdy ggdy1 = new ggdy();
                    ggdy1.i("com.google.android.apps.credentialmanager");
                    hrsm hrsm0 = hrsm.a;
                    if(hrsm0.b().b()) {
                        ggdy1.i("com.google.android.verifier");
                    }
                    if(hrsm0.b().a()) {
                        ggdy1.i("com.google.android.mosey");
                    }
                    abua0.b(ggdy1.h(), ggfp0, ggdy0);
                    abua0.b(gged_interceptors.o("com.google.android.contactkeys", "com.google.android.healthcore", "com.google.android.safetycore", "com.google.android.pcs"), ggfp0, ggdy0);
                    lqi0.ii(ggdy0.h());
                    return;
                }
                Pair pair0 = (Pair)gged0.get(v1);
                if((hrsm.a.b().c() || !((String)pair0.first).equals("com.google.android.apps.camera.services")) && (hrsm.a.b().d() || !((String)pair0.first).equals("com.google.android.apps.stargate"))) {
                    try {
                        Application application0 = abua0.a();
                        String s = (String)pair0.first;
                        if(xjx.d(application0.getPackageManager().getResourcesForApplication(s), s)) {
                            ggdy0.i(new LicenseSourceWrapper(((String)pair0.first), ((String)pair0.second), ((String)pair0.first)));
                        }
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                }
            }
        }
        catch(InvalidConfigException invalidConfigException0) {
            a.ae(abtq.a.i(), "Failed populating license sources", invalidConfigException0);
            abua0.c.ii(Boolean.valueOf(true));
        }
    }
}

