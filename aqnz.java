import java.util.concurrent.TimeUnit;

public final class aqnz implements aqpf {
    public final aqpk a;

    public aqnz(aqpk aqpk0) {
        this.a = aqpk0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqpk.c == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hisq.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hisf.a));
            aqpk.c = new gRPCMethodDescriptor(gRPCMethodType.a, "google.subscriptions.backup.v1.GoogleOneBackupService/GetBackup", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hisf)this.a.l.callUnaryWithAuth(aqpk.c, baqr0, ((hisq)object0), 10000L, TimeUnit.MILLISECONDS, this.a.m);
    }
}

