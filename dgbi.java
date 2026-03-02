import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import java.util.List;
import jeb.synthetic.TWR;

final class dgbi {
    static final String[] a;
    static final String[] b;
    public final Context c;

    static {
        dgbi.a = new String[]{"_id", "lookup"};
        dgbi.b = new String[]{"contact_id", "lookup", "display_name", "photo_thumb_uri", "mimetype", "data1", "data4", "account_name", "account_type", "starred"};
    }

    public dgbi(Context context0) {
        this.c = context0;
    }

    public final dbxw a(Account account0) {
        int v11;
        Context context2;
        String s3;
        int v8;
        dbxw dbxw0;
        Context context0 = this.c;
        Cursor cursor0 = cuqf.d(context0, ContactsContract.Data.CONTENT_URI, dgbi.b, "(account_name=? AND account_type=?) AND (mimetype=? OR mimetype=?)", new String[]{account0.name, account0.type, "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2"}, "contact_id ASC,data1 ASC");
        if(cursor0 != null) {
            try {
                int v = cursor0.getColumnIndex("contact_id");
                int v1 = cursor0.getColumnIndex("lookup");
                int v2 = cursor0.getColumnIndex("display_name");
                int v3 = cursor0.getColumnIndex("photo_thumb_uri");
                int v4 = cursor0.getColumnIndex("mimetype");
                int v5 = cursor0.getColumnIndex("data1");
                int v6 = cursor0.getColumnIndex("data4");
                int v7 = cursor0.getColumnIndex("starred");
                if(v != -1 && v1 != -1 && v2 != -1 && v3 != -1 && v4 != -1 && v5 != -1 && v6 != -1) {
                    dbxw0 = (dbxw)((ProtoLiteMessage)dbxx.a).v_newBuilder();
                    List list0 = gxyg.d();
                    boolean z = cursor0.moveToFirst();
                    while(z) {
                        Long long0 = cuqf.h(cursor0, v);
                        if(long0 == null) {
                            goto label_130;
                        }
                        String s = cuqf.k(cursor0, v1);
                        if(TextUtils.isEmpty(s)) {
                            goto label_128;
                        }
                        String s1 = cuqf.k(cursor0, v2);
                        if(TextUtils.isEmpty(s1)) {
                            goto label_125;
                        }
                        String s2 = cuqf.k(cursor0, v3);
                        if(s2 == null) {
                            v8 = v2;
                            s3 = "";
                        }
                        else {
                            v8 = v2;
                            s3 = s2;
                        }
                        Boolean boolean0 = cuqf.g(cursor0, v7);
                        if(boolean0 == null) {
                            boolean0 = Boolean.valueOf(false);
                        }
                        dbxu dbxu0 = (dbxu)((ProtoLiteMessage)dbxv.a).v_newBuilder();
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dbya.a).v_newBuilder();
                        Context context1 = context0;
                        int v9 = v;
                        long v10 = (long)long0;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        Long long1 = long0;
                        ((dbya)hftv0).b |= 1;
                        ((dbya)hftv0).c = v10;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        dbya dbya0 = (dbya)hftp0.b_message;
                        s.getClass();
                        dbya0.b |= 2;
                        dbya0.d = s;
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
                        s1.getClass();
                        dbxv1.b |= 2;
                        dbxv1.d = s1;
                        if(!dbxu0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)dbxu0).ensureMutable();
                        }
                        dbxv dbxv2 = (dbxv)dbxu0.b_message;
                        dbxv2.b |= 4;
                        dbxv2.e = s3;
                        if(!dbxu0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)dbxu0).ensureMutable();
                        }
                        dbxv dbxv3 = (dbxv)dbxu0.b_message;
                        dbxv3.b |= 8;
                        dbxv3.h = false;
                        boolean z1 = boolean0.booleanValue();
                        if(!dbxu0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)dbxu0).ensureMutable();
                        }
                        dbxv dbxv4 = (dbxv)dbxu0.b_message;
                        dbxv4.b |= 0x80;
                        dbxv4.l = z1;
                        while(true) {
                            String s4 = cuqf.k(cursor0, v4);
                            if(s4 == null) {
                                context2 = context1;
                            }
                            else {
                                String s5 = cuqf.k(cursor0, v5);
                                if(TextUtils.isEmpty(s5)) {
                                label_99:
                                    context2 = context1;
                                }
                                else if(s4.equals("vnd.android.cursor.item/email_v2")) {
                                    dbxu0.a(s5);
                                    goto label_99;
                                }
                                else if(!s4.equals("vnd.android.cursor.item/phone_v2")) {
                                    context2 = context1;
                                    dcvz.a.e().h("Unexpected mime type in contact content uri: %s.", s4);
                                }
                                else {
                                    String s6 = cuqf.k(cursor0, v6);
                                    if(TextUtils.isEmpty(s6)) {
                                        context2 = context1;
                                        String s7 = djau.a(context2, s5, list0);
                                        if(!TextUtils.isEmpty(s7)) {
                                            dbxu0.k(s7);
                                        }
                                    }
                                    else {
                                        dbxu0.k(s6);
                                        goto label_99;
                                    }
                                }
                            }
                            z = cursor0.moveToNext();
                            if(z) {
                                v11 = v9;
                                if(long1.equals(cuqf.h(cursor0, v11))) {
                                    v9 = v11;
                                    context1 = context2;
                                    long1 = long1;
                                    continue;
                                }
                                else {
                                    break;
                                }
                            }
                            v11 = v9;
                            break;
                        }
                        if(((dbxv)dbxu0.b_message).f.size() <= 0 && ((dbxv)dbxu0.b_message).g.size() <= 0) {
                            dbxw0 = dbxw0;
                            goto label_116;
                        }
                        dbxw0 = dbxw0;
                        dbxw0.k(dbxu0);
                        if(hvqs.p() < 0L || ((long)((dbxx)dbxw0.b_message).c.size()) < hvqs.p()) {
                        label_116:
                            v1 = v1;
                            context0 = context2;
                            v2 = v8;
                            v3 = v3;
                            v7 = v7;
                            v = v11;
                        }
                        else {
                            dcvz.a.e().p("Limiting excessive GAIA contacts processing.", new Object[0]);
                            break;
                        label_125:
                            z = cursor0.moveToNext();
                            v1 = v1;
                            continue;
                        label_128:
                            z = cursor0.moveToNext();
                            continue;
                        label_130:
                            z = cursor0.moveToNext();
                        }
                    }
                }
                else {
                    dcvz.a.e().p("Unable to find the expected columns in the contact content uri.", new Object[0]);
                    dbxw0 = (dbxw)((ProtoLiteMessage)dbxx.a).v_newBuilder();
                }
                dcvz.a.a().h("Loaded %d contacts for the user account", Integer.valueOf(((dbxx)dbxw0.b_message).c.size()));
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
            return dbxw0;
        }
        dcvz.a.e().p("Unable to get cursor for the gaia contact content uri.", new Object[0]);
        return (dbxw)((ProtoLiteMessage)dbxx.a).v_newBuilder();
    }
}

