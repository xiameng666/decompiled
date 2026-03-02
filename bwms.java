import android.database.sqlite.SQLiteDatabase;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

final class bwms extends bwzp {
    public bwmx a;
    final String[] b;
    final bwmx c;

    public bwms(bwmx bwmx0, gltq gltq0, String[] arr_s) {
        this.b = arr_s;
        Objects.requireNonNull(bwmx0);
        this.c = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final void w() {
        int v4;
        String[] arr_s = this.b;
        int v = 0;
        while(v < arr_s.length) {
            String s = arr_s[v];
            bwmx bwmx0 = this.a;
            bwtc bwtc0 = bwtc.d(this.c.b);
            try {
                bwuc bwuc0 = bwmx0.l;
                if(bwuc0 == null) {
                    bwne.g("Null \'clientRegistry\', failed to unregister package: %s", s);
                }
                else if(bwuc0.f(s) == null) {
                    bwne.g("Null \'client\', failed to unregister package: %s", s);
                }
                else {
                    goto label_16;
                }
            }
            catch(NullPointerException nullPointerException0) {
                bwne.j(nullPointerException0, "Failed to unregister package: %s", new Object[]{s});
            }
            goto label_47;
            try {
            label_16:
                SQLiteDatabase sQLiteDatabase0 = bwqt.d(bwmx0.b).getWritableDatabase();
                sQLiteDatabase0.beginTransaction();
                try {
                    for(Object object0: bwqs.a(sQLiteDatabase0, s, bwtc0)) {
                        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS [" + ((bwsa)object0).e() + "]");
                    }
                    sQLiteDatabase0.delete("type_indexapi", "app_name = ?", new String[]{s});
                    sQLiteDatabase0.delete("incarnation_indexapi", "app_name = ?", new String[]{s});
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
            }
            catch(RuntimeException runtimeException0) {
                bwne.j(runtimeException0, "Failed to unregister package: %s", new Object[]{s});
                bwmx0.r.d("index_api_unregister_failed");
                bwmx0.d();
                bwtt bwtt0 = bwqt.a;
                long v2 = huax.b();
                long v3 = huax.a.g().b();
                bwne.x();
                if(hubg.a.j().Q()) {
                    if(v2 >= 0L && v2 <= 0x7FFFFFFFL) {
                        v4 = (int)v2;
                    }
                    else {
                        bwne.g("Invalid silent feedback sampling interval (%d)", Long.valueOf(v2));
                        v4 = 0;
                    }
                    if(v4 != 0) {
                        bwtt0.a(1.0f / ((float)v4), v3, TimeUnit.MILLISECONDS);
                    }
                }
            }
        label_47:
            ++v;
        }
    }
}

