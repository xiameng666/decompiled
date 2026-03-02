import java.util.concurrent.TimeUnit;

public final class aqoa implements aqpf {
    public final aqpk a;

    public aqoa(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.d == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hiss.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hisu.a));
            aqpk.d = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/ListBackups", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hisu)this.a.l.callUnaryWithAuth(aqpk.d, baqr0, ((hiss)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

