import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class akme extends lsb {
    public final AtomicBoolean a;
    public final lqi b;
    public final lqi c;

    public akme() {
        this.a = new AtomicBoolean(false);
        this.b = new lqi();
        this.c = new lqi();
    }

    static void a(Activity activity0, lqi lqi0, AccountManagerFuture accountManagerFuture0) {
        akmf akmf0;
        Bundle bundle0;
        gftb.r(hpxj.c(), "The feature flag is turned off, this should not be called.");
        Context context0 = activity0.getApplicationContext();
        Uri uri0 = Uri.parse(hpxj.a.b().b());
        String s = uri0.getHost();
        gftb.check(s);
        int v = uri0.getPort();
        if(v < 0) {
            v = 443;
        }
        aklg aklg0 = new aklg(new bbfe_BaseGrpcServer(context0, s, v, context0.getApplicationInfo().uid, 0x9701));
        try {
            bundle0 = (Bundle)accountManagerFuture0.getResult();
            gftb.check(bundle0);
        }
        catch(AuthenticatorException | IOException | OperationCanceledException unused_ex) {
            return;
        }
        String s1 = bundle0.getString("authAccount");
        if(s1 != null) {
            try {
                aklg aklg1 = new aklg(aklg0, cmlp.a, ckaa.b);
                baqr baqr0 = new baqr();
                baqr0.e = "com.google.android.gms";
                baqr0.d = "com.google.android.gms";
                baqr0.a = Process.myUid();
                igth igth0 = igth.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)igth0).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                igth igth1 = (igth)hftp0.b_message;
                igth1.b |= 1;
                igth1.c = s1;
                igth igth2 = (igth)hftp0.N_build();
                if(aklg.a == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)igth0));
                    ibjh ibjh1 = new ibjh(((MessageLite)igti.a));
                    aklg.a = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.play.enterprise.deviceauth.proto.service.v1.DeviceAuthService/GetUserIdByEmail", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                akmf0 = new akmf(((igti)aklg1.b.callUnaryWithAuth(aklg.a, baqr0, igth2, 30000L, TimeUnit.MILLISECONDS, aklg1.c)).b, null, null);
            }
            catch(iapl iapl0) {
                akmf0 = new akmf(null, iapl0, null);
            }
            catch(acse acse0) {
                akmf0 = new akmf(null, null, acse0);
            }
            lqi0.ii(akmf0);
            return;
        }
        Log.e("EnterpriseAuth", "Email is null.");
    }
}

