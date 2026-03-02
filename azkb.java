import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Range;
import j..util.Optional;
import java.util.Map.Entry;
import java.util.Map;

public final class azkb implements Runnable {
    public final azke a;
    public final azks b;
    public final int c;
    public final int d;
    public final azly e;

    public azkb(azke azke0, azks azks0, int v, int v1, azly azly0) {
        this.a = azke0;
        this.b = azks0;
        this.c = v;
        this.d = v1;
        this.e = azly0;
    }

    @Override
    public final void run() {
        gged_interceptors gged1;
        genu genu0;
        ggdy ggdy0;
        azju azju0;
        azly azly0;
        Optional optional0;
        azks azks0;
        azke azke0;
        azkb azkb0;
        azkb0 = this;
        azke0 = azkb0.a;
        SQLiteDatabase sQLiteDatabase0 = azke0.a.g().a;
        azks0 = azkb0.b;
        try(Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT last_generated_day_index FROM Reports WHERE customer_id = ? AND project_id = ? AND metric_id = ? AND report_id = ?", new String[]{Integer.toString(azks0.a.a), Integer.toString(azks0.a.b), Integer.toString(azks0.b), Integer.toString(azks0.c)})) {
            optional0 = cursor0.moveToNext() ? Optional.of(new azkr(azks0, cursor0.getInt(cursor0.getColumnIndexOrThrow("last_generated_day_index")))) : Optional.empty();
        }
        int v = azkb0.c;
        if(optional0.isEmpty()) {
            azkq azkq0 = azke0.a.g();
            ContentValues contentValues0 = new azkr(azks0, v).a();
            azkq0.a.insertWithOnConflict("Reports", null, contentValues0, 2);
            return;
        }
        if(((azkr)optional0.get()).b == v) {
            return;
        }
        int v1 = glwy.f(new int[]{((azkr)optional0.get()).b + 1, v - ((int)hrcb.a.c().a()), azkb0.d});
        while(v1 <= v) {
            azly0 = azkb0.e;
            Range range0 = Range.create(Integer.valueOf(v1 - azly0.a() + 1), Integer.valueOf(v1));
            azju0 = azke0.a;
            azjr azjr0 = azju0.c();
            ggdy0 = new ggdy();
            String s = Integer.toString(((Integer)range0.getLower()).intValue());
            String s1 = Integer.toString(((Integer)range0.getUpper()).intValue());
            try(Cursor cursor1 = azjr0.a.rawQuery("SELECT system_profile, event_vector, aggregate_value FROM AggregateStore INNER JOIN SystemProfiles USING (system_profile_hash) WHERE customer_id = ? AND project_id = ? AND metric_id = ? AND report_id = ? AND day_index >= ? AND day_index <= ? ORDER BY day_index, system_profile_hash, event_vector", new String[]{Integer.toString(azks0.a.a), Integer.toString(azks0.a.b), Integer.toString(azks0.b), Integer.toString(azks0.c), s, s1})) {
                int v2 = cursor1.getColumnIndexOrThrow("system_profile");
                int v3 = cursor1.getColumnIndexOrThrow("event_vector");
                int v4 = cursor1.getColumnIndexOrThrow("aggregate_value");
                while(true) {
                    if(!cursor1.moveToNext()) {
                        break;
                    }
                    byte[] arr_b = cursor1.getBlob(v2);
                    try {
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)genu.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        genu0 = (genu)hftv0;
                    }
                    catch(hfur hfur0) {
                        throw new azjv("Invalid SystemProfile bytes", hfur0);
                    }
                    String s2 = cursor1.getString(v3);
                    batl.s(s2);
                    ggdy0.i(new azjq(genu0, azjw.b(s2), azjw.a(cursor1.getBlob(v4))));
                    azju0 = azju0;
                }
            }
            gged_interceptors gged0 = ggdy0.h();
            azkk azkk0 = azju0.e();
            Map map0 = azly0.e.a(gged0);
            if(map0.isEmpty()) {
                Optional optional1 = Optional.of(azly0.c);
                genu genu1 = azly0.a.a(azly0.b, optional1, azly0.d, azly0.g);
                if(azly0.c(genu1)) {
                    gged_interceptors gged2 = azly0.f.b();
                    if(gged2.isEmpty()) {
                        gged1 = ggna.a;
                    }
                    else {
                        azir azir0 = (azir)((ProtoLiteMessage)azis.a).v_newBuilder();
                        gend gend0 = azly0.b(v1, genu1);
                        if(!azir0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)azir0).ensureMutable();
                        }
                        azis azis0 = (azis)azir0.b_message;
                        gend0.getClass();
                        azis0.c = gend0;
                        azis0.b |= 1;
                        azir0.a(gged2);
                        gged1 = gged_interceptors.l(((azis)((ProtoLiteBuilder)azir0).N_build()));
                    }
                }
                else {
                    gged1 = ggna.a;
                }
            }
            else {
                ggdy ggdy1 = new ggdy();
                for(Object object0: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(azly0.c(((genu)map$Entry0.getKey()))) {
                        ggeo ggeo0 = ggeo.k(((Map)map$Entry0.getValue()));
                        azir azir1 = (azir)((ProtoLiteMessage)azis.a).v_newBuilder();
                        gend gend1 = azly0.b(v1, ((genu)map$Entry0.getKey()));
                        if(!azir1.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)azir1).ensureMutable();
                        }
                        azis azis1 = (azis)azir1.b_message;
                        gend1.getClass();
                        azis1.c = gend1;
                        azis1.b |= 1;
                        azir1.a(azly0.f.a(ggeo0));
                        ggdy1.i(((azis)((ProtoLiteBuilder)azir1).N_build()));
                    }
                }
                gged1 = ggdy1.h();
            }
            for(int v5 = 0; v5 < ((ggna)gged1).c; ++v5) {
                azis azis2 = (azis)gged1.get(v5);
                SQLiteDatabase sQLiteDatabase1 = azkk0.a;
                azkl azkl0 = new azkl(0L, azis2);
                ContentValues contentValues1 = new ContentValues();
                long v6 = azkl0.a;
                if(v6 != 0L) {
                    contentValues1.put("id", Long.valueOf(v6));
                }
                contentValues1.put("unencrypted_observation_batch", azkl0.b.toBytesArray());
                sQLiteDatabase1.insert("ObservationStore", null, contentValues1);
            }
            ++v1;
            azkb0 = this;
        }
        azkq azkq1 = azke0.a.g();
        azkr azkr0 = new azkr(azks0, v);
        ContentValues contentValues2 = azkr0.a();
        azkq1.a.update("Reports", contentValues2, "customer_id = ? AND project_id = ? AND metric_id = ? AND report_id = ?", new String[]{Integer.toString(azkr0.a.a.a), Integer.toString(azkr0.a.a.b), Integer.toString(azkr0.a.b), Integer.toString(azkr0.a.c)});
    }
}

