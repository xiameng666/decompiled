import java.io.IOException;
import java.util.Locale;

public final class czsc implements Runnable {
    public final czsg a;
    public final String b;
    public final gmcu c;
    public final int d;

    public czsc(czsg czsg0, String s, int v, gmcu gmcu0) {
        this.a = czsg0;
        this.b = s;
        this.d = v;
        this.c = gmcu0;
    }

    @Override
    public final void run() {
        gmcu gmcu0;
        String s;
        czsg czsg0;
        try {
            czsg0 = this.a;
            s = this.b;
            gmcu0 = this.c;
            czsg0.c.connect();
        }
        catch(IOException iOException0) {
            int v = this.d;
            gymb gymb0 = v == 8 ? gymb.c : gymr.h;
            czke.j(s, v, gymb0, czki.a(iOException0), String.format(Locale.US, "PSM : %d, Exception : %s", ((int)czsg0.b), iOException0.getMessage()));
            gmcu0.r(new IOException());
            return;
        }
        if(gmcu0.isCancelled()) {
            czmk.z(czsg0.c, "BLE_L2CAP", s);
            gmcu0.r(new IOException());
            return;
        }
        gmcu0.q(Boolean.valueOf(true));
    }
}

