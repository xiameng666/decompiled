public final class bjj {
    public final boolean a;
    public final boolean b;

    public bjj(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bjj)) {
            return false;
        }
        return this.a == ((bjj)object0).a ? this.b == ((bjj)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return bji.a(this.a) * 0x1F + bji.a(this.b);
    }

    @Override
    public final String toString() {
        return "ValidationCriteria(checkBack=" + this.a + ", checkFront=" + this.b + ')';
    }
}

