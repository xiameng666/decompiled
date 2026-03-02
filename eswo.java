import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import com.google.android.gms.common.Feature;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import com.google.android.gms.tapandpay.hce.observemode.ClosedLoopCardsStateMonitor;
import java.util.ArrayList;
import java.util.Set;

public final class eswo {
    public static final eswo a;
    public static final bboh b;

    static {
        eswo.a = new eswo();
        eswo.b = bboh.b("TapAndPay", bbcu.aM);
    }

    public final Object a(ibrl ibrl0) {
        eswl eswl0;
        if((ibrl0 instanceof eswl)) {
            eswl0 = (eswl)ibrl0;
            int v = eswl0.c;
            if((v & 0x80000000) == 0) {
                eswl0 = new eswl(this, ibrl0);
            }
            else {
                eswl0.c = v - 0x80000000;
            }
        }
        else {
            eswl0 = new eswl(this, ibrl0);
        }
        Object object0 = eswl0.a;
        Object object1 = ibrx.a;
        switch(eswl0.c) {
            case 0: {
                ibnx.b(object0);
                bhgn bhgn0 = new bhgn(AppContextProvider.a());
                eswl0.c = 1;
                if(this.b(bhgn0, eswl0) != object1) {
                    goto label_19;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                azts azts0 = new azts(AppContextProvider.a(), null);
                eswl0.c = 2;
                return this.g(azts0, eswl0) != object1 ? ibom.a : object1;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(bhcg bhcg0, ibrl ibrl0) {
        Object object2;
        eswm eswm0;
        if((ibrl0 instanceof eswm)) {
            eswm0 = (eswm)ibrl0;
            int v = eswm0.c;
            if((v & 0x80000000) == 0) {
                eswm0 = new eswm(this, ibrl0);
            }
            else {
                eswm0.c = v - 0x80000000;
            }
        }
        else {
            eswm0 = new eswm(this, ibrl0);
        }
        Object object0 = eswm0.a;
        Object object1 = ibrx.a;
        switch(eswm0.c) {
            case 0: {
                ibnx.b(object0);
                if(!hysx.h()) {
                    return ibom.a;
                }
                azzc azzc0 = new azzc();
                azzc0.c = new Feature[]{bhcm.l};
                azzc0.a = new bhfv();
                azzc0.d = 34903;
                evql evql0 = ((azts)bhcg0).iG(azzc0.a());
                eswm0.c = 1;
                object2 = fsdk.a(evql0, eswm0);
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
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(eswo.b.j(), "Failed to check if dck is provisioned on device, assuming false", throwable0);
            object2 = Boolean.valueOf(false);
        }
        ((ggtj)eswo.b.h()).B("Updating tapandpay storage, hasDckKey = %s", ((Boolean)object2));
        eubv eubv0 = new eubv(AppContextProvider.a());
        ibuq.c(((Boolean)object2));
        cjpa cjpa0 = eubv0.c.c();
        cjpa0.e("has_dck_key", ((Boolean)object2).booleanValue());
        cjpd.g(cjpa0);
        return ibom.a;
    }

    public static final void c(Context context0) {
        ibuq.f(context0, "context");
        if(hysx.j()) {
            eswo.d(context0, false);
            return;
        }
        eswj eswj0 = new eswj(context0);
        if(eswj0.b()) {
            if(hysx.i() && hysx.g()) {
                ClosedLoopCardsStateMonitor.a.a().c();
            }
            else {
                ClosedLoopCardsStateMonitor.a.a().b();
            }
            icbb.b(iccl.b(cclw.a), null, null, new eswk(eswj0, context0, null), 3);
        }
    }

    public static final boolean d(Context context0, boolean z) {
        ibuq.f(context0, "context");
        if(!jys.d()) {
            return false;
        }
        NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context0);
        if(nfcAdapter0 != null && nfcAdapter0.isObserveModeSupported()) {
            if(z) {
                eswy.a.a().c(eswu.g);
            }
            return CardEmulation.getInstance(nfcAdapter0).setShouldDefaultToObserveModeForService(new ComponentName(context0, "com.google.android.gms.tapandpay.hce.service.TpHceService"), z) && nfcAdapter0.setObserveModeEnabled(z);
        }
        return false;
    }

    public static final void e(eswi eswi0) {
        ibuq.f(eswi0, "observeModeConfig");
        if(eswi0 == eswi.b) {
            esxa.a.a().d();
            return;
        }
        esxa.a.a().c();
        eswh.a.a().b();
    }

    public static final boolean f(esgi esgi0, CardInfo cardInfo0) {
        Integer integer0 = null;
        if(cardInfo0.D) {
            return false;
        }
        if(eset.a(esgi0) == 3) {
            InStoreCvmConfig inStoreCvmConfig0 = cardInfo0.t;
            if(inStoreCvmConfig0 != null) {
                integer0 = (int)inStoreCvmConfig0.d;
                return new eubv(AppContextProvider.a()).b() >= (integer0 == null ? 1 : ((int)integer0));
            }
        }
        else {
            InStoreCvmConfig inStoreCvmConfig1 = cardInfo0.t;
            if(inStoreCvmConfig1 != null) {
                integer0 = (int)inStoreCvmConfig1.c;
            }
        }
        return new eubv(AppContextProvider.a()).b() >= (integer0 == null ? 1 : ((int)integer0));
    }

    public final Object g(azts azts0, ibrl ibrl0) {
        Object object2;
        eswn eswn0;
        if((ibrl0 instanceof eswn)) {
            eswn0 = (eswn)ibrl0;
            int v = eswn0.c;
            if((v & 0x80000000) == 0) {
                eswn0 = new eswn(this, ibrl0);
            }
            else {
                eswn0.c = v - 0x80000000;
            }
        }
        else {
            eswn0 = new eswn(this, ibrl0);
        }
        Object object0 = eswn0.a;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(eswn0.c) {
            case 0: {
                ibnx.b(object0);
                if(!hysx.g()) {
                    return ibom.a;
                }
                AccountInfo accountInfo0 = eset.e(AppContextProvider.a());
                if(accountInfo0 == null) {
                    return ibom.a;
                }
                evql evql0 = azts0.aw(new Account(accountInfo0.b, "com.google"));
                eswn0.c = 1;
                object2 = fsdk.a(evql0, eswn0);
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
        fsym fsym0 = null;
        if(ibnw.b(object2)) {
            if((object2 instanceof ibnv)) {
                object2 = null;
            }
            if(((ProtoSafeParcelable)object2) == null) {
                return ibom.a;
            }
            byte[] arr_b = ((ProtoSafeParcelable)object2).a;
            if(arr_b == null) {
                return ibom.a;
            }
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fsym.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                fsym0 = (fsym)hftv0;
            }
            catch(hfur unused_ex) {
            }
            hfuo hfuo0 = hysx.a.f().h().b;
            ibuq.e(hfuo0, "getElementList(...)");
            Set set0 = ibpo.ay(hfuo0);
            if(fsym0 != null) {
                hfuo hfuo1 = fsym0.b;
                if(hfuo1 != null) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object3: hfuo1) {
                        gtkg gtkg0 = ((fsyk)object3).e;
                        if(gtkg0 == null) {
                            gtkg0 = gtkg.a;
                        }
                        if((gtqj.b(gtkg0.g) == null ? gtqj.i : gtqj.b(gtkg0.g)) == gtqj.b) {
                            arrayList0.add(object3);
                        }
                    }
                    ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
                    for(Object object4: arrayList0) {
                        ibuq.c(((fsyk)object4));
                        gtkg gtkg1 = ((fsyk)object4).e;
                        if(gtkg1 == null) {
                            gtkg1 = gtkg.a;
                        }
                        long v1 = gtkg1.s;
                        gtkg gtkg2 = ((fsyk)object4).e;
                        if(gtkg2 == null) {
                            gtkg2 = gtkg.a;
                        }
                        arrayList1.add(v1 + ":" + gtkg2.r);
                    }
                    if(!arrayList1.isEmpty()) {
                        for(Object object5: arrayList1) {
                            if(!set0.contains(((String)object5))) {
                                continue;
                            }
                            goto label_74;
                        }
                    }
                }
            }
        }
        z = false;
    label_74:
        cjpa cjpa0 = new eubv(AppContextProvider.a()).c.c();
        cjpa0.e("has_observe_mode_incompatible_closed_loop_cards", z);
        cjpd.g(cjpa0);
        return ibom.a;
    }
}

