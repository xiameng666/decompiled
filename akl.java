import java.util.Iterator;
import java.util.Map.Entry;

public final class akl extends akn implements Iterator {
    final ako a;
    private akk b;
    private boolean c;

    public akl(ako ako0) {
        this.a = ako0;
        super();
        this.c = true;
    }

    public final Map.Entry a() {
        akk akk0;
        if(this.c) {
            this.c = false;
            akk0 = this.a.b;
        }
        else {
            akk0 = this.b == null ? null : this.b.c;
        }
        this.b = akk0;
        return this.b;
    }

    @Override  // akn
    public final void dF(akk akk0) {
        akk akk1 = this.b;
        if(akk0 == akk1) {
            this.b = akk1.d;
            this.c = akk1.d == null;
        }
    }

    @Override
    public final boolean hasNext() {
        return this.c ? this.a.b != null : this.b != null && this.b.c != null;
    }

    @Override
    public final Object next() {
        return this.a();
    }
}

