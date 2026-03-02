public final class dcsl {
    public final dcst a;
    public final String b;
    public final String c;

    public dcsl(dcst dcst0, String s, String s1) {
        ibuq.f(s, "sessionId");
        ibuq.f(s1, "displayName");
        super();
        this.a = dcst0;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dcsl)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dcsl)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((dcsl)object0).b) ? ibuq.m(this.c, ((dcsl)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "CloudReceiver(sharingId=" + this.a + ", sessionId=" + this.b + ", displayName=" + this.c + ")";
    }
}

