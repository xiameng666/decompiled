import java.util.concurrent.TimeUnit;

public final class aqns implements aqpf {
    public final aqpk a;

    public aqns(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.e == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hism.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hfsw.a));
            aqpk.e = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/DeleteBackup", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hfsw)this.a.l.callUnaryWithAuth(aqpk.e, baqr0, ((hism)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

