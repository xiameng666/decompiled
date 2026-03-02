import java.util.concurrent.TimeUnit;

public final class aqnw implements aqpf {
    public final aqpk a;

    public aqnw(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.f == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hisk.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hisf.a));
            aqpk.f = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/CreateBackup", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hisf)this.a.l.callUnaryWithAuth(aqpk.f, baqr0, ((hisk)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

