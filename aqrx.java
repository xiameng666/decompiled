import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;

public final class aqrx {
    public static final baun a;
    public final Context b;
    private Future c;

    static {
        aqrx.a = aqql.a("ContactsUtil");
    }

    public aqrx(Context context0) {
        this.b = context0;
    }

    public final grov a() {
        int v26;
        ExecutorCompletionService executorCompletionService2;
        Map map11;
        ArrayList arrayList2;
        Throwable throwable8;
        int v19;
        int v18;
        int v16;
        int v15;
        String s9;
        String s8;
        String s7;
        int v14;
        String s6;
        String s5;
        String s4;
        ProtoLiteBuilder hftp2;
        Map map10;
        Long long3;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        int v4;
        int v3;
        HashMap hashMap5;
        Map map9;
        Map map8;
        HashMap hashMap4;
        Map map7;
        ExecutorCompletionService executorCompletionService1;
        HashMap hashMap3;
        Map map6;
        Map map5;
        Cursor cursor11;
        Cursor cursor9;
        ProtoLiteBuilder hftp1;
        ArrayList arrayList1;
        String s3;
        int v2;
        String s2;
        Long long1;
        Cursor cursor8;
        Cursor cursor7;
        HashSet hashSet1;
        boolean z1;
        Cursor cursor6;
        Cursor cursor5;
        ProtoLiteBuilder hftp0;
        ArrayList arrayList0;
        String s1;
        int v1;
        String s;
        HashMap hashMap2;
        Map map4;
        Map map3;
        Cursor cursor4;
        Cursor cursor3;
        Cursor cursor2;
        HashMap hashMap1;
        Map map2;
        Map map1;
        HashSet hashSet0;
        Map map0;
        Cursor cursor1;
        bblp bblp3;
        Cursor cursor0;
        Uri uri0;
        HashMap hashMap0;
        bblp bblp2;
        ExecutorCompletionService executorCompletionService0;
        bblp bblp1;
        bblp bblp0;
        boolean z;
        gged_interceptors gged0;
        aqsf aqsf0;
        try {
            aqsf0 = new aqsf(this.b);
            baun baun0 = aqsf.a;
            baun0.d("readContacts", new Object[0]);
            if(!aqrx.e(aqsf0.n)) {
                baun0.m("Doesn\'t have READ_CONTACTS permission, give up reading contacts.", new Object[0]);
                gged0 = ggna.a;
                goto label_655;
            }
            __monitor_enter(aqsf0);
        }
        catch(aqrz aqrz0) {
            aqrx.a.g("Failed to read contacts ", aqrz0, new Object[0]);
            throw new aqrz("Failed to read contacts " + aqrz0.toString());
        }
        catch(aqry aqry0) {
            aqrx.a.g("Cursor null while querying for raw contacts", aqry0, new Object[0]);
            throw new aqry("Cursor null while querying for rawcontacts" + aqry0.toString());
        }
        try {
            batl.l(Long.compare(aqsf0.o, 0L) == 0);
            goto label_13;
        }
        catch(Throwable throwable0) {
            try {
                __monitor_exit(aqsf0);
                throw throwable0;
            label_13:
                __monitor_exit(aqsf0);
                z = hqhq.a.j().aB();
                if(z) {
                    goto label_16;
                }
                else {
                    goto label_23;
                }
                goto label_25;
            }
            catch(aqrz aqrz0) {
                aqrx.a.g("Failed to read contacts ", aqrz0, new Object[0]);
                throw new aqrz("Failed to read contacts " + aqrz0.toString());
            }
            catch(aqry aqry0) {
                aqrx.a.g("Cursor null while querying for raw contacts", aqry0, new Object[0]);
                throw new aqry("Cursor null while querying for rawcontacts" + aqry0.toString());
            }
        }
        try {
        label_16:
            bblp0 = new bblp(5, 9);
        }
        catch(Throwable throwable1) {
            bblp2 = null;
            goto label_694;
        }
        try {
            bblp1 = bblp0;
            executorCompletionService0 = new ExecutorCompletionService(bblp0);
            goto label_25;
        }
        catch(Throwable throwable1) {
            bblp2 = bblp0;
            goto label_694;
        }
    label_23:
        executorCompletionService0 = null;
        bblp1 = null;
        try {
        label_25:
            aqsf0.m = aqsa.a(aqsf0.n);
            hashMap0 = new HashMap();
            uri0 = ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").build();
        }
        catch(Throwable throwable1) {
            bblp3 = bblp1;
            goto label_693;
        }
        try {
            cursor0 = aqsf0.n.getContentResolver().query(uri0, aqsf.d, null, null, null);
        }
        catch(SQLiteException sQLiteException0) {
            bblp3 = bblp1;
            cursor1 = null;
            goto label_683;
        }
        catch(Throwable throwable2) {
            bblp3 = bblp1;
            cursor1 = null;
            goto label_689;
        }
        if(cursor0 != null) {
            try {
                while(cursor0.moveToNext()) {
                    long v = cursor0.getLong(cursor0.getColumnIndex("_id"));
                    hashMap0.put(Long.valueOf(v), new aqsc(v, cursor0.getInt(cursor0.getColumnIndex("times_contacted")), cursor0.getLong(cursor0.getColumnIndex("last_time_contacted")), cursor0.getInt(cursor0.getColumnIndex("starred")) == 1));
                }
            }
            catch(SQLiteException sQLiteException0) {
                bblp3 = bblp1;
                goto label_682;
            }
            catch(Throwable throwable2) {
                bblp3 = bblp1;
                goto label_688;
            }
            try {
                cursor0.close();
                map0 = aqsf0.f(new HashSet(hashMap0.keySet()));
                hashSet0 = new HashSet(map0.keySet());
                map1 = aqsf0.b(hashSet0);
                map2 = aqsf0.d(hashSet0);
                hashMap1 = new HashMap();
            }
            catch(Throwable throwable1) {
                bblp3 = bblp1;
                goto label_693;
            }
            try {
                cursor2 = aqsf0.a("vnd.android.cursor.item/website", aqsf.f);
            }
            catch(SQLiteException sQLiteException1) {
                cursor3 = null;
                goto label_107;
            }
            catch(Throwable throwable3) {
                bblp3 = bblp1;
                cursor4 = null;
                goto label_119;
            }
            if(cursor2 == null) {
                goto label_102;
            label_106:
                cursor3 = cursor5;
                try {
                label_107:
                    aqsf.a.g("ContentResolver.query threw an exception when fetching website info", sQLiteException1, new Object[0]);
                }
                catch(Throwable throwable3) {
                    try {
                        bblp3 = bblp1;
                        cursor4 = cursor3;
                        goto label_119;
                    }
                    catch(Throwable throwable1) {
                        goto label_693;
                    }
                }
                if(cursor3 != null) {
                    try {
                        cursor3.close();
                        map3 = aqsf0.e(hashSet0);
                        map4 = aqsf0.c(hashSet0);
                        hashMap2 = new HashMap();
                        goto label_131;
                    }
                    catch(Throwable throwable1) {
                        bblp3 = bblp1;
                        goto label_693;
                    }
                label_117:
                    bblp3 = bblp1;
                    cursor4 = cursor5;
                    try {
                    label_119:
                        if(cursor4 != null) {
                            cursor4.close();
                        }
                        throw throwable3;
                    }
                    catch(Throwable throwable1) {
                        goto label_693;
                    }
                    try {
                    label_122:
                        if(cursor5 != null) {
                            cursor5.close();
                        }
                        map3 = aqsf0.e(hashSet0);
                        map4 = aqsf0.c(hashSet0);
                        hashMap2 = new HashMap();
                        goto label_131;
                    }
                    catch(Throwable throwable1) {
                    }
                    bblp3 = bblp1;
                    goto label_693;
                }
            }
            else {
                while(true) {
                    try {
                    label_65:
                        if(!cursor2.moveToNext()) {
                            cursor5 = cursor2;
                            goto label_122;
                        }
                        Long long0 = cursor2.getLong(cursor2.getColumnIndex("raw_contact_id"));
                        if(!hashSet0.contains(long0)) {
                            goto label_65;
                        }
                        s = cursor2.getString(cursor2.getColumnIndex("data1"));
                        v1 = cursor2.getInt(cursor2.getColumnIndex("data2"));
                        s1 = cursor2.getString(cursor2.getColumnIndex("data3"));
                        if(!hashMap1.containsKey(long0)) {
                            hashMap1.put(long0, new ArrayList());
                        }
                        arrayList0 = (ArrayList)hashMap1.get(long0);
                        hftp0 = ((ProtoLiteMessage)grox.a).v_newBuilder();
                        goto label_82;
                    }
                    catch(SQLiteException sQLiteException1) {
                    }
                    catch(Throwable throwable3) {
                        cursor5 = cursor2;
                        goto label_117;
                    }
                    try {
                        cursor5 = cursor2;
                        goto label_106;
                    label_82:
                        if(s == null) {
                            cursor5 = cursor2;
                        }
                        else {
                            cursor5 = cursor2;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((grox)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((grox)hftv0).c = v1;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((grox)hftp0.b_message).d = s1;
                        }
                        arrayList0.add(((grox)hftp0.N_build()));
                        cursor2 = cursor5;
                        goto label_65;
                    label_102:
                        cursor5 = null;
                        aqsf.a.m("Could not query ContactsProvider to fetch Website info; disabled? Give up.", new Object[0]);
                        goto label_122;
                    }
                    catch(SQLiteException sQLiteException1) {
                        goto label_106;
                    }
                    catch(Throwable throwable3) {
                        goto label_117;
                    }
                }
            }
            map3 = aqsf0.e(hashSet0);
            map4 = aqsf0.c(hashSet0);
            hashMap2 = new HashMap();
            try {
            label_131:
                cursor6 = aqsf0.a("vnd.android.cursor.item/relation", aqsf.h);
            }
            catch(SQLiteException sQLiteException2) {
                z1 = z;
                bblp3 = bblp1;
                hashSet1 = hashSet0;
                cursor7 = null;
                goto label_216;
            }
            catch(Throwable throwable4) {
                bblp3 = bblp1;
                cursor8 = null;
                goto label_222;
            }
            if(cursor6 == null) {
                goto label_209;
                try {
                label_216:
                    aqsf.a.g("ContentResolver.query threw an exception when fetching relation info", sQLiteException2, new Object[0]);
                    if(cursor7 != null) {
                        goto label_218;
                    }
                    goto label_227;
                }
                catch(Throwable throwable4) {
                    goto label_221;
                }
                try {
                label_218:
                    cursor7.close();
                    goto label_227;
                label_221:
                    cursor8 = cursor7;
                label_222:
                    if(cursor8 != null) {
                        cursor8.close();
                    }
                    throw throwable4;
                label_225:
                    if(cursor7 != null) {
                        cursor7.close();
                    }
                label_227:
                    aqsf0.g(map0);
                    cursor9 = null;
                    cursor9 = aqsf0.a("vnd.android.cursor.item/note", aqsf.j);
                    goto label_234;
                }
                catch(Throwable throwable1) {
                    goto label_693;
                }
            }
            else {
                while(true) {
                    try {
                    label_144:
                        if(!cursor6.moveToNext()) {
                            goto label_204;
                        }
                        long1 = cursor6.getLong(cursor6.getColumnIndex("raw_contact_id"));
                        if(!hashSet0.contains(long1)) {
                            goto label_144;
                        }
                        s2 = cursor6.getString(cursor6.getColumnIndex("data1"));
                        z1 = z;
                        v2 = cursor6.getInt(cursor6.getColumnIndex("data2"));
                        bblp3 = bblp1;
                        goto label_164;
                    }
                    catch(SQLiteException sQLiteException2) {
                    }
                    catch(Throwable throwable4) {
                        cursor7 = cursor6;
                        bblp3 = bblp1;
                        goto label_221;
                    }
                    try {
                        z1 = z;
                        cursor7 = cursor6;
                        bblp3 = bblp1;
                        hashSet1 = hashSet0;
                        goto label_216;
                    }
                    catch(SQLiteException sQLiteException2) {
                        goto label_216;
                    }
                    catch(Throwable throwable4) {
                        goto label_221;
                    }
                    try {
                        v2 = cursor6.getInt(cursor6.getColumnIndex("data2"));
                        bblp3 = bblp1;
                        goto label_164;
                    }
                    catch(SQLiteException sQLiteException2) {
                    }
                    catch(Throwable throwable4) {
                        cursor7 = cursor6;
                        bblp3 = bblp1;
                        goto label_221;
                    }
                    try {
                        cursor7 = cursor6;
                        bblp3 = bblp1;
                        hashSet1 = hashSet0;
                        goto label_216;
                    }
                    catch(SQLiteException sQLiteException2) {
                        goto label_216;
                    }
                    catch(Throwable throwable4) {
                        goto label_221;
                    }
                    try {
                    label_164:
                        s3 = cursor6.getString(cursor6.getColumnIndex("data3"));
                        if(hashMap2.containsKey(long1)) {
                            goto label_176;
                        }
                        else {
                            goto label_173;
                        }
                        goto label_177;
                    }
                    catch(SQLiteException sQLiteException2) {
                    }
                    catch(Throwable throwable4) {
                        cursor7 = cursor6;
                        goto label_221;
                    }
                    try {
                        try {
                            cursor7 = cursor6;
                            hashSet1 = hashSet0;
                        }
                        catch(SQLiteException sQLiteException2) {
                        }
                        goto label_216;
                        try {
                        label_173:
                            cursor7 = cursor6;
                            hashMap2.put(long1, new ArrayList());
                            goto label_177;
                        label_176:
                            cursor7 = cursor6;
                        label_177:
                            arrayList1 = (ArrayList)hashMap2.get(long1);
                            hftp1 = ((ProtoLiteMessage)grou.a).v_newBuilder();
                        }
                        catch(SQLiteException sQLiteException2) {
                            try {
                                hashSet1 = hashSet0;
                            }
                            catch(SQLiteException sQLiteException2) {
                            }
                            goto label_216;
                        }
                    }
                    catch(Throwable throwable4) {
                        goto label_221;
                    }
                    if(s2 == null) {
                        goto label_189;
                    }
                    else {
                        try {
                            hashSet1 = hashSet0;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((grou)hftp1.b_message).b = s2;
                            goto label_190;
                        label_189:
                            hashSet1 = hashSet0;
                        label_190:
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp1.b_message;
                            ((grou)hftv1).c = v2;
                            if(s3 != null) {
                                if(!hftv1.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((grou)hftp1.b_message).d = s3;
                            }
                            arrayList1.add(((grou)hftp1.N_build()));
                            z = z1;
                            bblp1 = bblp3;
                            cursor6 = cursor7;
                            hashSet0 = hashSet1;
                            goto label_144;
                        label_204:
                            z1 = z;
                            cursor7 = cursor6;
                            bblp3 = bblp1;
                            hashSet1 = hashSet0;
                            goto label_225;
                        label_209:
                            z1 = z;
                            cursor7 = null;
                            bblp3 = bblp1;
                            hashSet1 = hashSet0;
                            aqsf.a.m("Could not query CP2 to fetch relation info; disabled? Give up.", new Object[0]);
                            goto label_225;
                        }
                        catch(SQLiteException sQLiteException2) {
                            goto label_216;
                        }
                        catch(Throwable throwable4) {
                            goto label_221;
                        }
                    }
                    goto label_190;
                }
            }
            goto label_227;
            try {
                cursor9 = null;
                cursor9 = aqsf0.a("vnd.android.cursor.item/note", aqsf.j);
                goto label_234;
            }
            catch(SQLiteException sQLiteException3) {
                goto label_244;
            }
            catch(Throwable throwable5) {
            }
            Cursor cursor10 = null;
            goto label_250;
        label_234:
            if(cursor9 == null) {
                try {
                    try {
                        aqsf.a.m("Could not query ContactsProvider to fetch Note info; disabled? Give up.", new Object[0]);
                        goto label_253;
                    }
                    catch(SQLiteException sQLiteException3) {
                    }
                label_244:
                    aqsf.a.g("ContentResolver.query threw an exception when fetching note info", sQLiteException3, new Object[0]);
                    if(cursor9 != null) {
                        goto label_246;
                    }
                    goto label_255;
                }
                catch(Throwable throwable5) {
                    goto label_249;
                }
                try {
                label_246:
                    cursor9.close();
                    goto label_255;
                label_249:
                    cursor10 = cursor9;
                label_250:
                    if(cursor10 != null) {
                        cursor10.close();
                    }
                    throw throwable5;
                label_253:
                    if(cursor9 != null) {
                        cursor9.close();
                    }
                label_255:
                    aqsf0.h(map0);
                    aqsf0.i(map0);
                    hqhq hqhq0 = hqhq.a;
                    if(hqhq0.j().ab()) {
                        String[] arr_s = (String[])aqsf.k.toArray(new String[0]);
                        try {
                            cursor11 = aqsf0.a("vnd.android.cursor.item/name", arr_s);
                            goto label_283;
                        }
                        catch(SQLiteException sQLiteException4) {
                        }
                        goto label_273;
                    }
                    else {
                        map5 = map3;
                        map6 = map4;
                        hashMap3 = hashMap2;
                        executorCompletionService1 = executorCompletionService0;
                        map7 = map0;
                        hashMap4 = hashMap0;
                        map8 = map1;
                        map9 = map2;
                        hashMap5 = hashMap1;
                    }
                    goto label_461;
                }
                catch(Throwable throwable1) {
                    goto label_693;
                }
            }
            else {
                try {
                    while(cursor9.moveToNext()) {
                        Long long2 = cursor9.getLong(cursor9.getColumnIndex("raw_contact_id"));
                        if(map0.containsKey(long2)) {
                            ((aqse)map0.get(long2)).f = cursor9.getString(cursor9.getColumnIndex("data1"));
                        }
                    }
                }
                catch(SQLiteException sQLiteException3) {
                    goto label_244;
                }
                catch(Throwable throwable5) {
                    goto label_249;
                }
                goto label_253;
            }
            goto label_255;
        label_273:
            map5 = map3;
            map6 = map4;
            hashMap3 = hashMap2;
            executorCompletionService1 = executorCompletionService0;
            map7 = map0;
            hashMap4 = hashMap0;
            map8 = map1;
            map9 = map2;
            hashMap5 = hashMap1;
            goto label_460;
        label_283:
            if(cursor11 == null) {
                try {
                    aqsf.a.m("Could not query ContactsProvider to fetch structured name.", new Object[0]);
                    map5 = map3;
                    map6 = map4;
                    hashMap3 = hashMap2;
                    executorCompletionService1 = executorCompletionService0;
                    map8 = map1;
                    map9 = map2;
                    hashMap5 = hashMap1;
                    map7 = map0;
                    hashMap4 = hashMap0;
                    goto label_456;
                label_293:
                    v3 = cursor11.getColumnIndexOrThrow("raw_contact_id");
                    v4 = cursor11.getColumnIndexOrThrow("data2");
                    v5 = cursor11.getColumnIndexOrThrow("data5");
                    v6 = cursor11.getColumnIndexOrThrow("data3");
                    executorCompletionService1 = executorCompletionService0;
                    goto label_298;
                }
                catch(Throwable throwable6) {
                    goto label_440;
                }
            }
            else {
                goto label_293;
                try {
                label_298:
                    map5 = map3;
                    v7 = cursor11.getColumnIndexOrThrow("data7");
                    map5 = map3;
                    v8 = cursor11.getColumnIndexOrThrow("data8");
                    hashMap3 = hashMap2;
                }
                catch(Throwable throwable6) {
                    map6 = map4;
                    hashMap3 = hashMap2;
                    goto label_444;
                }
                try {
                    map6 = map4;
                    v9 = cursor11.getColumnIndexOrThrow("data9");
                    map6 = map4;
                    v10 = cursor11.getColumnIndexOrThrow("data11");
                    hashMap5 = hashMap1;
                }
                catch(Throwable throwable6) {
                    goto label_444;
                }
                try {
                    v11 = cursor11.getColumnIndexOrThrow("data10");
                    map9 = map2;
                }
                catch(Throwable throwable6) {
                    map7 = map0;
                    hashMap4 = hashMap0;
                    map8 = map1;
                    map9 = map2;
                    goto label_449;
                }
                try {
                    v12 = cursor11.getColumnIndexOrThrow("data4");
                    map8 = map1;
                }
                catch(Throwable throwable6) {
                    map7 = map0;
                    hashMap4 = hashMap0;
                    map8 = map1;
                    goto label_449;
                }
                try {
                    v13 = cursor11.getColumnIndexOrThrow("data6");
                    while(true) {
                    label_334:
                        if(!cursor11.moveToNext()) {
                            map7 = map0;
                            hashMap4 = hashMap0;
                            goto label_456;
                        }
                        long3 = cursor11.getLong(v3);
                        if(!map0.containsKey(long3)) {
                            break;
                        }
                        goto label_350;
                    }
                }
                catch(Throwable throwable6) {
                    map7 = map0;
                    hashMap4 = hashMap0;
                    goto label_449;
                }
                try {
                    hashMap4 = hashMap0;
                    map10 = map0;
                    aqsf.a.m("Skip because no rawContactId", new Object[0]);
                    v3 = v3;
                    hashMap0 = hashMap4;
                    map0 = map10;
                    v13 = v13;
                    goto label_334;
                }
                catch(Throwable throwable7) {
                    throwable8 = throwable7;
                    map7 = map10;
                    goto label_450;
                }
                try {
                label_350:
                    map10 = map0;
                    hashMap4 = hashMap0;
                    hftp2 = ((ProtoLiteMessage)groo.a).v_newBuilder();
                    s4 = cursor11.getString(v4);
                    s5 = cursor11.getString(v5);
                    s6 = cursor11.getString(v6);
                    if(s4 == null) {
                        goto label_362;
                    }
                    else {
                        goto label_357;
                    }
                    goto label_363;
                }
                catch(Throwable throwable6) {
                    map7 = map10;
                    goto label_449;
                }
                try {
                label_357:
                    v14 = v5;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((groo)hftp2.b_message).b = s4;
                    goto label_363;
                label_362:
                    v14 = v5;
                label_363:
                    if(s5 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((groo)hftp2.b_message).c = s5;
                    }
                    if(s6 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((groo)hftp2.b_message).d = s6;
                    }
                }
                catch(Throwable throwable7) {
                    throwable8 = throwable7;
                    map7 = map10;
                    goto label_450;
                }
                try {
                    s7 = cursor11.getString(v7);
                    s8 = cursor11.getString(v8);
                    s9 = cursor11.getString(v9);
                    v15 = cursor11.getInt(v10);
                    if(s7 == null) {
                        goto label_381;
                    }
                    else {
                        goto label_376;
                    }
                    goto label_382;
                }
                catch(Throwable throwable6) {
                    map7 = map10;
                    goto label_449;
                }
                try {
                label_376:
                    v16 = v8;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((groo)hftp2.b_message).e = s7;
                    goto label_382;
                label_381:
                    v16 = v8;
                label_382:
                    if(s8 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((groo)hftp2.b_message).f = s8;
                    }
                    if(s9 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((groo)hftp2.b_message).g = s9;
                    }
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                }
                catch(Throwable throwable7) {
                    throwable8 = throwable7;
                    map7 = map10;
                    goto label_450;
                }
                try {
                    ((groo)hftp2.b_message).i = v15;
                    if(hqhq0.j().aa()) {
                        goto label_398;
                    }
                    else {
                        goto label_420;
                    }
                    goto label_422;
                }
                catch(Throwable throwable6) {
                    map7 = map10;
                    goto label_449;
                }
                try {
                label_398:
                    int v17 = cursor11.getInt(v11);
                    String s10 = cursor11.getString(v12);
                    v18 = v13;
                    String s11 = cursor11.getString(v18);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp2.b_message;
                    v19 = v10;
                    ((groo)hftv2).h = v17;
                    if(s10 != null) {
                        if(!hftv2.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((groo)hftp2.b_message).j = s10;
                    }
                    if(s11 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((groo)hftp2.b_message).k = s11;
                    }
                    goto label_422;
                }
                catch(Throwable throwable7) {
                    throwable8 = throwable7;
                    map7 = map10;
                    goto label_450;
                }
            label_420:
                v18 = v13;
                v19 = v10;
                try {
                label_422:
                    map7 = map10;
                    aqse aqse0 = (aqse)map7.get(long3);
                    aqse0.j = (groo)hftp2.N_build();
                    map0 = map7;
                    v13 = v18;
                    v3 = v3;
                    hashMap0 = hashMap4;
                    v10 = v19;
                    v4 = v4;
                    v5 = v14;
                    v8 = v16;
                    goto label_334;
                }
                catch(Throwable throwable6) {
                    goto label_449;
                }
            }
            try {
                map7 = map0;
                hashMap4 = hashMap0;
                goto label_456;
            }
            catch(Throwable throwable6) {
            label_440:
                map5 = map3;
                map6 = map4;
                hashMap3 = hashMap2;
                executorCompletionService1 = executorCompletionService0;
            }
        label_444:
            map7 = map0;
            hashMap4 = hashMap0;
            map8 = map1;
            map9 = map2;
            hashMap5 = hashMap1;
        label_449:
            throwable8 = throwable6;
        label_450:
            if(cursor11 != null) {
                try {
                    cursor11.close();
                }
                catch(Throwable throwable9) {
                    try {
                        throwable8.addSuppressed(throwable9);
                        throw throwable8;
                    label_456:
                        if(cursor11 != null) {
                            cursor11.close();
                        }
                        goto label_461;
                    }
                    catch(SQLiteException sQLiteException4) {
                        goto label_460;
                    }
                    catch(Throwable throwable1) {
                        goto label_693;
                    }
                }
            }
            throw throwable8;
            try {
            label_460:
                aqsf.a.n("ContentResolver.query threw an exception when fetching structured name info", sQLiteException4, new Object[0]);
            label_461:
                int v20 = map7.size();
                arrayList2 = new ArrayList(v20);
                for(Object object0: hashSet1) {
                    if(Thread.interrupted()) {
                        throw new InterruptedException();
                    }
                    aqse aqse1 = (aqse)map7.get(((Long)object0));
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grot.a).v_newBuilder();
                    long v21 = (long)(((Long)object0));
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp3.b_message;
                    ((grot)hftv3).k = v21;
                    long v22 = aqse1.b;
                    if(!hftv3.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((grot)hftp3.b_message).l = v22;
                    if(aqse1.a()) {
                        String s12 = aqse1.d;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot0 = (grot)hftp3.b_message;
                        s12.getClass();
                        grot0.g = s12;
                    }
                    if(!TextUtils.isEmpty(aqse1.g)) {
                        String s13 = aqse1.g;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot1 = (grot)hftp3.b_message;
                        s13.getClass();
                        grot1.c = s13;
                    }
                    if(!TextUtils.isEmpty(aqse1.f)) {
                        String s14 = aqse1.f;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot2 = (grot)hftp3.b_message;
                        s14.getClass();
                        grot2.m = s14;
                    }
                    if(aqse1.h != null && !aqse1.h.b.isEmpty()) {
                        grop grop0 = aqse1.h;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot3 = (grot)hftp3.b_message;
                        grop0.getClass();
                        grot3.p = grop0;
                        grot3.b |= 1;
                    }
                    groo groo0 = aqse1.j;
                    if(groo0 != null) {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((grot)hftp3.b_message).w = groo0;
                        ((grot)hftp3.b_message).b |= 4;
                    }
                    groq groq0 = aqse1.i;
                    if(groq0 != null) {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((grot)hftp3.b_message).s = groq0;
                        ((grot)hftp3.b_message).b |= 2;
                    }
                    String s15 = aqse1.e;
                    if(!TextUtils.isEmpty(s15)) {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot4 = (grot)hftp3.b_message;
                        s15.getClass();
                        grot4.v = s15;
                    }
                    if(((Boolean)aqsf0.l.mr()).booleanValue()) {
                        String s17 = aqse1.c;
                        if(!TextUtils.isEmpty(s17)) {
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            grot grot6 = (grot)hftp3.b_message;
                            s17.getClass();
                            grot6.j = s17;
                        }
                    }
                    else {
                        String s16 = aqse1.c;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot5 = (grot)hftp3.b_message;
                        s16.getClass();
                        grot5.j = s16;
                    }
                    aqsc aqsc0 = (aqsc)hashMap4.get(Long.valueOf(v22));
                    if(aqsc0 != null) {
                        int v23 = aqsc0.a;
                        if(v23 > 0) {
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ((grot)hftp3.b_message).h = v23;
                            long v24 = aqsc0.b;
                            if(v24 > 1240790401000L && v24 < System.currentTimeMillis()) {
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                ((grot)hftp3.b_message).i = v24;
                            }
                        }
                        boolean z2 = aqsc0.c;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((grot)hftp3.b_message).q = z2;
                    }
                    Long long4 = (long)aqse1.a;
                    List list0 = (List)map8.get(long4);
                    if(list0 != null) {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot7 = (grot)hftp3.b_message;
                        hfuo hfuo0 = grot7.d;
                        if(!hfuo0.c()) {
                            grot7.d = ProtoLiteMessage.E(hfuo0);
                        }
                        hfrj.E(list0, grot7.d);
                    }
                    List list1 = (List)map9.get(long4);
                    if(list1 != null) {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot8 = (grot)hftp3.b_message;
                        hfuo hfuo1 = grot8.e;
                        if(!hfuo1.c()) {
                            grot8.e = ProtoLiteMessage.E(hfuo1);
                        }
                        hfrj.E(list1, grot8.e);
                    }
                    List list2 = (List)hashMap5.get(long4);
                    if(list2 != null) {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot9 = (grot)hftp3.b_message;
                        hfuo hfuo2 = grot9.r;
                        if(!hfuo2.c()) {
                            grot9.r = ProtoLiteMessage.E(hfuo2);
                        }
                        hfrj.E(list2, grot9.r);
                    }
                    List list3 = (List)map6.get(long4);
                    if(list3 != null) {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot10 = (grot)hftp3.b_message;
                        hfuo hfuo3 = grot10.t;
                        if(!hfuo3.c()) {
                            grot10.t = ProtoLiteMessage.E(hfuo3);
                        }
                        hfrj.E(list3, grot10.t);
                    }
                    List list4 = (List)hashMap3.get(long4);
                    if(list4 == null) {
                        map11 = map7;
                    }
                    else {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot11 = (grot)hftp3.b_message;
                        map11 = map7;
                        hfuo hfuo4 = grot11.u;
                        if(!hfuo4.c()) {
                            grot11.u = ProtoLiteMessage.E(hfuo4);
                        }
                        hfrj.E(list4, grot11.u);
                    }
                    List list5 = (List)map5.get(long4);
                    if(list5 != null) {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grot grot12 = (grot)hftp3.b_message;
                        hfuo hfuo5 = grot12.f;
                        if(!hfuo5.c()) {
                            grot12.f = ProtoLiteMessage.E(hfuo5);
                        }
                        hfrj.E(list5, grot12.f);
                    }
                    if(z1) {
                        executorCompletionService2 = executorCompletionService1;
                        executorCompletionService2.submit(new aqsd(aqsf0, ((grot)hftp3.N_build()), aqse1));
                    }
                    else {
                        executorCompletionService2 = executorCompletionService1;
                        arrayList2.add(((grot)hftp3.N_build()));
                    }
                    map5 = map5;
                    executorCompletionService1 = executorCompletionService2;
                    hashMap4 = hashMap4;
                    map8 = map8;
                    map9 = map9;
                    hashMap5 = hashMap5;
                    map6 = map6;
                    hashMap3 = hashMap3;
                    map7 = map11;
                }
                if(z1) {
                    int v25 = 0;
                    while(true) {
                        if(v25 >= v20) {
                            break;
                        }
                        try {
                            arrayList2.add(((grot)executorCompletionService1.take().get()));
                            ++v25;
                            continue;
                        }
                        catch(ExecutionException executionException0) {
                        }
                        catch(InterruptedException interruptedException0) {
                            goto label_644;
                        }
                        if(!(executionException0.getCause() instanceof InterruptedException)) {
                            throw new RuntimeException("Exception when fetching contact images", executionException0.getCause());
                        }
                        bblp3.shutdownNow();
                        throw (InterruptedException)executionException0.getCause();
                    }
                }
                goto label_649;
            }
            catch(Throwable throwable1) {
                goto label_693;
            }
            try {
                throw (InterruptedException)executionException0.getCause();
            }
            catch(Throwable throwable1) {
                bblp2 = null;
                goto label_694;
            }
            try {
            label_644:
                bblp3.shutdownNow();
            }
            catch(Throwable throwable1) {
                goto label_693;
            }
            try {
                throw interruptedException0;
            }
            catch(Throwable throwable1) {
                bblp2 = null;
                goto label_694;
            }
            try {
            label_649:
                if(bblp3 != null) {
                    bblp3.shutdownNow();
                }
                synchronized(aqsf0) {
                    aqsf0.o = 0L;
                }
                gged0 = arrayList2;
            label_655:
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grov.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                grov grov0 = (grov)hftp4.b_message;
                hfuo hfuo6 = grov0.b;
                if(!hfuo6.c()) {
                    grov0.b = ProtoLiteMessage.E(hfuo6);
                }
                hfrj.E(gged0, grov0.b);
                grov grov1 = (grov)hftp4.N_build();
                baun baun1 = aqrx.a;
                if(((ProtoLiteMessage)grov1).isImmutable()) {
                    v26 = ((ProtoLiteMessage)grov1).t(null);
                    if(v26 < 0) {
                        throw new IllegalStateException("serialized size must be non-negative, was " + v26);
                    }
                }
                else {
                    v26 = grov1.memoizedSerializedSize & 0x7FFFFFFF;
                    if(v26 == 0x7FFFFFFF) {
                        v26 = ((ProtoLiteMessage)grov1).t(null);
                        if(v26 < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + v26);
                        }
                        grov1.memoizedSerializedSize = grov1.memoizedSerializedSize & 0x80000000 | v26;
                        baun1.h("Read Contacts data from source device successfully. Contacts data size = %d", new Object[]{v26});
                        return grov1;
                    }
                }
                baun1.h("Read Contacts data from source device successfully. Contacts data size = %d", new Object[]{v26});
                return grov1;
            }
            catch(aqrz aqrz0) {
                aqrx.a.g("Failed to read contacts ", aqrz0, new Object[0]);
                throw new aqrz("Failed to read contacts " + aqrz0.toString());
            }
            catch(aqry aqry0) {
                aqrx.a.g("Cursor null while querying for raw contacts", aqry0, new Object[0]);
                throw new aqry("Cursor null while querying for rawcontacts" + aqry0.toString());
            }
        }
        try {
            bblp3 = bblp1;
            aqsf.a.m("Could not query ContactsProvider to fetch Contact Ids; disabled? Give up.", new Object[0]);
            throw new aqry("Contacts query cursor is null");
        }
        catch(SQLiteException sQLiteException0) {
        label_682:
            cursor1 = cursor0;
            try {
            label_683:
                aqsf.a.g("ContentResolver.query threw an exception when fetching Contact Ids.", sQLiteException0, new Object[0]);
                throw new aqrz(a.ab(sQLiteException0, "Fetching Contact Ids query failed."));
            }
            catch(Throwable throwable2) {
                goto label_689;
            }
        }
        catch(Throwable throwable2) {
        }
    label_688:
        cursor1 = cursor0;
        try {
        label_689:
            if(cursor1 != null) {
                cursor1.close();
            }
            throw throwable2;
        }
        catch(Throwable throwable1) {
        }
    label_693:
        bblp2 = bblp3;
        try {
        label_694:
            if(bblp2 != null) {
                bblp2.shutdownNow();
            }
            synchronized(aqsf0) {
                aqsf0.o = 0L;
            }
            throw throwable1;
        }
        catch(aqrz aqrz0) {
            aqrx.a.g("Failed to read contacts ", aqrz0, new Object[0]);
            throw new aqrz("Failed to read contacts " + aqrz0.toString());
        }
        catch(aqry aqry0) {
            aqrx.a.g("Cursor null while querying for raw contacts", aqry0, new Object[0]);
            throw new aqry("Cursor null while querying for rawcontacts" + aqry0.toString());
        }
    }

    public final ByteArrayInputStream b() {
        ByteArrayInputStream byteArrayInputStream0;
        synchronized(this) {
            this.d();
            byteArrayInputStream0 = (ByteArrayInputStream)this.c.get();
        }
        return byteArrayInputStream0;
    }

    public final void c() {
        synchronized(this) {
            Future future0 = this.c;
            if(future0 == null) {
                aqrx.a.j("Contacts backup async not set up or already cancelled", new Object[0]);
                return;
            }
            future0.cancel(true);
            this.c = null;
        }
    }

    public final void d() {
        Throwable throwable1;
        bblp bblp0;
        __monitor_enter(this);
        try {
            if(this.c == null) {
                bblp0 = new bblp(1, 9);
                this.c = bblp0.e(new aqrw(this));
                goto label_14;
            }
            goto label_17;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            bblp0 = null;
            goto label_11;
        }
        try {
            this.c = bblp0.e(new aqrw(this));
            goto label_14;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_11:
            if(bblp0 != null) {
                bblp0.shutdown();
            }
            throw throwable1;
        label_14:
            bblp0.shutdown();
        }
        catch(Throwable throwable2) {
            __monitor_exit(this);
            throw throwable2;
        }
        __monitor_exit(this);
        return;
        try {
        label_17:
            aqrx.a.j("Contacts backup async already set up", new Object[0]);
        }
        catch(Throwable throwable2) {
            __monitor_exit(this);
            throw throwable2;
        }
        __monitor_exit(this);
    }

    public static boolean e(Context context0) {
        return cjmf.b(context0, "android.permission.READ_CONTACTS") == 0;
    }
}

