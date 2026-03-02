import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class caax {
    public static final bboh a;
    public static final Charset b;
    public final PackageManager c;
    public final bzwp d;
    public final String e;
    private final File f;

    static {
        caax.a = bboh.b("InstantAppsStorage", bbcu.bz);
        caax.b = Charset.forName("UTF-8");
    }

    public caax(Context context0, bzwp bzwp0, String s) {
        this.d = bzwp0;
        this.c = context0.getPackageManager();
        this.e = s + "/appStorage";
        fpjb.f(context0);
        this.f = hrnt.i() ? new File(ccsb.a.a(s + "/appStorage")) : new File(s + "/appStorage");
    }

    public final File a(String s) {
        return hrnt.i() ? new File(ccsb.a.d(this.e, s + ".gzip")) : new File(this.e, s + ".gzip");
    }

    final void b(String s) {
        batl.q(s);
        this.c();
        this.d.d(s.getBytes(caax.b));
        File file0 = this.a(s);
        if(file0.exists()) {
            file0.delete();
        }
    }

    public final void c() {
        if(!this.d.i()) {
            throw new IOException("LevelDb creation failed.");
        }
        if(!this.f.exists() && !this.f.mkdirs()) {
            throw new IOException("Can\'t create storage folder.");
        }
    }
}

