import android.graphics.Bitmap;
import java.io.IOException;
import java.util.HashMap;

public final class flzv {
    public static gfsx a(fmga fmga0) {
        return flzv.c(fmga0) ? fmab.a(flbm.g(fmga0.f.b().b)) : gfqx.a;
    }

    public static String b(fmga fmga0) {
        fmfr fmfr0 = fmga0.f;
        if(fmfr0.a() == 2) {
            return fmfr0.d();
        }
        return flzv.c(fmga0) ? ((fmah)flzv.a(fmga0).d()).b : "";
    }

    public static boolean c(fmga fmga0) {
        return fmga0.f.a() == 3 && fmga0.f.b().a.equals("link_preview");
    }

    public static byte[] d(fmah fmah0) {
        try {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("MESSAGE_TEXT", fmah0.b);
            hashMap0.put("TITLE", fmah0.c);
            hashMap0.put("DESCRIPTION", fmah0.d);
            hashMap0.put("IMAGE_URL", fmah0.e);
            gfsx gfsx0 = fmah0.h;
            if(gfsx0.i()) {
                hashMap0.put("IMAGE", flbm.j(((Bitmap)gfsx0.d())));
            }
            hashMap0.put("DOMAIN", fmah0.f);
            hashMap0.put("CANONICAL_URL", fmah0.g);
            gfsx gfsx1 = fmah0.i;
            if(gfsx1.i()) {
                hashMap0.put("EXPIRATION_TIME_MS", gfsx1.d());
            }
            return flbm.i(hashMap0);
        }
        catch(IOException iOException0) {
            flbj.d("LinkPreviewUtils", "Failed to serialize Link Preview", iOException0);
            return new byte[0];
        }
    }
}

