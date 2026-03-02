import j..util.Objects;
import java.util.NoSuchElementException;

public final class fvcf implements fvcj {
    final fvch a;
    private int b;
    private int c;
    private final int d;

    public fvcf(fvch fvch0) {
        Objects.requireNonNull(fvch0);
        this.a = fvch0;
        super();
        this.b = fvch0.b();
        this.c = fvch0.d() - 1;
        this.d = fvch0.c();
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
    alab1:
        while(true) {
            this.c = v;
            fvch fvch0 = this.a;
            if(this.b > fvch0.a()) {
                break;
            }
            while(true) {
                int v1 = this.c;
                if(v1 > this.d) {
                    ++this.b;
                    v = fvch0.d();
                    break;
                }
                int v2 = fvch0.c;
                int v3 = this.b;
                int v4 = v3 - fvch0.b;
                fvcl fvcl0 = fvch0.a;
                if(fvcl0.k(v1, v3)) {
                    int v5 = v1 - v2;
                    if(((double)(v5 * v5 + v4 * v4)) <= fvch0.d * fvch0.d) {
                        hirl hirl0 = fvcl0.j(fvcl0.e(v1, v3));
                        if(hirl0 != hirl.b && hirl0 != hirl.d) {
                            ++this.c;
                            continue;
                        }
                        break alab1;
                    }
                }
                ++this.c;
            }
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

