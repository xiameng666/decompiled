public final class jhk {
    public static final hax a;
    public final iwj b;
    public final long c;
    public final jbk d;

    static {
        jhk.a = new hba(new jhi(), new jhj());
    }

    public jhk(iwj iwj0, long v) {
        this(iwj0, v, null);
    }

    public jhk(iwj iwj0, long v, jbk jbk0) {
        this.b = iwj0;
        this.c = jbl.b(v, this.a().length());
        this.d = jbk0 == null ? null : new jbk(jbl.b(jbk0.b, this.a().length()));
    }

    public jhk(String s, long v, int v1) {
        if((v1 & 2) != 0) {
            v = jbk.a;
        }
        if(1 == (v1 & 1)) {
            s = "";
        }
        this(new iwj(s), v, null);
    }

    public final String a() {
        return this.b.b;
    }

    public static jhk b(jhk jhk0, iwj iwj0, long v, int v1) {
        if((v1 & 1) != 0) {
            iwj0 = jhk0.b;
        }
        if((v1 & 2) != 0) {
            v = jhk0.c;
        }
        return (v1 & 4) == 0 ? new jhk(iwj0, v, null) : new jhk(iwj0, v, jhk0.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jhk) ? jbk.i(this.c, ((jhk)object0).c) && ibuq.m(this.d, ((jhk)object0).d) && ibuq.m(this.b, ((jhk)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() * 0x1F;
        return this.d == null ? (v + jbj.a(this.c)) * 0x1F : (v + jbj.a(this.c)) * 0x1F + jbj.a(this.d.b);
    }

    @Override
    public final String toString() {
        return "TextFieldValue(text=\'" + this.b + "\', selection=" + jbk.f(this.c) + ", composition=" + this.d + ')';
    }
}

