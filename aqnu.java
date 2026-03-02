import java.util.concurrent.TimeUnit;

public final class aqnu implements aqpf {
    public final aqpk a;

    public aqnu(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.i == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hisv.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hisw.a));
            aqpk.i = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/ListFiles", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hisw)this.a.l.callUnaryWithAuth(aqpk.i, baqr0, ((hisv)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

