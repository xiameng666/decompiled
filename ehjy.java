import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;

public final class ehjy {
    public static Account a(Context context0, String s) {
        synchronized(ehjy.class) {
            ehjy.d();
            Account[] arr_account = cchj.b(context0).p("com.google");
            for(int v1 = 0; v1 < arr_account.length; ++v1) {
                Account account0 = arr_account[v1];
                if(!TextUtils.isEmpty(account0.name) && TextUtils.equals(s, account0.name)) {
                    return account0;
                }
            }
        }
        return null;
    }

    public static ggfp b(Context context0) {
        ggfp ggfp1;
        synchronized(ehjy.class) {
            ggfp ggfp0 = ehjy.c(context0);
            if(ggfp0 == null) {
                return null;
            }
            ggfn ggfn0 = new ggfn();
            for(Object object0: ggfp0) {
                ggfn0.i(((Account)object0).name);
            }
            ggfp1 = ggfn0.h();
        }
        return ggfp1;
    }

    public static ggfp c(Context context0) {
        ggfp ggfp0;
        synchronized(ehjy.class) {
            ehjy.d();
            ggfn ggfn0 = new ggfn();
            Account[] arr_account = cchj.b(context0).p("com.google");
            for(int v1 = 0; v1 < arr_account.length; ++v1) {
                Account account0 = arr_account[v1];
                if(!TextUtils.isEmpty(account0.name)) {
                    ggfn0.i(account0);
                }
            }
            ggfp0 = ggfn0.h();
        }
        return ggfp0;
    }

    private static void d() {
        if(hxgc.e() && (ehjs.d.nextDouble() < hxgc.b())) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisl.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gisl)hftp0.b_message).c = 2;
            ((gisl)hftp0.b_message).b |= 1;
            gisl gisl0 = (gisl)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gisr.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gisr gisr0 = (gisr)hftp1.b_message;
            gisl0.getClass();
            gisr0.r = gisl0;
            gisr0.b |= 0x2000;
            efpt.a();
            efpt.b(null, hftp1);
        }
    }
}

