public final class decl {
    public final String a;
    public final debi b;

    public decl() {
        this(null);
    }

    public decl(String s, debi debi0) {
        ibuq.f(s, "searchQuery");
        ibuq.f(debi0, "contacts");
        super();
        this.a = s;
        this.b = debi0;
    }

    public decl(byte[] arr_b) {
        this("", debg.a);
    }

    public static decl a(decl decl0, String s, debi debi0, int v) {
        if((v & 1) != 0) {
            s = decl0.a;
        }
        if((v & 2) != 0) {
            debi0 = decl0.b;
        }
        ibuq.f(s, "searchQuery");
        ibuq.f(debi0, "contacts");
        return new decl(s, debi0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof decl)) {
            return false;
        }
        return ibuq.m(this.a, ((decl)object0).a) ? ibuq.m(this.b, ((decl)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ContactsState(searchQuery=" + this.a + ", contacts=" + this.b + ")";
    }
}

