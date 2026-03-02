import android.content.Context;
import android.util.Base64;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class epsl implements Callable {
    public final SignInChimeraActivity a;

    public epsl(SignInChimeraActivity signInChimeraActivity0) {
        this.a = signInChimeraActivity0;
    }

    @Override
    public final Object call() {
        try {
            SignInChimeraActivity signInChimeraActivity0 = this.a;
            Context context0 = signInChimeraActivity0.getBaseContext();
            bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(context0, hyfg.a.b().c(), ((int)hyfg.a.b().a()), -1, 0x6501);
            bbfe0.addHeader("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
            bbfe0.addHeader("X-Android-Package", "com.google.android.gms");
            bbfe0.addHeader("X-Android-Cert", bbmq.l(context0, "com.google.android.gms"));
            eptw eptw0 = new eptw(bbfe0);
            String s = signInChimeraActivity0.m;
            gftb.check(s);
            byte[] arr_b = bbmq.ac(signInChimeraActivity0.getBaseContext(), s);
            gftb.check(arr_b);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgir.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hgir)hftp0.b_message).c = s;
            String s1 = Base64.encodeToString(arr_b, 2);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgir hgir0 = (hgir)hftp0.b_message;
            s1.getClass();
            hgir0.b = s1;
            hgir hgir1 = (hgir)hftp0.N_build();
            hgix hgix0 = hgix.a;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgix0).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgit.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hgit hgit0 = (hgit)hftp2.b_message;
            hgir1.getClass();
            hgit0.c = hgir1;
            hgit0.b = 3;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgix hgix1 = (hgix)hftp1.b_message;
            hgit hgit1 = (hgit)hftp2.N_build();
            hgit1.getClass();
            hgix1.c = hgit1;
            hgix1.b |= 1;
            hgix hgix2 = (hgix)hftp1.N_build();
            eptw eptw1 = new eptw(eptw0, cmlp.a, ckvp.b);
            if(eptw.a == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)hgix0));
                ibjh ibjh1 = new ibjh(((MessageLite)hgiy.a));
                eptw.a = new gRPCMethodDescriptor(gRPCMethodType.a, "google.identity.clientauthconfig.v1.ClientAuthConfig/GetDisplayBrand", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            hgiy hgiy0 = (hgiy)eptw1.b.callUnary(eptw.a, hgix2, 10000L, TimeUnit.MILLISECONDS, eptw1.c);
            if(hgiy0 == null) {
                throw new IOException("No Brand found for the calling package.");
            }
            if((hgiy0.b & 1) != 0) {
                hgiv hgiv0 = hgiy0.c == null ? hgiv.a : hgiy0.c;
                signInChimeraActivity0.q = gfta.a(hgiv0.c);
                signInChimeraActivity0.r = gfta.a(hgiv0.b);
                return gfsx.m(Integer.valueOf(2));
            }
        }
        catch(iapl iapl0) {
            throw new IOException(iapl0);
        }
        return gfsx.m(Integer.valueOf(2));
    }
}

