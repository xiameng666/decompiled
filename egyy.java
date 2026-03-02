import java.util.Map;

public final class egyy implements gfsi {
    public final Map a;

    public egyy(Map map0) {
        this.a = map0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((egqw)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((egqw)object0))));
        if(!((egqu)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((egqu)hftp0))).ensureMutable();
        }
        ((egqw)((egqu)hftp0).b_message).b().clear();
        ((egqu)hftp0).a(this.a);
        return (egqw)((ProtoLiteBuilder)(((egqu)hftp0))).N_build();
    }
}

