import android.content.Context;

final class egno {
    static int a(Context context0, baqr baqr0, String[] arr_s) {
        bxf bxf0 = new bxf(0);
        int v = 0;
        for(int v1 = 0; v1 < 2; ++v1) {
            String s = arr_s[v1];
            int v2 = cjmf.a(context0, s, baqr0.h, baqr0.a, baqr0.d);
            if(v2 == -1) {
                bxf0.add(s);
                v = -1;
            }
            else if(v2 == -2) {
                v = -2;
            }
        }
        if(bxf0.isEmpty()) {
            return v;
        }
        throw new SecurityException("Package " + baqr0.d + " is missing required permissions: " + bxf0.toString());
    }
}

