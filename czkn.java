import java.io.IOException;

public final class czkn {
    public static gymd a(IOException iOException0) {
        if(iOException0.getMessage() == null) {
            return gymd.cn;
        }
        if(iOException0.getMessage().contains("Software caused connection abort")) {
            return gymd.cs;
        }
        if(iOException0.getMessage().contains("Broken pipe")) {
            return gymd.cr;
        }
        return iOException0.getMessage().contains("Socket closed") ? gymd.ay : gymd.a;
    }
}

