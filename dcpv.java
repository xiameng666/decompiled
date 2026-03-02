import j..util.Objects;

public final class dcpv {
    public final int a;
    public final int b;

    public dcpv(dcpu dcpu0) {
        this.a = dcpu0.a;
        this.b = dcpu0.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(!(object0 instanceof dcpv)) {
            return false;
        }
        int v = this.a;
        int v1 = ((dcpv)object0).a;
        if(v != 0) {
            if(v != v1) {
                return false;
            }
            int v2 = this.b;
            int v3 = ((dcpv)object0).b;
            if(v2 != 0) {
                return v2 == v3;
            }
        }
        throw null;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b)});
    }
}

