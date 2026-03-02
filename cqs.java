import java.util.ArrayList;
import java.util.List;

final class cqs extends ibsk implements ibtw {
    int a;
    final cqu b;
    private Object c;

    public cqs(cqu cqu0, ibrl ibrl0) {
        this.b = cqu0;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cqs)this.c(((hxg)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cqs(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        hxg hxg0;
        Object object3;
        Object object1 = ibrx.a;
    alab1:
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                hxg0 = (hxg)this.c;
                this.c = hxg0;
                this.a = 1;
                object0 = den.c(hxg0, null, this, 2);
                if(object0 != object1) {
                    this.b.e = ((hwe)object0).a;
                    this.b.a = ((hwe)object0).c;
                    goto label_18;
                }
                break;
            }
            case 1: {
                hxg0 = (hxg)this.c;
                ibnx.b(object0);
                this.b.e = ((hwe)object0).a;
                this.b.a = ((hwe)object0).c;
                while(true) {
                label_18:
                    this.c = hxg0;
                    this.a = 2;
                    object0 = hvf.a(hxg0, this);
                    if(object0 == object1) {
                        break alab1;
                    }
                label_22:
                    List list0 = ((hvt)object0).a;
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    int v = list0.size();
                    int v1 = 0;
                    for(int v2 = 0; v2 < v; ++v2) {
                        Object object2 = list0.get(v2);
                        if(((hwe)object2).d) {
                            arrayList0.add(object2);
                        }
                    }
                    cqu cqu0 = this.b;
                    int v3 = arrayList0.size();
                    while(true) {
                        object3 = null;
                        if(v1 < v3) {
                            Object object4 = arrayList0.get(v1);
                            if(hwd.b(((hwe)object4).a, cqu0.e)) {
                                object3 = object4;
                            }
                            else {
                                ++v1;
                                continue;
                            }
                        }
                        break;
                    }
                    hwe hwe0 = (hwe)object3;
                    if(hwe0 == null) {
                        hwe0 = (hwe)ibpo.T(arrayList0);
                    }
                    if(hwe0 != null) {
                        cqu0.e = hwe0.a;
                        cqu0.a = hwe0.c;
                    }
                    if(!arrayList0.isEmpty()) {
                        continue;
                    }
                    cqu0.e = -1L;
                    return ibom.a;
                }
            }
            default: {
                hxg0 = (hxg)this.c;
                ibnx.b(object0);
                goto label_22;
            }
        }
        return object1;
    }
}

