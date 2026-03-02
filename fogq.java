import java.util.ArrayList;

public final class fogq implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        egim egim0 = ((efnw)object0).b();
        ArrayList arrayList0 = new ArrayList();
        bako bako0 = new bako(egim0);
        while(bako0.hasNext()) {
            Object object1 = bako0.next();
            egha egha0 = (egha)object1;
            if(egha0.j()) {
                arrayList0.add(fogs.a.apply(egha0));
            }
        }
        return gged_interceptors.i(arrayList0);
    }
}

