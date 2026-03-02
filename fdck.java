import android.content.Context;

public final class fdck {
    private static fpfn a;
    private static fpgc b;

    static {
    }

    public static fpfn a(Context context0) {
        synchronized(fdck.class) {
            if(fdck.a == null) {
                fdck.a = new fpfn(fdck.b(context0));
            }
        }
        return fdck.a;
    }

    public static fpgc b(Context context0) {
        synchronized(fdck.class) {
            if(fdck.b == null) {
                fpga fpga0 = fpgb.a();
                fpga0.b = new fgvy();
                fpfm.b(context0, fpga0);
                fpfm.c("wearable", fpga0);
                fdck.b = fpfm.a(fpga0);
            }
        }
        return fdck.b;
    }
}

