import java.util.HashMap;

public final class eivo implements gfsi {
    public final ggfp a;

    public eivo(ggfp ggfp0) {
        this.a = ggfp0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        HashMap hashMap0 = new HashMap(((ggeo)object0));
        ggqj ggqj0 = this.a.om();
        while(ggqj0.hasNext()) {
            Object object1 = ggqj0.next();
            hashMap0.remove(((eivu)object1).a);
        }
        return ggeo.k(hashMap0);
    }
}

