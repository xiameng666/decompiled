import android.content.pm.PackageManager;
import com.google.android.gms.chimera.modules.phenotype.AppContextProvider;
import java.io.IOException;

public final class eiqs {
    public static final bboh a;

    static {
        eiqs.a = bboh.b("LabTestSupportHelper", bbcu.al);
    }

    public final long a(String s) {
        try {
            return Long.parseLong(s);
        }
        catch(NumberFormatException numberFormatException0) {
            a.ae(eiqs.a.j(), "Could not read build timestamp", numberFormatException0);
            return -1L;
        }
    }

    public final gnum b(String s) {
        PackageManager packageManager0 = AppContextProvider.a().getPackageManager();
        try {
            return gnup.a(packageManager0, s);
        }
        catch(IOException iOException0) {
            a.e(eiqs.a.j(), "Failed to read build data for package %s", s, iOException0);
            return null;
        }
    }
}

