import java.util.List;

public final class ebzj implements ibts {
    public final List a;

    public ebzj(List list0) {
        this.a = list0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dygd dygd0 = (dygd)object0;
        ibuq.c(dygd0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dygd0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dygd0));
        dygf dygf0 = dyge.a(hftp0);
        dyom dyom0 = dyol.a(((dyof)((ProtoLiteMessage)dyoi.a).v_newBuilder()));
        dyom0.c();
        dyom0.b(this.a);
        dygf0.f(dyom0.a());
        return dygf0.a();
    }
}

