public final class cqif {
    public final ckcq a;
    public final ckcq b;

    public cqif() {
        throw null;
    }

    public cqif(ckcq ckcq0, ckcq ckcq1) {
        this.a = ckcq0;
        this.b = ckcq1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof cqif) && this.a.equals(((cqif)object0).a) && this.b.equals(((cqif)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "QuickRemoteLockCollectionDefinitions{setSecurityQuestionAndAnswer=" + this.a + ", deleteSecurityQuestionAndAnswer=" + this.b + "}";
    }
}

