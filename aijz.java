import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.gms.auth.authzen.Permit;
import com.google.android.gms.auth.authzen.PermitAccess;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class aijz {
    public final aijx a;
    public static final baun b;

    static {
        aijz.b = new baun(new String[]{"PermitStore"});
    }

    public aijz(Context context0) {
        aijx aijx0 = aijx.b(context0);
        super();
        this.a = aijx0;
    }

    public static Permit a(SQLiteDatabase sQLiteDatabase0, Cursor cursor0) {
        PermitAccess permitAccess1;
        Cursor cursor1;
        aihn aihn0;
        PermitAccess permitAccess0;
        SQLiteDatabase sQLiteDatabase1;
        String s;
        try {
            s = ajcq.b(cursor0, "id");
        }
        catch(IllegalArgumentException unused_ex) {
            sQLiteDatabase1 = sQLiteDatabase0;
            s = null;
            goto label_75;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            String s1 = ajcq.b(cursor0, "license__id");
            String s2 = ajcq.b(cursor0, "license__type");
            byte[] arr_b = ajcq.h(cursor0, "license__data");
            String s3 = ajcq.b(cursor0, "license__name");
            boolean z = ajcq.g(cursor0, "license__is_unlockable");
            boolean z1 = ajcq.g(cursor0, "license__is_unlock_key");
            boolean z2 = ajcq.g(cursor0, "license__is_mobile_hotspot_supported");
            String s4 = ajcq.b(cursor0, "license__bt_mac_address");
            String s5 = ajcq.b(cursor0, "license__device_type");
            aiho.a(aijv.a(ajcq.h(cursor0, "license__beacon_seeds")), arrayList0);
            permitAccess0 = new PermitAccess(4, s1, s2, arr_b, s3, z, z1, z2, s4, s5, arrayList0, 0L, ajcq.g(cursor0, "license__is_pixel_phone"), ajcq.g(cursor0, "license__is_arc_plus_plus"));
            goto label_27;
        }
        catch(NullPointerException unused_ex) {
        }
        catch(IllegalArgumentException unused_ex) {
            goto label_21;
        }
        catch(IOException unused_ex) {
            goto label_24;
        }
        try {
            sQLiteDatabase1 = sQLiteDatabase0;
            aijz.d(sQLiteDatabase1, s);
            throw new aijy("Error when creating permit from Cursor.");
        label_21:
            sQLiteDatabase1 = sQLiteDatabase0;
            aijz.d(sQLiteDatabase1, s);
            throw new aijy("Error when creating permit from Cursor.");
        label_24:
            sQLiteDatabase1 = sQLiteDatabase0;
            aijz.d(sQLiteDatabase1, s);
            throw new aijy("Error when creating permit from Cursor: IOException deserializing BeaconSeeds.");
        }
        catch(IllegalArgumentException unused_ex) {
            goto label_75;
        }
        try {
        label_27:
            aihn0 = new aihn();
            aihn0.a = ajcq.b(cursor0, "id");
            aihn0.b = ajcq.b(cursor0, "account_id");
            aihn0.c = ajcq.b(cursor0, "type");
            aihn0.d = permitAccess0;
            goto label_39;
        }
        catch(NullPointerException unused_ex) {
        }
        catch(IllegalArgumentException unused_ex) {
            goto label_36;
        }
        try {
            sQLiteDatabase1 = sQLiteDatabase0;
            aijz.d(sQLiteDatabase1, s);
            throw new aijy("Error when creating permit from Cursor.");
        label_36:
            sQLiteDatabase1 = sQLiteDatabase0;
            aijz.d(sQLiteDatabase1, s);
            throw new aijy("Error when creating permit from Cursor.");
        }
        catch(IllegalArgumentException unused_ex) {
            goto label_75;
        }
        try {
        label_39:
            String s6 = ajcq.b(cursor0, "allowed_channels");
            if(s6 != null) {
                String[] arr_s = TextUtils.split(s6, ",");
                for(int v = 0; v < arr_s.length; ++v) {
                    aihn0.a(arr_s[v]);
                }
            }
            sQLiteDatabase1 = sQLiteDatabase0;
            goto label_51;
        }
        catch(IllegalArgumentException unused_ex) {
            try {
                sQLiteDatabase1 = sQLiteDatabase0;
                goto label_75;
            label_51:
                cursor1 = sQLiteDatabase1.query("permit__requester_access", null, "permit_id=?", new String[]{s}, null, null, "last_update_time DESC");
                if(!cursor1.moveToFirst()) {
                    cursor1.close();
                    return new Permit(aihn0);
                }
            label_53:
                while(cursor1.isAfterLast()) {
                    cursor1.close();
                    return new Permit(aihn0);
                }
            }
            catch(IllegalArgumentException unused_ex) {
                goto label_75;
            }
        }
        try {
            ArrayList arrayList1 = new ArrayList();
            String s7 = ajcq.b(cursor1, "id");
            String s8 = ajcq.b(cursor1, "type");
            byte[] arr_b1 = ajcq.h(cursor1, "data");
            String s9 = ajcq.b(cursor1, "name");
            boolean z3 = ajcq.g(cursor1, "is_unlockable");
            boolean z4 = ajcq.g(cursor1, "is_unlock_key");
            boolean z5 = ajcq.g(cursor1, "is_mobile_hotspot_supported");
            String s10 = ajcq.b(cursor1, "bt_mac_address");
            String s11 = ajcq.b(cursor1, "device_type");
            aiho.a(aijv.a(ajcq.h(cursor1, "beacon_seeds")), arrayList1);
            permitAccess1 = new PermitAccess(4, s7, s8, arr_b1, s9, z3, z4, z5, s10, s11, arrayList1, ((long)ajcq.a(cursor1, "last_update_time")), ajcq.g(cursor1, "is_pixel_phone"), ajcq.g(cursor1, "is_arc_plus_plus"));
            goto label_72;
        }
        catch(NullPointerException unused_ex) {
        }
        catch(IllegalArgumentException unused_ex) {
            throw new aijy("Error when creating permit requester access from Cursor.");
        }
        catch(IOException unused_ex) {
            throw new aijy("Error when creating permit requester access from Cursor: IOException deserializing BeaconSeeds.");
        }
        try {
            throw new aijy("Error when creating permit requester access from Cursor.");
        label_72:
            aihn0.b(permitAccess1);
            cursor1.moveToNext();
            goto label_53;
        }
        catch(IllegalArgumentException unused_ex) {
        label_75:
            if(s != null) {
                aijz.d(sQLiteDatabase1, s);
            }
            throw new aijy("Got invalid permit from database.");
        }
    }

    public final List b(String s) {
        List list0;
        SQLiteDatabase sQLiteDatabase0 = this.a.a();
        try(Cursor cursor0 = sQLiteDatabase0.query("permit", null, "account_id=?", new String[]{s}, null, null, null)) {
            if(!cursor0.moveToFirst()) {
                return new ArrayList();
            }
            list0 = new ArrayList();
            while(true) {
                if(cursor0.isAfterLast()) {
                    break;
                }
                ((ArrayList)list0).add(aijz.a(sQLiteDatabase0, cursor0));
                cursor0.moveToNext();
            }
        }
        return list0;
    }

    public final boolean c(String s) {
        try {
            if(!this.b(s).isEmpty()) {
                return true;
            }
        }
        catch(aijy aijy0) {
            aijz.b.g("Error when trying to get all permits from database.", aijy0, new Object[0]);
        }
        return false;
    }

    public static void d(SQLiteDatabase sQLiteDatabase0, String s) {
        sQLiteDatabase0.beginTransaction();
        try {
            sQLiteDatabase0.delete("permit", "id=?", new String[]{s});
            sQLiteDatabase0.delete("permit__requester_access", "permit_id=?", new String[]{s});
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }
}

