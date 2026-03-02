public final class byns {
    public final bynt a;
    public final bynw b;
    public final bynx c;
    public final byhu d;
    private final bynv e;

    public byns(bynv bynv0, bynt bynt0, bynw bynw0, bynx bynx0, byhu byhu0) {
        ibuq.f(bynw0, "currentScreenState");
        ibuq.f(byhu0, "remoteEntry");
        super();
        this.e = bynv0;
        this.a = bynt0;
        this.b = bynw0;
        this.c = bynx0;
        this.d = byhu0;
    }

    public static byns a(byns byns0, bynw bynw0) {
        ibuq.f(bynw0, "currentScreenState");
        ibuq.f(byns0.d, "remoteEntry");
        return new byns(byns0.e, byns0.a, bynw0, byns0.c, byns0.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byns)) {
            return false;
        }
        if(!ibuq.m(this.e, ((byns)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.a, ((byns)object0).a)) {
            return false;
        }
        if(this.b != ((byns)object0).b) {
            return false;
        }
        return ibuq.m(this.c, ((byns)object0).c) ? ibuq.m(this.d, ((byns)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.e.hashCode() * 0x1F + this.a.hashCode()) * 0x1F + this.b.hashCode();
        return this.c == null ? v * 0x1F * 0x1F + this.d.hashCode() : (v * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "CreateCredentialUiState(requestDisplayInfo=" + this.e + ", entryDisplayInfoHolder=" + this.a + ", currentScreenState=" + this.b + ", currentEntry=" + this.c + ", remoteEntry=" + this.d + ")";
    }
}

