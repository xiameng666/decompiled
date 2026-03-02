import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SyncStats;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import android.util.Log;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import jeb.synthetic.TWR;
import org.json.JSONException;

public final class ehet extends ehew {
    private final Context a;
    private final ehga b;
    private final ehft c;
    private final ehbg d;
    private final bbng e;
    private final ehab f;
    private final efur g;
    private final ehco h;
    private final ehfu n;
    private final ehen o;
    private final ehey p;
    private final eheo q;
    private final ehdl r;

    public ehet(Context context0, ehco ehco0, ehbg ehbg0, ehbp ehbp0, ehga ehga0, Account account0, ehim ehim0, egzp egzp0, bbng bbng0, efur efur0, ehif ehif0, ehdl ehdl0) {
        super(ehbp0, account0, ehim0, ehif0, egzp0);
        this.a = context0;
        this.h = ehco0;
        this.b = ehga0;
        this.d = ehbg0;
        ehft ehft0 = new ehft(context0, ehbp0, account0, egzp0);
        this.c = ehft0;
        this.e = bbng0;
        this.g = efur0;
        ehab ehab0 = new ehab(account0, ehbp0, ehim0);
        this.f = ehab0;
        ehfu ehfu0 = new ehfu(ehbp0, account0, ehab0, ehim0);
        this.n = ehfu0;
        ehfj ehfj0 = new ehfj();
        this.o = new ehen(context0, ehfu0, ehco0, ehab0, ehim0, ehdl0, ehfj0);
        this.p = new ehey(context0, ehfu0, ehco0, ehab0, ehim0, egzp0, ehft0, ehfj0);
        this.q = new eheo(context0, ehfu0, ehco0, ehab0, ehim0, ehfj0);
        this.r = ehdl0;
    }

    // This method was un-flattened
    public final void a() {
        HashSet hashSet2;
        ehhn ehhn2;
        ehic ehic2;
        int v11;
        ehhn ehhn1;
        int v10;
        int v9;
        ehhn ehhn0;
        ggqk ggqk0;
        int v8;
        int v7;
        int v6;
        int v5;
        ehia ehia1;
        HashSet hashSet1;
        Account account1;
        gged_interceptors gged1;
        HashSet hashSet0;
        ehia ehia0;
        int v1;
        ehic ehic1;
        this.m.a();
        egiv.R();
        boolean z = hwzc.a.c().be();
        Boolean.valueOf(z).getClass();
        egzp egzp0 = this.l;
        Account account0 = this.j;
        ehim ehim0 = this.k;
        ehhp ehhp0 = new ehhp(this.h, this.d, this.b, egzp0, ContactsContract.RawContacts.CONTENT_URI, ehim0, this.g, account0.name);
        efur efur0 = this.g;
        egiv.R();
        try {
            int v = (int)egiv.L();
            ehic ehic0 = new ehic(v);
            new ehhu(ehhp0, egzp0, ehic0).a();
            ehic1 = new ehic(v);
            this.c.c(ehic0, ehic1);
            if(!((ehiv)ehim0).y && (!hxbk.j() || !((ehiv)ehim0).A)) {
                goto label_20;
            }
            else {
                goto label_25;
            }
            goto label_47;
        }
        catch(Throwable throwable0) {
            v1 = 0;
            this.r.c();
            this.m.b("FSA_contactSyncDown", v1);
            throw throwable0;
        }
    label_20:
        boolean z1 = false;
        boolean z2 = true;
        int v2 = 0;
        int v3 = 0;
        goto label_162;
        try {
        label_25:
            z1 = true;
            z2 = true;
            v3 = 0;
            egzp0.d();
            ehia0 = ehic1.a();
            gged_interceptors gged0 = ehia0.a;
            hashSet0 = new HashSet();
            int v4 = efur0.d(account0.name);
            if(v4 > 0) {
                gged1 = gged0;
                account1 = account0;
                hashSet1 = hashSet0;
                ehia1 = ehia0;
                v5 = v4;
                this.h(v5, this.r, true, false, 0);
            }
            else {
                account1 = account0;
                ehia1 = ehia0;
                gged1 = gged0;
                hashSet1 = hashSet0;
                v5 = v4;
            }
            v2 = v5;
            while(true) {
            label_47:
                v6 = v2 + ((ggna)gged1).c;
                v7 = v3;
                v8 = 0;
                ggqk0 = gged1.E();
                break;
            }
        }
        catch(Throwable throwable0) {
            v1 = v3;
            this.r.c();
            this.m.b("FSA_contactSyncDown", v1);
            throw throwable0;
        }
        while(true) {
            try {
            label_51:
                if(!ggqk0.hasNext()) {
                    goto label_139;
                }
                Object object0 = ggqk0.next();
                ehhn0 = (ehhn)object0;
                egzp0.d();
                egzv egzv0 = (egzv)ehhn0.b;
                if(egzv0 != null && TextUtils.equals(egzv0.b, ((egzv)ehhn0.a).b)) {
                    egiv.R();
                    boolean z3 = hwzc.a.c().aQ();
                    Boolean.valueOf(z3).getClass();
                    if(z3) {
                        ehim0.h(girk.c, gjgi.b, true, 1, 1);
                        ehim0.h(girk.c, gjgi.b, true, 3, 1);
                    }
                    if(egiv.p().booleanValue()) {
                        Object object1 = ehhn0.b;
                        if(object1 != null && !((egzv)object1).g) {
                            gfsx gfsx0 = ehhg.c(((egzv)ehhn0.a).O, ((egzv)object1).O);
                            if(gfsx0.i()) {
                                Object object2 = gfsx0.d();
                                ehil ehil0 = (ehil)object2;
                                ehim0.t(girk.c, gjgi.b, true, ((ehil)object2), 2);
                            }
                        }
                    }
                    v9 = v7;
                    v10 = v8;
                    ehhn1 = ehhn0;
                }
                else {
                    this.n.c(this.a, ehhn0, 1);
                    if(efur0.a.getBoolean("focus_sync_write_cp2_per_each_contact_" + account1.name, false)) {
                        try {
                            this.f.f();
                            v9 = v7;
                            v10 = v8;
                            ehhn1 = ehhn0;
                            goto label_114;
                        }
                        catch(NullPointerException | ehfh exception0) {
                        }
                        goto label_77;
                    }
                    else {
                        goto label_101;
                    }
                }
                goto label_114;
            }
            catch(Throwable throwable0) {
                v11 = v7;
                goto label_187;
            }
            try {
            label_77:
                if(!ehet.i(exception0, z)) {
                    goto label_78;
                }
                goto label_81;
            }
            catch(Throwable throwable0) {
                v9 = v7;
                v11 = v9;
                goto label_187;
            }
            try {
            label_78:
                egiv.R();
                if(!egiv.l().booleanValue() || !(exception0 instanceof ehfh) || !(((ehfh)exception0).a instanceof TransactionTooLargeException)) {
                    throw exception0;
                }
            }
            catch(Throwable throwable0) {
                v11 = v7;
                goto label_187;
            }
            try {
            label_81:
                v9 = v7;
            }
            catch(Throwable throwable0) {
                v9 = v7;
                v11 = v9;
                goto label_187;
            }
            try {
                egig.d("FSA2_RawContactSyncer", "Exception when writing contact to CP2, api contact: %s, local contact: %s", new Object[]{ehhn0.a, ehhn0.b});
                ehim ehim1 = this.k;
                v10 = v8;
                ++((ehiv)ehim1).a.stats.numIoExceptions;
                ehim1.h(girk.c, gjgi.b, true, 2, 1);
                ehhn1 = ehhn0;
                ehim1.r(gjgi.b, girk.c, ((exception0 instanceof NullPointerException) ? "NPE_toLowerCase" : "TransactionTooLargeException"), exception0);
                goto label_114;
            }
            catch(Throwable throwable0) {
                v11 = v9;
                goto label_187;
            }
            try {
                v9 = v7;
                v10 = v8;
                ehhn1 = ehhn0;
                goto label_114;
            }
            catch(Throwable throwable0) {
                v11 = v7;
                goto label_187;
            }
            try {
            label_101:
                v9 = v7;
                v10 = v8;
                ehhn1 = ehhn0;
                this.f.h();
                goto label_114;
            }
            catch(ehfh ehfh0) {
            }
            catch(NullPointerException nullPointerException0) {
                goto label_111;
            }
            catch(Throwable throwable0) {
                v11 = v9;
                goto label_187;
            }
            try {
                v11 = v9;
                this.g(ehfh0);
                throw ehfh0;
            label_111:
                v11 = v9;
                this.f(nullPointerException0, z);
                throw nullPointerException0;
            }
            catch(Throwable throwable0) {
                goto label_187;
            }
        label_114:
            if(!z2) {
                try {
                    if(this.f.c.b() <= 0) {
                        ehic2 = ehic1;
                        v11 = v9;
                        ehhn2 = ehhn1;
                        goto label_123;
                    }
                }
                catch(Throwable throwable0) {
                    try {
                        v11 = v9;
                        goto label_187;
                    label_123:
                        this.h(v10 + 1, this.r, false, false, 0);
                        v8 = 0;
                        goto label_130;
                    label_126:
                        ehic2 = ehic1;
                        v11 = v9;
                        ehhn2 = ehhn1;
                        v8 = v10 + 1;
                    label_130:
                        if(hxdh.d()) {
                            hashSet2 = hashSet1;
                            hashSet2.add(((egzv)ehhn2.a).a);
                        }
                        else {
                            hashSet2 = hashSet1;
                        }
                        hashSet1 = hashSet2;
                        ehic1 = ehic2;
                        v7 = v11 + 1;
                        goto label_51;
                    label_139:
                        v11 = v7;
                        if(!ehia1.c) {
                            String s = ehia1.b;
                            this.j(z);
                            ehbg ehbg0 = this.d;
                            egyn egyn0 = ehbg0.a.b();
                            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)egyn0).jf(5, null);
                            hftp0.X(((ProtoLiteMessage)egyn0));
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            egyn egyn1 = (egyn)hftp0.b_message;
                            egyn1.b |= 2;
                            egyn1.d = s;
                            ehbg0.g(((egyn)hftp0.N_build()));
                            this.k.j();
                            this.e(hashSet1);
                            this.h(v8, this.r, false, z1, v6);
                            z1 = z1;
                            v2 = v6;
                            account0 = account1;
                            z2 = false;
                            v3 = v11;
                            ehic1 = ehic1;
                            break;
                        }
                        goto label_173;
                    }
                    catch(Throwable throwable0) {
                        goto label_187;
                    }
                }
            }
            goto label_126;
        }
        try {
        label_162:
            egzp0.d();
            ehia0 = ehic1.a();
            hashSet0 = new HashSet();
            account1 = account0;
            ehia1 = ehia0;
            gged1 = ehia0.a;
            hashSet1 = hashSet0;
            goto label_47;
        }
        catch(Throwable throwable0) {
            v1 = v3;
            this.r.c();
            this.m.b("FSA_contactSyncDown", v1);
            throw throwable0;
        }
        try {
        label_173:
            this.j(z);
            this.d.d(ehia1.b);
            this.k.j();
            this.e(hashSet1);
            this.h(v8, this.r, false, z1, v6);
            this.g.z(this.j.name, false);
            this.b.b(ContactsContract.RawContacts.CONTENT_URI);
            egiv.R();
            int v12 = (int)hwzc.a.c().e();
            Integer.valueOf(v12).getClass();
            ContentProviderOperation contentProviderOperation0 = ContentProviderOperation.newUpdate(ehab.c(ContactsContract.RawContacts.CONTENT_URI, this.b.a)).withValue("sync3", null).withSelection(a.u(System.currentTimeMillis() - ((long)v12) * 1000L, "sourceid IS NULL AND sync3 IS NOT NULL AND sync3 < "), null).build();
            this.b.a(contentProviderOperation0, "clearFlagForFailedInsertedContacts");
            goto label_191;
        }
        catch(Throwable throwable0) {
        }
    label_187:
        v1 = v11;
        this.r.c();
        this.m.b("FSA_contactSyncDown", v1);
        throw throwable0;
    label_191:
        this.r.c();
        this.m.b("FSA_contactSyncDown", v11);
    }

    @Override  // ehew
    public final void b() {
        LinkedHashMap linkedHashMap2;
        egzv egzv6;
        List list5;
        Iterator iterator9;
        int v9;
        List list4;
        Iterator iterator7;
        Iterator iterator5;
        ArrayList arrayList4;
        ArrayList arrayList3;
        Iterator iterator2;
        Iterator iterator1;
        ArrayList arrayList1;
        ArrayList arrayList0;
        ehen ehen0;
        int v1;
        List list1;
        Map map0;
        ehae ehae1;
        ehae ehae0;
        HashSet hashSet0;
        ehft ehft0;
        this.m.a();
        int v = 0;
        try {
            if(((ehiv)this.k).C && !this.d.a.b().i) {
                ehft0 = this.c;
                hashSet0 = new HashSet();
                ehbp ehbp0 = ehft0.a;
                Account account0 = ehft0.b;
                ggfp ggfp0 = ehft.l();
                ehae0 = ehae.c(ehft0.f, ehbp0, account0, ggfp0, "data_set IS NULL AND sourceid IS NOT NULL AND dirty = 0 AND deleted = 0 AND mimetype=? AND data15 IS NOT NULL", new String[]{"vnd.android.cursor.item/contact_event"});
                goto label_9;
            }
            goto label_47;
        }
        catch(ehfh ehfh0) {
            goto label_46;
        }
        catch(Throwable throwable0) {
            goto label_308;
        }
        try {
        label_9:
            if(((long)ehae0.e()) <= hxcf.a.b().a()) {
                egzv egzv0;
                while((egzv0 = ehae0.a()) != null) {
                    ehft0.c.d();
                    if(!ehft.k(egzv0)) {
                        hashSet0.add(egzv0.d);
                    }
                }
            }
            else {
                egig.b("FSA2_LcReader", "Too many contacts with lunar dates, skip fully sync-up these contacts.");
                hashSet0 = new HashSet();
            }
            goto label_22;
        }
        catch(Throwable throwable1) {
            try {
                try {
                    TWR.safeClose$NT(ehae0, throwable1);
                    throw throwable1;
                label_22:
                    ehae0.close();
                    egig.f("FSA2_RawContactSyncer", "Found %d contacts with lunar dates", hashSet0.size());
                    ehfu ehfu0 = this.n;
                    for(Object object0: hashSet0) {
                        ehfu0.b.b.p(((Long)object0));
                    }
                    ehfu0.b.f();
                    if(hxcf.c() && !hashSet0.isEmpty()) {
                        ehfu0.c.h(girk.i, gjgi.b, false, 1, hashSet0.size());
                    }
                    ehbg ehbg0 = this.d;
                    egig.m("FSA2_PeopleSyncState", "@setFullySyncedUpLunarDates = %s", new Object[]{Boolean.valueOf(true)});
                    egyn egyn0 = ehbg0.a.b();
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)egyn0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)egyn0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    egyn egyn1 = (egyn)hftp0.b_message;
                    egyn1.b |= 0x100;
                    egyn1.i = true;
                    ehbg0.g(((egyn)hftp0.N_build()));
                }
                catch(ehfh ehfh0) {
                label_46:
                    egig.c("FSA2_RawContactSyncer", "Failed to fully sync up lunar dates", ehfh0);
                }
            }
            catch(Throwable throwable0) {
                goto label_308;
            }
        }
        try {
        label_47:
            ehbp ehbp1 = this.c.a;
            Account account1 = this.c.b;
            ggfp ggfp1 = ehft.l();
            ehae1 = ehae.c(this.c.f, ehbp1, account1, ggfp1, "data_set IS NULL AND (sourceid IS NULL OR dirty != 0 OR deleted != 0)", null);
        }
        catch(Throwable throwable2) {
            goto label_303;
        }
        try {
            map0 = this.c.j(ehae1);
            goto label_56;
        }
        catch(Throwable throwable3) {
            try {
                TWR.safeClose$NT(ehae1, throwable3);
                throw throwable3;
            label_56:
                ehae1.close();
                List list0 = (List)map0.get(ehfo.a);
                list1 = (List)map0.get(ehfo.c);
                List list2 = (List)map0.get(ehfo.b);
                v1 = list2.size() + (list0.size() + list1.size());
                if(v1 == 0) {
                    goto label_305;
                }
                else {
                    int v2 = list0.size() + list1.size();
                    egiv.R();
                    if(egiv.r().booleanValue()) {
                        v2 += list2.size();
                    }
                    this.r.e(false, gjgi.b, v2);
                    egzp egzp0 = this.l;
                    egzp0.d();
                    egzp0.d();
                    ehen0 = this.o;
                    ehen0.d.h(girk.b, gjgi.b, false, 1, list0.size());
                    arrayList0 = new ArrayList();
                    arrayList1 = new ArrayList();
                    iterator1 = list0.iterator();
                    while(true) {
                    label_75:
                        if(iterator1.hasNext()) {
                            goto label_290;
                        }
                        if(!arrayList1.isEmpty()) {
                            arrayList0.add(arrayList1);
                        }
                        iterator2 = arrayList0.iterator();
                        while(true) {
                        label_79:
                            if(iterator2.hasNext()) {
                                goto label_160;
                            }
                            egzp egzp1 = this.l;
                            egzp1.d();
                            for(Object object1: list1) {
                                egzv egzv1 = (egzv)object1;
                                ehim ehim0 = this.p.e;
                                ehim0.h(this.p.a, gjgi.b, false, 1, 1);
                                if(this.p.g(egzv1)) {
                                    this.r.d(1, false);
                                }
                                else {
                                    ehim0.d(ehel.h(egzv1));
                                }
                            }
                            egzp1.d();
                            eheo eheo0 = this.q;
                            ehim ehim1 = eheo0.e;
                            gjgi gjgi0 = gjgi.b;
                            ehim1.h(eheo0.a, gjgi0, false, 1, list2.size());
                            ArrayList arrayList2 = new ArrayList();
                            for(Object object2: list2) {
                                egzv egzv2 = (egzv)object2;
                                if(egzv2.a != null) {
                                    arrayList2.add(egzv2);
                                }
                                else if(egzv2.e == null) {
                                    ehim1.h(girk.d, gjgi0, false, 3, 1);
                                    eheo0.b(egzv2);
                                }
                                else {
                                    eheo0.e.h(girk.d, gjgi0, false, 3, 1);
                                    egiv.R();
                                    eheo0.e.r(gjgi0, girk.d, "INSERT_FAILED_BEFORE", null);
                                    SyncStats syncStats0 = ((ehiv)eheo0.e).a.stats;
                                    ++syncStats0.numIoExceptions;
                                }
                            }
                            int v3 = (int)hwzc.a.c().k();
                            arrayList3 = new ArrayList();
                            arrayList4 = new ArrayList();
                            iterator5 = arrayList2.iterator();
                            while(true) {
                            label_120:
                                if(!iterator5.hasNext()) {
                                    if(!arrayList4.isEmpty()) {
                                        arrayList3.add(arrayList4);
                                    }
                                    int v4 = 0;
                                    for(Object object3: arrayList3) {
                                        v4 += eheo0.i(((List)object3));
                                    }
                                    if(v4 <= 0) {
                                        int v5 = arrayList2.size();
                                        for(int v6 = 0; v6 < v5; ++v6) {
                                            egzv egzv3 = (egzv)arrayList2.get(v6);
                                            eheo0.e.d(eheo.h(egzv3));
                                        }
                                        v4 = 0;
                                    }
                                    if(v4 > 0) {
                                        egiv.R();
                                        if(egiv.r().booleanValue()) {
                                            this.r.d(v4, false);
                                        }
                                    }
                                    goto label_142;
                                }
                                goto label_145;
                            }
                        }
                    }
                }
                goto label_311;
            }
            catch(Throwable throwable2) {
                goto label_303;
            }
        }
        try {
        label_142:
            this.r.c();
            v = v1;
            goto label_311;
        }
        catch(Throwable throwable0) {
            goto label_308;
        }
        try {
        label_145:
            Object object4 = iterator5.next();
            egzv egzv4 = (egzv)object4;
            if(ehhz.d(egzv4.m, egzv4.f)) {
            label_150:
                if(!arrayList4.isEmpty()) {
                    arrayList3.add(arrayList4);
                    arrayList4 = new ArrayList();
                }
                arrayList3.add(new ArrayList(Arrays.asList(new egzv[]{egzv4})));
                goto label_120;
            label_155:
                arrayList4.add(egzv4);
                if(arrayList4.size() < v3) {
                    goto label_120;
                }
                arrayList3.add(arrayList4);
                arrayList4 = new ArrayList();
                goto label_120;
            label_160:
                Object object5 = iterator2.next();
                List list3 = (List)object5;
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                int v7 = (int)hwzc.a.c().c();
                Integer.valueOf(v7).getClass();
                int v8 = 0;
            label_166:
                if(v8 >= list3.size()) {
                    iterator7 = iterator2;
                    list4 = list1;
                }
                else {
                    v9 = v8 + v7;
                    LinkedHashMap linkedHashMap1 = new LinkedHashMap();
                    Iterator iterator8 = list3.subList(v8, Math.min(v9, list3.size())).iterator();
                    while(iterator8.hasNext()) {
                        Long long0 = null;
                        Object object6 = iterator8.next();
                        egzv egzv5 = (egzv)object6;
                        String s = egzv5.c;
                        if(s != null) {
                            try {
                                long0 = Long.parseLong(s, 16);
                            }
                            catch(NumberFormatException unused_ex) {
                            }
                        }
                        if(long0 == null) {
                            long v10 = new SecureRandom().nextLong() & 0x7FFFFFFF87FFFFFFL | 0x8000000L;
                            Long long1 = v10;
                            iterator9 = iterator2;
                            long1.getClass();
                            ContentValues contentValues0 = new ContentValues();
                            list5 = list1;
                            contentValues0.put("sync2", Long.toHexString(v10));
                            ehen0.c.b.f(ehen0.c.b.a, egzv5.d, contentValues0, false, false);
                            ehab.g(ehen0.c.b.c, ehen0.c.b.b, ehen0.c.b.d);
                            long0 = long1;
                        }
                        else {
                            iterator9 = iterator2;
                            list5 = list1;
                        }
                        linkedHashMap1.put(egzv5, long0);
                        iterator2 = iterator9;
                        list1 = list5;
                    }
                    iterator7 = iterator2;
                    list4 = list1;
                    if(linkedHashMap1.size() == 1) {
                        linkedHashMap0.putAll(linkedHashMap1);
                        goto label_286;
                    }
                    else {
                        try {
                            try {
                                ehcm ehcm0 = ehen0.b.b(linkedHashMap1);
                                ehen0.c(ehcm0.a);
                                linkedHashMap1 = ehcm0.b;
                            }
                            catch(iapl iapl0) {
                                if(ehen0.e.c(eggf.e, iapl0.a.t.r, iapl0.a.u) - 1 == 5) {
                                    iaof_metadata iaof0 = iapl0.b;
                                    if(iaof0 != null) {
                                        HashMap hashMap0 = ehen.a(linkedHashMap1, iaof0);
                                        try {
                                            ehcm ehcm1 = ehen0.b.c(linkedHashMap1, hashMap0);
                                            ehen0.c(ehcm1.a);
                                            linkedHashMap1 = ehcm1.b;
                                        }
                                        catch(iapl iapl1) {
                                            if(ehen.f(iapl1)) {
                                                throw new ehfc(iapl1);
                                            }
                                        }
                                    }
                                }
                                else if(ehen.f(iapl0)) {
                                    throw new ehfc(iapl0);
                                }
                            }
                            linkedHashMap0.putAll(linkedHashMap1);
                            goto label_286;
                        }
                        catch(acse | JSONException | ehfd exception0) {
                            ehfl.a(false, gjgi.b, girk.b, exception0, ehen0.d, 1);
                            goto label_286;
                        }
                        catch(ehfc ehfc0) {
                            ehen0.d(ehfc0);
                            linkedHashMap0 = new LinkedHashMap();
                        }
                    }
                }
                Iterator iterator10 = linkedHashMap0.entrySet().iterator();
                while(true) {
                    if(!iterator10.hasNext()) {
                        iterator2 = iterator7;
                        list1 = list4;
                        goto label_79;
                    }
                    Object object7 = iterator10.next();
                    Map.Entry map$Entry0 = (Map.Entry)object7;
                    try {
                        try {
                            egzv6 = (egzv)map$Entry0.getKey();
                            linkedHashMap2 = new LinkedHashMap(ggeo.l(egzv6, ((Long)map$Entry0.getValue())));
                        }
                        catch(acse | JSONException | ehfd | iapl exception1) {
                            goto label_261;
                        }
                        try {
                            try {
                                if(ehhz.d(egzv6.m, egzv6.f)) {
                                    SyncStats syncStats1 = ((ehiv)ehen0.d).a.stats;
                                    ++syncStats1.numParseExceptions;
                                    ehen0.d.r(gjgi.b, girk.b, "DO_NOT_RETRY", null);
                                    ehen0.d.h(girk.b, gjgi.b, false, 8, 1);
                                    continue;
                                }
                            }
                            catch(iapl iapl2) {
                                goto label_252;
                            }
                            try {
                                ehen.e(egzv6);
                                goto label_249;
                            }
                            catch(iapl iapl3) {
                                try {
                                    ehen0.d.h(girk.b, gjgi.b, false, 9, 1);
                                    throw iapl3;
                                label_249:
                                    ehen0.b(ehen0.b.b(linkedHashMap2));
                                    continue;
                                }
                                catch(iapl iapl2) {
                                }
                            }
                        }
                        catch(acse | JSONException | ehfd exception2) {
                            goto label_264;
                        }
                        try {
                        label_252:
                            if(ehen0.e.c(eggf.e, iapl2.a.t.r, iapl2.a.u) - 1 != 5) {
                                if(ehen.f(iapl2)) {
                                    throw new ehfc(iapl2);
                                }
                                throw iapl2;
                            }
                            ehen.e(egzv6);
                            HashMap hashMap1 = ehen.a(linkedHashMap2, iapl2.b);
                            ehen0.b(ehen0.b.c(linkedHashMap2, hashMap1));
                            continue;
                        }
                        catch(acse | JSONException | ehfd | iapl exception1) {
                        }
                    }
                    catch(ehfc ehfc1) {
                        break;
                    }
                label_261:
                    Exception exception3 = exception1;
                    goto label_265;
                label_264:
                    exception3 = exception2;
                label_265:
                    if(ehhz.e(exception3)) {
                        egzv egzv7 = (egzv)map$Entry0.getKey();
                        ehen0.a.b(egzv7);
                        ehen0.c.f();
                    }
                    ehim ehim2 = ehen0.d;
                    ehfl.a(false, gjgi.b, girk.b, exception3, ehim2, 1);
                    egzv egzv8 = (egzv)map$Entry0.getKey();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)girx.a).v_newBuilder();
                    long v11 = (long)egzv8.d;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    girx girx0 = (girx)hftp1.b_message;
                    girx0.b |= 1;
                    girx0.c = v11;
                    ehim2.d(((girx)hftp1.N_build()));
                }
                ehen0.d(ehfc1);
                iterator2 = iterator7;
                list1 = list4;
                goto label_79;
            label_286:
                v8 = v9;
                iterator2 = iterator7;
                list1 = list4;
                goto label_166;
            label_290:
                Object object8 = iterator1.next();
                egzv egzv9 = (egzv)object8;
                if(ehhz.d(egzv9.m, egzv9.f)) {
                label_295:
                    if(!arrayList1.isEmpty()) {
                        arrayList0.add(arrayList1);
                        arrayList1 = new ArrayList();
                    }
                    arrayList0.add(new ArrayList(Arrays.asList(new egzv[]{egzv9})));
                    goto label_75;
                label_300:
                    arrayList1.add(egzv9);
                    goto label_75;
                }
                else {
                    try {
                        ehen.e(egzv9);
                        goto label_300;
                    }
                    catch(iapl unused_ex) {
                    }
                    goto label_295;
                }
            }
            else {
                try {
                    eheo.j(egzv4);
                    goto label_155;
                }
                catch(iapl unused_ex) {
                }
                goto label_150;
            }
            goto label_311;
        }
        catch(Throwable throwable2) {
            try {
            label_303:
                this.r.c();
                throw throwable2;
            label_305:
                this.r.c();
                goto label_311;
            }
            catch(Throwable throwable0) {
            }
        }
    label_308:
        this.g.m(this.j.name, ((ehiv)this.k).i);
        this.m.b("FSA_contactSyncUp", 0);
        throw throwable0;
    label_311:
        this.g.m(this.j.name, ((ehiv)this.k).i);
        this.m.b("FSA_contactSyncUp", v);
    }

    @Override  // ehew
    public final void c(int v) {
        try {
            Account account0 = this.c.b;
            Uri uri0 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", account0.name).appendQueryParameter("account_type", account0.type).appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("visible_contacts_only", "true").build();
            int v1 = this.c.e(uri0, "data_set IS NULL AND deleted = 0");
            ehim ehim0 = this.k;
            gjgi gjgi0 = gjgi.b;
            ehim0.v(gjgi0, v, 2, v1);
            if(v == 3) {
                try {
                    Integer integer0 = ehet.d(ehim0.u(gjgi0, 4, 2));
                    Integer integer1 = ehet.d(ehim0.u(gjgi0, 2, 2));
                    Integer integer2 = ehet.d(ehim0.u(gjgi0, 5, 2));
                    Integer integer3 = ehet.d(ehim0.u(gjgi0, 3, 2));
                    if(Log.isLoggable("FSA2_RawContactSyncer", 4)) {
                        Log.i("FSA2_RawContactSyncer", egig.a("contact count. before sweep: %d, before sync: %d, after sync down: %d, after sync up: %d", new Object[]{integer0, integer1, integer2, integer3}));
                        return;
                    }
                    return;
                }
                catch(ehfh unused_ex) {
                    goto label_15;
                }
            }
            return;
        label_15:
            v = 3;
        }
        catch(ehfh unused_ex) {
        }
        this.k.v(gjgi.b, v, 2, -1);
    }

    private static int d(gfsx gfsx0) {
        return (int)(((Integer)gfsx0.f(Integer.valueOf(-1))));
    }

    private final void e(Set set0) {
        if(hxdh.d() && !set0.isEmpty()) {
            efur efur0 = this.g;
            String s = this.j.name;
            if(!set0.isEmpty()) {
                Set set1 = efur0.l(s);
                set1.removeAll(set0);
                efur0.a.edit().putStringSet("focus_synced_up_contacts_source_ids_" + s, set1).apply();
            }
        }
    }

    private final void f(NullPointerException nullPointerException0, boolean z) {
        if(ehet.i(nullPointerException0, z)) {
            this.g.z(this.j.name, true);
        }
    }

    private final void g(ehfh ehfh0) {
        egiv.R();
        Exception exception0 = ehfh0.a;
        if((exception0 instanceof OperationApplicationException)) {
            String s = hwzc.a.c().V();
            String s1 = ((OperationApplicationException)exception0).getMessage();
            if(s1 != null && Pattern.compile(s).matcher(s1).find()) {
                this.g.z(this.j.name, true);
            }
        }
        else if(egiv.l().booleanValue() && (exception0 instanceof TransactionTooLargeException)) {
            this.g.z(this.j.name, true);
        }
    }

    private final void h(int v, ehdl ehdl0, boolean z, boolean z1, int v1) {
        if(z1) {
            String s = this.j.name;
            this.g.a.edit().putInt("focus_synced_contacts_count_in_first_full_sync_" + s, v1).apply();
        }
        ehdl0.d(v, z);
    }

    private static boolean i(Exception exception0, boolean z) {
        if((exception0 instanceof NullPointerException)) {
            egiv.R();
            String s = exception0.getMessage();
            return z && s != null && s.contains(hwzc.a.c().S());
        }
        return false;
    }

    private final void j(boolean z) {
        try {
            this.f.f();
        }
        catch(ehfh ehfh0) {
            this.g(ehfh0);
            throw ehfh0;
        }
        catch(NullPointerException nullPointerException0) {
            this.f(nullPointerException0, z);
            throw nullPointerException0;
        }
    }
}

