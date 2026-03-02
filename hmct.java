import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class hmct extends hmdb {
    public hmgz a;
    public hmcr b;
    public hmcr c;
    public hmcy d;
    public hmcy e;
    public int f;
    public hmgz g;
    public List h;
    public List i;
    private LinkedHashMap j;

    public hmct(hmie hmie0, hmda hmda0, List list0, List list1) {
        super(hmie0.a());
        hmia hmia0 = hmie0.b();
        byte[] arr_b = hmia0.a;
        if(arr_b == null || arr_b.length <= 0) {
            throw new hmfq(hmfl.x);
        }
        this.a = hmgz.e(arr_b);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new hmht(new hmgz("9F1D").a, 8));
        arrayList0.add(new hmht(new hmgz("9F1A").a, 2));
        if(list0 != null && !list0.isEmpty()) {
            Iterator iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(list0.contains(object0)) {
                    iterator0.remove();
                }
            }
            arrayList0.addAll(list0);
        }
        ArrayList arrayList1 = new ArrayList();
        if(list1 != null && !list1.isEmpty()) {
            arrayList1.addAll(list1);
        }
        this.b = new hmcr(hmia0.c, hmia0.b, hmia0.d, hmia0.g, hmia0.e, hmia0.f, arrayList0, true);
        if(hmda0.b) {
            hmib hmib0 = hmia0.b();
            if(hmib0 == null) {
                throw new hmfq(hmfl.M);
            }
            this.c = new hmcr(hmib0.a, hmib0.b, hmib0.c, hmib0.e, hmib0.d, null, arrayList0, false);
        }
        else if(!hmda0.a && !hmda0.f) {
            this.n.a("No alternate AID and Primary AID or Magstripe are invalid", new Object[0]);
            throw new hmfq(hmfl.k);
        }
        this.j = new LinkedHashMap();
        for(Object object1: hmia0.a()) {
            hmcx hmcx0 = new hmcx(this, ((hmic)object1), arrayList1);
            this.j.put(hmcx0.a, hmcx0);
        }
        this.d = new hmcy(this.j, true);
        this.e = new hmcy(this.j, false);
        byte[] arr_b1 = hmia0.h;
        if(arr_b1 == null) {
            throw new hmfq(hmfl.w);
        }
        this.m = hmgz.e(arr_b1);
        if(this.m.b() < 18) {
            throw new hmfq(hmfl.O);
        }
        byte[] arr_b2 = hmia0.j;
        if(arr_b2 == null) {
            throw new hmfq(hmfl.N);
        }
        String s = hmgz.e(arr_b2).i();
        if(s.isEmpty()) {
            s = "00";
        }
        this.f = Integer.parseInt(s, 16);
        byte[] arr_b3 = hmia0.i;
        if(arr_b3 == null) {
            throw new hmfq(hmfl.y);
        }
        this.g = hmgz.e(arr_b3);
        this.o = 1;
        this.p = 1;
    }

    public final hmcx a(byte b, byte b1) {
        Integer integer0 = hmcx.a(b, b1);
        if(this.j.containsKey(integer0)) {
            return (hmcx)this.j.get(integer0);
        }
        throw new hmfm(hmfl.ak);
    }
}

