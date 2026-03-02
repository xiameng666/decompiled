import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class bgog {
    public static final bgod a(List list0, List list1) {
        ibuq.f(list0, "examine");
        ibuq.f(list1, "existing");
        ArrayList arrayList0 = new ArrayList();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: list0) {
            heqb heqb0 = (heqb)object0;
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: list1) {
                heqb heqb1 = (heqb)object1;
                String s = heqb0.e;
                ibuq.e(s, "getOrigin(...)");
                String s1 = bgog.d(s);
                String s2 = heqb1.e;
                ibuq.e(s2, "getOrigin(...)");
                if(ibuq.m(s1, bgog.d(s2)) && ibuq.m(heqb0.g, heqb1.g)) {
                    hepz hepz0 = bgog.b(heqb0);
                    String s3 = null;
                    String s4 = hepz0 == null ? null : hepz0.d;
                    hepz hepz1 = bgog.b(heqb1);
                    if(hepz1 != null) {
                        s3 = hepz1.d;
                    }
                    if(!ibuq.m(s4, s3) || !ibuq.m(heqb0.i, heqb1.i) || ibuq.m(heqb0.i, heqb1.i) && bgog.c(heqb0) != bgog.c(heqb1)) {
                        arrayList1.add(object1);
                    }
                }
            }
            if(arrayList1.isEmpty()) {
                arrayList0.add(heqb0);
            }
            else {
                linkedHashMap0.put(heqb0, arrayList1);
            }
        }
        return new bgod(arrayList0, linkedHashMap0);
    }

    private static final hepz b(heqb heqb0) {
        hfuo hfuo0 = (heqb0.u == null ? heqa.a : heqb0.u).b;
        ibuq.e(hfuo0, "getNoteList(...)");
        for(Object object0: hfuo0) {
            String s = ((hepz)object0).c;
            ibuq.e(s, "getUniqueDisplayName(...)");
            if(s.length() == 0) {
                return (hepz)object0;
            }
        }
        return null;
    }

    private static final boolean c(heqb heqb0) {
        return ((heqb0.s == null ? hept.a : heqb0.s).b & 8) != 0;
    }

    private static final String d(String s) {
        ibuq.f(s, "uri");
        return ibzk.J(s, "/") ? s : s + "/";
    }
}

