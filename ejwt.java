import java.util.concurrent.TimeUnit;

public final class ejwt implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    public static gRPCMethodDescriptor c;
    public static gRPCMethodDescriptor d;
    public static gRPCMethodDescriptor e;
    public static gRPCMethodDescriptor f;
    public static gRPCMethodDescriptor g;
    public static gRPCMethodDescriptor h;
    public static gRPCMethodDescriptor i;
    public static gRPCMethodDescriptor j;
    public static gRPCMethodDescriptor k;
    public static gRPCMethodDescriptor l;
    public static gRPCMethodDescriptor m;
    public static gRPCMethodDescriptor n;
    public final bbfe_BaseGrpcServer o;
    public final iakq p;
    private static gRPCMethodDescriptor q;
    private static gRPCMethodDescriptor r;
    private static gRPCMethodDescriptor s;
    private static gRPCMethodDescriptor t;
    private static gRPCMethodDescriptor u;

    static {
        ejwt.a = (int)hxsx.g();
    }

    public ejwt(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.o = bbfe0;
        this.p = iakq.a;
    }

    public ejwt(ejwt ejwt0, iakp iakp0, Object object0) {
        this.o = ejwt0.o;
        this.p = ejwt0.p.h(iakp0, object0);
    }

    public final geee a(baqr baqr0, geed geed0) {
        if(ejwt.r == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)geed.a));
            ibjh ibjh1 = new ibjh(((MessageLite)geee.a));
            ejwt.r = new gRPCMethodDescriptor(gRPCMethodType.a, "caribou.tasks.service.TasksApiService/CreateTask", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (geee)this.o.callUnaryWithAuth(ejwt.r, baqr0, geed0, ((long)ejwt.a), TimeUnit.MILLISECONDS, this.p);
    }

    public final geex b(baqr baqr0, geew geew0) {
        if(ejwt.t == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)geew.a));
            ibjh ibjh1 = new ibjh(((MessageLite)geex.a));
            ejwt.t = new gRPCMethodDescriptor(gRPCMethodType.a, "caribou.tasks.service.TasksApiService/GetTask", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (geex)this.o.callUnaryWithAuth(ejwt.t, baqr0, geew0, ((long)ejwt.a), TimeUnit.MILLISECONDS, this.p);
    }

    public final geez c(baqr baqr0, geey geey0) {
        if(ejwt.u == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)geey.a));
            ibjh ibjh1 = new ibjh(((MessageLite)geez.a));
            ejwt.u = new gRPCMethodDescriptor(gRPCMethodType.a, "caribou.tasks.service.TasksApiService/ListTasks", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (geez)this.o.callUnaryWithAuth(ejwt.u, baqr0, geey0, ((long)ejwt.a), TimeUnit.MILLISECONDS, this.p);
    }

    @Override
    public final void close() {
        this.o.shutdownChannel();
    }

    public final void d(baqr baqr0, gedp gedp0) {
        if(ejwt.q == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gedp.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gedq.a));
            ejwt.q = new gRPCMethodDescriptor(gRPCMethodType.a, "caribou.tasks.service.TasksApiService/BatchMutate", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        gedq gedq0 = (gedq)this.o.callUnaryWithAuth(ejwt.q, baqr0, gedp0, ((long)ejwt.a), TimeUnit.MILLISECONDS, this.p);
    }

    public final void e(baqr baqr0, geeh geeh0) {
        if(ejwt.s == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)geeh.a));
            ibjh ibjh1 = new ibjh(((MessageLite)geei.a));
            ejwt.s = new gRPCMethodDescriptor(gRPCMethodType.a, "caribou.tasks.service.TasksApiService/DeleteRecurrence", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        geei geei0 = (geei)this.o.callUnaryWithAuth(ejwt.s, baqr0, geeh0, ((long)ejwt.a), TimeUnit.MILLISECONDS, this.p);
    }
}

