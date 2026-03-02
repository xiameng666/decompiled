import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public final class dvjx implements glzn {
    public final dvkn a;
    public final String b;

    public dvjx(dvkn dvkn0, String s) {
        this.a = dvkn0;
        this.b = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gvdj gvdj0 = (gvdj)object0;
        String s = gvdj0.b;
        gvde gvde0 = gvdj0.c;
        String s1 = this.b;
        if(gvde0 == null) {
            gvde0 = gvde.a;
        }
        dvkn dvkn0 = this.a;
        if(gvde0.c == 4) {
            gvde gvde1 = gvdj0.c;
            if(((gvde1 == null ? gvde.a : gvde1).b & 1) != 0) {
                try {
                    dvjs dvjs0 = dvkn0.e;
                    gvde gvde2 = gvde1 == null ? gvde.a : gvde1;
                    String s2 = gvde2.c == 4 ? ((String)gvde2.d) : "";
                    if(gvde1 == null) {
                        gvde1 = gvde.a;
                    }
                    long v = hfyf.e((gvde1.e == null ? hfst.a : gvde1.e));
                    SQLiteDatabase sQLiteDatabase0 = dmhk.d(dvjs0.d).c();
                    sQLiteDatabase0.beginTransaction();
                    try {
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("vdv_cert", dvjs0.b(s2));
                        contentValues0.put("vdv_cert_expiration_time_millis", Long.valueOf(v));
                        String s3 = dvjs0.e;
                        String s4 = dvjs0.f;
                        if(((long)sQLiteDatabase0.update("VdvCertificationData", contentValues0, dvjs.b, new String[]{s3, s4, s1})) == 0L) {
                            ((ggtj)dvjs.a.i()).X("Row not found to update VdvCert.  account_id: %s environment: %s owner_id: %s", s3, s4, s1);
                        }
                        sQLiteDatabase0.setTransactionSuccessful();
                    }
                    finally {
                        sQLiteDatabase0.endTransaction();
                    }
                    gged_interceptors gged0 = gged_interceptors.l(s);
                    return glzd.g(gmbt.h(dvkn0.f.c(gged0)), new dvkj(gvdj0), dvkn0.b);
                }
                catch(dmhl | earn exception0) {
                    ((ggtj)((ggtj)dvkn.a.j()).s(exception0)).B("Failed to update certificate for valuable with ID %s", gvdj0.b);
                    return dvkn0.a(s);
                }
            }
        }
        ((ggtj)dvkn.a.j()).B("Received invalid certificate for valuable with ID %s", s);
        return dvkn0.a(s);
    }
}

