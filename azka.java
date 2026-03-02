import android.content.ContentValues;
import android.database.Cursor;
import j..util.Optional;
import jeb.synthetic.TWR;

public final class azka implements Runnable {
    public final azke a;
    public final azks b;
    public final int c;
    public final azkj d;
    public final genu e;

    public azka(azke azke0, azks azks0, int v, azkj azkj0, genu genu0) {
        this.a = azke0;
        this.b = azks0;
        this.c = v;
        this.d = azkj0;
        this.e = genu0;
    }

    @Override
    public final void run() {
        Cursor cursor1;
        byte[] arr_b;
        azki azki0;
        long v6;
        long v5;
        int v1;
        azke azke0 = this.a;
        azjr azjr0 = azke0.a.c();
        ggdy ggdy0 = new ggdy();
        azks azks0 = this.b;
        int v = this.c;
        Cursor cursor0 = azjr0.a.rawQuery("SELECT id, system_profile_hash, event_vector, aggregate_value FROM AggregateStore WHERE customer_id = ? AND project_id = ? AND metric_id = ? AND report_id = ? AND day_index= ? ORDER BY id", new String[]{Integer.toString(azks0.a.a), Integer.toString(azks0.a.b), Integer.toString(azks0.b), Integer.toString(azks0.c), Integer.toString(v)});
        try {
            v1 = cursor0.getColumnIndexOrThrow("id");
            int v2 = cursor0.getColumnIndexOrThrow("system_profile_hash");
            int v3 = cursor0.getColumnIndexOrThrow("event_vector");
            int v4 = cursor0.getColumnIndexOrThrow("aggregate_value");
            while(true) {
            label_10:
                if(!cursor0.moveToNext()) {
                    goto label_37;
                }
                v5 = cursor0.getLong(v1);
                v6 = cursor0.getLong(v2);
                String s = cursor0.getString(v3);
                batl.s(s);
                azki0 = azjw.b(s);
                arr_b = cursor0.getBlob(v4);
                cursor1 = cursor0;
                break;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        try {
            azii azii0 = azjw.a(arr_b);
            azjs azjs0 = azjt.b();
            azjs0.d(v5);
            azjs0.a = azks0;
            azjs0.c(v);
            azjs0.e(v6);
            azjs0.b = azki0;
            azjs0.b(azii0);
            ggdy0.i(azjs0.a());
            v1 = v1;
            cursor0 = cursor1;
            goto label_10;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor1, throwable0);
            throw throwable0;
        }
    label_37:
        cursor0.close();
        gged_interceptors gged0 = ggdy0.h();
        Optional optional0 = this.d.a(gged0);
        if(optional0.isEmpty()) {
            return;
        }
        azju azju0 = azke0.a;
        azkt azkt0 = azju0.h();
        azku azku0 = new azku(azku.a(this.e), this.e);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("system_profile_hash", Long.valueOf(azku0.a));
        contentValues0.put("system_profile", azku0.b.toBytesArray());
        azkt0.a.insertWithOnConflict("SystemProfiles", null, contentValues0, 4);
        if(Long.compare(((azjt)optional0.get()).a, 0L) != 0) {
            azjr azjr1 = azju0.c();
            azjt azjt0 = (azjt)optional0.get();
            ContentValues contentValues1 = azjt0.a();
            azjr1.a.update("AggregateStore", contentValues1, "id = ?", new String[]{Long.toString(azjt0.a)});
            return;
        }
        azkq azkq0 = azju0.g();
        ContentValues contentValues2 = new azkr(azks0, v - 1).a();
        azkq0.a.insertWithOnConflict("Reports", null, contentValues2, 4);
        azjr azjr2 = azju0.c();
        ContentValues contentValues3 = ((azjt)optional0.get()).a();
        azjr2.a.insertWithOnConflict("AggregateStore", null, contentValues3, 2);
    }
}

