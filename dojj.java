import java.util.ArrayList;
import java.util.List;

public final class dojj implements lqj {
    public final dojm a;

    public dojj(dojm dojm0) {
        this.a = dojm0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        dojm dojm0 = this.a;
        if(dojm0.ak != null) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < 2; ++v) {
                arrayList0.add(new ArrayList());
            }
            if(((dlum)object0) != null) {
                ArrayList arrayList1 = new ArrayList(((dlum)object0).c);
                while(!arrayList1.isEmpty()) {
                    int v1 = arrayList0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        List list0 = (List)arrayList0.get(v2);
                        if(!arrayList1.isEmpty()) {
                            list0.add(((dlul)arrayList1.get(0)));
                            arrayList1.remove(0);
                        }
                    }
                }
            }
            dojm0.b.jQ(((List)arrayList0.get(0)));
            dojm0.c.jQ(((List)arrayList0.get(1)));
            return;
        }
        dojm0.b.jQ((((dlum)object0) == null ? null : ((dlum)object0).c));
    }
}

