import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import java.util.Locale;

public final class abss extends abpf {
    protected String a;
    protected String b;
    protected boolean c;
    protected int e;
    public boolean f;
    public boolean g;

    public abss(abpi abpi0) {
        super(abpi0);
    }

    @Override  // abpf
    protected final void a() {
        int v1;
        ApplicationInfo applicationInfo0;
        try {
            applicationInfo0 = this.f().getPackageManager().getApplicationInfo("com.google.android.gms", 0x80);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            this.C("PackageManager doesn\'t know about the app package", packageManager$NameNotFoundException0);
            applicationInfo0 = null;
        }
        if(applicationInfo0 == null) {
            this.B("Couldn\'t get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle0 = applicationInfo0.metaData;
        if(bundle0 != null) {
            int v = bundle0.getInt("com.google.android.gms.analytics.globalConfigResource");
            if(v > 0) {
                abrw abrw0 = abqc.a(v, new abrv(this.d), new abpe(this.d));
                if(abrw0 != null) {
                    this.y("Loading global XML config values");
                    String s = abrw0.a;
                    if(s != null) {
                        this.b = s;
                        this.s("XML config - app name", s);
                    }
                    String s1 = abrw0.b;
                    if(s1 != null) {
                        this.a = s1;
                        this.s("XML config - app version", s1);
                    }
                    String s2 = abrw0.c;
                    boolean z = false;
                    if(s2 != null) {
                        String s3 = s2.toLowerCase(Locale.US);
                        if("verbose".equals(s3)) {
                            v1 = 0;
                        }
                        else if("info".equals(s3)) {
                            v1 = 1;
                        }
                        else if("warning".equals(s3)) {
                            v1 = 2;
                        }
                        else {
                            v1 = "error".equals(s3) ? 3 : -1;
                        }
                        if(v1 >= 0) {
                            this.z("XML config - log level", Integer.valueOf(v1));
                        }
                    }
                    int v2 = abrw0.d;
                    if(v2 >= 0) {
                        this.e = v2;
                        this.c = true;
                        this.s("XML config - dispatch period (sec)", Integer.valueOf(v2));
                    }
                    int v3 = abrw0.e;
                    if(v3 != -1) {
                        if(1 == v3) {
                            z = true;
                        }
                        this.g = z;
                        this.f = true;
                        this.s("XML config - dry run", Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    public final String b() {
        this.I();
        return this.b;
    }

    public final String c() {
        this.I();
        return this.a;
    }
}

