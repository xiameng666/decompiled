import java.util.concurrent.TimeUnit;

public final class aqnq implements aqpf {
    public final aqpk a;

    public aqnq(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.g == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hisn.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hfsw.a));
            aqpk.g = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/DeleteFile", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hfsw)this.a.l.callUnaryWithAuth(aqpk.g, baqr0, ((hisn)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

