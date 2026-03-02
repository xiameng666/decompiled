import j..util.Objects;

public abstract class dcox {
    public final gysp a;

    public dcox(gysp gysp0, int v) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gysp0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gysp0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gysp)hftp0.b_message).F = v - 1;
        ((gysp)hftp0.b_message).c |= 1;
        this.a = (gysp)hftp0.N_build();
    }

    public abstract int a();

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dcox) ? Objects.equals(this.a, ((dcox)object0).a) && this.a() == ((dcox)object0).a() : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    @Override
    public final String toString() {
        return String.format("NearbySharingLog:{%s}", gyzw.a((gyzw.b(this.a.e) == 0 ? 1 : gyzw.b(this.a.e))));
    }
}

