import android.os.SystemProperties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class ezvo {
    public static final bboh a;
    public static ezum b;
    public static boolean c;
    public static final Object d;
    public static final BlockingQueue e;

    static {
        ezvo.a = bboh.b("SystemUpdateClient", bbcu.eb);
        ezvo.b = null;
        ezvo.c = false;
        dlbd.b();
        ezvo.d = new Object();
        ezvo.e = new LinkedBlockingQueue();
        SystemProperties.get("ro.build.ab_update", "");
        new ezvn();
    }
}

