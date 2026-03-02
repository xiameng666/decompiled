import java.io.IOException;

public final class czkl {
    public static gymd a(IOException iOException0) {
        if(iOException0.getMessage() == null) {
            return gymd.cn;
        }
        if(!iOException0.getMessage().contains("Socket is closed") && !iOException0.getMessage().contains("Socket closed")) {
            if(!iOException0.getMessage().contains("Already bound") && !iOException0.getMessage().contains("Socket is already bound")) {
                if(!iOException0.getMessage().contains("Unresolved address") && !iOException0.getMessage().contains("Host is unresolved:")) {
                    return iOException0.getMessage().contains("Failed to find my own IPv4 address") ? gymd.bG : gymd.a;
                }
                return gymd.an;
            }
            return gymd.bL;
        }
        return gymd.ay;
    }
}

