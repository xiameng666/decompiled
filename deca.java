import java.util.List;
import java.util.Map.Entry;

public final class deca implements ibts {
    public final decl a;
    public final ibts b;

    public deca(decl decl0, ibts ibts0) {
        this.a = decl0;
        this.b = ibts0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dnr)object0), "$this$LazyScaffold");
        decl decl0 = this.a;
        debi debi0 = decl0.b;
        if((debi0 instanceof debf)) {
            dol.a(((dnr)object0), new gze(0x5951C06D, true, new decc(decl0, this.b)));
            List list0 = ((debf)debi0).a;
            if(!list0.isEmpty()) {
                dol.a(((dnr)object0), deaw.a);
                deck.a(((dnr)object0), list0);
            }
            for(Object object1: ((debf)debi0).b.entrySet()) {
                String s = (String)((Map.Entry)object1).getKey();
                List list1 = (List)((Map.Entry)object1).getValue();
                dol.a(((dnr)object0), new gze(0x9646C99E, true, new decd(s)));
                deck.a(((dnr)object0), list1);
            }
            return ibom.a;
        }
        if(ibuq.m(debi0, debg.a)) {
            dol.a(((dnr)object0), deaw.b);
            return ibom.a;
        }
        if(!ibuq.m(debi0, debh.a)) {
            throw new ibnq();
        }
        dol.a(((dnr)object0), deaw.c);
        return ibom.a;
    }
}

