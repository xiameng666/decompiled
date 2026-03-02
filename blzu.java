import j..util.Objects;

public final class blzu {
    public final blzx a;
    public final blzv b;

    public blzu(blzx blzx0, blzv blzv0) {
        batl.s(blzx0);
        this.a = blzx0;
        if(!blzx0.equals(blzx.a)) {
            batl.b(blzv0 == null);
        }
        this.b = blzv0;
    }

    public final byte[] a() {
        byte[] arr_b = {this.a.Z};
        return this.b == null ? arr_b : glwl.d(new byte[][]{arr_b, this.b.a().s()});
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof blzu) ? Objects.equals(this.a, ((blzu)object0).a) && Objects.equals(this.b, ((blzu)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        return "Ctap2Response{responseStatus=" + this.a.toString() + ", responseData=" + this.b + "}";
    }
}

