import java.util.ArrayList;

public final class bvld implements ibth {
    @Override  // ibth
    public final Object a() {
        hfuf hfuf0 = htva.a.b().f().b;
        ibuq.e(hfuf0, "getElementList(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: hfuf0) {
            ibuq.c(((Integer)object0));
            ccow ccow0 = ccow.b(((Integer)object0).intValue());
            if(ccow0 != null) {
                arrayList0.add(ccow0);
            }
        }
        return ibpo.ay(arrayList0);
    }
}

