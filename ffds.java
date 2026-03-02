import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import j..util.Collection.-EL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ffds implements ffmj {
    public final ffdp a;
    public ffdr b;

    public ffds(ffdp ffdp0) {
        this.a = ffdp0;
    }

    public final int a(String s) {
        ffmn.a("ConnectionConfig", "removeConfig(%s)", new Object[]{s});
        hzya.i();
        boolean z = hzya.e();
        if(s == null) {
            s = "NULL_STRING";
        }
        fczq fczq0 = z ? this.c(s) : null;
        try {
            int v = this.a.getWritableDatabase().delete("connectionConfigurations", "name=?", new String[]{s});
            hzya.i();
            if(hzya.e()) {
                this.l(fczq0);
            }
            return v;
        }
        catch(SQLiteException sQLiteException0) {
            Log.e("ConnectionConfig", "removeConfig failed. ", sQLiteException0);
            return 0;
        }
    }

    public final ContentValues b(fczq fczq0, boolean z) {
        ContentValues contentValues0 = new ContentValues();
        String s = fczq0.b;
        String s1 = "NULL_STRING";
        if(s == null) {
            s = "NULL_STRING";
        }
        String s2 = fczq0.c;
        if(s2 != null) {
            s1 = s2;
        }
        contentValues0.put("name", s);
        contentValues0.put("pairedBtAddress", s1);
        contentValues0.put("connectionType", Integer.valueOf(fczq0.d));
        contentValues0.put("role", Integer.valueOf(fczq0.e));
        contentValues0.put("connectionEnabled", Boolean.valueOf(fczq0.f));
        String s3 = z ? fczq0.j : this.f(fczq0.b);
        if(s3 != null) {
            contentValues0.put("nodeId", s3);
        }
        String s4 = this.g(fczq0.b);
        if(s4 != null) {
            contentValues0.put("crypto", s4);
        }
        if(!TextUtils.isEmpty(fczq0.k)) {
            contentValues0.put("packageName", fczq0.k);
        }
        List list0 = fczq0.m;
        if(list0 != null && !list0.isEmpty()) {
            contentValues0.put("allowedConfigPackages", (list0.isEmpty() ? "" : TextUtils.join(",", list0)));
        }
        contentValues0.put("isMigrating", Integer.valueOf(((int)fczq0.n)));
        contentValues0.put("dataItemSyncEnabled", Integer.valueOf(((int)fczq0.o)));
        contentValues0.put("removeConnectionWhenBondRemovedByUser", Integer.valueOf(((int)fczq0.q)));
        byte[] arr_b = null;
        contentValues0.put("restrictions", (fczq0.p == null ? null : fczq0.p.toBytesArray()));
        feym feym0 = fczq0.r;
        if(feym0 != null) {
            arr_b = feym0.toBytesArray();
        }
        contentValues0.put("connectionDelayFilters", arr_b);
        contentValues0.put("maxSupportedRemoteAndroidSdkVersion", Integer.valueOf(fczq0.s));
        contentValues0.put("runtimeType", Integer.valueOf(fczq0.u));
        contentValues0.put("peerSupportsBle", Integer.valueOf(((int)fczq0.v)));
        contentValues0.put("skipConnectingIfNotBonded", Integer.valueOf(((int)fczq0.t)));
        return contentValues0;
    }

    public final fczq c(String s) {
        if(s == null) {
            s = "NULL_STRING";
        }
        Cursor cursor0 = this.a.getReadableDatabase().query("connectionConfigurations", null, "name=?", new String[]{s}, null, null, null);
        fczq fczq0 = null;
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                fczq0 = ffds.m(cursor0);
            }
            cursor0.close();
        }
        return fczq0;
    }

    public final fczq d(String s) {
        ffmn.a("ConnectionConfig", "getConfigWithAddress(%s)", new Object[]{s});
        if(s == null) {
            s = "NULL_STRING";
        }
        Cursor cursor0 = this.a.getReadableDatabase().query("connectionConfigurations", null, "pairedBtAddress=?", new String[]{s}, null, null, null);
        fczq fczq0 = null;
        if(cursor0 != null) {
            hzya.i();
            if(hzya.e()) {
                ArrayList arrayList0 = new ArrayList();
                while(cursor0.moveToNext()) {
                    arrayList0.add(ffds.m(cursor0));
                }
                fczq0 = (fczq)Collection.-EL.stream(arrayList0).filter(new ffdq()).findAny().orElse(null);
            }
            else if(cursor0.moveToFirst()) {
                fczq0 = ffds.m(cursor0);
            }
            cursor0.close();
        }
        return fczq0;
    }

    public final String f(String s) {
        if(s == null) {
            return null;
        }
        try {
            return DatabaseUtils.stringForQuery(this.a.getReadableDatabase(), "select nodeId FROM connectionConfigurations WHERE name=?", new String[]{s});
        }
        catch(SQLiteDoneException unused_ex) {
            return null;
        }
    }

    public final String g(String s) {
        if(s == null) {
            return null;
        }
        try {
            return DatabaseUtils.stringForQuery(this.a.getReadableDatabase(), "select crypto FROM connectionConfigurations WHERE name=?", new String[]{s});
        }
        catch(SQLiteDoneException unused_ex) {
            return null;
        }
    }

    public final List h() {
        if(Log.isLoggable("ConnectionConfig", 3)) {
            Log.d("ConnectionConfig", "loadConnectionConfigs");
        }
        Cursor cursor0 = this.a.getReadableDatabase().query("connectionConfigurations", null, null, null, null, null, null);
        List list0 = new ArrayList();
        while(cursor0.moveToNext()) {
            list0.add(ffds.m(cursor0));
        }
        cursor0.close();
        ffmn.a("ConnectionConfig", "got all connectionconfigs: %s", new Object[]{list0});
        return list0;
    }

    public final void i(fczq fczq0) {
        this.j(fczq0, false);
    }

    public final void j(fczq fczq0, boolean z) {
        ffmn.a("ConnectionConfig", "insertOrUpdateConfig(%s, updateNodeId=%s)", new Object[]{fczq0, Boolean.valueOf(z)});
        ContentValues contentValues0 = this.b(fczq0, z);
        try {
            this.a.getWritableDatabase().insertWithOnConflict("connectionConfigurations", null, contentValues0, 5);
            hzya.i();
            if(hzya.e()) {
                if(this.l(fczq0)) {
                    goto label_8;
                }
                return;
            }
            if(this.b != null) {
            label_8:
            }
        }
        catch(SQLiteException sQLiteException0) {
            Log.e("ConnectionConfig", "insertOrUpdateConfig failed." + sQLiteException0.getMessage());
        }
    }

    public final void k(String s, String s1) {
        ffmn.a("ConnectionConfig", "setNode(%s, %s)", new Object[]{s, s1});
        if(s == null) {
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("nodeId", s1);
        this.a.getWritableDatabase().updateWithOnConflict("connectionConfigurations", contentValues0, "name=?", new String[]{s}, 5);
    }

    public final boolean l(fczq fczq0) {
        return this.b != null && fczq0 != null && !fczq0.g();
    }

    public static final fczq m(Cursor cursor0) {
        feym feym0;
        ffaz ffaz2;
        ffaz ffaz1;
        ffaz ffaz0;
        boolean z3;
        int v3;
        String s = cursor0.getString(cursor0.getColumnIndexOrThrow("name"));
        String s1 = cursor0.getString(cursor0.getColumnIndexOrThrow("pairedBtAddress"));
        int v = cursor0.getInt(cursor0.getColumnIndexOrThrow("connectionType"));
        int v1 = cursor0.getInt(cursor0.getColumnIndexOrThrow("role"));
        int v2 = cursor0.getInt(cursor0.getColumnIndexOrThrow("connectionEnabled"));
        String s2 = cursor0.getString(cursor0.getColumnIndexOrThrow("nodeId"));
        String s3 = cursor0.getString(cursor0.getColumnIndexOrThrow("packageName"));
        String s4 = cursor0.getString(cursor0.getColumnIndexOrThrow("allowedConfigPackages"));
        List list0 = gfta.c(s4) ? new ArrayList() : Arrays.asList(s4.split(","));
        boolean z = ffds.n(cursor0, "isMigrating");
        boolean z1 = ffds.n(cursor0, "dataItemSyncEnabled");
        boolean z2 = ffds.n(cursor0, "removeConnectionWhenBondRemovedByUser");
        byte[] arr_b = cursor0.getBlob(cursor0.getColumnIndexOrThrow("restrictions"));
        if(arr_b == null) {
            v3 = v2;
            z3 = z2;
            ffaz0 = null;
        }
        else {
            try {
                v3 = v2;
                z3 = z2;
                hftc hftc0 = hftc.a();
                v3 = v2;
                z3 = z2;
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffaz.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ffaz1 = (ffaz)hftv0;
            }
            catch(hfur hfur0) {
                Log.e("ConnectionConfig", "Unable to parse NodeConnectionRestrictions from byte[]", hfur0);
                ffay ffay0 = (ffay)((ProtoLiteMessage)ffaz.a).v_newBuilder();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbk.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ffbk ffbk0 = (ffbk)hftp0.b_message;
                s3.getClass();
                ffbk0.b |= 1;
                ffbk0.c = s3;
                ffay0.k(hftp0);
                ffaz1 = (ffaz)((ProtoLiteBuilder)ffay0).N_build();
            }
            ffaz0 = ffaz1;
        }
        byte[] arr_b1 = cursor0.getBlob(cursor0.getColumnIndexOrThrow("connectionDelayFilters"));
        if(arr_b1 == null) {
            ffaz2 = ffaz0;
            feym0 = null;
        }
        else {
            try {
                ffaz2 = ffaz0;
                hftc hftc1 = hftc.a();
                ffaz2 = ffaz0;
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)feym.a), arr_b1, 0, arr_b1.length, hftc1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                feym0 = (feym)hftv1;
            }
            catch(hfur hfur1) {
                Log.e("ConnectionConfig", "Unable to parse ConnectionDelayFilters from byte[]", hfur1);
                feym0 = null;
            }
        }
        int v4 = cursor0.getInt(cursor0.getColumnIndexOrThrow("maxSupportedRemoteAndroidSdkVersion"));
        int v5 = cursor0.getInt(cursor0.getColumnIndexOrThrow("runtimeType"));
        boolean z4 = ffds.n(cursor0, "peerSupportsBle");
        boolean z5 = ffds.n(cursor0, "skipConnectingIfNotBonded");
        fczp fczp0 = fczq.a();
        boolean z6 = true;
        fczp0.a = s.equals("NULL_STRING") ? null : s;
        if(s1.equals("NULL_STRING")) {
            s1 = null;
        }
        fczp0.b = s1;
        fczp0.n(v);
        fczp0.k(v1);
        if(v3 <= 0) {
            z6 = false;
        }
        fczp0.c(z6);
        fczp0.d = s2;
        fczp0.e = s3;
        fczp0.f = list0;
        fczp0.g(z);
        fczp0.e(z1);
        fczp0.g = ffaz2;
        fczp0.j(z3);
        fczp0.h = feym0;
        fczp0.h(v4);
        fczp0.l(v5);
        fczp0.i(z4);
        fczp0.m(z5);
        return fczp0.a();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("Stored Configs in ConfigStore");
        bbpd0.b();
        for(Object object0: this.h()) {
            bbpd0.println(((fczq)object0).toString());
        }
        bbpd0.a();
        bbpd0.println("");
    }

    private static boolean n(Cursor cursor0, String s) {
        return cursor0.getInt(cursor0.getColumnIndexOrThrow(s)) > 0;
    }
}

