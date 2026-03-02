import java.io.IOException;

public final class czkk {
    public static gymd a(IOException iOException0) {
        if(iOException0.getMessage() == null) {
            return gymd.cn;
        }
        if(!iOException0.getMessage().contains("Socket is closed") && !iOException0.getMessage().contains("Socket closed")) {
            if(iOException0.getMessage().contains("Socket is not bound")) {
                return gymd.bJ;
            }
            return iOException0.getMessage().contains("Unknown address type:") ? gymd.bK : gymd.a;
        }
        return gymd.ay;
    }
}

