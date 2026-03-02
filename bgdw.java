import java.util.Collection;
import java.util.List;

final class bgdw extends ibsl implements ibtx {
    Object a;
    Object b;

    public bgdw(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        bgdw bgdw0 = new bgdw(((ibrl)object2));
        bgdw0.a = (List)object0;
        bgdw0.b = (bgez)object1;
        return bgdw0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.a;
        Object object2 = this.b;
        if(object1 != null) {
            boolean z = false;
            boolean z1 = true;
            int v = 0;
            if(!((Collection)object1).isEmpty()) {
                for(Object object3: ((Iterable)object1)) {
                    if(((bgfa)object3).f.a) {
                        z = true;
                        break;
                    }
                }
            }
            boolean z2 = false;
            if(!((Collection)object1).isEmpty()) {
                for(Object object4: ((Iterable)object1)) {
                    if(((bgfa)object4).f.b) {
                        z2 = true;
                        break;
                    }
                }
            }
            if(!((Collection)object1).isEmpty()) {
                for(Object object5: ((Iterable)object1)) {
                    if(!((bgfa)object5).f.c) {
                        continue;
                    }
                    goto label_27;
                }
            }
            z1 = false;
        label_27:
            List list0 = ibpo.g(new Boolean[]{Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z1)});
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                for(Object object6: list0) {
                    if(((Boolean)object6).booleanValue()) {
                        ++v;
                        if(v < 0) {
                            ibpo.l();
                        }
                    }
                }
                if(v >= 2) {
                    if(object2 == bgez.b && !z) {
                        return new bgaw(bgez.a, z, z2, z1);
                    }
                    if(object2 == bgez.c && !z2) {
                        return new bgaw(bgez.a, z, z2, z1);
                    }
                    return object2 == bgez.d && !z1 ? new bgaw(bgez.a, z, z2, z1) : new bgaw(((bgez)object2), z, z2, z1);
                }
            }
            return bgau.a;
        }
        return null;
    }
}

