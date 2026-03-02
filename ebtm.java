import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.FetchMode;
import com.google.android.gms.pay.GetSettingsRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class ebtm {
    public static final bboh a;
    public static final AtomicReference b;
    public final Context c;
    public final AccountInfo d;
    public final long e;
    public final String f;
    public ibnf g;
    public fhwb h;
    public ibrt i;
    public ibrt j;
    public gmcg k;
    public Account l;
    public dzah m;
    public bbng n;
    public String o;
    public Map p;
    public final etgl q;
    public dyzq r;
    public azts s;
    private static final SecureRandom t;

    static {
        ebtm.a = bboh.b("Pay", bbcu.cZ);
        ebtm.t = new SecureRandom();
        ebtm.b = new AtomicReference(null);
    }

    public ebtm(Context context0, etgl etgl0, AccountInfo accountInfo0, long v, String s) {
        ibuq.f(context0, "context");
        ibuq.f(etgl0, "firstPartyTapAndPayClient");
        ibuq.f(s, "callingPackage");
        super();
        this.c = context0;
        this.q = etgl0;
        this.d = accountInfo0;
        this.e = v;
        this.f = s;
        boolean z = ((Boolean)accountInfo0.b().f(Boolean.valueOf(false))).booleanValue();
        dola dola0 = new dola(accountInfo0.b, accountInfo0.a, z);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebkw(dola0, domv0).inject(this);
    }

    public final Account a() {
        Account account0 = this.l;
        if(account0 != null) {
            return account0;
        }
        ibuq.j("account");
        return null;
    }

    public final fhwb b() {
        fhwb fhwb0 = this.h;
        if(fhwb0 != null) {
            return fhwb0;
        }
        ibuq.j("semanticLogger");
        return null;
    }

    public final gmcg c() {
        gmcg gmcg0 = this.k;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("secureElementExecutor");
        return null;
    }

    public final Object d(dygm dygm0, ibrl ibrl0) {
        ebta ebta0;
        if((ibrl0 instanceof ebta)) {
            ebta0 = (ebta)ibrl0;
            int v = ebta0.c;
            if((v & 0x80000000) == 0) {
                ebta0 = new ebta(this, ibrl0);
            }
            else {
                ebta0.c = v - 0x80000000;
            }
        }
        else {
            ebta0 = new ebta(this, ibrl0);
        }
        Object object0 = ebta0.a;
        Object object1 = ibrx.a;
        switch(ebta0.c) {
            case 0: {
                ibnx.b(object0);
                ebte ebte0 = new ebte(this, dygm0, null);
                ebta0.c = 1;
                object0 = iccl.a(ebte0, ebta0);
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
        ibuq.e(object0, "coroutineScope(...)");
        return object0;
    }

    public final Object e(long v, ibrl ibrl0) {
        ebtf ebtf0;
        if((ibrl0 instanceof ebtf)) {
            ebtf0 = (ebtf)ibrl0;
            int v1 = ebtf0.d;
            if((v1 & 0x80000000) == 0) {
                ebtf0 = new ebtf(this, ibrl0);
            }
            else {
                ebtf0.d = v1 - 0x80000000;
            }
        }
        else {
            ebtf0 = new ebtf(this, ibrl0);
        }
        Object object0 = ebtf0.b;
        Object object1 = ibrx.a;
        boolean z = false;
        switch(ebtf0.d) {
            case 0: {
                ibnx.b(object0);
                if(hwrz.d() <= 0L) {
                    return Boolean.valueOf(false);
                }
                iccs iccs0 = (iccs)ebtm.b.get();
                if(iccs0 != null) {
                    ebtf0.a = v;
                    ebtf0.d = 1;
                    object0 = iccs0.oM() ? iccs0.n(ebtf0) : null;
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_26;
                }
                break;
            }
            case 1: {
                v = ebtf0.a;
                ibnx.b(object0);
            label_26:
                if(((ebuy)object0) != null) {
                    long v2 = hwrz.d();
                    if(v - ((ebuy)object0).a > v2) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Boolean.valueOf(false);
    }

    public final Object f(gjma gjma0, ibrl ibrl0) {
        ebtg ebtg0;
        if((ibrl0 instanceof ebtg)) {
            ebtg0 = (ebtg)ibrl0;
            int v = ebtg0.c;
            if((v & 0x80000000) == 0) {
                ebtg0 = new ebtg(this, ibrl0);
            }
            else {
                ebtg0.c = v - 0x80000000;
            }
        }
        else {
            ebtg0 = new ebtg(this, ibrl0);
        }
        Object object0 = ebtg0.a;
        Object object1 = ibrx.a;
        switch(ebtg0.c) {
            case 0: {
                ibnx.b(object0);
                if(hwrz.b() > 0L) {
                    long v1 = ebtm.t.nextLong() % hwrz.b();
                    ebtg0.d = gjma0;
                    ebtg0.c = 1;
                    if(iccv.c(v1, ebtg0) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                gjma0 = ebtg0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        fhwb fhwb0 = this.b();
        fhvz fhvz0 = fhwa.a(0x3511D);
        fhvz0.c(fhwp.b(this.d.b));
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        gjca0.i();
        gjca0.h(gjma0);
        gjce gjce0 = gjca0.a();
        fhvz0.b(new fhvu(gjdq.a, gjce0));
        fhwb0.a(fhvz0.a());
        return ibom.a;
    }

    public final Object g(ibrl ibrl0) {
        Object object2;
        ebtj ebtj0;
        if((ibrl0 instanceof ebtj)) {
            ebtj0 = (ebtj)ibrl0;
            int v = ebtj0.c;
            if((v & 0x80000000) == 0) {
                ebtj0 = new ebtj(this, ibrl0);
            }
            else {
                ebtj0.c = v - 0x80000000;
            }
        }
        else {
            ebtj0 = new ebtj(this, ibrl0);
        }
        Object object0 = ebtj0.a;
        Object object1 = ibrx.a;
        switch(ebtj0.c) {
            case 0: {
                ibnx.b(object0);
                azts azts0 = this.s;
                if(azts0 == null) {
                    ibuq.j("firstPartyPayClient");
                    azts0 = null;
                }
                GetSettingsRequest getSettingsRequest0 = new GetSettingsRequest();
                getSettingsRequest0.a = this.a();
                FetchMode fetchMode0 = new FetchMode();
                fetchMode0.a = 1;
                getSettingsRequest0.c = fetchMode0;
                ftgo ftgo0 = ftgn.a(((ftgl)((ProtoLiteMessage)ftgm.b).v_newBuilder()));
                ftgo0.c();
                ftgo0.b(ftgk.r);
                getSettingsRequest0.b = ftqe.a(((MessageLite)ftgo0.a()));
                evql evql0 = azts0.aO(getSettingsRequest0);
                ebtj0.c = 1;
                object2 = fsdk.a(evql0, ebtj0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(ibnw.b(object2)) {
            try {
                ibuq.c(((ProtoSafeParcelable)object2));
                ibuq.e(ftgg.a, "getDefaultInstance(...)");
                object2 = ftgf.b(((ftgg)ftqe.c(((ProtoSafeParcelable)object2), ((MessageLite)ftgg.a))).t);
                if(object2 == null) {
                    return (ftgf.e instanceof ibnv) ? ftgf.a : ftgf.e;
                }
            }
            catch(Throwable throwable0) {
                object2 = ibnx.a(throwable0);
            }
        }
        return (object2 instanceof ibnv) ? ftgf.a : object2;
    }

    public final Object h(dygm dygm0, dyna dyna0, dmew dmew0, ibrl ibrl0) {
        ebtk ebtk0;
        if((ibrl0 instanceof ebtk)) {
            ebtk0 = (ebtk)ibrl0;
            int v = ebtk0.c;
            if((v & 0x80000000) == 0) {
                ebtk0 = new ebtk(this, ibrl0);
            }
            else {
                ebtk0.c = v - 0x80000000;
            }
        }
        else {
            ebtk0 = new ebtk(this, ibrl0);
        }
        Object object0 = ebtk0.a;
        Object object1 = ibrx.a;
        switch(ebtk0.c) {
            case 0: {
                ibnx.b(object0);
                ebtl ebtl0 = new ebtl(dyna0, this, dygm0, dmew0, null);
                ebtk0.c = 1;
                object0 = iccl.a(ebtl0, ebtk0);
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
        ibuq.e(object0, "coroutineScope(...)");
        return object0;
    }

    public final String i() {
        String s = this.o;
        if(s != null) {
            return s;
        }
        ibuq.j("env");
        return null;
    }

    public final ibrt j() {
        ibrt ibrt0 = this.i;
        if(ibrt0 != null) {
            return ibrt0;
        }
        ibuq.j("ioCoroutineContext");
        return null;
    }

    public final void k(dygm dygm0, dyna dyna0, String s) {
        dymg dymg0;
        if(!dylv.c.contains(dyna0) && !dylv.b.contains(dyna0)) {
            return;
        }
        try {
            dymi dymi0 = dymh.a(((ProtoLiteMessage)dymg.a).v_newBuilder());
            String s1 = dygm0.h;
            ibuq.e(s1, "getCurrencyCode(...)");
            dymi0.b(s1);
            dymi0.c(new BigDecimal(dygm0.g).scaleByPowerOfTen(6).longValueExact());
            dymg0 = dymi0.a();
        }
        catch(NumberFormatException numberFormatException0) {
            ((ggtj)((ggtj)ebtm.a.i()).s(numberFormatException0)).B("newBalance %s is in the wrong format", dygm0.g);
            return;
        }
        catch(ArithmeticException arithmeticException0) {
            ((ggtj)((ggtj)ebtm.a.i()).s(arithmeticException0)).B("newBalance %s is in the wrong format", dygm0.g);
            return;
        }
        String s2 = this.i();
        new dypo(this.c, this.d.a, s2).r(dyna0, s, dymg0);
    }

    public final Object l(ibrl ibrl0) {
        ebsx ebsx0;
        if((ibrl0 instanceof ebsx)) {
            ebsx0 = (ebsx)ibrl0;
            int v = ebsx0.c;
            if((v & 0x80000000) == 0) {
                ebsx0 = new ebsx(this, ibrl0);
            }
            else {
                ebsx0.c = v - 0x80000000;
            }
        }
        else {
            ebsx0 = new ebsx(this, ibrl0);
        }
        Object object0 = ebsx0.a;
        Object object1 = ibrx.a;
        switch(ebsx0.c) {
            case 0: {
                ibnx.b(object0);
                ebsz ebsz0 = new ebsz(this, null);
                ebsx0.c = 1;
                object0 = iccl.a(ebsz0, ebsx0);
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
        ibuq.e(object0, "coroutineScope(...)");
        return object0;
    }

    public final void m() {
        if(this.n != null) {
            return;
        }
        ibuq.j("clock");
    }
}

