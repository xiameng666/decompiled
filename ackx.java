import android.content.Context;
import jeb.synthetic.FIN;

public final class ackx {
    private static ackx a;

    static {
    }

    static ackx a() {
        synchronized(ackx.class) {
            if(ackx.a == null) {
                ackx.a = new ackx();
            }
        }
        return ackx.a;
    }

    final void b(Context context0, String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        Context context1 = context0.getApplicationContext();
        if(context1 != null) {
            context0 = context1;
        }
        if(context0.getSharedPreferences("publisher_ids_to_pvid_keysets", 0).edit().remove(s).commit()) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new acky();
    }

    final byte[] c(Context context0, String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        byte[] arr_b = elfz.c(elfz.a(context0, "publisher_ids_to_pvid_keysets", s));
        if(arr_b != null) {
            FIN.finallyCodeBegin$NT(v);
            return arr_b;
        }
        throw new ackw();
    }
}

