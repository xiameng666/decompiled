public final class byot {
    public final byat a;
    public final bxzv b;

    public byot(byat byat0, bxzv bxzv0) {
        ibuq.f(byat0, "activeProvider");
        ibuq.f(bxzv0, "activeEntryInfo");
        super();
        this.a = byat0;
        this.b = bxzv0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byot)) {
            return false;
        }
        return ibuq.m(this.a, ((byot)object0).a) ? ibuq.m(this.b, ((byot)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ActiveEntry(activeProvider=" + this.a + ", activeEntryInfo=" + this.b + ")";
    }
}

