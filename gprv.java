import j..util.Objects;

public final class gprv {
    final String a;
    final gpsy b;

    public gprv(String s, gpsy gpsy0) {
        this.a = gpqj.a(s);
        this.b = gpsy0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof gprv) ? Objects.equals(this.a, ((gprv)object0).a) && Objects.equals(this.b, ((gprv)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        return "CacheKey{ ServiceType=" + this.a + ", " + this.b.toString() + " }";
    }
}

