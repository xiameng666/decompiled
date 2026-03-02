import java.util.HashMap;

public final class zji implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        HashMap hashMap0 = new HashMap();
        int v = ((gged_interceptors)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            zjo zjo0 = (zjo)((gged_interceptors)object0).get(v1);
            grxw grxw0 = zjo0.a;
            if(hashMap0.containsKey(grxw0)) {
                hashMap0.remove(grxw0);
            }
            else {
                hashMap0.put(grxw0, zjo0);
            }
        }
        return ggeo.k(hashMap0);
    }
}

