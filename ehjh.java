import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class ehjh extends Enum implements ehjg {
    public static final enum ehjh a;
    private static final ehjh[] b;
    private ggfp c;
    private ggfp d;
    private ggeo e;

    static {
        ehjh.a = new ehjh();
        ehjh.b = new ehjh[]{ehjh.a};
    }

    private ehjh() {
        super("INSTANCE", 0);
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override  // ehjg
    public final void a() {
        synchronized(this) {
            if(hxgc.d()) {
                return;
            }
            ehjh.f();
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    @Override  // ehjx
    public final Account b(Context context0, String s) {
        Account account1;
        synchronized(this) {
            if(hxgc.d()) {
                return ehjy.a(context0, s);
            }
            if(this.e == null) {
                ggfp ggfp0 = this.d(context0);
                if(ggfp0 == null) {
                    return null;
                }
                ggek ggek0 = new ggek();
                for(Object object0: ggfp0) {
                    ggek0.i(((Account)object0).name, ((Account)object0));
                }
                this.e = ggek0.b();
            }
            else {
                ehjh.f();
            }
            account1 = (Account)this.e.get(s);
        }
        return account1;
    }

    @Override  // ehjx
    public final ggfp c(Context context0) {
        synchronized(this) {
            if(hxgc.d()) {
                return ehjy.b(context0);
            }
            if(this.d == null) {
                ggfp ggfp1 = this.d(context0);
                if(ggfp1 == null) {
                    return null;
                }
                ggfn ggfn0 = new ggfn();
                for(Object object0: ggfp1) {
                    ggfn0.i(((Account)object0).name);
                }
                this.d = ggfn0.h();
            }
            else {
                ehjh.f();
            }
        }
        return this.d;
    }

    @Override  // ehjx
    public final ggfp d(Context context0) {
        synchronized(this) {
            if(hxgc.d()) {
                return ehjy.c(context0);
            }
            ehjh.f();
            if(this.c == null) {
                ggfn ggfn0 = new ggfn();
                Account[] arr_account = cchj.b(context0).p("com.google");
                for(int v1 = 0; v1 < arr_account.length; ++v1) {
                    Account account0 = arr_account[v1];
                    if(!TextUtils.isEmpty(account0.name)) {
                        ggfn0.i(account0);
                    }
                }
                this.c = ggfn0.h();
            }
        }
        return this.c;
    }

    @Override  // ehjx
    public final ggfp e(Context context0) {
        if(hxgc.d()) {
            ggfp ggfp0 = ehjy.c(context0);
            return ggfp0 == null ? ggnj.a : ggfp0;
        }
        ggfp ggfp1 = this.d(context0);
        return ggfp1 == null ? ggnj.a : ggfp1;
    }

    private static void f() {
        if(hxgc.e() && (ehjs.d.nextDouble() < hxgc.b())) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisl.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gisl)hftp0.b_message).c = 1;
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

    public static ehjh[] values() {
        return (ehjh[])ehjh.b.clone();
    }
}

