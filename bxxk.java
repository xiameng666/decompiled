import java.util.Iterator;
import java.util.List;

public final class bxxk implements ibts {
    public final String a;
    public final List b;
    public final ibuz c;

    public bxxk(String s, List list0, ibuz ibuz0) {
        this.a = s;
        this.b = list0;
        this.c = ibuz0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((byfr)object0) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((byfr)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((byfr)object0))));
        byft byft0 = byfs.a(hftp0);
        Iterator iterator0 = byft0.b().c().iterator();
        while(true) {
            List list0 = this.b;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            String s = (String)object1;
            byfo byfo0 = (byfo)byft0.b().get(s);
            if(byfo0 != null && ibuq.m(byfo0.c, this.a)) {
                list0.add(s);
            }
        }
        if(!list0.isEmpty()) {
            for(Object object2: list0) {
                byft0.b();
                byft0.d(((String)object2));
            }
            this.c.a = true;
        }
        return byft0.a();
    }
}

