import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class cbxh {
    public static final bboh a;
    public final cbxi b;
    private final Context c;

    static {
        cbxh.a = bboh.b("LangProfileGrpcService", bbcu.ct);
    }

    public cbxh(Context context0, cbxi cbxi0) {
        this.c = context0;
        this.b = cbxi0;
    }

    public final baqr a(Account account0) {
        String s = "oauth2:" + huli.h();
        String s1 = acso.f(this.c, account0, s);
        baqr baqr0 = new baqr();
        baqr0.e = "com.google.android.gms";
        baqr0.a = Process.myUid();
        baqr0.d = "com.google.android.gms";
        baqr0.c = account0;
        baqr0.b = account0;
        baqr0.l(huli.h());
        baqr0.m("auth_token", s1);
        return baqr0;
    }

    public static cbxh b(Context context0) {
        return new cbxh(context0, new cbxi(new bbfe_BaseGrpcServer(context0, huli.a.e().u(), ((int)huli.a.e().k()), context0.getApplicationInfo().uid, 0x4600)));
    }

    public final void c() {
        this.b.a();
    }

    public final boolean d(Account account0, gged_interceptors gged0) {
        huln huln0 = huln.a;
        if(huln0.c().i()) {
            huln0.c().r();
            try {
                baqr baqr0 = this.a(account0);
                gqgl gqgl0 = gqgl.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqgl0).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gqgl gqgl1 = (gqgl)hftp0.b_message;
                hfuo hfuo0 = gqgl1.b;
                if(!hfuo0.c()) {
                    gqgl1.b = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(gged0, gqgl1.b);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gqgl)hftp0.b_message).d = false;
                if(huln0.c().q()) {
                    gfsx gfsx0 = cbxc.b();
                    boolean z = gfsx0.i() && ((Account[])gfsx0.d()).length > 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gqgl)hftp0.b_message).c = z;
                }
                cbxi cbxi0 = new cbxi(this.b, cmlp.a, ckif.b);
                gqgl gqgl2 = (gqgl)hftp0.N_build();
                if(cbxi.c == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gqgl0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gqgm.a));
                    cbxi.c = new gRPCMethodDescriptor(gRPCMethodType.a, "i18n.language_profile.mobile.MobileUlpService/SetLanguageSettings", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                if(((gqgm)cbxi0.d.callUnaryWithAuth(cbxi.c, baqr0, gqgl2, ((long)cbxi.a), TimeUnit.MILLISECONDS, cbxi0.e)) != null) {
                    return true;
                }
            }
            catch(acse | IOException exception1) {
                a.ae(cbxh.a.i(), "Authentication failure.", exception1);
            }
            catch(iapl | iapn exception0) {
                a.ae(cbxh.a.i(), "Request failure.", exception0);
            }
            return false;
        }
        return false;
    }
}

