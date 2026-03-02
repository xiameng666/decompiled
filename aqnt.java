import java.util.concurrent.TimeUnit;

public final class aqnt implements aqpf {
    public final aqpk a;

    public aqnt(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.a == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hisx.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hisy.a));
            aqpk.a = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/StartTransaction", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hisy)this.a.l.callUnaryWithAuth(aqpk.a, baqr0, ((hisx)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

