import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

public final class aqsf {
    public static final baun a;
    public static final Integer b;
    public static final byte[] c;
    static final String[] d;
    static final String[] e;
    static final String[] f;
    static final String[] g;
    static final String[] h;
    static final String[] i;
    public static final String[] j;
    static final gged_interceptors k;
    public final gful_cronetEngineProvider l;
    public Set m;
    public final Context n;
    public long o;
    private static final String[] p;
    private static final String[] q;
    private static final String[] r;
    private static final String[] s;
    private static final String[] t;

    static {
        aqsf.a = aqql.a("ReadContacts");
        aqsf.b = (int)0;
        aqsf.c = new byte[0];
        aqsf.d = new String[]{"_id", "times_contacted", "last_time_contacted", "starred"};
        aqsf.e = new String[]{"_id", "contact_id", "account_type", "account_name", "sourceid"};
        aqsf.p = new String[]{"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_super_primary"};
        aqsf.q = new String[]{"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_super_primary"};
        aqsf.f = new String[]{"raw_contact_id", "data1", "data2", "data3"};
        aqsf.g = new String[]{"raw_contact_id", "data1", "data2", "data3", "data5", "data6"};
        aqsf.h = new String[]{"raw_contact_id", "data1", "data2", "data3"};
        aqsf.i = new String[]{"raw_contact_id", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10"};
        aqsf.r = new String[]{"raw_contact_id", "data1", "data2", "data3"};
        aqsf.s = new String[]{"raw_contact_id", "data1"};
        aqsf.t = new String[]{"raw_contact_id", "data1", "data2", "data3"};
        aqsf.j = new String[]{"raw_contact_id", "data1"};
        aqsf.k = gged_interceptors.w("raw_contact_id", "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9", "data11");
    }

    public aqsf(Context context0) {
        this.l = gfus.a(((gful_cronetEngineProvider)new aqsb()));
        this.o = 0L;
        this.n = context0;
    }

    public final Cursor a(String s, String[] arr_s) {
        return this.n.getContentResolver().query(ContactsContract.Data.CONTENT_URI, arr_s, a.a(s, "mimetype = \'", "\'"), null, null);
    }

    public final Map b(HashSet hashSet0) {
        SQLiteException sQLiteException1;
        Throwable throwable1;
        Map map0 = new HashMap();
        ContentResolver contentResolver0 = this.n.getContentResolver();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, aqsf.q, null, null, null);
            if(cursor0 == null) {
                goto label_43;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(hashSet0.contains(long0)) {
                        String s = cursor0.getString(cursor0.getColumnIndex("data1"));
                        int v = cursor0.getInt(cursor0.getColumnIndex("data2"));
                        String s1 = cursor0.getString(cursor0.getColumnIndex("data3"));
                        if(!map0.containsKey(long0)) {
                            map0.put(long0, new ArrayList());
                        }
                        ArrayList arrayList0 = (ArrayList)map0.get(long0);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grom.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((grom)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((grom)hftv0).f = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((grom)hftp0.b_message).c = s1;
                        }
                        boolean z = cursor0.getInt(cursor0.getColumnIndex("is_super_primary")) != 0;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((grom)hftp0.b_message).g = z;
                        long v1 = cursor0.getLong(cursor0.getColumnIndex("times_used"));
                        long v2 = cursor0.getLong(cursor0.getColumnIndex("last_time_used"));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((grom)hftv1).d = v1;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((grom)hftp0.b_message).e = v2;
                        arrayList0.add(((grom)hftp0.N_build()));
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_49;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_52;
        }
        goto label_55;
        try {
            try {
            label_43:
                aqsf.a.m("Could not query ContactsProvider to fetch Email info; disabled? Give up.", new Object[0]);
                goto label_55;
            label_49:
                sQLiteException1 = sQLiteException0;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_49;
            }
            aqsf.a.g("ContentResolver.query threw an exception when fetching email info", sQLiteException1, new Object[0]);
            goto label_55;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
        }
    label_52:
        if(cursor0 != null) {
            cursor0.close();
        }
        throw throwable1;
    label_55:
        if(cursor0 != null) {
            cursor0.close();
        }
        return map0;
    }

    public final Map c(HashSet hashSet0) {
        Map map0 = new HashMap();
        Cursor cursor0 = null;
        try {
            cursor0 = this.a("vnd.android.cursor.item/im", aqsf.g);
            if(cursor0 == null) {
                goto label_39;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(hashSet0.contains(long0)) {
                        String s = cursor0.getString(cursor0.getColumnIndex("data1"));
                        int v = cursor0.getInt(cursor0.getColumnIndex("data2"));
                        String s1 = cursor0.getString(cursor0.getColumnIndex("data3"));
                        int v1 = cursor0.getInt(cursor0.getColumnIndex("data5"));
                        String s2 = cursor0.getString(cursor0.getColumnIndex("data6"));
                        if(!map0.containsKey(long0)) {
                            map0.put(long0, new ArrayList());
                        }
                        ArrayList arrayList0 = (ArrayList)map0.get(long0);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gron.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gron)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gron)hftv0).c = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gron)hftp0.b_message).d = s1;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gron)hftv1).e = v1;
                        if(s2 != null) {
                            if(!hftv1.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gron)hftp0.b_message).f = s2;
                        }
                        arrayList0.add(((gron)hftp0.N_build()));
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_42;
        }
        catch(Throwable throwable0) {
            goto label_45;
        }
        goto label_47;
        try {
            try {
            label_39:
                aqsf.a.m("Could not query ContactsProvider to fetch im info; disabled? Give up.", new Object[0]);
                goto label_47;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_42:
            aqsf.a.g("ContentResolver.query threw an exception when fetching im info", sQLiteException0, new Object[0]);
        }
        catch(Throwable throwable0) {
        label_45:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_47:
        if(cursor0 != null) {
            cursor0.close();
        }
        return map0;
    }

    public final Map d(HashSet hashSet0) {
        SQLiteException sQLiteException1;
        Throwable throwable1;
        Map map0 = new HashMap();
        ContentResolver contentResolver0 = this.n.getContentResolver();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, aqsf.p, null, null, null);
            if(cursor0 == null) {
                goto label_43;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(hashSet0.contains(long0)) {
                        String s = cursor0.getString(cursor0.getColumnIndex("data1"));
                        int v = cursor0.getInt(cursor0.getColumnIndex("data2"));
                        String s1 = cursor0.getString(cursor0.getColumnIndex("data3"));
                        if(!map0.containsKey(long0)) {
                            map0.put(long0, new ArrayList());
                        }
                        ArrayList arrayList0 = (ArrayList)map0.get(long0);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gror.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gror)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gror)hftv0).f = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gror)hftp0.b_message).c = s1;
                        }
                        boolean z = cursor0.getInt(cursor0.getColumnIndex("is_super_primary")) != 0;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gror)hftp0.b_message).g = z;
                        int v1 = cursor0.getInt(cursor0.getColumnIndex("times_used"));
                        long v2 = cursor0.getLong(cursor0.getColumnIndex("last_time_used"));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gror)hftv1).d = v1;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gror)hftp0.b_message).e = v2;
                        arrayList0.add(((gror)hftp0.N_build()));
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_49;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_52;
        }
        goto label_55;
        try {
            try {
            label_43:
                aqsf.a.m("Could not query ContactsProvider to fetch Phone info; disabled? Give up.", new Object[0]);
                goto label_55;
            label_49:
                sQLiteException1 = sQLiteException0;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_49;
            }
            aqsf.a.g("ContentResolver.query threw an exception when fetching phone info", sQLiteException1, new Object[0]);
            goto label_55;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
        }
    label_52:
        if(cursor0 != null) {
            cursor0.close();
        }
        throw throwable1;
    label_55:
        if(cursor0 != null) {
            cursor0.close();
        }
        return map0;
    }

    public final Map e(HashSet hashSet0) {
        SQLiteException sQLiteException1;
        Throwable throwable1;
        Map map0 = new HashMap();
        ContentResolver contentResolver0 = this.n.getContentResolver();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, aqsf.r, null, null, null);
            if(cursor0 == null) {
                goto label_30;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(hashSet0.contains(long0)) {
                        String s = cursor0.getString(cursor0.getColumnIndex("data1"));
                        int v = cursor0.getInt(cursor0.getColumnIndex("data2"));
                        String s1 = cursor0.getString(cursor0.getColumnIndex("data3"));
                        if(!map0.containsKey(long0)) {
                            map0.put(long0, new ArrayList());
                        }
                        List list0 = (List)map0.get(long0);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gros.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gros)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gros)hftv0).d = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gros)hftp0.b_message).c = s1;
                        }
                        list0.add(((gros)hftp0.N_build()));
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_36;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_39;
        }
        goto label_42;
        try {
            try {
            label_30:
                aqsf.a.m("Could not query ContactsProvider to fetch Postal info; disabled? Give up.", new Object[0]);
                goto label_42;
            label_36:
                sQLiteException1 = sQLiteException0;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_36;
            }
            aqsf.a.g("ContentResolver.query threw an exception when fetching postal info", sQLiteException1, new Object[0]);
            goto label_42;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
        }
    label_39:
        if(cursor0 != null) {
            cursor0.close();
        }
        throw throwable1;
    label_42:
        if(cursor0 != null) {
            cursor0.close();
        }
        return map0;
    }

    public final Map f(HashSet hashSet0) {
        Map map0 = new HashMap();
        ContentResolver contentResolver0 = this.n.getContentResolver();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = contentResolver0.query(ContactsContract.RawContacts.CONTENT_URI, aqsf.e, null, null, null);
                if(cursor0 == null) {
                    aqsf.a.m("Could not query ContactsProvider to fetch RawContacts; disabled? Give up.", new Object[0]);
                    throw new aqry("Raw contacts query cursor is null");
                }
                while(cursor0.moveToNext()) {
                    long v = cursor0.getLong(cursor0.getColumnIndex("_id"));
                    long v1 = cursor0.getLong(cursor0.getColumnIndex("contact_id"));
                    if(hashSet0.contains(Long.valueOf(v1))) {
                        aqse aqse0 = new aqse(v, v1, cursor0.getString(cursor0.getColumnIndex("sourceid")), cursor0.getString(cursor0.getColumnIndex("account_type")), cursor0.getString(cursor0.getColumnIndex("account_name")));
                        Long long0 = v;
                        if(map0.containsKey(long0)) {
                            aqsf.a.f("Raw contact id already exists, this should not happen.", new Object[0]);
                        }
                        else {
                            map0.put(long0, aqse0);
                        }
                    }
                }
            }
            catch(SQLiteException sQLiteException0) {
                aqsf.a.g("ContentResolver.query threw an exception when fetching raw-contacts.", sQLiteException0, new Object[0]);
                throw new aqrz(a.ab(sQLiteException0, "Fetching raw contacts query failed."));
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return map0;
    }

    public final void g(Map map0) {
        Cursor cursor0 = null;
        try {
            cursor0 = this.a("vnd.android.cursor.item/name", aqsf.s);
            if(cursor0 == null) {
                goto label_9;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(map0.containsKey(long0)) {
                        ((aqse)map0.get(long0)).g = cursor0.getString(cursor0.getColumnIndex("data1"));
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_12;
        }
        catch(Throwable throwable0) {
            goto label_15;
        }
        goto label_17;
        try {
            try {
            label_9:
                aqsf.a.m("Could not query ContactsProvider to fetch display name; disabled? Give up.", new Object[0]);
                goto label_17;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_12:
            aqsf.a.g("ContentResolver.query threw an exception when fetching note info", sQLiteException0, new Object[0]);
        }
        catch(Throwable throwable0) {
        label_15:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_17:
        if(cursor0 != null) {
            cursor0.close();
        }
    }

    public final void h(Map map0) {
        Cursor cursor0 = null;
        try {
            cursor0 = this.a("vnd.android.cursor.item/nickname", aqsf.t);
            if(cursor0 == null) {
                goto label_28;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(map0.containsKey(long0)) {
                        String s = cursor0.getString(cursor0.getColumnIndex("data1"));
                        int v = cursor0.getInt(cursor0.getColumnIndex("data2"));
                        Integer integer0 = v;
                        String s1 = cursor0.getString(cursor0.getColumnIndex("data3"));
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grop.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((grop)hftp0.b_message).b = s;
                        }
                        integer0.getClass();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((grop)hftv0).d = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((grop)hftp0.b_message).c = s1;
                        }
                        aqse aqse0 = (aqse)map0.get(long0);
                        aqse0.h = (grop)hftp0.N_build();
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_31;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        goto label_36;
        try {
            try {
            label_28:
                aqsf.a.m("Could not query ContactsProvider to fetch Nickname info; disabled?Give up.", new Object[0]);
                goto label_36;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_31:
            aqsf.a.g("ContentResolver.query threw an exception when fetching note info", sQLiteException0, new Object[0]);
        }
        catch(Throwable throwable0) {
        label_34:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_36:
        if(cursor0 != null) {
            cursor0.close();
        }
    }

    public final void i(Map map0) {
        Cursor cursor0 = null;
        try {
            cursor0 = this.a("vnd.android.cursor.item/organization", aqsf.i);
            if(cursor0 == null) {
                goto label_61;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(map0.containsKey(long0)) {
                        String s = cursor0.getString(cursor0.getColumnIndex("data1"));
                        int v = cursor0.getInt(cursor0.getColumnIndex("data2"));
                        String s1 = cursor0.getString(cursor0.getColumnIndex("data3"));
                        String s2 = cursor0.getString(cursor0.getColumnIndex("data4"));
                        String s3 = cursor0.getString(cursor0.getColumnIndex("data5"));
                        String s4 = cursor0.getString(cursor0.getColumnIndex("data6"));
                        String s5 = cursor0.getString(cursor0.getColumnIndex("data7"));
                        String s6 = cursor0.getString(cursor0.getColumnIndex("data8"));
                        String s7 = cursor0.getString(cursor0.getColumnIndex("data9"));
                        String s8 = cursor0.getString(cursor0.getColumnIndex("data10"));
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)groq.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((groq)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((groq)hftv0).c = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((groq)hftp0.b_message).d = s1;
                        }
                        if(s2 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((groq)hftp0.b_message).e = s2;
                        }
                        if(s3 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((groq)hftp0.b_message).f = s3;
                        }
                        if(s4 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((groq)hftp0.b_message).g = s4;
                        }
                        if(s5 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((groq)hftp0.b_message).h = s5;
                        }
                        if(s6 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((groq)hftp0.b_message).i = s6;
                        }
                        if(s7 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((groq)hftp0.b_message).j = s7;
                        }
                        if(s8 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((groq)hftp0.b_message).k = s8;
                        }
                        aqse aqse0 = (aqse)map0.get(long0);
                        aqse0.i = (groq)hftp0.N_build();
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_64;
        }
        catch(Throwable throwable0) {
            goto label_67;
        }
        goto label_69;
        try {
            try {
            label_61:
                aqsf.a.m("Could not query CP2 to fetch Organization info; disabled? Give up.", new Object[0]);
                goto label_69;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_64:
            aqsf.a.g("ContentResolver.query threw an exception when fetching organization info", sQLiteException0, new Object[0]);
        }
        catch(Throwable throwable0) {
        label_67:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_69:
        if(cursor0 != null) {
            cursor0.close();
        }
    }

    public final boolean j(long v) {
        synchronized(this) {
            if(this.o + v <= hqhq.d()) {
                this.o += v;
                return true;
            }
        }
        return false;
    }
}

