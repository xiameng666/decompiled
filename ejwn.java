import java.util.concurrent.TimeUnit;

public final class ejwn implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    protected final bbfe_BaseGrpcServer c;
    protected final iakq d;
    private static gRPCMethodDescriptor e;

    static {
        ejwn.a = (int)hxsx.g();
    }

    public ejwn(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.c = bbfe0;
        this.d = iakq.a;
    }

    public ejwn(ejwn ejwn0, iakp iakp0, Object object0) {
        this.c = ejwn0.c;
        this.d = ejwn0.d.h(iakp0, object0);
    }

    public final void a(baqr baqr0, gefw gefw0) {
        if(ejwn.e == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gefw.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gefx.a));
            ejwn.e = new gRPCMethodDescriptor(gRPCMethodType.a, "caribou.tasks.service.CustomizeSnoozePresetsService/SetSnoozePresets", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        gefx gefx0 = (gefx)this.c.callUnaryWithAuth(ejwn.e, baqr0, gefw0, ((long)ejwn.a), TimeUnit.MILLISECONDS, this.d);
    }

    @Override
    public final void close() {
        this.c.shutdownChannel();
    }
}

