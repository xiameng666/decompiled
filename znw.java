public final class znw implements zoe {
    public final zhr a;

    public znw(zhr zhr0) {
        this.a = zhr0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof znw) ? ibuq.m(this.a, ((znw)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ImageHolder(image=" + this.a + ")";
    }
}

