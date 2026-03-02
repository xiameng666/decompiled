import j..util.Objects;

public final class iavc {
    public String a;
    public iakk b;
    public String c;
    public iamc d;

    public iavc() {
        this.a = "unknown-authority";
        this.b = iakk.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof iavc) ? this.a.equals(((iavc)object0).a) && this.b.equals(((iavc)object0).b) && Objects.equals(this.c, ((iavc)object0).c) && Objects.equals(this.d, ((iavc)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
    }
}

