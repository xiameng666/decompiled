public final class isj {
    public final hqf a;
    public final int b;

    public isj(hqf hqf0, int v) {
        this.a = hqf0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof isj)) {
            return false;
        }
        return ibuq.m(this.a, ((isj)object0).a) ? this.b == ((isj)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
    }
}

