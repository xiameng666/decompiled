public final class ehpr {
    public final int a;
    public final int b;
    public final String c;

    public ehpr(int v, int v1, String s) {
        ibuq.f(s, "summary");
        super();
        this.a = v;
        this.b = v1;
        this.c = s;
    }

    public final boolean a() {
        return this.a != 0x7F150EF0;  // string:empty_string ""
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ehpr)) {
            return false;
        }
        if(this.a != ((ehpr)object0).a) {
            return false;
        }
        return this.b == ((ehpr)object0).b ? ibuq.m(this.c, ((ehpr)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a * 0x1F + this.b) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "SummaryInfo(errorMessage=" + this.a + ", errorColor=" + this.b + ", summary=" + this.c + ")";
    }
}

