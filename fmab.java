import java.util.HashMap;

public final class fmab {
    public static gfsx a(HashMap hashMap0) {
        fmag fmag0 = new fmag(null);
        fmag0.g(((String)hashMap0.get("MESSAGE_TEXT")));
        fmag0.h(((String)hashMap0.get("TITLE")));
        fmag0.c(((String)hashMap0.get("DESCRIPTION")));
        fmag0.f(((String)hashMap0.get("IMAGE_URL")));
        fmag0.d(((String)hashMap0.get("DOMAIN")));
        fmag0.b(((String)hashMap0.get("CANONICAL_URL")));
        if(hashMap0.containsKey("IMAGE")) {
            fmag0.a = gfsx.m(flbm.a(((byte[])hashMap0.get("IMAGE"))));
        }
        if(hashMap0.containsKey("EXPIRATION_TIME_MS")) {
            fmag0.e(((Long)hashMap0.get("EXPIRATION_TIME_MS")).longValue());
        }
        return gfsx.m(fmag0.a());
    }
}

