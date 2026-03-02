public final class eruo {
    public final String a;
    public final boolean b;

    public eruo(String s, boolean z) {
        ibuq.f(s, "accountName");
        super();
        this.a = s;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eruo)) {
            return false;
        }
        return ibuq.m(this.a, ((eruo)object0).a) ? this.b == ((eruo)object0).b : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        return "SpatulaSettingsRecord(accountName=" + this.a + ", preferenceEnabled=" + this.b + ")";
    }
}

