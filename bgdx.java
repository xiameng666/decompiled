import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class bgdx extends ibsl implements ibtx {
    Object a;
    Object b;

    public bgdx(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        bgdx bgdx0 = new bgdx(((ibrl)object2));
        bgdx0.a = (List)object0;
        bgdx0.b = (bgax)object1;
        return bgdx0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.a;
        Object object2 = this.b;
        if(object2 != null && !(object2 instanceof bgau)) {
            if(!(object2 instanceof bgaw)) {
                throw new ibnq();
            }
            if(object1 == null) {
                return null;
            }
            ibuq.f(((bgaw)object2).a, "filterValue");
            switch(((bgaw)object2).a.ordinal()) {
                case 0: {
                    break;
                }
                case 1: {
                    Object object3 = new ArrayList();
                    for(Object object4: ((Iterable)object1)) {
                        if(((bgfa)object4).f.a) {
                            ((Collection)object3).add(object4);
                        }
                    }
                    return object3;
                }
                case 2: {
                    Object object5 = new ArrayList();
                    for(Object object6: ((Iterable)object1)) {
                        if(((bgfa)object6).f.b) {
                            ((Collection)object5).add(object6);
                        }
                    }
                    return object5;
                }
                case 3: {
                    Object object7 = new ArrayList();
                    for(Object object8: ((Iterable)object1)) {
                        if(((bgfa)object8).f.c) {
                            ((Collection)object7).add(object8);
                        }
                    }
                    return object7;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        return object1;
    }
}

