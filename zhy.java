public final class zhy {
    public static final zhr a(grwe grwe0) {
        String s1;
        String s;
        ibuq.f(grwe0, "image");
        if((grwe0.b & 8) == 0 && (grwe0.b & 2) == 0 && (grwe0.b & 1) == 0) {
            return null;
        }
        Integer integer0 = (int)grwe0.c;
        if((grwe0.b & 8) == 0) {
            s = grwe0.d;
            ibuq.e(s, "getUrl(...)");
        }
        else {
            s = (grwe0.e == null ? gsae.a : grwe0.e).c;
            ibuq.e(s, "getLight(...)");
        }
        if(((grwe0.e == null ? gsae.a : grwe0.e).b & 2) == 0) {
            String s2 = (grwe0.e == null ? gsae.a : grwe0.e).c;
            ibuq.e(s2, "getLight(...)");
            s1 = s2;
        }
        else {
            s1 = (grwe0.e == null ? gsae.a : grwe0.e).d;
            ibuq.e(s1, "getDark(...)");
        }
        String s3 = grwe0.h;
        ibuq.e(s3, "getAccessibilityLabel(...)");
        return new zhr(integer0, s, s1, s3, grwe0.f, grwe0.g);
    }
}

