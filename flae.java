import java.util.concurrent.atomic.AtomicReference;

public final class flae {
    public final fgvt a;
    public final flaq b;
    public final fkzv c;

    public flae(fkzv fkzv0, flaq flaq0, fgvt fgvt0) {
        this.c = fkzv0;
        this.b = flaq0;
        this.a = fgvt0;
    }

    public final gmcd a(Iterable iterable0) {
        return gdtf.k(this.c(), new fkzr(iterable0), gmap.a);
    }

    public final gmcd b(Enum enum0) {
        fkzp fkzp0 = new fkzp(enum0, this.a.d().toEpochMilli());
        return this.b.a(fkzp0);
    }

    public final gmcd c() {
        AtomicReference atomicReference0 = new AtomicReference();
        fkzs fkzs0 = new fkzs(atomicReference0);
        return gdtf.j(this.b.a(fkzs0), new fkzt(this, atomicReference0), gmap.a);
    }
}

