import java.util.Map;

public final class egyw implements gfsi {
    public final Map a;

    public egyw(Map map0) {
        this.a = map0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        egqw egqw0 = (egqw)object0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)egqw0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)egqw0));
        egqu egqu0 = (egqu)hftp0;
        egqu0.a(this.a);
        return (egqw)((ProtoLiteBuilder)egqu0).N_build();
    }
}

