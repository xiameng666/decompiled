import java.io.IOException;

public final class czki {
    public static gymd a(IOException iOException0) {
        if(iOException0.getMessage() == null) {
            return gymd.cn;
        }
        if(iOException0.getMessage().contains("Connect is called on null device")) {
            return gymd.af;
        }
        if(iOException0.getMessage().contains("bt socket closed")) {
            return gymd.ad;
        }
        if(iOException0.getMessage().contains("socket closed")) {
            return gymd.ac;
        }
        if(iOException0.getMessage().contains("Bluetooth is off")) {
            return gymd.ag;
        }
        if(iOException0.getMessage().contains("bt socket connect failed")) {
            return gymd.ae;
        }
        return iOException0.getMessage().contains("unable to send RPC") ? gymd.ab : gymd.a;
    }
}

