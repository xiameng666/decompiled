import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class ekgn {
    public static final int a;

    static {
        bboh.b("CBR_ContactRestoreStore", bbcu.bN);
    }

    static long a(Context context0, String s) {
        try {
            for(Object object0: ((List)((glyq)ekar.a(context0).c()).u())) {
                ejxr ejxr0 = (ejxr)object0;
                if(!ejxr0.c.equals(s)) {
                    continue;
                }
                return ejxr0.d;
            }
        }
        catch(InterruptedException | ExecutionException unused_ex) {
        }
        return 0L;
    }

    static void b(Context context0, String s, long v) {
        if(v < 0L) {
            return;
        }
        ekaq ekaq0 = ekar.a(context0);
        ekaq.e(ekaq0.b.b(new ekam(s, v), ekaq0.a));
    }
}

