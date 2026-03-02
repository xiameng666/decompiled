import android.accounts.Account;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.ContactsContract.Groups;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class ehba extends Enum {
    public static final enum ehba a;
    private static final String[] b;
    private static final ehba[] c;
    private ehbp d;
    private Set e;
    private Set f;
    private final ehjx g;

    static {
        ehba.a = new ehba();
        ehba.c = new ehba[]{ehba.a};
        ehba.b = new String[]{"system_id", "title", "account_name", "auto_add", "favorites", "_id", "sourceid", "group_is_read_only"};
    }

    private ehba() {
        super("INSTANCE", 0);
        this.g = ehjh.a;
    }

    static final boolean a(Context context0, String s) {
        return efur.i(context0).c(s) > 0;
    }

    public final void b(Context context0) {
        int v;
        __monitor_enter(this);
        v = FIN.finallyOpen$NT();
        ehbp ehbp0 = new ehbp(context0.getContentResolver());
        this.d = ehbp0;
        try(ehag ehag0 = ehag.d(ehbp0, ContactsContract.Groups.CONTENT_URI, ehba.b, "account_type=\'com.google\' AND data_set IS NULL", null, "_id")) {
            this.h(ehag0);
        }
        ggqj ggqj0 = this.g.d(context0).om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            this.k(context0, ((Account)object0));
        }
        FIN.finallyCodeBegin$NT(v);
        __monitor_exit(this);
        FIN.finallyCodeEnd$NT(v);
    }

    public final void c(Context context0, Account account0, gfsx gfsx0, ehim ehim0) {
        long v6;
        int v1;
        int v;
        __monitor_enter(this);
        v = FIN.finallyOpen$NT();
        ehbp ehbp0 = new ehbp(context0.getContentResolver(), account0, gfsx0);
        this.d = ehbp0;
        try(ehag ehag0 = ehag.d(ehbp0, ContactsContract.Groups.CONTENT_URI, ehba.b, "account_type=\'com.google\' AND data_set IS NULL AND account_name = ?", new String[]{account0.name}, "_id")) {
            this.h(ehag0);
        }
        if(hxba.o()) {
            this.f(account0);
        }
        else {
            this.k(context0, account0);
        }
        if(hxba.h()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girg.a).v_newBuilder();
            String s = account0.name;
            Pair pair0 = egyo.d(context0).a();
            boolean z = ((Boolean)pair0.first).booleanValue() && ((egpr)pair0.second).c && ((egpr)pair0.second).d.equals(s) && ((egpr)pair0.second).e.contains(Integer.valueOf(3));
            String s1 = account0.name;
            Pair pair1 = egyo.d(context0).a();
            boolean z1 = ((Boolean)pair1.first).booleanValue() && hwzg.f() && ((egpr)pair1.second).f && ((egpr)pair1.second).d.equals(s1) && ((egpr)pair1.second).e.contains(Integer.valueOf(3)) && ((egpr)pair1.second).e.contains(Integer.valueOf(4));
            if(!z && !z1) {
                if(hxba.t()) {
                    egig.k("FSA2_GoogleAccountUtil", "Syncing device contacts is off.");
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((girg)hftp0.b_message).c = 2;
                ((girg)hftp0.b_message).b |= 1;
            }
            else {
                if(hxba.t()) {
                    egig.k("FSA2_GoogleAccountUtil", "Syncing device contacts is on.");
                }
                if(z) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((girg)hftp0.b_message).c = 3;
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((girg)hftp0.b_message).c = 5;
                }
                ((girg)hftp0.b_message).b |= 1;
                String s2 = account0.name;
                egyq egyq0 = new egyq(context0);
                try {
                    v1 = egyq0.b();
                    int v2 = egyq0.d(s2) + v1;
                    if(hxba.r()) {
                        ehba.g(ehim0, v2);
                    }
                    if(((long)v1) < hxba.a.e().i() && ((long)v2) < hxba.c()) {
                        int v3 = v1 <= 0 ? 0 : egyq0.f();
                        if(hxba.s()) {
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)girc.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            girc girc0 = (girc)hftv0;
                            girc0.b |= 1;
                            girc0.c = v1;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            girc girc1 = (girc)hftp1.b_message;
                            girc1.b |= 2;
                            girc1.d = v3;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            girg girg0 = (girg)hftp0.b_message;
                            girc girc2 = (girc)hftp1.N_build();
                            girc2.getClass();
                            girg0.e = girc2;
                            girg0.b |= 4;
                        }
                        if(egyq.h(v1, v3)) {
                            goto label_73;
                        }
                        else {
                            goto label_107;
                        }
                    }
                    else {
                        goto label_90;
                    }
                    goto label_120;
                }
                catch(cjuh unused_ex) {
                    goto label_105;
                }
            label_73:
                if(hxba.a.e().ac() && ehba.a(context0, account0.name)) {
                    giqx giqx0 = (giqx)((ProtoLiteMessage)girb.a).v_newBuilder();
                    if(!giqx0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx0).ensureMutable();
                    }
                    ((girb)giqx0.b_message).c = 4;
                    ((girb)giqx0.b_message).b |= 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    girg girg1 = (girg)hftp0.b_message;
                    girb girb0 = (girb)((ProtoLiteBuilder)giqx0).N_build();
                    girb0.getClass();
                    girg1.d = girb0;
                    girg1.b |= 2;
                    egig.k("FSA2_GoogleAccountUtil", "Device is opt-in backup and sync but last sync wasn\'t successful");
                }
                else {
                    this.l(context0, account0, ehim0, hftp0);
                    goto label_120;
                    try {
                    label_90:
                        if(hxba.s()) {
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)girc.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            girc girc3 = (girc)hftp2.b_message;
                            girc3.b |= 1;
                            girc3.c = v1;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            girg girg2 = (girg)hftp0.b_message;
                            girc girc4 = (girc)hftp2.N_build();
                            girc4.getClass();
                            girg2.e = girc4;
                            girg2.b |= 4;
                        }
                    }
                    catch(cjuh unused_ex) {
                    label_105:
                        if(hxba.r()) {
                            ehba.g(ehim0, 0xFFFFFF);
                        }
                    }
                label_107:
                    giqx giqx1 = (giqx)((ProtoLiteMessage)girb.a).v_newBuilder();
                    if(!giqx1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx1).ensureMutable();
                    }
                    ((girb)giqx1.b_message).c = 3;
                    ((girb)giqx1.b_message).b |= 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    girg girg3 = (girg)hftp0.b_message;
                    girb girb1 = (girb)((ProtoLiteBuilder)giqx1).N_build();
                    girb1.getClass();
                    girg3.d = girb1;
                    girg3.b |= 2;
                    egig.k("FSA2_GoogleAccountUtil", "Device is opt-in backup and sync but there are too many contacts.");
                }
            label_120:
                if(hwzg.f() && z1) {
                    String s3 = account0.name;
                    egyq egyq1 = new egyq(context0);
                    egys egys0 = new egys(context0);
                    egyz egyz0 = egyz.a(context0);
                    try {
                        int v4 = egys0.a();
                        if(((long)(egyq1.d(s3) + v4)) < hxba.c() && ((long)v4) < hwzg.b() && ((long)egyz0.b().size()) < hwzg.b()) {
                            goto label_131;
                        }
                        else {
                            goto label_181;
                        }
                        goto label_194;
                    }
                    catch(cjuh cjuh0) {
                        egig.l("FSA2_GoogleAccountUtil", "Stop copying sim contacts due to operation exception.", cjuh0);
                        goto label_181;
                    }
                label_131:
                    if(ehba.a(context0, account0.name)) {
                        gird gird0 = (gird)((ProtoLiteMessage)girf.a).v_newBuilder();
                        if(!gird0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gird0).ensureMutable();
                        }
                        ((girf)gird0.b_message).k = 4;
                        ((girf)gird0.b_message).b |= 0x80;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        girg girg4 = (girg)hftp0.b_message;
                        girf girf0 = (girf)((ProtoLiteBuilder)gird0).N_build();
                        girf0.getClass();
                        girg4.f = girf0;
                        girg4.b |= 8;
                        egig.k("FSA2_GoogleAccountUtil", "Device is opt-in backup and sync v2 but last sync wasn\'t successful");
                    }
                    else {
                        gfsx gfsx1 = hwzg.a.c().l() ? gfsx.m(new ehbj(context0)) : gfqx.a;
                        if(gfsx1.i()) {
                            egzc egzc0 = ((ehbj)gfsx1.d()).a;
                            long v5 = System.currentTimeMillis();
                            try {
                                v6 = (long)(((Long)((glyq)glzd.f(egzc0.b.a(), new egzb(), gmap.a)).u()));
                            }
                            catch(InterruptedException | ExecutionException exception0) {
                                a.ae(egzc.a.i(), "Failed to getLastNoOpSimContactsMigrationTime", exception0);
                                v6 = 0L;
                            }
                            if(v5 < v6 + hwzg.a.c().b() * 1000L) {
                                gird gird1 = (gird)((ProtoLiteMessage)girf.a).v_newBuilder();
                                if(!gird1.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)gird1).ensureMutable();
                                }
                                ((girf)gird1.b_message).k = 5;
                                ((girf)gird1.b_message).b |= 0x80;
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                girg girg5 = (girg)hftp0.b_message;
                                girf girf1 = (girf)((ProtoLiteBuilder)gird1).N_build();
                                girf1.getClass();
                                girg5.f = girf1;
                                girg5.b |= 8;
                                egig.k("FSA2_GoogleAccountUtil", "Sim contacts sync was throttled due to rate limit.");
                                goto label_194;
                            }
                            goto label_173;
                        }
                        else {
                        label_173:
                            girf girf2 = this.d(context0, account0, gfsx1);
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            girg girg6 = (girg)hftp0.b_message;
                            girf2.getClass();
                            girg6.f = girf2;
                            girg6.b |= 8;
                            goto label_194;
                        label_181:
                            gird gird2 = (gird)((ProtoLiteMessage)girf.a).v_newBuilder();
                            if(!gird2.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)gird2).ensureMutable();
                            }
                            ((girf)gird2.b_message).k = 3;
                            ((girf)gird2.b_message).b |= 0x80;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            girg girg7 = (girg)hftp0.b_message;
                            girf girf3 = (girf)((ProtoLiteBuilder)gird2).N_build();
                            girf3.getClass();
                            girg7.f = girf3;
                            girg7.b |= 8;
                            egig.k("FSA2_GoogleAccountUtil", "Device is opt-in backup and sync v2 but there are too many sim contacts. Stop copying sim contacts.");
                        }
                    }
                }
            }
        label_194:
            ehim0.k(((girg)hftp0.N_build()));
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        FIN.finallyExec$NT(v);
    }

    private final girf d(Context context0, Account account0, gfsx gfsx0) {
        HashSet hashSet5;
        String s;
        Throwable throwable4;
        ehag ehag0;
        int v6;
        ArrayList arrayList1;
        egzv egzv1;
        ArrayList arrayList0;
        int v5;
        ehge ehge1;
        HashSet hashSet4;
        egzv egzv0;
        int v4;
        ehge ehge0;
        int v3;
        HashMap hashMap1;
        Set set1;
        List list1;
        Cursor cursor1;
        Iterator iterator0;
        int v2;
        int v1;
        Set set0;
        List list0;
        HashSet hashSet3;
        int v;
        Cursor cursor0;
        HashSet hashSet2;
        HashSet hashSet1;
        HashMap hashMap0;
        efpm efpm0;
        if(hwzg.a.c().j()) {
            egig.g("FSA2_GoogleAccountUtil", "FsaAutoImportSimContactsFeature enabled: %s", Boolean.valueOf(hwzg.f()));
        }
        gird gird0 = (gird)((ProtoLiteMessage)girf.a).v_newBuilder();
        if(!gird0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gird0).ensureMutable();
        }
        ((girf)gird0.b_message).k = 2;
        ((girf)gird0.b_message).b |= 0x80;
        egyz egyz0 = egyz.a(context0);
        ehbp ehbp0 = this.d;
        HashSet hashSet0 = new HashSet();
        efoy efoy0 = efoy.e;
        hashSet0.add(efoy0);
        try {
            efpm0 = efpb.c(context0).d(EnumSet.of(efpa.f, efpa.c));
            hashMap0 = new HashMap(egyz0.b());
            hashSet1 = new HashSet();
            hashSet2 = new HashSet();
            cursor0 = ehbp0.a(ContactsContract.RawContacts.CONTENT_URI, ehbi.a, "(account_type != \'com.google\' AND account_type IS NOT NULL) AND (deleted = 0) ", null, null);
            if(cursor0 != null) {
                goto label_18;
            }
            cursor1 = null;
            throw new RemoteException("Unable to query CP2.");
        }
        catch(OperationApplicationException unused_ex) {
            goto label_292;
        }
        catch(RemoteException unused_ex) {
            goto label_298;
        }
        catch(IOException unused_ex) {
            goto label_304;
        }
        while(true) {
            try {
            label_18:
                v = 0;
                if(!cursor0.moveToNext()) {
                    hashSet3 = hashSet1;
                    if(hashSet3.isEmpty()) {
                        goto label_237;
                    }
                    else {
                        list0 = ehfr.c(a.T(hashSet3, "(account_type != \'com.google\' AND account_type IS NOT NULL) AND (deleted = 0)  AND _id IN (", ",", ")"), context0, ehbp0);
                        set0 = ehay.b(list0, context0, ehbp0, account0);
                        goto label_24;
                    }
                    goto label_244;
                }
                goto label_268;
            }
            catch(Throwable throwable0) {
                cursor1 = cursor0;
                goto label_285;
            }
            try {
            label_24:
                v1 = 0;
                v2 = 0;
                iterator0 = list0.iterator();
            }
            catch(Throwable throwable1) {
                try {
                    cursor1 = cursor0;
                    list1 = list0;
                    set1 = set0;
                    hashMap1 = hashMap0;
                    v3 = 0;
                    goto label_186;
                }
                catch(Throwable throwable0) {
                    goto label_285;
                }
            }
            while(true) {
                try {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    ehge0 = (ehge)object0;
                    list1 = list0;
                }
                catch(Throwable throwable1) {
                    try {
                        cursor1 = cursor0;
                        v4 = v1;
                        list1 = list0;
                        set1 = set0;
                        hashMap1 = hashMap0;
                        goto label_184;
                    }
                    catch(Throwable throwable0) {
                        goto label_285;
                    }
                }
                try {
                    egzv0 = ehge0.b;
                    if(set0.contains(egzv0)) {
                        goto label_59;
                    }
                    else {
                        cursor1 = cursor0;
                        hashSet4 = hashSet3;
                        set1 = set0;
                        hashMap1 = hashMap0;
                        ehge1 = ehge0;
                    }
                    goto label_152;
                }
                catch(Throwable throwable1) {
                    cursor1 = cursor0;
                    v4 = v1;
                }
                try {
                    set1 = set0;
                    hashMap1 = hashMap0;
                    goto label_184;
                }
                catch(Throwable throwable0) {
                    goto label_285;
                }
            label_59:
                List list2 = egzv0.E;
                if(list2 == null) {
                    ++v;
                }
                else if(list2.isEmpty()) {
                    ++v;
                }
                try {
                    v5 = v;
                    arrayList0 = new ArrayList();
                    cursor1 = cursor0;
                    ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_name", account0.name).withValue("account_type", account0.type);
                    boolean z = egzv0.i;
                    arrayList0.add(contentProviderOperation$Builder0.withValue("starred", Integer.valueOf(((int)z))).withYieldAllowed(true).build());
                    if(list2 != null) {
                        for(Iterator iterator1 = list2.iterator(); iterator1.hasNext(); iterator1 = iterator1) {
                            Object object1 = iterator1.next();
                            arrayList0.add(ehbi.a("vnd.android.cursor.item/name", ((ContentValues)object1).getAsString("data1")));
                        }
                    }
                    List list3 = egzv0.I;
                    if(list3 != null) {
                        for(Iterator iterator2 = list3.iterator(); iterator2.hasNext(); iterator2 = iterator2) {
                            Object object2 = iterator2.next();
                            arrayList0.add(ehbi.a("vnd.android.cursor.item/phone_v2", ((ContentValues)object2).getAsString("data1")));
                        }
                    }
                    List list4 = egzv0.r;
                    if(list4 != null) {
                        for(Object object3: list4) {
                            arrayList0.add(ehbi.a("vnd.android.cursor.item/email_v2", ((ContentValues)object3).getAsString("data1")));
                        }
                    }
                    if(z) {
                        hashSet4 = hashSet3;
                        egzv1 = egzv0;
                        arrayList1 = arrayList0;
                        ehbp0 = ehbp0;
                        set1 = set0;
                        ehge1 = ehge0;
                        v6 = v1;
                        goto label_106;
                    }
                    else {
                        goto label_126;
                    }
                    s = ehbl.a(egzv1);
                    hashMap1 = hashMap0;
                    goto label_139;
                }
                catch(Throwable throwable1) {
                    v6 = v1;
                    set1 = set0;
                    hashMap1 = hashMap0;
                    v = v6;
                    v3 = v5;
                    goto label_186;
                }
                try {
                label_106:
                    ehag0 = ehag.d(ehbp0, ContactsContract.Groups.CONTENT_URI, ehbi.b, "account_type=\'com.google\' AND data_set IS NULL AND account_name = ? AND title = \'Starred in Android\'", new String[]{account0.name}, "_id");
                }
                catch(ehfh ehfh0) {
                    goto label_124;
                }
                catch(Throwable throwable1) {
                    hashMap1 = hashMap0;
                    v = v6;
                    v3 = v5;
                    goto label_186;
                }
                try {
                    egzx egzx0 = ehag0.a();
                    Long long0 = egzx0 == null ? null : egzx0.h;
                    if(long0 == null) {
                        egig.b("FSA2_SimContactsMigrater", "Failed to get favorites group row id");
                    }
                    else {
                        arrayList1.add(ehbi.a("vnd.android.cursor.item/group_membership", long0.toString()));
                    }
                    goto label_121;
                }
                catch(Throwable throwable2) {
                    try {
                        throwable4 = throwable2;
                        ehag0.close();
                        throw throwable4;
                    }
                    catch(Throwable throwable3) {
                        try {
                            try {
                                throwable4.addSuppressed(throwable3);
                                throw throwable4;
                            label_121:
                                ehag0.close();
                            }
                            catch(ehfh ehfh0) {
                            label_124:
                                egig.c("FSA2_SimContactsMigrater", "Failed to qualify existing groups", ehfh0);
                            }
                            s = ehbl.a(egzv1);
                            hashMap1 = hashMap0;
                            goto label_139;
                        label_126:
                            hashSet4 = hashSet3;
                            v6 = v1;
                            egzv1 = egzv0;
                            ehbp0 = ehbp0;
                            arrayList1 = arrayList0;
                            set1 = set0;
                            ehge1 = ehge0;
                            s = ehbl.a(egzv1);
                            hashMap1 = hashMap0;
                            goto label_139;
                        }
                        catch(Throwable throwable1) {
                        }
                    }
                }
                hashMap1 = hashMap0;
                v = v6;
                v3 = v5;
                goto label_186;
                try {
                label_139:
                    ArrayList arrayList2 = hashMap1.containsKey(s) ? new ArrayList() : arrayList1;
                    if(arrayList2.isEmpty()) {
                        v1 = v6 + 1;
                    }
                    else {
                        ehbp0.c(arrayList2);
                        ++v2;
                        v1 = v6;
                    }
                }
                catch(Throwable throwable1) {
                    v = v6;
                    v3 = v5;
                    goto label_186;
                }
                v = v5;
                try {
                label_152:
                    String s1 = ehbl.a(ehge1.b);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)egqt.a).v_newBuilder();
                    long v7 = System.currentTimeMillis();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    egqt egqt0 = (egqt)hftp0.b_message;
                    egqt0.b |= 1;
                    egqt0.c = v7;
                    hashMap1.put(s1, ((egqt)hftp0.N_build()));
                    list0 = list1;
                    hashMap0 = hashMap1;
                    set0 = set1;
                    hashSet3 = hashSet4;
                    cursor0 = cursor1;
                }
                catch(Throwable throwable1) {
                    v3 = v;
                    v = v1;
                    goto label_186;
                }
            }
            try {
                cursor1 = cursor0;
                hashSet5 = hashSet3;
                v4 = v1;
                list1 = list0;
                set1 = set0;
                hashMap1 = hashMap0;
                if(gfsx0.i()) {
                    if(v2 == 0) {
                        ((ehbj)gfsx0.d()).a.b(System.currentTimeMillis());
                    }
                    else {
                        ((ehbj)gfsx0.d()).a.b(0L);
                    }
                }
                goto label_211;
            }
            catch(Throwable throwable1) {
                try {
                label_184:
                    v3 = v;
                    v = v4;
                label_186:
                    egyz0.c(hashMap1);
                    gird0.a(new ArrayList(hashSet2));
                    int v8 = list1.size();
                    if(!gird0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gird0).ensureMutable();
                    }
                    girf girf0 = (girf)gird0.b_message;
                    girf0.b |= 16;
                    girf0.g = v8;
                    if(!gird0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gird0).ensureMutable();
                    }
                    girf girf1 = (girf)gird0.b_message;
                    girf1.b |= 0x20;
                    girf1.h = v;
                    int v9 = list1.size() - set1.size();
                    if(!gird0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gird0).ensureMutable();
                    }
                    girf girf2 = (girf)gird0.b_message;
                    girf2.b |= 8;
                    girf2.f = v9;
                    if(!gird0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gird0).ensureMutable();
                    }
                    girf girf3 = (girf)gird0.b_message;
                    girf3.b |= 0x100;
                    girf3.l = v3;
                    throw throwable1;
                label_211:
                    egyz0.c(hashMap1);
                    gird0.a(new ArrayList(hashSet2));
                    int v10 = list1.size();
                    if(!gird0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gird0).ensureMutable();
                    }
                    girf girf4 = (girf)gird0.b_message;
                    girf4.b |= 16;
                    girf4.g = v10;
                    if(!gird0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gird0).ensureMutable();
                    }
                    girf girf5 = (girf)gird0.b_message;
                    girf5.b |= 0x20;
                    girf5.h = v4;
                    int v11 = list1.size() - set1.size();
                    if(!gird0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gird0).ensureMutable();
                    }
                    girf girf6 = (girf)gird0.b_message;
                    girf6.b |= 8;
                    girf6.f = v11;
                    if(!gird0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gird0).ensureMutable();
                    }
                    girf girf7 = (girf)gird0.b_message;
                    girf7.b |= 0x100;
                    girf7.l = v;
                    v = v2;
                    goto label_244;
                }
                catch(Throwable throwable0) {
                    goto label_285;
                }
            }
            try {
            label_237:
                cursor1 = cursor0;
                hashSet5 = hashSet3;
                hashMap1 = hashMap0;
            }
            catch(Throwable throwable0) {
                cursor1 = cursor0;
                goto label_285;
            }
            try {
            label_244:
                cursor1.close();
                if(!gird0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gird0).ensureMutable();
                }
                girf girf8 = (girf)gird0.b_message;
                girf8.b |= 1;
                girf8.c = v;
                int v12 = hashMap1.size();
                if(!gird0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gird0).ensureMutable();
                }
                girf girf9 = (girf)gird0.b_message;
                girf9.b |= 4;
                girf9.e = v12;
                int v13 = hashSet5.size();
                if(!gird0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gird0).ensureMutable();
                }
                girf girf10 = (girf)gird0.b_message;
                girf10.b |= 2;
                girf10.d = v13;
                egig.i("FSA2_GoogleAccountUtil", "Migrated %d sim contacts to account %s", Integer.valueOf(v), account0.name);
                if(!gird0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gird0).ensureMutable();
                }
                ((girf)gird0.b_message).k = 1;
                ((girf)gird0.b_message).b |= 0x80;
            }
            catch(OperationApplicationException unused_ex) {
                goto label_292;
            }
            catch(RemoteException unused_ex) {
                goto label_298;
            }
            catch(IOException unused_ex) {
                goto label_304;
            }
            return (girf)((ProtoLiteBuilder)gird0).N_build();
            try {
            label_268:
                long v14 = cursor0.getLong(0);
                String s2 = cursor0.getString(1);
                efoy efoy1 = efpm0.a(s2, cursor0.getString(2)).c;
                if(hashSet0.contains(efoy1) && efoy1 == efoy0) {
                    hashSet1.add(Long.valueOf(v14));
                    hashSet2.add(s2);
                    hashSet2 = hashSet2;
                    hashSet1 = hashSet1;
                }
                efpm0 = efpm0;
                goto label_18;
            }
            catch(Throwable throwable5) {
            }
            break;
        }
        Throwable throwable6 = throwable5;
        cursor1 = cursor0;
        goto label_286;
        try {
            cursor1 = null;
            throw new RemoteException("Unable to query CP2.");
        }
        catch(Throwable throwable0) {
        }
    label_285:
        throwable6 = throwable0;
    label_286:
        if(cursor1 != null) {
            try {
                cursor1.close();
            }
            catch(Throwable throwable7) {
                try {
                    throwable6.addSuppressed(throwable7);
                    throw throwable6;
                }
                catch(OperationApplicationException unused_ex) {
                    goto label_292;
                }
                catch(RemoteException unused_ex) {
                    goto label_298;
                }
                catch(IOException unused_ex) {
                    goto label_304;
                }
            }
        }
        throw throwable6;
    label_292:
        egig.b("FSA2_GoogleAccountUtil", "Failed to migrate sim contacts.");
        if(!gird0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gird0).ensureMutable();
        }
        ((girf)gird0.b_message).j = 1;
        ((girf)gird0.b_message).b |= 0x40;
        return (girf)((ProtoLiteBuilder)gird0).N_build();
    label_298:
        egig.b("FSA2_GoogleAccountUtil", "Failed to migrate sim contacts.");
        if(!gird0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gird0).ensureMutable();
        }
        ((girf)gird0.b_message).j = 2;
        ((girf)gird0.b_message).b |= 0x40;
        return (girf)((ProtoLiteBuilder)gird0).N_build();
    label_304:
        egig.b("FSA2_GoogleAccountUtil", "Failed to migrate sim contacts.");
        if(!gird0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gird0).ensureMutable();
        }
        ((girf)gird0.b_message).j = 3;
        ((girf)gird0.b_message).b |= 0x40;
        return (girf)((ProtoLiteBuilder)gird0).N_build();
    }

    private final void e(ContentValues contentValues0, Account account0) {
        Integer integer0 = (int)1;
        contentValues0.put("group_visible", integer0);
        contentValues0.put("group_is_read_only", integer0);
        Uri uri0 = ehab.c(ContactsContract.Groups.CONTENT_URI, account0);
        this.d.b(uri0, contentValues0);
    }

    private final void f(Account account0) {
        String s = account0.name;
        Integer integer0 = (int)1;
        if(!this.e.contains(s)) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("title", "My Contacts");
            contentValues0.put("system_id", "Contacts");
            contentValues0.put("sourceid", "6");
            contentValues0.put("auto_add", integer0);
            this.e(contentValues0, account0);
        }
        if(!this.f.contains(s)) {
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("title", "Starred in Android");
            contentValues1.put("favorites", integer0);
            this.e(contentValues1, account0);
        }
    }

    private static void g(ehim ehim0, int v) {
        ehim0.v(gjgi.b, 4, 2, v);
    }

    private final void h(ehag ehag0) {
        this.e = new HashSet();
        this.f = new HashSet();
        egzx egzx0;
        while((egzx0 = ehag0.a()) != null) {
            String s = egzx0.o;
            if(!TextUtils.isEmpty(s)) {
                String s1 = egzx0.l;
                if("Contacts".equals(s1) || s1 == null && egzx0.k == null && "System Group: My Contacts".equals(egzx0.m)) {
                    this.e.add(s);
                    if("My Contacts".equals(egzx0.m) && "Contacts".equals(s1) && "6".equals(egzx0.k) && egzx0.d && egzx0.c) {
                        continue;
                    }
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("title", "My Contacts");
                    contentValues0.put("system_id", "Contacts");
                    contentValues0.put("sourceid", "6");
                    Integer integer0 = (int)1;
                    contentValues0.put("auto_add", integer0);
                    contentValues0.put("group_is_read_only", integer0);
                    this.j(egzx0.h.longValue(), contentValues0);
                }
                else {
                    if(s1 != null) {
                        String s2 = egzx0.m;
                        boolean z = s2 != null && s2.startsWith("System Group: ");
                        if(z || egzx0.d || !egzx0.c) {
                            ContentValues contentValues1 = new ContentValues();
                            contentValues1.put("auto_add", Integer.valueOf(0));
                            contentValues1.put("group_is_read_only", Integer.valueOf(1));
                            if(z) {
                                contentValues1.put("title", s2.substring(14));
                            }
                            this.j(egzx0.h.longValue(), contentValues1);
                        }
                    }
                    if("Starred in Android".equals(egzx0.m)) {
                        this.f.add(s);
                        if(!egzx0.a || !egzx0.c) {
                            ContentValues contentValues2 = new ContentValues();
                            Integer integer1 = (int)1;
                            contentValues2.put("favorites", integer1);
                            contentValues2.put("group_is_read_only", integer1);
                            this.j(egzx0.h.longValue(), contentValues2);
                        }
                    }
                }
            }
        }
    }

    private final void i(Uri uri0, ContentValues contentValues0, String s) {
        this.d.e(uri0, contentValues0, s);
    }

    private final void j(long v, ContentValues contentValues0) {
        this.i(ehab.b(ContentUris.withAppendedId(ContactsContract.Groups.CONTENT_URI, v)), contentValues0, null);
    }

    private final void k(Context context0, Account account0) {
        this.f(account0);
        egiv.R();
        hwzc hwzc0 = hwzc.a;
        boolean z = hwzc0.c().ad();
        Boolean.valueOf(z).getClass();
        if(!z) {
            if(!hxba.h()) {
                return;
            }
            String s = account0.name;
            Pair pair0 = egyo.d(context0).a();
            if(!((Boolean)pair0.first).booleanValue() || !((egpr)pair0.second).c || !((egpr)pair0.second).d.equals(s) || !((egpr)pair0.second).e.contains(Integer.valueOf(1))) {
                return;
            }
        }
        String s1 = account0.name;
        Cursor cursor0 = this.d.a(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "account_name IS NULL AND account_type IS NULL AND data_set IS NULL", null, null);
        try {
            if(cursor0 == null) {
                throw new ehfh(new RemoteException("Unable to query CP2"));
            }
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("account_name", s1);
            contentValues0.put("account_type", account0.type);
            while(cursor0.moveToNext()) {
                long v = cursor0.getLong(0);
                this.i(ContentUris.withAppendedId(ContactsContract.Groups.CONTENT_URI, v), contentValues0, "account_name IS NULL AND account_type IS NULL AND data_set IS NULL");
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        ehbp ehbp0 = this.d;
        new HashSet();
        new HashMap();
        egik.f();
        String s2 = account0.name;
        Cursor cursor1 = ehbp0.a(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, "account_name IS NULL AND account_type IS NULL AND data_set IS NULL", null, null);
        try {
            if(cursor1 == null) {
                throw new ehfh(new RemoteException("Unable to query CP2"));
            }
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("account_name", s2);
            contentValues1.put("account_type", account0.type);
            int v1;
            for(v1 = 0; cursor1.moveToNext(); ++v1) {
                long v2 = cursor1.getLong(0);
                ehbp0.e(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, v2), contentValues1, "account_name IS NULL AND account_type IS NULL AND data_set IS NULL");
            }
            if(v1 > 0 && hwzc0.c().ax()) {
                efpr.a();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gise.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gise gise0 = (gise)hftp0.b_message;
                gise0.b |= 16;
                gise0.g = 80;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gisb.a).v_newBuilder();
                giri giri0 = (giri)((ProtoLiteMessage)giry.a).v_newBuilder();
                if(!giri0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giri0).ensureMutable();
                }
                giry giry0 = (giry)giri0.b_message;
                giry0.b |= 4;
                giry0.f = v1;
                giry giry1 = (giry)((ProtoLiteBuilder)giri0).N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gisb gisb0 = (gisb)hftp1.b_message;
                giry1.getClass();
                gisb0.f = giry1;
                gisb0.b |= 0x100000;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gise gise1 = (gise)hftp0.b_message;
                gisb gisb1 = (gisb)hftp1.N_build();
                gisb1.getClass();
                gise1.p = gisb1;
                gise1.b |= 0x2000;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gisr.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gisr gisr0 = (gisr)hftp2.b_message;
                gise gise2 = (gise)hftp0.N_build();
                gise2.getClass();
                gisr0.e = gise2;
                gisr0.b |= 4;
                efpt.b(s2, hftp2);
            }
        }
        catch(Throwable throwable1) {
            TWR.safeClose$NT(cursor1, throwable1);
            throw throwable1;
        }
        cursor1.close();
    }

    private final void l(Context context0, Account account0, ehim ehim0, ProtoLiteBuilder hftp0) {
        egyq egyq2;
        Map map3;
        ehag ehag1;
        Map map2;
        ehba ehba0;
        efur efur1;
        ehag ehag0;
        ehfs ehfs0;
        ehbp ehbp2;
        Account account2;
        efpm efpm5;
        Throwable throwable5;
        Cursor cursor1;
        int v18;
        boolean z5;
        eggh eggh0;
        ehav ehav0;
        egpn egpn0;
        boolean z4;
        Long long1;
        ehar ehar0;
        ProtoLiteBuilder hftp2;
        Long long0;
        efpm efpm4;
        Uri uri0;
        Map map1;
        HashSet hashSet5;
        String s2;
        efoy efoy0;
        String s1;
        long v15;
        HashSet hashSet3;
        efpm efpm2;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        Throwable throwable2;
        HashSet hashSet2;
        egyq egyq1;
        efpm efpm1;
        int v7;
        boolean z2;
        int v6;
        int v5;
        int v4;
        int v3;
        int v2;
        ContentValues contentValues0;
        HashSet hashSet1;
        Cursor cursor0;
        int v1;
        ehbp ehbp1;
        String[] arr_s;
        boolean z1;
        String s;
        Map map0;
        HashSet hashSet0;
        gfsx gfsx0;
        egyq egyq0;
        Set set0;
        efur efur0;
        Context context1 = context0;
        Account account1 = account0;
        giqx giqx0 = (giqx)((ProtoLiteMessage)girb.a).v_newBuilder();
        efpm efpm0 = efpb.c(context1).e(EnumSet.of(efpa.f));
        try {
            efur0 = efur.i(context1);
            int v = efur0.L(account1.name);
            if(!giqx0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giqx0).ensureMutable();
            }
            ((girb)giqx0.b_message).c = 2;
            ((girb)giqx0.b_message).b |= 1;
            efur0.O(account1.name, 3);
            ehbp ehbp0 = this.d;
            set0 = new HashSet();
            HashMap hashMap0 = new HashMap();
            egyq0 = new egyq(context1);
            gfsx0 = egik.f();
            hashSet0 = new HashSet();
            if(hxba.o()) {
                map0 = hashMap0;
                hashSet0.add(efoy.d);
                hashSet0.add(efoy.b);
            }
            else {
                map0 = hashMap0;
                hashSet0.add(efoy.d);
            }
            s = account1.name;
            hxba hxba0 = hxba.a;
            boolean z = hxba0.e().G();
            z1 = hxba0.e().S();
            if(z) {
                arr_s = ehap.a;
                ehbp1 = ehbp0;
            }
            else {
                ehbp1 = ehbp0;
                arr_s = new String[]{"_id", "account_type", "data_set"};
            }
            String[] arr_s1 = new String[arr_s.length + 4];
            v1 = 0;
            System.arraycopy(arr_s, 0, arr_s1, 0, arr_s.length);
            System.arraycopy(ehay.a, 0, arr_s1, arr_s.length, 4);
            cursor0 = ehbp1.a(ContactsContract.RawContacts.CONTENT_URI, arr_s1, ehas.c(), null, null);
            if(cursor0 == null) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giqy.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((giqy)hftp1.b_message).c = 1;
                ((giqy)hftp1.b_message).b |= 1;
                giqy giqy0 = (giqy)hftp1.N_build();
                if(!giqx0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giqx0).ensureMutable();
                }
                girb girb0 = (girb)giqx0.b_message;
                giqy0.getClass();
                girb0.p = giqy0;
                girb0.b |= 0x2000;
                throw new RemoteException("Unable to query CP2");
            }
            hashSet1 = new HashSet();
        }
        catch(OperationApplicationException | RemoteException | cjuh unused_ex) {
            goto label_614;
        }
        catch(Throwable throwable0) {
            goto label_617;
        }
        try {
            contentValues0 = ehas.a(s, account1.type);
            v2 = 0;
            v3 = 0;
            v4 = 0;
            v5 = 0;
            v6 = 0;
            z2 = true;
            v7 = 0;
        }
        catch(Throwable throwable1) {
            efpm1 = efpm0;
            egyq1 = egyq0;
            hashSet2 = hashSet1;
            throwable2 = throwable1;
            v8 = 0;
            v9 = 0;
            v10 = 0;
            v11 = 0;
            v12 = 0;
            v13 = 0;
            v14 = 0;
            goto label_385;
        }
        while(true) {
            try {
            label_76:
                if(!cursor0.moveToNext()) {
                    goto label_478;
                }
            }
            catch(Throwable throwable3) {
                efpm1 = efpm0;
                egyq1 = egyq0;
                v10 = v3;
                v11 = v4;
                v12 = v5;
                v13 = v6;
                hashSet2 = hashSet1;
                v9 = v2;
                goto label_382;
            }
            try {
                if(hxba0.e().r()) {
                    goto label_94;
                }
                else {
                    goto label_111;
                }
                goto label_112;
            }
            catch(Throwable throwable3) {
                efpm2 = efpm0;
                hashSet2 = hashSet1;
                goto label_118;
            }
            try {
            label_94:
                hashSet3 = hashSet1;
                if(((long)v1) >= hxba0.e().e()) {
                    goto label_107;
                }
                goto label_112;
            }
            catch(Throwable throwable3) {
                efpm1 = efpm0;
                egyq1 = egyq0;
                v9 = v2;
                v10 = v3;
                v11 = v4;
                v12 = v5;
                v13 = v6;
                hashSet2 = hashSet3;
                goto label_382;
            }
        label_107:
            efpm efpm3 = efpm0;
            HashSet hashSet4 = hashSet3;
            boolean z3 = false;
            goto label_481;
        label_111:
            hashSet3 = hashSet1;
            try {
            label_112:
                v15 = cursor0.getLong(0);
                s1 = cursor0.getString(1);
                goto label_126;
            }
            catch(Throwable throwable3) {
                efpm2 = efpm0;
                hashSet2 = hashSet3;
            }
        label_118:
            egyq1 = egyq0;
            v9 = v2;
            v10 = v3;
            v11 = v4;
            v12 = v5;
            v13 = v6;
            efpm1 = efpm2;
            goto label_382;
            try {
            label_126:
                efoy0 = efpm0.a(s1, cursor0.getString(2)).c;
                if(ehas.e(s1, context1)) {
                    goto label_128;
                }
                goto label_129;
            }
            catch(Throwable throwable3) {
                goto label_175;
            }
            try {
            label_128:
                efoy0 = efoy.d;
            }
            catch(Throwable throwable3) {
                goto label_156;
            }
            try {
            label_129:
                if(hashSet0.contains(efoy0)) {
                    goto label_130;
                }
                goto label_472;
            }
            catch(Throwable throwable3) {
                goto label_175;
            }
            try {
            label_130:
                if(efoy0 == efoy.d || efoy0 == efoy.b) {
                    if(z2) {
                        ((egik)((gftm)gfsx0).a).a();
                        if(!efur0.E(s)) {
                            efur0.I(s);
                        }
                        if(z) {
                            List list0 = ehfr.b(ehas.c(), context1, ehbp1);
                            s2 = s;
                            hashSet5 = hashSet0;
                            map1 = ehay.a(list0, ehfr.a(list0, context1, ehbp1, account1), true);
                            goto label_149;
                        }
                        else {
                            s2 = s;
                            hashSet5 = hashSet0;
                            List list1 = ehfr.b(ehas.c(), context1, ehbp1);
                            set0 = ehay.a(list1, ehfr.a(list1, context1, ehbp1, account1), false).keySet();
                            goto label_148;
                        }
                        goto label_146;
                    }
                    else {
                    label_146:
                        s2 = s;
                        hashSet5 = hashSet0;
                    }
                label_148:
                    map1 = map0;
                label_149:
                    z2 = false;
                }
                else {
                    s2 = s;
                    hashSet5 = hashSet0;
                    map1 = map0;
                }
            }
            catch(Throwable throwable3) {
            label_156:
                efpm1 = efpm0;
                egyq1 = egyq0;
                v9 = v2;
                v10 = v3;
                v11 = v4;
                v12 = v5;
                v13 = v6;
                hashSet2 = hashSet3;
                goto label_381;
            }
            try {
                uri0 = ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, v15);
                if(z) {
                    String s3 = cursor0.getString(cursor0.getColumnIndex("sourceid"));
                    String s4 = cursor0.getString(cursor0.getColumnIndex("sync1"));
                    String s5 = cursor0.getString(cursor0.getColumnIndex("sync2"));
                    String s6 = cursor0.getString(cursor0.getColumnIndex("sync3"));
                    String s7 = cursor0.getString(cursor0.getColumnIndex("sync4"));
                    efpm4 = efpm0;
                    goto label_178;
                }
                else {
                    goto label_337;
                }
                goto label_371;
            }
            catch(Throwable throwable3) {
            label_175:
                efpm4 = efpm0;
                hashSet2 = hashSet3;
                goto label_374;
            }
            try {
            label_178:
                long0 = cursor0.getLong(cursor0.getColumnIndex("_id"));
                hftp2 = ((ProtoLiteMessage)egpn.a).v_newBuilder();
                if(s4 == null && s5 == null && s6 == null && s7 == null) {
                    goto label_181;
                }
                else {
                    goto label_210;
                }
                goto label_211;
            }
            catch(Throwable throwable3) {
                goto label_277;
            }
            try {
            label_181:
                if(s3 == null || s3.equals(long0.toString())) {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp2.b_message;
                    ((egpn)hftv0).c = 1;
                    ((egpn)hftv0).b |= 1;
                    if(!hftv0.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp2.b_message;
                    ((egpn)hftv1).d = 1;
                    ((egpn)hftv1).b |= 2;
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp2.b_message;
                    ((egpn)hftv2).e = 1;
                    ((egpn)hftv2).b |= 4;
                    if(!hftv2.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp2.b_message;
                    ((egpn)hftv3).f = 1;
                    ((egpn)hftv3).b |= 8;
                    if(!hftv3.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((egpn)hftp2.b_message).g = 1;
                    ((egpn)hftp2.b_message).b |= 16;
                    ehar0 = new ehar(false, ((egpn)hftp2.N_build()));
                    goto label_272;
                }
                else {
                    long1 = long0;
                    goto label_211;
                }
            label_210:
                long1 = long0;
            label_211:
                if(s3 != null && !s3.equals(long1.toString())) {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((egpn)hftp2.b_message).g = 2;
                    ((egpn)hftp2.b_message).b |= 16;
                }
                else {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    goto label_219;
                }
                goto label_221;
            }
            catch(Throwable throwable3) {
                goto label_261;
            }
            try {
            label_219:
                ((egpn)hftp2.b_message).g = 1;
                ((egpn)hftp2.b_message).b |= 16;
            }
            catch(Throwable throwable3) {
                goto label_277;
            }
        label_221:
            if(s4 == null) {
                goto label_227;
                try {
                label_229:
                    ((egpn)hftp2.b_message).c = 1;
                    ((egpn)hftp2.b_message).b |= 1;
                }
                catch(Throwable throwable3) {
                    goto label_277;
                }
            }
            else {
                try {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((egpn)hftp2.b_message).c = 2;
                    ((egpn)hftp2.b_message).b |= 1;
                    goto label_231;
                label_227:
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    goto label_229;
                }
                catch(Throwable throwable3) {
                    goto label_261;
                }
            }
        label_231:
            if(s5 == null) {
                goto label_237;
                try {
                label_239:
                    ((egpn)hftp2.b_message).d = 1;
                    ((egpn)hftp2.b_message).b |= 2;
                }
                catch(Throwable throwable3) {
                    goto label_277;
                }
            }
            else {
                try {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((egpn)hftp2.b_message).d = 2;
                    ((egpn)hftp2.b_message).b |= 2;
                    goto label_241;
                label_237:
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    goto label_239;
                }
                catch(Throwable throwable3) {
                    goto label_261;
                }
            }
        label_241:
            if(s6 == null) {
                goto label_247;
                try {
                label_249:
                    ((egpn)hftp2.b_message).e = 1;
                    ((egpn)hftp2.b_message).b |= 4;
                }
                catch(Throwable throwable3) {
                    goto label_277;
                }
            }
            else {
                try {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((egpn)hftp2.b_message).e = 2;
                    ((egpn)hftp2.b_message).b |= 4;
                    goto label_251;
                label_247:
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    goto label_249;
                }
                catch(Throwable throwable3) {
                    goto label_261;
                }
            }
        label_251:
            if(s7 == null) {
                goto label_257;
            label_261:
                egyq1 = egyq0;
                v9 = v2;
                v10 = v3;
                v11 = v4;
                v12 = v5;
                v13 = v6;
                hashSet2 = hashSet3;
                goto label_380;
                try {
                label_269:
                    ((egpn)hftp2.b_message).f = 1;
                    ((egpn)hftp2.b_message).b |= 8;
                label_271:
                    ehar0 = new ehar(true, ((egpn)hftp2.N_build()));
                label_272:
                    z4 = ehar0.a;
                    egpn0 = ehar0.b;
                    if(ehay.c(map1.keySet(), v15, cursor0)) {
                        goto label_279;
                    }
                    else {
                        goto label_333;
                    }
                    goto label_337;
                }
                catch(Throwable throwable3) {
                    goto label_277;
                }
            }
            else {
                try {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((egpn)hftp2.b_message).f = 2;
                    ((egpn)hftp2.b_message).b |= 8;
                    goto label_271;
                label_257:
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    goto label_269;
                }
                catch(Throwable throwable3) {
                    goto label_261;
                }
            }
            goto label_271;
            try {
            label_277:
                hashSet2 = hashSet3;
            }
            catch(Throwable throwable3) {
            }
            goto label_374;
            try {
            label_279:
                ++v2;
                egig.i("FSA2_DeviceContactsMigrater", "%d duplicate %s contacts.", Integer.valueOf(v2), efoy0);
                if(z4) {
                    ++v4;
                    ehav0 = (ehav)map1.get(Long.valueOf(v15));
                    eggh0 = ehav0.b;
                    egpo egpo0 = eggh0.c == null ? egpo.a : eggh0.c;
                    egpk egpk0 = egpo0.d == null ? egpk.a : egpo0.d;
                    if((egpk0.d == null ? egpj.a : egpk0.d).c < hxba0.e().d()) {
                        int v16 = ehas.d(uri0, ehbp1);
                        v3 += v16;
                        v5 += v16;
                        goto label_302;
                    }
                    else {
                        goto label_315;
                    }
                }
                else {
                    v3 += ehas.d(uri0, ehbp1);
                    context1 = context0;
                    account1 = account0;
                    map0 = map1;
                    hashSet1 = hashSet3;
                    goto label_363;
                }
                goto label_333;
            }
            catch(Throwable throwable4) {
                hashSet2 = hashSet3;
                v14 = v1;
                goto label_353;
            }
            try {
            label_302:
                ehas.g(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, ehav0.a), ehas.b(eggh0, egpn0), null, ehbp1);
                hashSet2 = hashSet3;
                goto label_346;
            }
            catch(Throwable throwable4) {
                v14 = v1;
                egyq1 = egyq0;
                v9 = v2;
                v10 = v3;
                v11 = v4;
                v12 = v5;
                v13 = v6;
                hashSet2 = hashSet3;
                goto label_359;
            }
        label_315:
            if(z1) {
                try {
                    hashSet2 = hashSet3;
                    hashSet2.add(s1);
                }
                catch(Throwable throwable4) {
                    v14 = v1;
                    egyq1 = egyq0;
                    v9 = v2;
                    v10 = v3;
                    v11 = v4;
                    v12 = v5;
                    v13 = v6;
                    efpm1 = efpm4;
                    z1 = true;
                    goto label_360;
                }
            }
            else {
                hashSet2 = hashSet3;
            }
            ++v6;
            goto label_346;
            try {
            label_333:
                hashSet2 = hashSet3;
                egig.i("FSA2_DeviceContactsMigrater", "Deleted %d duplicate %s contacts.", Integer.valueOf(v3), efoy0);
                z5 = z4;
                goto label_371;
            label_337:
                efpm4 = efpm0;
                hashSet2 = hashSet3;
                if(ehay.c(set0, v15, cursor0)) {
                    goto label_340;
                }
                else {
                    goto label_370;
                }
                goto label_371;
            }
            catch(Throwable throwable3) {
                goto label_374;
            }
            try {
            label_340:
                ++v2;
                egig.i("FSA2_DeviceContactsMigrater", "%d duplicate %s contacts.", Integer.valueOf(v2), efoy0);
                int v17 = ehas.d(uri0, ehbp1);
                if(v17 > 0) {
                    v3 += v17;
                    egig.i("FSA2_DeviceContactsMigrater", "Deleted %d duplicate %s contacts.", Integer.valueOf(v3), efoy0);
                }
            label_346:
                context1 = context0;
                account1 = account0;
                map0 = map1;
                hashSet1 = hashSet2;
                goto label_363;
            }
            catch(Throwable throwable4) {
                v14 = v1;
            }
        label_353:
            egyq1 = egyq0;
            v9 = v2;
            v10 = v3;
            v11 = v4;
            v12 = v5;
            v13 = v6;
        label_359:
            efpm1 = efpm4;
        label_360:
            throwable2 = throwable4;
            v8 = v7;
            goto label_385;
        label_363:
            contentValues0 = contentValues0;
            efpm0 = efpm4;
            v7 = v7;
            s = s2;
            hashSet0 = hashSet5;
            efur0 = efur0;
            goto label_76;
        label_370:
            z5 = false;
            try {
            label_371:
                v18 = ehas.g(uri0, contentValues0, null, ehbp1);
                goto label_451;
            }
            catch(Throwable throwable3) {
            }
        label_374:
            egyq1 = egyq0;
            v9 = v2;
            v10 = v3;
            v11 = v4;
            v12 = v5;
            v13 = v6;
        label_380:
            efpm1 = efpm4;
        label_381:
            v7 = v7;
        label_382:
            throwable2 = throwable3;
            v8 = v7;
            v14 = v1;
            try {
                try {
                label_385:
                    if(v14 > 0) {
                        cursor1 = cursor0;
                        if(!giqx0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)giqx0).ensureMutable();
                        }
                        girb girb1 = (girb)giqx0.b_message;
                        throwable5 = throwable2;
                        girb1.b |= 2;
                        girb1.d = v14;
                    }
                    else {
                        cursor1 = cursor0;
                        throwable5 = throwable2;
                    }
                    if(!giqx0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx0).ensureMutable();
                    }
                    girb girb2 = (girb)giqx0.b_message;
                    girb2.b |= 0x400;
                    girb2.l = v9;
                    if(!giqx0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx0).ensureMutable();
                    }
                    girb girb3 = (girb)giqx0.b_message;
                    girb3.b |= 0x800;
                    girb3.m = v10;
                    if(z) {
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gira.a).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv4 = hftp3.b_message;
                        ((gira)hftv4).b |= 1;
                        ((gira)hftv4).c = v11;
                        if(!hftv4.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv5 = hftp3.b_message;
                        ((gira)hftv5).b |= 2;
                        ((gira)hftv5).d = v12;
                        if(!hftv5.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv6 = hftp3.b_message;
                        ((gira)hftv6).b |= 4;
                        ((gira)hftv6).e = v13;
                        if(!hftv6.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        gira gira0 = (gira)hftp3.b_message;
                        gira0.b |= 16;
                        gira0.f = v8;
                        gira gira1 = (gira)hftp3.N_build();
                        if(!giqx0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)giqx0).ensureMutable();
                        }
                        girb girb4 = (girb)giqx0.b_message;
                        gira1.getClass();
                        girb4.n = gira1;
                        girb4.b |= 0x1000;
                    }
                    if(z1) {
                        giqx0.a(new ArrayList(hashSet2));
                    }
                    if(hxba.u()) {
                        goto label_438;
                    }
                    goto label_449;
                }
                catch(OperationApplicationException | RemoteException | cjuh unused_ex) {
                    goto label_614;
                }
                try {
                label_438:
                    ProtoLiteBuilder hftp4 = ehas.f(efpm1, egyq1);
                    if(!giqx0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx0).ensureMutable();
                    }
                    girb girb5 = (girb)giqx0.b_message;
                    giqz giqz0 = (giqz)hftp4.N_build();
                    giqz0.getClass();
                    girb5.r = giqz0;
                    girb5.b |= 0x10000;
                    goto label_449;
                }
                catch(cjuh cjuh0) {
                }
                catch(OperationApplicationException | RemoteException unused_ex) {
                    goto label_614;
                }
                try {
                    egig.m("FSA2_DeviceContactsMigrater", "Error when fetch the local account info. ", new Object[]{cjuh0});
                label_449:
                    cursor1.close();
                    throw throwable5;
                }
                catch(OperationApplicationException | RemoteException | cjuh unused_ex) {
                    goto label_614;
                }
            label_451:
                if(v18 > 0) {
                    v1 += v18;
                    if(z && z5) {
                        v7 += v18;
                        account1 = account0;
                        contentValues0 = contentValues0;
                        map0 = map1;
                        hashSet1 = hashSet2;
                        efpm0 = efpm4;
                        goto label_467;
                    }
                }
                account1 = account0;
                contentValues0 = contentValues0;
                map0 = map1;
                hashSet1 = hashSet2;
                efpm0 = efpm4;
                v7 = v7;
            label_467:
                s = s2;
                hashSet0 = hashSet5;
                efur0 = efur0;
                context1 = context0;
                goto label_76;
            label_472:
                context1 = context0;
                account1 = account0;
                hashSet1 = hashSet3;
                contentValues0 = contentValues0;
                v7 = v7;
                goto label_76;
            label_478:
                efpm3 = efpm0;
                hashSet4 = hashSet1;
                z3 = true;
                try {
                label_481:
                    if(v1 > 0) {
                        if(!giqx0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)giqx0).ensureMutable();
                        }
                        girb girb6 = (girb)giqx0.b_message;
                        girb6.b |= 2;
                        girb6.d = v1;
                    }
                    if(!giqx0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx0).ensureMutable();
                    }
                    girb girb7 = (girb)giqx0.b_message;
                    girb7.b |= 0x400;
                    girb7.l = v2;
                    if(!giqx0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx0).ensureMutable();
                    }
                    girb girb8 = (girb)giqx0.b_message;
                    girb8.b |= 0x800;
                    girb8.m = v3;
                    if(z) {
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gira.a).v_newBuilder();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ProtoLiteMessage hftv7 = hftp5.b_message;
                        ((gira)hftv7).b |= 1;
                        ((gira)hftv7).c = v4;
                        if(!hftv7.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ProtoLiteMessage hftv8 = hftp5.b_message;
                        ((gira)hftv8).b |= 2;
                        ((gira)hftv8).d = v5;
                        if(!hftv8.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ProtoLiteMessage hftv9 = hftp5.b_message;
                        ((gira)hftv9).b |= 4;
                        ((gira)hftv9).e = v6;
                        if(!hftv9.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gira gira2 = (gira)hftp5.b_message;
                        gira2.b |= 16;
                        gira2.f = v7;
                        gira gira3 = (gira)hftp5.N_build();
                        if(!giqx0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)giqx0).ensureMutable();
                        }
                        girb girb9 = (girb)giqx0.b_message;
                        gira3.getClass();
                        girb9.n = gira3;
                        girb9.b |= 0x1000;
                    }
                    if(z1) {
                        giqx0.a(new ArrayList(hashSet4));
                    }
                    if(!hxba.u()) {
                        efpm5 = efpm3;
                        goto label_543;
                    }
                }
                catch(OperationApplicationException | RemoteException | cjuh unused_ex) {
                    goto label_614;
                }
                try {
                    efpm5 = efpm3;
                    ProtoLiteBuilder hftp6 = ehas.f(efpm5, egyq0);
                    if(!giqx0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx0).ensureMutable();
                    }
                    girb girb10 = (girb)giqx0.b_message;
                    giqz giqz1 = (giqz)hftp6.N_build();
                    giqz1.getClass();
                    girb10.r = giqz1;
                    girb10.b |= 0x10000;
                    goto label_543;
                }
                catch(cjuh cjuh1) {
                }
                catch(OperationApplicationException | RemoteException unused_ex) {
                    goto label_614;
                }
                try {
                    egig.m("FSA2_DeviceContactsMigrater", "Error when fetch the local account info. ", new Object[]{cjuh1});
                label_543:
                    cursor0.close();
                    ehaq ehaq0 = new ehaq(v1, z3);
                    if(ehaq0.b) {
                        account2 = account0;
                    }
                    else {
                        Bundle bundle0 = new Bundle();
                        bundle0.putBoolean("upload", true);
                        account2 = account0;
                        ContentResolver.requestSync(account2, "com.android.contacts", bundle0);
                    }
                    String s8 = account2.name;
                    int v19 = ehaq0.a;
                    hxba hxba1 = hxba.a;
                    if(hxba1.e().ah()) {
                        ehba0 = this;
                        efur1 = efur0;
                    label_569:
                        ehbp2 = ehba0.d;
                        ehfs0 = new ehfs(new ehab(account2, ehbp2, ehim0, false), account2, ehbp2);
                        ehag0 = ehau.a((hxba.o() ? "(account_type!=\'com.google\' OR (account_name IS NULL AND account_type IS NULL AND data_set IS NULL )) AND system_id IS NULL AND group_is_read_only IS 0" : "account_type!=\'com.google\' AND system_id IS NULL AND group_is_read_only IS 0"), ehbp2);
                        break;
                    }
                    else if(v19 > 0) {
                        efur1 = efur0;
                        goto label_565;
                    }
                    else {
                        efur1 = efur0;
                        if(efur1.E(s8)) {
                            if(v == 2) {
                                long v20 = System.currentTimeMillis();
                                if(v20 - efur1.f(s8) > hxba1.e().h() * 1000L) {
                                    efur1.u(s8, v20);
                                    goto label_565;
                                }
                            }
                            else {
                            label_565:
                                ehba0 = this;
                                goto label_569;
                            }
                        }
                    }
                    goto label_588;
                }
                catch(OperationApplicationException | RemoteException | cjuh unused_ex) {
                    goto label_614;
                }
            }
            catch(Throwable throwable0) {
                goto label_617;
            }
        }
        try {
            map2 = ehau.b(ehag0, efpm5);
            goto label_577;
        }
        catch(Throwable throwable6) {
            try {
                TWR.safeClose$NT(ehag0, throwable6);
                throw throwable6;
            label_577:
                ehag0.close();
                ehau.c(map2, false, ehbp2, account2, giqx0, ehfs0);
                ehag1 = ehau.a("account_type != \"com.google\" AND deleted = 0 AND (group_is_read_only = 1 OR system_id IS NOT NULL)", ehbp2);
            }
            catch(OperationApplicationException | RemoteException | cjuh unused_ex) {
                goto label_614;
            }
            catch(Throwable throwable0) {
                goto label_617;
            }
        }
        try {
            map3 = ehau.b(ehag1, efpm5);
            goto label_585;
        }
        catch(Throwable throwable7) {
            try {
                try {
                    TWR.safeClose$NT(ehag1, throwable7);
                    throw throwable7;
                label_585:
                    ehag1.close();
                    account2 = account0;
                    ehau.c(map3, true, ehbp2, account2, giqx0, ehfs0);
                label_588:
                    egyq2 = new egyq(context0);
                }
                catch(OperationApplicationException | RemoteException | cjuh unused_ex) {
                    goto label_614;
                }
                try {
                    int v21 = egyq2.b();
                    if(!giqx0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giqx0).ensureMutable();
                    }
                    girb girb11 = (girb)giqx0.b_message;
                    girb11.b |= 0x8000;
                    girb11.q = v21;
                    goto label_602;
                }
                catch(cjuh unused_ex) {
                    try {
                        if(!giqx0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)giqx0).ensureMutable();
                        }
                        girb girb12 = (girb)giqx0.b_message;
                        girb12.b |= 0x8000;
                        girb12.q = 0xFFFFFF;
                        egig.b("FSA2_GoogleAccountUtil", "Cannot query the device contact count after sweep.");
                    label_602:
                        if(hxba.a.e().N() && !ehaq0.b) {
                            if(!giqx0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)giqx0).ensureMutable();
                            }
                            ((girb)giqx0.b_message).c = 5;
                        }
                        else {
                            if(!giqx0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)giqx0).ensureMutable();
                            }
                            ((girb)giqx0.b_message).c = 1;
                        }
                        ((girb)giqx0.b_message).b |= 1;
                        efur1.O(account2.name, 2);
                        goto label_625;
                    }
                    catch(OperationApplicationException | RemoteException | cjuh unused_ex) {
                    }
                    goto label_614;
                }
                catch(OperationApplicationException | RemoteException unused_ex) {
                label_614:
                    egig.b("FSA2_GoogleAccountUtil", "@prepareToSync Failed to migrate the groups.");
                    goto label_625;
                }
            }
            catch(Throwable throwable0) {
            }
        }
    label_617:
        girb girb13 = (girb)((ProtoLiteBuilder)giqx0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        girg girg0 = (girg)hftp0.b_message;
        girb13.getClass();
        girg0.d = girb13;
        girg0.b |= 2;
        throw throwable0;
    label_625:
        girb girb14 = (girb)((ProtoLiteBuilder)giqx0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        girg girg1 = (girg)hftp0.b_message;
        girb14.getClass();
        girg1.d = girb14;
        girg1.b |= 2;
    }

    public static ehba[] values() {
        return (ehba[])ehba.c.clone();
    }
}

