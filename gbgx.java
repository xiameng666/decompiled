import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class gbgx extends gaok {
    public gbgx(gamx gamx0) {
        super(gamx0);
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        ibuq.f(gano0, "actionRequest");
        WidgetConfig widgetConfig0 = gano0.f();
        ibuq.f(gano0, "<this>");
        MessageLite hfvm0 = gawi.i(gano0.a, "createRequestContextActionData", ((MessageLite)fbbw.a));
        ibuq.e(hfvm0, "requireTrustedProto(...)");
        fbbw fbbw0 = (fbbw)hfvm0;
        ByteString hfsf0 = fbbw0.e;
        ibuq.e(hfsf0, "getSessionData(...)");
        hfuo hfuo0 = fbbw0.j;
        ibuq.e(hfuo0, "getAccountNameList(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
        for(Object object0: hfuo0) {
            arrayList0.add(new Account(((String)object0), "com.google"));
        }
        Account[] arr_account = (Account[])arrayList0.toArray(new Account[0]);
        Intent intent0 = ganp.e(0);
        gaxl.a();
        byte[] arr_b = null;
        if(hzks.d()) {
            try {
                gawi.q(intent0, "requestContextActionResponse", ((MessageLite)icbb.c(new gbgw(this, fbbw0, null))));
                return new ganp(intent0);
            }
            catch(icfl unused_ex) {
                return new ganp(ganp.d(4));
            }
        }
        switch((fbbv.b(fbbw0.f) == null ? fbbv.a : fbbv.b(fbbw0.f)).ordinal()) {
            case 1: {
                gawi.q(intent0, "requestContextActionResponse", this.b(widgetConfig0, hfsf0, fbbw0));
                return new ganp(intent0);
            }
            case 2: {
                ibuq.f(hfsf0, "sessionData");
                ibuq.f(fbbw0, "actionData");
                ibuq.f(arr_account, "accounts");
                Context context0 = this.d().a;
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)hckk.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                    hfwc0.g(hftv0);
                }
                catch(hfur hfur0) {
                    if(hfur0.b) {
                        hfur0 = new hfur(hfur0);
                    }
                    hfur0.a = hftv0;
                    throw hfur0;
                }
                catch(hfwr hfwr0) {
                    hfur hfur1 = hfwr0.a();
                    hfur1.a = hftv0;
                    throw hfur1;
                }
                catch(IOException iOException0) {
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur2 = new hfur(iOException0);
                    hfur2.a = hftv0;
                    throw hfur2;
                }
                catch(RuntimeException runtimeException0) {
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                }
                try {
                    hfsl0.z(0);
                }
                catch(hfur hfur3) {
                    hfur3.a = hftv0;
                    throw hfur3;
                }
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                Long long0 = fbbw0.c == 8 ? ((Long)fbbw0.d) : null;
                if((fbbw0.b & 0x40) != 0) {
                    arr_b = fbbw0.l.toByteArray();
                }
                hckh hckh0 = gbhe.a(context0, ((hckk)hftv0), long0, arr_b, widgetConfig0.d, widgetConfig0.l, fbbw0.i, fbbw0.g, widgetConfig0.f(), fbbw0.h, widgetConfig0.a, arr_account, widgetConfig0.b());
                ibuq.e(hckh0, "createNetworkRequestContext(...)");
                gawi.q(intent0, "requestContextActionResponse", ((MessageLite)hckh0));
                return new ganp(intent0);
            }
            default: {
                fbbv fbbv0 = fbbv.b(fbbw0.f) == null ? fbbv.a : fbbv.b(fbbw0.f);
                Objects.toString(fbbv0);
                throw new UnsupportedOperationException("Create request context action type not supported in gms Core: " + fbbv0);
            }
        }
    }

    public MessageLite b(WidgetConfig widgetConfig0, ByteString hfsf0, fbbw fbbw0) {
        ibuq.f(hfsf0, "sessionData");
        ibuq.f(fbbw0, "actionData");
        throw new UnsupportedOperationException("O1 request context action creation not supported.");
    }

    public final Object g(gamx gamx0, fbbw fbbw0, gbhh gbhh0, ibrl ibrl0) {
        List list3;
        List list2;
        Object object8;
        Object object4;
        String s;
        gbgt gbgt0;
        gamx gamx1 = gamx0;
        Object object0 = gbhh0;
        if((ibrl0 instanceof gbgt)) {
            gbgt0 = (gbgt)ibrl0;
            int v = gbgt0.f;
            if((v & 0x80000000) == 0) {
                gbgt0 = new gbgt(this, ibrl0);
            }
            else {
                gbgt0.f = v - 0x80000000;
            }
        }
        else {
            gbgt0 = new gbgt(this, ibrl0);
        }
        Object object1 = gbgt0.d;
        Object object2 = ibrx.a;
        switch(gbgt0.f) {
            case 0: {
                ibnx.b(object1);
                ibuq.f(gamx1, "context");
                ibuq.f(fbbw0, "actionData");
                WidgetConfig widgetConfig0 = gamx1.d;
                Context context0 = gamx1.a;
                int v1 = 9;
                gbhm[] arr_gbhm = new gbhm[9];
                fbov fbov0 = fbbw0.k ? gamx1.f : null;
                bmei bmei0 = new bmei(context0);
                int v2 = widgetConfig0.b;
                Account account0 = widgetConfig0.a;
                ByteString hfsf0 = fbbw0.l;
                ibuq.e(hfsf0, "getProductAuthToken(...)");
                arr_gbhm[0] = new gbhk(fbov0, bmei0, v2, account0, hfsf0);
                arr_gbhm[1] = new gbhr(context0, widgetConfig0.f());
                arr_gbhm[2] = new gbhu(context0);
                arr_gbhm[3] = new gbhz(context0, widgetConfig0.l);
                boolean z = fbbw0.g;
                ByteString hfsf1 = fbbw0.e;
                ibuq.e(hfsf1, "getSessionData(...)");
                Account[] arr_account = AccountManager.get(context0).getAccountsByType("com.google");
                ibuq.e(arr_account, "getAccountsByType(...)");
                List list0 = ibpg.N(arr_account);
                int v3 = fbbw0.c;
                if(v3 == 9) {
                    s = (String)fbbw0.d;
                }
                else {
                    s = "";
                    v1 = v3;
                }
                arr_gbhm[4] = new gbib(z, hfsf1, widgetConfig0, list0, s, (v1 == 8 ? ((Long)fbbw0.d) : null));
                arr_gbhm[5] = new gbie(gamx1.e);
                gaym gaym0 = gamx1.b;
                arr_gbhm[6] = new gbil(context0, gaym0, fbbw0.m);
                arr_gbhm[7] = new gbir(context0, fbbw0.h, fbbw0.n);
                arr_gbhm[8] = new gbiv(context0, widgetConfig0.G, widgetConfig0.b());
                List list1 = ibpo.g(arr_gbhm);
                ArrayList arrayList0 = new ArrayList(ibpo.q(list1, 10));
                for(Object object3: list1) {
                    arrayList0.add(new Integer(((gbhm)object3).a()));
                }
                gbix.a(gaym0, arrayList0, gkwx.x);
                object4 = new ArrayList(ibpo.q(list1, 10));
                for(Object object5: list1) {
                    ((Collection)object4).add(new gbgy(((gbhm)object5), gaym0));
                }
                ArrayList arrayList1 = new ArrayList(ibpo.q(((Iterable)object4), 10));
                for(Object object6: ((Iterable)object4)) {
                    arrayList1.add(icbb.a(iccl.b(cclw.a), null, null, new gbgv(((gbgy)object6), null), 3));
                }
                gaxl.a();
                if(gaxm.j() > 0L) {
                    gaxl.a();
                    long v4 = gaxm.j();
                    gbgu gbgu0 = new gbgu(arrayList1, null);
                    gbgt0.g = gamx1;
                    gbgt0.a = object0;
                    gbgt0.b = arrayList0;
                    gbgt0.c = object4;
                    gbgt0.f = 1;
                    Object object7 = icfo.a(v4, gbgu0, gbgt0);
                    if(object7 != object2) {
                        object8 = arrayList0;
                        list2 = (List)object7;
                        break;
                    }
                }
                else {
                    gbgt0.g = gamx1;
                    gbgt0.a = object0;
                    gbgt0.b = arrayList0;
                    gbgt0.c = object4;
                    gbgt0.f = 2;
                    Object object9 = icay.a(arrayList1, gbgt0);
                    if(object9 != object2) {
                        object8 = arrayList0;
                        list3 = (List)object9;
                        break;
                    }
                }
                return object2;
            }
            case 1: {
                Object object10 = gbgt0.c;
                object8 = gbgt0.b;
                object0 = gbgt0.a;
                gamx gamx2 = gbgt0.g;
                ibnx.b(object1);
                object4 = object10;
                gamx1 = gamx2;
                list2 = (List)object1;
                break;
            }
            case 2: {
                Object object11 = gbgt0.c;
                object8 = gbgt0.b;
                object0 = gbgt0.a;
                gamx gamx3 = gbgt0.g;
                ibnx.b(object1);
                object4 = object11;
                gamx1 = gamx3;
                list3 = (List)object1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        for(Object object12: ((List)object4)) {
            ibuq.f(object0, "requestContextBuilder");
            Object object13 = ((gbgy)object12).a();
            ((gbgy)object12).a.d(object0, object13);
        }
        ibuq.f(object8, "builderTypes");
        gbix.a(gamx1.b, ((List)object8), gkwx.z);
        return ((gbhh)object0).b();
    }
}

