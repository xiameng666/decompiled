import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.provider.ContactsContract.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import jeb.synthetic.TWR;

public final class ehkh {
    public static final String[] a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    static final String[] e;
    public static final String[] f;
    static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public final Context j;
    private static final String[] k;
    private static final String[] l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] o;
    private static final String[] p;

    static {
        ehkh.a = new String[]{"_id", "times_contacted", "last_time_contacted", "starred", "custom_ringtone", "send_to_voicemail"};
        ehkh.b = new String[]{"_id", "times_contacted", "last_time_contacted", "starred", "custom_ringtone", "send_to_voicemail", "contact_last_updated_timestamp"};
        ehkh.c = new String[]{"_id", "contact_id", "account_type", "account_name", "sourceid", "data_set", "times_contacted", "last_time_contacted", "display_name", "display_name_alt"};
        ehkh.k = new String[]{"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_primary", "is_super_primary"};
        ehkh.l = new String[]{"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_primary", "is_super_primary"};
        ehkh.d = new String[]{"raw_contact_id", "data1", "data2", "data3"};
        ehkh.e = new String[]{"raw_contact_id", "data1", "data2", "data3", "data5", "data6", "is_primary", "is_super_primary"};
        ehkh.f = new String[]{"raw_contact_id", "data1", "data2", "data3"};
        ehkh.g = new String[]{"raw_contact_id", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10"};
        ehkh.m = new String[]{"raw_contact_id", "data1", "data2", "data3", "is_primary", "is_super_primary"};
        ehkh.n = new String[]{"raw_contact_id", "data1", "data2", "data3"};
        ehkh.o = new String[]{"raw_contact_id", "data1"};
        ehkh.h = new String[]{"raw_contact_id", "photo_uri"};
        ehkh.i = new String[]{"raw_contact_id", "data1", "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9", "data11"};
        ehkh.p = new String[]{"raw_contact_id", "data1"};
    }

    public ehkh(Context context0) {
        this.j = context0;
    }

    public final Cursor a(String s, String[] arr_s) {
        return this.j.getContentResolver().query(ContactsContract.Data.CONTENT_URI, arr_s, a.a(s, "mimetype = \'", "\'"), null, null);
    }

    public final Map b(HashSet hashSet0) {
        SQLiteException sQLiteException1;
        Throwable throwable1;
        Map map0 = new HashMap();
        ContentResolver contentResolver0 = this.j.getContentResolver();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, ehkh.l, null, null, null);
            if(cursor0 == null) {
                goto label_52;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(hashSet0.contains(long0)) {
                        String s = cursor0.getString(cursor0.getColumnIndex("data1"));
                        int v = cursor0.getInt(cursor0.getColumnIndex("data2"));
                        String s1 = cursor0.getString(cursor0.getColumnIndex("data3"));
                        int v1 = cursor0.getInt(cursor0.getColumnIndex("is_primary"));
                        int v2 = cursor0.getInt(cursor0.getColumnIndex("is_super_primary"));
                        if(!map0.containsKey(long0)) {
                            map0.put(long0, new ArrayList());
                        }
                        ArrayList arrayList0 = (ArrayList)map0.get(long0);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsuw.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsuw)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gsuw)hftv0).f = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsuw)hftp0.b_message).c = s1;
                        }
                        long v3 = cursor0.getLong(cursor0.getColumnIndex("times_used"));
                        long v4 = cursor0.getLong(cursor0.getColumnIndex("last_time_used"));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gsuw)hftv1).d = v3;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp0.b_message;
                        ((gsuw)hftv2).e = v4;
                        boolean z = false;
                        if(!hftv2.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp0.b_message;
                        ((gsuw)hftv3).g = v1 == 1;
                        if(v2 == 1) {
                            z = true;
                        }
                        if(!hftv3.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gsuw)hftp0.b_message).h = z;
                        arrayList0.add(((gsuw)hftp0.N_build()));
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_58;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_61;
        }
        goto label_64;
        try {
            try {
            label_52:
                egig.k("ReadContactsHelper", "Could not query ContactsProvider to fetch Email info; disabled? Give up.");
                goto label_64;
            label_58:
                sQLiteException1 = sQLiteException0;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_58;
            }
            egig.c("ReadContactsHelper", "ContentResolver.query threw an exception when fetching email info", sQLiteException1);
            goto label_64;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
        }
    label_61:
        if(cursor0 != null) {
            cursor0.close();
        }
        throw throwable1;
    label_64:
        if(cursor0 != null) {
            cursor0.close();
        }
        return map0;
    }

    public final Map c(HashSet hashSet0) {
        Map map0 = new HashMap();
        Cursor cursor0 = null;
        try {
            cursor0 = this.a("vnd.android.cursor.item/im", ehkh.e);
            if(cursor0 == null) {
                goto label_51;
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
                        int v2 = cursor0.getInt(cursor0.getColumnIndex("is_primary"));
                        int v3 = cursor0.getInt(cursor0.getColumnIndex("is_super_primary"));
                        if(!map0.containsKey(long0)) {
                            map0.put(long0, new ArrayList());
                        }
                        ArrayList arrayList0 = (ArrayList)map0.get(long0);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsvb.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvb)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gsvb)hftv0).c = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvb)hftp0.b_message).d = s1;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gsvb)hftv1).e = v1;
                        if(s2 != null) {
                            if(!hftv1.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvb)hftp0.b_message).f = s2;
                        }
                        boolean z = false;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp0.b_message;
                        ((gsvb)hftv2).g = v2 == 1;
                        if(v3 == 1) {
                            z = true;
                        }
                        if(!hftv2.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gsvb)hftp0.b_message).h = z;
                        arrayList0.add(((gsvb)hftp0.N_build()));
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_54;
        }
        catch(Throwable throwable0) {
            goto label_57;
        }
        goto label_59;
        try {
            try {
            label_51:
                egig.k("ReadContactsHelper", "Could not query ContactsProvider to fetch im info; disabled? Give up.");
                goto label_59;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_54:
            egig.c("ReadContactsHelper", "ContentResolver.query threw an exception when fetching im info", sQLiteException0);
        }
        catch(Throwable throwable0) {
        label_57:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_59:
        if(cursor0 != null) {
            cursor0.close();
        }
        return map0;
    }

    public final Map d(HashSet hashSet0) {
        SQLiteException sQLiteException1;
        Throwable throwable1;
        Map map0 = new HashMap();
        ContentResolver contentResolver0 = this.j.getContentResolver();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, ehkh.k, null, null, null);
            if(cursor0 == null) {
                goto label_52;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(hashSet0.contains(long0)) {
                        String s = cursor0.getString(cursor0.getColumnIndex("data1"));
                        int v = cursor0.getInt(cursor0.getColumnIndex("data2"));
                        String s1 = cursor0.getString(cursor0.getColumnIndex("data3"));
                        int v1 = cursor0.getInt(cursor0.getColumnIndex("is_primary"));
                        int v2 = cursor0.getInt(cursor0.getColumnIndex("is_super_primary"));
                        if(!map0.containsKey(long0)) {
                            map0.put(long0, new ArrayList());
                        }
                        ArrayList arrayList0 = (ArrayList)map0.get(long0);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsux.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsux)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gsux)hftv0).f = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsux)hftp0.b_message).c = s1;
                        }
                        int v3 = cursor0.getInt(cursor0.getColumnIndex("times_used"));
                        long v4 = cursor0.getLong(cursor0.getColumnIndex("last_time_used"));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gsux)hftv1).d = v3;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp0.b_message;
                        ((gsux)hftv2).e = v4;
                        boolean z = false;
                        if(!hftv2.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp0.b_message;
                        ((gsux)hftv3).g = v1 == 1;
                        if(v2 == 1) {
                            z = true;
                        }
                        if(!hftv3.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gsux)hftp0.b_message).h = z;
                        arrayList0.add(((gsux)hftp0.N_build()));
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_58;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_61;
        }
        goto label_64;
        try {
            try {
            label_52:
                egig.k("ReadContactsHelper", "Could not query ContactsProvider to fetch Phone info; disabled? Give up.");
                goto label_64;
            label_58:
                sQLiteException1 = sQLiteException0;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_58;
            }
            egig.c("ReadContactsHelper", "ContentResolver.query threw an exception when fetching phone info", sQLiteException1);
            goto label_64;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
        }
    label_61:
        if(cursor0 != null) {
            cursor0.close();
        }
        throw throwable1;
    label_64:
        if(cursor0 != null) {
            cursor0.close();
        }
        return map0;
    }

    public final Map e(HashSet hashSet0) {
        SQLiteException sQLiteException1;
        Throwable throwable1;
        Map map0 = new HashMap();
        ContentResolver contentResolver0 = this.j.getContentResolver();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, ehkh.m, null, null, null);
            if(cursor0 == null) {
                goto label_42;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(hashSet0.contains(long0)) {
                        String s = cursor0.getString(cursor0.getColumnIndex("data1"));
                        int v = cursor0.getInt(cursor0.getColumnIndex("data2"));
                        String s1 = cursor0.getString(cursor0.getColumnIndex("data3"));
                        int v1 = cursor0.getInt(cursor0.getColumnIndex("is_primary"));
                        int v2 = cursor0.getInt(cursor0.getColumnIndex("is_super_primary"));
                        if(!map0.containsKey(long0)) {
                            map0.put(long0, new ArrayList());
                        }
                        List list0 = (List)map0.get(long0);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsuy.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsuy)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gsuy)hftv0).d = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsuy)hftp0.b_message).c = s1;
                        }
                        boolean z = false;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gsuy)hftv1).e = v1 == 1;
                        if(v2 == 1) {
                            z = true;
                        }
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gsuy)hftp0.b_message).f = z;
                        list0.add(((gsuy)hftp0.N_build()));
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_48;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_51;
        }
        goto label_54;
        try {
            try {
            label_42:
                egig.k("ReadContactsHelper", "Could not query ContactsProvider to fetch Postal info; disabled? Give up.");
                goto label_54;
            label_48:
                sQLiteException1 = sQLiteException0;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_48;
            }
            egig.c("ReadContactsHelper", "ContentResolver.query threw an exception when fetching postal info", sQLiteException1);
            goto label_54;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
        }
    label_51:
        if(cursor0 != null) {
            cursor0.close();
        }
        throw throwable1;
    label_54:
        if(cursor0 != null) {
            cursor0.close();
        }
        return map0;
    }

    public final void f(Map map0) {
        try(Cursor cursor0 = this.a("vnd.android.cursor.item/group_membership", ehkh.p)) {
            if(cursor0 == null) {
                TWR.useResource$NT(null);
                egig.k("ReadContactsHelper", "Could not query ContactsProvider to fetch group membership info.");
            }
            else {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(map0.containsKey(long0)) {
                        Long long1 = cursor0.getLong(cursor0.getColumnIndex("data1"));
                        ((ehkg)map0.get(long0)).n.add(long1);
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            egig.c("ReadContactsHelper", "CP2 threw an exception when fetching group membership info", sQLiteException0);
        }
    }

    public final void g(Map map0) {
        Cursor cursor0 = null;
        try {
            cursor0 = this.a("vnd.android.cursor.item/nickname", ehkh.n);
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
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsvc.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvc)hftp0.b_message).b = s;
                        }
                        integer0.getClass();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gsvc)hftv0).d = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvc)hftp0.b_message).c = s1;
                        }
                        ehkg ehkg0 = (ehkg)map0.get(long0);
                        ehkg0.i = (gsvc)hftp0.N_build();
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
                egig.k("ReadContactsHelper", "Could not query ContactsProvider to fetch Nickname info; disabled? Give up.");
                goto label_36;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_31:
            egig.c("ReadContactsHelper", "ContentResolver.query threw an exception when fetching note info", sQLiteException0);
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

    public final void h(Map map0) {
        Cursor cursor0 = null;
        try {
            cursor0 = this.a("vnd.android.cursor.item/note", ehkh.o);
            if(cursor0 == null) {
                goto label_9;
            }
            else {
                while(cursor0.moveToNext()) {
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("raw_contact_id"));
                    if(map0.containsKey(long0)) {
                        ((ehkg)map0.get(long0)).f = cursor0.getString(cursor0.getColumnIndex("data1"));
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
                egig.k("ReadContactsHelper", "Could not query ContactsProvider to fetch Note info; disabled? Give up.");
                goto label_17;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_12:
            egig.c("ReadContactsHelper", "ContentResolver.query threw an exception when fetching note info", sQLiteException0);
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

    public final void i(Map map0) {
        Cursor cursor0 = null;
        try {
            cursor0 = this.a("vnd.android.cursor.item/organization", ehkh.g);
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
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsvd.a).v_newBuilder();
                        if(s != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvd)hftp0.b_message).b = s;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gsvd)hftv0).c = v;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvd)hftp0.b_message).d = s1;
                        }
                        if(s2 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvd)hftp0.b_message).e = s2;
                        }
                        if(s3 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvd)hftp0.b_message).f = s3;
                        }
                        if(s4 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvd)hftp0.b_message).g = s4;
                        }
                        if(s5 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvd)hftp0.b_message).h = s5;
                        }
                        if(s6 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvd)hftp0.b_message).i = s6;
                        }
                        if(s7 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvd)hftp0.b_message).j = s7;
                        }
                        if(s8 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gsvd)hftp0.b_message).k = s8;
                        }
                        ehkg ehkg0 = (ehkg)map0.get(long0);
                        ehkg0.j = (gsvd)hftp0.N_build();
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
                egig.k("ReadContactsHelper", "Could not query CP2 to fetch Organization info; disabled? Give up.");
                goto label_69;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_64:
            egig.c("ReadContactsHelper", "ContentResolver.query threw an exception when fetching organization info", sQLiteException0);
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

    public static final boolean j() {
        egiv.R();
        boolean z = hwyz.a.b().a();
        Boolean.valueOf(z).getClass();
        return z;
    }
}

