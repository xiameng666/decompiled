import android.content.Context;

public final class sih {
    public static final jdz a(Context context0, String s, String s1) {
        String s2 = sih.b(context0, s);
        String s3 = sih.b(context0, s1);
        if(s2.length() != 0 && s3.length() != 0) {
            jdy[] arr_jdy = new jdy[2];
            jdv.a(s2);
            arr_jdy[0] = jdx.a(s2, jeu.h, 0, null, 12);
            jdv.a(s3);
            arr_jdy[1] = jdx.a(s3, jeu.i, 0, null, 12);
            return jea.a(arr_jdy);
        }
        return jdz.e;
    }

    private static final String b(Context context0, String s) {
        int v = context0.getResources().getIdentifier(s, "string", "android");
        String s1 = context0.getResources().getString(v);
        ibuq.e(s1, "getString(...)");
        return s1;
    }
}

