import org.chromium.net.NetworkException;

public class clbr extends clbw {
    public clbr(NetworkException networkException0, gfsx gfsx0) {
        super("Failed to process request", networkException0, gfsx0);
    }

    public final int a() {
        return ((NetworkException)((gftm)this.b()).a).getErrorCode();
    }

    protected gfsx b() {
        return gfsx.m(((NetworkException)this.a.d()));
    }
}

