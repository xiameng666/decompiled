import android.accounts.Account;

public final class fkwe {
    public final fjcv a;

    public fkwe(fjcv fjcv0) {
        this.a = fjcv0;
    }

    public static fjgk a(fiyh fiyh0) {
        fjgj fjgj0 = fjgk.a();
        String s = fiyh0.e;
        Object object0 = null;
        if(!s.isEmpty()) {
            int v = s.indexOf(":");
            if(v < 0) {
                fkbp.d("%s: Unable to parse Account with string = \'%s\'", "AccountUtil", s);
            }
            else {
                String s1 = s.substring(0, v);
                String s2 = s.substring(v + 1);
                if(fjgt.b(s2) && fjgt.b(s1)) {
                    object0 = new Account(s2, s1);
                }
                else {
                    fkbp.e("%s: Unable to create Account with name = \'%s\', type = \'%s\'", new Object[]{"AccountUtil", s2, s1});
                }
            }
        }
        fjgj0.a = gfsx.l(object0);
        fjgj0.b(fiyh0.c);
        return fjgj0.a();
    }

    public static boolean b(fiyh fiyh0, Account account0) {
        return fiyh0.e.equals(fjgt.a(account0));
    }

    public static boolean c(fiyh fiyh0) {
        return (fiyh0.b & 1) != 0 && fiyh0.c.startsWith("photos_filegroup_");
    }

    public static gmcd d(gmcd gmcd0) {
        fkwc fkwc0 = new fkwc();
        return gdtf.f(gmcd0, Throwable.class, fkwc0, gmap.a);
    }
}

