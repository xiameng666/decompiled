public final class ajam {
    public final int a;
    public final int b;

    public ajam() {
        throw null;
    }

    public ajam(int v, int v1) {
        this.b = v;
        this.a = v1;
    }

    public static ajal a() {
        ajal ajal0 = new ajal();
        ajal0.a = 1;
        ajal0.b(0);
        return ajal0;
    }

    public static ajam b() {
        return ajam.a().a();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof ajam)) {
            int v = this.b;
            int v1 = ((ajam)object0).b;
            if(v != 0) {
                return v == v1 && this.a == ((ajam)object0).a;
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        aiye.b(this.b);
        return this.a ^ (this.b ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "WriteAllBlockDataResult{resultType=" + aiye.a(this.b) + ", packageCount=" + this.a + "}";
    }
}

