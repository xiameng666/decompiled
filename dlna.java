import java.util.EnumSet;

public final class dlna {
    public final String a;
    private final String b;
    private final EnumSet c;

    public dlna(String s, String s1, EnumSet enumSet0) {
        ibuq.f(s, "readerGroupIdBase64");
        ibuq.f(s1, "readerSystemIssuerCaPublicKeyBase64");
        ibuq.f(enumSet0, "readerTransportProtocols");
        super();
        this.b = s;
        this.a = s1;
        this.c = enumSet0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dlna)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dlna)object0).b)) {
            return false;
        }
        return ibuq.m(this.a, ((dlna)object0).a) ? ibuq.m(this.c, ((dlna)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.b.hashCode() * 0x1F + this.a.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ReaderGroupConfiguration(readerGroupIdBase64=" + this.b + ", readerSystemIssuerCaPublicKeyBase64=" + this.a + ", readerTransportProtocols=" + this.c + ")";
    }
}

