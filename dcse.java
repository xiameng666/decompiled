import java.util.ArrayList;
import java.util.Map;

public final class dcse extends ibsl implements ibtx {
    int a;
    Object b;
    final dcsh c;
    final long d;
    final Map e;
    private Object f;

    public dcse(ibrl ibrl0, dcsh dcsh0, long v, Map map0) {
        this.c = dcsh0;
        this.d = v;
        this.e = map0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dcse dcse0 = new dcse(((ibrl)object2), this.c, this.d, this.e);
        dcse0.f = (icih)object0;
        dcse0.b = (Object[])object1;
        return dcse0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        dcru dcru0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.f;
            dctx[] arr_dctx = (dctx[])this.b;
            long v1 = this.d;
            Map map0 = this.e;
            long v3 = 0L;
            boolean z = false;
            boolean z1 = true;
            for(int v4 = 0; v4 < arr_dctx.length; ++v4) {
                dctx dctx0 = arr_dctx[v4];
                z1 = z1 && dctx0.c();
                z = z || (dctx0 instanceof dctu);
                v3 += dctx0.a();
            }
            if(!z1) {
                dcru0 = new dcru(ibwt.f(((float)v3) * 100.0f / ((float)v1), 0.0f, 100.0f));
            }
            else if(z) {
                ArrayList arrayList0 = new ArrayList();
                for(int v2 = 0; v2 < arr_dctx.length; ++v2) {
                    dctx dctx1 = arr_dctx[v2];
                    if((dctx1 instanceof dctu)) {
                        arrayList0.add(dctx1);
                    }
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object3: arrayList0) {
                    dcsk dcsk0 = (dcsk)map0.get(((dctu)object3).a);
                    if(dcsk0 != null) {
                        arrayList1.add(dcsk0);
                    }
                }
                dcru0 = new dcrt(arrayList1);
            }
            else {
                dcru0 = dcrs.a;
            }
            this.a = 1;
            if(((icih)object2).a(dcru0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

