import java.io.IOException;

public final class czkm {
    public static gymd a(IOException iOException0) {
        if(iOException0.getMessage() == null) {
            return gymd.cn;
        }
        if(iOException0.getMessage().contains("Socket is closed")) {
            return gymd.ay;
        }
        if(iOException0.getMessage().contains("already connected")) {
            return gymd.az;
        }
        if(gfqz.d(iOException0.getMessage()).contains("EHOSTUNREACH")) {
            return gymd.aV;
        }
        if(gfqz.d(iOException0.getMessage()).contains("ENETUNREACH")) {
            return gymd.aW;
        }
        return iOException0.getMessage().matches("failed to connect to.*from.*after.*ms") ? gymd.y : gymd.a;
    }

    public static boolean b(IOException iOException0) {
        gymd gymd0 = czkm.a(iOException0);
        return gymd0 == gymd.aV || gymd0 == gymd.aW;
    }
}

