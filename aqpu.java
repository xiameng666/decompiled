import java.util.concurrent.TimeUnit;

public final class aqpu implements aqpf {
    public final aqqc a;

    public aqpu(aqqc aqqc0) {
        this.a = aqqc0;
    }

    @Override  // aqpf
    public final Object a(baqr baqr0, Object object0) {
        if(aqqc.d == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)groi.a));
            ibjh ibjh1 = new ibjh(((MessageLite)groj.a));
            aqqc.d = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.apps.backup.androidplatformbackuprestore.v1.AndroidPlatformBackupRestoreService/GetStorageQuotaInfo", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (groj)this.a.e.callUnaryWithAuth(aqqc.d, baqr0, ((groi)object0), 10000L, TimeUnit.MILLISECONDS, this.a.f);
    }
}

