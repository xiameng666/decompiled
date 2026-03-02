import j..util.Objects;
import j..util.Optional;

public final class cqqv implements gfsi {
    public final Optional a;
    public final hgzp b;
    public final int c;

    public cqqv(int v, Optional optional0, hgzp hgzp0) {
        this.c = v;
        this.a = optional0;
        this.b = hgzp0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((hgzi)((ProtoLiteBuilder)object0).b_message).e = this.c - 1;
        ((hgzi)((ProtoLiteBuilder)object0).b_message).b |= 4;
        Objects.requireNonNull(((ProtoLiteBuilder)object0));
        cqra cqra0 = new cqra(((ProtoLiteBuilder)object0));
        this.a.ifPresent(cqra0);
        hgzi hgzi0 = (hgzi)((ProtoLiteBuilder)object0).N_build();
        return cqrb.b(this.b, hgzi0);
    }
}

