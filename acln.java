import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.identifier.settings.d;
import com.google.android.gms.appset.AppSetInfoParcel;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.Executor;

public final class acln {
    public final ackx a;
    public final Executor b;
    public final frli c;
    public static final int d;
    private static acln e;

    static {
    }

    private acln(Context context0) {
        this.a = ackx.a();
        this.b = acni.a();
        Context context1 = context0.getApplicationContext();
        if(context1 != null) {
            context0 = context1;
        }
        frce frce0 = new frce(context0);
        frce0.d("appset");
        frce0.e("pvids.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)acmr.a));
        frif frif0 = frie0.a();
        this.c = cjtb.a.a(frif0);
    }

    public static AppSetInfoParcel a(acmn acmn0) {
        return new AppSetInfoParcel(acmn0.c, acmn0.f);
    }

    public static acln b(Context context0) {
        synchronized(acln.class) {
            if(acln.e == null) {
                acln.e = new acln(context0);
            }
        }
        return acln.e;
    }

    public static acmm c(String s, hfwn hfwn0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)acmm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((acmm)hftv0).b |= 1;
        ((acmm)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        acmm acmm0 = (acmm)hftp0.b_message;
        hfwn0.getClass();
        acmm0.d = hfwn0;
        acmm0.b |= 2;
        return (acmm)hftp0.N_build();
    }

    public final acmn d(Context context0, acmn acmn0, String s, int v, hfwn hfwn0) {
        if((acmn0.b & 1) != 0) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)acmn0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)acmn0));
            return this.i(context0, hftp0, s, hfwn0);
        }
        String s1 = this.l(context0, s);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)acmn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s1.getClass();
        ((acmn)hftv0).b |= 1;
        ((acmn)hftv0).c = s1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        hfwn0.getClass();
        ((acmn)hftv1).d = hfwn0;
        ((acmn)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        hfwn0.getClass();
        ((acmn)hftv2).e = hfwn0;
        ((acmn)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        acmn acmn1 = (acmn)hftp1.b_message;
        acmn1.b |= 8;
        acmn1.f = v;
        return (acmn)hftp1.N_build();
    }

    public static void e(Context context0, acmo acmo0, hfwn hfwn0) {
        if(hoti.h()) {
            if(Long.compare(acln.j(acmo0, hfwn0), hoti.c()) >= 0) {
                d.d(context0, "PvidReset", "PVID reset due to exceeding max period of storage.");
                return;
            }
            if(acln.k(acmo0, hfwn0) >= hoti.b()) {
                d.d(context0, "PvidReset", "PVID reset due to exceeding max period of non-usage.");
            }
        }
    }

    public static boolean f(acmm acmm0, hfwn hfwn0) {
        return hfyf.g(hfyn.e((acmm0.d == null ? hfwn.a : acmm0.d), hfwn0)) < hoti.a.d().a();
    }

    public static boolean g(acmo acmo0, hfwn hfwn0) {
        return acln.k(acmo0, hfwn0) < hoti.b() && acln.j(acmo0, hfwn0) < hoti.c();
    }

    public static boolean h(acmo acmo0, hfwn hfwn0) {
        return acln.k(acmo0, hfwn0) < hoti.a.d().g();
    }

    public final acmn i(Context context0, ProtoLiteBuilder hftp0, String s, hfwn hfwn0) {
        if(acln.g(hftp0, hfwn0)) {
            if(!acln.h(hftp0, hfwn0)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                acmn acmn0 = (acmn)hftp0.b_message;
                hfwn0.getClass();
                acmn0.e = hfwn0;
                acmn0.b |= 4;
                return (acmn)hftp0.N_build();
            }
            return (acmn)hftp0.N_build();
        }
        acln.e(context0, hftp0, hfwn0);
        String s1 = this.l(context0, s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        acmn acmn1 = (acmn)hftp0.b_message;
        s1.getClass();
        acmn1.b |= 1;
        acmn1.c = s1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfwn0.getClass();
        ((acmn)hftv0).d = hfwn0;
        ((acmn)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        acmn acmn2 = (acmn)hftp0.b_message;
        hfwn0.getClass();
        acmn2.e = hfwn0;
        acmn2.b |= 4;
        return (acmn)hftp0.N_build();
    }

    private static long j(acmo acmo0, hfwn hfwn0) {
        return hfyf.g(hfyn.e(acmo0.b(), hfwn0));
    }

    private static long k(acmo acmo0, hfwn hfwn0) {
        return hfyf.g(hfyn.e(acmo0.c(), hfwn0));
    }

    private final String l(Context context0, String s) {
        this.a.b(context0, s);
        try {
            return elfz.b(this.a.c(context0, s)).toString();
        }
        catch(IOException | GeneralSecurityException exception0) {
            throw new acky(exception0);
        }
    }
}

