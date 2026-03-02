import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class fdut implements Runnable {
    public final fdvl a;

    public fdut(fdvl fdvl0) {
        this.a = fdvl0;
    }

    @Override
    public final void run() {
        long v8;
        ArrayList arrayList0;
        SQLiteDatabase sQLiteDatabase1;
        int v4;
        fffb.f();
        fdvl fdvl0 = this.a;
        if(fffb.e(fdvl0.b)) {
            if(Log.isLoggable("DataItems", 4)) {
                Log.i("DataItems", "Running scheduled database maintenance.");
            }
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "gcDeletedDataItems: expiring deleted data items");
            }
            hzzi hzzi0 = hzzi.a;
            long v = hzzi0.i().E();
            if(v > 0L) {
                long v1 = hzzi0.i().F();
                long v2 = System.currentTimeMillis() - v;
                long v3 = hzzi0.i().D();
                String[] arr_s = {String.valueOf(v2), String.valueOf(v3)};
                try {
                    v4 = 0;
                    SQLiteDatabase sQLiteDatabase0 = fdvl0.c.getWritableDatabase();
                    do {
                        int v5 = sQLiteDatabase0.delete("dataitems", "_id IN (SELECT _id FROM dataitems WHERE deleted=1 AND timestampMs <= ? LIMIT ?)", arr_s);
                        v4 += v5;
                        if(Log.isLoggable("DataItems", 3)) {
                            Log.d("DataItems", a.f(v4, "gcDeletedDataItems: expired ", " data items"));
                        }
                        gmde.d(v1, TimeUnit.MILLISECONDS);
                    }
                    while(((long)v5) >= v3);
                    fdny.a(fdns.f);
                }
                catch(SQLiteException sQLiteException0) {
                    Log.w("DataItems", "gcDeletedDataItems: " + sQLiteException0.toString());
                    fdny.a(fdns.g);
                }
                if(Log.isLoggable("DataItems", 3) && v4 > 0) {
                    Log.d("DataItems", a.s(ffmi.b(v2), v4, "Expired ", " deleted data items from "));
                }
            }
            long v6 = System.currentTimeMillis();
            Long long0 = v6;
            fdpl fdpl0 = fdpl.a("com.google.android.gms", "38918a453d07199354f8b19af05ec6562ced5788");
            fdun fdun0 = new fdun(fdvl0.u(), "/node_sentinel");
            fdun0.e = long0.toString().getBytes();
            fdvl0.o(fdpl0, fdun0);
            try {
                sQLiteDatabase1 = fdvl0.c.getWritableDatabase();
            }
            catch(SQLiteException sQLiteException1) {
                Log.w("DataItems", "Exception in gcLostNodes", sQLiteException1);
                goto label_81;
            }
            String s = fdvl0.r.a().a;
            long v7 = hzzi.a.i().C();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "gcOldNodes: findExpiredNodes, now=" + long0 + ", expiration period=" + v7);
            }
            arrayList0 = new ArrayList();
            long0.getClass();
            try(Cursor cursor0 = sQLiteDatabase1.rawQuery("SELECT * FROM nodeinfo ORDER BY node", null)) {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    String s1 = cursor0.getString(0);
                    batl.s(s1);
                    if(!s1.equals(s) && !s1.equals("cloud")) {
                        v8 = cursor0.isNull(1) ? -1L : cursor0.getLong(1);
                        long v9 = cursor0.getLong(2);
                        if(v9 <= v6 - v7) {
                            if(Log.isLoggable("DataItems", 3)) {
                                Log.d("DataItems", "gcOldNodes: found expired node, nodeId=" + s1 + ", seqId=" + v8 + ", lastActivity=" + v9);
                            }
                            arrayList0.add(s1);
                        }
                    }
                }
                int v10 = arrayList0.size();
            }
            for(int v11 = 0; v11 < v10; ++v11) {
                fdvl0.Q(sQLiteDatabase1, ((String)arrayList0.get(v11)), true);
            }
        label_81:
            long v12 = SystemClock.elapsedRealtime();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "gcAssets: starting...");
            }
            try {
                SQLiteDatabase sQLiteDatabase2 = fdvl0.c.getWritableDatabase();
                try {
                    sQLiteDatabase2.beginTransaction();
                    fdvl0.I(sQLiteDatabase2);
                    sQLiteDatabase2.setTransactionSuccessful();
                }
                catch(Throwable throwable1) {
                    sQLiteDatabase2.endTransaction();
                    long v13 = SystemClock.elapsedRealtime();
                    if(Log.isLoggable("DataItems", 4)) {
                        Log.i("DataItems", "gcAssets: complete, took " + (v13 - v12) + "ms");
                    }
                    throw throwable1;
                }
                sQLiteDatabase2.endTransaction();
                long v14 = SystemClock.elapsedRealtime();
                if(Log.isLoggable("DataItems", 4)) {
                    Log.i("DataItems", "gcAssets: complete, took " + (v14 - v12) + "ms");
                }
                return;
            }
            catch(SQLiteException sQLiteException2) {
                goto label_101;
            }
        }
        return;
    label_101:
        Log.e("DataItems", "gcAssets: Cannot get writable DB", sQLiteException2);
    }
}

