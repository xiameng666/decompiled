import android.os.PersistableBundle;

public final class rls {
    public static PersistableBundle a(rme rme0) {
        String s;
        boolean z2;
        PersistableBundle persistableBundle0 = new PersistableBundle();
        sdn.b(persistableBundle0, "cc.TARGET", rme0.d());
        persistableBundle0.putBoolean("cc.HANDLES_FAILURE", rme0.f());
        ibzw ibzw0 = rme0.e();
        if(ibzw0 == null) {
            s = null;
        }
        else {
            StringBuilder stringBuilder0 = new StringBuilder();
            long v = ibzw0.c;
            if(ibzw.u(v)) {
                stringBuilder0.append('-');
            }
            stringBuilder0.append("PT");
            long v1 = ibzw.f(v);
            long v2 = ibzw.g(v1);
            int v3 = ibzw.c(v1);
            int v4 = ibzw.e(v1);
            int v5 = ibzw.d(v1);
            boolean z = true;
            if(ibzw.t(v)) {
                v2 = 0x9184E729FFFL;
            }
            boolean z1 = Long.compare(v2, 0L) != 0;
            if(v4 != 0) {
                z2 = true;
            }
            else if(v5 != 0) {
                z2 = true;
                v4 = 0;
            }
            else {
                v5 = 0;
                v4 = 0;
                z2 = false;
            }
            if(v3 == 0) {
                if(z2 && z1) {
                    v3 = 0;
                }
                else {
                    v3 = 0;
                    z = false;
                }
            }
            if(z1) {
                stringBuilder0.append(v2);
                stringBuilder0.append('H');
            }
            if(z) {
                stringBuilder0.append(v3);
                stringBuilder0.append('M');
            }
            if(z2 || !z1 && !z) {
                ibzw.w(stringBuilder0, v4, v5, 9, "S", true);
            }
            s = stringBuilder0.toString();
        }
        persistableBundle0.putString("cc.KEY_ESTIMATED_CALLBACK_RUNTIME", s);
        return persistableBundle0;
    }
}

