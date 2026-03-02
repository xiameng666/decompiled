import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

final class fdvd implements ffmj {
    public final ConcurrentHashMap a;
    public final fdxm b;
    final fdvl c;
    private final Object d;
    private boolean e;

    public fdvd(fdvl fdvl0, fdxm fdxm0) {
        Objects.requireNonNull(fdvl0);
        this.c = fdvl0;
        super();
        this.d = new Object();
        this.e = false;
        this.a = new ConcurrentHashMap();
        this.b = fdxm0;
    }

    final String a(String s) {
        this.c();
        fdvc fdvc0 = (fdvc)this.a.get(s);
        return fdvc0 == null ? null : fdvc0.a;
    }

    final void b(String s) {
        if(Log.isLoggable("DataItems", 4)) {
            Log.i("DataItems", String.format("[migr-trkr] clearNodeMigratingFrom(%s)", s));
        }
        batl.s(s);
        this.c();
        this.d(this.b.getWritableDatabase(), s, null);
        this.a.remove(s);
        this.c.o.a(s);
    }

    public final void c() {
        Object object0;
        if(!this.e) {
            object0 = this.d;
            synchronized(object0) {
                if(!this.e) {
                    if(Log.isLoggable("DataItems", 3)) {
                        Log.d("DataItems", "[migr-trkr] Initializing...");
                    }
                    try {
                        SQLiteDatabase sQLiteDatabase0 = this.b.getReadableDatabase();
                        try(Cursor cursor0 = sQLiteDatabase0.query("nodeinfo", new String[]{"node", "migratingFrom"}, null, null, null, null, null)) {
                        alab1:
                            while(true) {
                                while(true) {
                                    if(!cursor0.moveToNext()) {
                                        break alab1;
                                    }
                                    String s = cursor0.getString(0);
                                    batl.s(s);
                                    String s1 = cursor0.getString(1);
                                    if(Log.isLoggable("DataItems", 2)) {
                                        Log.v("DataItems", a.l(s1, s, "[migr-trkr] Checking node ", ", from "));
                                    }
                                    if(s1 == null) {
                                        break;
                                    }
                                    fdvc fdvc0 = new fdvc(this, s1, fdvd.f(sQLiteDatabase0, s));
                                    this.a.put(s, fdvc0);
                                }
                            }
                        }
                    }
                    catch(SQLiteException sQLiteException0) {
                        if(!Log.isLoggable("DataItems", 6)) {
                            this.e = true;
                            return;
                        }
                        Log.e("DataItems", "[migr-trkr] Couldn\'t read node migration info from nodeinfo!", sQLiteException0);
                    }
                    this.e = true;
                }
            }
        }
    }

    public final void d(SQLiteDatabase sQLiteDatabase0, String s, String s1) {
        sQLiteDatabase0.beginTransaction();
        try {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("migratingFrom", s1);
            boolean z = this.c.aa(sQLiteDatabase0, s, contentValues0);
            if(z || s1 != null) {
                sQLiteDatabase0.setTransactionSuccessful();
                if(Log.isLoggable("DataItems", 4)) {
                    Log.i("DataItems", String.format("[migr-trkr] %s node migrating info: %s from %s", (z ? "Updated" : "Inserted"), s, s1));
                }
            }
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    public static final boolean f(SQLiteDatabase sQLiteDatabase0, String s) {
        String s1;
        boolean z;
        try(Cursor cursor0 = fdvl.ak(sQLiteDatabase0, fdpl.a("com.google.android.gms", "38918a453d07199354f8b19af05ec6562ced5788"), s, "/setup/sync_marker/" + s, false, null, false)) {
            z = cursor0.getCount() > 0;
            if(Log.isLoggable("DataItems", 2)) {
                s1 = z ? " complete at " : " incomplete at ";
                Log.v("DataItems", "[migr-trkr] Node " + s + s1 + ("/setup/sync_marker/" + s));
            }
        }
        return z;
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.printf("NodeMigrationTracker(initialized: %b)", new Object[]{Boolean.valueOf(this.e)});
        ConcurrentHashMap concurrentHashMap0 = this.a;
        if(concurrentHashMap0.isEmpty()) {
            bbpd0.print(" - no migrating nodes\n");
            return;
        }
        bbpd0.print("\nMigrating nodes:\n");
        bbpd0.b();
        for(Object object0: concurrentHashMap0.entrySet()) {
            fdvc fdvc0 = (fdvc)((Map.Entry)object0).getValue();
            bbpd0.printf("%s from %s (xfer complete: %b)\n", new Object[]{((Map.Entry)object0).getKey(), fdvc0.a, Boolean.valueOf(fdvc0.b)});
        }
        bbpd0.a();
    }
}

