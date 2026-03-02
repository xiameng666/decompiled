import j..util.Objects;
import java.util.NoSuchElementException;

final class fvcg implements fvcj {
    final fvch a;
    private int b;
    private int c;

    public fvcg(fvch fvch0) {
        Objects.requireNonNull(fvch0);
        this.a = fvch0;
        super();
        this.b = fvch0.b();
        this.c = fvch0.d() - 1;
        this.c();
    }

    @Override  // fvcj
    public final int a() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.a.a.e(this.c, this.b);
        this.c();
        return v;
    }

    @Override  // fvcj
    public final Integer b() {
        return fvci.a(this);
    }

    private final void c() {
        int v = this.c + 1;
        this.c = v;
        fvch fvch0 = this.a;
        if(v > fvch0.c()) {
            ++this.b;
            this.c = fvch0.d();
        }
    }

    @Override
    public final boolean hasNext() {
        return this.b <= this.a.a();
    }

    @Override
    public final Object next() {
        return this.b();
    }
}

