import java.util.List;

public final class dglg implements dglh {
    private final String a;
    private final dgfy b;
    private final List c;

    public dglg(String s, dgfy dgfy0) {
        this.a = s;
        this.b = dgfy0;
        this.c = dgfy0 == null ? null : ibpg.J(djbj.c(new djbj(ibpo.aC(dgfy0.a))));
    }

    @Override  // dglh
    public final dgfy a() {
        return this.b;
    }

    @Override  // dglh
    public final String b() {
        return this.a;
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
        if(!(object0 instanceof dglg)) {
            return false;
        }
        return ibuq.m(this.a, ((dglg)object0).a) ? ibuq.m(this.b, ((dglg)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "PlaintextDeviceName(plaintextDeviceName=" + this.a + ", qrCodeMetadata=" + this.b + ")";
    }
}

