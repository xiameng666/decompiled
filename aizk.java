import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class aizk implements gfsi {
    public final List a;
    public final AtomicBoolean b;

    public aizk(List list0, AtomicBoolean atomicBoolean0) {
        this.a = list0;
        this.b = atomicBoolean0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        AtomicBoolean atomicBoolean0;
        List list0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajbz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajbz)object0))));
        Iterator iterator0 = hprv.e().b.iterator();
        while(true) {
            list0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            ((ggtj)aizo.a.h()).B("Allow listed package: %s", ((String)object1));
            list0.remove(((String)object1));
        }
        ((ggtj)aizo.a.h()).B("Removing Blockstore data for packages %s", list0);
        Iterator iterator1 = aizr.g(((ajbz)object0), list0).iterator();
        while(true) {
            atomicBoolean0 = this.b;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object2 = iterator1.next();
            atomicBoolean0.set(true);
            hftp0.bQ(((String)object2));
            hftp0.bS(((String)object2));
        }
        for(Object object3: aizr.f(((ajbz)object0), list0)) {
            hftp0.bR(((String)object3));
            atomicBoolean0.set(true);
        }
        return (ajbz)hftp0.N_build();
    }
}

