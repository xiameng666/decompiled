import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class eppm {
    public static final eppm a;

    static {
        eppm.a = new eppm();
    }

    public final Object a(Context context0, boolean z, ibrl ibrl0) {
        return this.b(context0, z, new eppg(context0), ibrl0);
    }

    public final Object b(Context context0, boolean z, ibts ibts0, ibrl ibrl0) {
        List list3;
        Iterator iterator4;
        ArrayList arrayList3;
        boolean z1;
        Context context1;
        List list2;
        Iterator iterator0;
        ArrayList arrayList0;
        epph epph0;
        if((ibrl0 instanceof epph)) {
            epph0 = (epph)ibrl0;
            int v = epph0.f;
            if((v & 0x80000000) == 0) {
                epph0 = new epph(this, ibrl0);
            }
            else {
                epph0.f = v - 0x80000000;
            }
        }
        else {
            epph0 = new epph(this, ibrl0);
        }
        Object object0 = epph0.d;
        Object object1 = ibrx.a;
        switch(epph0.f) {
            case 0: {
                ibnx.b(object0);
                epph0.a = context0;
                epph0.b = ibts0;
                epph0.c = z;
                epph0.f = 1;
                object0 = epom.a.c(epph0);
                if(object0 == object1) {
                    return object1;
                }
                arrayList0 = new ArrayList();
                iterator0 = ((Iterable)object0).iterator();
                goto label_29;
            }
            case 1: {
                z = epph0.c;
                ibts0 = (ibts)epph0.b;
                context0 = (Context)epph0.a;
                ibnx.b(object0);
                arrayList0 = new ArrayList();
                iterator0 = ((Iterable)object0).iterator();
            label_29:
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    if((((epng)object2).b & 0x20) != 0) {
                        arrayList0.add(object2);
                    }
                }
                List list0 = ibpo.at(arrayList0);
                if(!list0.isEmpty()) {
                    List list1 = bbmn.h(context0, "com.google.android.gms");
                    ArrayList arrayList1 = new ArrayList(ibpo.q(list1, 10));
                    for(Object object3: list1) {
                        arrayList1.add(((Account)object3).name);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator iterator2 = arrayList1.iterator();
                label_45:
                    while(iterator2.hasNext()) {
                        Object object4 = iterator2.next();
                        String s = (String)object4;
                        if(!list0.isEmpty()) {
                            Iterator iterator3 = list0.iterator();
                            do {
                                if(!iterator3.hasNext()) {
                                    continue label_45;
                                }
                                Object object5 = iterator3.next();
                            }
                            while(!ibuq.m(((epng)object5).h, s));
                            arrayList2.add(object4);
                        }
                    }
                    eppj eppj0 = new eppj(arrayList2, ibts0, null);
                    epph0.a = context0;
                    epph0.b = list0;
                    epph0.c = z;
                    epph0.f = 2;
                    Object object6 = iccl.a(eppj0, epph0);
                    if(object6 == object1) {
                        return object1;
                    }
                    list2 = list0;
                    object0 = object6;
                    context1 = context0;
                    z1 = z;
                    arrayList3 = new ArrayList();
                    iterator4 = list2.iterator();
                    goto label_75;
                }
                return ibps.a;
            }
            case 2: {
                z1 = epph0.c;
                list2 = (List)epph0.b;
                context1 = (Context)epph0.a;
                ibnx.b(object0);
                arrayList3 = new ArrayList();
                iterator4 = list2.iterator();
            label_75:
                while(iterator4.hasNext()) {
                    Object object7 = iterator4.next();
                    epng epng0 = (epng)object7;
                    if(((List)object0).contains(epng0.c)) {
                        ((List)object0).remove(epng0.c);
                        arrayList3.add(epng0);
                    }
                }
                list2.removeAll(arrayList3);
                if(!list2.isEmpty()) {
                    eppl eppl0 = new eppl(((List)object0), new ezmb(context1), z1, null);
                    epph0.a = list2;
                    epph0.b = (List)object0;
                    epph0.f = 3;
                    Object object8 = iccl.a(eppl0, epph0);
                    if(object8 != object1) {
                        list3 = (List)object0;
                        object0 = object8;
                        break;
                    }
                    return object1;
                }
                return ibps.a;
            }
            case 3: {
                list3 = (List)epph0.b;
                list2 = (List)epph0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Set set0 = ibpo.az(((Iterable)object0), list3);
        Object object9 = new ArrayList();
        for(Object object10: list2) {
            if(!set0.contains(((epng)object10).c)) {
                ((Collection)object9).add(object10);
            }
        }
        return object9;
    }
}

