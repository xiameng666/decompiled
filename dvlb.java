import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public final class dvlb {
    public static final bboh a;
    public final Context b;

    static {
        dvlb.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvlb(Context context0) {
        this.b = context0;
    }

    public final boolean a(Uri uri0) {
        ibuq.f(uri0, "uri");
        bboh bboh0 = dvlb.a;
        ((ggtj)bboh0.h()).x("Prepare to delete cached resource for specific URI");
        try {
            if(dvla.b(this.b, uri0)) {
                ((ggtj)bboh0.h()).x("URI points to cached resource, deleting...");
                boolean z = new File(new URI(uri0.toString())).delete();
                if(z) {
                    ((ggtj)bboh0.h()).x("Cached resource deleted");
                    return z;
                }
                ((ggtj)bboh0.j()).x("Failed to delete cached resource");
                return z;
            }
            ((ggtj)bboh0.h()).x("URI doesn\'t point to cached resource or it is already deleted");
            return true;
        }
        catch(SecurityException securityException0) {
            a.ae(dvlb.a.j(), "Cannot access cached resource file to delete", securityException0);
            return false;
        }
        catch(IOException iOException0) {
            a.ae(dvlb.a.j(), "Cached URI points to file that cannot be deleted", iOException0);
            return false;
        }
    }
}

