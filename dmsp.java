import java.util.Iterator;

public final class dmsp implements evqf {
    public final dmsv a;
    public final ibth b;

    public dmsp(dmsv dmsv0, ibth ibth0) {
        this.a = dmsv0;
        this.b = ibth0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.b.a();
        Iterator iterator0 = ((hkgr)object0).b.iterator();
        while(iterator0.hasNext()) {
            dmsv dmsv0 = this.a;
            Object object1 = iterator0.next();
            hkhx hkhx0 = ((hkgq)object1).d;
            if(hkhx0 == null) {
                hkhx0 = hkhx.a;
            }
            dmsv0.b.put(hkhx0, ((hkgq)object1));
        }
    }
}

