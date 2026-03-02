import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.internal.UpdateSelectedContactsParams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class dgbf {
    public final dgbg a;
    private final Context b;
    private final ddki c;

    public dgbf(Context context0, dgbg dgbg0) {
        this.b = context0;
        this.a = dgbg0;
        this.c = ddki.a(context0);
    }

    public final int a(Account account0, UpdateSelectedContactsParams updateSelectedContactsParams0) {
        synchronized(this) {
            bxf bxf0 = new bxf();
            Contact[] arr_contact = updateSelectedContactsParams0.a;
            if(arr_contact != null) {
                for(int v1 = 0; v1 < arr_contact.length; ++v1) {
                    bxf0.add(Long.valueOf(arr_contact[v1].a));
                }
            }
            bxf bxf1 = new bxf();
            Contact[] arr_contact1 = updateSelectedContactsParams0.b;
            if(arr_contact1 != null) {
                for(int v2 = 0; v2 < arr_contact1.length; ++v2) {
                    bxf1.add(Long.valueOf(arr_contact1[v2].a));
                }
            }
            try {
                dbxx dbxx0 = this.c(account0);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbxx0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)dbxx0));
                int v3 = ((dbxx)((dbxw)hftp0).b_message).c.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    dbxv dbxv0 = ((dbxw)hftp0).a(v4);
                    if(bxf0.contains(Long.valueOf((dbxv0.c == null ? dbya.a : dbxv0.c).c))) {
                        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)dbxv0).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)dbxv0));
                        dbxu dbxu0 = (dbxu)hftp1;
                        if(!dbxu0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)dbxu0).ensureMutable();
                        }
                        dbxv dbxv1 = (dbxv)dbxu0.b_message;
                        dbxv1.b |= 8;
                        dbxv1.h = true;
                        ((dbxw)hftp0).l(v4, dbxu0);
                    }
                    else if(bxf1.contains(Long.valueOf((dbxv0.c == null ? dbya.a : dbxv0.c).c))) {
                        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)dbxv0).jf(5, null);
                        hftp2.X(((ProtoLiteMessage)dbxv0));
                        dbxu dbxu1 = (dbxu)hftp2;
                        if(!dbxu1.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)dbxu1).ensureMutable();
                        }
                        dbxv dbxv2 = (dbxv)dbxu1.b_message;
                        dbxv2.b |= 8;
                        dbxv2.h = false;
                        ((dbxw)hftp0).l(v4, dbxu1);
                    }
                }
                this.h(account0, ((dbxw)hftp0));
                dcvz.a.b().h("Successfully batched %s contacts to update.", Integer.valueOf(bxf0.c + bxf1.c));
            }
            catch(IOException unused_ex) {
                dcvz.a.e().h("Failed to modify contact book for account %s", account0.name);
                return 35506;
            }
        }
        return 0;
    }

    public final dbxx b(Account account0) {
        int v = dgbf.m(account0, this.c.e(account0), djat.b(this.b));
        dcvz.a.b().h("Loading ContactBook source: %s", dbxz.a(v));
        if(v == 1) {
            this.f(account0);
            return dbxx.a;
        }
        try {
            return this.c(account0);
        }
        catch(IOException unused_ex) {
            return dbxx.a;
        }
    }

    public final dbxx c(Account account0) {
        dbxx dbxx0;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        File file0 = this.k(account0);
        if(file0.exists()) {
            try {
                FileInputStream fileInputStream0 = new FileInputStream(file0);
                TWR.declareResource(fileInputStream0);
                TWR.useResource$NT(fileInputStream0);
                hftc hftc0 = hftc.a();
                hfsl hfsl0 = hfsl.N(fileInputStream0);
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)dbxx.a).x_newMutableInstance();
                try {
                    TWR.useResource$NT(fileInputStream0);
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                    hfwc0.g(hftv0);
                }
                catch(hfur hfur0) {
                    TWR.useResource$NT(fileInputStream0);
                    if(hfur0.b) {
                        TWR.useResource$NT(fileInputStream0);
                        hfur0 = new hfur(hfur0);
                    }
                    TWR.useResource$NT(fileInputStream0);
                    hfur0.a = hftv0;
                    throw hfur0;
                }
                catch(hfwr hfwr0) {
                    TWR.useResource$NT(fileInputStream0);
                    hfur hfur1 = hfwr0.a();
                    hfur1.a = hftv0;
                    throw hfur1;
                }
                catch(IOException iOException0) {
                    TWR.useResource$NT(fileInputStream0);
                    if((iOException0.getCause() instanceof hfur)) {
                        TWR.useResource$NT(fileInputStream0);
                        throw (hfur)iOException0.getCause();
                    }
                    TWR.useResource$NT(fileInputStream0);
                    hfur hfur2 = new hfur(iOException0);
                    hfur2.a = hftv0;
                    throw hfur2;
                }
                catch(RuntimeException runtimeException0) {
                    TWR.useResource$NT(fileInputStream0);
                    if((runtimeException0.getCause() instanceof hfur)) {
                        TWR.useResource$NT(fileInputStream0);
                        throw (hfur)runtimeException0.getCause();
                    }
                    TWR.useResource$NT(fileInputStream0);
                    throw runtimeException0;
                }
                TWR.useResource$NT(fileInputStream0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dbxx)hftv0))).jf(5, null);
                hftp0.X(((ProtoLiteMessage)(((dbxx)hftv0))));
                dgbf.l(((dbxw)hftp0));
                switch(dbxz.b(((dbxx)((dbxw)hftp0).b_message).d)) {
                    case 0: 
                    case 2: {
                        TWR.useResource$NT(fileInputStream0);
                        if(!((dbxw)hftp0).b_message.isImmutable()) {
                            TWR.useResource$NT(fileInputStream0);
                            ((ProtoLiteBuilder)(((dbxw)hftp0))).ensureMutable();
                        }
                        TWR.useResource$NT(fileInputStream0);
                        ((dbxx)((dbxw)hftp0).b_message).d = 1;
                        ((dbxx)((dbxw)hftp0).b_message).b |= 1;
                        break;
                    label_59:
                        TWR.useResource$NT(fileInputStream0);
                        break;
                    }
                    default: {
                        goto label_59;
                    }
                }
                TWR.useResource$NT(fileInputStream0);
                dbxx0 = (dbxx)((ProtoLiteBuilder)(((dbxw)hftp0))).N_build();
            }
            catch(IllegalStateException illegalStateException0) {
                throw new IOException(illegalStateException0);
            }
            FIN.finallyCodeBegin$NT(v);
            return dbxx0;
        }
        throw new FileNotFoundException();
    }

    public final gmcd d(Account account0) {
        gmcd gmcd1;
        dgbe dgbe0;
        gmcd gmcd0;
        dbxx dbxx6;
        Account account1;
        dbxx dbxx5;
        dbxx dbxx3;
        Context context3;
        dbxx dbxx2;
        Cursor cursor1;
        Context context2;
        Uri uri0;
        Iterator iterator2;
        PhoneAccount phoneAccount0;
        List list5;
        gged_interceptors gged0;
        TelecomManager telecomManager0;
        ggdy ggdy0;
        ArrayList arrayList3;
        dbxw dbxw2;
        Object object1;
        int v13;
        Context context1;
        dgbj dgbj0;
        dbxx dbxx1;
        dbxw dbxw1;
        int v12;
        List list4;
        String s4;
        int v9;
        ArrayList arrayList2;
        dbxx dbxx0;
        Cursor cursor0;
        Context context0;
        ArrayList arrayList0;
        List list0;
        dgbg dgbg0;
        cunf cunf0;
        synchronized(this) {
            boolean z = this.c.e(account0);
            boolean z1 = djat.b(this.b);
            cunf0 = dcvz.a;
            cunf cunf1 = cunf0.b();
            String s = z ? "granted" : "not granted";
            cunf1.h("Syncing contacts - device contacts consent %s", s);
            int v = dgbf.m(account0, z, z1);
            if(v != 1) {
                cunf0.b().h("Syncing contacts - source %s", dbxz.a(v));
                if(v == 3) {
                    dgbg0 = this.a;
                    list0 = dizg.j(dgbg0.a);
                    arrayList0 = new ArrayList(list0.size());
                    for(Object object0: list0) {
                        arrayList0.add(dgbg0.b.a(((Account)object0)));
                    }
                    context0 = dgbg0.c.c;
                    cursor0 = cuqf.d(context0, ContactsContract.Data.CONTENT_URI, dgbl.b, "(NOT account_type=\"com.google.android.exchange\") AND (NOT account_type=\"com.google.exchange\") AND (NOT account_type=\"com.google.android.gm.exchange\") AND (NOT account_type=\"com.google\") AND (mimetype=? OR mimetype=?)", new String[]{"vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2"}, "contact_id ASC,data1 ASC");
                    if(cursor0 == null) {
                        cunf0.e().p("Unable to get cursor for the third party contact content uri.", new Object[0]);
                        dbxx0 = dbxx.a;
                        goto label_27;
                    }
                    else {
                        goto label_31;
                    }
                    goto label_187;
                }
                else {
                    goto label_373;
                }
                goto label_380;
            }
            goto label_383;
        }
    label_27:
        List list1 = list0;
        cunf cunf2 = cunf0;
        ArrayList arrayList1 = arrayList0;
        goto label_187;
        try {
        label_31:
            int v1 = cursor0.getColumnIndex("contact_id");
            int v2 = cursor0.getColumnIndex("lookup");
            int v3 = cursor0.getColumnIndex("display_name");
            int v4 = cursor0.getColumnIndex("photo_thumb_uri");
            int v5 = cursor0.getColumnIndex("mimetype");
            int v6 = cursor0.getColumnIndex("data1");
            int v7 = cursor0.getColumnIndex("data4");
            int v8 = cursor0.getColumnIndex("starred");
            cunf2 = cunf0;
            if(v1 != -1 && v2 != -1 && v3 != -1 && v4 != -1 && v5 != -1 && v6 != -1 && v7 != -1) {
                dbxw dbxw0 = (dbxw)((ProtoLiteMessage)dbxx.a).v_newBuilder();
                if(!dbxw0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dbxw0).ensureMutable();
                }
                list1 = list0;
                ((dbxx)dbxw0.b_message).d = 1;
                ((dbxx)dbxw0.b_message).b |= 1;
                List list2 = gxyg.d();
                boolean z2 = cursor0.moveToFirst();
                while(z2) {
                    Long long0 = cuqf.h(cursor0, v1);
                    if(long0 == null) {
                        goto label_170;
                    }
                    arrayList2 = arrayList0;
                    String s1 = cuqf.k(cursor0, v2);
                    if(TextUtils.isEmpty(s1)) {
                        goto label_167;
                    }
                    String s2 = cuqf.k(cursor0, v3);
                    if(TextUtils.isEmpty(s2)) {
                        goto label_163;
                    }
                    String s3 = cuqf.k(cursor0, v4);
                    if(s3 == null) {
                        v9 = v4;
                        s4 = "";
                    }
                    else {
                        v9 = v4;
                        s4 = s3;
                    }
                    Boolean boolean0 = cuqf.g(cursor0, v8);
                    if(boolean0 == null) {
                        boolean0 = Boolean.valueOf(false);
                    }
                    dbxu dbxu0 = (dbxu)((ProtoLiteMessage)dbxv.a).v_newBuilder();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dbya.a).v_newBuilder();
                    Long long1 = long0;
                    long v10 = (long)long1;
                    int v11 = v1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    List list3 = list2;
                    ((dbya)hftv0).b |= 1;
                    ((dbya)hftv0).c = v10;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbya dbya0 = (dbya)hftp0.b_message;
                    s1.getClass();
                    dbya0.b |= 2;
                    dbya0.d = s1;
                    if(!dbxu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu0).ensureMutable();
                    }
                    dbxv dbxv0 = (dbxv)dbxu0.b_message;
                    dbya dbya1 = (dbya)hftp0.N_build();
                    dbya1.getClass();
                    dbxv0.c = dbya1;
                    dbxv0.b |= 1;
                    if(!dbxu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu0).ensureMutable();
                    }
                    dbxv dbxv1 = (dbxv)dbxu0.b_message;
                    s2.getClass();
                    dbxv1.b |= 2;
                    dbxv1.d = s2;
                    if(!dbxu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu0).ensureMutable();
                    }
                    dbxv dbxv2 = (dbxv)dbxu0.b_message;
                    dbxv2.b |= 4;
                    dbxv2.e = s4;
                    if(!dbxu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu0).ensureMutable();
                    }
                    dbxv dbxv3 = (dbxv)dbxu0.b_message;
                    dbxv3.b |= 8;
                    dbxv3.h = false;
                    boolean z3 = boolean0.booleanValue();
                    if(!dbxu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu0).ensureMutable();
                    }
                    dbxv dbxv4 = (dbxv)dbxu0.b_message;
                    dbxv4.b |= 0x80;
                    dbxv4.l = z3;
                    while(true) {
                        String s5 = cuqf.k(cursor0, v5);
                        if(s5 == null) {
                            list4 = list3;
                        }
                        else {
                            String s6 = cuqf.k(cursor0, v6);
                            if(TextUtils.isEmpty(s6)) {
                            label_134:
                                list4 = list3;
                            }
                            else if(s5.equals("vnd.android.cursor.item/email_v2")) {
                                dbxu0.a(s6);
                                goto label_134;
                            }
                            else if(!s5.equals("vnd.android.cursor.item/phone_v2")) {
                                list4 = list3;
                                cunf2.e().h("Unexpected mime type in contact content uri: %s.", s5);
                            }
                            else {
                                String s7 = cuqf.k(cursor0, v7);
                                if(TextUtils.isEmpty(s7)) {
                                    list4 = list3;
                                    String s8 = djau.a(context0, s6, list4);
                                    if(!TextUtils.isEmpty(s8)) {
                                        dbxu0.k(s8);
                                    }
                                }
                                else {
                                    dbxu0.k(s7);
                                    goto label_134;
                                }
                            }
                        }
                        z2 = cursor0.moveToNext();
                        if(z2) {
                            v12 = v11;
                            if(long1.equals(cuqf.h(cursor0, v12))) {
                                v11 = v12;
                                list3 = list4;
                                long1 = long1;
                                continue;
                            }
                            else {
                                break;
                            }
                        }
                        v12 = v11;
                        break;
                    }
                    if(((dbxv)dbxu0.b_message).f.size() <= 0 && ((dbxv)dbxu0.b_message).g.size() <= 0) {
                        dbxw1 = dbxw0;
                        goto label_151;
                    }
                    else {
                        dbxw1 = dbxw0;
                        dbxw1.k(dbxu0);
                        if(hvqs.p() < 0L || ((long)((dbxx)dbxw1.b_message).c.size()) < hvqs.p()) {
                        label_151:
                            v1 = v12;
                            list2 = list4;
                            dbxw0 = dbxw1;
                            arrayList0 = arrayList2;
                            v2 = v2;
                            v4 = v9;
                            v8 = v8;
                            v3 = v3;
                        }
                        else {
                            cunf2.e().p("Limiting excessive 3P contacts processing.", new Object[0]);
                            dbxx1 = (dbxx)((ProtoLiteBuilder)dbxw1).N_build();
                            cunf2.b().h("Loaded %d third party contacts", Integer.valueOf(dbxx1.c.size()));
                            goto label_184;
                        label_163:
                            z2 = cursor0.moveToNext();
                            arrayList0 = arrayList2;
                            v2 = v2;
                            continue;
                        label_167:
                            z2 = cursor0.moveToNext();
                            arrayList0 = arrayList2;
                            continue;
                        label_170:
                            z2 = cursor0.moveToNext();
                        }
                        continue;
                    }
                    cunf2.b().h("Loaded %d third party contacts", Integer.valueOf(dbxx1.c.size()));
                    goto label_184;
                }
                arrayList2 = arrayList0;
                dbxx1 = (dbxx)((ProtoLiteBuilder)dbxw0).N_build();
            }
            else {
                list1 = list0;
                arrayList2 = arrayList0;
                cunf2.e().p("Unable to find the expected columns in the contact content uri.", new Object[0]);
                dbxx1 = dbxx.a;
            }
            cunf2.b().h("Loaded %d third party contacts", Integer.valueOf(dbxx1.c.size()));
            goto label_184;
        }
        catch(Throwable throwable1) {
            try {
                cursor0.close();
                throw throwable1;
            label_184:
                cursor0.close();
                dbxx0 = dbxx1;
                arrayList1 = arrayList2;
            label_187:
                dgbg.a(dbxx0, arrayList1);
                dgbj0 = dgbg0.d;
                context1 = dgbj0.c;
                if(!context1.getPackageManager().hasSystemFeature("android.hardware.telephony") || (dgbj0.d == null || dgbj0.e == null || dgbj0.d.getPhoneType() != 1 || dgbj0.d.getSimState() != 5)) {
                    dcvz.a.b().p("Unable to load sim contacts. No sim available.", new Object[0]);
                    dgbg.a(dbxx.a, arrayList1);
                    v13 = 0;
                    goto label_331;
                }
                else {
                    object1 = dgbj.b;
                    __monitor_enter(object1);
                    goto label_197;
                }
                goto label_380;
            }
            catch(Throwable throwable0) {
                __monitor_exit(this);
                throw throwable0;
            }
        }
        try {
        label_197:
            dbxw2 = (dbxw)((ProtoLiteMessage)dbxx.a).v_newBuilder();
            if(!dbxw2.b_message.isImmutable()) {
                ((ProtoLiteBuilder)dbxw2).ensureMutable();
            }
            ((dbxx)dbxw2.b_message).d = 1;
            ((dbxx)dbxw2.b_message).b |= 1;
            arrayList3 = new ArrayList();
            try {
                ggdy0 = new ggdy();
                telecomManager0 = dgbk.a(context1);
                if(telecomManager0 == null) {
                    gged0 = ggdy0.h();
                }
                else {
                    goto label_208;
                }
            }
            catch(SecurityException unused_ex) {
                goto label_222;
            }
        }
        catch(Throwable throwable2) {
            goto label_371;
        }
        goto label_223;
        try {
            try {
            label_208:
                list5 = telecomManager0.getCallCapablePhoneAccounts();
            }
            catch(IllegalStateException unused_ex) {
                list5 = ggna.a;
            }
            Iterator iterator1 = list5.iterator();
            while(true) {
            label_212:
                if(!iterator1.hasNext()) {
                    goto label_220;
                }
                Object object2 = iterator1.next();
                PhoneAccountHandle phoneAccountHandle0 = (PhoneAccountHandle)object2;
                try {
                    phoneAccount0 = null;
                    phoneAccount0 = telecomManager0.getPhoneAccount(phoneAccountHandle0);
                }
                catch(IllegalStateException unused_ex) {
                }
                break;
            }
        }
        catch(SecurityException unused_ex) {
            goto label_222;
        }
        catch(Throwable throwable2) {
            goto label_371;
        }
        if(phoneAccount0 == null) {
            goto label_212;
            try {
                try {
                label_218:
                    ggdy0.i(phoneAccount0);
                    goto label_212;
                label_220:
                    gged0 = ggdy0.h();
                }
                catch(SecurityException unused_ex) {
                label_222:
                    gged0 = new ArrayList();
                }
            label_223:
                iterator2 = gged0.iterator();
                while(true) {
                label_224:
                    if(!iterator2.hasNext()) {
                        if(arrayList3.isEmpty()) {
                            dcvz.a.b().p("Failed to load specific ADNs for each SIM card. Using the generic path instead.", new Object[0]);
                            arrayList3.add(dgbj.a);
                        }
                        Iterator iterator3 = arrayList3.iterator();
                        while(true) {
                        label_229:
                            if(!iterator3.hasNext()) {
                                goto label_327;
                            }
                            Object object3 = iterator3.next();
                            uri0 = (Uri)object3;
                            context2 = dgbj0.c;
                            cursor1 = cuqf.b(context2, uri0);
                            if(cursor1 == null) {
                                dcvz.a.e().p("Unable to get cursor for the sim contact content uri.", new Object[0]);
                                dbxx2 = dbxx.a;
                                goto label_237;
                            }
                            goto label_239;
                        }
                    }
                    goto label_354;
                }
            }
            catch(Throwable throwable2) {
                goto label_371;
            }
        }
        else {
            goto label_218;
        }
        goto label_220;
    label_237:
        dgbj dgbj1 = dgbj0;
        goto label_315;
        try {
        label_239:
            dbxw dbxw3 = (dbxw)((ProtoLiteMessage)dbxx.a).v_newBuilder();
            if(!dbxw3.b_message.isImmutable()) {
                ((ProtoLiteBuilder)dbxw3).ensureMutable();
            }
            ((dbxx)dbxw3.b_message).d = 1;
            ((dbxx)dbxw3.b_message).b |= 1;
            List list6 = gxyg.d();
        label_245:
            Long long2 = cuqf.i(cursor1, "_id");
            if(long2 == null) {
                dgbj1 = dgbj0;
                context3 = context2;
            }
            else {
                dbxu dbxu1 = (dbxu)((ProtoLiteMessage)dbxv.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dbya.a).v_newBuilder();
                context3 = context2;
                long v14 = (long)long2;
                dgbj1 = dgbj0;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                dbya dbya2 = (dbya)hftp1.b_message;
                dbya2.b |= 1;
                dbya2.c = v14;
                String s9 = uri0.buildUpon().appendPath(Long.toString(long2.longValue())).build().toString();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                dbya dbya3 = (dbya)hftp1.b_message;
                s9.getClass();
                dbya3.b |= 2;
                dbya3.d = s9;
                if(!dbxu1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dbxu1).ensureMutable();
                }
                dbxv dbxv5 = (dbxv)dbxu1.b_message;
                dbya dbya4 = (dbya)hftp1.N_build();
                dbya4.getClass();
                dbxv5.c = dbya4;
                dbxv5.b |= 1;
                String s10 = cuqf.l(cursor1, "name");
                if(TextUtils.isEmpty(s10)) {
                    if(!dbxu1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu1).ensureMutable();
                    }
                    dbxv dbxv7 = (dbxv)dbxu1.b_message;
                    dbxv7.b |= 2;
                    dbxv7.d = "";
                }
                else {
                    if(!dbxu1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dbxu1).ensureMutable();
                    }
                    dbxv dbxv6 = (dbxv)dbxu1.b_message;
                    s10.getClass();
                    dbxv6.b |= 2;
                    dbxv6.d = s10;
                }
                String s11 = cuqf.l(cursor1, "number");
                String s12 = s11 == null ? null : djau.a(context3, s11, list6);
                if(!TextUtils.isEmpty(s12)) {
                    dbxu1.k(s12);
                }
                String s13 = cuqf.l(cursor1, "emails");
                if(!TextUtils.isEmpty(s13)) {
                    for(Object object4: gfud.e(',').l(s13)) {
                        dbxu1.a(((String)object4));
                    }
                }
                if(((dbxv)dbxu1.b_message).g.size() > 0 || ((dbxv)dbxu1.b_message).f.size() > 0) {
                    dbxw3.k(dbxu1);
                    if(hvqs.p() >= 0L && ((long)((dbxx)dbxw3.b_message).c.size()) >= hvqs.p()) {
                        dcvz.a.e().p("Limiting excessive SIM contacts processing.", new Object[0]);
                        dbxx3 = (dbxx)((ProtoLiteBuilder)dbxw3).N_build();
                        goto label_313;
                    }
                }
            }
            if(cursor1.moveToNext()) {
                context2 = context3;
                dgbj0 = dgbj1;
                goto label_245;
            }
            else {
                dbxx3 = (dbxx)((ProtoLiteBuilder)dbxw3).N_build();
                goto label_313;
            }
            goto label_327;
        }
        catch(Throwable throwable3) {
            try {
                cursor1.close();
                throw throwable3;
            label_313:
                dbxx2 = dbxx3;
                cursor1.close();
            label_315:
                hfuo hfuo0 = dbxx2.c;
                if(!dbxw2.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dbxw2).ensureMutable();
                }
                dbxx dbxx4 = (dbxx)dbxw2.b_message;
                dbxx4.b();
                hfrj.E(hfuo0, dbxx4.c);
                dcvz.a.b().i("Loaded %d sim contacts from %s", Integer.valueOf(hfuo0.size()), uri0);
                dgbj0 = dgbj1;
                goto label_229;
            label_327:
                dbxx5 = (dbxx)((ProtoLiteBuilder)dbxw2).N_build();
            }
            catch(Throwable throwable2) {
                goto label_371;
            }
        }
        try {
            __monitor_exit(object1);
            dgbg.a(dbxx5, arrayList1);
            v13 = 0;
        label_331:
            while(v13 < list1.size()) {
                account1 = account0;
                if(!((Account)list1.get(v13)).equals(account1)) {
                    ++v13;
                    list1 = list1;
                    continue;
                }
                cunf2.a().i("Found %d contacts for account %s", Integer.valueOf(((dbxx)((dbxw)arrayList1.get(v13)).b_message).c.size()), account1);
                dbxw dbxw4 = (dbxw)arrayList1.get(v13);
                if(!dbxw4.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dbxw4).ensureMutable();
                }
                ((dbxx)dbxw4.b_message).d = 1;
                ((dbxx)dbxw4.b_message).b |= 1;
                dbxx6 = (dbxx)((ProtoLiteBuilder)dbxw4).N_build();
                goto label_380;
            }
            account1 = account0;
            cunf2.a().i("Unable to load contacts. No matching account found for %s in %s", account1, list1);
            dbxw dbxw5 = (dbxw)((ProtoLiteMessage)dbxx.a).v_newBuilder();
            if(!dbxw5.b_message.isImmutable()) {
                ((ProtoLiteBuilder)dbxw5).ensureMutable();
            }
            ((dbxx)dbxw5.b_message).d = 1;
            ((dbxx)dbxw5.b_message).b |= 1;
            dbxx6 = (dbxx)((ProtoLiteBuilder)dbxw5).N_build();
            goto label_380;
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
        try {
        label_354:
            Object object5 = iterator2.next();
            PhoneAccount phoneAccount1 = (PhoneAccount)object5;
            boolean z4 = phoneAccount1.hasCapabilities(4);
            if(z4) {
                goto label_358;
            }
            else {
                goto label_224;
                try {
                label_358:
                    PhoneAccountHandle phoneAccountHandle1 = phoneAccount1.getAccountHandle();
                    TelecomManager telecomManager1 = dgbk.a(dgbj0.c);
                    Uri uri1 = telecomManager1 == null ? null : telecomManager1.getAdnUriForPhoneAccount(phoneAccountHandle1);
                    if(uri1 == null || arrayList3.contains(uri1)) {
                        goto label_224;
                    }
                    arrayList3.add(uri1);
                }
                catch(SecurityException securityException0) {
                    dcvz.a.e().f(securityException0).p("Failed to read Adb Uri from sim card.", new Object[0]);
                }
                goto label_224;
            }
            goto label_380;
        }
        catch(Throwable throwable2) {
            try {
            label_371:
                __monitor_exit(object1);
                throw throwable2;
            label_373:
                account1 = account0;
                dbxw dbxw6 = this.a.b.a(account1);
                if(!dbxw6.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dbxw6).ensureMutable();
                }
                ((dbxx)dbxw6.b_message).d = 3;
                ((dbxx)dbxw6.b_message).b |= 1;
                dbxx6 = (dbxx)((ProtoLiteBuilder)dbxw6).N_build();
            label_380:
                gmcd0 = glzd.f(gmbu.i(dbxx6), new dgbb(this, account1), gmap.a);
            }
            catch(Throwable throwable0) {
                __monitor_exit(this);
                throw throwable0;
            }
        }
        __monitor_exit(this);
        return gmcd0;
        try {
        label_383:
            if(this.j(account0)) {
                this.f(account0);
                dgbe0 = new dgbe(dgbd.d, dbxx.a, false, false, true, true);
            }
            else {
                dgbe0 = new dgbe(dgbd.a, dbxx.a, false, false, false, false);
            }
            gmcd1 = gmbu.i(dgbe0);
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
        __monitor_exit(this);
        return gmcd1;
    }

    public static List e(List list0, List list1) {
        List list2 = new ArrayList();
        list2.addAll(list0);
        list2.addAll(list1);
        Collections.sort(list2);
        return list2;
    }

    final void f(Account account0) {
        synchronized(this) {
            File file0 = this.k(account0);
            if(file0.exists() && !file0.delete()) {
                dcvz.a.e().h("Failed to delete contact book for account: %s", account0.name);
                return;
            }
            dcvz.a.b().h("Successfully deleted contact book for account: %s", account0.name);
        }
    }

    public final void g() {
        synchronized(this) {
            for(Object object0: dizg.i(this.b, new String[]{"nearby_sharing_contact_book"})) {
                ((File)object0).delete();
            }
            dcvz.a.b().p("Reset ContactBook.", new Object[0]);
        }
    }

    public final void h(Account account0, dbxw dbxw0) {
        synchronized(this) {
            dgbf.l(dbxw0);
            try(FileOutputStream fileOutputStream0 = new FileOutputStream(this.k(account0))) {
                ((dbxx)((ProtoLiteBuilder)dbxw0).N_build()).writeToStream(fileOutputStream0);
            }
        }
    }

    public static void i(List list0, List list1, List list2) {
        for(Object object0: list0) {
            list1.addAll(((dbxv)object0).f);
            list2.addAll(((dbxv)object0).g);
        }
    }

    public final boolean j(Account account0) {
        boolean z;
        synchronized(this) {
            z = this.k(account0).exists();
        }
        return z;
    }

    private final File k(Account account0) {
        return dizg.g(this.b, account0, "nearby_sharing_contact_book");
    }

    private static final void l(dbxw dbxw0) {
        int v = ((dbxx)dbxw0.b_message).c.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(dbxw0.a(v).d.isEmpty()) {
                if(!dbxw0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dbxw0).ensureMutable();
                }
                dbxx dbxx0 = (dbxx)dbxw0.b_message;
                dbxx0.b();
                dbxx0.c.remove(v);
                dcvz.a.b().h("Invalid contact pos %d", Integer.valueOf(v));
            }
        }
    }

    private static int m(Account account0, boolean z, boolean z1) {
        if(!z && !z1) {
            return dgbh.a(account0) ? 5 : 1;
        }
        return 3;
    }
}

