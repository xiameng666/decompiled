import java.util.Collection;

public final class hfkh {
    private ggfn a;
    private ggfp b;
    private ggfn c;
    private ggfp d;

    public final ggfn a() {
        if(this.a == null) {
            this.a = new ggfn();
        }
        return this.a;
    }

    public final ggfn b() {
        if(this.c == null) {
            this.c = new ggfn();
        }
        return this.c;
    }

    public final hfki c() {
        ggfn ggfn0 = this.a;
        if(ggfn0 != null) {
            this.b = ggfn0.h();
        }
        else if(this.b == null) {
            this.b = ggnj.a;
        }
        ggfn ggfn1 = this.c;
        if(ggfn1 != null) {
            this.d = ggfn1.h();
            return new hfki(this.b, this.d);
        }
        if(this.d == null) {
            this.d = ggnj.a;
        }
        return new hfki(this.b, this.d);
    }

    public final void d(hfke hfke0) {
        this.a().i(hfke0);
    }

    public final void e(hfki hfki0) {
        this.a().k(hfki0.a);
        this.b().k(hfki0.b);
    }

    public final void f(hfkm hfkm0) {
        this.b().i(hfkm0);
    }

    public final void g(Collection collection0) {
        this.a().k(collection0);
    }
}

