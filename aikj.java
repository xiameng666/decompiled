import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import com.google.android.gms.common.api.Status;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aikj {
    private static aikj a;
    private final Context b;
    private final aiki c;
    private final Object d;
    private static final baun e;

    static {
        aikj.e = new baun(new String[]{"RegistrationManager"});
    }

    private aikj(Context context0) {
        aiki aiki0 = new aiki(context0);
        super();
        this.b = context0;
        this.c = aiki0;
        this.d = new Object();
    }

    public static aikj a() {
        synchronized(aikj.class) {
            if(aikj.a == null) {
                aikj.a = new aikj(AppContextProvider.a());
            }
        }
        return aikj.a;
    }

    public final boolean b(int v, String s, int v1, int v2) {
        synchronized(this.d) {
            aiki aiki0 = this.c;
            Context context0 = aiki0.a;
            if(azqk.g(context0)) {
                return false;
            }
            if(!bbmn.n(context0, s)) {
                aikj.e.f("Cannot initiate enrollment because account does not exist: %s.", new Object[]{baun.q(s)});
                return false;
            }
            Account account0 = new Account(s, "com.google");
            int v4 = 8;
            if(v == 3 && hpqx.a.c().m()) {
                try {
                    aiid aiid0 = new aiid(aiki0.a);
                    aikh aikh0 = new aikh(aiki0.a, account0);
                    esaa esaa0 = new esaa(aiki0.a, 1, "AuthzenEnroller", null, "com.google.android.gms");
                    aikd aikd0 = new aikd(aiki0.a);
                    String s1 = hpra.c();
                    return new aikg(account0, aiid0, aikh0, esaa0, aikd0, new bbey(aiki0.a, s1, "cryptauth/v1/", false, null, null, 0x1002)).a(v1, v2);
                }
                catch(AssertionError assertionError0) {
                    if((assertionError0.getCause() instanceof NoSuchAlgorithmException)) {
                        aikj.e.g("Error getting algorithm.", assertionError0, new Object[0]);
                        this.d(8);
                        return false;
                    }
                    this.d(1);
                    throw assertionError0;
                }
            }
            ajes ajes0 = new ajes(this.b);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqux.a).v_newBuilder();
            gquw gquw0 = gquw.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqux gqux0 = (gqux)hftp0.b_message;
            gqux0.b = gquw0.a();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqur.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqup.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gqup)hftp2.b_message).b = 2;
            gqup gqup0 = (gqup)hftp2.N_build();
            gqup0.getClass();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gqur gqur0 = (gqur)hftp1.b_message;
            hfvh hfvh0 = gqur0.b;
            if(!hfvh0.b) {
                gqur0.b = hfvh0.a();
            }
            gqur0.b.put("com.google.android.gms", gqup0);
            ByteString hfsf0 = ((gqur)hftp1.N_build()).getDefaultInstanceForType();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqux)hftp0.b_message).c = hfsf0;
            gqux gqux1 = (gqux)hftp0.N_build();
            switch(v1) {
                case 8: {
                    break;
                }
                case 11: {
                    v4 = 11;
                    break;
                }
                default: {
                    v4 = 5;
                    if(v1 != 5 && (v1 != 4 && v1 != 6)) {
                        v4 = 9;
                        switch(v1) {
                            case 0: {
                                v4 = 0;
                                break;
                            }
                            case 9: {
                                break;
                            }
                            default: {
                                if(v1 != 12) {
                                    v4 = 10;
                                    switch(v1) {
                                        case 1: {
                                            v4 = 1;
                                            break;
                                        }
                                        case 3: {
                                            v4 = 3;
                                            break;
                                        }
                                        case 7: 
                                        case 10: {
                                            break;
                                        }
                                        default: {
                                            v4 = 13;
                                            switch(v1) {
                                                case 2: {
                                                    v4 = 2;
                                                    break;
                                                }
                                                case 13: {
                                                    break;
                                                }
                                                default: {
                                                    if(v1 != 14) {
                                                        v4 = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            evql evql0 = ajes0.i(v4, Arrays.asList(new String[]{"PublicKey", "authzen"}), (v != 2 && v != 3 ? "AuthzenAccountRegistration" : "ForceRegistration"), account0, gqux1.toBytesArray());
            try {
                evrg.o(evql0, 60L, TimeUnit.SECONDS);
            }
            catch(InterruptedException | ExecutionException | TimeoutException exception0) {
                aikj.e.g("Failed to perform enrollment", exception0, new Object[0]);
                this.c(false, account0);
                this.d(1);
                return false;
            }
            Status status0 = ((KeyRegistrationResult)evql0.j()).b;
            Object[] arr_object = {status0.b()};
            aikj.e.d("Result of key registration=%s", arr_object);
            if(ajev.c(status0.i)) {
                this.c(true, account0);
                return true;
            }
            this.c(false, account0);
        }
        return false;
    }

    private final void c(boolean z, Account account0) {
        Intent intent0 = new Intent("com.google.android.gms.auth.authzen.KEY_REGISTRATION_FINISHED");
        intent0.putExtra("account", account0);
        intent0.putExtra("is_success", z);
        this.b.sendBroadcast(intent0, "com.google.android.gms.auth.authzen.permission.KEY_REGISTRATION_FINISHED");
    }

    private final void d(int v) {
        Context context0 = this.b;
        if(Double.compare(Math.random(), hpra.a.b().a()) >= 0) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghpd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghpd)hftv0).c = v - 1;
        ((ghpd)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ghpd)hftv1).b |= 2;
        ((ghpd)hftv1).d = 0x8000000000000000L;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghpd ghpd0 = (ghpd)hftp0.b_message;
        ghpd0.b |= 4;
        ghpd0.e = 0x8000000000000000L;
        ghpd ghpd1 = (ghpd)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.h;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((ghon)hftv2).e = ghom0.av;
        ((ghon)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp1.b_message;
        ghpd1.getClass();
        ghon0.k = ghpd1;
        ghon0.b |= 0x80;
        ghon ghon1 = (ghon)hftp1.N_build();
        long v1 = Binder.clearCallingIdentity();
        try {
            if(hprg.d()) {
                cdwr.v().j(((ProtoLiteMessage)ghon1));
            }
            else {
                new aytt(context0, "ANDROID_AUTH").a().i(((MessageLite)ghon1)).d();
            }
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }
}

