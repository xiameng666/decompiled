import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class ezvz {
    private static final baun a;
    private final ezvy b;
    private final baqr c;

    static {
        ezvz.a = new baun("SystemUpdate", new String[]{"Backend", "ConfigDeliveryServiceGrpcWrapper"});
    }

    private ezvz(Context context0, ezvy ezvy0) {
        this.b = ezvy0;
        baqr baqr0 = new baqr();
        baqr0.d = "com.google.android.gms";
        baqr0.e = "com.google.android.gms";
        this.c = baqr0;
    }

    public static ezvz a(Context context0) {
        return new ezvz(context0, new ezvy(new bbfe_BaseGrpcServer(context0, hvxz.a.b().b(), ((int)hvxz.a.b().a()), context0.getApplicationInfo().uid, 0x409)));
    }

    public final hnoa b(hnnz hnnz0) {
        ezvz.a.d("Sent GetConfigRequest: %s.", new Object[]{hnnz0});
        ezvy ezvy0 = new ezvy(this.b, cmlp.a, ckkt.b);
        if(ezvy.a == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hnnz.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hnoa.a));
            ezvy.a = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.android.ota.download.configdelivery.v1.ConfigDeliveryService/GetConfig", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hnoa)ezvy0.b.callUnaryWithAuth(ezvy.a, this.c, hnnz0, 10000L, TimeUnit.MILLISECONDS, ezvy0.c);
    }

    public final void c() {
        this.b.a();
    }
}

