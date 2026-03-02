import android.content.Context;

public final class buvg {
    public static final buvg a;
    private static volatile lap b;

    static {
        buvg.a = new buvg();
    }

    public final lap a(Context context0) {
        lap lap1;
        ibuq.f(context0, "context");
        lap lap0 = buvg.b;
        if(lap0 != null) {
            return lap0;
        }
        synchronized(this) {
            lap1 = buvg.b;
            if(lap1 == null) {
                buvf buvf0 = new buvf(context0);
                lap1 = ldh.a(buve.a, null, buvf0, 14);
                buvg.b = lap1;
            }
        }
        return lap1;
    }
}

