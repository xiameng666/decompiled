import java.util.LinkedHashMap;

public final class hmdi {
    private final LinkedHashMap a;
    private final LinkedHashMap b;
    private final hmbb c;

    public hmdi() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = hmhe.a();
    }

    public final hmdk a(Class class0) {
        LinkedHashMap linkedHashMap0 = this.a;
        hmgz hmgz0 = hmel.b(class0);
        if(linkedHashMap0.containsKey(hmgz0)) {
            return new hmdk(hmgz0, ((hmeb)linkedHashMap0.get(hmgz0)).b);
        }
        this.c.d("## Model %s with tag %s not found", new Object[]{class0.getSimpleName(), hmgz0});
        throw new hmdp();
    }

    public final hmdu b() {
        return (hmdu)this.d(hmdu.class);
    }

    public final hmdy c() {
        return (hmdy)this.d(hmdy.class);
    }

    public final hmeb d(Class class0) {
        LinkedHashMap linkedHashMap0 = this.a;
        hmgz hmgz0 = hmel.b(class0);
        if(linkedHashMap0.containsKey(hmgz0)) {
            return (hmeb)linkedHashMap0.get(hmgz0);
        }
        this.c.d("## Model %s with tag %s not found", new Object[]{class0.getSimpleName(), hmgz0});
        throw new hmdp();
    }

    public final hmeb e(Class class0) {
        LinkedHashMap linkedHashMap0 = this.a;
        hmgz hmgz0 = hmel.b(class0);
        if(linkedHashMap0.containsKey(hmgz0)) {
            return (hmeb)linkedHashMap0.get(hmgz0);
        }
        this.c.d("## Model %s with tag %s not found. Returning default model.", new Object[]{class0.getSimpleName(), hmgz0});
        return hmel.a(hmgz0).a();
    }

    public final hmej f() {
        return (hmej)this.d(hmej.class);
    }

    public final hmen g() {
        return (hmen)this.d(hmen.class);
    }

    public final hmep h() {
        return (hmep)this.d(hmep.class);
    }

    public final hmer i() {
        return (hmer)this.d(hmer.class);
    }

    public final hmex j() {
        return (hmex)this.d(hmex.class);
    }

    public final hmfd k() {
        return (hmfd)this.d(hmfd.class);
    }

    public final hmff l() {
        return (hmff)this.d(hmff.class);
    }

    public final void m(hmdk hmdk0) {
        LinkedHashMap linkedHashMap0 = this.a;
        if(!linkedHashMap0.containsKey(hmdk0.a)) {
            hmek hmek0 = hmel.a(hmdk0.a);
            if(hmek0 == null) {
                this.b.put(hmdk0.a, hmdk0.c);
                hmdk0.a.i();
                hmdk0.b.i();
                hmdk0.c.i();
                this.c.e();
            }
            else {
                linkedHashMap0.put(hmdk0.a, hmek0.a());
            }
        }
        if(linkedHashMap0.containsKey(hmdk0.a)) {
            hmeb hmeb0 = (hmeb)linkedHashMap0.get(hmdk0.a);
            hmeb0.getClass();
            hmdk0.a.i();
            hmdk0.b.i();
            hmdk0.c.i();
            this.c.e();
            hmeb0.b(hmdk0.c);
        }
    }

    public final void n(hmeb hmeb0) {
        hmgz hmgz0 = hmeb0.a();
        this.a.put(hmgz0, hmeb0);
        hmeb0.getClass();
        this.c.e();
    }

    public static final hmeb o(Class class0) {
        return ((hmek)hmel.a.get(class0)).a();
    }
}

