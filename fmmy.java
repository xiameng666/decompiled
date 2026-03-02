import java.io.File;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;

public final class fmmy implements Callable {
    public final fmna a;
    public final fmga b;
    public final fmlr c;

    public fmmy(fmna fmna0, fmga fmga0, fmlr fmlr0) {
        this.a = fmna0;
        this.b = fmga0;
        this.c = fmlr0;
    }

    @Override
    public final Object call() {
        fmjm fmjm0 = this.c.a;
        fmga fmga0 = this.b;
        fmna fmna0 = this.a;
        fmid fmid0 = fmna0.d;
        String s = fmid0.b(fmga0.c, fmjm0.a);
        File file0 = new File(s);
        Set set0 = fmna.b;
        synchronized(set0) {
            if(file0.exists()) {
                String s1 = file0.getAbsolutePath();
                fmna0.f.b(s1);
            }
            else if(set0.contains(s)) {
                fmna0.f.b(null);
            }
            else {
                HashMap hashMap0 = fmna.c;
                if(hashMap0.containsKey(s)) {
                    gmcd gmcd0 = (gmcd)hashMap0.get(s);
                    if(gmcd0 != null) {
                        fmna0.a(gmcd0);
                    }
                }
                else {
                    fmib fmib0 = new fmib();
                    fmib0.c(fmjm0);
                    fmib0.b(27);
                    fmic fmic0 = fmib0.a();
                    gmcd gmcd1 = fmid0.a(fmna0.e, fmga0, fmic0);
                    hashMap0.put(s, gmcd1);
                    gmcd1.hB(new fmmx(s), fmna.a);
                    fmna0.a(gmcd1);
                }
            }
        }
        return null;
    }
}

