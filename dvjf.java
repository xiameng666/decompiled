import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.PassSaveTypeFilter;
import com.google.android.gms.pay.PassType;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import j..util.Collection.-EL;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public final class dvjf {
    public static final bboh a;
    public static final gfss b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public final Context h;
    public final String i;
    public final String j;
    public final eaqx k;
    private static final String l;
    private static final String m;
    private static final String n;
    private final dviy o;
    private final dvhz p;
    private final dvif q;
    private final ggfp r;
    private final dvma s;
    private final boolean t;

    static {
        dvjf.a = bboh.b("Pay", bbcu.cZ);
        dvjf.b = new gfss(",");
        dvjf.c = String.format("%s=? AND %s=?", "account_id", "environment");
        dvjf.d = String.format("%s=? AND %s=? AND %s=?", "account_id", "environment", "valuable_id");
        dvjf.e = String.format("%s=? AND %s=? AND %s IN (%%s) AND %s=0", "account_id", "environment", "valuable_id", "local_only");
        dvjf.l = String.format("SELECT COUNT(DISTINCT %s) FROM %s WHERE %s=? AND %s=? AND %s=?", "valuable_id", "Valuable", "account_id", "environment", "active");
        dvjf.f = String.format("SELECT COUNT(DISTINCT %s) FROM %s WHERE %s=? AND %s=?", "group_id", "Valuable", "account_id", "environment");
        dvjf.g = String.format("SELECT %s, %s FROM %s WHERE %s=? AND %s=? AND %s=0", "valuable_id", "valuable_hash", "Valuable", "account_id", "environment", "local_only");
        dvjf.m = String.format("SELECT %s.%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, newest_entry.%s, transaction_count.count as %s FROM %s %s LEFT JOIN (%s) newest_entry ON %s.%s=newest_entry.%s LEFT JOIN (%s) transaction_count ON %s.%s=transaction_count.%s", "valuable_table", "valuable_id", "encrypted_filename", "encrypted_proto_bytes", "proto_bytes", "smart_tap_enabled", "valuable_hash", "local_only", "predefined_rotating_barcode_values_hash", "notifications_enabled", "sync_state", "private_pass_attachments_proto_bytes", "history_proto", "count", "Valuable", "valuable_table", dvid.e, "valuable_table", "valuable_id", "valuable_id", dvid.d, "valuable_table", "valuable_id", "valuable_id");
        dvjf.n = String.format("SELECT %s.%s, %s, %s, %s, %s, %s, %s, %s, newest_entry.%s, transaction_count.count as %s FROM %s %s LEFT JOIN (%s) newest_entry ON %s.%s=newest_entry.%s LEFT JOIN (%s) transaction_count ON %s.%s=transaction_count.%s WHERE %s=? AND %s=? AND %s.%s IN (%%s) AND NOT %s.%s IN (%%s)", "valuable_table", "valuable_id", "encrypted_filename", "encrypted_proto_bytes", "proto_bytes", "smart_tap_enabled", "valuable_hash", "local_only", "predefined_rotating_barcode_values_hash", "history_proto", "count", "Valuable", "valuable_table", dvid.e, "valuable_table", "valuable_id", "valuable_id", dvid.d, "valuable_table", "valuable_id", "valuable_id", "account_id", "environment", "valuable_table", "group_id", "valuable_table", "valuable_id");
    }

    public dvjf(Context context0, String s, String s1, dviy dviy0, dvhz dvhz0, dvif dvif0, eaqx eaqx0, ggfp ggfp0, dvma dvma0, boolean z) {
        this.h = context0;
        this.i = s;
        this.j = s1;
        this.o = dviy0;
        this.p = dvhz0;
        this.q = dvif0;
        this.k = eaqx0;
        this.r = ggfp0;
        this.s = dvma0;
        this.t = z;
    }

    public final Pair a(PassFilter passFilter0) {
        Pair pair0;
        gged_interceptors gged0;
        PassFilter passFilter1;
        gfsx gfsx8;
        gfsx gfsx7;
        gfsx gfsx3;
        gfsx gfsx1;
        String s;
        guwf guwf0;
        eaqw eaqw1;
        dvjh dvjh0;
        eaqw eaqw0 = this.k.a();
        StringBuilder stringBuilder0 = new StringBuilder(dvjf.m);
        ggdy ggdy0 = new ggdy();
        ggdy0.i(this.i);
        ggdy0.i(this.j);
        ggdy0.i(this.i);
        ggdy0.i(this.j);
        gfsx gfsx0 = gfsx.m("valuable_table");
        dviy dviy0 = this.o;
        if(passFilter0 == null) {
            dvjh0 = dviy0.f;
            eaqw1 = eaqw0;
        }
        else {
            StringBuilder stringBuilder1 = new StringBuilder(dviy.a);
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(dviy0.d);
            arrayList0.add(dviy0.e);
            PassType[] arr_passType = passFilter0.a;
            if(arr_passType != null && arr_passType.length != 0) {
                ArrayList arrayList1 = new ArrayList();
                for(int v = 0; v < arr_passType.length; ++v) {
                    switch(arr_passType[v].a) {
                        case 2: {
                            guwf0 = guwf.f;
                            break;
                        }
                        case 3: {
                            guwf0 = guwf.g;
                            break;
                        }
                        case 4: {
                            guwf0 = guwf.c;
                            break;
                        }
                        case 5: {
                            guwf0 = guwf.b;
                            break;
                        }
                        case 6: {
                            guwf0 = guwf.d;
                            break;
                        }
                        case 8: {
                            guwf0 = guwf.h;
                            break;
                        }
                        case 9: {
                            guwf0 = guwf.i;
                            break;
                        }
                        case 10: {
                            guwf0 = guwf.j;
                            break;
                        }
                        case 12: {
                            guwf0 = guwf.k;
                            break;
                        }
                        case 13: {
                            guwf0 = guwf.m;
                            break;
                        }
                        default: {
                            guwf0 = guwf.a;
                        }
                    }
                    if(guwf0 != guwf.a) {
                        arrayList1.add(dviy.b(guwf0));
                    }
                }
                if(arrayList1.isEmpty()) {
                    arrayList1 = gged_interceptors.l(dviy.b(guwf.a));
                    s = "?";
                }
                else {
                    s = new gfss(",").b(Collections.nCopies(arrayList1.size(), "?"));
                }
                gfsx1 = gfsx.m(new dvjh(dviy.c(gfsx0) + "valuable_type IN (" + s + ")", arrayList1));
            }
            else {
                gfsx1 = gfqx.a;
            }
            gfsx gfsx2 = dviy.a(gfsx0, "knowledge_graph_id", passFilter0.b);
            String[] arr_s = passFilter0.c;
            if(arr_s != null && arr_s.length != 0) {
                String[] arr_s1 = new String[arr_s.length];
                int v1 = 0;
                while(v1 < arr_s.length) {
                    arr_s1[v1] = new dsih(arr_s[v1]).c;
                    ++v1;
                    arr_s = arr_s;
                }
                gfsx3 = dviy.a(gfsx0, "valuable_id", arr_s1);
            }
            else {
                gfsx3 = gfqx.a;
            }
            gfsx gfsx4 = dviy.a(gfsx0, "external_object_id", passFilter0.d);
            gfsx gfsx5 = dviy.a(gfsx0, "issuer_id", passFilter0.e);
            gfsx gfsx6 = dviy.a(gfsx0, "group_id", passFilter0.f);
            int v2 = passFilter0.h;
            eaqw1 = eaqw0;
            switch(v2) {
                case 2: {
                    gfsx7 = gfsx.m(new dvjh(dviy.c(gfsx0) + dviy.b, gged_interceptors.l("1")));
                    break;
                }
                case 3: {
                    gfsx7 = gfsx.m(new dvjh(dviy.c(gfsx0) + dviy.b, gged_interceptors.l("0")));
                    break;
                }
                default: {
                    gfsx7 = v2 != 4 && v2 != 5 ? gfqx.a : gfsx.m(new dvjh(dviy.c(gfsx0) + dviy.b, gged_interceptors.l("1")));
                }
            }
            PassSaveTypeFilter passSaveTypeFilter0 = passFilter0.i;
            if(passSaveTypeFilter0 == null) {
                gfsx8 = gfqx.a;
            }
            else {
                switch(passSaveTypeFilter0.a) {
                    case 2: {
                        gfsx8 = gfsx.m(new dvjh(dviy.c(gfsx0) + dviy.c, gged_interceptors.l("1")));
                        break;
                    }
                    case 3: {
                        gfsx8 = gfsx.m(new dvjh(dviy.c(gfsx0) + dviy.c, gged_interceptors.l("0")));
                        break;
                    }
                    default: {
                        gfsx8 = gfqx.a;
                    }
                }
            }
            dvjh0 = (dviy.d(stringBuilder1, arrayList0, gfsx1) | dviy.d(stringBuilder1, arrayList0, gfsx2) | dviy.d(stringBuilder1, arrayList0, gfsx3) | dviy.d(stringBuilder1, arrayList0, gfsx4) | dviy.d(stringBuilder1, arrayList0, gfsx5) | dviy.d(stringBuilder1, arrayList0, gfsx6) | dviy.d(stringBuilder1, arrayList0, gfsx7) | dviy.d(stringBuilder1, arrayList0, gfsx8)) == 0 ? dviy0.f : new dvjh(stringBuilder1.toString(), arrayList0);
        }
        stringBuilder0.append(" ");
        stringBuilder0.append(dvjh0.a);
        ggdy0.k(dvjh0.b);
        stringBuilder0.append(" ORDER BY sort_key");
        ArrayList arrayList2 = new ArrayList();
        SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.h).c();
        sQLiteDatabase0.beginTransaction();
        try(Cursor cursor0 = sQLiteDatabase0.rawQuery(stringBuilder0.toString(), ((String[])ggdy0.h().toArray(new String[0])))) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                gfsx gfsx9 = this.f(cursor0, eaqw1);
                if(gfsx9.i()) {
                    arrayList2.add(gfsx9.d());
                }
                else {
                    ((ggtj)dvjf.a.i()).x("Found invalid valuable in database");
                }
                eaqw1 = eaqw1;
            }
            if(passFilter0 == null) {
                passFilter1 = null;
            }
            else {
                passFilter1 = passFilter0;
                if(passFilter1.g) {
                    HashSet hashSet0 = new HashSet();
                    HashSet hashSet1 = ggog.i(arrayList2.size());
                    for(Object object0: arrayList2) {
                        hashSet0.add(((Valuable)object0).p.c);
                        hashSet1.add(((Valuable)object0).b);
                    }
                    ggdy ggdy1 = new ggdy();
                    ggdy1.i(this.i);
                    ggdy1.i(this.j);
                    ggdy1.i(this.i);
                    ggdy1.i(this.j);
                    ggdy1.i(this.i);
                    ggdy1.i(this.j);
                    ggdy1.k(hashSet0);
                    ggdy1.k(hashSet1);
                    String[] arr_s2 = (String[])ggdy1.h().toArray(new String[0]);
                    try(Cursor cursor1 = sQLiteDatabase0.rawQuery(String.format(dvjf.n, dvjf.b.b(Collections.nCopies(hashSet0.size(), "?")), dvjf.b.b(Collections.nCopies(hashSet1.size(), "?"))), arr_s2)) {
                        while(true) {
                            if(!cursor1.moveToNext()) {
                                break;
                            }
                            gfsx gfsx10 = this.f(cursor1, eaqw1);
                            if(gfsx10.i()) {
                                arrayList2.add(gfsx10.d());
                            }
                            else {
                                ((ggtj)dvjf.a.i()).x("Found invalid valuable in database");
                            }
                        }
                    }
                    Collections.sort(arrayList2, new dvje());
                }
            }
            gged0 = gged_interceptors.i(arrayList2);
            gvcw gvcw0 = gvcw.a;
            if(passFilter1 != null && passFilter1.h == 4) {
                gvcw0 = dmjf.a(sQLiteDatabase0, dvjf.l, new String[]{this.i, this.j, "0"}) <= 0 ? gvcw.b : gvcw.c;
            }
            if(hwlu.d() && passFilter1 != null && passFilter1.h == 5) {
                gged0 = (gged_interceptors)Collection.-EL.stream(gged0).filter(new dvjd()).collect(ggaf.a);
            }
            pair0 = new Pair(gged0, gvcw0);
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        return pair0;
    }

    public final Valuable b(String s) {
        return this.c(dmhk.d(this.h).c(), s, this.k.a());
    }

    public final Valuable c(SQLiteDatabase sQLiteDatabase0, String s, eaqw eaqw0) {
        try(Cursor cursor0 = sQLiteDatabase0.query("Valuable", ((String[])gged_interceptors.w("valuable_id", "encrypted_filename", "encrypted_proto_bytes", "proto_bytes", "local_only", "smart_tap_enabled", "predefined_rotating_barcode_values_hash", "valuable_hash", "notifications_enabled", "sync_state", "private_pass_attachments_proto_bytes").toArray(new String[0])), dvjf.d, new String[]{this.i, this.j, s}, null, null, null)) {
            if(cursor0.moveToNext()) {
                gfsx gfsx0 = this.f(cursor0, eaqw0);
                if(!gfsx0.i()) {
                    ((ggtj)dvjf.a.i()).B("Found invalid valuable in database for ID: %s", s);
                }
                return (Valuable)gfsx0.g();
            }
        }
        ((ggtj)dvjf.a.j()).B("No result found for valuable ID: %s", s);
        return null;
    }

    public final Valuable d(String s, int v) {
        Valuable valuable0;
        eaqw eaqw0 = this.k.a();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("predefined_rotating_barcode_values_hash", Integer.valueOf(v));
        SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.h).c();
        sQLiteDatabase0.beginTransaction();
        try {
            sQLiteDatabase0.update("Valuable", contentValues0, dvjf.d, new String[]{this.i, this.j, s});
            valuable0 = this.c(sQLiteDatabase0, s, eaqw0);
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        return valuable0;
    }

    public final Valuable e(SQLiteDatabase sQLiteDatabase0, eaqw eaqw0, gveu gveu0, long v, boolean z, guwd guwd0, String s, gfsx gfsx0) {
        Valuable valuable0 = fsib.a(gveu0, gfqx.a, 0L, v, z, true, false, 0, gfqx.a, ggna.a, true, guwd0, gfsx0);
        ContentValues contentValues0 = this.l(valuable0, s, eaqw0);
        String s1 = valuable0.b;
        Valuable valuable1 = this.m(sQLiteDatabase0, s1, contentValues0, eaqw0);
        if(valuable1 == null) {
            ((ggtj)dvjf.a.h()).B("Failed to apply UPSERT action for Valuable: %s", s1);
        }
        return valuable1;
    }

    public final gfsx f(Cursor cursor0, eaqw eaqw0) {
        gfsx gfsx2;
        gfsx gfsx0;
        gvav gvav0;
        long v3;
        String s = cursor0.getString(cursor0.getColumnIndexOrThrow("encrypted_filename"));
        byte[] arr_b = cursor0.getBlob(cursor0.getColumnIndexOrThrow("encrypted_proto_bytes"));
        byte[] arr_b1 = cursor0.getBlob(cursor0.getColumnIndexOrThrow("proto_bytes"));
        int v = cursor0.getInt(cursor0.getColumnIndexOrThrow("smart_tap_enabled"));
        String s1 = cursor0.getString(cursor0.getColumnIndexOrThrow("valuable_id"));
        if(gfta.c(s1)) {
            ((ggtj)dvjf.a.i()).x("Row found with no valuable ID.");
            return gfqx.a;
        }
        int v1 = cursor0.getColumnIndex("count");
        long v2 = 0L;
        if(v1 == -1) {
            try {
                v3 = DatabaseUtils.queryNumEntries(dmhk.d(this.q.b.f).c(), "SmartTapHistory", dvid.b, new String[]{this.q.b.g, this.q.b.h, s1});
            }
            catch(dmhl dmhl0) {
                a.e(dvif.a.i(), "Failed to get transaction counter for valuable ID: %s", s1, dmhl0);
                v3 = 0L;
            }
        }
        else {
            v3 = (long)cursor0.getInt(v1);
        }
        int v4 = cursor0.getColumnIndex("valuable_hash");
        if(v4 != -1) {
            v2 = cursor0.getLong(v4);
        }
        int v5 = cursor0.getColumnIndex("predefined_rotating_barcode_values_hash");
        int v6 = v5 == -1 ? 0 : cursor0.getInt(v5);
        boolean z = cursor0.getInt(cursor0.getColumnIndexOrThrow("local_only")) == 1;
        byte[] arr_b2 = null;
        if(cursor0.getColumnIndex("history_proto") == -1) {
            try(Cursor cursor1 = dmhk.d(this.q.b.f).c().query("SmartTapHistory", new String[]{"row_id", "history_proto"}, dvid.b, new String[]{this.q.b.g, this.q.b.h, s1}, null, null, dvid.c, "1")) {
                gvav0 = cursor1.moveToNext() ? dvid.b(dvid.d(cursor1)) : null;
                gfsx0 = gfsx.l(gvav0);
            }
            catch(dmhl dmhl1) {
                a.e(dvif.a.i(), "Failed to get last smart tap event for valuable ID: %s", s1, dmhl1);
                gfsx0 = gfqx.a;
            }
        }
        else {
            byte[] arr_b3 = dvid.d(cursor0);
            gfsx0 = arr_b3 == null ? gfqx.a : gfsx.l(dvid.b(arr_b3));
        }
        gfsx gfsx1 = eaqw0.c(s, arr_b, arr_b1);
        if(gfsx1.i()) {
            try {
                gfsx2 = gfqx.a;
                long v7 = System.currentTimeMillis();
                long v8 = hwrq.a.d().b() + v7;
                gfsx2 = gfsx.m(this.p.b(s1, v7, v8));
            }
            catch(dmhl dmhl2) {
                a.ae(dvjf.a.j(), "Failed to read predefined rotating barcode values data.", dmhl2);
            }
            int v9 = cursor0.getColumnIndex("notifications_enabled");
            boolean z1 = v9 == -1 || cursor0.getInt(v9) == 1;
            int v10 = cursor0.getColumnIndex("sync_state");
            guwd guwd0 = v10 == -1 ? guwd.a : guwd.b(cursor0.getInt(v10));
            if(guwd0 == null) {
                guwd0 = guwd.a;
            }
            int v11 = cursor0.getColumnIndex("private_pass_attachments_proto_bytes");
            if(v11 != -1) {
                arr_b2 = cursor0.getBlob(v11);
            }
            Valuable valuable0 = fsib.b(((byte[])gfsx1.d()), gfsx0, v3, v2, z, v == 1, true, v6, gfsx2, ggna.a, z1, guwd0, arr_b2);
            if(this.r.contains(valuable0.R) && (hwvf.a.b().o() && dvkx.i(valuable0) || !dvkx.e(valuable0) || this.s.j(valuable0.b, this.h) || !valuable0.K.isEmpty()) && (hwoz.a.b().g() || !this.t || !valuable0.i)) {
                return gfsx.m(valuable0);
            }
        }
        return gfqx.a;
    }

    public final gged_interceptors g(String s, Iterable iterable0) {
        gged_interceptors gged0;
        eaqw eaqw0 = this.k.a();
        SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.h).c();
        ggdy ggdy0 = new ggdy();
        sQLiteDatabase0.beginTransaction();
        try {
            for(Object object0: iterable0) {
                Valuable valuable0 = this.e(sQLiteDatabase0, eaqw0, ((gveu)object0), 0L, true, guwd.a, s, gfqx.a);
                if(valuable0 == null) {
                    ((ggtj)dvjf.a.i()).x("Failed to upsert local valuable from wrapper.");
                }
                else {
                    ggdy0.i(valuable0);
                }
                this = this;
                s = s;
            }
            sQLiteDatabase0.setTransactionSuccessful();
            gged0 = ggdy0.h();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        return gged0;
    }

    public final String h(String s) {
        String s2;
        byte[] arr_b1;
        byte[] arr_b;
        eaqw eaqw0 = this.k.a();
        try(Cursor cursor0 = dmhk.d(this.h).c().query("Valuable", new String[]{"save_jwt", "save_jwt_dek_encrypted", "save_jwt_encrypted", "save_jwt_encrypted_filename"}, dvjf.d, new String[]{this.i, this.j, s}, null, null, null)) {
            if(cursor0.moveToNext()) {
                int v = cursor0.getColumnIndex("save_jwt");
                int v1 = cursor0.getColumnIndex("save_jwt_dek_encrypted");
                int v2 = cursor0.getColumnIndex("save_jwt_encrypted");
                int v3 = cursor0.getColumnIndex("save_jwt_encrypted_filename");
                if(v >= 0) {
                    String s1 = cursor0.getString(v);
                    if(!gfta.c(s1)) {
                        return s1;
                    }
                }
                arr_b = v1 >= 0 ? cursor0.getBlob(v1) : null;
                arr_b1 = v2 >= 0 ? cursor0.getBlob(v2) : null;
                s2 = v3 >= 0 ? cursor0.getString(v3) : null;
                gfsx gfsx0 = eaqw0.c(s2, arr_b1, arr_b);
                return gfsx0.i() ? new String(((byte[])gfsx0.d()), StandardCharsets.UTF_8) : null;
            }
        }
        ((ggtj)dvjf.a.j()).B("No result while getting JWT found for valuable ID: %s", s);
        return null;
    }

    public final void i(SQLiteDatabase sQLiteDatabase0, String s) {
        sQLiteDatabase0.delete("Valuable", dvjf.d, new String[]{this.i, this.j, s});
        this.p.c(sQLiteDatabase0, s);
    }

    public final void j() {
        String s;
        eaqw eaqw0 = this.k.a();
        SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.h).c();
        sQLiteDatabase0.beginTransaction();
        try(Cursor cursor0 = sQLiteDatabase0.query("Valuable", new String[]{"valuable_id", "save_jwt"}, dvjf.c, new String[]{this.i, this.j}, null, null, "sort_key")) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                int v1 = cursor0.getColumnIndex("save_jwt");
                s = v1 >= 0 ? cursor0.getString(v1) : null;
                if(!gfta.c(s)) {
                    String s1 = cursor0.getString(cursor0.getColumnIndexOrThrow("valuable_id"));
                    if(gfta.c(s1)) {
                        ((ggtj)dvjf.a.i()).x("Row found with no valuable ID.");
                    }
                    else {
                        byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("save_jwt", "");
                        try {
                            Pair pair0 = eaqw0.a(arr_b);
                            contentValues0.put("save_jwt_encrypted_filename", ((String)pair0.first));
                            contentValues0.put("save_jwt_encrypted", ((byte[])pair0.second));
                        }
                        catch(GeneralSecurityException generalSecurityException0) {
                            a.ae(dvjf.a.i(), "Failed to encrypt JWT using Android KeyStore.", generalSecurityException0);
                            contentValues0.remove("save_jwt_encrypted_filename");
                            contentValues0.remove("save_jwt_encrypted");
                        }
                        try {
                            contentValues0.put("save_jwt_dek_encrypted", eaqw0.f(arr_b));
                        }
                        catch(earn earn0) {
                            if(!contentValues0.containsKey("save_jwt_encrypted_filename")) {
                                throw new eaqz("Failed to encrypt JWT using Android KeyStore and storage key.", earn0);
                            }
                            if(!contentValues0.containsKey("save_jwt_encrypted")) {
                                throw new eaqz("Failed to encrypt JWT using Android KeyStore and storage key.", earn0);
                            }
                        }
                        sQLiteDatabase0.update("Valuable", contentValues0, dvjf.d, new String[]{this.i, this.j, s1});
                    }
                }
            }
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    public final boolean k(Iterable iterable0) {
        SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.h).c();
        for(Object object0: iterable0) {
            try(Cursor cursor0 = sQLiteDatabase0.query("Valuable", new String[]{"notifications_enabled"}, dvjf.d, new String[]{this.i, this.j, ((String)object0)}, null, null, null)) {
                do {
                    if(!cursor0.moveToNext()) {
                        return true;
                    }
                    int v = cursor0.getColumnIndex("notifications_enabled");
                }
                while(v < 0);
                if(cursor0.getInt(v) == 1) {
                    return true;
                }
            }
            continue;
        }
        return false;
    }

    private final ContentValues l(Valuable valuable0, String s, eaqw eaqw0) {
        ContentValues contentValues0 = new ContentValues();
        byte[] arr_b = valuable0.a.toBytesArray();
        byte[] arr_b1 = gfta.c(s) ? new byte[0] : s.getBytes(StandardCharsets.UTF_8);
        try {
            Pair pair0 = eaqw0.a(arr_b);
            contentValues0.put("encrypted_filename", ((String)pair0.first));
            contentValues0.put("encrypted_proto_bytes", ((byte[])pair0.second));
            Pair pair1 = eaqw0.a(arr_b1);
            contentValues0.put("save_jwt_encrypted_filename", ((String)pair1.first));
            contentValues0.put("save_jwt_encrypted", ((byte[])pair1.second));
        }
        catch(GeneralSecurityException generalSecurityException0) {
            a.ae(dvjf.a.i(), "Failed to encrypt valuable using Android KeyStore.", generalSecurityException0);
            contentValues0.remove("encrypted_filename");
            contentValues0.remove("encrypted_proto_bytes");
            contentValues0.remove("save_jwt_encrypted_filename");
            contentValues0.remove("save_jwt_encrypted");
        }
        try {
            contentValues0.put("proto_bytes", eaqw0.f(arr_b));
            contentValues0.put("save_jwt_dek_encrypted", eaqw0.f(arr_b1));
        }
        catch(earn earn0) {
            if(!contentValues0.containsKey("encrypted_filename") || !contentValues0.containsKey("encrypted_proto_bytes")) {
                throw new eaqz("Failed to encrypt valuable using Android KeyStore and storage key. No way to store valuable.", earn0);
            }
            a.ae(dvjf.a.h(), "Failed to backfill valuable proto bytes using the storage key.", earn0);
            contentValues0.put("proto_bytes", new byte[0]);
        }
        int v = ftqn.a(guwf.class, valuable0.R);
        contentValues0.put("account_id", this.i);
        contentValues0.put("environment", this.j);
        contentValues0.put("valuable_type", Integer.valueOf(v));
        contentValues0.put("valuable_id", valuable0.b);
        contentValues0.put("group_id", valuable0.p.c);
        contentValues0.put("knowledge_graph_id", valuable0.g);
        contentValues0.put("issuer_id", valuable0.c);
        contentValues0.put("external_class_id", valuable0.C());
        contentValues0.put("external_object_id", valuable0.r());
        contentValues0.put("sort_key", valuable0.s);
        contentValues0.put("device_linked", Boolean.valueOf(valuable0.v));
        contentValues0.put("active", Boolean.valueOf(valuable0.u));
        contentValues0.put("smart_tap_enabled", Boolean.valueOf(valuable0.F));
        contentValues0.put("valuable_hash", Long.valueOf(valuable0.h));
        contentValues0.put("local_only", Boolean.valueOf(valuable0.i));
        contentValues0.put("notifications_enabled", Boolean.valueOf(valuable0.M));
        contentValues0.put("sync_state", Integer.valueOf(valuable0.j.a()));
        gfsx gfsx0 = valuable0.N;
        if(gfsx0.i()) {
            contentValues0.put("private_pass_attachments_proto_bytes", ((hfrk)gfsx0.d()).toBytesArray());
        }
        return contentValues0;
    }

    private final Valuable m(SQLiteDatabase sQLiteDatabase0, String s, ContentValues contentValues0, eaqw eaqw0) {
        try {
            long v = -1L;
            v = sQLiteDatabase0.insertOrThrow("Valuable", null, contentValues0);
        }
        catch(SQLException unused_ex) {
        }
        if(v == -1L) {
            contentValues0.remove("smart_tap_enabled");
            contentValues0.remove("notifications_enabled");
            if(contentValues0.containsKey("proto_bytes")) {
                byte[] arr_b = contentValues0.getAsByteArray("proto_bytes");
                if(arr_b == null || arr_b.length == 0) {
                    contentValues0.remove("proto_bytes");
                }
            }
            sQLiteDatabase0.update("Valuable", contentValues0, dvjf.d, new String[]{this.i, this.j, s});
        }
        return this.c(sQLiteDatabase0, s, eaqw0);
    }
}

