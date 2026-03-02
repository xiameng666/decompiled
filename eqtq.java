import android.content.Context;
import android.os.Process;
import java.util.concurrent.TimeUnit;

public class eqtq {
    private final eqtp a;
    private final baqr b;
    private final ckcq c;
    private final ckcq d;
    private final ckcq e;

    public eqtq(Context context0) {
        bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(context0, hyhp.a.g().m(), ((int)hyhp.a.g().b()), context0.getApplicationInfo().uid, null);
        super();
        this.c = ckvu.b;
        this.d = ckvv.b;
        this.e = ckvt.b;
        this.a = new eqtp(bbfe0);
        baqr baqr0 = new baqr();
        baqr0.a = Process.myUid();
        baqr0.d = "com.google.android.gms";
        baqr0.e = "com.google.android.gms";
        this.b = baqr0;
    }

    public gscm a(gscl gscl0) {
        eqtp eqtp0 = new eqtp(this.a, cmlp.a, this.e);
        if(eqtp.d == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gscl.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gscm.a));
            eqtp.d = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.identity.devicesignin.v1.ProgrammaticSecondDeviceAuthService/ContinueSession", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gscm)eqtp0.e.callUnaryWithAuth(eqtp.d, this.b, gscl0, ((long)eqtp.a), TimeUnit.MILLISECONDS, eqtp0.f);
    }

    public gsco b(gscn gscn0) {
        eqtp eqtp0 = new eqtp(this.a, cmlp.a, this.c);
        if(eqtp.b == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gscn.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gsco.a));
            eqtp.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.identity.devicesignin.v1.ProgrammaticSecondDeviceAuthService/GetChallengeData", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gsco)eqtp0.e.callUnaryWithAuth(eqtp.b, this.b, gscn0, ((long)eqtp.a), TimeUnit.MILLISECONDS, eqtp0.f);
    }

    public gscr c(gscq gscq0) {
        eqtp eqtp0 = new eqtp(this.a, cmlp.a, this.d);
        if(eqtp.c == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gscq.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gscr.a));
            eqtp.c = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.identity.devicesignin.v1.ProgrammaticSecondDeviceAuthService/StartSession", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gscr)eqtp0.e.callUnaryWithAuth(eqtp.c, this.b, gscq0, ((long)eqtp.a), TimeUnit.MILLISECONDS, eqtp0.f);
    }

    public void d() {
        this.a.a();
    }
}

