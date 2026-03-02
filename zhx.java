public final class zhx {
    public final zhw a;
    public final zhw b;

    public zhx(zhw zhw0, zhw zhw1) {
        this.a = zhw0;
        this.b = zhw1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zhx)) {
            return false;
        }
        return ibuq.m(this.a, ((zhx)object0).a) ? ibuq.m(this.b, ((zhx)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ASThemedColor(light=" + this.a + ", dark=" + this.b + ")";
    }
}

