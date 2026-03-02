import java.util.concurrent.TimeUnit;

public final class aqnx implements aqpf {
    public final aqpk a;

    public aqnx(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.j == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hitb.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hisg.a));
            aqpk.j = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/UpdateBackupConfig", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hisg)this.a.l.callUnaryWithAuth(aqpk.j, baqr0, ((hitb)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

