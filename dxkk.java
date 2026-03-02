import java.util.ArrayList;
import java.util.List;

public final class dxkk implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        Object object0 = evql0.j();
        ibuq.e(object0, "getResult(...)");
        ibuq.f(((fsym)object0), "closedLoopCards");
        hfuo hfuo0 = ((fsym)object0).b;
        ibuq.e(hfuo0, "getClosedLoopCardList(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: hfuo0) {
            gtkg gtkg0 = ((fsyk)object1).e;
            if(gtkg0 == null) {
                gtkg0 = gtkg.a;
            }
            gtlj gtlj0 = gtkg0.E == null ? gtlj.a : gtkg0.E;
            if((gtlk.b(gtlj0.b) == null ? gtlk.e : gtlk.b(gtlj0.b)) != gtlk.b) {
                arrayList0.add(object1);
            }
        }
        Object object2 = new ArrayList();
        for(Object object3: arrayList0) {
            fsyk fsyk0 = (fsyk)object3;
            if(dqjj.T((fsyk0.e == null ? gtkg.a : fsyk0.e))) {
                ibuq.c(fsyk0);
                ((List)object2).add(new dogr(fsyk0));
            }
            else if(dqjj.an((fsyk0.e == null ? gtkg.a : fsyk0.e))) {
                ibuq.c(fsyk0);
                ((List)object2).add(new dohh(fsyk0));
            }
            else {
                ibuq.c(fsyk0);
                ((List)object2).add(new dogu(fsyk0));
            }
        }
        return object2;
    }
}

