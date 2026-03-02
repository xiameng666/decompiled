import android.content.pm.PackageManager.NameNotFoundException;

public final class arjm {
    public static final baun a;
    private arbb b;
    private ianj_grpcChannel c;
    private final arji d;

    static {
        arjm.a = aqql.a("ExternalStorageCustomD2DApiClient");
    }

    public arjm(arji arji0) {
        this.d = arji0;
    }

    public final arbb a() {
        String s;
        arji arji0;
        hqhq hqhq0 = hqhq.a;
        if(!hqhq0.j().bd()) {
            if(this.b == null) {
            label_5:
                if(this.c == null || this.c.i()) {
                    try {
                        arji0 = this.d;
                        if(((long)arji0.a.getPackageManager().getPackageInfo("com.google.android.apps.restore", 0).versionCode) >= hqhq0.j().D()) {
                            s = "com.google.android.apps.restore.backup.externalstorage.apiservice.ExternalStorageBackupApiEndpointService";
                        }
                        else {
                            arji0.b.m("Restore apk version is lower than the required version", new Object[0]);
                            s = "restore_apk_version_too_low";
                        }
                    }
                    catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                        arji0.b.g("Restore apk not found", packageManager$NameNotFoundException0, new Object[0]);
                        s = "restore_apk_not_found";
                    }
                    iaqq iaqq0 = iaqq.m(iaql.b("com.google.android.apps.restore", s), arji0.a);
                    ggoh ggoh0 = new ggoh("com.google.android.apps.restore");
                    iaqq0.p(gpjc.a(arji0.a, ggoh0, gmap.a));
                    iaqr iaqr0 = new iaqr();
                    iaqr0.b();
                    iaqq0.o(iaqr0.a());
                    this.c = iaqq0.a();
                }
                this.b = arbc.a(this.c);
            }
        }
        else if(this.b == null || (this.c == null || this.c.i())) {
            goto label_5;
        }
        return this.b;
    }
}

