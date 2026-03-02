import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class gqnj {
    public final ArrayList a;
    private final gfsi b;

    public gqnj(gfsi gfsi0) {
        this.a = new ArrayList();
        this.b = gfsi0;
    }

    public final ggfp a() {
        ArrayList arrayList0 = this.a;
        ggbg ggbg0 = ggbg.a(TimeRange.h(Integer.valueOf(0), Integer.valueOf(arrayList0.size())), ggbu.a);
        ghlt ghlt0 = new ghlt();
        ggqj ggqj0 = ggbg0.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            Integer integer0 = (Integer)object0;
            ghlt0.b(integer0, integer0);
        }
        HashMap hashMap0 = new HashMap();
        ggqj ggqj1 = ggbg0.om();
        while(ggqj1.hasNext()) {
            Object object1 = ggqj1.next();
            Integer integer1 = (Integer)object1;
            for(Object object2: ((hhyh)arrayList0.get(integer1.intValue())).c) {
                gfsx gfsx0 = (gfsx)this.b.apply(((hhyf)object2));
                if(gfsx0.i()) {
                    String s = (String)gfsx0.d();
                    if(!hashMap0.containsKey(s)) {
                        hashMap0.put(s, integer1);
                    }
                    ghlt0.b(((Integer)hashMap0.get(s)), integer1);
                }
            }
        }
        gqnk gqnk0 = gqnk.a;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object3: ghlt0.a.values()) {
            ghls ghls0 = ghlt0.a(((ghls)object3));
            ggfn ggfn0 = (ggfn)linkedHashMap0.get(ghls0);
            if(ggfn0 == null) {
                ggfn0 = new ggfn();
                linkedHashMap0.put(ghls0, ggfn0);
            }
            ggfn0.i(((ghls)object3).b);
        }
        ggdy ggdy0 = new ggdy();
        for(Object object4: linkedHashMap0.values()) {
            ggdy0.i(((ggfn)object4).h());
        }
        ggch ggch0 = ggch.j(ggdy0.h()).l(new gqnh(this));
        Objects.requireNonNull(gqnk0);
        return ggch0.l(new gqni()).p();
    }

    public final void b(Iterable iterable0) {
        gged_interceptors gged0 = gged_interceptors.h(iterable0);
        this.a.addAll(gged0);
    }
}

