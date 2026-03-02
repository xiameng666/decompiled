import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import j..util.Optional;
import java.util.UUID;

public final class dvke implements gfsi {
    public final dvkn a;

    public dvke(dvkn dvkn0) {
        this.a = dvkn0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s7;
        Optional optional0;
        String s3;
        guwa guwa0 = ((Valuable)object0).o.e;
        dvkn dvkn0 = this.a;
        if(guwa0 == null) {
            guwa0 = guwa.a;
        }
        guvx guvx0 = guwa0.b == 7 ? ((guvx)guwa0.c) : guvx.a;
        String s = (guvx0.b == 1 ? ((guvw)guvx0.c) : guvw.a).e;
        if(s.isEmpty()) {
            ((ggtj)dvkn.a.j()).B("Valuable with ID %s has no owner ID. Not activating.", ((Valuable)object0).b);
            return Optional.empty();
        }
        try {
            dvjs dvjs0 = dvkn0.e;
            SQLiteDatabase sQLiteDatabase0 = dmhk.d(dvjs0.d).c();
            String s1 = dvjs0.e;
            String s2 = dvjs0.f;
            try(Cursor cursor0 = sQLiteDatabase0.query("VdvCertificationData", new String[]{"sce_id_een"}, dvjs.b, new String[]{s1, s2, s}, null, null, null)) {
                if(cursor0.moveToNext()) {
                    s3 = dvjs0.a(cursor0.getBlob(cursor0.getColumnIndexOrThrow("sce_id_een")));
                }
                else {
                    ((ggtj)dvjs.a.h()).X("No matching sce_id_een entry found. account_id: %s. environment: %s. owner_id: %s.", s1, s2, s);
                    s3 = null;
                }
                if(s3 == null) {
                    goto label_31;
                }
                else {
                    ((ggtj)dvkn.a.h()).B("EEN already exists for ownerId: %s", s);
                    optional0 = Optional.of(s3);
                }
            }
        }
        catch(dmhl | earn exception0) {
            a.e(dvkn.a.j(), "Failed to read EEN from local database for ownerId: %s.", s, exception0);
            optional0 = Optional.empty();
        }
        goto label_57;
        try {
        label_31:
            String s4 = UUID.randomUUID().toString().replace("-", "");
            SQLiteDatabase sQLiteDatabase1 = dmhk.d(dvkn0.e.d).c();
            sQLiteDatabase1.beginTransaction();
            try {
                ContentValues contentValues0 = new ContentValues();
                String s5 = dvkn0.e.e;
                contentValues0.put("account_id", s5);
                String s6 = dvkn0.e.f;
                contentValues0.put("environment", s6);
                contentValues0.put("owner_id", s);
                contentValues0.put("sce_id_een", dvkn0.e.b(s4));
                if(sQLiteDatabase1.insertWithOnConflict("VdvCertificationData", null, contentValues0, 4) == -1L) {
                    s7 = s4;
                    ((ggtj)dvjs.a.i()).Y("sce_id_een is not inserted as conflicting data found.  account_id: %s environment: %s owner_id: %s sce_id_een: %s", s5, s6, s, s7);
                }
                else {
                    s7 = s4;
                }
                sQLiteDatabase1.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase1.endTransaction();
            }
            ((ggtj)dvkn.a.h()).B("New EEN created and inserted for ownerId: %s", s);
            optional0 = Optional.of(s7);
        }
        catch(dmhl | earn exception1) {
            a.e(dvkn.a.j(), "Failed to insert EEN to local database for ownerId: %s", s, exception1);
            optional0 = Optional.empty();
        }
    label_57:
        if(optional0.isEmpty()) {
            ((ggtj)dvkn.a.j()).R("Unable to get EEN for valuable with ID %s and owner ID %s. Not activating.", ((Valuable)object0).b, s);
            return Optional.empty();
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvcz.a).v_newBuilder();
        String s8 = ((Valuable)object0).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvcz gvcz0 = (gvcz)hftp0.b_message;
        s8.getClass();
        gvcz0.b = s8;
        Object object1 = optional0.get();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvcz)hftp0.b_message).c = (String)object1;
        return Optional.of(((gvcz)hftp0.N_build()));
    }
}

