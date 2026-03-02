import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.util.TimingLogger;
import j..util.Objects;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class fdvg extends fdvf {
    boolean f;
    final fdvl g;

    public fdvg(fdvl fdvl0, fduq fduq0, boolean z, String s) {
        Objects.requireNonNull(fdvl0);
        this.g = fdvl0;
        batl.s(fduq0);
        super(fdvl0, fduq0, z, s, fdvl0.j);
        this.f = false;
    }

    @Override  // fdvf
    public final fduq f(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0) {
        boolean z3;
        String s2;
        String s = this.c;
        batl.s(s);
        fduq fduq0 = this.a;
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", String.format("recordArchivedDataItem: %s :: %s", s, fduq0));
        }
        fdvl fdvl0 = this.g;
        fdvl0.U(sQLiteDatabase0, fduq0);
        long v = fdvl.ae(sQLiteDatabase0, fduq0.a);
        String s1 = fduq0.b.b;
        if(Log.isLoggable("DataItems", 2)) {
            Log.v("DataItems", String.format("deleteArchiveDataItem(%s, %d, %s)", s, v, s1));
        }
        try(Cursor cursor0 = sQLiteDatabase0.query("archiveDataItems", new String[]{"_id"}, "migratingNode = ? AND appkeys_id = ? AND path = ?", new String[]{s, Long.toString(v), s1}, null, null, null, null)) {
            if(cursor0.moveToNext()) {
                s2 = Long.toString(cursor0.getLong(0));
                goto label_26;
            }
            else if(Log.isLoggable("DataItems", 2)) {
                Log.v("DataItems", "No archived data item to delete");
            }
        }
        goto label_32;
    label_26:
        int v1 = sQLiteDatabase0.delete("archiveAssetRefs", "archiveDataItems_id=?", new String[]{s2});
        sQLiteDatabase0.delete("archiveDataItems", "_id=?", new String[]{s2});
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", String.format("Deleted archived data item and %d assets", v1));
        }
        if(v1 + 1 != 0) {
            ffmn.f("DataItems", "Unexpected deletion of an archived dataitem. %s: %s - %s", new Object[]{s, ffmr.a(fduq0.a.b), fduq0.b.b});
        }
    label_32:
        if(fduq0.c) {
            fduq0.d = true;
        }
        else {
            fduq0.d = fduq0.b.b().isEmpty();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("migratingNode", s);
            contentValues0.put("appkeys_id", Long.valueOf(v));
            contentValues0.put("path", fduq0.b.b);
            contentValues0.put("data", fduq0.b.e);
            contentValues0.put("timestampMs", Long.valueOf(fduq0.h));
            contentValues0.put("assetsPresent", Integer.valueOf(((int)fduq0.d)));
            long v2 = sQLiteDatabase0.insert("archiveDataItems", null, contentValues0);
            if(v2 < 0L) {
                if(Log.isLoggable("DataItems", 6)) {
                    Log.e("DataItems", "Failed to insert archived data item row: " + fduq0);
                }
                fduq0 = null;
            }
            else {
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", String.format("Inserted archived data item: row %d - %s", v2, fduq0));
                }
                if(!fduq0.d) {
                    boolean z = hzvs.d();
                    String s3 = Long.toString(v2);
                    boolean z1 = true;
                    for(Object object0: fduq0.b.b().entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object0;
                        String s4 = ((fdpo)map$Entry0.getValue()).b;
                        if(s4 == null) {
                            Log.i("DataItems", "recordArchivedDataItem: null digest.");
                        }
                        else {
                            String s5 = (String)map$Entry0.getKey();
                            if(Log.isLoggable("DataItems", 3)) {
                                Log.d("DataItems", String.format("insertArchiveAssetRef: %s:%s->%s", s3, s5, s4));
                            }
                            ContentValues contentValues1 = new ContentValues();
                            contentValues1.put("assets_digest", s4);
                            contentValues1.put("archiveDataItems_id", s3);
                            contentValues1.put("assetname", s5);
                            sQLiteDatabase0.insert("archiveAssetRefs", "assetname", contentValues1);
                            if(!z) {
                                continue;
                            }
                            z1 = z1 && fdvl0.V(sQLiteDatabase0, fduq0.a, s4);
                        }
                    }
                    if(z1) {
                        try(Cursor cursor1 = sQLiteDatabase0.query("archiveAssetsReadyStatus", fdwz.a, "archiveDataItems_id=?", new String[]{s3}, null, null, null)) {
                            if(cursor1.moveToNext() && cursor1.getLong(1) != 0L) {
                                goto label_86;
                            }
                            else {
                                goto label_88;
                            }
                        }
                        goto label_89;
                    label_86:
                        boolean z2 = true;
                        goto label_89;
                    label_88:
                        z2 = false;
                    label_89:
                        z3 = z2;
                    }
                    else {
                        z3 = false;
                    }
                    fduq0.d = z3;
                    if(z3) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("assetsPresent", Integer.valueOf(1));
                        sQLiteDatabase0.update("archiveDataItems", contentValues2, "_id =?", new String[]{s3});
                    }
                }
            }
        }
        if(this.g.q && fduq0 != null && fduq0.c && fduq0.d) {
            Log.w("DataItems", "dataitem with assets may have been deleted");
            Log.w("DataItems", "Dataitem was: " + fduq0.toString() + "with asset map " + fduq0.b.b());
            this.f = true;
        }
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", "SetDataItemFutureArchived: recorded " + fduq0);
        }
        return fduq0;
    }

    @Override  // fdvf
    public final void h(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0, fduq fduq0, LinkedHashMap linkedHashMap0) {
        Long long0;
        HashSet hashSet1;
        HashSet hashSet0;
        if(fduq0.d) {
            hashSet0 = null;
            hashSet1 = null;
        }
        else {
            hashSet0 = new HashSet();
            hashSet1 = new HashSet();
            fdvl fdvl0 = this.g;
            String s = this.c;
            batl.s(s);
            fdpl fdpl0 = fduq0.a;
            String s1 = fduq0.b.b;
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", a.X(fdpl0, s1, "findMissingAssets: find missing assets for ", ":"));
            }
            fdvl0.J(sQLiteDatabase0, fdpl0, sQLiteDatabase0.query(true, "archiveDataItemsAndAssets", new String[]{"assets_digest"}, "migratingNode = ? AND packageName = ? AND signatureDigest = ? AND path = ?", new String[]{s, fdpl0.b, fdpl0.d, s1}, null, null, null, null), 0, hashSet0, hashSet1);
            timingLogger0.addSplit("findMissingAssets");
        }
        this.q(new fdvi(fduq0, hashSet0, hashSet1));
        if(this.c != null && fdvl.W(this.a.e)) {
            String s2 = this.a.e;
            feny feny0 = this.g.o;
            ReentrantReadWriteLock reentrantReadWriteLock0 = feny0.b;
            reentrantReadWriteLock0.readLock().lock();
            try {
                long0 = (Long)feny0.g.get(s2);
                if(long0 == null) {
                    ffmn.f("DataServMigrationCtrl", "Retrieved no known expected seqId for node %s - was there a syncstart lost?", new Object[]{s2});
                    goto label_24;
                }
                else {
                    goto label_27;
                }
                goto label_33;
            }
            catch(Throwable throwable0) {
                feny0.b.readLock().unlock();
                throw throwable0;
            }
        label_24:
            reentrantReadWriteLock0.readLock().unlock();
            long v = -1L;
            goto label_33;
            try {
            label_27:
                v = (long)long0;
            }
            catch(Throwable throwable0) {
                feny0.b.readLock().unlock();
                throw throwable0;
            }
            feny0.b.readLock().unlock();
        label_33:
            long v1 = this.a.f;
            if(v1 >= v) {
                String s3 = this.c;
                ffmn.d("DataItems", "Archive data item with seqId %s has arrived from source: %s peer: %s, this is the last dataitem expected: %s", new Object[]{v1, this.a.e, s3, this.a});
                this.g.o.b(s3);
                this.g.L(s3, "highest expected seq id encountered");
            }
        }
        if(this.f) {
            String s4 = this.c;
            if(s4 != null) {
                this.g.L(s4, "Archive dataitem with assets deleted");
            }
        }
        if(this.b) {
            this.g(timingLogger0, fduq0.a, hashSet0, hashSet1);
        }
    }

    @Override  // fdvf
    public final void i(SQLiteDatabase sQLiteDatabase0) {
    }
}

