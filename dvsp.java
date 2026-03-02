import android.content.Intent;

final class dvsp {
    private static final bboh a;

    static {
        dvsp.a = bboh.b("Pay", bbcu.cZ);
    }

    public static int a(du du0) {
        if(du0 == null) {
            ((ggtj)dvsp.a.i()).x("Could not find fragment.");
            return 1;
        }
        xob xob0 = (xob)du0.getContext();
        if(xob0 == null) {
            ((ggtj)dvsp.a.i()).x("Could not find activity.");
            return 1;
        }
        Intent intent0 = xob0.getIntent();
        if(intent0 == null) {
            ((ggtj)dvsp.a.i()).x("Could not find intent.");
            return 1;
        }
        if(intent0.getBooleanExtra(dlnd.u.E, false)) {
            return 12;
        }
        if(intent0.getBooleanExtra(dlnd.h.E, false)) {
            return 13;
        }
        if(intent0.getBooleanExtra(dlnd.a.E, false)) {
            return 3;
        }
        if(intent0.getBooleanExtra(dlnd.b.E, false)) {
            return 4;
        }
        if(intent0.getBooleanExtra(dlnd.c.E, false)) {
            return 5;
        }
        if(intent0.getBooleanExtra(dlnd.s.E, false)) {
            return 11;
        }
        if(intent0.getBooleanExtra(dlnd.y.E, false)) {
            return 14;
        }
        if(intent0.getBooleanExtra(dlnd.B.E, false)) {
            return 15;
        }
        ((ggtj)dvsp.a.j()).x("Unrecognized trigger source.");
        return 2;
    }
}

