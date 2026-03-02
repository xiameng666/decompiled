import android.accounts.Account;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dgbb implements gfsi {
    public final dgbf a;
    public final Account b;

    public dgbb(dgbf dgbf0, Account account0) {
        this.a = dgbf0;
        this.b = account0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z6;
        List list3;
        boolean z5;
        ArrayList arrayList5;
        boolean z4;
        List list2;
        boolean z3;
        ArrayList arrayList4;
        dbxx dbxx1;
        bxd bxd2;
        Cursor cursor1;
        ProtoLiteBuilder hftp1;
        String s;
        Long long0;
        Object object3;
        bxd bxd1;
        Account account1;
        Cursor cursor0;
        dgbc dgbc1;
        dbxv dbxv1;
        dgbf dgbf1;
        Uri uri0;
        dgbi dgbi0;
        dbya dbya2;
        dgbg dgbg0;
        dbya dbya1;
        dgbc dgbc0;
        dbxw dbxw1;
        int v;
        dbxv dbxv0;
        Iterator iterator1;
        bxd bxd0;
        dbxx dbxx0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dbxx)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dbxx)object0))));
        dbxw dbxw0 = (dbxw)hftp0;
        dgbf dgbf0 = this.a;
        Account account0 = this.b;
        try {
            dbxx0 = dgbf0.c(account0);
            bxf bxf0 = new bxf();
            for(Object object1: DesugarCollections.unmodifiableList(((dbxx)dbxw0.b_message).c)) {
                dbya dbya0 = ((dbxv)object1).c;
                if(dbya0 == null) {
                    dbya0 = dbya.a;
                }
                bxf0.add(dbya0);
            }
            bxd0 = new bxd();
            iterator1 = dbxx0.c.iterator();
            while(true) {
            label_17:
                if(!iterator1.hasNext()) {
                    goto label_159;
                }
                Object object2 = iterator1.next();
                dbxv0 = (dbxv)object2;
                v = dgbc.a(dbxv0);
                dbxw1 = dbxw0;
                break;
            }
        }
        catch(IOException unused_ex) {
            dgbf1 = dgbf0;
            account1 = account0;
            goto label_203;
        }
        try {
            dgbc0 = new dgbc(v, dbxv0.h, dbxv0.i, dbxv0.j, dbxv0.k);
            dbya1 = dbxv0.c;
            if(dbya1 == null) {
                goto label_25;
            }
            goto label_26;
        }
        catch(IOException unused_ex) {
            dgbf1 = dgbf0;
            account1 = account0;
            dbxw0 = dbxw1;
            goto label_203;
        }
        try {
        label_25:
            dbya1 = dbya.a;
        }
        catch(IOException unused_ex) {
            dgbf1 = dgbf0;
            account1 = account0;
            dbxw0 = dbxw1;
            goto label_203;
        }
        try {
        label_26:
            if(!bxf0.contains(dbya1)) {
                dgbg0 = dgbf0.a;
                dbya2 = dbxv0.c;
                if(dbya2 == null) {
                    goto label_30;
                }
                goto label_31;
            }
            goto label_152;
        }
        catch(IOException unused_ex) {
            dgbf1 = dgbf0;
            account1 = account0;
            dbxw0 = dbxw1;
            goto label_203;
        }
        try {
        label_30:
            dbya2 = dbya.a;
        }
        catch(IOException unused_ex) {
            dgbf1 = dgbf0;
            account1 = account0;
            dbxw0 = dbxw1;
            goto label_203;
        }
        try {
        label_31:
            dgbi0 = dgbg0.b;
            uri0 = ContactsContract.Contacts.getLookupUri(dbya2.c, dbya2.d);
            dgbf1 = dgbf0;
        }
        catch(IOException unused_ex) {
            dgbf1 = dgbf0;
            account1 = account0;
            dbxw0 = dbxw1;
            goto label_203;
        }
        if(uri0 == null) {
            try {
                dbxv1 = dbxv0;
                dgbc1 = dgbc0;
                dcvz.a.e().i("Unable to construct the contact lookup uri from id: %d and lookup key: %s.", Long.valueOf(dbya2.c), dbya2.d);
                account1 = account0;
                bxd1 = bxd0;
                object3 = null;
            }
            catch(IOException unused_ex) {
                account1 = account0;
                dbxw0 = dbxw1;
                goto label_203;
            }
        }
        else {
            try {
                dbxv1 = dbxv0;
                dgbc1 = dgbc0;
                cursor0 = cuqf.c(dgbi0.c, uri0, dgbi.a);
            }
            catch(IOException unused_ex) {
                account1 = account0;
                dbxw0 = dbxw1;
                goto label_203;
            }
            if(cursor0 == null) {
                try {
                    dcvz.a.e().p("Unable to get cursor for the contact lookup uri.", new Object[0]);
                }
                catch(IOException unused_ex) {
                    account1 = account0;
                    dbxw0 = dbxw1;
                    goto label_203;
                }
                account1 = account0;
                bxd1 = bxd0;
                object3 = null;
            }
            else {
                try {
                    if(cursor0.getCount() == 1) {
                        long0 = cuqf.i(cursor0, "_id");
                        if(long0 == null) {
                            dcvz.a.e().p("The contact\'s id does not exist.", new Object[0]);
                            goto label_84;
                        }
                        else {
                            s = cuqf.l(cursor0, "lookup");
                            if(TextUtils.isEmpty(s)) {
                                dcvz.a.e().p("The contact\'s lookup key does not exist.", new Object[0]);
                                goto label_84;
                            }
                            else {
                                hftp1 = ((ProtoLiteMessage)dbya.a).v_newBuilder();
                                cursor1 = cursor0;
                                account1 = account0;
                                goto label_66;
                            }
                        }
                    }
                    goto label_83;
                }
                catch(Throwable throwable0) {
                    goto label_90;
                }
                try {
                label_66:
                    long v1 = (long)long0;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    bxd1 = bxd0;
                    ((dbya)hftv0).b |= 1;
                    ((dbya)hftv0).c = v1;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    dbya dbya3 = (dbya)hftp1.b_message;
                    s.getClass();
                    dbya3.b |= 2;
                    dbya3.d = s;
                    object3 = (dbya)hftp1.N_build();
                    goto label_94;
                }
                catch(Throwable throwable0) {
                    try {
                        goto label_92;
                    }
                    catch(IOException unused_ex) {
                        dbxw0 = dbxw1;
                        goto label_203;
                    }
                }
                try {
                label_83:
                    dcvz.a.e().i("Found %d contacts for uri: %s.", Integer.valueOf(cursor0.getCount()), uri0);
                label_84:
                    cursor1 = cursor0;
                    account1 = account0;
                    bxd1 = bxd0;
                    object3 = null;
                    goto label_94;
                }
                catch(Throwable throwable0) {
                    try {
                    label_90:
                        cursor1 = cursor0;
                        account1 = account0;
                    label_92:
                        cursor1.close();
                        throw throwable0;
                    label_94:
                        cursor1.close();
                    label_95:
                        if(object3 == null) {
                            dgbl dgbl0 = dgbg0.c;
                            Uri uri1 = ContactsContract.Contacts.getLookupUri(dbya2.c, dbya2.d);
                            if(uri1 != null) {
                                Cursor cursor2 = cuqf.c(dgbl0.c, uri1, dgbl.a);
                                if(cursor2 != null) {
                                    try {
                                        if(cursor2.getCount() == 1) {
                                            Long long1 = cuqf.i(cursor2, "_id");
                                            if(long1 != null) {
                                                String s1 = cuqf.l(cursor2, "lookup");
                                                if(TextUtils.isEmpty(s1)) {
                                                    dcvz.a.e().p("The contact\'s lookup key does not exist.", new Object[0]);
                                                    object3 = null;
                                                }
                                                else {
                                                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dbya.a).v_newBuilder();
                                                    long v3 = (long)long1;
                                                    if(!hftp2.b_message.isImmutable()) {
                                                        hftp2.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv1 = hftp2.b_message;
                                                    dbya dbya4 = (dbya)hftv1;
                                                    dbya4.b |= 1;
                                                    dbya4.c = v3;
                                                    if(!hftv1.isImmutable()) {
                                                        hftp2.ensureMutable();
                                                    }
                                                    dbya dbya5 = (dbya)hftp2.b_message;
                                                    s1.getClass();
                                                    dbya5.b |= 2;
                                                    dbya5.d = s1;
                                                    object3 = (dbya)hftp2.N_build();
                                                }
                                                goto label_137;
                                            }
                                            dcvz.a.e().p("The contact\'s id does not exist.", new Object[0]);
                                            object3 = null;
                                            goto label_137;
                                        }
                                        else {
                                            dcvz.a.e().i("Found %d contacts for uri: %s.", Integer.valueOf(cursor2.getCount()), uri1);
                                        }
                                        object3 = null;
                                    }
                                    finally {
                                        cursor2.close();
                                    }
                                    goto label_137;
                                }
                                goto label_133;
                            }
                            goto label_135;
                        }
                        goto label_137;
                    }
                    catch(IOException unused_ex) {
                        dbxw0 = dbxw1;
                        goto label_203;
                    }
                }
            }
        }
        goto label_95;
        try {
        label_133:
            dcvz.a.e().p("Unable to get cursor for the contact lookup uri.", new Object[0]);
            goto label_136;
        label_135:
            dcvz.a.e().i("Unable to construct the contact lookup uri from id: %d and lookup key: %s.", Long.valueOf(dbya2.c), dbya2.d);
        }
        catch(IOException unused_ex) {
            dbxw0 = dbxw1;
            goto label_203;
        }
    label_136:
        object3 = null;
        try {
        label_137:
            if(object3 != null && bxf0.contains(object3)) {
                bxd2 = bxd1;
                bxd2.put(object3, dgbc1);
            }
            else {
                bxd2 = bxd1;
                dcvz.a.e().h("Discarding contact %s: we could not find this contact in the database.", dbxv1.d);
            }
            bxd0 = bxd2;
            dbxx0 = dbxx0;
            iterator1 = iterator1;
            dbxw0 = dbxw1;
            dgbf0 = dgbf1;
            account0 = account1;
            goto label_17;
        }
        catch(IOException unused_ex) {
            dbxw0 = dbxw1;
            goto label_203;
        }
        try {
        label_152:
            bxd0.put((dbxv0.c == null ? dbya.a : dbxv0.c), dgbc0);
            dbxw0 = dbxw1;
            goto label_17;
        }
        catch(IOException unused_ex) {
            dgbf1 = dgbf0;
        }
        account1 = account0;
        dbxw0 = dbxw1;
        goto label_203;
        try {
        label_159:
            dgbf1 = dgbf0;
            account1 = account0;
        }
        catch(IOException unused_ex) {
            dgbf1 = dgbf0;
            account1 = account0;
            goto label_203;
        }
        try {
            for(int v4 = 0; v4 < ((dbxx)dbxw0.b_message).c.size(); ++v4) {
                dbxv dbxv2 = dbxw0.a(v4);
                dgbc dgbc2 = (dgbc)bxd0.get((dbxv2.c == null ? dbya.a : dbxv2.c));
                if(dgbc2 != null) {
                    int v5 = dgbc.a(dbxv2);
                    long v6 = dgbc2.a == v5 ? dgbc2.e : 0L;
                    ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)dbxv2).jf(5, null);
                    hftp3.X(((ProtoLiteMessage)dbxv2));
                    dbxu dbxu0 = (dbxu)hftp3;
                    boolean z = dgbc2.b;
                    if(!dbxu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu0).ensureMutable();
                    }
                    dbxv dbxv3 = (dbxv)dbxu0.b_message;
                    dbxv3.b |= 8;
                    dbxv3.h = z;
                    boolean z1 = dgbc2.c;
                    if(!dbxu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu0).ensureMutable();
                    }
                    dbxv dbxv4 = (dbxv)dbxu0.b_message;
                    dbxv4.b |= 16;
                    dbxv4.i = z1;
                    boolean z2 = dgbc2.d;
                    if(!dbxu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu0).ensureMutable();
                    }
                    dbxv dbxv5 = (dbxv)dbxu0.b_message;
                    dbxv5.b |= 0x20;
                    dbxv5.j = z2;
                    if(!dbxu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu0).ensureMutable();
                    }
                    dbxv dbxv6 = (dbxv)dbxu0.b_message;
                    dbxv6.b |= 0x40;
                    dbxv6.k = v6;
                    dbxw0.l(v4, dbxu0);
                }
            }
            dbxx1 = dbxx0;
        }
        catch(IOException unused_ex) {
        label_203:
            dbxx1 = dbxx.a;
        }
        try {
            dgbf1.h(account1, dbxw0);
        }
        catch(IOException iOException0) {
            dcvz.a.e().f(iOException0).p("Failed to save contact book to disk.", new Object[0]);
        }
        dbxx dbxx2 = (dbxx)((ProtoLiteBuilder)dbxw0).N_build();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        dgbf.i(dbxx1.c, arrayList0, arrayList1);
        dgbf.i(dbxx2.c, arrayList2, arrayList3);
        List list0 = dgbf.e(arrayList0, arrayList1);
        List list1 = dgbf.e(arrayList2, arrayList3);
        if(arrayList2.size() > arrayList0.size()) {
            arrayList4 = arrayList3;
            z3 = true;
        }
        else {
            arrayList4 = arrayList3;
            z3 = false;
        }
        if(arrayList4.size() > arrayList1.size()) {
            list2 = list1;
            z4 = true;
        }
        else {
            list2 = list1;
            z4 = false;
        }
        if(arrayList2.size() < arrayList0.size()) {
            arrayList5 = arrayList4;
            z5 = true;
        }
        else {
            arrayList5 = arrayList4;
            z5 = false;
        }
        if(arrayList5.size() < arrayList1.size()) {
            list3 = list2;
            z6 = true;
        }
        else {
            list3 = list2;
            z6 = false;
        }
        if(list3.size() < list0.size()) {
            dcvz.a.b().p("A contact was removed from the contact book.", new Object[0]);
            return new dgbe(dgbd.d, dbxx2, z3, z4, z5, z6);
        }
        if(list3.size() > list0.size()) {
            dcvz.a.b().p("A contact was added to the contact book.", new Object[0]);
            return new dgbe(dgbd.b, dbxx2, z3, z4, z5, z6);
        }
        if(list0.equals(list3)) {
            dcvz.a.b().p("The contact book was modified but all emails and phone numbers are unchanged.", new Object[0]);
            return new dgbe(dgbd.a, dbxx2, z3, z4, z5, z6);
        }
        dcvz.a.b().p("An email or phone number was edited in the contact book.", new Object[0]);
        return new dgbe(dgbd.c, dbxx2, z3, z4, z5, z6);
    }
}

