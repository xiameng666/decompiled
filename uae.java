public final class uae {
    public final int a;
    public final int b;

    public uae(int v, int v1) {
        this.a = v;
        this.b = v1;
        if(!uqq.m(v)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(uqq.m(v1)) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof uae)) {
            return false;
        }
        return this.a == ((uae)object0).a ? this.b == ((uae)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}

