import java.util.Iterator;

abstract class akm extends akn implements Iterator {
    akk a;
    akk b;

    public akm(akk akk0, akk akk1) {
        this.a = akk1;
        this.b = akk0;
    }

    public abstract akk a(akk arg1);

    public abstract akk b(akk arg1);

    private final akk c() {
        return this.b == this.a || this.a == null ? null : this.b(this.b);
    }

    @Override  // akn
    public final void dF(akk akk0) {
        if(this.a == akk0 && akk0 == this.b) {
            this.b = null;
            this.a = null;
        }
        akk akk1 = this.a;
        if(akk1 == akk0) {
            this.a = this.a(akk1);
        }
        if(this.b == akk0) {
            this.b = this.c();
        }
    }

    @Override
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override
    public final Object next() {
        Object object0 = this.b;
        this.b = this.c();
        return object0;
    }
}

