import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SyncResult;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract.AggregationExceptions;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.Groups;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import j..util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import jeb.synthetic.TWR;

public final class egmr extends cjtm {
    private final efzc a;
    private final String b;
    private final AccountWithDataSet c;
    private final AccountWithDataSet d;
    private final List e;
    private int f;

    public egmr(efzc efzc0, String s, AccountWithDataSet accountWithDataSet0, AccountWithDataSet accountWithDataSet1, List list0, int v, azug azug0) {
        super(0xD0, "migratecontacts", azug0);
        this.a = efzc0;
        this.b = s;
        this.c = accountWithDataSet0;
        this.d = accountWithDataSet1;
        this.e = list0;
        this.f = v;
    }

    private final List b(ContentResolver contentResolver0, List list0) {
        List list2;
        OutputStream outputStream0;
        InputStream inputStream0;
        Uri uri4;
        Uri.Builder uri$Builder0;
        ContentProviderResult[] arr_contentProviderResult1;
        Uri uri2;
        long v8;
        int v7;
        ContentProviderResult[] arr_contentProviderResult;
        String s4;
        HashSet hashSet4;
        Cursor cursor4;
        Cursor cursor3;
        String[] arr_s2;
        Uri uri1;
        ehbh ehbh2;
        ArrayList arrayList1;
        Cursor cursor2;
        String[] arr_s1;
        Cursor cursor1;
        Throwable throwable1;
        ehbh ehbh1;
        Cursor cursor0;
        HashSet hashSet3;
        Account account2;
        Map map1;
        List list1;
        HashSet hashSet2;
        ContentValues contentValues1;
        HashMap hashMap1;
        ehbh ehbh0;
        String s1;
        String s;
        Account account0;
        try {
            Map map0 = this.d(contentResolver0, list0, 1, 1);
            ContentValues contentValues0 = new ContentValues();
            HashMap hashMap0 = new HashMap();
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet();
            AccountWithDataSet accountWithDataSet0 = this.c;
            AccountWithDataSet accountWithDataSet1 = this.d;
            hashMap0.clear();
            hashSet0.clear();
            contentValues0.clear();
            ArrayList arrayList0 = new ArrayList();
            if(list0 == null || list0.isEmpty()) {
                egig.b("FSA2_ContactsCopyOperator", "raw contact id is empty");
                return arrayList0;
            }
            account0 = accountWithDataSet0.a;
            s = accountWithDataSet0.b;
            s1 = accountWithDataSet1.b;
            Account account1 = accountWithDataSet1.a;
            if(account0 == null) {
                ehbh0 = new ehbh();
                ehbh0.h();
            }
            else {
                ehbh0 = new ehbh();
                ehbh0.d(account0, s);
            }
            ehbh0.e();
            ehbh0.j();
            ehbh0.e();
            ehbh0.g("_id", "IN", list0);
            Uri uri0 = ContactsContract.RawContacts.CONTENT_URI;
            hashMap1 = hashMap0;
            contentValues1 = contentValues0;
            hashSet2 = hashSet0;
            list1 = arrayList0;
            map1 = map0;
            account2 = account1;
            hashSet3 = hashSet1;
            String[] arr_s = ehbh0.c();
            cursor0 = contentResolver0.query(uri0, ehao.b, ehbh0.a(), arr_s, "_id asc", null);
            if(account0 == null) {
                goto label_52;
            }
            else {
                goto label_43;
            }
            goto label_60;
        }
        catch(OperationApplicationException operationApplicationException0) {
            throw new cjuh(8, "Error copying contacts. " + operationApplicationException0.toString());
        }
        try {
        label_43:
            ehbh1 = new ehbh();
            ehbh1.d(account0, s);
            ehbh1.e();
            ehbh1.g("raw_contact_id", "IN", list0);
            goto label_60;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            cursor1 = cursor0;
            goto label_165;
        }
        try {
        label_52:
            ehbh1 = new ehbh();
            ehbh1.h();
            ehbh1.e();
            ehbh1.g("raw_contact_id", "IN", list0);
        }
        catch(Throwable throwable2) {
            cursor1 = cursor0;
            goto label_164;
        }
        try {
        label_60:
            arr_s1 = ehao.a;
            cursor1 = cursor0;
            cursor2 = contentResolver0.query(ContactsContract.Data.CONTENT_URI, arr_s1, ehbh1.a(), ehbh1.c(), "raw_contact_id asc", null);
            if(cursor1 == null) {
                if(cursor2 != null) {
                    cursor2.close();
                    return list1;
                }
                return list1;
            }
        }
        catch(Throwable throwable2) {
            goto label_164;
        }
        if(cursor2 == null) {
            try {
                cursor3 = new MatrixCursor(arr_s1);
            label_72:
                arrayList1 = new ArrayList(cursor2.getCount() * 4);
                cursor1.moveToPosition(-1);
                ehbh2 = new ehbh();
                ehbh2.g("_id", "NOT IN", list0);
                ehbh2.e();
                ehbh2.g("contact_id", "IN", list0);
                hashSet3.clear();
                uri1 = ContactsContract.RawContacts.CONTENT_URI;
                arr_s2 = ehbh2.c();
                goto label_85;
            }
            catch(Throwable throwable3) {
            }
            goto label_83;
        }
        else {
            cursor3 = cursor2;
        }
        goto label_72;
        try {
        label_83:
            TWR.safeClose$NT(cursor2, throwable3);
            throw throwable3;
        }
        catch(Throwable throwable2) {
            goto label_164;
        }
        try {
        label_85:
            cursor4 = contentResolver0.query(uri1, new String[]{"contact_id"}, ehbh2.a(), arr_s2, null);
        }
        catch(Throwable throwable3) {
            goto label_159;
        }
        if(cursor4 == null) {
            hashSet4 = hashSet3;
        }
        else {
            while(true) {
                try {
                    if(!cursor4.moveToNext()) {
                        goto label_97;
                    }
                    hashSet3.add(Long.valueOf(cursor4.getLong(0)));
                    hashSet3 = hashSet3;
                }
                catch(Throwable throwable4) {
                    try {
                        TWR.safeClose$NT(cursor4, throwable4);
                        throw throwable4;
                    label_97:
                        hashSet4 = hashSet3;
                        cursor4.close();
                        while(true) {
                        label_99:
                            if(!cursor1.moveToNext()) {
                                goto label_161;
                            }
                            long v = cursor1.getLong(0);
                            arrayList1.add(ContentProviderOperation.newAssertQuery(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, v)).withValue("version", Integer.valueOf(cursor1.getInt(1))).build());
                            int v1 = arrayList1.size();
                            contentValues1.clear();
                            ehao.a(cursor1, contentValues1);
                            contentValues1.remove("_id");
                            contentValues1.remove("version");
                            contentValues1.remove("contact_id");
                            String s2 = account2 == null ? null : account2.name;
                            String s3 = account2 == null ? null : account2.type;
                            arrayList1.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValues(contentValues1).withValue("account_name", s2).withValue("account_type", s3).withValue("data_set", s1).withYieldAllowed(false).build());
                            if(!hashSet4.contains(Long.valueOf(cursor1.getLong(8)))) {
                                arrayList1.add(ContentProviderOperation.newUpdate(ContactsContract.AggregationExceptions.CONTENT_URI).withValue("raw_contact_id1", Long.valueOf(v)).withValueBackReference("raw_contact_id2", v1).withValue("type", Integer.valueOf(2)).build());
                            }
                            int v2 = cursor3.getColumnIndexOrThrow("mimetype");
                            int v3 = cursor3.getColumnIndexOrThrow("data1");
                            int v4 = cursor3.getColumnIndexOrThrow("data14");
                            while(true) {
                                if(cursor3.moveToNext()) {
                                    s4 = s1;
                                    int v5 = Long.compare(cursor3.getLong(0), v);
                                    if(v5 < 0) {
                                        s1 = s4;
                                        continue;
                                    }
                                    else if(v5 <= 0) {
                                        String s5 = cursor3.getString(v2);
                                        if("vnd.android.cursor.item/group_membership".equals(s5)) {
                                            Long long1 = (Long)map1.get(Long.valueOf(cursor3.getLong(v3)));
                                            if(long1 == null) {
                                                map1 = map1;
                                            }
                                            else {
                                                map1 = map1;
                                                arrayList1.add(ehao.b(cursor3, v1, contentValues1).withValue("data1", long1).build());
                                            }
                                        }
                                        else if("vnd.android.cursor.item/photo".equals(s5)) {
                                            long v6 = cursor3.getLong(v4);
                                            Long long0 = v;
                                            hashMap1.put(long0, Integer.valueOf(v1));
                                            if(v6 != 0L) {
                                                hashSet2.add(long0);
                                                hashSet2 = hashSet2;
                                            }
                                            hashMap1 = hashMap1;
                                        }
                                        else {
                                            String s6 = cursor3.getString(v2);
                                            if(ehao.c.contains(s6)) {
                                                arrayList1.add(ehao.b(cursor3, v1, contentValues1).build());
                                            }
                                            hashSet2 = hashSet2;
                                        }
                                        s1 = s4;
                                        hashSet4 = hashSet4;
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                s4 = s1;
                                break;
                            }
                            arrayList1.add(ContentProviderOperation.newAssertQuery(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, v)).withValue("_id", Long.valueOf(v)).withYieldAllowed(true).build());
                            cursor3.moveToPrevious();
                            hashSet2 = hashSet2;
                            contentValues1 = contentValues1;
                            s1 = s4;
                            account2 = account2;
                            hashSet4 = hashSet4;
                        }
                    }
                    catch(Throwable throwable3) {
                        goto label_159;
                    }
                }
            }
        }
        goto label_99;
        try {
        label_159:
            TWR.safeClose$NT(cursor2, throwable3);
            throw throwable3;
        label_161:
            cursor2.close();
            goto label_171;
        }
        catch(Throwable throwable2) {
        }
    label_164:
        throwable1 = throwable2;
    label_165:
        if(cursor1 != null) {
            try {
                cursor1.close();
            }
            catch(Throwable throwable5) {
                try {
                    throwable1.addSuppressed(throwable5);
                    throw throwable1;
                label_171:
                    cursor1.close();
                    arr_contentProviderResult = contentResolver0.applyBatch("com.android.contacts", arrayList1);
                    v7 = 0;
                    while(true) {
                    label_174:
                        if(v7 < arr_contentProviderResult.length) {
                            goto label_232;
                        }
                        Iterator iterator0 = hashMap1.entrySet().iterator();
                        while(true) {
                        label_176:
                            if(!iterator0.hasNext()) {
                                ehbh ehbh3 = new ehbh();
                                ehbh3.d(account0, s);
                                ehbh3.e();
                                ehbh3.g("_id", "IN", list0);
                                contentResolver0.delete(ContactsContract.RawContacts.CONTENT_URI, ehbh3.a(), ehbh3.c());
                                return list1;
                            }
                            Object object0 = iterator0.next();
                            Long long2 = (Long)((Map.Entry)object0).getKey();
                            v8 = (long)long2;
                            uri2 = arr_contentProviderResult[((int)(((Integer)((Map.Entry)object0).getValue())))].uri;
                            if(uri2 == null) {
                                continue;
                            }
                            if(!hashSet2.contains(long2)) {
                                arr_contentProviderResult1 = arr_contentProviderResult;
                                ehao.c(v8, uri2, contentResolver0, contentValues1);
                                goto label_230;
                            }
                            try {
                                uri$Builder0 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendPath(String.valueOf(v8));
                                goto label_196;
                            }
                            catch(IOException unused_ex) {
                            }
                            goto label_194;
                        }
                    }
                }
                catch(OperationApplicationException operationApplicationException0) {
                    throw new cjuh(8, "Error copying contacts. " + operationApplicationException0.toString());
                }
            }
        }
        throw throwable1;
    label_194:
        arr_contentProviderResult1 = arr_contentProviderResult;
        goto label_229;
        try {
        label_196:
            Uri uri3 = uri$Builder0.appendPath("display_photo").build();
            uri4 = Uri.withAppendedPath(uri2, "display_photo");
            inputStream0 = contentResolver0.openInputStream(uri3);
        }
        catch(IOException unused_ex) {
            goto label_228;
        }
        catch(OperationApplicationException operationApplicationException0) {
            throw new cjuh(8, "Error copying contacts. " + operationApplicationException0.toString());
        }
        try {
            outputStream0 = contentResolver0.openOutputStream(uri4);
        }
        catch(Throwable throwable6) {
            goto label_218;
        }
        try {
            ghjj.b(inputStream0, outputStream0);
        }
        catch(Throwable throwable7) {
            arr_contentProviderResult1 = arr_contentProviderResult;
            Throwable throwable8 = throwable7;
            if(outputStream0 != null) {
                try {
                    outputStream0.close();
                }
                catch(Throwable throwable9) {
                    try {
                        throwable8.addSuppressed(throwable9);
                        throw throwable8;
                    }
                    catch(Throwable throwable6) {
                        goto label_212;
                    }
                }
            }
            throw throwable8;
            try {
            label_212:
                TWR.safeClose$NT(inputStream0, throwable6);
                throw throwable6;
            }
            catch(IOException unused_ex) {
                goto label_229;
            }
            catch(OperationApplicationException operationApplicationException0) {
                throw new cjuh(8, "Error copying contacts. " + operationApplicationException0.toString());
            }
        }
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(Throwable throwable6) {
            label_218:
                arr_contentProviderResult1 = arr_contentProviderResult;
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                    }
                    catch(Throwable throwable10) {
                        try {
                            throwable6.addSuppressed(throwable10);
                            throw throwable6;
                        }
                        catch(IOException unused_ex) {
                            goto label_229;
                        }
                        catch(OperationApplicationException operationApplicationException0) {
                            throw new cjuh(8, "Error copying contacts. " + operationApplicationException0.toString());
                        }
                    }
                }
                throw throwable6;
            }
        }
        if(inputStream0 == null) {
            goto label_176;
            try {
            label_226:
                inputStream0.close();
                goto label_176;
            }
            catch(IOException unused_ex) {
            }
            catch(OperationApplicationException operationApplicationException0) {
                throw new cjuh(8, "Error copying contacts. " + operationApplicationException0.toString());
            }
        label_228:
            arr_contentProviderResult1 = arr_contentProviderResult;
            try {
            label_229:
                ehao.c(v8, uri2, contentResolver0, contentValues1);
            label_230:
                arr_contentProviderResult = arr_contentProviderResult1;
                goto label_176;
            label_232:
                Uri uri5 = arr_contentProviderResult[v7].uri;
                if(uri5 == null) {
                    list2 = list1;
                }
                else if(uri5.toString().startsWith(ContactsContract.RawContacts.CONTENT_URI.toString())) {
                    try {
                        list2 = list1;
                        list2.add(Long.valueOf(ContentUris.parseId(uri5)));
                    }
                    catch(NumberFormatException unused_ex) {
                        egig.d("FSA2_ContactsCopyOperator", "Error getting new raw contact id. {uri=%s} ", new Object[]{uri5});
                    }
                }
                else {
                    list2 = list1;
                }
                ++v7;
                list1 = list2;
                goto label_174;
            }
            catch(OperationApplicationException operationApplicationException0) {
            }
            throw new cjuh(8, "Error copying contacts. " + operationApplicationException0.toString());
        }
        else {
            goto label_226;
        }
        goto label_230;
    }

    private final List c(ContentResolver contentResolver0, Context context0, List list0) {
        ContentResolver contentResolver1;
        List list1;
        try {
            AccountWithDataSet accountWithDataSet0 = this.c;
            AccountWithDataSet accountWithDataSet1 = this.d;
            ArrayList arrayList0 = new ArrayList();
            if(list0 != null && !list0.isEmpty()) {
                String s = accountWithDataSet0.b();
                String s1 = accountWithDataSet1.a();
                String s2 = accountWithDataSet1.b();
                String s3 = accountWithDataSet1.b;
                Uri uri0 = ContactsContract.RawContacts.CONTENT_URI;
                String s4 = ehan.a(list0);
                list1 = arrayList0;
                String s5 = accountWithDataSet0.b;
                contentResolver1 = contentResolver0;
                Cursor cursor0 = contentResolver1.query(uri0, ehap.a, s4, null, null);
                if(cursor0 == null) {
                    throw new RemoteException("Unable to query CP2");
                }
                while(true) {
                    try {
                    label_15:
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        long v = cursor0.getLong(cursor0.getColumnIndex("_id"));
                        ContentValues contentValues0 = ehap.a(s, s5, s1, s2, s3, context0);
                        ContentValues contentValues1 = new ContentValues();
                        contentValues1.put("account_type", cursor0.getString(cursor0.getColumnIndex("account_type")));
                        contentValues1.put("data_set", cursor0.getString(cursor0.getColumnIndex("data_set")));
                        contentValues1.put("account_name", cursor0.getString(cursor0.getColumnIndex("account_name")));
                        Integer integer0 = (int)1;
                        contentValues1.put("dirty", integer0);
                        contentValues1.put("sourceid", cursor0.getString(cursor0.getColumnIndex("sourceid")));
                        contentValues1.put("sync1", cursor0.getString(cursor0.getColumnIndex("sync1")));
                        contentValues1.put("sync2", cursor0.getString(cursor0.getColumnIndex("sync2")));
                        contentValues1.put("sync3", cursor0.getString(cursor0.getColumnIndex("sync3")));
                        contentValues1.put("sync4", cursor0.getString(cursor0.getColumnIndex("sync4")));
                        contentValues1.put("deleted", integer0);
                        if(!ehap.b(v, contentValues0, contentValues1, contentResolver1)) {
                            goto label_15;
                        }
                        list1.add(Long.valueOf(v));
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(cursor0, throwable0);
                        throw throwable0;
                    }
                }
                cursor0.close();
            }
            else {
                contentResolver1 = contentResolver0;
                list1 = arrayList0;
            }
        }
        catch(OperationApplicationException operationApplicationException0) {
            throw new cjuh(8, "Error migrating contacts" + operationApplicationException0.toString());
        }
        if(list1.isEmpty()) {
            egig.b("FSA2_MigrateContacts", "No contact is migrated.");
            return list1;
        }
        this.d(contentResolver1, list0, 2, 1);
        return list1;
    }

    private final Map d(ContentResolver contentResolver0, List list0, int v, int v1) {
        Iterator iterator0;
        TreeMap treeMap2;
        TreeMap treeMap0;
        new HashMap();
        try {
            AccountWithDataSet accountWithDataSet0 = this.c;
            AccountWithDataSet accountWithDataSet1 = this.d;
            Map map0 = new HashMap();
            if(list0 == null || list0.isEmpty()) {
                return map0;
            }
            Account account0 = accountWithDataSet0.a;
            Account account1 = accountWithDataSet1.a;
            ehab ehab0 = new ehab(account1, new ehbp(contentResolver0), new ehiv(new SyncResult()), true);
            String s = accountWithDataSet1.b;
            ehbp ehbp0 = new ehbp(contentResolver0);
            ehbc ehbc0 = v1 == 1 ? ehbd.a(list0, account0, contentResolver0) : ehbd.a(list0, account1, contentResolver0);
            ggeo ggeo0 = ehbc0.a;
            ggfp ggfp0 = ehbc0.b;
            if(ggfp0.isEmpty()) {
                egig.b("FSA2_GroupsCopyOperator", "No Groups copy involved.");
                return map0;
            }
            new HashSet();
            HashSet hashSet0 = new HashSet();
            String s1 = a.T(ggfp0, "_id IN (", ",", ") AND deleted = 0");
            ehag ehag0 = ehag.c(ehbp0, ehab.c(ContactsContract.Groups.CONTENT_URI, account0), ehbf.a, s1, null, "_id");
            try {
                treeMap0 = new TreeMap();
                egzx egzx0;
                while((egzx0 = ehag0.a()) != null) {
                    if(egzx0.c || !TextUtils.isEmpty(egzx0.l)) {
                        hashSet0.add(egzx0.h);
                    }
                    treeMap0.put(egzx0.h, egzx0.m);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(ehag0, throwable0);
                throw throwable0;
            }
            ehag0.close();
            Collection collection0 = treeMap0.values();
            TreeMap treeMap1 = new TreeMap();
            if(!collection0.isEmpty()) {
                ehag ehag1 = account1 == null ? ehag.c(ehbp0, ContactsContract.Groups.CONTENT_URI, null, ehbf.a(collection0) + " and account_name IS NULL AND account_type IS NULL AND data_set IS NULL", null, "title") : ehag.c(ehbp0, ehab.c(ContactsContract.Groups.CONTENT_URI, account1), null, ehbf.a(collection0), null, "title");
                TWR.declareResource(ehag1);
                while(true) {
                    TWR.useResource$NT(ehag1);
                    egzx egzx1 = ehag1.a();
                    if(egzx1 == null) {
                        break;
                    }
                    TWR.useResource$NT(ehag1);
                    treeMap1.put(egzx1.m, egzx1.h);
                }
            }
            treeMap2 = new TreeMap();
            iterator0 = treeMap0.keySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Long long0 = (Long)object0;
                String s2 = (String)treeMap0.get(long0);
                if(treeMap1.containsKey(s2)) {
                    treeMap1.get(s2);
                    treeMap2.put(long0, ((Long)treeMap1.get(s2)));
                }
            }
            TreeMap treeMap3 = new TreeMap();
            for(Object object1: treeMap0.keySet()) {
                Long long1 = (Long)object1;
                String s3 = (String)treeMap0.get(long1);
                if(treeMap2.containsKey(long1)) {
                }
                else if(treeMap3.containsKey(s3)) {
                    treeMap2.put(long1, ((Long)treeMap3.get(s3)));
                }
                else {
                    if(hashSet0.contains(long1)) {
                        continue;
                    }
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("title", s3);
                    contentValues0.put("group_visible", Integer.valueOf(1));
                    contentValues0.put("data_set", s);
                    Uri uri0 = ehab.d(ContactsContract.Groups.CONTENT_URI, account1, false);
                    Uri uri1 = ehbp0.b(uri0, contentValues0);
                    if(uri1 == null) {
                        throw new RemoteException("ContentResolver.insert returns null Uri. Uri to insert: %s" + uri0);
                    }
                    Long long2 = ContentUris.parseId(uri1);
                    treeMap2.put(long1, long2);
                    treeMap3.put(s3, long2);
                }
            }
            ehbe ehbe0 = new ehbe(treeMap2, hashSet0);
            Map map1 = ehbe0.a;
            Set set0 = ehbe0.b;
            if(v != 2) {
                return map1;
            }
            Iterator iterator2 = list0.iterator();
            while(true) {
            label_84:
                if(!iterator2.hasNext()) {
                    ehab0.f();
                    return map1;
                }
                Object object2 = iterator2.next();
                Long long3 = (Long)object2;
                List list1 = (List)ggeo0.get(long3);
                if(list1 != null) {
                    for(Object object3: list1) {
                        long v2 = ((ehbb)object3).b;
                        Long long4 = (long)((ehbb)object3).a;
                        if(map1.containsKey(long4)) {
                            Long long5 = (Long)map1.get(long4);
                            ContentValues contentValues1 = new ContentValues();
                            contentValues1.put("data1", long5);
                            ehab0.e.l(Long.valueOf(v2), contentValues1);
                        }
                        else {
                            if(!set0.contains(long4)) {
                                continue;
                            }
                            ehab0.e.c(ehab0.e.a, Long.valueOf(v2), false);
                        }
                        ehab0.b.p(long3);
                        ehab0.h();
                    }
                }
            }
        }
        catch(ehfh ehfh0) {
            throw new cjuh(8, "Error migrating groups" + ehfh0.toString());
        }
        goto label_84;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        Cursor cursor0;
        int v3;
        giou giou0 = (giou)((ProtoLiteMessage)gioy.a).v_newBuilder();
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).c = 13;
        ((gioy)giou0.b_message).b |= 1;
        String s = this.b;
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).e = ehji.c(s, null, 1) - 1;
        ((gioy)giou0.b_message).b |= 4;
        hxci hxci0 = hxci.a;
        if(!hxci0.b().c()) {
            efpr efpr0 = efpr.a();
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 4;
            ((gioy)giou0.b_message).b |= 2;
            efpr0.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
            ArrayList arrayList0 = new ArrayList();
            this.a.p(Status.d, arrayList0, ApiMetadata.b);
            return;
        }
        List list0 = this.e;
        if(list0 != null && !list0.isEmpty()) {
            AccountWithDataSet accountWithDataSet0 = this.c;
            if(Objects.equals(accountWithDataSet0, this.d)) {
                ArrayList arrayList1 = new ArrayList();
                this.a.p(Status.d, arrayList1, ApiMetadata.b);
                return;
            }
            HashSet hashSet0 = new HashSet();
            hashSet0.addAll(list0);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(hashSet0);
            ContentResolver contentResolver0 = context0.getContentResolver();
            int v = (int)hxci0.b().b();
            if(v > 0) {
                int v1 = 0;
                while(v1 < arrayList2.size()) {
                    int v2 = v1 + v;
                    List list1 = arrayList2.subList(v1, Math.min(v2, arrayList2.size()));
                    if(list1 != null && !list1.isEmpty()) {
                        if(accountWithDataSet0.c()) {
                            Uri uri0 = ContactsContract.RawContacts.CONTENT_URI;
                            String s1 = ehan.a(list1) + " AND account_name IS NULL AND account_type IS NULL AND data_set IS NULL";
                            v3 = v2;
                            cursor0 = contentResolver0.query(uri0, new String[]{"_count"}, s1, null, null);
                        }
                        else {
                            v3 = v2;
                            Uri uri1 = ehab.c(ContactsContract.RawContacts.CONTENT_URI, accountWithDataSet0.a);
                            String s2 = ehan.a(list1);
                            cursor0 = contentResolver0.query(uri1, new String[]{"_count"}, s2, null, null);
                        }
                        try {
                            if(cursor0 == null) {
                                throw new RemoteException("Unable to query CP2");
                            }
                            if(cursor0.moveToLast()) {
                                if(cursor0.getInt(0) != list1.size()) {
                                    egig.b("FSA2_ContactExistenceValidator", "Not all raw contact ids are from source account.");
                                    goto label_64;
                                }
                                goto label_56;
                            }
                            goto label_59;
                        }
                        catch(Throwable throwable0) {
                            goto label_62;
                        }
                    label_56:
                        cursor0.close();
                        v1 = v3;
                        continue;
                        try {
                        label_59:
                            egig.b("FSA2_ContactExistenceValidator", "Failed to operate Cursor.moveToLast()");
                        }
                        catch(Throwable throwable0) {
                        label_62:
                            TWR.safeClose$NT(cursor0, throwable0);
                            throw throwable0;
                        }
                    label_64:
                        cursor0.close();
                    }
                    egig.b("FSA2_MigrateContacts", "Failed from raw contact ids validation.");
                    efpr efpr1 = efpr.a();
                    if(!giou0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giou0).ensureMutable();
                    }
                    ((gioy)giou0.b_message).d = 0;
                    ((gioy)giou0.b_message).b |= 2;
                    efpr1.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
                    ArrayList arrayList3 = new ArrayList();
                    this.a.p(Status.f, arrayList3, ApiMetadata.b);
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                if(this.f == 1) {
                    this.f = (int)hxci.a.b().a();
                }
                int v4 = 0;
                while(v4 < arrayList2.size()) {
                    int v5 = v4 + v;
                    List list2 = arrayList2.subList(v4, Math.min(v5, arrayList2.size()));
                    List list3 = new ArrayList();
                    switch(this.f) {
                        case 0: {
                            efpr efpr2 = efpr.a();
                            if(!giou0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)giou0).ensureMutable();
                            }
                            ((gioy)giou0.b_message).d = 0;
                            ((gioy)giou0.b_message).b |= 2;
                            efpr2.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
                            ArrayList arrayList5 = new ArrayList();
                            this.a.p(Status.d, arrayList5, ApiMetadata.b);
                            return;
                        }
                        case 2: {
                            AccountWithDataSet accountWithDataSet1 = this.c;
                            AccountWithDataSet accountWithDataSet2 = this.d;
                            ArrayList arrayList6 = new ArrayList();
                            if(list2 != null && !list2.isEmpty()) {
                                ContentValues contentValues0 = ehap.a(accountWithDataSet1.b(), accountWithDataSet1.b, accountWithDataSet2.a(), accountWithDataSet2.b(), accountWithDataSet2.b, context0);
                                String s3 = ehan.a(list2);
                                int v6 = contentResolver0.update(ContactsContract.RawContacts.CONTENT_URI, contentValues0, s3, null);
                                egig.f("FSA2_ContactsMigrater", "Moved %d contacts.", v6);
                                if(v6 == list2.size()) {
                                    list3 = list2;
                                    goto label_107;
                                }
                            }
                            else {
                                egig.b("FSA2_ContactsMigrater", "raw contact id is empty");
                            }
                            list3 = arrayList6;
                        label_107:
                            if(list3.isEmpty()) {
                                egig.b("FSA2_MigrateContacts", "No contact is migrated.");
                            }
                            else {
                                this.d(contentResolver0, list2, 2, 2);
                            }
                            break;
                        }
                        case 3: {
                            list3 = this.c(contentResolver0, context0, list2);
                            break;
                        }
                        case 4: {
                            list3 = this.b(contentResolver0, list2);
                        }
                    }
                    arrayList4.addAll(list3);
                    v4 = v5;
                }
                efpr efpr3 = efpr.a();
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 1;
                ((gioy)giou0.b_message).b |= 2;
                efpr3.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
                ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                this.a.p(Status.b, arrayList4, apiMetadata0);
                return;
            }
            egig.b("FSA2_MigrateContacts", "Invalid config: FsaMigrateContactsFeature.maxBatchSizeReadWriteToCp2 must be positive");
            ArrayList arrayList7 = new ArrayList();
            this.a.p(Status.d, arrayList7, ApiMetadata.b);
            return;
        }
        efpr efpr4 = efpr.a();
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).d = 0;
        ((gioy)giou0.b_message).b |= 2;
        efpr4.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
        ArrayList arrayList8 = new ArrayList();
        this.a.p(Status.d, arrayList8, ApiMetadata.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ArrayList arrayList0 = new ArrayList();
        ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
        this.a.p(status0, arrayList0, apiMetadata0);
    }
}

