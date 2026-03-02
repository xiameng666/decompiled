import java.lang.ref.Reference;

public abstract class ajcj {
    private final Object a;
    private volatile Reference b;

    public ajcj() {
        this.b = null;
        this.a = new Object();
    }

    protected abstract Object a();

    public final Object b() {
        Object object0 = null;
        Object object1 = this.b == null ? null : this.b.get();
        if(object1 != null) {
            return object1;
        }
        synchronized(this.a) {
            if(this.b != null) {
                object0 = this.b.get();
            }
            if(object0 == null) {
                object0 = this.a();
                this.b = this.c(object0);
            }
        }
        return object0;
    }

    protected abstract Reference c(Object arg1);
}

