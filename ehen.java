import android.content.Context;
import android.content.SyncStats;
import android.text.TextUtils;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ehen {
    public final ehfu a;
    public final ehco b;
    public final ehab c;
    public final ehim d;
    public final ehfj e;
    private final Context f;
    private final ehdl g;

    public ehen(Context context0, ehfu ehfu0, ehco ehco0, ehab ehab0, ehim ehim0, ehdl ehdl0, ehfj ehfj0) {
        this.a = ehfu0;
        this.b = ehco0;
        this.c = ehab0;
        this.d = ehim0;
        this.g = ehdl0;
        this.e = ehfj0;
        this.f = context0;
        egiv.R();
    }

    public static HashMap a(LinkedHashMap linkedHashMap0, iaof_metadata iaof0) {
        HashMap hashMap0 = new HashMap();
        if(iaof0 != null && !linkedHashMap0.isEmpty()) {
            byte[] arr_b = (byte[])iaof0.d(new ianv("google.internal.people.v2.bulkinsertcontactserrordetails-bin", iaof_metadata.b));
            try {
                hftc hftc0 = hftc.a();
                int v = 0;
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gsrp.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                Map map0 = DesugarCollections.unmodifiableMap(((gsrp)hftv0).b);
                for(Object object0: linkedHashMap0.keySet()) {
                    egzv egzv0 = (egzv)object0;
                    Integer integer0 = v;
                    if(map0.containsKey(integer0)) {
                        hashMap0.put(egzv0, ehfl.b(((hhna)map0.get(integer0)).c));
                    }
                    ++v;
                }
            }
            catch(hfur hfur0) {
                egig.l("FSA2_BulkInsertContactUpSyncer", "Error when parsing bulkinsertcontactserrordetails", hfur0);
            }
        }
        return hashMap0;
    }

    public final void b(ehcm ehcm0) {
        for(Object object0: ehcm0.c) {
            this.a.b(((egzv)object0));
        }
        this.c.f();
        List list0 = ehcm0.a;
        if(list0.isEmpty()) {
            SyncStats syncStats0 = ((ehiv)this.d).a.stats;
            ++syncStats0.numIoExceptions;
            this.d.r(gjgi.b, girk.b, "BULK_INSERT_PARTIAL_FAILURE", null);
            this.d.h(girk.b, gjgi.b, false, 2, 1);
            return;
        }
        this.c(list0);
    }

    protected final void c(List list0) {
        for(Object object0: list0) {
            this.a.a(this.f, ((egzv)((ehhn)object0).a), ((egzv)((ehhn)object0).b));
            this.c.h();
        }
        this.c.f();
        this.g.d(list0.size(), false);
        if(hxdh.d()) {
            for(Object object1: list0) {
                this.d.g(((egzv)((ehhn)object1).a).a);
            }
        }
    }

    public final void d(ehfc ehfc0) {
        ++((ehiv)this.d).a.stats.numParseExceptions;
        this.d.r(gjgi.b, girk.b, "My Contacts Overflow", ehfc0);
        this.d.h(girk.b, gjgi.b, false, 2, 1);
    }

    public static void e(egzv egzv0) {
        if(hxcc.f()) {
            ehhz.b(egzv0, ((int)hxcc.c()));
        }
        ehhz.a(egzv0, ((int)hxcc.b()));
    }

    public static boolean f(iapl iapl0) {
        iapk iapk0 = iapl0.a;
        if(iapk0.t == iaph.i) {
            String s = hwzc.a.c().U();
            return TextUtils.isEmpty(s) || iapk0.u != null && iapk0.u.contains(s);
        }
        return false;
    }
}

