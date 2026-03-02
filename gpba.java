import j..util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

final class gpba implements gozx {
    public final Set a;
    public final gozx b;
    private final Set c;
    private final Set d;

    public gpba(gozv gozv0, gozx gozx0) {
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for(Object object0: gozv0.b) {
            gpal gpal0 = (gpal)object0;
            if(gpal0.a()) {
                if(gpal0.b()) {
                    hashSet3.add(gpal0.a);
                }
                else {
                    hashSet0.add(gpal0.a);
                }
            }
            else if(gpal0.b()) {
                hashSet4.add(gpal0.a);
            }
            else {
                hashSet1.add(gpal0.a);
            }
        }
        if(!gozv0.e.isEmpty()) {
            hashSet0.add(new gpay(gpax.class, gpdw.class));
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet0);
        this.d = DesugarCollections.unmodifiableSet(hashSet1);
        DesugarCollections.unmodifiableSet(hashSet2);
        this.a = DesugarCollections.unmodifiableSet(hashSet3);
        DesugarCollections.unmodifiableSet(hashSet4);
        this.b = gozx0;
    }

    @Override  // gozx
    public final gpew a(gpay gpay0) {
        throw null;
    }

    @Override  // gozx
    public final gpew b(Class class0) {
        gpay gpay0 = new gpay(gpax.class, class0);
        if(this.d.contains(gpay0)) {
            return this.b.a(gpay0);
        }
        throw new gpan(String.format("Attempting to request an undeclared dependency Provider<%s>.", gpay0));
    }

    @Override  // gozx
    public final gpew c(gpay gpay0) {
        throw null;
    }

    @Override  // gozx
    public final Object d(gpay gpay0) {
        if(this.c.contains(gpay0)) {
            return gozw.a(this.b, gpay0);
        }
        throw new gpan(String.format("Attempting to request an undeclared dependency %s.", gpay0));
    }

    @Override  // gozx
    public final Object e(Class class0) {
        gpay gpay0 = new gpay(gpax.class, class0);
        if(!this.c.contains(gpay0)) {
            throw new gpan(String.format("Attempting to request an undeclared dependency %s.", class0));
        }
        Object object0 = gozw.b(this.b, class0);
        if(!class0.equals(gpdw.class)) {
            return object0;
        }
        gpdw gpdw0 = (gpdw)object0;
        return new gpaz();
    }
}

