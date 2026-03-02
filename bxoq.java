import java.lang.ref.Reference;

public abstract class bxoq {
    private volatile Reference a;
    private final gful_cronetEngineProvider b;
    private final Object c;

    public bxoq(gful_cronetEngineProvider gful0) {
        this.a = this.a(null);
        this.b = gful0;
        this.c = new Object();
    }

    protected abstract Reference a(Object arg1);

    public final Object b() {
        Object object2;
        Object object0 = this.a.get();
        if(object0 != null) {
            return object0;
        }
        synchronized(this.c) {
            object2 = this.a.get();
            if(object2 == null) {
                object2 = this.b.mr();
                this.a = this.a(object2);
            }
        }
        return object2;
    }
}

