public final class bgbd {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public bgbd(boolean z, boolean z1, boolean z2) {
        this.a = z;
        this.b = z1;
        this.c = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bgbd)) {
            return false;
        }
        if(this.a != ((bgbd)object0).a) {
            return false;
        }
        return this.b == ((bgbd)object0).b ? this.c == ((bgbd)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (bgbc.a(this.a) * 0x1F + bgbc.a(this.b)) * 0x1F + bgbc.a(this.c);
    }

    @Override
    public final String toString() {
        return "CredentialTypes(hasPasswords=" + this.a + ", hasPasskeys=" + this.b + ", hasNetworkDevices=" + this.c + ")";
    }
}

