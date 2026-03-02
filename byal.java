public final class byal {
    public final String a;
    public final String b;
    public final String c;
    public final byaa d;

    public byal(String s, String s1, String s2, byaa byaa0) {
        ibuq.f(s, "providerId");
        ibuq.f(s1, "entryKey");
        ibuq.f(s2, "entrySubkey");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = byaa0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byal)) {
            return false;
        }
        if(!ibuq.m(this.a, ((byal)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((byal)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((byal)object0).c) ? ibuq.m(this.d, ((byal)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
        return this.d == null ? v * 0x1F : v * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "UserSelectionResult(providerId=" + this.a + ", entryKey=" + this.b + ", entrySubkey=" + this.c + ", providerPendingIntentResponse=" + this.d + ")";
    }
}

