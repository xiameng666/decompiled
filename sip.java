public final class sip {
    public final String a;
    public final ibth b;
    private final boolean c;

    public sip(String s, ibth ibth0) {
        ibuq.f(s, "text");
        ibuq.f(ibth0, "onClick");
        super();
        this.a = s;
        this.c = true;
        this.b = ibth0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof sip)) {
            return false;
        }
        return ibuq.m(this.a, ((sip)object0).a) ? ibuq.m(this.b, ((sip)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + 0x4CF) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "AlertDialogButton(text=" + this.a + ", enabled=true, onClick=" + this.b + ")";
    }
}

