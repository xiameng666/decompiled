import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class beex {
    public final List a;
    private final beih b;
    private final begp c;
    private final beec d;

    public beex(beih beih0, begp begp0, beec beec0) {
        List list0 = null;
        ibuq.f(beih0, "passwordDataRepository");
        ibuq.f(begp0, "passkeyDataRepository");
        super();
        this.b = beih0;
        this.c = begp0;
        this.d = beec0;
        bedi bedi0 = (bedi)begp0.h.b();
        bedi bedi1 = (bedi)beih0.o.b();
        if(bedi0 == null) {
            list0 = (List)((bedv)beih0.n.b()).b;
        }
        else if(bedi1 != null) {
            gged_interceptors gged0 = gqnb.a(ibpo.ak(bedi1.a, bedi0.a), ibpo.ak(bedi1.b, bedi0.b));
            ibuq.c(gged0);
            List list1 = ibpo.ao(gged0, new beeb(new beea(beec0)));
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list1) {
                ibuq.e(((gqlt)object0).c, "getCredentialGroups(...)");
                ibpo.D(arrayList0, ((gqlt)object0).c);
            }
            if(!arrayList0.isEmpty()) {
                for(Object object1: arrayList0) {
                    if(!((gqmd)object1).c().isEmpty()) {
                        continue;
                    }
                    goto label_64;
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object2: arrayList0) {
                if(((bedg)((gqmd)object2).c().get(0)).d.equals(gqmg.c)) {
                    arrayList1.add(object2);
                }
            }
            if(!arrayList1.isEmpty()) {
                for(Object object3: arrayList1) {
                    if(((ggna)((gqmd)object3).c()).c == 1) {
                        continue;
                    }
                    goto label_64;
                }
            }
            ArrayList arrayList2 = new ArrayList(ibpo.q(arrayList0, 10));
            for(Object object4: arrayList0) {
                arrayList2.add(((gqmd)object4).c());
            }
            if(!arrayList2.isEmpty()) {
                for(Object object5: arrayList2) {
                    gged_interceptors gged1 = (gged_interceptors)object5;
                    gqmg gqmg0 = ((bedg)gged1.get(0)).d;
                    ibuq.c(gged1);
                    if((gged1 instanceof Collection) && gged1.isEmpty()) {
                        continue;
                    }
                    Iterator iterator6 = gged1.iterator();
                label_57:
                    if(!iterator6.hasNext()) {
                        continue;
                    }
                    Object object6 = iterator6.next();
                    if(((bedg)object6).d.equals(gqmg0)) {
                        goto label_57;
                    }
                    goto label_64;
                }
            }
            list0 = list1;
        }
    label_64:
        this.a = list0;
    }
}

