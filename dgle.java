import java.util.List;

public final class dgle implements dglh {
    private final String a;
    private final dgfy b;
    private final List c;

    public dgle(String s, dgfy dgfy0) {
        this.a = s;
        this.b = dgfy0;
        this.c = ibpg.J(new djbj(ibpo.aC(dgfy0.a)).b(s));
    }

    @Override  // dglh
    public final dgfy a() {
        return this.b;
    }

    @Override  // dglh
    public final String b() {
        return null;
    }

    @Override  // dglh
    public final List c() {
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgle)) {
            return false;
        }
        return ibuq.m(this.a, ((dgle)object0).a) ? ibuq.m(this.b, ((dgle)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "EncryptedQrCodeAdvertisingToken(deviceNameToEncrypt=" + this.a + ", qrCodeMetadata=" + this.b + ")";
    }
}

