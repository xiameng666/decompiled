import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class gpjh extends gpji {
    static final iaoa a;
    static final iaoa b;
    static final iaoa c;
    public static volatile gdnz d;
    public final String e;
    public final boolean f;

    static {
        gpjh.a = new iant("X-Goog-Api-Key", iaof_metadata.c);
        gpjh.b = new iant("X-Android-Package", iaof_metadata.c);
        gpjh.c = new iant("X-Android-Cert", iaof_metadata.c);
        gpjh.d = null;
    }

    public gpjh(String s, boolean z) {
        this.e = s;
        this.f = z;
    }

    @Override  // gpji
    public final gpkv a() {
        return new gpjf(this);
    }

    public static gpjh b(String s) {
        return new gpjh(s, false);
    }

    public static String c(PackageManager packageManager0, String s) {
        if("robolectric".equals(Build.FINGERPRINT)) {
            return "signature_for_test";
        }
        try {
            PackageInfo packageInfo0 = packageManager0.getPackageInfo(s, 0x40);
            if(packageInfo0 == null || packageInfo0.signatures == null || packageInfo0.signatures.length == 0 || packageInfo0.signatures[0] == null) {
                throw new IllegalStateException("Found no signatures");
            }
            Signature signature0 = packageInfo0.signatures[0];
            byte[] arr_b = MessageDigest.getInstance("SHA1").digest(signature0.toByteArray());
            return ghjc.f.f().o(arr_b);
        }
        catch(PackageManager.NameNotFoundException | NoSuchAlgorithmException exception0) {
            throw new RuntimeException("Could not get application signature", exception0);
        }
    }
}

