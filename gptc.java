import com.google.gms.mdns.MdnsServiceInfo;
import j..time.Instant;
import j..util.DesugarCollections;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class gptc {
    public static MdnsServiceInfo a(gprn gprn0, String[] arr_s, long v) {
        String[] arr_s2;
        int v1;
        List list0 = null;
        if(gprn0.q()) {
            String[] arr_s1 = gprn0.b().b;
            v1 = gprn0.b().a;
            arr_s2 = arr_s1;
        }
        else {
            v1 = 0;
            arr_s2 = null;
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        if(gprn0.o()) {
            for(Object object0: gprn0.e()) {
                Inet4Address inet4Address0 = ((gpra)object0).b;
                arrayList0.add((inet4Address0 == null ? null : inet4Address0.getHostAddress()));
            }
        }
        if(gprn0.p()) {
            for(Object object1: gprn0.f()) {
                Inet6Address inet6Address0 = ((gpra)object1).a;
                arrayList1.add((inet6Address0 == null ? null : inet6Address0.getHostAddress()));
            }
        }
        String s = gprn0.d();
        if(s == null) {
            throw new IllegalStateException("mDNS response must have non-null service instance name");
        }
        if(gprn0.r()) {
            list0 = DesugarCollections.unmodifiableList(gprn0.c().a);
        }
        Instant instant0 = Instant.now();
        List list1 = gprn0.i();
        Instant instant1 = instant0.plusMillis(gprn0.a(v));
        return new MdnsServiceInfo(s, arr_s, list1, arr_s2, v1, arrayList0, arrayList1, list0, gprn0.b, gprn0.c, instant1);
    }

    public static boolean b(gprm gprm0, long v) {
        return gprm0.f > 0L && gprm0.d(v) <= gprm0.f >> 1;
    }

    public static boolean c(gprn gprn0, String s, Collection collection0) {
        return (s == null || gpqj.c(s, gprn0.d())) && (collection0.size() == 0 || gppz.b(collection0, new gpta((gprn0.i() == null ? Collections.EMPTY_LIST : gprn0.i()))));
    }
}

