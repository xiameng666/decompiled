import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.ContactsContract.RawContactsEntity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ehfr {
    public static final int a;
    private static final ggfp b;
    private static final ggfp c;

    static {
        ehfr.b = ggfp.O("vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/group_membership", "vnd.android.cursor.item/identity", "vnd.android.cursor.item/im", "vnd.android.cursor.item/nickname", new String[]{"vnd.android.cursor.item/note", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/photo", "vnd.android.cursor.item/relation", "vnd.android.cursor.item/sip_address", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/website", "vnd.android.cursor.item/name", "vnd.com.google.cursor.item/contact_calendar_link", "vnd.com.google.cursor.item/contact_extended_property", "vnd.com.google.cursor.item/contact_external_id", "vnd.com.google.cursor.item/contact_hobby", "vnd.com.google.cursor.item/contact_jot", "vnd.com.google.cursor.item/contact_language", "vnd.com.google.cursor.item/contact_misc", "vnd.com.google.cursor.item/contact_user_defined_field", "vnd.com.google.cursor.item/contact_file_as"});
        ehfr.c = ggfp.L("vnd.android.cursor.item/name", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2");
    }

    public static final gghp a(List list0, Context context0, ehbp ehbp0, Account account0) {
        Throwable throwable3;
        ehae ehae0;
        gghp gghp0 = new gfza();
        if(!list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                arrayList0.add(((ehge)object0).a);
            }
            int v = (int)hxba.a.e().b();
            if(v > 0) {
                int v1 = 0;
                while(v1 < arrayList0.size()) {
                    int v2 = v1 + v;
                    ArrayList arrayList1 = new ArrayList();
                    Uri uri0 = ehab.c(ContactsContract.RawContactsEntity.CONTENT_URI, account0);
                    StringBuilder stringBuilder0 = new StringBuilder("( ( deleted = 0 AND data1 IN (");
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object1: arrayList0.subList(v1, Math.min(v2, arrayList0.size()))) {
                        arrayList2.add(DatabaseUtils.sqlEscapeString(((String)object1)));
                    }
                    stringBuilder0.append(TextUtils.join(",", arrayList2));
                    stringBuilder0.append(") ) AND (account_type = \"com.google\"))");
                    try(Cursor cursor0 = ehbp0.a(uri0, new String[]{"_id"}, stringBuilder0.toString(), null, null)) {
                        while(true) {
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                            arrayList1.add(Long.valueOf(cursor0.getLong(0)));
                        }
                    }
                    if(!arrayList1.isEmpty()) {
                        try {
                            String s = " ( deleted = 0 AND _id IN (" + TextUtils.join(",", arrayList1) + ") ) ";
                            ehae0 = ehae.d(context0, ehbp0, account0, ehfr.b, s);
                        }
                        catch(ehfh unused_ex) {
                            goto label_50;
                        }
                        try {
                            Iterator iterator2 = ehfr.d(ehae0, false).iterator();
                            while(true) {
                                if(!iterator2.hasNext()) {
                                    goto label_49;
                                }
                                Object object2 = iterator2.next();
                                gghp0.v(((ehge)object2).a, ((ehge)object2).b);
                            }
                        }
                        catch(Throwable throwable1) {
                            try {
                                throwable3 = throwable1;
                                ehae0.close();
                                throw throwable3;
                            }
                            catch(Throwable throwable2) {
                                try {
                                    throwable3.addSuppressed(throwable2);
                                    throw throwable3;
                                label_49:
                                    ehae0.close();
                                }
                                catch(ehfh unused_ex) {
                                }
                            }
                        }
                    }
                label_50:
                    v1 = v2;
                }
                return gghp0;
            }
            egig.b("FSA2_DedupHelper", "cp2 read dedup records limit is less or equal to zero");
            return gghp0;
        }
        return gghp0;
    }

    public static final List b(String s, Context context0, ehbp ehbp0) {
        return ehfr.e(s, false, context0, ehbp0);
    }

    public static final List c(String s, Context context0, ehbp ehbp0) {
        return ehfr.e(s, true, context0, ehbp0);
    }

    private static List d(ehae ehae0, boolean z) {
        List list0 = new ArrayList();
        while(true) {
            String s = "";
            egzv egzv0 = ehae0.a();
            if(egzv0 == null) {
                break;
            }
            if(!egzv0.k) {
                if(z) {
                    List list1 = egzv0.E;
                    if(list1 == null) {
                        List list2 = egzv0.I;
                        if(list2 == null) {
                            List list3 = egzv0.r;
                            if(list3 != null) {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                for(Object object2: list3) {
                                    ContentValues contentValues2 = (ContentValues)object2;
                                    if(contentValues2.get("data1") != null) {
                                        stringBuilder2.append(contentValues2.get("data1"));
                                    }
                                }
                                s = stringBuilder2.toString();
                            }
                        }
                        else {
                            StringBuilder stringBuilder1 = new StringBuilder();
                            for(Object object1: list2) {
                                ContentValues contentValues1 = (ContentValues)object1;
                                if(contentValues1.get("data1") != null) {
                                    stringBuilder1.append(contentValues1.get("data1"));
                                }
                            }
                            s = stringBuilder1.toString();
                        }
                    }
                    else {
                        StringBuilder stringBuilder0 = new StringBuilder();
                        for(Object object0: list1) {
                            ContentValues contentValues0 = (ContentValues)object0;
                            if(contentValues0.get("data1") != null) {
                                stringBuilder0.append(contentValues0.get("data1"));
                            }
                        }
                        s = stringBuilder0.toString();
                    }
                }
                else {
                    List list4 = egzv0.E;
                    if(list4 != null) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        for(Object object3: list4) {
                            ContentValues contentValues3 = (ContentValues)object3;
                            if(contentValues3.get("data1") != null) {
                                stringBuilder3.append(contentValues3.get("data1"));
                            }
                        }
                        s = stringBuilder3.toString();
                    }
                }
                if(!s.isEmpty()) {
                    list0.add(new ehge(egzv0, s));
                }
            }
        }
        return list0;
    }

    private static final List e(String s, boolean z, Context context0, ehbp ehbp0) {
        ggfp ggfp0;
        if(hwzg.a.c().c()) {
            ggfp0 = ehfr.b;
        }
        else {
            ggfp0 = z ? ehfr.c : ehfr.b;
        }
        try(ehae ehae0 = ehae.d(context0, ehbp0, null, ggfp0, s)) {
            return ehfr.d(ehae0, z);
        }
        catch(ehfh ehfh0) {
            egig.m("FSA2_DedupHelper", "Failed to get non google contacts. Error message is %s", new Object[]{ehfh0.toString()});
            return new ArrayList();
        }
    }
}

