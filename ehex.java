import android.accounts.Account;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncRequest.Builder;
import android.content.SyncResult;
import android.content.SyncStats;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.Groups;
import android.text.TextUtils;
import com.google.android.gms.people.cpg.model.GroupContactOrder;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import jeb.synthetic.TWR;

public final class ehex implements Closeable {
    private static List a;
    private static eheq b;
    private static ehet c;
    private static ehes d;
    private final Account e;
    private final Bundle f;
    private final String g;
    private final ehev h;
    private final ehim i;
    private final SyncResult j;
    private final egzp k;
    private final String l;
    private final String m;
    private final ehdl n;
    private final ehaz o;
    private final ehje p;
    private final efur q;
    private final ehft r;
    private final egzr s;
    private final egzq t;
    private final eheu u;
    private final egzz v;
    private final boolean w;

    public ehex(Account account0, Bundle bundle0, Context context0, ehbp ehbp0, ehim ehim0, egzp egzp0, bbng bbng0, egke egke0, efur efur0, gsts gsts0, String s, String s1) {
        ehbg ehbg1;
        this.e = account0;
        this.f = bundle0;
        this.g = bundle0.getString("feed");
        this.i = ehim0;
        this.j = ((ehiv)ehim0).a;
        this.k = egzp0;
        this.l = s;
        this.m = s1;
        this.q = efur0;
        this.v = new egzz();
        boolean z = ehiz.a(bundle0);
        this.w = z;
        egiv.R();
        egzr egzr0 = new egzr(context0);
        this.s = egzr0;
        this.t = new egzq(egzr0, ehim0);
        ehbg ehbg0 = new ehbg(new ehbk(ehbp0, account0));
        ehje ehje0 = ehjf.a(context0);
        this.p = ehje0;
        this.h = new ehev(account0, ehbg0, ehje0);
        this.r = new ehft(context0, ehbp0, account0, egzp0);
        ehga ehga0 = new ehga(account0, ehbp0, egzr0, ehim0);
        boolean z1 = hwzc.a.c().ah();
        Boolean.valueOf(z1).getClass();
        baqr baqr0 = z1 ? egjx.a(context0, account0) : egjx.b(context0, account0.name, "80");
        String s2 = bapf.c(context0);
        ehaz ehaz0 = new ehaz(context0, efur0, ehim0, account0.name, z);
        this.o = ehaz0;
        if(ehaz0.f && ehaz0.e) {
            ((ehiv)ehaz0.c).A = true;
            ehbg1 = ehbg0;
        }
        else {
            int v = ehaz0.b.M(ehaz0.d);
            switch(v - 1) {
                case 0: {
                    ehbg1 = ehbg0;
                    egig.e("FSA2_FirstFullSyncsDetector", "First full syncs happened before we enabled the logging.");
                    ehaz0.b.N(ehaz0.d, 4);
                    batl.k(null);
                    ehaz0.b.a.edit().remove("focus_first_full_sync_initial_timestamp_" + ehaz0.d).commit();
                    ehaz0.b.p(ehaz0.d);
                    ehaz0.b.o(ehaz0.d);
                    break;
                }
                case 1: {
                    egig.e("FSA2_FirstFullSyncsDetector", "First full syncs started");
                    ehaz0.b.N(ehaz0.d, 3);
                    batl.k(null);
                    ehbg1 = ehbg0;
                    ehaz0.b.a.edit().putLong("focus_first_full_sync_start_timestamp_" + ehaz0.d, System.currentTimeMillis()).commit();
                    ehaz0.c.n();
                    break;
                }
                default: {
                    if(v - 1 == 2) {
                        egig.e("FSA2_FirstFullSyncsDetector", "First full syncs started and continue");
                        ehaz0.c.n();
                    }
                    else {
                        egig.e("FSA2_FirstFullSyncsDetector", "First full syncs finished before.");
                    }
                    ehbg1 = ehbg0;
                }
            }
            ehaz0.b(v);
        }
        if(hxdh.d()) {
            String s3 = bundle0.getString("tickle_sync_changed_contacts_id");
            if(!gfta.c(s3)) {
                List list0 = gfud.e(';').n(s3);
                Set set0 = efur0.l(account0.name);
                for(Object object0: list0) {
                    String s4 = (String)object0;
                    if(set0.contains(s4)) {
                        ((ehiv)ehim0).j.add(s4);
                    }
                }
            }
        }
        ehdl ehdl0 = new ehdl(context0, account0, efur0, ehim0);
        this.n = ehdl0;
        ehif ehif0 = new ehif(context0, ehim0, new gfug(gfqs.a));
        gfug gfug0 = new gfug(gfqs.a);
        ehcp ehcp0 = new ehcp(context0, baqr0, egke0, s2, bbnk.a, gfug0, ehim0, gsts0, this.p, ehdl0, this.r, this.s);
        gfug gfug1 = new gfug(gfqs.a);
        ehex.b = new eheq(context0, ehcp0, new ehcq(context0, baqr0, egke0, s2, bbnk.a, gfug1, ehim0, gsts0, this.p, this.s), ehbg1, ehbp0, ehga0, account0, ehim0, egzp0, bbng0, ehif0, ehdl0, this.s, this.t, this.v);
        gfug gfug2 = new gfug(gfqs.a);
        ehex.c = new ehet(context0, new ehco(context0, baqr0, egke0, s2, bbnk.a, gfug2, ehim0, gsts0, this.p, ehdl0, this.v, ehbg1), ehbg1, ehbp0, ehga0, account0, ehim0, egzp0, bbng0, efur0, ehif0, ehdl0);
        gfug gfug3 = new gfug(gfqs.a);
        ehex.d = new ehes(context0, new ehcs(context0, baqr0, egke0, s2, bbnk.a, gfug3, ehim0, gsts0, this.p), ehbp0, account0, ehim0, egzp0, new ehfz(ehbp0), ehif0, ehdl0);
        this.u = new eheu(context0, ehbg1, ehbp0, ehga0, account0, ehim0, egzp0, ehif0, this.s, this.t, this.v);
        ehex.a = this.w ? Arrays.asList(new ehew[]{ehex.b, ehex.c}) : Arrays.asList(new ehew[]{ehex.b, ehex.c, ehex.d});
    }

    public final void a() {
        int v38;
        ehim ehim5;
        ehim ehim4;
        int v36;
        boolean z6;
        File file2;
        int v35;
        Throwable throwable18;
        FileOutputStream fileOutputStream1;
        ParcelFileDescriptor parcelFileDescriptor2;
        ParcelFileDescriptor[] arr_parcelFileDescriptor;
        File file1;
        ParcelFileDescriptor parcelFileDescriptor1;
        Throwable throwable14;
        FileOutputStream fileOutputStream0;
        girk girk1;
        byte[] arr_b2;
        byte[] arr_b1;
        Long long7;
        Long long6;
        int v33;
        Throwable throwable8;
        Cursor cursor3;
        int v26;
        ehgd ehgd0;
        ehai ehai0;
        Cursor cursor2;
        ehcs ehcs1;
        boolean z5;
        egzp egzp2;
        ehdl ehdl1;
        ehim ehim2;
        ehdl ehdl0;
        egzp egzp1;
        ehim ehim1;
        ehcs ehcs0;
        Uri uri0;
        ehbp ehbp0;
        Context context0;
        hxdb hxdb0;
        Cursor cursor1;
        egzp egzp0;
        ehab ehab0;
        ehes ehes1;
        ehes ehes0;
        Object object2;
        gged_interceptors gged2;
        int v14;
        ggeo ggeo5;
        ggeo ggeo4;
        int v13;
        Cursor cursor0;
        HashMap hashMap0;
        ggeo ggeo2;
        ggfp ggfp0;
        ggqk ggqk1;
        ehfx ehfx0;
        ggeo ggeo1;
        ggfn ggfn0;
        ehft ehft0;
        gged_interceptors gged0;
        egzy egzy0;
        ggqk ggqk0;
        ggeo ggeo0;
        String s1;
        ehif ehif0;
        eheu eheu0;
        ehbg ehbg0;
        boolean z1;
        ehev ehev0;
        ehex ehex0 = this;
        int v = 2;
        ehex.c(2);
        egiv.R();
        boolean z = egiv.n().booleanValue();
        try {
            ehev0 = ehex0.h;
            if(ehex0.f != null && ehex0.f.getBoolean("upload", false)) {
                egyn egyn0 = ehev0.b.a.b();
                if(!TextUtils.isEmpty((1 == (egyn0.b & 1) ? egyn0.c : null))) {
                    z1 = z;
                    goto label_633;
                }
                goto label_11;
            }
            else {
            label_11:
                egiv.R();
                if(egiv.g().booleanValue()) {
                    ehbg0 = ehev0.b;
                    long v1 = ehbg0.a();
                    egiv.R();
                    long v2 = (long)egiv.P();
                    goto label_21;
                }
                goto label_72;
            }
            goto label_633;
        }
        catch(Throwable throwable0) {
            z1 = z;
            goto label_664;
        }
        try {
        label_21:
            if(System.currentTimeMillis() - v1 > v2 * 1000L) {
                egiv.R();
                if(egiv.q().booleanValue()) {
                    ehje ehje0 = ehev0.c;
                    if(ehje0.b) {
                        goto label_30;
                    }
                    else {
                        egiv.R();
                        int v3 = (int)hwzc.a.c().P();
                        Integer.valueOf(v3).getClass();
                        if(ehje0.c >= v3) {
                            goto label_30;
                        }
                        else {
                            goto label_64;
                        }
                    }
                }
                else {
                label_30:
                    egig.k("FSA2_SyncAssistant", "Trigger periodic full sync.");
                    long v4 = System.currentTimeMillis();
                    egig.m("FSA2_PeopleSyncState", "@resetToFullSync = %d", new Object[]{v4});
                    egyn egyn1 = ehbg0.a.b();
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)egyn1).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)egyn1));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    egyn egyn2 = (egyn)hftp0.b_message;
                    egyn2.b &= -5;
                    egyn egyn3 = egyn.a;
                    egyn2.e = egyn3.e;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((egyn)hftv0).b &= -9;
                    ((egyn)hftv0).f = egyn3.f;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((egyn)hftv1).b &= -2;
                    ((egyn)hftv1).c = egyn3.c;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    ((egyn)hftv2).b &= -3;
                    ((egyn)hftv2).d = egyn3.d;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    egyn egyn4 = (egyn)hftp0.b_message;
                    egyn4.b |= 0x20;
                    egyn4.g = v4;
                    ehbg0.g(((egyn)hftp0.N_build()));
                    goto label_72;
                label_64:
                    egig.k("FSA2_SyncAssistant", "Delay periodic full sync until charging.");
                    SyncRequest.Builder syncRequest$Builder0 = new SyncRequest.Builder();
                    syncRequest$Builder0.setSyncAdapter(ehev0.a, "com.android.contacts");
                    syncRequest$Builder0.setRequiresCharging(true);
                    syncRequest$Builder0.setIgnoreBackoff(true);
                    syncRequest$Builder0.setExtras(new Bundle());
                    syncRequest$Builder0.syncOnce();
                    ContentResolver.requestSync(syncRequest$Builder0.build());
                }
            }
        label_72:
            String s = ehex0.g;
        }
        catch(Throwable throwable0) {
            z1 = z;
            goto label_664;
        }
        if(s != null) {
            try {
                egiv.R();
                long v5 = hwzc.a.c().O();
                Long long0 = v5;
                long0.getClass();
                if(v5 > 0L) {
                    try {
                        ehex0.k.d();
                        long0.getClass();
                        Thread.sleep(v5);
                        ehex0.k.d();
                    }
                    catch(InterruptedException unused_ex) {
                    }
                }
            label_87:
                if(s == null || (s.startsWith(ehex0.m) || s.startsWith(ehex0.l))) {
                    ehex.b.a();
                    ehex.c.a();
                    if(hwyi.z() && !ehex0.w) {
                        eheu0 = ehex0.u;
                        ehif0 = eheu0.d;
                        ehif0.a();
                        eheu0.h = 0;
                        eheu0.i = 0;
                        goto label_97;
                    }
                    else {
                        goto label_269;
                    }
                }
                else {
                    goto label_267;
                }
                goto label_273;
            }
            catch(Throwable throwable1) {
                goto label_265;
            }
        }
        goto label_87;
        try {
        label_97:
            egzq egzq0 = eheu0.f;
            if(egzq0.b()) {
                s1 = egzq0.c.b;
                ggeo0 = ggeo.k(egzq0.c.d);
                ggqk0 = gged_interceptors.i(egzq0.c.c).E();
                while(true) {
                label_102:
                    if(ggqk0.hasNext()) {
                        goto label_103;
                    }
                    goto label_253;
                }
            }
            else {
                goto label_262;
            }
            goto label_273;
        }
        catch(Throwable throwable2) {
            goto label_126;
        }
        try {
        label_103:
            Object object0 = ggqk0.next();
            egzy0 = (egzy)object0;
            gged0 = (gged_interceptors)ggeo0.get(egzy0);
            if(gged0 == null) {
                goto label_241;
            }
            else {
                long v6 = hwyi.a.e().f();
                ehft0 = eheu0.g;
                if(gged0.isEmpty()) {
                    goto label_128;
                }
                else {
                    ggfn0 = new ggfn();
                    int v7 = gged0.size();
                    goto label_116;
                }
                goto label_131;
            }
            goto label_244;
        }
        catch(Throwable throwable2) {
            try {
                z1 = z;
                goto label_258;
            label_116:
                z1 = z;
                for(int v8 = 0; v8 < v7; ++v8) {
                    ggfn0.k(((ehhx)gged0.get(v8)).e);
                }
                ggeo1 = ehft0.g(ggfn0.h().v());
                ehfx0 = eheu0.b;
                goto label_131;
            }
            catch(Throwable throwable2) {
                goto label_258;
            }
        }
        try {
        label_126:
            z1 = z;
            goto label_258;
        }
        catch(Throwable throwable1) {
            goto label_272;
        }
        try {
        label_128:
            z1 = z;
            ggeo1 = ehft0.g(ggnj.a.v());
            ehfx0 = eheu0.b;
        label_131:
            if(gged0.isEmpty()) {
                ggfp0 = ggnj.a;
                ggqk1 = ggqk0;
            }
            else {
                ggfn ggfn1 = new ggfn();
                int v9 = gged0.size();
                ggqk1 = ggqk0;
                for(int v10 = 0; v10 < v9; ++v10) {
                    ggfn1.i(((ehhx)gged0.get(v10)).a);
                }
                ggfp0 = ggfn1.h();
            }
            gged_interceptors gged1 = ggfp0.v();
            StringBuilder stringBuilder0 = new StringBuilder();
            Iterator iterator0 = gged1.iterator();
            for(boolean z2 = true; iterator0.hasNext(); z2 = false) {
                Object object1 = iterator0.next();
                if(!z2) {
                    stringBuilder0.append(",");
                }
                DatabaseUtils.appendEscapedSQLString(stringBuilder0, ((String)object1));
                iterator0 = iterator0;
            }
            ggeo2 = ggeo0;
            hashMap0 = new HashMap();
            cursor0 = ehfx0.a.a(ehab.c(ContactsContract.Groups.CONTENT_URI, ehfx0.b), new String[]{"_id", "sourceid", "sync2"}, "sourceid in (" + stringBuilder0 + ") OR (sync2 in (" + stringBuilder0 + ") AND sourceid IS NULL)", null, null);
        }
        catch(Throwable throwable2) {
            goto label_258;
        }
        if(cursor0 == null) {
            goto label_171;
        }
        else {
            while(true) {
                try {
                    if(!cursor0.moveToNext()) {
                        goto label_171;
                    }
                    Long long1 = cursor0.getLong(0);
                    String s2 = cursor0.getString(1);
                    if(gfta.c(s2)) {
                        s2 = cursor0.getString(2);
                    }
                    hashMap0.put(s2, long1);
                }
                catch(Throwable throwable3) {
                    try {
                        TWR.safeClose$NT(cursor0, throwable3);
                        throw throwable3;
                    label_171:
                        if(cursor0 != null) {
                            cursor0.close();
                        }
                    label_173:
                        ggeo ggeo3 = ggeo.k(hashMap0);
                        HashSet hashSet0 = new HashSet();
                        int v11 = gged0.size();
                        int v12 = 0;
                        while(v12 < v11) {
                            ehhx ehhx0 = (ehhx)gged0.get(v12);
                            String s3 = ehhx0.a;
                            if(!ggeo3.containsKey(s3)) {
                                v13 = v11;
                                egig.d(eheu.a, "failed to convert group ID for pending Group Contact Order: %s", new Object[]{s3});
                                ggeo4 = ggeo3;
                                ggeo5 = ggeo1;
                                v14 = v12;
                                gged2 = gged0;
                                object2 = null;
                                goto label_210;
                            }
                            v13 = v11;
                            Long long2 = (Long)ggeo3.get(s3);
                            ggdy ggdy0 = new ggdy();
                            ggeo4 = ggeo3;
                            gged_interceptors gged3 = ehhx0.e;
                            v14 = v12;
                            int v15 = gged3.size();
                            gged2 = gged0;
                            int v16 = 0;
                        label_198:
                            if(v16 >= v15) {
                                gged_interceptors gged4 = ggdy0.h();
                                ggeo5 = ggeo1;
                                eheu0.e.d.b.a(ContentProviderOperation.newAssertQuery(ContentUris.withAppendedId(eheu0.e.d.a, long2.longValue())).withValue("sync2", ehhx0.b).withExpectedCount(1), false);
                                ContentValues contentValues0 = new ContentValues();
                                contentValues0.put("sync2", ehhx0.c);
                                eheu0.e.d.e(eheu0.e.d.a, long2, contentValues0, true);
                                egfe egfe0 = new egfe(ehhx0.d);
                                egfe0.b();
                                egfe0.a = long2.toString();
                                egfe0.c(gged4);
                                object2 = egfe0.a();
                            label_210:
                                if(object2 == null) {
                                    egig.b(eheu.a, "Failed to convert group contact order");
                                    throw new ehfh(new ehfg(9, "Failed to convert GroupContactOrder in SecondPass"));
                                }
                                ++eheu0.h;
                                hashSet0.add(object2);
                                girk girk0 = ((GroupContactOrder)object2).a() == 0L ? girk.g : girk.h;
                                gjgi gjgi0 = gjgi.h;
                                ehim ehim0 = eheu0.j;
                                ehim0.h(girk0, gjgi0, true, 1, 1);
                                if(eheu0.i > 0) {
                                    ehim0.h(girk0, gjgi0, true, 11, 1);
                                    eheu0.i = 0;
                                }
                                if(((long)hashSet0.size()) >= v6) {
                                    eheu0.a(ggfp.G(hashSet0));
                                    hashSet0.clear();
                                }
                                v12 = v14 + 1;
                                v11 = v13;
                                ggeo3 = ggeo4;
                                gged0 = gged2;
                                ggeo1 = ggeo5;
                                continue;
                            }
                            String s4 = (String)gged3.get(v16);
                            if(ggeo1.containsKey(s4)) {
                                ggdy0.i(((Long)ggeo1.get(s4)));
                            }
                            else {
                                ++eheu0.i;
                            }
                            ++v16;
                            gged3 = gged3;
                            goto label_198;
                        }
                        eheu0.a(ggfp.G(hashSet0));
                        goto label_244;
                    label_241:
                        z1 = z;
                        ggqk1 = ggqk0;
                        ggeo2 = ggeo0;
                    label_244:
                        String s5 = egzy0.a;
                        if(!TextUtils.isEmpty(s5) && s5 != null) {
                            eheu0.c.e(s5);
                        }
                        else {
                            eheu0.c.f(s1);
                        }
                        z = z1;
                        ggqk0 = ggqk1;
                        ggeo0 = ggeo2;
                        goto label_102;
                    label_253:
                        z1 = z;
                        eheu0.k.b(ContactsContract.Groups.CONTENT_URI);
                        eheu0.b.h(eheu0.m, eheu0.l);
                        goto label_260;
                    }
                    catch(Throwable throwable2) {
                        goto label_258;
                    }
                }
            }
        }
        goto label_173;
        try {
        label_258:
            eheu0.d.b("FSA_secondPassGroupSync", eheu0.h);
            throw throwable2;
        label_260:
            eheu0.d.b("FSA_secondPassGroupSync", eheu0.h);
            goto label_273;
        }
        catch(Throwable throwable1) {
            goto label_272;
        }
        try {
        label_262:
            ehif0.b("FSA_secondPassGroupSync", eheu0.h);
        }
        catch(Throwable throwable1) {
        label_265:
            z1 = z;
            goto label_629;
        }
        try {
        label_267:
            z1 = z;
            goto label_273;
        label_269:
            z1 = z;
        }
        catch(Throwable throwable1) {
        label_272:
            goto label_629;
        }
    label_273:
        if(!ehex0.w) {
            try {
                ehes0 = ehex.d;
                if(!hwzc.a.c().aV()) {
                    ehes1 = ehes0;
                }
                else if(ehes0.h.f == 1) {
                    ehes1 = ehes0;
                }
                else {
                    ehab0 = ehes0.c;
                    egzp0 = ehes0.l;
                    cursor1 = ehes0.i.a(ehab.c(ContactsContract.Data.CONTENT_URI, ehes0.j), ehgb.a, "mimetype=\'vnd.android.cursor.item/photo\' AND data_sync2 IS NOT NULL AND starred=1", null, null);
                    goto label_284;
                }
                goto label_320;
            }
            catch(Throwable throwable1) {
                goto label_628;
            }
        label_284:
            if(cursor1 == null) {
                throw new ehfh(new RemoteException("Unable to get photos."));
            }
            try {
                egiv.R();
                int v17 = (int)egiv.N();
                int v18 = (int)hxdb.a.b().a();
                if(cursor1.getCount() <= v18) {
                    int v19 = 0;
                    while(cursor1.moveToNext() && v19 < v17) {
                        egzp0.d();
                        long v20 = cursor1.getLong(0);
                        String s6 = cursor1.getString(1);
                        String s7 = ehcv.b(s6);
                        boolean z3 = ehcv.d(s6);
                        long v21 = cursor1.getLong(2);
                        Long long3 = v21;
                        String s8 = cursor1.getString(3);
                        long v22 = cursor1.getLong(4);
                        Long long4 = v22;
                        if(!z3 && s8 == null && ehie.b(long3, long4)) {
                            long3.getClass();
                            ContentProviderOperation.Builder contentProviderOperation$Builder0 = ehah.b(v20, v21).withValue("data_sync1", ehcv.a(s7, true)).withValue("data_sync3", null);
                            long4.getClass();
                            ehab0.e(contentProviderOperation$Builder0.withValue("data_sync4", Long.valueOf(v22 + 1L)));
                            ehab0.h();
                            ++v19;
                        }
                        ehes0 = ehes0;
                    }
                    ehes1 = ehes0;
                    ehab0.f();
                }
                else {
                    ehes1 = ehes0;
                    egig.e("FSA2_MarkHighResPhotoUtil", "Starred contact photos exceeds the limit to sync as high resolution");
                }
                goto label_319;
            }
            catch(Throwable throwable4) {
                try {
                    TWR.safeClose$NT(cursor1, throwable4);
                    throw throwable4;
                label_319:
                    cursor1.close();
                label_320:
                    hxdb0 = hxdb.a;
                    boolean z4 = hxdb0.b().f();
                    context0 = ehes1.f;
                    ehbp0 = ehes1.i;
                    uri0 = ehes1.e;
                    ehcs0 = ehes1.b;
                    ehim1 = ehes1.k;
                    egzp1 = ehes1.l;
                    ehdl0 = ehes1.g;
                    if(!hxdb.e() || ehjo.a(context0) != 1) {
                        ehim2 = ehim1;
                        ehdl1 = ehdl0;
                        egzp2 = egzp1;
                        z5 = false;
                        ehcs1 = ehcs0;
                    }
                    else {
                        cursor2 = ehbp0.a(uri0, ehes.a, "mimetype=\'vnd.android.cursor.item/photo\' AND (data15 IS NOT NULL OR data_sync2 IS NOT NULL )", null, null);
                        goto label_337;
                    }
                    goto label_357;
                }
                catch(Throwable throwable1) {
                    goto label_628;
                }
            }
        label_337:
            if(cursor2 == null) {
                goto label_352;
            }
            else {
                try {
                    long v23 = (long)cursor2.getCount();
                    long v24 = hxdb0.b().b();
                    goto label_344;
                }
                catch(Throwable throwable5) {
                    try {
                        TWR.safeClose$NT(cursor2, throwable5);
                        throw throwable5;
                    label_344:
                        cursor2.close();
                        if(v23 <= v24) {
                            ehcs1 = ehcs0;
                            ehim2 = ehim1;
                            egzp2 = egzp1;
                            ehdl1 = ehdl0;
                            z5 = true;
                        }
                        else {
                        label_352:
                            ehcs1 = ehcs0;
                            ehim2 = ehim1;
                            egzp2 = egzp1;
                            ehdl1 = ehdl0;
                            z5 = false;
                        }
                    label_357:
                        ehai0 = ehai.a(context0, ehbp0, uri0, ehcs1, ehim2, egzp2, ehdl1, z5);
                        goto label_358;
                    }
                    catch(Throwable throwable1) {
                        goto label_628;
                    }
                }
            }
            goto label_357;
            try {
            label_358:
                int v25 = ehes1.a(ehai0, true);
                goto label_363;
            }
            catch(Throwable throwable6) {
                try {
                    TWR.safeClose$NT(ehai0, throwable6);
                    throw throwable6;
                label_363:
                    ehai0.close();
                    ehgd0 = ehes1.d;
                    v26 = 0;
                    while(true) {
                    label_366:
                        hwzv hwzv0 = hwzv.a;
                        if(((long)v26) >= hwzv0.b().b()) {
                            egig.b("FSA2_PhotoHashKeyWriter", "There might still photos need to regenerate hash key. Will do in next sync.");
                            throw new ehfh(new RemoteException("Too many photos when generating hash key."));
                        }
                        Uri uri1 = ehab.c(ContactsContract.Data.CONTENT_URI, ehgd0.a);
                        long v27 = hwzv0.b().a();
                        Uri uri2 = uri1.buildUpon().appendQueryParameter("limit", Long.toString(v27)).build();
                        cursor3 = ehgd0.b.a(uri2, ehgc.b, ehgc.a, null, null);
                        break;
                    }
                }
                catch(Throwable throwable1) {
                    goto label_628;
                }
            }
            try {
                if(cursor3 == null) {
                    throw new ehfh(new RemoteException("Cannot query CP2."));
                }
                int v28 = cursor3.getCount();
            }
            catch(Throwable throwable7) {
                throwable8 = throwable7;
                goto label_399;
            }
            if(v28 == 0) {
                goto label_408;
            }
            try {
                while(cursor3.moveToNext()) {
                    ehgd0.d.d();
                    long v29 = cursor3.getLong(0);
                    String s9 = cursor3.getString(1);
                    byte[] arr_b = cursor3.getBlob(2);
                    long v30 = cursor3.getLong(3);
                    long v31 = cursor3.getLong(4);
                    Long long5 = v31;
                    ContentProviderOperation.Builder contentProviderOperation$Builder1 = ehah.b(v29, v30).withValue("data_sync1", (ehie.b(Long.valueOf(v30), long5) ? ehcv.c(s9, Long.toString(ehgd.a(arr_b))) : ehcv.c(s9, "*")));
                    long5.getClass();
                    ehgd0.c.e(contentProviderOperation$Builder1.withValue("data_sync4", Long.valueOf(v31 + 1L)));
                    ehgd0.c.h();
                }
                ehgd0.c.f();
                goto label_405;
            }
            catch(Throwable throwable9) {
                try {
                    throwable8 = throwable9;
                }
                catch(Throwable throwable1) {
                    goto label_628;
                }
            }
        label_399:
            if(cursor3 != null) {
                try {
                    cursor3.close();
                }
                catch(Throwable throwable10) {
                    try {
                        throwable8.addSuppressed(throwable10);
                        throw throwable8;
                    label_405:
                        cursor3.close();
                        ++v26;
                        goto label_366;
                    label_408:
                        cursor3.close();
                        if(hwzc.a.c().au()) {
                            ehes1.f("mimetype=\'vnd.android.cursor.item/photo\' AND data15 IS NOT NULL", gjgi.d);
                            ehes1.f("mimetype=\'vnd.android.cursor.item/photo\' AND data15 IS NOT NULL AND data14 IS NOT NULL", gjgi.f);
                            if(!z4 || v25 > 0) {
                                hxdb hxdb1 = hxdb.a;
                                if(hxdb1.b().e()) {
                                    ehes1.g("mimetype=\'vnd.android.cursor.item/photo\' AND data15 IS NULL AND data_sync2 IS NOT NULL", 4, 1);
                                }
                                if(hxdb1.b().d()) {
                                    ehes1.g("mimetype=\'vnd.android.cursor.item/photo\' AND data15 IS NULL AND data_sync2 IS NOT NULL AND data_sync1 LIKE \'%Sync_High_Res\'", 5, 1);
                                    ehes1.g("mimetype=\'vnd.android.cursor.item/photo\' AND data15 IS NOT NULL AND data14 IS NOT NULL AND data_sync1 LIKE \'%Sync_High_Res\'", 6, 1);
                                    ehes1.g("mimetype=\'vnd.android.cursor.item/photo\' AND data15 IS NOT NULL AND data14 IS NULL AND data_sync1 LIKE \'%Sync_High_Res\'", 7, 1);
                                }
                                ehes1.g("mimetype=\'vnd.android.cursor.item/photo\' AND data15 IS NOT NULL AND data14 IS NULL AND starred=0", 3, 3);
                                ehes1.g("mimetype=\'vnd.android.cursor.item/photo\' AND data15 IS NOT NULL AND data14 IS NULL AND starred=1", 3, 2);
                                ehes1.g("mimetype=\'vnd.android.cursor.item/photo\' AND data15 IS NOT NULL AND data14 IS NOT NULL AND starred=0", 2, 3);
                                ehes1.g("mimetype=\'vnd.android.cursor.item/photo\' AND data15 IS NOT NULL AND data14 IS NOT NULL AND starred=1", 2, 2);
                            }
                        }
                        if(((ehiv)ehes1.k).D) {
                            gged_interceptors gged5 = eham.a(ehes1.f, ehes1.i, ehes1.j);
                            int v32 = ((ggna)gged5).c;
                            v33 = 0;
                            while(true) {
                            label_428:
                                if(v33 >= v32) {
                                    break;
                                }
                                ContentValues contentValues1 = (ContentValues)gged5.get(v33);
                                long6 = contentValues1.getAsLong("x_calling_card_id");
                                gftb.check(long6);
                                String s10 = contentValues1.getAsString("x_sync1");
                                long7 = contentValues1.getAsLong("x_data_version");
                                if(TextUtils.isEmpty(s10)) {
                                    egig.g("FSA2_PhotoSyncer", "Will delete the CCC photo from CPG for calling card %d", long6);
                                    arr_b1 = null;
                                }
                                else {
                                    try {
                                        ehcs ehcs2 = ehes1.b;
                                        hxau hxau0 = hxau.a;
                                        arr_b2 = hxau0.b().f() ? ehcs2.a(s10 + "=" + hxau0.b().b()) : ehcs2.a(s10);
                                        if(arr_b2 != null) {
                                            long v34 = hxau0.b().a();
                                            if(((long)arr_b2.length) > v34) {
                                                egig.k("FSA2_PhotoSyncGrpc", "Photo bytes length is larger than the max bytes for FIFE photo read. Reading the photo with a smaller size.");
                                                arr_b1 = ehcs2.a(s10 + "=" + hxau0.b().c());
                                                goto label_456;
                                            }
                                        }
                                    }
                                    catch(ExecutionException | InterruptedException exception0) {
                                        egig.c("FSA2_PhotoSyncer", "Failed to read photo from FIFE", exception0);
                                        ehes1.d(girk.c, true);
                                        ehes1.e(girk.c, true);
                                        ehim ehim3 = ehes1.k;
                                        ehim3.r(gjgi.j, girk.c, "READ_FIFE_PHOTO_FAILED", exception0);
                                        ++((ehiv)ehim3).a.stats.numIoExceptions;
                                        goto label_621;
                                    }
                                    arr_b1 = arr_b2;
                                }
                            label_456:
                                girk1 = girk.c;
                                if(arr_b1 == null) {
                                    goto label_458;
                                }
                                else {
                                    goto label_461;
                                }
                                goto label_530;
                            }
                        }
                        goto label_625;
                    }
                    catch(Throwable throwable1) {
                        goto label_628;
                    }
                }
            }
            throw throwable8;
        label_458:
            File file0 = null;
            ParcelFileDescriptor parcelFileDescriptor0 = null;
            goto label_530;
            try {
            label_461:
                if(hxau.a.b().i()) {
                    file0 = File.createTempFile(UUID.randomUUID().toString(), ".jpg", ehes1.f.getCacheDir());
                    fileOutputStream0 = new FileOutputStream(file0);
                    goto label_464;
                }
                else {
                    goto label_484;
                }
                goto label_530;
            }
            catch(egdi egdi0) {
                goto label_522;
            }
            catch(IOException iOException0) {
                goto label_518;
            }
            catch(Throwable throwable11) {
                goto label_526;
            }
            try {
            label_464:
                fileOutputStream0.write(arr_b1);
                goto label_473;
            }
            catch(Throwable throwable12) {
                try {
                    throwable14 = throwable12;
                    fileOutputStream0.close();
                    throw throwable14;
                }
                catch(Throwable throwable13) {
                    try {
                        throwable14.addSuppressed(throwable13);
                        throw throwable14;
                    label_473:
                        fileOutputStream0.close();
                    }
                    catch(egdi egdi0) {
                        goto label_522;
                    }
                    catch(IOException iOException0) {
                        goto label_518;
                    }
                    catch(Throwable throwable11) {
                        goto label_526;
                    }
                }
            }
            try {
                parcelFileDescriptor1 = ParcelFileDescriptor.open(file0, 0x10000000);
                goto label_482;
            }
            catch(egdi egdi0) {
                file1 = file0;
                goto label_543;
            }
            catch(IOException iOException0) {
                file1 = file0;
                goto label_547;
            label_482:
                parcelFileDescriptor0 = parcelFileDescriptor1;
                goto label_530;
                try {
                    try {
                    label_484:
                        arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
                        goto label_489;
                    }
                    catch(IOException iOException1) {
                    }
                    catch(egdi egdi0) {
                        goto label_522;
                    }
                    try {
                        egig.c("FSA2_LocalPhotoReader", "Failed to create pipe", iOException1);
                        throw iOException1;
                    label_489:
                        parcelFileDescriptor0 = arr_parcelFileDescriptor[0];
                        parcelFileDescriptor2 = arr_parcelFileDescriptor[1];
                    }
                    catch(egdi egdi0) {
                        goto label_522;
                    }
                    catch(IOException iOException0) {
                        goto label_518;
                    }
                }
                catch(Throwable throwable11) {
                    goto label_526;
                }
                try {
                    fileOutputStream1 = new FileOutputStream(parcelFileDescriptor2.getFileDescriptor());
                }
                catch(IOException iOException2) {
                    goto label_504;
                }
                catch(Throwable throwable15) {
                    goto label_507;
                }
                try {
                    fileOutputStream1.write(arr_b1);
                    goto label_501;
                }
                catch(Throwable throwable16) {
                    try {
                        throwable18 = throwable16;
                        fileOutputStream1.close();
                        throw throwable18;
                    }
                    catch(Throwable throwable17) {
                        try {
                            try {
                                throwable18.addSuppressed(throwable17);
                                throw throwable18;
                            label_501:
                                fileOutputStream1.close();
                                goto label_512;
                            }
                            catch(IOException iOException2) {
                            label_504:
                                egig.c("FSA2_LocalPhotoReader", "Failed to write data to pipe", iOException2);
                                throw iOException2;
                            }
                        }
                        catch(Throwable throwable15) {
                        }
                    }
                }
                try {
                    try {
                    label_507:
                        parcelFileDescriptor2.close();
                        throw throwable15;
                    }
                    catch(IOException iOException3) {
                        try {
                            egig.c("FSA2_LocalPhotoReader", "Failed to close pipe", iOException3);
                            throw throwable15;
                        }
                        catch(egdi egdi0) {
                            goto label_522;
                        }
                        catch(IOException iOException0) {
                            goto label_518;
                        }
                        try {
                        label_512:
                            parcelFileDescriptor2.close();
                            goto label_529;
                        }
                        catch(IOException iOException4) {
                        }
                        catch(egdi egdi0) {
                            goto label_522;
                        }
                        try {
                            egig.c("FSA2_LocalPhotoReader", "Failed to close pipe", iOException4);
                            goto label_529;
                        }
                        catch(egdi egdi0) {
                            goto label_522;
                        }
                        catch(IOException iOException0) {
                        }
                    label_518:
                        v35 = 0;
                        file1 = null;
                        goto label_589;
                    }
                    catch(egdi egdi0) {
                    label_522:
                        v35 = 0;
                        file1 = null;
                        goto label_576;
                    }
                }
                catch(Throwable throwable11) {
                label_526:
                    v35 = 0;
                    file2 = null;
                    goto label_606;
                }
            label_529:
                file0 = null;
                try {
                label_530:
                    egcs egcs0 = egct.a();
                    if(long7 != null) {
                        egcs0.j = long7;
                    }
                    if(parcelFileDescriptor0 == null) {
                        egcs0.b();
                        girk1 = girk.d;
                    }
                    else {
                        egcs0.b = parcelFileDescriptor0;
                    }
                    egct egct0 = egcs0.a();
                    z6 = egda.e(ehes1.f, long6.longValue(), egct0, true);
                    goto label_553;
                }
                catch(egdi egdi0) {
                }
                catch(IOException iOException0) {
                    goto label_546;
                }
                catch(Throwable throwable11) {
                    goto label_550;
                }
                file1 = file0;
            label_543:
                v35 = 0;
                goto label_576;
            label_546:
                file1 = file0;
            label_547:
                v35 = 0;
                goto label_589;
            }
            catch(Throwable throwable11) {
            label_550:
                file2 = file0;
                v35 = 0;
                goto label_606;
            }
        label_553:
            if(z6) {
                try {
                    egda.f(long6.longValue());
                }
                catch(egdi egdi0) {
                    file1 = file0;
                    v35 = 1;
                    goto label_576;
                }
                catch(IOException iOException0) {
                    file1 = file0;
                    v35 = 1;
                    goto label_589;
                }
                catch(Throwable throwable11) {
                    file2 = file0;
                    v35 = 1;
                    goto label_606;
                }
                v36 = 1;
            }
            else {
                v36 = 0;
            }
            try {
                egig.i("FSA2_PhotoSyncer", "Downloaded photo to CPG for calling card %d, updated: %b", long6, Boolean.valueOf(z6));
                goto label_614;
            }
            catch(egdi egdi0) {
            }
            catch(IOException iOException0) {
                goto label_587;
            }
            catch(Throwable throwable11) {
                goto label_604;
            }
            v35 = v36;
            file1 = file0;
            try {
            label_576:
                egig.c("FSA2_PhotoSyncer", "Failed to update calling card", egdi0);
                ehim4 = ehes1.k;
                ehim4.r(gjgi.j, girk.c, "WRITE_TO_CPG_FAILED", egdi0);
            }
            catch(Throwable throwable11) {
                goto label_594;
            }
            try {
                ehes1.d(girk1, true);
                if(v35 == 0) {
                    ehes1.e(girk1, true);
                    ++((ehiv)ehim4).a.stats.numIoExceptions;
                }
                if(file1 != null) {
                    file1.delete();
                }
                goto label_621;
            }
            catch(Throwable throwable1) {
                goto label_628;
            }
        label_587:
            v35 = v36;
            file1 = file0;
            try {
            label_589:
                egig.c("FSA2_PhotoSyncer", "Failed to creating or closing pfd", iOException0);
                ehim5 = ehes1.k;
                ehim5.r(gjgi.j, girk.c, "CREATE_OR_CLOSE_PFD_FAILED", iOException0);
                goto label_596;
            }
            catch(Throwable throwable11) {
                try {
                label_594:
                    file2 = file1;
                    goto label_606;
                label_596:
                    ehes1.d(girk1, true);
                    if(v35 == 0) {
                        ehes1.e(girk1, true);
                        ++((ehiv)ehim5).a.stats.numIoExceptions;
                    }
                    if(file1 != null) {
                        file1.delete();
                        goto label_621;
                    label_604:
                        v35 = v36;
                        file2 = file0;
                    label_606:
                        ehes1.d(girk1, true);
                        if(v35 == 0) {
                            ehes1.e(girk1, true);
                            SyncStats syncStats0 = ((ehiv)ehes1.k).a.stats;
                            ++syncStats0.numIoExceptions;
                        }
                        if(file2 != null) {
                            file2.delete();
                        }
                        throw throwable11;
                    label_614:
                        ehes1.d(girk1, true);
                        if(v36 == 0) {
                            ehes1.e(girk1, true);
                            SyncStats syncStats1 = ((ehiv)ehes1.k).a.stats;
                            ++syncStats1.numIoExceptions;
                        }
                        if(file0 != null) {
                            file0.delete();
                        }
                    }
                label_621:
                    ++v33;
                    goto label_428;
                label_625:
                    ehex0 = this;
                    goto label_631;
                }
                catch(Throwable throwable1) {
                }
                goto label_628;
            }
        }
        goto label_625;
    label_628:
        ehex0 = this;
        try {
        label_629:
            ehex0.b(false);
            throw throwable1;
        label_631:
            ehex0.b(true);
            ehex.c(5);
        label_633:
            if(!ehex0.w && egzo.a().c) {
                egiv.R();
                int v37 = Math.max(1, egiv.K().intValue());
                v38 = 0;
                goto label_637;
            }
            goto label_660;
        }
        catch(Throwable throwable0) {
            goto label_664;
        }
        while(true) {
        label_637:
            if(v38 >= v37) {
                goto label_655;
            }
            try {
                SyncResult syncResult0 = ehex0.j;
                long v39 = syncResult0.stats.numInserts + syncResult0.stats.numUpdates + syncResult0.stats.numDeletes;
                Iterator iterator1 = ehex.a.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        goto label_652;
                    }
                    Object object3 = iterator1.next();
                    ((ehew)object3).b();
                }
            }
            catch(Throwable throwable19) {
                try {
                    if(hxdl.e()) {
                        int v40 = ((ehiv)ehex0.i).a.hasError() ^ 1;
                        ehex0.n.a(false, ((boolean)v40));
                    }
                    else {
                        ehex0.n.a(false, true);
                    }
                    throw throwable19;
                label_652:
                    if(syncResult0.stats.numInserts + syncResult0.stats.numUpdates + syncResult0.stats.numDeletes != v39) {
                        ++v38;
                        continue;
                    }
                label_655:
                    if(hxdl.e()) {
                        int v41 = ((ehiv)ehex0.i).a.hasError() ^ 1;
                        ehex0.n.a(false, ((boolean)v41));
                    }
                    else {
                        ehex0.n.a(false, true);
                    }
                label_660:
                    if(z1) {
                        goto label_678;
                    }
                    else {
                        ehex.c(3);
                    }
                    goto label_679;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
        }
    label_664:
        if(z1) {
            ehex.c(3);
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)girh.a).v_newBuilder();
        if(!ehex0.p.b) {
            v = 3;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((girh)hftp1.b_message).c = v - 1;
        ((girh)hftp1.b_message).b |= 1;
        girh girh0 = (girh)hftp1.N_build();
        ehex0.i.l(girh0);
        int v42 = ((ehiv)ehex0.i).a.hasError() ^ 1;
        ehex0.n.b(((boolean)v42));
        throw throwable0;
    label_678:
        ehex.c(3);
    label_679:
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)girh.a).v_newBuilder();
        if(!ehex0.p.b) {
            v = 3;
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((girh)hftp2.b_message).c = v - 1;
        ((girh)hftp2.b_message).b |= 1;
        girh girh1 = (girh)hftp2.N_build();
        ehex0.i.l(girh1);
        int v43 = ((ehiv)ehex0.i).a.hasError() ^ 1;
        ehex0.n.b(((boolean)v43));
    }

    private final void b(boolean z) {
        boolean z1 = z && !((ehiv)this.i).a.hasError();
        if(z1) {
            ehaz ehaz0 = this.o;
            if(ehaz0.f && ehaz0.e) {
                ehaz0.a();
            }
            else {
                efur efur0 = ehaz0.b;
                String s = ehaz0.d;
                int v = efur0.M(s);
                if(v == 3) {
                    efur0.N(s, 4);
                    batl.k(null);
                    efur0.a.edit().putLong("focus_first_full_sync_finish_timestamp_" + s, System.currentTimeMillis()).commit();
                    v = 3;
                }
                ehaz0.b(v);
                if(hxbn.a.b().a()) {
                    ehim ehim0 = ehaz0.c;
                    if(((ehiv)ehim0).y && ehim0.b() != null && gjfe.a(ehim0.b().c) == 3) {
                        try {
                            int v1 = new egyq(ehaz0.a).b();
                            girg girg0 = ehim0.b();
                            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)girg0).jf(5, null);
                            hftp0.X(((ProtoLiteMessage)girg0));
                            giqx giqx0 = (giqx)((ProtoLiteMessage)girb.a).v_newBuilder();
                            if(!giqx0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)giqx0).ensureMutable();
                            }
                            ((girb)giqx0.b_message).c = 6;
                            ((girb)giqx0.b_message).b |= 1;
                            if(!giqx0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)giqx0).ensureMutable();
                            }
                            girb girb0 = (girb)giqx0.b_message;
                            girb0.b |= 0x8000;
                            girb0.q = v1 <= 0 ? 0 : 1;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            girg girg1 = (girg)hftp0.b_message;
                            girb girb1 = (girb)((ProtoLiteBuilder)giqx0).N_build();
                            girb1.getClass();
                            girg1.d = girb1;
                            girg1.b |= 2;
                            ehim0.k(((girg)hftp0.N_build()));
                        }
                        catch(cjuh cjuh0) {
                            egig.d("FSA2_FirstFullSyncsDetector", "Exception in getting device contact count: %s", new Object[]{cjuh0});
                        }
                    }
                }
            }
            String s1 = String.valueOf(this.e.name);
            this.q.a.edit().putInt("focus_first_full_sync_failed_times_" + s1, 0).apply();
        }
        efur efur1 = this.q;
        String s2 = this.e.name;
        ehiv ehiv0 = (ehiv)this.i;
        if((ehiv0.y || hxbk.j() && ehiv0.A) && !z1 && !ehiv0.E) {
            String s3 = "focus_first_full_sync_failed_times_" + s2;
            efur1.a.edit().putInt(s3, efur1.a.getInt(s3, 0) + 1).apply();
        }
        this.n.a(true, z1);
    }

    private static final void c(int v) {
        for(Object object0: ehex.a) {
            ((ehew)object0).c(v);
        }
    }

    @Override
    public final void close() {
        this.s.close();
    }
}

