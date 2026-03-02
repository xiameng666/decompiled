import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class dnqd {
    private static aboh a;
    private static final boolean b;
    private static final AtomicReference c;

    static {
        bboh.b("Pay", bbcu.cZ);
        dnqd.b = !bbmq.P() && dmgv.e(dmgv.d());
        dnqd.c = new AtomicReference("");
    }

    public static void a(Context context0, String s) {
        dnqd.b(context0, s, null);
    }

    public static void b(Context context0, String s, String s1) {
        if(!dnqd.b) {
            return;
        }
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        abnq.b("&t", "event", hashMap0);
        abnq.d("Service", hashMap0);
        abnq.c(s, hashMap0);
        if(s1 != null) {
            abnq.e(s1, hashMap0);
        }
        dnqd.d(context0).b(abnq.a(hashMap0, hashMap1, arrayList0, arrayList1));
    }

    public static void c(Context context0, String s) {
        if(dnqd.b && !s.equals(((String)dnqd.c.getAndSet(s)))) {
            aboh aboh0 = dnqd.d(context0);
            aboh0.c("&cd", s);
            HashMap hashMap0 = new HashMap();
            HashMap hashMap1 = new HashMap();
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            abnq.b("&t", "screenview", hashMap0);
            aboh0.b(abnq.a(hashMap0, hashMap1, arrayList0, arrayList1));
        }
    }

    private static aboh d(Context context0) {
        aboh aboh1;
        synchronized(dnqd.class) {
            aboh aboh0 = dnqd.a;
            if(aboh0 != null) {
                return aboh0;
            }
            aboh1 = abnp.b(context0).c("UA-22847105-16");
            dnqd.a = aboh1;
        }
        return aboh1;
    }
}

