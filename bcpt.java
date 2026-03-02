import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.CallLog.Calls;
import android.provider.Telephony.Sms.Inbox;
import android.provider.Telephony.Sms.Sent;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.util.Pair;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class bcpt {
    public static final baun a;
    public final bcqj b;
    private static final String[] c;
    private final fprw d;

    static {
        bcpt.c = new String[]{"date", "address"};
        bcpt.a = bcrh.a("sms_reader");
    }

    private bcpt(fprw fprw0, bcqj bcqj0) {
        this.d = fprw0;
        this.b = bcqj0;
    }

    public static bcpt a() {
        bcqj bcqj0 = new bcqj();
        return new bcpt(fprw.b(), bcqj0);
    }

    public static ByteString b(String s) {
        byte[] arr_b = ghge.a.c(s, StandardCharsets.UTF_8).e();
        gftb.check(arr_b);
        return ByteString.copyFrom(arr_b);
    }

    public final Map c(bcrd bcrd0) {
        Pair pair0;
        Integer integer0;
        long v7;
        List list3;
        List list2;
        Cursor cursor2;
        ArrayList arrayList3;
        Iterator iterator1;
        ArrayList arrayList2;
        Map map1;
        long v4;
        int v3;
        Cursor cursor1;
        long v2;
        Cursor cursor0;
        ArrayList arrayList1;
        ArrayList arrayList0;
        SubscriptionInfo subscriptionInfo0;
        Iterator iterator0;
        long v;
        bcrd bcrd1 = bcrd0;
        Map map0 = new HashMap();
        if(hrdy.l() || hrdy.k()) {
            try {
                List list0 = SubscriptionManager.from(AppContextProvider.a()).getActiveSubscriptionInfoList();
                v = System.currentTimeMillis();
                if(list0 != null) {
                    iterator0 = list0.iterator();
                    while(true) {
                    label_7:
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        subscriptionInfo0 = (SubscriptionInfo)object0;
                        arrayList0 = new ArrayList();
                        arrayList1 = new ArrayList();
                        cursor0 = null;
                        if(hrdy.l()) {
                            int v1 = subscriptionInfo0.getSubscriptionId();
                            v2 = v - TimeUnit.HOURS.toMillis(hrdy.g());
                            try {
                                cursor1 = AppContextProvider.a().getContentResolver().query(Telephony.Sms.Inbox.CONTENT_URI, bcpt.c, "sub_id = ? AND date > ?", new String[]{String.valueOf(v1), String.valueOf(v2)}, "date DESC");
                            }
                            catch(SQLiteException sQLiteException0) {
                                bcqx.a(AppContextProvider.a()).e(bcrd1, gmfz.ay, sQLiteException0);
                                cursor1 = null;
                            }
                            if(cursor1 == null) {
                                goto label_31;
                            }
                            else {
                                v3 = (int)hrdy.a.h().w();
                                v4 = hrdy.a.h().t();
                                map1 = map0;
                                arrayList2 = arrayList1;
                                iterator1 = iterator0;
                                arrayList3 = arrayList0;
                                goto label_28;
                            }
                            goto label_36;
                        }
                        else {
                            goto label_51;
                        }
                        goto label_55;
                    }
                }
            }
            catch(SecurityException unused_ex) {
            }
            return map0;
            try {
            label_28:
                List list1 = this.e(cursor1, v3, ((int)v4), 3, v, v2);
                cursor1.close();
                goto label_36;
            label_31:
                map1 = map0;
                arrayList2 = arrayList1;
                iterator1 = iterator0;
                arrayList3 = arrayList0;
                list1 = Collections.EMPTY_LIST;
            label_36:
                arrayList3.addAll(list1);
                int v5 = subscriptionInfo0.getSubscriptionId();
                long v6 = v - TimeUnit.HOURS.toMillis(hrdy.g());
                try {
                    cursor2 = AppContextProvider.a().getContentResolver().query(Telephony.Sms.Sent.CONTENT_URI, bcpt.c, "sub_id = ? AND date > ?", new String[]{String.valueOf(v5), String.valueOf(v6)}, "date DESC");
                }
                catch(SQLiteException sQLiteException1) {
                    bcqx.a(AppContextProvider.a()).e(bcrd1, gmfz.ay, sQLiteException1);
                    cursor2 = null;
                }
                if(cursor2 == null) {
                    list2 = Collections.EMPTY_LIST;
                }
                else {
                    list2 = this.e(cursor2, ((int)hrdy.a.h().x()), ((int)hrdy.a.h().u()), 4, v, v6);
                    cursor2.close();
                }
                arrayList3.addAll(list2);
                goto label_55;
            label_51:
                map1 = map0;
                arrayList2 = arrayList1;
                iterator1 = iterator0;
                arrayList3 = arrayList0;
            label_55:
                if(hrdy.k()) {
                    String s = subscriptionInfo0.getIccId();
                    long v8 = v - TimeUnit.HOURS.toMillis(hrdy.a.h().c());
                    try {
                        cursor0 = AppContextProvider.a().getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"type", "duration", "date"}, "subscription_id LIKE ? AND date > ?", new String[]{s + "%", String.valueOf(v8)}, "date DESC");
                    }
                    catch(SQLiteException | IllegalArgumentException exception0) {
                        bcqx.a(AppContextProvider.a()).e(bcrd1, gmfz.ax, exception0);
                    }
                    if(cursor0 == null) {
                        v7 = v;
                        list3 = Collections.EMPTY_LIST;
                    }
                    else {
                        ArrayList arrayList4 = new ArrayList();
                        int v9 = (int)hrdy.b();
                        ArrayList arrayList5 = new ArrayList();
                        int v10 = (int)hrdy.d();
                        ArrayList arrayList6 = new ArrayList();
                        int v11 = (int)hrdy.c();
                        ArrayList arrayList7 = arrayList4;
                        int v12 = (int)hrdy.a.h().a();
                        while(cursor0.moveToNext() && (arrayList7.size() < v9 || arrayList5.size() < v10 || arrayList6.size() < v11)) {
                            long v13 = cursor0.getLong(cursor0.getColumnIndex("date"));
                            if(v13 < v8) {
                                break;
                            }
                            int v14 = bcpt.d(v13, v, v12);
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hocr.a).v_newBuilder();
                            hfwn hfwn0 = bcql.c(v - TimeUnit.HOURS.toMillis(((long)v12) * ((long)v14)));
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hocr hocr0 = (hocr)hftp0.b_message;
                            hfwn0.getClass();
                            hocr0.c = hfwn0;
                            hocr0.b |= 1;
                            switch(cursor0.getInt(cursor0.getColumnIndex("type"))) {
                                case 2: {
                                    if(arrayList5.size() < v10 && cursor0.getLong(cursor0.getColumnIndex("duration")) > 0L) {
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((hocr)hftp0.b_message).d = 2;
                                        arrayList5.add(((hocr)hftp0.N_build()));
                                    }
                                    break;
                                }
                                case 3: {
                                    if(arrayList6.size() < v11) {
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((hocr)hftp0.b_message).d = 3;
                                        arrayList6.add(((hocr)hftp0.N_build()));
                                    }
                                    break;
                                }
                                case 1: 
                                case 5: {
                                    if(arrayList7.size() < v9) {
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((hocr)hftp0.b_message).d = 1;
                                        arrayList7.add(((hocr)hftp0.N_build()));
                                        arrayList7 = arrayList7;
                                    }
                                }
                            }
                            v = v;
                        }
                        v7 = v;
                        arrayList7.addAll(arrayList5);
                        arrayList7.addAll(arrayList6);
                        cursor0.close();
                        list3 = arrayList7;
                    }
                    arrayList2.addAll(list3);
                }
                else {
                    v7 = v;
                }
                integer0 = subscriptionInfo0.getSubscriptionId();
                pair0 = new Pair(arrayList3, arrayList2);
            }
            catch(SecurityException unused_ex) {
                return map1;
            }
            try {
                map1.put(integer0, pair0);
                bcrd1 = bcrd0;
                map0 = map1;
                iterator0 = iterator1;
                v = v7;
            }
            catch(SecurityException unused_ex) {
                return map1;
            }
            goto label_7;
        }
        try {
        }
        catch(SecurityException unused_ex) {
        }
        return map0;
    }

    private static int d(long v, long v1, int v2) {
        return ((int)((v1 - v) / TimeUnit.HOURS.toMillis(((long)v2)))) + 1;
    }

    private final List e(Cursor cursor0, int v, int v1, int v2, long v3, long v4) {
        long v5 = v3;
        List list0 = new ArrayList();
        hrdy hrdy0 = hrdy.a;
        int v6 = (int)hrdy0.h().s();
        int v7 = 0;
        int v8 = 0;
        while(cursor0.moveToNext() && (v7 < v || v8 < v1)) {
            long v9 = cursor0.getLong(cursor0.getColumnIndex("date"));
            if(v9 < v4) {
                break;
            }
            int v10 = bcpt.d(v9, v5, v6);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hocw.a).v_newBuilder();
            hfwn hfwn0 = bcql.c(v3 - TimeUnit.HOURS.toMillis(((long)v10) * ((long)v6)));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            hfwn0.getClass();
            ((hocw)hftv0).c = hfwn0;
            ((hocw)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hocw)hftp0.b_message).d = v2 - 2;
            if(hrdy0.h().A()) {
                String s = cursor0.getString(cursor0.getColumnIndex("address"));
                gftb.check(s);
                if(hrfi.k()) {
                    gqig.a(AppContextProvider.a());
                    gqiv gqiv0 = gqiv.e();
                    try {
                        gqju gqju0 = gqiv0.f(s, gqgf.a("ZZ"));
                    }
                    catch(gqim | IllegalArgumentException unused_ex) {
                        if(v7 < v) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((hocw)hftp0.b_message).e = 2;
                            list0.add(((hocw)hftp0.N_build()));
                            ++v7;
                        }
                        goto label_78;
                    }
                    if(!gqiv0.k(gqju0)) {
                        if(v7 < v) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((hocw)hftp0.b_message).e = 2;
                            list0.add(((hocw)hftp0.N_build()));
                            ++v7;
                        }
                    }
                    else if(v8 < v1) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hocw)hftp0.b_message).e = 1;
                        list0.add(((hocw)hftp0.N_build()));
                        ++v8;
                    }
                }
                else {
                    try {
                        fpsb fpsb0 = this.d.d(s, "ZZ");
                    }
                    catch(fprv unused_ex) {
                        if(v7 < v) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((hocw)hftp0.b_message).e = 2;
                            list0.add(((hocw)hftp0.N_build()));
                            ++v7;
                        }
                        goto label_78;
                    }
                    if(!this.d.i(fpsb0)) {
                        if(v7 < v) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((hocw)hftp0.b_message).e = 2;
                            list0.add(((hocw)hftp0.N_build()));
                            ++v7;
                        }
                    }
                    else if(v8 < v1) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hocw)hftp0.b_message).e = 1;
                        list0.add(((hocw)hftp0.N_build()));
                        ++v8;
                    }
                }
            }
            else if(v7 < v) {
                list0.add(((hocw)hftp0.N_build()));
                ++v7;
            }
        label_78:
            v5 = v3;
        }
        return list0;
    }
}

