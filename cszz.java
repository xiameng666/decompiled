import com.google.android.gms.multidevice.Setting;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public final class cszz {
    public List a;
    public cumc b;

    public cszz() {
        List list0 = ibpo.g(new ctab[]{ctae.b, ctaq.b, ctao.b, ctaz.b});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            ctac ctac0 = ((ctab)object0).a();
            if(ctac0 != null) {
                arrayList0.add(ctac0);
            }
        }
        this.a = arrayList0;
        List list1 = cszy.a(this);
        ArrayList arrayList1 = new ArrayList(ibpo.q(list1, 10));
        for(Object object1: list1) {
            List list2 = ((ctac)object1).g();
            ArrayList arrayList2 = new ArrayList(ibpo.q(list2, 10));
            for(Object object2: list2) {
                arrayList2.add(Integer.valueOf(((Setting)object2).a));
            }
            arrayList1.add(arrayList2);
        }
        Set set0 = ibpo.ay(ibpo.r(arrayList1));
        List list3 = this.a;
        ArrayList arrayList3 = new ArrayList(ibpo.q(list3, 10));
        for(Object object3: list3) {
            List list4 = ((ctac)object3).g();
            ArrayList arrayList4 = new ArrayList(ibpo.q(list4, 10));
            for(Object object4: list4) {
                arrayList4.add(Integer.valueOf(((Setting)object4).a));
            }
            arrayList3.add(arrayList4);
        }
        List list5 = ibpo.r(arrayList3);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list5, 10)), 16));
        for(Object object5: list5) {
            linkedHashMap0.put(object5, Boolean.valueOf(set0.contains(Integer.valueOf(((Number)object5).intValue()))));
        }
        this.b = cumd.a(linkedHashMap0, Boolean.valueOf(false));
    }
}

