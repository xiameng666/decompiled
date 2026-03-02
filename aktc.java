import android.content.Context;
import android.os.Process;
import java.util.concurrent.TimeUnit;

public final class aktc {
    public final baqr a;
    public final akgf b;

    public aktc(Context context0) {
        bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(context0, hoyw.a.b().d(), ((int)hoyw.a.b().a()), 0x9001);
        super();
        baqr baqr0 = new baqr();
        baqr0.a = Process.myUid();
        baqr0.d = "com.google.android.gms";
        baqr0.e = "com.google.android.gms";
        this.a = baqr0;
        this.b = new akgf(bbfe0);
    }

    public final gsdq a(gsdp gsdp0) {
        akgf akgf0 = new akgf(this.b, cmlp.a, cjyd.b);
        if(akgf.b == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gsdp.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gsdq.a));
            akgf.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.identity.identitydevicegateway.v1.IdentityDeviceGatewayService/GetDeviceChallenge", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gsdq)akgf0.f.callUnaryWithAuth(akgf.b, this.a, gsdp0, ((long)akgf.a), TimeUnit.MILLISECONDS, akgf0.g);
    }

    public final void b() {
        this.b.a();
    }
}

