import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.google.android.gms.pay.BlockClosedLoopCardsRequest;
import com.google.android.gms.pay.PassFilter;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import jeb.synthetic.TWR;

public final class dvin {
    private static final bboh a;
    private final dvim b;
    private final dvjf c;
    private final etgl d;
    private final azts e;

    static {
        dvin.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvin(etgl etgl0, azts azts0, dvim dvim0, dvjf dvjf0) {
        this.d = etgl0;
        this.e = azts0;
        this.b = dvim0;
        this.c = dvjf0;
    }

    public final gfsx a() {
        String s;
        try {
            Cursor cursor0 = dmhk.d(this.b.c).c().query("SmartTapOverride", new String[]{"valuable_id", "expiration_time_millis"}, dvim.b, new String[]{this.b.d, this.b.e}, null, null, null);
            try {
                if(cursor0.moveToNext()) {
                    s = cursor0.getString(cursor0.getColumnIndexOrThrow("valuable_id"));
                    if(cursor0.getLong(cursor0.getColumnIndexOrThrow("expiration_time_millis")) <= SystemClock.elapsedRealtime()) {
                        goto label_8;
                    }
                }
                else {
                    goto label_10;
                }
                goto label_11;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        label_8:
            s = null;
            goto label_11;
        label_10:
            s = null;
        label_11:
            cursor0.close();
            return gfsx.l(s);
        }
        catch(dmhl dmhl0) {
            a.ae(dvin.a.i(), "Failed to fetch current smart tap valuable override.", dmhl0);
            return gfqx.a;
        }
    }

    public final boolean b() {
        this.d.dn();
        int v = hagt.cy.a();
        this.e.bF(v);
        try {
            SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.b.c).c();
            sQLiteDatabase0.beginTransaction();
            try {
                this.b.a(sQLiteDatabase0);
                sQLiteDatabase0.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                sQLiteDatabase0.endTransaction();
                throw throwable0;
            }
            sQLiteDatabase0.endTransaction();
            return DatabaseUtils.queryNumEntries(sQLiteDatabase0, "SmartTapOverride") == 0L;
        }
        catch(dmhl dmhl0) {
            a.ae(dvin.a.i(), "Failed to clear the smart tap valuable override.", dmhl0);
            return false;
        }
    }

    public final boolean c(String s, int v) {
        long v3;
        try {
            PassFilter passFilter0 = new PassFilter();
            passFilter0.c = dsih.a(new String[]{s});
            gged_interceptors gged0 = (gged_interceptors)this.c.a(passFilter0).first;
            gfsx gfsx0 = gged0.size() == 1 ? gfsx.m(((Valuable)gged0.get(0))) : gfqx.a;
            if(gfsx0.i()) {
                Object object0 = gfsx0.d();
                hfuh hfuh0 = new hfuh(((Valuable)object0).p().d, guvp.a);
                if(((Valuable)object0).o.l || hfuh0.contains(guvo.b)) {
                    this.d.da(((long)v));
                }
                if(hfuh0.contains(guvo.c)) {
                    BlockClosedLoopCardsRequest blockClosedLoopCardsRequest0 = new BlockClosedLoopCardsRequest();
                    blockClosedLoopCardsRequest0.a = (long)v;
                    blockClosedLoopCardsRequest0.b = hagt.cx.a();
                    this.e.cm(blockClosedLoopCardsRequest0);
                }
            }
            else {
                ((ggtj)dvin.a.j()).x("Valuable not present in the datastore.");
            }
        }
        catch(eaqz | dmhl | earn exception0) {
            a.ae(dvin.a.i(), "Failed to decrypt valuable from the datastore.", exception0);
        }
        try {
            long v1 = SystemClock.elapsedRealtime() + ((long)v);
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("account_id", this.b.d);
            contentValues0.put("environment", this.b.e);
            contentValues0.put("valuable_id", s);
            contentValues0.put("expiration_time_millis", Long.valueOf(v1));
            SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.b.c).c();
            sQLiteDatabase0.beginTransaction();
            try {
                this.b.a(sQLiteDatabase0);
                v3 = ((long)v) <= 0L ? 0L : sQLiteDatabase0.insert("SmartTapOverride", null, contentValues0);
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
            return v3 != -1L;
        }
        catch(dmhl dmhl0) {
            a.e(dvin.a.i(), "Failed to set the smart tap valuable override for valuable ID %s", s, dmhl0);
            return false;
        }
    }
}

