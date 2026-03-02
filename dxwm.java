import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import j..util.DesugarCollections;

public final class dxwm {
    private final frli a;

    public dxwm(Context context0, String s, Account account0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dxwo.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        dxwo dxwo0 = (dxwo)hftv0;
        frce frce0 = new frce(context0);
        frce0.d("pay");
        frce0.c(account0);
        frce0.e(s + "/WalletProposalResponseCache.pb");
        Uri uri0 = frce0.a();
        ibuq.e(uri0, "build(...)");
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dxwo.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.a = frli0;
    }

    public final Object a(hkiv hkiv0, ibrl ibrl0) {
        if((hkiv0.b & 2) != 0) {
            Object object0 = this.e(new dxwg(hkiv0), ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    public final Object b(ibrl ibrl0) {
        dxwj dxwj0;
        if((ibrl0 instanceof dxwj)) {
            dxwj0 = (dxwj)ibrl0;
            int v = dxwj0.c;
            if((v & 0x80000000) == 0) {
                dxwj0 = new dxwj(this, ibrl0);
            }
            else {
                dxwj0.c = v - 0x80000000;
            }
        }
        else {
            dxwj0 = new dxwj(this, ibrl0);
        }
        Object object0 = dxwj0.a;
        Object object1 = ibrx.a;
        switch(dxwj0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.a.a();
                ibuq.e(gmcd0, "getData(...)");
                dxwj0.c = 1;
                object0 = icpu.c(gmcd0, dxwj0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(object0);
        return (dxwo)object0;
    }

    public final Object c(fsvb fsvb0, ibrl ibrl0) {
        dxwk dxwk0;
        if((ibrl0 instanceof dxwk)) {
            dxwk0 = (dxwk)ibrl0;
            int v = dxwk0.c;
            if((v & 0x80000000) == 0) {
                dxwk0 = new dxwk(this, ibrl0);
            }
            else {
                dxwk0.c = v - 0x80000000;
            }
        }
        else {
            dxwk0 = new dxwk(this, ibrl0);
        }
        Object object0 = dxwk0.a;
        Object object1 = ibrx.a;
        switch(dxwk0.c) {
            case 0: {
                ibnx.b(object0);
                dxwk0.d = fsvb0;
                dxwk0.c = 1;
                object0 = this.b(dxwk0);
                return object0 == object1 ? object1 : DesugarCollections.unmodifiableMap(((dxwo)object0).c).get(dxwm.g(fsvb0));
            }
            case 1: {
                fsvb0 = dxwk0.d;
                ibnx.b(object0);
                return DesugarCollections.unmodifiableMap(((dxwo)object0).c).get(dxwm.g(fsvb0));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object d(ibrl ibrl0) {
        dxwl dxwl0;
        if((ibrl0 instanceof dxwl)) {
            dxwl0 = (dxwl)ibrl0;
            int v = dxwl0.c;
            if((v & 0x80000000) == 0) {
                dxwl0 = new dxwl(this, ibrl0);
            }
            else {
                dxwl0.c = v - 0x80000000;
            }
        }
        else {
            dxwl0 = new dxwl(this, ibrl0);
        }
        Object object0 = dxwl0.a;
        Object object1 = ibrx.a;
        switch(dxwl0.c) {
            case 0: {
                ibnx.b(object0);
                dxwl0.c = 1;
                object0 = this.b(dxwl0);
                return object0 == object1 ? object1 : Boolean.valueOf(((dxwo)object0).d);
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(((dxwo)object0).d);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object e(ibts ibts0, ibrl ibrl0) {
        Object object0 = ftqa.b(this.a, ibts0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object f(boolean z, ibrl ibrl0) {
        Object object0 = this.e(new dxwi(z), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public static final String g(fsvb fsvb0) {
        String s = Base64.encodeToString(fsvb0.toBytesArray(), 0);
        ibuq.e(s, "encodeToString(...)");
        return s;
    }
}

