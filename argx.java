import android.app.backup.FullBackupDataOutput;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri.Builder;
import android.net.Uri;
import android.provider.Telephony.Mms;
import android.provider.Telephony.Sms;
import android.provider.Telephony.Threads;
import android.text.TextUtils;
import android.util.JsonWriter;
import android.util.Pair;
import android.util.SparseArray;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;
import jeb.synthetic.TWR;

public final class argx implements argy {
    static final String[] a;
    static final String[] b;
    static final String[] c;
    static final String[] d;
    static final Uri e;
    static final Uri f;
    public final int g;
    public final int h;
    public Map i;
    public long j;
    public long k;
    private static final bboh l;
    private static final aqql m;
    private static final String[] n;
    private static final String[] o;
    private final int p;
    private final long q;
    private int r;
    private final ContentResolver s;
    private Map t;
    private Map u;
    private final Context v;

    static {
        argx.l = bboh.b("TelephonyBackupAgent", bbcu.dF);
        argx.m = new aqql(new String[]{"TelephonyBackupAgent"});
        argx.a = new String[]{"_id", "address", "body", "subject", "date", "date_sent", "status", "type", "thread_id", "read"};
        argx.n = new String[]{"_id", "recipient_ids"};
        argx.b = new String[]{"_id", "sub", "sub_cs", "date", "date_sent", "m_type", "v", "msg_box", "ct_l", "thread_id", "tr_id", "read"};
        argx.c = new String[]{"type", "address", "charset"};
        argx.d = new String[]{"text", "chset", "mid", "_id", "ct", "cl", "name"};
        argx.o = new String[]{"archived"};
        argx.e = Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build();
        argx.f = Uri.parse("content://mms-sms/canonical-address");
    }

    public argx(Context context0) {
        this.p = (int)hqhq.a.j().i();
        this.q = (long)(((int)hqhq.a.j().k()));
        this.r = (int)hqhq.a.j().j();
        this.g = (int)hqmi.a.b().b();
        this.h = (int)hqmi.a.b().a();
        this.i = new HashMap();
        this.t = null;
        this.u = null;
        this.j = -1L;
        this.k = -1L;
        this.v = context0;
        this.s = context0.getContentResolver();
    }

    public static long a(Cursor cursor0) {
        return cursor0.getLong(cursor0.getColumnIndex("date"));
    }

    public final Cursor b() {
        return this.s.query(Telephony.Mms.CONTENT_URI, argx.b, null, null, "date ASC");
    }

    public final Cursor c() {
        return this.s.query(Telephony.Sms.CONTENT_URI, argx.a, null, null, "date ASC");
    }

    public final void d(FullBackupDataOutput fullBackupDataOutput0, Cursor cursor0, String s) {
        Closeable closeable0;
        Cursor cursor1;
        aqql aqql2;
        File file3;
        int v9;
        aqql aqql1;
        File file2;
        int v8;
        File file1;
        JsonWriter jsonWriter1;
        JsonWriter jsonWriter0;
        if(cursor0.isAfterLast()) {
            return;
        }
        File file0 = aqze.b(this.v, s);
        aqql aqql0 = argx.m;
        aqql0.d("backupFile: %s", new Object[]{file0.getAbsolutePath()});
        try {
            jsonWriter0 = new JsonWriter(new BufferedWriter(new OutputStreamWriter(new DeflaterOutputStream(new FileOutputStream(file0)), StandardCharsets.UTF_8), 0x8000));
        }
        catch(Throwable throwable0) {
            jsonWriter1 = null;
            bbpb.b(jsonWriter1);
            throw throwable0;
        }
        if(s.endsWith("_sms_backup")) {
            try {
                jsonWriter0.beginArray();
                int v;
                for(v = 0; v < this.p && !cursor0.isAfterLast(); ++v) {
                    jsonWriter0.beginObject();
                    for(int v1 = 0; v1 < cursor0.getColumnCount(); ++v1) {
                        String s1 = cursor0.getColumnName(v1);
                        String s2 = cursor0.getString(v1);
                        if(s2 != null) {
                            switch(s1) {
                                case "_id": {
                                    break;
                                }
                                case "thread_id": {
                                    this.h(jsonWriter0, cursor0.getLong(v1));
                                    break;
                                }
                                default: {
                                    jsonWriter0.name(s1).value(s2);
                                }
                            }
                        }
                    }
                    jsonWriter0.endObject();
                    cursor0.moveToNext();
                }
                jsonWriter0.endArray();
                file1 = file0;
                goto label_158;
            label_33:
                jsonWriter0.beginArray();
                aqql0.j("Batching queries for MMS bodies with batch size %d", new Object[]{((int)this.r)});
                int v2 = cursor0.getPosition();
                ArrayList arrayList0 = new ArrayList();
                for(int v3 = 0; v3 < this.r && !cursor0.isAfterLast(); ++v3) {
                    arrayList0.add(Integer.valueOf(cursor0.getInt(0)));
                    cursor0.moveToNext();
                }
                int v4 = arrayList0.size();
                SparseArray sparseArray0;
                for(sparseArray0 = this.f(arrayList0); sparseArray0 == null; sparseArray0 = this.f(arrayList0)) {
                    aqql0.j("Looks like query was too big (batch size: %d), trying to decrease by 1", new Object[]{arrayList0.size()});
                    arrayList0.remove(arrayList0.size() - 1);
                    this.r = arrayList0.size();
                }
                cursor0.move(-(v4 - sparseArray0.size()));
                int v5 = cursor0.getPosition();
                cursor0.moveToPosition(v2);
                int v6 = 0;
                while(cursor0.getPosition() < v5) {
                    int v7 = cursor0.getInt(0);
                    argw argw0 = (argw)sparseArray0.get(v7);
                    if(argw0 == null) {
                        aqql0.f("Mms body is null", new Object[0]);
                        v8 = v6;
                        file2 = file0;
                        aqql1 = aqql0;
                        v9 = 0;
                    }
                    else {
                        jsonWriter0.beginObject();
                        int v10 = 0;
                        boolean z = true;
                        while(v10 < cursor0.getColumnCount()) {
                            String s3 = cursor0.getColumnName(v10);
                            String s4 = cursor0.getString(v10);
                            if(s4 == null) {
                                file3 = file0;
                                aqql2 = aqql0;
                            }
                            else {
                                switch(s3) {
                                    case "_id": 
                                    case "sub_cs": {
                                        file3 = file0;
                                        aqql2 = aqql0;
                                        goto label_91;
                                    }
                                    case "sub": {
                                        goto label_84;
                                    }
                                    case "thread_id": {
                                        file3 = file0;
                                        aqql2 = aqql0;
                                        this.h(jsonWriter0, cursor0.getLong(v10));
                                        goto label_91;
                                    }
                                }
                                file3 = file0;
                                aqql2 = aqql0;
                                jsonWriter0.name(s3).value(s4);
                                goto label_91;
                            label_84:
                                jsonWriter0.name(s3).value(s4);
                                file3 = file0;
                                aqql2 = aqql0;
                                z = false;
                            }
                        label_91:
                            ++v10;
                            v6 = v6;
                            aqql0 = aqql2;
                            file0 = file3;
                        }
                        v8 = v6;
                        file2 = file0;
                        aqql1 = aqql0;
                        JsonWriter jsonWriter2 = jsonWriter0.name("mms_addresses");
                        Uri.Builder uri$Builder0 = Telephony.Mms.CONTENT_URI.buildUpon();
                        uri$Builder0.appendPath(String.valueOf(v7)).appendPath("addr");
                        Uri uri0 = uri$Builder0.build();
                        jsonWriter2.beginArray();
                        try {
                            cursor1 = this.s.query(uri0, argx.c, null, null, "_id ASC");
                        }
                        catch(Throwable throwable1) {
                            closeable0 = null;
                            bbpb.b(closeable0);
                            throw throwable1;
                        }
                        if(cursor1 != null) {
                            try {
                                if(cursor1.moveToFirst()) {
                                    do {
                                        if(cursor1.getString(cursor1.getColumnIndex("address")) != null) {
                                            jsonWriter2.beginObject();
                                            argx.i(jsonWriter2, cursor1, "type");
                                            argx.j(jsonWriter2, cursor1, "address");
                                            argx.i(jsonWriter2, cursor1, "charset");
                                            jsonWriter2.endObject();
                                        }
                                    }
                                    while(cursor1.moveToNext());
                                }
                                goto label_123;
                            }
                            catch(Throwable throwable1) {
                                closeable0 = cursor1;
                            }
                            bbpb.b(closeable0);
                            throw throwable1;
                        }
                    label_123:
                        bbpb.b(cursor1);
                        jsonWriter2.endArray();
                        jsonWriter0.name("mms_body").value(gfta.b(argw0.a));
                        jsonWriter0.name("mms_charset").value(((long)argw0.b));
                        if(!z) {
                            argx.j(jsonWriter0, cursor0, "sub_cs");
                        }
                        if(argw0.d != null) {
                            JsonWriter jsonWriter3 = jsonWriter0.name("attachments");
                            jsonWriter3.beginArray();
                            for(Object object0: argw0.d) {
                                jsonWriter3.beginObject();
                                jsonWriter3.name("mime_type").value(((argv)object0).a);
                                jsonWriter3.name("filename").value(((argv)object0).b);
                                jsonWriter3.endObject();
                            }
                            jsonWriter3.endArray();
                        }
                        if(argw0.c != null) {
                            jsonWriter0.name("smil").value(argw0.c);
                        }
                        jsonWriter0.endObject();
                        v9 = 1;
                    }
                    v6 = v8 + v9;
                    cursor0.moveToNext();
                    aqql0 = aqql1;
                    file0 = file2;
                }
                file1 = file0;
                jsonWriter0.endArray();
                v = v6;
                goto label_158;
            }
            catch(Throwable throwable0) {
            }
        }
        else {
            goto label_33;
        }
        jsonWriter1 = jsonWriter0;
        bbpb.b(jsonWriter1);
        throw throwable0;
    label_158:
        bbpb.b(jsonWriter0);
        if(v > 0) {
            aqwp.g("d_f", file1.getParent(), file1.getAbsolutePath(), fullBackupDataOutput0);
        }
        file1.delete();
    }

    public static final void e(Cursor cursor0, int v) {
        if(v > 0 && cursor0.getCount() > v) {
            cursor0.moveToPosition(cursor0.getCount() - v);
            return;
        }
        cursor0.moveToFirst();
    }

    private final SparseArray f(ArrayList arrayList0) {
        argw argw0;
        int v4;
        long v3;
        Closeable closeable0;
        SparseArray sparseArray2;
        Cursor cursor0;
        SparseArray sparseArray1;
        argx argx0 = this;
        ArrayList arrayList1 = arrayList0;
        if(arrayList1.isEmpty()) {
            return new SparseArray();
        }
        Uri uri0 = Telephony.Mms.CONTENT_URI.buildUpon().appendPath("part").build();
        SparseArray sparseArray0 = new SparseArray();
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = (int)(((Integer)arrayList1.get(v1)));
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append(',');
            }
            stringBuilder0.append(v2);
            sparseArray0.put(v2, new argw());
        }
        try {
            sparseArray1 = null;
            cursor0 = argx0.s.query(uri0, argx.d, String.format("%s IN (%s)", "mid", stringBuilder0), null, "_id ASC");
        }
        catch(SQLException sQLException0) {
            sparseArray2 = null;
            cursor0 = null;
            goto label_98;
        }
        catch(Throwable throwable0) {
            closeable0 = null;
            bbpb.b(closeable0);
            throw throwable0;
        }
        if(cursor0 == null) {
            try {
                argx.m.m("Cursor is null when doing batch query", new Object[0]);
                return null;
            label_30:
                if(cursor0.moveToFirst()) {
                    v3 = 0L;
                    while(true) {
                    label_32:
                        v4 = cursor0.getInt(cursor0.getColumnIndex("mid"));
                        argw0 = (argw)sparseArray0.get(v4);
                        if(argw0 == null) {
                            argx.m.f("Got part id for the message that wasn\'t in the batch query, msgId=%d", new Object[]{v4});
                            sparseArray2 = sparseArray1;
                            goto label_88;
                        }
                        goto label_38;
                    }
                }
                goto label_105;
            }
            catch(SQLException sQLException0) {
                goto label_97;
            }
            catch(Throwable throwable0) {
                closeable0 = cursor0;
                bbpb.b(closeable0);
                throw throwable0;
            }
        }
        goto label_30;
    label_38:
        long v5 = argx0.q;
        sparseArray2 = sparseArray1;
        if(Long.compare(v5, 0L) > 0) {
            try {
                String s = cursor0.getString(cursor0.getColumnIndex("text"));
                int v6 = cursor0.getInt(cursor0.getColumnIndex("_id"));
                long v7 = v3;
                String s1 = cursor0.getString(cursor0.getColumnIndex("cl"));
                String s2 = cursor0.getString(cursor0.getColumnIndex("ct"));
                int v8 = gfta.b(s).length() + (aqwp.f(s2) ? aqwo.b(s1, cursor0.getString(cursor0.getColumnIndex("name")), v6) : "").length() + s2.length();
                long v9 = v7 + ((long)v8);
                int v10 = 1;
                while(v9 > v5 && arrayList1.size() > 1) {
                    Integer integer0 = (Integer)arrayList1.remove(arrayList1.size() - 1);
                    int v11 = (int)integer0;
                    argx.m.j("Batch doesn\'t fit in memory after new part added, new size: %d, removing %d", new Object[]{v9, integer0});
                    argw argw1 = (argw)sparseArray0.get(v11);
                    sparseArray0.remove(v11);
                    v10 &= (v11 == v4 ? 0 : 1);
                    v8 = v11 == v4 ? 0 : v8;
                    String s3 = argw1.a;
                    if(s3 != null) {
                        v7 -= (long)s3.length();
                    }
                    v9 = v7 + ((long)v8);
                    arrayList1 = arrayList0;
                }
                Pair pair0 = Pair.create(Long.valueOf(v9), Boolean.valueOf(((boolean)v10)));
                v3 = (long)(((Long)pair0.first));
                if(((Boolean)pair0.second).booleanValue()) {
                label_66:
                    String s4 = cursor0.getString(cursor0.getColumnIndex("text"));
                    if(cursor0.getColumnIndex("_id") > 0 && cursor0.getColumnIndex("cl") > 0 && cursor0.getColumnIndex("ct") > 0) {
                        int v12 = cursor0.getInt(cursor0.getColumnIndex("_id"));
                        String s5 = cursor0.getString(cursor0.getColumnIndex("cl"));
                        String s6 = cursor0.getString(cursor0.getColumnIndex("ct"));
                        String s7 = cursor0.getString(cursor0.getColumnIndex("name"));
                        if(aqwp.f(s6)) {
                            argv argv0 = new argv(s6, aqwo.b(s5, s7, v12));
                            if(argw0.d == null) {
                                argw0.d = new ArrayList();
                            }
                            argw0.d.add(argv0);
                            goto label_88;
                        }
                        else if(s6.equals("application/smil")) {
                            argw0.c = s4;
                            goto label_88;
                        }
                    }
                    if(!hqhq.a.j().af() || s4 != null) {
                        argw0.a = TextUtils.isEmpty(argw0.a) ? s4 : argw0.a + s4;
                        if(!TextUtils.isEmpty(argw0.a)) {
                            argw0.b = cursor0.getInt(cursor0.getColumnIndex("chset"));
                        }
                    }
                }
            label_88:
                if(cursor0.moveToNext()) {
                    argx0 = this;
                    arrayList1 = arrayList0;
                    sparseArray1 = sparseArray2;
                    goto label_32;
                }
                goto label_105;
            }
            catch(SQLException sQLException0) {
                goto label_98;
            }
            catch(Throwable throwable0) {
                closeable0 = cursor0;
                bbpb.b(closeable0);
                throw throwable0;
            }
        }
        else {
            goto label_66;
        }
        goto label_88;
        try {
            try {
            }
            catch(SQLException sQLException0) {
            }
            goto label_98;
            try {
                argx0 = this;
                arrayList1 = arrayList0;
                sparseArray1 = sparseArray2;
                goto label_32;
            }
            catch(SQLException sQLException0) {
            label_97:
                sparseArray2 = sparseArray1;
            }
        label_98:
            argx.m.n("Exception while doing batch query", sQLException0, new Object[0]);
        }
        catch(Throwable throwable0) {
            closeable0 = cursor0;
            bbpb.b(closeable0);
            throw throwable0;
        }
        bbpb.b(cursor0);
        return sparseArray2;
    label_105:
        bbpb.b(cursor0);
        return sparseArray0;
    }

    private final String g(long v) {
        String s1;
        Map map0 = this.u;
        if(map0 != null) {
            Long long0 = v;
            if(map0.containsKey(long0)) {
                return (String)this.u.get(long0);
            }
        }
        Cursor cursor0 = this.s.query(argx.e, argx.n, null, null, null);
        String s = null;
        if(cursor0 == null) {
            return null;
        }
        try {
            try {
                if(cursor0.moveToFirst()) {
                    do {
                        long v1 = cursor0.getLong(0);
                        s1 = cursor0.getString(1);
                        if(v == v1) {
                            goto label_17;
                        }
                        if(map0 != null) {
                            this.u.put(Long.valueOf(v1), s1);
                        }
                    }
                    while(cursor0.moveToNext());
                    goto label_27;
                label_17:
                    s = s1;
                }
            }
            catch(SQLException sQLException0) {
                argx.m.m("Error while querying recipients sequentially: %s", new Object[]{sQLException0.getMessage()});
                long v2 = hqhn.c();
                aqqo.a(argx.l, sQLException0, v2);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_27:
        cursor0.close();
        return s;
    }

    private final void h(JsonWriter jsonWriter0, long v) {
        Cursor cursor1;
        String[] arr_s1;
        long v2;
        CharSequence charSequence0;
        String s;
        if(this.t == null) {
            this.t = new HashMap();
        }
        if(this.u == null) {
            this.u = new HashMap();
        }
        Long long0 = v;
        if(!this.t.containsKey(long0)) {
            if(Long.compare(v, 0L) > 0) {
                Cursor cursor0 = this.s.query(argx.e, argx.n, "_id=?", new String[]{String.valueOf(v)}, null);
                if(cursor0 != null) {
                    try {
                        if(cursor0.moveToFirst()) {
                            s = cursor0.getString(1);
                            goto label_19;
                        }
                        else if(cursor0.getCount() == 0) {
                            argx.m.m("Couldn\'t find thread id, trying sequential search", new Object[0]);
                            s = this.g(v);
                            goto label_19;
                        }
                        else {
                            goto label_22;
                        }
                        goto label_28;
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(cursor0, throwable0);
                        throw throwable0;
                    }
                label_19:
                    cursor0.close();
                    charSequence0 = s;
                    goto label_28;
                label_22:
                    cursor0.close();
                }
            }
            charSequence0 = null;
        label_28:
            if(TextUtils.isEmpty(charSequence0)) {
                this.t.put(long0, new ArrayList());
            }
            else {
                Map map0 = this.t;
                ArrayList arrayList0 = new ArrayList();
                String[] arr_s = ((String)charSequence0).split(" ");
                int v1 = 0;
                while(v1 < arr_s.length) {
                    String s1 = arr_s[v1];
                    try {
                        v2 = Long.parseLong(s1);
                        if(v2 < 0L) {
                            argx.m.f(a.u(v2, "getAddresses: invalid id "), new Object[0]);
                            arr_s1 = arr_s;
                        }
                        else {
                            goto label_44;
                        }
                    }
                    catch(NumberFormatException numberFormatException0) {
                        arr_s1 = arr_s;
                        argx.m.g("getAddresses: invalid id. " + numberFormatException0.toString(), numberFormatException0, new Object[0]);
                    }
                    goto label_64;
                    try {
                    label_44:
                        Uri uri0 = ContentUris.withAppendedId(argx.f, v2);
                        arr_s1 = arr_s;
                        cursor1 = this.s.query(uri0, null, null, null, null);
                        arr_s1 = arr_s;
                    }
                    catch(Exception exception0) {
                        argx.m.g(a.u(v2, "getAddresses: query failed for id "), exception0, new Object[0]);
                        cursor1 = null;
                    }
                    if(cursor1 != null) {
                        try {
                            if(cursor1.moveToFirst()) {
                                String s2 = cursor1.getString(0);
                                if(TextUtils.isEmpty(s2)) {
                                    argx.m.f(a.u(v2, "Canonical MMS/SMS address is empty for id: "), new Object[0]);
                                }
                                else {
                                    arrayList0.add(s2);
                                }
                            }
                        }
                        catch(Throwable throwable1) {
                            TWR.safeClose$NT(cursor1, throwable1);
                            throw throwable1;
                        }
                        cursor1.close();
                    }
                label_64:
                    ++v1;
                    arr_s = arr_s1;
                }
                if(arrayList0.isEmpty()) {
                    argx.m.f(a.a(((String)charSequence0), "No MMS addresses found from ids string [", "]"), new Object[0]);
                }
                map0.put(long0, arrayList0);
            }
            Map map1 = this.u;
            if(map1 != null) {
                map1.remove(Long.valueOf(v));
            }
        }
        List list0 = (List)this.t.get(Long.valueOf(v));
        if(list0 != null && !list0.isEmpty()) {
            JsonWriter jsonWriter1 = jsonWriter0.name("recipients");
            jsonWriter1.beginArray();
            for(Object object0: list0) {
                jsonWriter1.value(((String)object0));
            }
            jsonWriter1.endArray();
            Long long1 = v;
            if(!this.i.containsKey(long1)) {
                boolean z = this.k(v);
                if(z) {
                    jsonWriter0.name("archived").value(true);
                }
                this.i.put(long1, Boolean.valueOf(z));
            }
        }
    }

    private static void i(JsonWriter jsonWriter0, Cursor cursor0, String s) {
        int v = cursor0.getInt(cursor0.getColumnIndex(s));
        if(v != 0) {
            jsonWriter0.name(s).value(((long)v));
        }
    }

    private static void j(JsonWriter jsonWriter0, Cursor cursor0, String s) {
        String s1 = cursor0.getString(cursor0.getColumnIndex(s));
        if(s1 != null) {
            jsonWriter0.name(s).value(s1);
        }
    }

    private final boolean k(long v) {
        Cursor cursor0;
        Uri.Builder uri$Builder0 = Telephony.Threads.CONTENT_URI.buildUpon();
        uri$Builder0.appendPath(String.valueOf(v)).appendPath("recipients");
        Uri uri0 = uri$Builder0.build();
        boolean z = false;
        try {
            cursor0 = this.s.query(uri0, argx.o, null, null, null);
            if(cursor0 != null && cursor0.moveToFirst()) {
                return cursor0.getInt(0) == 1 ? true : z;
            }
        }
        catch(SQLException sQLException0) {
            argx.m.m("Cannot query thread archived: %s", new Object[]{sQLException0.getMessage()});
            long v2 = hqhn.c();
            aqqo.a(argx.l, sQLException0, v2);
        }
        finally {
            bbpb.b(cursor0);
        }
        return false;
    }
}

