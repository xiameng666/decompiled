import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class ebwf {
    public static final bboh a;
    public final dyfv b;
    public final donp c;
    public ibrt d;
    public ebst e;
    public final String f;
    public fsge g;

    static {
        ebwf.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebwf(dyfv dyfv0, donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.b = dyfv0;
        this.c = donp0;
        String s1 = dyfv0.d;
        ibuq.e(s1, "getAccountName(...)");
        this.f = s1;
    }

    public final Object a(List list0, ibrl ibrl0) {
        Object object5;
        Object object4;
        String s;
        Object object3;
        Object object2;
        ebwe ebwe0;
        if((ibrl0 instanceof ebwe)) {
            ebwe0 = (ebwe)ibrl0;
            int v = ebwe0.f;
            if((v & 0x80000000) == 0) {
                ebwe0 = new ebwe(this, ibrl0);
            }
            else {
                ebwe0.f = v - 0x80000000;
            }
        }
        else {
            ebwe0 = new ebwe(this, ibrl0);
        }
        Object object0 = ebwe0.d;
        Object object1 = ibrx.a;
        switch(ebwe0.f) {
            case 0: {
                ibnx.b(object0);
                ibxr ibxr0 = ibpo.aA(list0);
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                object2 = ibxr0.a();
                object3 = linkedHashMap0;
                goto label_28;
            }
            case 1: {
                s = ebwe0.g;
                object3 = ebwe0.c;
                object2 = ebwe0.b;
                object4 = ebwe0.a;
                ibnx.b(object0);
                object5 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ibns ibns0 = new ibns(s, new ibnw(object5));
            ((Map)object3).put(ibns0.a, ibns0.b);
            object3 = object4;
        label_28:
            if(!((Iterator)object2).hasNext()) {
                break;
            }
            Object object6 = ((Iterator)object2).next();
            s = (String)object6;
            fsge fsge0 = this.g;
            if(fsge0 == null) {
                ibuq.j("octopusClient");
                fsge0 = null;
            }
            evql evql0 = fsge0.e(this.f, s);
            ebwe0.a = object3;
            ebwe0.b = object2;
            ebwe0.c = object3;
            ebwe0.g = s;
            ebwe0.f = 1;
            object5 = fsdk.a(evql0, ebwe0);
            if(object5 != object1) {
                object4 = object3;
                continue;
            }
            return object1;
        }
        Set set0 = ((Map)object3).entrySet();
        Object object7 = new LinkedHashMap();
        for(Object object8: set0) {
            Boolean boolean0 = Boolean.valueOf(ibnw.b(((ibnw)((Map.Entry)object8).getValue()).a));
            Object object9 = ((Map)object7).get(boolean0);
            if(object9 == null) {
                object9 = new ArrayList();
                ((Map)object7).put(boolean0, object9);
            }
            ((List)object9).add(((String)((Map.Entry)object8).getKey()));
        }
        return object7;
    }
}

