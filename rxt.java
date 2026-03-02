import j..util.Objects;

public final class rxt extends rxv {
    private final roo a;
    private final long b;
    private final String d;

    public rxt(rna rna0, roo roo0, long v) {
        ibuq.f(rna0, "parser");
        super();
        this.a = roo0;
        this.b = v;
        this.d = "InProgress";
    }

    public rxt(ryh ryh0) {
        this(ryh0.g(), ryh0, ryh0.b);
    }

    public final rxt d(rna rna0) {
        ibuq.f(rna0, "parser");
        return new rxt(rna0, this.a, this.b);
    }

    @Override  // rxv
    protected final rna e() {
        throw null;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof rxt) && rrd.b(((rrc)object0), this);
    }

    @Override  // roj
    public final long f() {
        return this.b;
    }

    @Override  // ryt
    public final rnv g() {
        return null;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.fa(), this.fb(), ((long)this.b)});
    }

    @Override  // ryt
    public final rxv j(rna rna0) {
        return this.d(rna0);
    }

    @Override  // ryt
    public final rxv k(rne rne0) {
        ibuq.f(rne0, "parser");
        return this.d(rne0.g());
    }

    @Override  // ryt
    public final boolean p() {
        return false;
    }

    @Override  // rxv
    protected final roo q() {
        return this.a;
    }

    @Override  // rxv
    protected final String s() {
        return this.d;
    }

    @Override
    public final String toString() {
        return "OnboardingTaskState.InProgress(" + rqy.a(this);
    }
}

