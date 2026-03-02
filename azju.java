import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.function.Supplier;

public final class azju extends bboo {
    private static final bboh a;

    static {
        azju.a = bboh.b("CobaltLoggerImpl", bbcu.fZ);
    }

    public azju(Context context0) {
        super(context0, "cobalt_db", (hrcf.d() ? 3 : 2));
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `Projects` (`customer_id` INTEGER NOT NULL, `project_id` INTEGER NOT NULL, `initial_enabled_time` INTEGER, `start_disabled_time` INTEGER, PRIMARY KEY(`customer_id`, `project_id`))");
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `Reports` (`customer_id` INTEGER NOT NULL, `project_id` INTEGER NOT NULL, `metric_id` INTEGER NOT NULL, `report_id` INTEGER NOT NULL, `last_generated_day_index` INTEGER NOT NULL, PRIMARY KEY(`customer_id`, `project_id`, `metric_id`, `report_id`), FOREIGN KEY(`customer_id`, `project_id`) REFERENCES `Projects`(`customer_id`, `project_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `SystemProfiles` (`system_profile_hash` INTEGER NOT NULL, `system_profile` BLOB NOT NULL, PRIMARY KEY(`system_profile_hash`))");
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `AggregateStore` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `customer_id` INTEGER NOT NULL, `project_id` INTEGER NOT NULL, `metric_id` INTEGER NOT NULL, `report_id` INTEGER NOT NULL, `day_index` INTEGER NOT NULL, `system_profile_hash` INTEGER NOT NULL, `event_vector` TEXT NOT NULL, `aggregate_value` BLOB NOT NULL, FOREIGN KEY(`customer_id`, `project_id`, `metric_id`, `report_id`) REFERENCES `Reports`(`customer_id`, `project_id`, `metric_id`, `report_id`) ON UPDATE NO ACTION ON DELETE CASCADE, FOREIGN KEY(`system_profile_hash`) REFERENCES `SystemProfiles`(`system_profile_hash`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `ObservationStore` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `unencrypted_observation_batch` BLOB NOT NULL)");
        if(hrcf.d()) {
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `CookieBucketSeed` (`seed` INTEGER NOT NULL, `last_updated_time` INTEGER NOT NULL)");
        }
        sQLiteDatabase0.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_AggregateStore_customer_id_project_id_metric_id_report_id_day_index_system_profile_hash_event_vector` ON `AggregateStore` (`customer_id`, `project_id`, `metric_id`, `report_id`, `day_index`, `system_profile_hash`, `event_vector`)");
        sQLiteDatabase0.execSQL("CREATE INDEX IF NOT EXISTS `index_AggregateStore_system_profile_hash` ON `AggregateStore` (`system_profile_hash`)");
    }

    public final azjr c() {
        return new azjr(this.getWritableDatabase());
    }

    final azjx d() {
        return new azjx(this.getWritableDatabase());
    }

    public final azkk e() {
        return new azkk(this.getWritableDatabase());
    }

    final azkn f() {
        return new azkn(this.getWritableDatabase());
    }

    public final azkq g() {
        return new azkq(this.getWritableDatabase());
    }

    public final azkt h() {
        return new azkt(this.getWritableDatabase());
    }

    public final Object i(Supplier supplier0) {
        Object object0;
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        sQLiteDatabase0.beginTransaction();
        try {
            object0 = supplier0.get();
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        return object0;
    }

    public final void j(Runnable runnable0) {
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        sQLiteDatabase0.beginTransaction();
        try {
            runnable0.run();
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    private final void n(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.setTransactionSuccessful();
        sQLiteDatabase0.endTransaction();
        sQLiteDatabase0.setForeignKeyConstraintsEnabled(false);
        sQLiteDatabase0.beginTransaction();
        try {
            bbnj.b(sQLiteDatabase0);
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
            sQLiteDatabase0.setForeignKeyConstraintsEnabled(true);
            sQLiteDatabase0.beginTransaction();
        }
        this.a(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.setForeignKeyConstraintsEnabled(true);
        sQLiteDatabase0.enableWriteAheadLogging();
        sQLiteDatabase0.execSQL("PRAGMA synchronous = NORMAL");
    }

    @Override  // bboo
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        bboh bboh0 = azju.a;
        ((ggtj)bboh0.j()).F("Version downgrade, old: %d, new: %d", v, v1);
        if(v == 3 && v1 == 2) {
            ((ggtj)bboh0.j()).x("Downgrading database from v3 to v2. Doing nothing.");
            return;
        }
        this.n(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        bboh bboh0 = azju.a;
        ((ggtj)bboh0.j()).F("Version upgrade, old: %d, new: %d", v, v1);
        while(v < v1) {
            if(v < 2) {
                this.n(sQLiteDatabase0);
            }
            else {
                if(v == 2) {
                    ((ggtj)bboh0.h()).x("Upgrading database from v2 to v3, adding CookieBucketSeedTable.");
                    sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `CookieBucketSeed` (`seed` INTEGER NOT NULL, `last_updated_time` INTEGER NOT NULL)");
                }
                ((ggtj)bboh0.j()).z("Upgrade from version %d is not supported.", v);
            }
            ++v;
        }
    }
}

