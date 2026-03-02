import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GetValuablesRequest;
import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SelectPayGlobalActionCardRequest;
import com.google.android.gms.pay.SortItem;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;
import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class espb {
    public static final bboh a;
    public final Context b;
    public final dmkl c;
    final eubv d;
    private final boolean e;
    private final boolean f;

    static {
        espb.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public espb(Context context0) {
        boolean z = dlgw.a(context0);
        super();
        this.b = context0;
        this.e = z;
        this.d = new eubv(context0);
        this.f = hysb.d() && esjw.b(context0).k();
        this.c = new dmkl(context0);
    }

    public final Status a(esgi esgi0, SelectGlobalActionCardRequest selectGlobalActionCardRequest0) {
        etrj etrj0;
        Integer integer0;
        CardInfo cardInfo0;
        boolean z = false;
        if(!this.t()) {
            return Status.b;
        }
        if(esgi0 != null && this.e) {
            SelectPayGlobalActionCardRequest selectPayGlobalActionCardRequest0 = new SelectPayGlobalActionCardRequest();
            selectPayGlobalActionCardRequest0.a = new Account(esgi0.b, "com.google");
            selectPayGlobalActionCardRequest0.b = selectGlobalActionCardRequest0.a;
            selectPayGlobalActionCardRequest0.c = selectGlobalActionCardRequest0.b;
            selectPayGlobalActionCardRequest0.d = selectGlobalActionCardRequest0.c;
            azts azts0 = this.l();
            azzc azzc0 = new azzc();
            azzc0.a = new dopz(azts0, selectPayGlobalActionCardRequest0);
            azzc0.c = new Feature[]{dlde.m};
            azzc0.b = false;
            azzc0.d = 7202;
            azts0.jn(azzc0.a());
        }
        int v = 4;
        int v1 = selectGlobalActionCardRequest0.c;
        String s = selectGlobalActionCardRequest0.b;
        int v2 = selectGlobalActionCardRequest0.a;
        if(v1 > 0 && s != null) {
            switch(v2) {
                case 0: {
                    break;
                }
                case 2: {
                    if(esgi0 == null) {
                        ((ggtj)espb.a.i()).x("handleSelectEvent: requestContext is null");
                        return Status.d;
                    }
                    etrk etrk1 = new etrk(esgi0);
                    cardInfo0 = etrk1.c(s);
                    if(cardInfo0 == null) {
                        ((ggtj)espb.a.i()).B("handleSelectEvent: card %s not found", s);
                        return Status.d;
                    }
                    etrk1.w(cardInfo0.a, ((long)v1), 200);
                label_64:
                    switch(v2) {
                        case 2: {
                            if(cardInfo0 != null && cardInfo0.g.b == 5) {
                                v2 = 2;
                                goto label_73;
                            }
                            else {
                                v2 = 2;
                            label_70:
                                if(!esvr.b(SystemClock.elapsedRealtime(), v1)) {
                                    this.q(esgi0).w();
                                }
                            }
                            break;
                        }
                        case 4: {
                        label_73:
                            if(esvr.c(SystemClock.elapsedRealtime())) {
                                this.q(esgi0).x();
                            }
                            break;
                        }
                        default: {
                            goto label_70;
                        }
                    }
                    etmv etmv0 = this.q(esgi0);
                    ProtoLiteBuilder hftp0 = etmv0.am(gjsj.bL, cardInfo0);
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjti.a).v_newBuilder();
                    if(v2 == 1) {
                        v = 2;
                    }
                    else {
                        switch(v2) {
                            case 2: {
                                v = 3;
                                break;
                            }
                            case 3: {
                                break;
                            }
                            case 4: {
                                v = 5;
                                break;
                            }
                            default: {
                                v = 1;
                            }
                        }
                    }
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gjti)hftp1.b_message).c = v - 1;
                    ((gjti)hftp1.b_message).b |= 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjzl gjzl0 = (gjzl)hftp0.b_message;
                    gjti gjti0 = (gjti)hftp1.N_build();
                    gjti0.getClass();
                    gjzl0.L = gjti0;
                    gjzl0.c |= 0x200;
                    etmv0.l(((gjzl)hftp0.N_build()));
                    return Status.b;
                }
                default: {
                    if(esgi0 != null && v2 == 4) {
                        long v3 = hyrj.a.b().a();
                        etrk etrk0 = new etrk(esgi0);
                        int v4 = Long.compare(v3, 0L);
                        if(v4 >= 0) {
                            z = true;
                        }
                        batl.l(z);
                        if(v4 == 0) {
                            etrk0.y(200);
                        }
                        else {
                            long v5 = SystemClock.elapsedRealtime();
                            SQLiteDatabase sQLiteDatabase0 = etrk.a(etrk0.d.d);
                            sQLiteDatabase0.beginTransaction();
                            try {
                                sQLiteDatabase0.delete("PaymentCardOverrides", "priority_override_realtime_max <= ?", new String[]{String.valueOf(v5)});
                                integer0 = (int)200;
                                sQLiteDatabase0.execSQL("UPDATE PaymentCardOverrides SET priority_override_realtime_min = ?, priority_override_realtime_max = ? WHERE account_id = ? AND environment = ? AND priority = ?", new Object[]{v5, ((long)(v5 + v3)), etrk0.d.a, etrk0.d.c, integer0});
                                etrj0 = etrk0.g(sQLiteDatabase0, v5);
                                sQLiteDatabase0.setTransactionSuccessful();
                            }
                            finally {
                                sQLiteDatabase0.endTransaction();
                            }
                            ((ggtj)((ggtj)etrk.a.h()).ar(0x3F2A)).X("updateCardOverrideDuration: priority %s timeout %s selected %s", integer0, Long.valueOf(v3 / 1000L), etrj0.a);
                            esyk esyk0 = etrk.e();
                            batl.s(etrj0.a);
                            gged_interceptors gged0 = gged_interceptors.l(etrj0.a);
                            esyk0.j(etrk0.d.d, gged0, etrj0.b, "updateDuration");
                        }
                        v2 = 4;
                    }
                    else if(esgi0 != null) {
                        new etrk(esgi0).y(200);
                    }
                    cardInfo0 = null;
                    goto label_64;
                }
            }
        }
        ((ggtj)espb.a.i()).x("handleSelectEvent: request invalid");
        return new Status(10);
    }

    public final String b() {
        return "Unable to load your payment info";
    }

    public static void c(Context context0, String s) {
        try {
            bbmq.K(new ComponentName(context0, s), 2);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.e(espb.a.j(), "disableService failed for %s", s, illegalArgumentException0);
        }
    }

    public static void d(Context context0, String s) {
        try {
            bbmq.K(new ComponentName(context0, s), 1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.e(espb.a.j(), "enableService failed for %s", s, illegalArgumentException0);
        }
    }

    // Detected as a lambda impl.
    public final void e() {
        hyuw.c();
        if(hyuw.a.b().c()) {
            ((ggtj)espb.a.h()).x("Sending QUICK_ACCESS_WALLET_STATE_CHANGED broadcast to wallet app.");
            Intent intent0 = new Intent().setAction("com.google.android.gms.tapandpay.QUICK_ACCESS_WALLET_STATE_CHANGED");
            this.b.sendBroadcast(intent0);
        }
    }

    public final void f() {
        boolean z = this.h();
        if(z) {
            evql evql0 = this.l().aI();
            evql0.b(new esox(this));
            evql0.A(new esoy(this));
            evql0.z((/* MISSING LAMBDA PARAMETER */) -> {
                hyuw.c();
                if(hyuw.a.b().c()) {
                    ((ggtj)espb.a.h()).x("Sending QUICK_ACCESS_WALLET_STATE_CHANGED broadcast to wallet app.");
                    Intent intent0 = new Intent().setAction("com.google.android.gms.tapandpay.QUICK_ACCESS_WALLET_STATE_CHANGED");
                    this.b.sendBroadcast(intent0);
                }
            });
        }
        else {
            espb.c(this.b, "com.google.android.gms.tapandpay.globalactions.WalletQuickAccessWalletService");
            espb.c(this.b, "com.google.android.gms.tapandpay.globalactions.QuickAccessWalletService");
            this.e();
        }
        boolean z1 = cjpd.i(this.d.c, "wallet_service_enabled", false);
        cjpa cjpa0 = this.d.c.c();
        cjpa0.e("wallet_service_enabled", z);
        cjpd.f(cjpa0);
        if(z1 != z) {
            try {
                etmv etmv0 = this.q(esgj.g(this.b, null));
                int v = this.k();
                ProtoLiteBuilder hftp0 = etmv0.al(gjsj.bI);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjtg.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gjtg)hftp1.b_message).d = v - 1;
                ((gjtg)hftp1.b_message).b |= 2;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjzl gjzl0 = (gjzl)hftp0.b_message;
                gjtg gjtg0 = (gjtg)hftp1.N_build();
                gjtg0.getClass();
                gjzl0.B = gjtg0;
                gjzl0.b |= 0x10000000;
                etmv0.l(((gjzl)hftp0.N_build()));
            }
            catch(eshj | cjuh exception0) {
                a.ae(espb.a.j(), "logFeatureAvailability error", exception0);
            }
        }
    }

    public final boolean g() {
        return hyrj.a.b().i() || this.f;
    }

    public final boolean h() {
        return this.j() == 11;
    }

    // This method was un-flattened
    public final GetGlobalActionCardsResponse i(esgi esgi0, int v, int v1, int v2, int v3, boolean z) {
        int v37;
        Bitmap bitmap2;
        boolean z2;
        String s14;
        String s10;
        int v32;
        int v33;
        int v31;
        Bitmap bitmap0;
        File file1;
        Account account1;
        String s7;
        Uri uri1;
        int v29;
        int v27;
        GetAllCardsResponse getAllCardsResponse2;
        int v21;
        Context context2;
        ggek ggek1;
        int v20;
        List list1;
        gged_interceptors gged0;
        int v8;
        boolean z1;
        int v7;
        int v4;
        espb espb0 = this;
        gftb.b(v > 0 && v1 > 0 && v3 > 0, "invalid request");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjtm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjtm gjtm0 = (gjtm)hftp0.b_message;
        gjtm0.b |= 0x20;
        gjtm0.g = (int)z;
        if(esgi0 == null) {
            GlobalActionCard[] arr_globalActionCard = ((int)z) ? new GlobalActionCard[]{espb0.p(v, v1, false, null)} : new GlobalActionCard[0];
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjtm)hftp0.b_message).i = 6;
            ((gjtm)hftp0.b_message).b |= 0x80;
            espb0.u(null, ((gjtm)hftp0.N_build()), v3 == 1);
            GetGlobalActionCardsResponse getGlobalActionCardsResponse0 = new GetGlobalActionCardsResponse();
            getGlobalActionCardsResponse0.a = arr_globalActionCard;
            return getGlobalActionCardsResponse0;
        }
        Context context0 = espb0.b;
        NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context0);
        if(nfcAdapter0 == null) {
            v4 = 2;
        }
        else {
            v4 = nfcAdapter0.isEnabled() ? 4 : 3;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjtm)hftp0.b_message).k = v4 - 1;
        ((gjtm)hftp0.b_message).b |= 0x200;
        int v5 = new etmk(context0).d();
        int v6 = v5 ^ 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjtm)hftp0.b_message).l = (v5 == 0 ? 2 : 3) - 1;
        ((gjtm)hftp0.b_message).b |= 0x400;
        ggek ggek0 = new ggek();
        GetAllCardsResponse getAllCardsResponse0 = new etrk(esgi0).d();
        if(hysb.d() && esjw.b(context0).k()) {
            ggdy ggdy0 = new ggdy();
            v7 = v5;
            CardInfo[] arr_cardInfo = getAllCardsResponse0.a;
            if(arr_cardInfo != null) {
                ggdy0.j(arr_cardInfo);
            }
            GetAllCardsResponse getAllCardsResponse1 = eskb.f(esgi0).h();
            z1 = v3 == 1;
            CardInfo[] arr_cardInfo1 = getAllCardsResponse1.a;
            if(arr_cardInfo1 != null) {
                ggdy0.j(arr_cardInfo1);
            }
            v8 = v4 - 1;
            getAllCardsResponse0 = new GetAllCardsResponse(((CardInfo[])ggdy0.h().toArray(new CardInfo[0])), getAllCardsResponse0.b, getAllCardsResponse0.c, getAllCardsResponse0.d, getAllCardsResponse1.e);
        }
        else {
            v7 = v5;
            z1 = v3 == 1;
            v8 = v4 - 1;
        }
        if(z1 && getAllCardsResponse0.a != null && getAllCardsResponse0.a.length != 0) {
            gged0 = ggna.a;
        }
        else {
            long v9 = SystemClock.elapsedRealtime();
            gged_interceptors gged1 = new etse(esgi0, 5).f(v2, v4, ((boolean)v6), v3);
            int v10 = Math.max(0, v3 - gged1.size());
            gged_interceptors gged2 = new etse(esgi0, 7).f(v2, v4, ((boolean)v6), v10);
            int v11 = Math.max(0, v10 - gged2.size());
            gged_interceptors gged3 = new etse(esgi0, 6).f(v2, v4, ((boolean)v6), v11);
            gged_interceptors gged4 = new etse(esgi0, 8).f(v2, v4, ((boolean)v6), Math.max(0, v11 - gged3.size()));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjtm)hftp0.b_message).i = 7;
            ((gjtm)hftp0.b_message).b |= 0x80;
            long v12 = SystemClock.elapsedRealtime() - v9;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjtm gjtm1 = (gjtm)hftp0.b_message;
            gjtm1.b |= 0x100;
            gjtm1.j = v12;
            int v13 = gged1.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjtm gjtm2 = (gjtm)hftp0.b_message;
            gjtm2.b |= 4;
            gjtm2.d = v13;
            int v14 = gged2.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjtm gjtm3 = (gjtm)hftp0.b_message;
            gjtm3.b |= 8;
            gjtm3.e = v14;
            int v15 = gged3.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjtm gjtm4 = (gjtm)hftp0.b_message;
            gjtm4.b |= 16;
            gjtm4.f = v15;
            int v16 = gged4.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjtm gjtm5 = (gjtm)hftp0.b_message;
            gjtm5.b |= 0x40;
            gjtm5.h = v16;
            ggdy ggdy1 = new ggdy();
            ggdy1.k(gged1);
            ggdy1.k(gged2);
            ggdy1.k(gged3);
            ggdy1.k(gged4);
            gged0 = ggdy1.h();
        }
        etse etse0 = new etse(esgi0, 2);
        List list0 = etse0.d();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v17 = 0;
        while(v17 < list0.size()) {
            SortItem sortItem0 = new SortItem();
            sortItem0.b = (long)v17;
            sortItem0.a = (String)list0.get(v17);
            arrayList0.add(sortItem0);
            String s = etse0.c(((String)list0.get(v17)), ((boolean)v6));
            ggek0.i(((String)list0.get(v17)), gfta.b(s));
            ++v17;
            context0 = context0;
        }
        Context context1 = context0;
        int v18 = ((ggna)gged0).c;
        int v19 = Math.max(0, v3 - v18 - ((int)z));
        CardInfo[] arr_cardInfo2 = getAllCardsResponse0.a;
        if(arr_cardInfo2 == null) {
            list1 = ggna.a;
            v20 = v18;
            ggek1 = ggek0;
            context2 = context1;
            v21 = v6;
        }
        else {
            ArrayList arrayList1 = new ArrayList();
            int v22 = 0;
            while(v22 < arr_cardInfo2.length) {
                CardInfo cardInfo0 = arr_cardInfo2[v22];
                if(!cardInfo0.J) {
                    arrayList1.add(cardInfo0);
                }
                ++v22;
                v18 = v18;
            }
            v20 = v18;
            String s1 = getAllCardsResponse0.c;
            if(s1 == null) {
            label_170:
                ggek1 = ggek0;
                context2 = context1;
                v21 = v6;
            }
            else {
                Collections.sort(arrayList1, new espa(s1));
                if(!arrayList1.isEmpty() && !arrayList0.isEmpty()) {
                    HashMap hashMap0 = new HashMap();
                    Iterator iterator0 = arrayList1.iterator();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        String s2 = ((CardInfo)object0).F;
                        if(TextUtils.isEmpty(s2)) {
                            ((ggtj)espb.a.j()).x("sortWithSortOrder: missing devicePaymentMethodId");
                            goto label_170;
                        }
                        ggek1 = ggek0;
                        SortItem sortItem1 = (SortItem)gggq.l(arrayList0, new esoo(s2), null);
                        context2 = context1;
                        v21 = v6;
                        if(sortItem1 == null) {
                            goto label_173;
                        }
                        hashMap0.put(s2, Long.valueOf(sortItem1.b));
                        v6 = v21;
                        ggek0 = ggek1;
                        context1 = context2;
                        iterator0 = iterator0;
                    }
                    ggek1 = ggek0;
                    context2 = context1;
                    v21 = v6;
                    Collections.sort(arrayList1, new esop(hashMap0));
                    if(!TextUtils.isEmpty(s1)) {
                        int v23 = gggq.a(arrayList1, new esoq(s1));
                        if(v23 >= v19) {
                            arrayList1.add(0, ((CardInfo)arrayList1.remove(v23)));
                        }
                    }
                }
                else {
                    goto label_170;
                }
            }
        label_173:
            list1 = arrayList1.size() > v19 ? arrayList1.subList(0, v19) : arrayList1;
        }
        String s3 = esgi0.b;
        if(espb0.f && z1) {
            for(Object object1: list1) {
                if(((CardInfo)object1).a()) {
                    continue;
                }
                goto label_206;
            }
            if(!gged0.isEmpty() || !list1.isEmpty() || espb0.s(s3) || espb0.r(s3)) {
                ArrayList arrayList2 = new ArrayList();
                Drawable drawable0 = Icon.createWithData(new byte[0], 0, 0).loadDrawable(context2);
                if(drawable0 != null) {
                    GlobalActionCard globalActionCard0 = new GlobalActionCard();
                    globalActionCard0.a = 2;
                    globalActionCard0.d = "Tap to open";
                    globalActionCard0.c = etsg.a(drawable0, v2, v2);
                    globalActionCard0.h = espb0.n(null, null, esgi0);
                    arrayList2.add(globalActionCard0);
                }
                if(((int)z) != 0) {
                    arrayList2.add(espb0.p(v, v1, true, esgi0));
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjtm gjtm6 = (gjtm)hftp0.b_message;
                gjtm6.b |= 1;
                gjtm6.c = 1;
                espb0.u(esgi0, ((gjtm)hftp0.N_build()), true);
                GetGlobalActionCardsResponse getGlobalActionCardsResponse1 = new GetGlobalActionCardsResponse();
                getGlobalActionCardsResponse1.a = (GlobalActionCard[])arrayList2.toArray(new GlobalActionCard[0]);
                getGlobalActionCardsResponse1.b = 0;
                return getGlobalActionCardsResponse1;
            }
        }
    label_206:
        int v24 = v;
        int v25 = v1;
        ggeo ggeo0 = ggek1.b();
        int v26 = list1.size();
        ArrayList arrayList3 = new ArrayList(v26);
        if(v26 == 0) {
            getAllCardsResponse2 = getAllCardsResponse0;
            v27 = v21;
        }
        else {
            v27 = v21;
            esfs esfs0 = new esfs(context2, s3, esgi0.a);
            getAllCardsResponse2 = getAllCardsResponse0;
            Account account0 = new Account(s3, "com.google");
            int v28 = 0;
            while(v28 < v26) {
                CardInfo cardInfo1 = (CardInfo)list1.get(v28);
                String s4 = cardInfo1.F;
                if(s4 == null) {
                    String s5 = cardInfo1.G;
                    if(s5 == null) {
                        v29 = v28 + 1;
                        s4 = null;
                        goto label_232;
                    }
                    else {
                        s4 = s5;
                    }
                }
                v29 = v28 + 1;
            label_232:
                String s6 = (String)ggeo0.getOrDefault(s4, "");
                Uri uri0 = cardInfo1.i;
                if(uri0 == null) {
                    uri1 = null;
                    s7 = "";
                }
                else {
                    uri1 = uri0;
                    s7 = uri0.toString();
                }
                int v30 = cardInfo1.g.b;
                String s8 = cardInfo1.a;
                String s9 = cardInfo1.h;
                File file0 = esfs0.b;
                file0.mkdirs();
                if(hrnt.i()) {
                    account1 = account0;
                    file1 = new File(ccsb.a.b(file0, String.format("%s_%sx%s", esfy.a(s8, s6, s7, s9, v30), v, v1)));
                }
                else {
                    account1 = account0;
                    file1 = new File(file0, String.format("%s_%sx%s", esfy.a(s8, s6, s7, s9, v30), v, v1));
                }
                if(file1.exists()) {
                    BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                    bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.HARDWARE;
                    bitmapFactory$Options0.inMutable = false;
                    bitmap0 = BitmapFactory.decodeFile(file1.getPath(), bitmapFactory$Options0);
                }
                else {
                    bitmap0 = null;
                }
                if(hypp.i()) {
                    File file2 = new File(ccsb.a.a(esfs0.a(s7)));
                    if(!file2.exists()) {
                        context2.startService(esfq.a(esgi0, s7));
                    }
                    if(file2.lastModified() != 0L && file1.lastModified() != 0L && file2.lastModified() >= file1.lastModified()) {
                        bitmap0 = null;
                    }
                }
                if(bitmap0 == null) {
                    fsap fsap0 = new fsap(context2);
                    esfw.b(cardInfo1, fsap0);
                    if(uri1 != null) {
                        Bitmap bitmap1 = BitmapFactory.decodeFile(esfs0.a(uri1.toString()));
                        if(bitmap1 != null) {
                            fsap0.h(bitmap1, false);
                        }
                    }
                    if(v7 != 0) {
                        fsap0.e(s6);
                        fsap0.m(((boolean)(s6.isEmpty() ^ 1)));
                        fsap0.f((!hwke.j() || cardInfo1.k != cardInfo1.j ? cardInfo1.k : context2.getColor(0x7F0612A3)));  // color:tp_global_action_card_balance_text
                    }
                    if(v30 != 5) {
                        fsap0.setColorFilter(new BlendModeColorFilter(context2.getColor(0x7F0612A7), BlendMode.SRC_OVER));  // color:tp_qaw_non_active_card_view_overlay
                    }
                    v24 = v;
                    v31 = v1;
                    bitmap0 = etsg.a(fsap0, v24, v31);
                    new bblp(0x7FFFFFFF, 10).execute(new esom(bitmap0, file1));
                }
                else {
                    v24 = v;
                    v31 = v1;
                }
                switch(v8) {
                    case 2: {
                        s10 = "NFC is disabled";
                        break;
                    }
                    case 3: {
                        if(v7 != 0) {
                            v32 = 3;
                            switch(v30) {
                                case 4: {
                                    v33 = 0x7F153269;  // string:tp_qaw_suspended_token_label "Suspended"
                                    break;
                                }
                                case 5: {
                                    v33 = 0x7F1531EE;  // string:tp_global_actions_payment_card_text "Hold to reader"
                                    break;
                                }
                                default: {
                                    v33 = 0x7F153268;  // string:tp_qaw_pending_activation_token_label "Not set up\nVerify now"
                                }
                            }
                            s10 = context2.getString(v33);
                        }
                        else if(cardInfo1.t != null && cardInfo1.t.a) {
                            v32 = 4;
                            s10 = "Locked\nUnlock to pay";
                        }
                        else {
                            v32 = 5;
                            s10 = "Locked\nUnlock";
                        }
                        break;
                    }
                    default: {
                        v32 = 1;
                        s10 = "";
                    }
                }
                int v34 = 0x7F080FDD;  // drawable:tp_qaw_contactless_off
                if(v32 - 1 == 0) {
                    v34 = 0;
                }
                else {
                    switch(v32 - 1) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            switch(v30) {
                                case 4: {
                                    v34 = 0x7F080FDB;  // drawable:tp_qaw_alert
                                    break;
                                }
                                case 5: {
                                    v34 = 0x7F080FDC;  // drawable:tp_qaw_contactless
                                }
                            }
                            break;
                        }
                        case 3: {
                            v34 = 0x7F080FDE;  // drawable:tp_qaw_lock
                            break;
                        }
                        default: {
                            v34 = 0x7F080FDC;  // drawable:tp_qaw_contactless
                        }
                    }
                }
                String s11 = cardInfo1.v;
                String s12 = cardInfo1.e.toString();
                String s13 = cardInfo1.l == null ? "" : gfta.b(cardInfo1.l.i);
                if(TextUtils.isEmpty(s12) || s12.equals(s11)) {
                    s12 = s13;
                }
                if(z1) {
                    s14 = "";
                    z2 = true;
                }
                else {
                    s14 = context2.getString(0x7F153364, new Object[]{s12, s11, v29, v26});  // string:tp_token_selector_item_with_product_description "Pay with %1$s %2$s. This 
                                                                                             // is %3$d of %4$d."
                    z2 = false;
                }
                v8 = v8;
                if(s9.isEmpty()) {
                    s9 = s11;
                }
                GlobalActionCard globalActionCard1 = new GlobalActionCard();
                globalActionCard1.a = 2;
                globalActionCard1.b = s8;
                globalActionCard1.c = bitmap0;
                globalActionCard1.d = z2 ? s9.replaceFirst("[a-zA-Z]+", "").trim() : String.format("%s %s", s14, s10);
                globalActionCard1.e = s10;
                if(v34 == 0) {
                    bitmap2 = null;
                }
                else {
                    Drawable drawable1 = kv.a(context2, v34);
                    if(drawable1 == null) {
                        ((ggtj)espb.a.j()).z("missing drawable: %s", v34);
                        bitmap2 = null;
                    }
                    else {
                        bitmap2 = etsg.a(drawable1, v2, v2);
                    }
                }
                globalActionCard1.g = bitmap2;
                espb0 = this;
                globalActionCard1.h = espb0.n(account1, cardInfo1, esgi0);
                arrayList3.add(globalActionCard1);
                arrayList3 = arrayList3;
                v25 = v31;
                account0 = account1;
                list1 = list1;
                v28 = v29;
                ggeo0 = ggeo0;
                v26 = v26;
                gged0 = gged0;
                hftp0 = hftp0;
            }
        }
        int v35 = arrayList3.size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjtm gjtm7 = (gjtm)hftp0.b_message;
        gjtm7.b |= 1;
        gjtm7.c = v35;
        ArrayList arrayList4 = new ArrayList(v20 + arrayList3.size() + 1);
        gggq.t(arrayList4, gggq.d(gged0, new esoj()));
        arrayList4.addAll(arrayList3);
        gggq.t(arrayList4, gggq.d(gged0, new esor()));
        if(((int)z) != 0) {
            arrayList4.add(espb0.p(v24, v25, !list1.isEmpty() || !gged0.isEmpty(), esgi0));
        }
        String s15 = getAllCardsResponse2.c;
        String s16 = getAllCardsResponse2.d;
        int v36 = TextUtils.isEmpty(s16) || s16.equals(s15) ? -1 : gggq.a(arrayList4, new esot(s16));
        if(v36 == -1) {
            v36 = gggq.a(arrayList4, new esou());
        }
        if(v36 != -1) {
            v37 = v36;
        }
        else if(!TextUtils.isEmpty(s15)) {
            v37 = gggq.a(arrayList4, new esov(s15));
        }
        else {
            v37 = -1;
        }
        if(v37 == -1) {
            v37 = 0;
        }
        espb0.u(esgi0, ((gjtm)hftp0.N_build()), z1);
        if(!z1) {
            espb0.d.o(v24, v25);
            if(!hyrj.a.b().h() || !espb0.g()) {
                new dyct().h((1 == v27 ? 4 : 3));
            }
        }
        GetGlobalActionCardsResponse getGlobalActionCardsResponse2 = new GetGlobalActionCardsResponse();
        getGlobalActionCardsResponse2.a = (GlobalActionCard[])arrayList4.toArray(new GlobalActionCard[0]);
        getGlobalActionCardsResponse2.b = v37;
        return getGlobalActionCardsResponse2;
    }

    final int j() {
        if(!this.t()) {
            return 5;
        }
        Context context0 = this.b;
        if(!eszs.a(context0, evjg.d(context0))) {
            return 6;
        }
        if(!hysb.d() && esjw.b(context0).k()) {
            return 7;
        }
        if(hypp.a.b().r() && this.c.g()) {
            return 16;
        }
        if(esff.f(context0).length == 0) {
            return 8;
        }
        boolean z = this.e;
        if(!z) {
            azts azts0 = this.l();
            azzc azzc0 = new azzc();
            azzc0.a = new doom();
            azzc0.c = new Feature[]{dlde.z};
            azzc0.b = false;
            azzc0.d = 7277;
            azts0.iG(azzc0.a());
        }
        if(z) {
            this.d.p(true);
            goto label_37;
        }
        eubv eubv0 = this.d;
        cjpc cjpc0 = eubv0.c;
        if(cjpd.i(cjpc0, "sticky_pay_module_availability_flag", false)) {
            long v = cjpd.b(cjpc0, "sticky_pay_module_availability_ttl", 0L);
            long v1 = System.currentTimeMillis();
            if(Long.compare(v, 0L) == 0) {
                long v2 = v1 + TimeUnit.HOURS.toMillis(1L);
                cjpa cjpa0 = cjpc0.c();
                cjpa0.g("sticky_pay_module_availability_ttl", v2);
                cjpd.f(cjpa0);
            }
            else if(v1 >= v) {
                eubv0.p(false);
                return 9;
            }
        label_37:
            cjpc cjpc1 = this.d.c;
            if(!cjpd.i(cjpc1, "nfc_support", false)) {
                if(evjg.g(context0)) {
                    cjpa cjpa1 = cjpc1.c();
                    cjpa1.e("nfc_support", true);
                    cjpd.f(cjpa1);
                    return 11;
                }
                return 13;
            }
            return 11;
        }
        return 9;
    }

    public final int k() {
        int v = this.j();
        if(v == 11) {
            return Settings.Secure.getInt(this.b.getContentResolver(), "global_actions_panel_enabled", 0) == 1 ? 4 : 3;
        }
        return v;
    }

    public final azts l() {
        return new azts(this.b, null);
    }

    private final PendingIntent m(CardInfo cardInfo0, boolean z) {
        Intent intent0 = new Intent("com.google.commerce.tapandpay.android.globalactions.START");
        Context context0 = this.b;
        String s = eviz.a(context0, intent0);
        PendingIntent pendingIntent0 = null;
        if(!TextUtils.isEmpty(s)) {
            int v = cardInfo0 == null ? 0 : cardInfo0.a.hashCode();
            intent0.setPackage(s);
            intent0.putExtra("cards_tab", z);
            jwd jwd0 = new jwd(context0);
            jwd0.c(intent0);
            if(cardInfo0 != null) {
                Intent intent1 = new Intent("com.google.commerce.tapandpay.android.paymentmethod.VIEW_CARD");
                String s1 = eviz.a(context0, intent1);
                if(!TextUtils.isEmpty(s1)) {
                    pendingIntent0 = intent1.setPackage(s1).putExtra("card_id", cardInfo0.a).putExtra("global_actions_initiated", true);
                }
            }
            if(pendingIntent0 == null) {
                intent0.putExtra("global_actions_initiated", true);
                if(cardInfo0 != null) {
                    intent0.putExtra("card_info_extra", cardInfo0);
                }
            }
            else {
                jwd0.c(((Intent)pendingIntent0));
            }
            pendingIntent0 = jwd0.a(v, 0xC000000);
        }
        if(pendingIntent0 == null) {
            eviy eviy0 = new eviy();
            eviy0.a = "GlobalActions";
            eviy0.e("no_app", "global_actions");
            Intent intent2 = eviy0.a();
            if(intent2 == null) {
                intent2 = new Intent().setClassName(context0, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity");
            }
            PendingIntent pendingIntent1 = fqaw.c(context0, 0, intent2, 0x8000000);
            batl.s(pendingIntent1);
            return pendingIntent1;
        }
        return pendingIntent0;
    }

    private final PendingIntent n(Account account0, CardInfo cardInfo0, esgi esgi0) {
        PendingIntent pendingIntent0 = this.o(account0, cardInfo0, true, esgi0);
        return pendingIntent0 == null ? this.m(cardInfo0, false) : pendingIntent0;
    }

    private final PendingIntent o(Account account0, CardInfo cardInfo0, boolean z, esgi esgi0) {
        Intent intent0;
        if(!this.e) {
            return null;
        }
        jwd jwd0 = new jwd(this.b);
        if(bbqa.a()) {
            if(hyul.e()) {
                dmqm dmqm0 = new dmqm();
                dmqm0.h(43);
                intent0 = dmqm0.c();
            }
            else {
                dmqm dmqm1 = new dmqm();
                dmqm1.h(3);
                intent0 = dmqm1.c();
            }
            jwd0.c(intent0);
            return jwd0.a(0, 0xC000000);
        }
        if(account0 != null && cardInfo0 != null) {
            if(esgi0 != null && cardInfo0.g.b == 3) {
                eusk eusk0 = eusj.e("com.google.android.gms", esgi0.a(), cardInfo0);
                eusk.d("EXTRA_TOKENIZATION_ENTRY_POINT", 9);
                jwd0.c(eusk0.a().a());
                return jwd0.a(0, 0xC000000);
            }
            dmqk dmqk0 = new dmqk();
            dmqk0.d(account0);
            dmqk0.b.a.c = cardInfo0.a;
            dmqk0.i(cardInfo0.F);
            jwd0.c(dmqk0.c().putExtra("global_actions_initiated", true));
            return jwd0.a(cardInfo0.hashCode(), 0xC000000);
        }
        dmqm dmqm2 = new dmqm();
        dmqm2.i(z);
        dmqm2.h(3);
        jwd0.c(dmqm2.c());
        return jwd0.a(0, 0xC000000);
    }

    private final GlobalActionCard p(int v, int v1, boolean z, esgi esgi0) {
        Drawable drawable0;
        int v3;
        int v2;
        Context context0 = this.b;
        LayoutInflater layoutInflater0 = (LayoutInflater)context0.getSystemService(LayoutInflater.class);
        batl.s(layoutInflater0);
        View view0 = layoutInflater0.inflate(0x7F0E0B9C, null);  // layout:tp_global_action_cta
        view0.setBackground(new esoi(context0));
        PendingIntent pendingIntent0 = this.o(null, null, ((boolean)(((int)z))), esgi0);
        if(pendingIntent0 == null) {
            pendingIntent0 = this.m(null, ((boolean)(((int)z) ^ 1)));
            v2 = 0;
        }
        else {
            v2 = 1;
        }
        if(((int)z) == 0) {
            drawable0 = kv.a(context0, 0x7F080FC2);  // drawable:tp_gpay_logo_white
            v3 = 0x7F153163;  // string:tp_add_payment_method "Add a payment method"
        }
        else {
            v3 = 1 == v2 ? 0x7F1531EB : 0x7F1531EC;  // string:tp_global_actions_cta_message "View all"
            drawable0 = kv.a(context0, 0x7F080C90);  // drawable:quantum_ic_arrow_forward_vd_theme_24
            if(drawable0 != null) {
                drawable0.setTint(context0.getColor(0x7F060799));  // color:google_grey100
            }
        }
        ((TextView)view0.findViewById(0x7F0B2259)).setText(v3);  // id:text
        ((ImageView)view0.findViewById(0x7F0B1866)).setImageDrawable(drawable0);  // id:logo
        view0.setLayoutParams(new LinearLayout.LayoutParams(v, v1));
        view0.measure(0, 0);
        view0.layout(0, 0, v, v1);
        Bitmap bitmap0 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), Bitmap.Config.ARGB_8888);
        view0.draw(new Canvas(bitmap0));
        Bitmap bitmap1 = etsg.b(bitmap0);
        if(bitmap1 != null) {
            bitmap0 = bitmap1;
        }
        GlobalActionCard globalActionCard0 = new GlobalActionCard();
        globalActionCard0.a = 3;
        globalActionCard0.b = "";
        globalActionCard0.c = bitmap0;
        globalActionCard0.d = context0.getString(v3);
        globalActionCard0.h = pendingIntent0;
        return globalActionCard0;
    }

    private final etmv q(esgi esgi0) {
        String s = esgi0 == null ? null : esgi0.b;
        if(s == null) {
            Account[] arr_account = esff.f(this.b);
            if(arr_account.length > 0) {
                s = gfta.a(arr_account[0].name);
            }
        }
        return new etmv(this.b, s);
    }

    private final boolean r(String s) {
        Account account0 = new Account(s, "com.google");
        try {
            azts azts0 = this.l();
            GetValuablesRequest getValuablesRequest0 = new GetValuablesRequest();
            getValuablesRequest0.a = account0;
            PassFilter passFilter0 = new PassFilter();
            passFilter0.h = 4;
            getValuablesRequest0.b = passFilter0;
            if(!fsig.a(((gvcx)ftqe.d(((ProtoSafeParcelable)evrg.o(azts0.aR(getValuablesRequest0), 10L, TimeUnit.SECONDS)), ((MessageLite)gvcx.a)))).isEmpty()) {
                return true;
            }
        }
        catch(InterruptedException | ExecutionException exception0) {
            a.ae(espb.a.i(), "Fail to get loyalty cards.", exception0);
        }
        catch(TimeoutException timeoutException0) {
            a.ae(espb.a.i(), "Timeout to get loyalty cards.", timeoutException0);
        }
        return false;
    }

    private final boolean s(String s) {
        esok esok0 = new esok(this, new Account(s, "com.google"));
        gged_interceptors gged0 = ggch.j(gged_interceptors.p(Integer.valueOf(4), Integer.valueOf(8), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(3))).l(esok0).n();
        try {
            evql evql0 = evrg.k(gmap.a, gged0);
            esol esol0 = new esol();
            return ((Boolean)evrg.o(evql0.d(gmap.a, esol0), 10L, TimeUnit.SECONDS)).booleanValue();
        }
        catch(InterruptedException | ExecutionException exception0) {
            a.ae(espb.a.i(), "Fail to get seprepaid cards.", exception0);
            return false;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(espb.a.i(), "Timeout to get seprepaid cards.", timeoutException0);
            return false;
        }
    }

    private final boolean t() {
        boolean z = hysb.a.b().c();
        cjpc cjpc0 = this.d.c;
        boolean z1 = cjpd.i(cjpc0, "sticky_global_actions_flag", false);
        if(z && !z1) {
            cjpa cjpa0 = cjpc0.c();
            cjpa0.e("sticky_global_actions_flag", true);
            cjpd.f(cjpa0);
        }
        return z || z1;
    }

    private final void u(esgi esgi0, gjtm gjtm0, boolean z) {
        if(!z) {
            etmv etmv0 = this.q(esgi0);
            ProtoLiteBuilder hftp0 = etmv0.al(gjsj.bJ);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjzl gjzl0 = (gjzl)hftp0.b_message;
            gjtm0.getClass();
            gjzl0.J = gjtm0;
            gjzl0.c |= 0x40;
            etmv0.l(((gjzl)hftp0.N_build()));
            cjpc cjpc0 = this.d.c;
            if(!cjpd.i(cjpc0, "global_actions_enabled_logged", false)) {
                etmv0.l(etmv0.f(gjsj.bH));
                cjpa cjpa0 = cjpc0.c();
                cjpa0.e("global_actions_enabled_logged", true);
                cjpd.f(cjpa0);
            }
        }
    }
}

