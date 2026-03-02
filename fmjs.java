import java.io.IOException;
import java.util.HashMap;

public final class fmjs {
    public static gfsx a(fmga fmga0) {
        fmfr fmfr0 = fmga0.f;
        return fmfr0.a() == 3 && fmfr0.b().a.equals("rich_card") ? fmka.a(flbm.g(fmfr0.b().b)) : gfqx.a;
    }

    public static byte[] b(fmlz fmlz0) {
        try {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("TYPE", Integer.valueOf(fmlz0.b().d));
            switch(fmlz0.b().ordinal()) {
                case 0: {
                    fmmb fmmb0 = fmlz0.c();
                    HashMap hashMap1 = new HashMap();
                    fmjz fmjz0 = new fmjz();
                    hashMap1.put("COMPONENTS", flbp.d(fmmb0.a, fmjz0));
                    gfsx gfsx0 = fmmb0.b;
                    if(gfsx0.i()) {
                        hashMap1.put("PREFERRED_MAX_WIDTH", gfsx0.d());
                    }
                    hashMap0.put("STACK_CARD", hashMap1);
                    break;
                }
                case 1: {
                    flbl.b(fmlz0.d().b(), new fmjx(hashMap0));
                    break;
                }
                case 2: {
                    flbl.b(fmlz0.a().b(), new fmjy(hashMap0));
                }
            }
            return flbm.i(hashMap0);
        }
        catch(IllegalArgumentException | IOException exception0) {
            flbj.d("RichCardUtils", "Failed to serialize Rich Card", exception0);
            return new byte[0];
        }
    }
}

