public final class ckcr {
    public final bbed a;
    public final int b;

    public ckcr() {
        throw null;
    }

    public ckcr(bbed bbed0, int v) {
        if(bbed0 == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.a = bbed0;
        this.b = v;
    }

    public final int a() {
        return this.b;
    }

    public final bbed b() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ckcr) && this.a.equals(((ckcr)object0).a) && this.b == ((ckcr)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "CollectionDefinitionUid{useCaseId=" + this.a.toString() + ", collectionId=" + this.b + "}";
    }
}

