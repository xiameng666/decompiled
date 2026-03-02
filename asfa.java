import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public final class asfa implements icih {
    final icih a;
    final asff b;

    public asfa(icih icih0, asff asff0) {
        this.a = icih0;
        this.b = asff0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        Set set0;
        asez asez0;
        if((ibrl0 instanceof asez)) {
            asez0 = (asez)ibrl0;
            int v = asez0.b;
            if((v & 0x80000000) == 0) {
                asez0 = new asez(this, ibrl0);
            }
            else {
                asez0.b = v - 0x80000000;
            }
        }
        else {
            asez0 = new asez(this, ibrl0);
        }
        Object object1 = asez0.a;
        Object object2 = ibrx.a;
        switch(asez0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                asff asff0 = this.b;
                if(((aswl)object0) == null) {
                    set0 = Collections.EMPTY_SET;
                    ibuq.e(set0, "emptySet(...)");
                }
                else {
                    Set set1 = ibqg.b(new asfi(((aswl)object0), asff0.b, asff0.c));
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object3: set1) {
                        if(((asey)object3).b()) {
                            arrayList0.add(object3);
                        }
                    }
                    set0 = ibpo.ay(arrayList0);
                }
                asez0.b = 1;
                return icih0.a(set0, asez0) == object2 ? object2 : ibom.a;
            }
            case 1: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

