import com.google.android.gms.mdns.MdnsSearchOptions;
import com.google.android.gms.mdns.MdnsServiceInfo.TextEntry;
import com.google.android.gms.mdns.MdnsServiceInfo;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public final class cqrr {
    public final cqsk a;
    public final gprq b;

    public cqrr(cqsk cqsk0, MdnsSearchOptions mdnsSearchOptions0) {
        this.a = cqsk0;
        gprq gprq0 = new gprq();
        if(mdnsSearchOptions0 != null) {
            Collection collection0 = (Collection)Objects.requireNonNull(mdnsSearchOptions0.a);
            gprq0.a.addAll(collection0);
            gprq0.b = mdnsSearchOptions0.b ^ 1;
            gprq0.e = mdnsSearchOptions0.c;
            gprq0.c = mdnsSearchOptions0.e != 3;
            gprq0.d = 1;
            String s = mdnsSearchOptions0.g;
            if(s != null) {
                gprq0.f = s;
            }
        }
        this.b = gprq0;
    }

    public static final MdnsServiceInfo a(com.google.gms.mdns.MdnsServiceInfo mdnsServiceInfo0) {
        TreeMap treeMap0 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for(Object object0: mdnsServiceInfo0.l.entrySet()) {
            byte[] arr_b = (byte[])((Map.Entry)object0).getValue();
            treeMap0.put(((String)((Map.Entry)object0).getKey()), (arr_b == null ? null : new String(arr_b, com.google.gms.mdns.MdnsServiceInfo.b)));
        }
        Map map0 = DesugarCollections.unmodifiableMap(treeMap0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            if(map$Entry0.getValue() != null) {
                arrayList0.add(new MdnsServiceInfo.TextEntry(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue())));
            }
        }
        ArrayList arrayList1 = new ArrayList(mdnsServiceInfo0.e);
        List list0 = DesugarCollections.unmodifiableList(mdnsServiceInfo0.h);
        List list1 = DesugarCollections.unmodifiableList(mdnsServiceInfo0.i);
        return new MdnsServiceInfo(mdnsServiceInfo0.c, mdnsServiceInfo0.d, arrayList1, mdnsServiceInfo0.f, mdnsServiceInfo0.g, null, null, null, arrayList0, mdnsServiceInfo0.k, list0, list1, mdnsServiceInfo0.m);
    }

    public final void b(com.google.gms.mdns.MdnsServiceInfo mdnsServiceInfo0) {
        MdnsServiceInfo mdnsServiceInfo1 = cqrr.a(mdnsServiceInfo0);
        this.a.j(mdnsServiceInfo1);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof cqrr) && this.a.equals(((cqrr)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

