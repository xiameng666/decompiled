import java.util.concurrent.TimeUnit;

public final class aqnr implements aqpf {
    public final aqpk a;

    public aqnr(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.b == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hisi.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hisj.a));
            aqpk.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/CommitTransaction", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hisj)this.a.l.callUnaryWithAuth(aqpk.b, baqr0, ((hisi)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

