import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import java.nio.ByteBuffer;

public final class blob {
    public static gfsx a(String s) {
        try {
            gfsx gfsx0 = blob.b(s);
            if(gfsx0.i()) {
                return gfsx.m(bboy.b(((ByteBuffer)gfsx0.d()).array()));
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return gfqx.a;
    }

    public static gfsx b(String s) {
        byte[] arr_b = bbms.n(AppContextProvider.a(), s, "SHA-256");
        return arr_b == null ? gfqx.a : gfsx.m(ByteBuffer.wrap(arr_b));
    }

    public static gfsx c(String s) {
        try {
            return blob.b(s);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return gfqx.a;
        }
    }
}

