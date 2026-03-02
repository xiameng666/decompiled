import android.content.Context;
import java.util.HashMap;

public final class alna {
    static {
    }

    public static ywg a(ywh ywh0) {
        if(ywh0 != null && ywh0.i()) {
            alnb.j.d("Connecting to cross profile connector.", new Object[0]);
            return ywh0.c();
        }
        alnb.j.d("Cross profile connector unavailable", new Object[0]);
        return null;
    }

    public static alnb b(Context context0) {
        alnb alnb0;
        synchronized(alnb.c) {
            HashMap hashMap0 = alnb.k;
            alnb0 = (alnb)hashMap0.get(context0);
            if(alnb0 == null) {
                alnr alnr0 = new alnr(context0);
                alnr0.a.b = new almx();
                alns alns0 = new alns(alnr0);
                hashMap0.put(context0, alns0);
                alnb0 = alns0;
            }
        }
        return alnb0;
    }
}

