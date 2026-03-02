import j..util.Objects;

public final class bmbl {
    public final ByteString a;
    public final ByteString b;
    public final ByteString c;

    public bmbl(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        ByteString hfsf1 = ByteString.copyFrom(arr_b1);
        ByteString hfsf2 = ByteString.copyFrom(arr_b2);
        super();
        boolean z = true;
        gftb.checkTrue(hfsf0.size() == 16);
        if(hfsf1.size() > 0xFFFF || hfsf1.size() <= 0) {
            z = false;
        }
        gftb.b(z, "Credential ID length is not within a legitimate range");
        this.a = hfsf0;
        this.b = hfsf1;
        this.c = hfsf2;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmbl) ? Objects.equals(this.a, ((bmbl)object0).a) && Objects.equals(this.b, ((bmbl)object0).b) && Objects.equals(this.c, ((bmbl)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }
}

