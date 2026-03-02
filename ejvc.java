import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import jeb.synthetic.TWR;

public final class ejvc extends bboo {
    private static volatile ejvc a;
    private static final Object c;

    static {
        bboh.b("RemindersDatabaseHelper", bbcu.s);
        ejvc.c = new Object();
    }

    protected ejvc(Context context0) {
        super(context0, "reminders.db", "reminders.db", 42, hrvb.c());
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE account (_id INTEGER PRIMARY KEY AUTOINCREMENT,account_name TEXT NOT NULL,storage_version TEXT,sync_status TEXT,morning_customized_time INTEGER,afternoon_customized_time INTEGER,evening_customized_time INTEGER,account_state INTEGER,need_sync_snooze_preset INTEGER NOT NULL DEFAULT 1,was_last_sync_error INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase0.execSQL("CREATE TABLE reminders (_id INTEGER PRIMARY KEY AUTOINCREMENT,account_id INTEGER NOT NULL,reminder_type INTEGER NOT NULL,client_assigned_id TEXT,server_assigned_id INTEGER,client_assigned_thread_id TEXT,task_list INTEGER,title TEXT,created_time_millis INTEGER,archived_time_ms INTEGER,archived INTEGER NOT NULL DEFAULT 0,deleted INTEGER NOT NULL DEFAULT 0,pinned INTEGER NOT NULL DEFAULT 0,snoozed INTEGER NOT NULL DEFAULT 0,snoozed_time_millis INTEGER,location_snoozed_until_ms INTEGER,due_date_year INTEGER,due_date_month INTEGER,due_date_day INTEGER,due_date_hour INTEGER,due_date_minute INTEGER,due_date_second INTEGER,due_date_period INTEGER,due_date_absolute_time_ms INTEGER,due_date_date_range INTEGER,due_date_unspecified_future_time INTEGER,due_date_all_day INTEGER,due_date_millis INTEGER,event_date_year INTEGER,event_date_month INTEGER,event_date_day INTEGER,event_date_hour INTEGER,event_date_minute INTEGER,event_date_second INTEGER,event_date_period INTEGER,event_date_absolute_time_ms INTEGER,event_date_date_range INTEGER,event_date_unspecified_future_time INTEGER,event_date_all_day INTEGER,lat REAL,lng REAL,name TEXT,radius_meters INTEGER,location_type INTEGER,display_address TEXT,address_country TEXT,address_locality TEXT,address_region TEXT,address_street_address TEXT,address_street_number TEXT,address_street_name TEXT,address_postal_code TEXT,address_name TEXT,location_cell_id INTEGER,location_fprint INTEGER,location_alias_id TEXT,location_query TEXT,location_query_type INTEGER,chain_name TEXT,chain_id_cell_id INTEGER,chain_id_fprint INTEGER,category_id TEXT,display_name TEXT,recurrence_id TEXT,recurrence_master INTEGER,recurrence_exceptional INTEGER,recurrence_frequency INTEGER,recurrence_every INTEGER,recurrence_start_year INTEGER,recurrence_start_month INTEGER,recurrence_start_day INTEGER,recurrence_start_hour INTEGER,recurrence_start_minute INTEGER,recurrence_start_second INTEGER,recurrence_start_period INTEGER,recurrence_start_absolute_time_ms INTEGER,recurrence_start_date_range INTEGER,recurrence_start_unspecified_future_time INTEGER,recurrence_start_all_day INTEGER,recurrence_end_year INTEGER,recurrence_end_month INTEGER,recurrence_end_day INTEGER,recurrence_end_hour INTEGER,recurrence_end_minute INTEGER,recurrence_end_second INTEGER,recurrence_end_period INTEGER,recurrence_end_absolute_time_ms INTEGER,recurrence_end_num_occurrences INTEGER,recurrence_end_auto_renew INTEGER,recurrence_end_date_range INTEGER,recurrence_end_unspecified_future_time INTEGER,recurrence_end_all_day INTEGER,recurrence_end_auto_renew_until_year INTEGER,recurrence_end_auto_renew_until_month INTEGER,recurrence_end_auto_renew_until_day INTEGER,recurrence_end_auto_renew_until_hour INTEGER,recurrence_end_auto_renew_until_minute INTEGER,recurrence_end_auto_renew_until_second INTEGER,recurrence_end_auto_renew_until_period INTEGER,recurrence_end_auto_renew_until_absolute_time_ms INTEGER,recurrence_end_auto_renew_until_date_range INTEGER,recurrence_end_auto_renew_until_unspecified_future_time INTEGER,recurrence_end_auto_renew_until_all_day INTEGER,daily_pattern_hour INTEGER,daily_pattern_minute INTEGER,daily_pattern_second INTEGER,daily_pattern_period INTEGER,daily_pattern_all_day INTEGER,weekly_pattern_weekday TEXT,monthly_pattern_month_day TEXT,monthly_pattern_week_day INTEGER,monthly_pattern_week_day_number INTEGER,yearly_pattern_year_month TEXT,yearly_pattern_monthly_pattern_month_day TEXT,yearly_pattern_monthly_pattern_week_day INTEGER,yearly_pattern_monthly_pattern_week_day_number INTEGER,experiment INTEGER,assistance BLOB,extensions BLOB,link_application INTEGER,link_id TEXT,fired_time_millis INTEGER,dirty_sync_bit INTEGER NOT NULL DEFAULT 0,place_types TEXT);");
        sQLiteDatabase0.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY AUTOINCREMENT,state INTEGER NOT NULL DEFAULT 0,trigger_time INTEGER,create_time INTEGER,schedule_time INTEGER,fire_time INTEGER,snooze_time INTEGER,dismiss_time INTEGER);");
        sQLiteDatabase0.execSQL("CREATE TABLE operation (_id INTEGER PRIMARY KEY AUTOINCREMENT,account_id INTEGER NOT NULL,operation_api INTEGER NOT NULL,operation_request BLOB,error_count INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase0.execSQL("CREATE TABLE place_alias (_id INTEGER PRIMARY KEY AUTOINCREMENT,account_id INTEGER NOT NULL,alias_id INTEGER,alias_name TEXT NOT NULL,place_id TEXT NOT NULL);");
        ejvc.e(sQLiteDatabase0, "reminders", "account_id");
        ejvc.e(sQLiteDatabase0, "reminders", "reminder_type");
        ejvc.e(sQLiteDatabase0, "reminders", "due_date_millis");
        ejvc.e(sQLiteDatabase0, "reminders", "client_assigned_id");
        ejvc.e(sQLiteDatabase0, "reminders", "task_list");
        ejvc.e(sQLiteDatabase0, "reminders", "created_time_millis");
        ejvc.e(sQLiteDatabase0, "reminders", "archived");
        ejvc.e(sQLiteDatabase0, "reminders", "deleted");
        ejvc.e(sQLiteDatabase0, "reminders", "recurrence_id");
        ejvc.e(sQLiteDatabase0, "reminders", "recurrence_master");
        ejvc.e(sQLiteDatabase0, "reminders", "recurrence_exceptional");
        ejvc.e(sQLiteDatabase0, "notification", "state");
        ejvc.e(sQLiteDatabase0, "operation", "account_id");
        ejvc.g(sQLiteDatabase0);
        ejvc.f(sQLiteDatabase0);
    }

    public static ejvc c(Context context0) {
        if(ejvc.a == null) {
            Object object0 = ejvc.c;
            synchronized(object0) {
                if(ejvc.a == null) {
                    ejvc.a = new ejvc(context0);
                }
            }
            return ejvc.a;
        }
        return ejvc.a;
    }

    private static final boolean d(SQLiteDatabase sQLiteDatabase0, String s, String s1) {
        try(Cursor cursor0 = sQLiteDatabase0.rawQuery(a.a(s, "SELECT * FROM ", " LIMIT 0"), null)) {
            return cursor0.getColumnIndex(s1) >= 0;
        }
        return true;
    }

    private static final void e(SQLiteDatabase sQLiteDatabase0, String s, String s1) {
        String s2 = a.V(s1, s, "_", "_index");
        sQLiteDatabase0.execSQL("DROP INDEX IF EXISTS " + s2);
        sQLiteDatabase0.execSQL(a.ak(s1, s, new StringBuilder(), s2, "CREATE INDEX ", " ON ", " (", ");"));
    }

    private static final void f(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("DROP TRIGGER IF EXISTS notification_update_fire_trigger;");
        sQLiteDatabase0.execSQL("CREATE TRIGGER notification_update_fire_trigger AFTER UPDATE  ON reminders BEGIN  UPDATE notification SET state = 0 WHERE (_id =  NEW._id AND state = 2 AND NEW. pinned != 1) ;END");
    }

    private static final void g(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("DROP TRIGGER IF EXISTS notification_create_trigger;");
        sQLiteDatabase0.execSQL("CREATE TRIGGER notification_create_trigger AFTER INSERT  ON reminders BEGIN  INSERT INTO notification ( _id) VALUES ( NEW._id); END");
        sQLiteDatabase0.execSQL("DROP TRIGGER IF EXISTS notification_delete_trigger;");
        sQLiteDatabase0.execSQL("CREATE TRIGGER notification_delete_trigger AFTER DELETE  ON reminders BEGIN  DELETE FROM notification WHERE _id =  OLD._id; END");
    }

    private static final void h(SQLiteDatabase sQLiteDatabase0, String s, String s1) {
        sQLiteDatabase0.execSQL("DROP INDEX IF EXISTS " + a.V(s1, s, "_", "_index"));
    }

    private static final void i(SQLiteDatabase sQLiteDatabase0) {
        Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT name FROM sqlite_master  WHERE type IN (\'table\',\'view\') AND name NOT LIKE \'sqlite_%\'  UNION ALL  SELECT name FROM sqlite_temp_master  WHERE type IN (\'table\',\'view\')  ORDER BY 1 ", null);
        if(cursor0 != null) {
            while(true) {
                try {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS " + cursor0.getString(0));
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            }
            cursor0.close();
        }
    }

    @Override  // bboo
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        ejvc.i(sQLiteDatabase0);
        this.onCreate(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        int v2 = v;
        if(v2 < 28) {
            ejvc.i(sQLiteDatabase0);
            this.onCreate(sQLiteDatabase0);
            return;
        }
        if(v2 == 28) {
            sQLiteDatabase0.execSQL("ALTER TABLE account ADD COLUMN morning_customized_time INTEGER");
            sQLiteDatabase0.execSQL("ALTER TABLE account ADD COLUMN afternoon_customized_time INTEGER");
            sQLiteDatabase0.execSQL("ALTER TABLE account ADD COLUMN evening_customized_time INTEGER");
            v2 = 29;
        }
        if(v2 == 29) {
            if(!ejvc.d(sQLiteDatabase0, "reminders", "link_application")) {
                sQLiteDatabase0.execSQL("ALTER TABLE reminders ADD COLUMN link_application INTEGER");
                sQLiteDatabase0.execSQL("ALTER TABLE reminders ADD COLUMN link_id TEXT");
            }
            if(!ejvc.d(sQLiteDatabase0, "account", "account_state")) {
                sQLiteDatabase0.execSQL("ALTER TABLE account ADD COLUMN account_state INTEGER");
            }
            v2 = 30;
        }
        if(v2 == 30) {
            sQLiteDatabase0.execSQL("ALTER TABLE account ADD COLUMN need_sync_snooze_preset INTEGER NOT NULL DEFAULT 1");
            v2 = 0x1F;
        }
        if(v2 == 0x1F) {
            Cursor cursor0 = sQLiteDatabase0.query("account", new String[]{"_id", "morning_customized_time", "afternoon_customized_time", "evening_customized_time"}, null, null, null, null, null);
            if(cursor0 != null) {
                while(true) {
                    try {
                    label_23:
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        long v3 = cursor0.getLong(0);
                        ContentValues contentValues0 = new ContentValues();
                        if(cursor0.isNull(1)) {
                            contentValues0.put("morning_customized_time", Long.valueOf(hxsx.e() * 3600000L));
                        }
                        if(cursor0.isNull(2)) {
                            contentValues0.put("afternoon_customized_time", Long.valueOf(hxsx.c() * 3600000L));
                        }
                        if(cursor0.isNull(3)) {
                            contentValues0.put("evening_customized_time", Long.valueOf(hxsx.d() * 3600000L));
                        }
                        if(contentValues0.size() <= 0) {
                            goto label_23;
                        }
                        sQLiteDatabase0.update("account", contentValues0, "_id=?", new String[]{String.valueOf(v3)});
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(cursor0, throwable0);
                        throw throwable0;
                    }
                }
                cursor0.close();
            }
            v2 = 0x20;
        }
        if(v2 == 0x20) {
            sQLiteDatabase0.execSQL("ALTER TABLE reminders ADD COLUMN fired_time_millis INTEGER");
            v2 = 33;
        }
        if(v2 == 33) {
            sQLiteDatabase0.execSQL("CREATE TABLE place_alias (_id INTEGER PRIMARY KEY AUTOINCREMENT,account_id INTEGER NOT NULL,alias_id INTEGER,alias_name TEXT NOT NULL,place_id TEXT NOT NULL);");
            v2 = 34;
        }
        if(v2 == 34) {
            ejvc.f(sQLiteDatabase0);
            v2 = 35;
        }
        if(v2 == 35) {
            ejvc.h(sQLiteDatabase0, "reminders", "server_assigned_id");
            v2 = 36;
        }
        if(v2 == 36) {
            ejvc.h(sQLiteDatabase0, "notification", "is_stale");
            sQLiteDatabase0.execSQL("DROP TRIGGER IF EXISTS notification_update_trigger;");
            ejvc.g(sQLiteDatabase0);
            v2 = 37;
        }
        if(v2 == 37) {
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS package");
            v2 = 38;
        }
        if(v2 == 38) {
            sQLiteDatabase0.execSQL("ALTER TABLE reminders ADD COLUMN dirty_sync_bit INTEGER");
            v2 = 39;
        }
        if(v2 == 39) {
            sQLiteDatabase0.execSQL("ALTER TABLE account ADD COLUMN was_last_sync_error INTEGER NOT NULL DEFAULT 0");
            v2 = 40;
        }
        if(v2 == 40) {
            if(!ejvc.d(sQLiteDatabase0, "reminders", "place_types")) {
                sQLiteDatabase0.execSQL("ALTER TABLE reminders ADD COLUMN place_types TEXT");
            }
            v2 = 41;
        }
        if(v2 == 41) {
            sQLiteDatabase0.execSQL("ALTER TABLE account ADD COLUMN sync_status BLOB");
            v2 = 42;
        }
        if(v2 == v1) {
            return;
        }
        throw new IllegalStateException("Fail to upgrade database to version" + v1);
    }
}

