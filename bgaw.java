public final class bgaw implements bgax {
    public final bgez a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public bgaw(bgez bgez0, boolean z, boolean z1, boolean z2) {
        ibuq.f(bgez0, "selectedCredentialFilter");
        super();
        this.a = bgez0;
        this.b = z;
        this.c = z1;
        this.d = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bgaw)) {
            return false;
        }
        if(this.a != ((bgaw)object0).a) {
            return false;
        }
        if(this.b != ((bgaw)object0).b) {
            return false;
        }
        return this.c == ((bgaw)object0).c ? this.d == ((bgaw)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 0x1F + bgav.a(this.b)) * 0x1F + bgav.a(this.c)) * 0x1F + bgav.a(this.d);
    }

    @Override
    public final String toString() {
        return "FiltersVisible(selectedCredentialFilter=" + this.a + ", showPasswordsFilter=" + this.b + ", showPasskeysFilter=" + this.c + ", showNetworkDevicesFilter=" + this.d + ")";
    }
}

