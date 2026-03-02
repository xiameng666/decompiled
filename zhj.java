import java.util.ArrayList;

public final class zhj implements lqj {
    public final zhk a;

    public zhj(zhk zhk0) {
        this.a = zhk0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        zho zho0 = (zho)object0;
        ArrayList arrayList0 = new ArrayList();
        zhk zhk0 = this.a;
        for(Object object1: zhk0.a) {
            zho zho1 = (zho)((lqd)object1).ij();
            if(zho1 == null) {
                return;
            }
            arrayList0.add(zho1.a);
        }
        zhk0.l(arrayList0);
    }
}

