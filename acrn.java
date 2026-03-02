import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class acrn {
    public static boolean a(Throwable throwable0) {
        iapk iapk0;
        if((throwable0 instanceof iapn)) {
            iapk0 = ((iapn)throwable0).a;
        }
        else {
            iapk0 = (throwable0 instanceof iapl) ? ((iapl)throwable0).a : null;
        }
        if(iapk0 == null) {
            iapk0 = iapk.d;
        }
        switch(iapk0.t.ordinal()) {
            case 1: 
            case 4: 
            case 8: 
            case 10: 
            case 13: 
            case 14: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static final void b(baqr baqr0, grnz grnz0, acrm acrm0) {
        acrm acrm1 = new acrm(acrm0, cmlp.a, cjxw.b);
        if(acrm.b == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)grnz.a));
            ibjh ibjh1 = new ibjh(((MessageLite)groa.a));
            acrm.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.api.auditrecording.v1.AuditRecordingMobileService/CreateAuditRecord", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        groa groa0 = (groa)acrm1.c.callUnaryWithAuth(acrm.b, baqr0, grnz0, ((long)acrm.a), TimeUnit.MILLISECONDS, acrm1.d);
    }

    public static final baqr c(Account account0, String s, Context context0) {
        String s1;
        baqr baqr0 = new baqr();
        baqr0.e = "com.google.android.gms";
        if(!s.isEmpty()) {
            baqr0.a = bbmq.c(context0, s);
            baqr0.d = s;
        }
        if(account0 != null) {
            try {
                s1 = acso.f(context0, account0, "oauth2:https://www.googleapis.com/auth/auditrecording-pa");
            }
            catch(acse | IOException unused_ex) {
                s1 = null;
            }
            if(s1 != null) {
                baqr0.c = account0;
                baqr0.b = account0;
                baqr0.l("https://www.googleapis.com/auth/auditrecording-pa");
                baqr0.m("auth_token", s1);
            }
        }
        return baqr0;
    }
}

