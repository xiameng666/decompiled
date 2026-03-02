import java.util.concurrent.TimeUnit;

public final class aqnv implements aqpf {
    public final aqpk a;

    public aqnv(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.k == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hisl.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hfsw.a));
            aqpk.k = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/DeleteBackupConfig", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hfsw)this.a.l.callUnaryWithAuth(aqpk.k, baqr0, ((hisl)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

