import java.util.concurrent.TimeUnit;

public final class aqny implements aqpf {
    public final aqpk a;

    public aqny(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.h == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hiso.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hfsw.a));
            aqpk.h = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/DeleteFiles", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hfsw)this.a.l.callUnaryWithAuth(aqpk.h, baqr0, ((hiso)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

