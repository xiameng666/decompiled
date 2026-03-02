public final class acoe {
    public final hodo a;
    public final int b;

    public acoe() {
        throw null;
    }

    public acoe(hodo hodo0, int v) {
        if(hodo0 == null) {
            throw new NullPointerException("Null consentValue");
        }
        this.a = hodo0;
        if(v == 0) {
            throw new NullPointerException("Null consentVersion");
        }
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof acoe) && this.a.equals(((acoe)object0).a) && this.b == ((acoe)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ConsentProps{consentValue=" + this.a.toString() + ", consentVersion=" + Integer.toString(this.b - 2) + "}";
    }
}

