import java.io.IOException;
import java.util.HashMap;

public final class fmia {
    public static gfsx a(fmga fmga0) {
        fmfr fmfr0 = fmga0.f;
        return fmfr0.a() == 3 && fmfr0.b().a.equals("photos") ? fmia.b(fmfr0.b().b) : gfqx.a;
    }

    public static gfsx b(byte[] arr_b) {
        gfsx gfsx0;
        HashMap hashMap0 = flbm.g(arr_b);
        try {
            fmjn fmjn0 = new fmjn(null);
            fmjn0.f(((Integer)hashMap0.get("WIDTH")).intValue());
            fmjn0.c(((Integer)hashMap0.get("HEIGHT")).intValue());
            fmjn0.d(((Integer)hashMap0.get("SIZE")).intValue());
            fmjn0.b(((Integer)hashMap0.get("DOWNLOAD_STATUS")).intValue());
            if(hashMap0.containsKey("THUMBNAIL")) {
                fmjn0.e(((byte[])hashMap0.get("THUMBNAIL")));
            }
            if(hashMap0.containsKey("MEDIA_ID")) {
                HashMap hashMap1 = (HashMap)hashMap0.get("MEDIA_ID");
                try {
                    fmjl fmjl0 = new fmjl();
                    fmjl0.b(((String)hashMap1.get("RESOURCE_ID")));
                    fmjl0.c(((Integer)hashMap1.get("RESOURCE_REGION")).intValue());
                    gfsx0 = gfsx.m(fmjl0.a());
                }
                catch(RuntimeException runtimeException1) {
                    flbj.d("PhotoConverters", "failed to convert HashMap to LighterMediaId", runtimeException1);
                    gfsx0 = gfqx.a;
                }
                fmjn0.a = (fmjm)gfsx0.d();
            }
            if(hashMap0.containsKey("LOCAL_URI")) {
                fmjn0.b = (String)hashMap0.get("LOCAL_URI");
            }
            return gfsx.m(fmjn0.a());
        }
        catch(RuntimeException runtimeException0) {
            flbj.d("PhotoConverters", "failed to convert HashMap to PhotoData", runtimeException0);
            return gfqx.a;
        }
    }

    public static gfsx c(fmjo fmjo0) {
        try {
            HashMap hashMap0 = new HashMap();
            fmjm fmjm0 = fmjo0.a;
            if(fmjm0 != null) {
                HashMap hashMap1 = new HashMap();
                hashMap1.put("RESOURCE_ID", fmjm0.a);
                hashMap1.put("RESOURCE_REGION", Integer.valueOf(fmjm0.b));
                hashMap0.put("MEDIA_ID", hashMap1);
            }
            String s = fmjo0.b;
            if(s != null) {
                hashMap0.put("LOCAL_URI", s);
            }
            hashMap0.put("WIDTH", Integer.valueOf(fmjo0.d));
            hashMap0.put("HEIGHT", Integer.valueOf(fmjo0.e));
            hashMap0.put("SIZE", Integer.valueOf(fmjo0.f));
            hashMap0.put("DOWNLOAD_STATUS", Integer.valueOf(fmjo0.g));
            gfsx gfsx0 = fmjo0.c;
            if(gfsx0.i()) {
                hashMap0.put("THUMBNAIL", gfsx0.d());
            }
            return gfsx.m(flbm.i(hashMap0));
        }
        catch(IOException iOException0) {
            flbj.d("PhotoUtils", "Failed to serialize photo data", iOException0);
            return gfqx.a;
        }
    }
}

