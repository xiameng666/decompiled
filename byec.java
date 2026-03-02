import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class byec {
    public static final LinkedHashMap a(String s, List list0) {
        bydq bydq0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object0: list0) {
            bzcq bzcq0 = (bzcq)object0;
            bzcm bzcm0 = bzcq0.a;
            if((bzcm0 instanceof bzlg)) {
                bydq0 = new bydq(((bzlg)bzcm0).a);
            }
            else {
                if(!(bzcm0 instanceof bzmp)) {
                    throw new ibnq();
                }
                bydq0 = new byed(((bzmp)bzcm0).a);
            }
            if((bzcq0 instanceof bzna)) {
                String s1 = bzcq0.b;
                String s2 = ((bzna)bzcq0).c;
                String s3 = ((bzna)bzcq0).d;
                byte[] arr_b = ((bzna)bzcq0).e;
                ArrayList arrayList0 = new ArrayList(ibpo.q(((bzna)bzcq0).k, 10));
                for(Object object1: ((bzna)bzcq0).k) {
                    arrayList0.add(new byeh(((bznb)object1).a, ((bznb)object1).b));
                }
                linkedHashMap0.put(bydq0, new byeg(s, s1, s2, s3, arr_b, arrayList0, ((bzna)bzcq0).g, ((bzna)bzcq0).h, ((bzna)bzcq0).i, ((bzna)bzcq0).j, ((bzna)bzcq0).f));
                continue;
            }
            if((bzcq0 instanceof bzmv)) {
                String s4 = ((bzmv)bzcq0).c;
                byte[] arr_b1 = ((bzmv)bzcq0).d;
                String s5 = ((bzmv)bzcq0).e;
                String s6 = ((bzmv)bzcq0).f;
                ArrayList arrayList1 = new ArrayList(ibpo.q(((bzmv)bzcq0).g, 10));
                for(Object object2: ((bzmv)bzcq0).g) {
                    arrayList1.add(new byef(((bzmw)object2).a, ((bzmw)object2).b));
                }
                linkedHashMap0.put(bydq0, new byee(s, s4, arr_b1, arrayList1, s5, s6));
            }
            else if((bzcq0 instanceof bzlk)) {
                linkedHashMap0.put(bydq0, new byds(s, bzcq0.b, ((bzlk)bzcq0).c, ((bzlk)bzcq0).d, ((bzlk)bzcq0).e, ((bzlk)bzcq0).f, ((bzlk)bzcq0).g, ((bzlk)bzcq0).h, ((bzlk)bzcq0).i));
            }
            else if((bzcq0 instanceof bzcx)) {
                linkedHashMap0.put(bydq0, new bydo(s, ((bzcx)bzcq0).c, ((bzcx)bzcq0).d, ((bzcx)bzcq0).e, ((bzcx)bzcq0).f));
            }
            else {
                if(!(bzcq0 instanceof bzdi)) {
                    throw new ibnq();
                }
                linkedHashMap0.put(bydq0, new bydp(s, ((bzdi)bzcq0).c, ((bzdi)bzcq0).d, ((bzdi)bzcq0).e));
            }
            continue;
        }
        return linkedHashMap0;
    }
}

