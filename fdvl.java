import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.TimingLogger;
import com.google.android.gms.common.data.DataHolder;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jeb.synthetic.TWR;

public final class fdvl implements ffmd, ffmj {
    private long A;
    private final Object B;
    public static final AtomicReference a;
    public final Context b;
    public final fdxm c;
    public final fdpy d;
    public final ffew e;
    public final LinkedBlockingQueue f;
    final fdvd g;
    public final boolean h;
    public final AtomicInteger i;
    public final AtomicInteger j;
    public final AtomicInteger k;
    public final Set l;
    public final Set m;
    public final ffmj n;
    public final feny o;
    public BroadcastReceiver p;
    public final boolean q;
    public final fdye r;
    public final fdyc s;
    private final SharedPreferences t;
    private final fdul u;
    private final fdux v;
    private final ExecutorService w;
    private final AtomicInteger x;
    private final Set y;
    private long z;

    static {
        fdvl.a = new AtomicReference();
    }

    public fdvl(Context context0, boolean z, fdye fdye0, fdxm fdxm0, SharedPreferences sharedPreferences0, fdyc fdyc0, fdpy fdpy0, ffew ffew0, fdul fdul0, feny feny0) {
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        this.f = linkedBlockingQueue0;
        AtomicInteger atomicInteger0 = new AtomicInteger(0);
        this.x = atomicInteger0;
        this.i = new AtomicInteger(0);
        this.j = new AtomicInteger(0);
        this.k = new AtomicInteger(0);
        this.l = Collections.newSetFromMap(new ConcurrentHashMap());
        this.y = Collections.newSetFromMap(new ConcurrentHashMap());
        this.m = Collections.newSetFromMap(new ConcurrentHashMap());
        this.n = new fduy(this);
        this.z = 1000L;
        this.B = new Object();
        batl.s(context0);
        this.b = context0;
        this.h = z;
        batl.s(fdye0);
        this.r = fdye0;
        this.c = fdxm0;
        batl.s(sharedPreferences0);
        this.t = sharedPreferences0;
        this.s = fdyc0;
        this.d = fdpy0;
        this.e = ffew0;
        this.u = fdul0;
        fdux fdux0 = new fdux(this, fdxm0, linkedBlockingQueue0, atomicInteger0, z);
        this.v = fdux0;
        ExecutorService executorService0 = clhl.b.b(clhr.b);
        this.w = executorService0;
        executorService0.submit(fdux0);
        this.g = new fdvd(this, fdxm0);
        this.q = hzyg.a.b().l();
        this.o = feny0;
    }

    public final Map A(SQLiteDatabase sQLiteDatabase0, String s, String[] arr_s, String s1) {
        Map map0;
        StringBuilder stringBuilder0 = new StringBuilder("select ");
        stringBuilder0.append(s1);
        stringBuilder0.append(", sum(");
        for(int v = 0; v < arr_s.length; ++v) {
            stringBuilder0.append(String.format("length(%s)", arr_s[v]));
            if(v < arr_s.length - 1) {
                stringBuilder0.append(" + ");
            }
            else {
                stringBuilder0.append(") from ");
                stringBuilder0.append(s);
                stringBuilder0.append(" group by ");
                stringBuilder0.append(s1);
            }
        }
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", "DB query: " + stringBuilder0.toString());
        }
        map0 = new HashMap();
        try(Cursor cursor0 = sQLiteDatabase0.rawQuery(stringBuilder0.toString(), null)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                String s2 = cursor0.getString(0);
                batl.s(s2);
                ((HashMap)map0).put(s2, Long.valueOf(cursor0.getLong(1)));
            }
        }
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", a.q(s, map0, "Table ", ", total storage: "));
        }
        return map0;
    }

    public final Map B() {
        SQLiteDatabase sQLiteDatabase0 = this.c.getReadableDatabase();
        Map map0 = new HashMap();
        try(Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT node, seqId FROM nodeinfo WHERE seqId IS NOT NULL", null)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                String s = cursor0.getString(0);
                batl.s(s);
                ((HashMap)map0).put(s, Long.valueOf(cursor0.getLong(1)));
            }
        }
        return map0;
    }

    public final Set C(String s) {
        Set set0 = new HashSet();
        try(Cursor cursor0 = this.c.getReadableDatabase().query("appKeyAcls", null, "assets_digest=?", new String[]{s}, null, null, null)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                String s1 = cursor0.getString(1);
                batl.s(s1);
                String s2 = cursor0.getString(2);
                batl.s(s2);
                ((HashSet)set0).add(fdpl.a(s1, s2));
            }
        }
        return set0;
    }

    public final void D(fduo fduo0) {
        this.l.add(fduo0);
    }

    public final void E(fdxo fdxo0) {
        this.y.add(fdxo0);
    }

    final void F(fduq fduq0) {
        long v2;
        synchronized(this.B) {
            if(Long.compare(this.z, 1000L) >= 0) {
                this.A = this.t.getLong("nextSeqIdBlock", 100L);
                this.z = 0L;
                this.t.edit().putLong("nextSeqIdBlock", this.A + 1000L).commit();
                if(Log.isLoggable("DataItems", 2)) {
                    Log.v("DataItems", "retrieved new seqId block, " + this.A);
                }
            }
            long v1 = this.z;
            this.z = 1L + v1;
            v2 = this.A + v1;
            if(Log.isLoggable("DataItems", 2)) {
                Log.v("DataItems", a.u(v2, "issued seqId "));
            }
        }
        if(Log.isLoggable("DataItems", 2)) {
            Log.v("DataItems", "updated local seqId: node=" + this.u() + ", seqId=" + v2);
        }
        fduq0.g = v2;
        if(this.u().equals(fduq0.e)) {
            fduq0.f = v2;
        }
        else if(fduq0.h != 0L) {
            return;
        }
        fduq0.h = System.currentTimeMillis();
    }

    @Override  // ffmd
    public final void G() {
        SQLiteDatabase sQLiteDatabase0 = this.c.getWritableDatabase();
        sQLiteDatabase0.beginTransaction();
        try {
            Log.d("DataItems", "DataService.clearStorage: clearing shared prefs");
            this.t.edit().clear().commit();
            Log.d("DataItems", "DataService.clearStorage: clearing asset storage");
            this.s.G();
            Log.d("DataItems", "DataService.clearStorage: clearing db tables");
            sQLiteDatabase0.delete("assetsacls", null, null);
            sQLiteDatabase0.delete("archiveAssetRefs", null, null);
            sQLiteDatabase0.delete("assetrefs", null, null);
            sQLiteDatabase0.delete("nodeinfo", null, null);
            sQLiteDatabase0.delete("archiveDataItems", null, null);
            sQLiteDatabase0.delete("dataitems", null, null);
            sQLiteDatabase0.delete("assets", null, null);
            sQLiteDatabase0.delete("appkeys", null, null);
            sQLiteDatabase0.setTransactionSuccessful();
            Log.d("DataItems", "DataService.clearStorage: success");
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    public final void H(String s) {
        SQLiteDatabase sQLiteDatabase0 = this.c.getWritableDatabase();
        do {
            String[] arr_s = {s, this.u()};
            Cursor cursor0 = sQLiteDatabase0.query("dataItemsAndAssets", fdxc.a, "packageName=? AND host=? AND deleted=0", arr_s, null, null, null, "100");
            int v = cursor0.getCount();
            this.aq(sQLiteDatabase0, cursor0);
        }
        while(v >= 100);
    }

    public final void I(SQLiteDatabase sQLiteDatabase0) {
        int v7;
        int v6;
        int v5;
        int v3;
        int v2;
        File file0;
        try(Cursor cursor0 = sQLiteDatabase0.rawQuery(fdxa.a, null)) {
            ggfn ggfn0 = new ggfn();
            fdyc fdyc0 = this.s;
            HashSet hashSet0 = new HashSet();
            file0 = hrnt.i() ? new File(ccsb.a.b(fdyc0.a.getFilesDir(), "assets")) : new File(fdyc0.a.getFilesDir(), "assets");
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
            label_43:
                v2 = hashSet0.size();
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "doGcAssets: storage has " + hashSet0.size() + " known assets");
                }
            }
            else {
                int v = 0;
                while(true) {
                    if(v >= arr_file.length) {
                        goto label_43;
                    }
                    File file1 = arr_file[v];
                    if(file1.isDirectory()) {
                        File[] arr_file1 = file1.listFiles();
                        if(arr_file1 == null) {
                            goto label_40;
                        }
                        for(int v1 = 0; true; ++v1) {
                            if(v1 >= arr_file1.length) {
                                break;
                            }
                            File file2 = arr_file1[v1];
                            if(file2.isFile()) {
                                String s = file2.getName();
                                if(s.endsWith(".asset")) {
                                    hashSet0.add(s.substring(0, s.length() - 6));
                                }
                            }
                        }
                    }
                label_40:
                    ++v;
                }
            }
            v3 = cursor0.getCount();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", a.f(v3, "doGcAssets: db has ", " asset records"));
            }
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                int v4 = cursor0.getInt(1);
                String s1 = cursor0.getString(0);
                batl.s(s1);
                if(v4 > 0) {
                    hashSet0.remove(s1);
                }
                else {
                    ggfn0.i(s1);
                }
            }
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "doGcAssets: there are " + hashSet0.size() + " assets to remove from storage");
            }
            ggfp ggfp0 = ggfn0.h();
            ggqj ggqj0 = ggfp0.om();
            v5 = 0;
            v6 = 0;
            while(true) {
                if(!ggqj0.hasNext()) {
                    break;
                }
                Object object0 = ggqj0.next();
                String s2 = (String)object0;
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "doGcAssets: deleting asset row " + s2);
                }
                sQLiteDatabase0.delete("assets", "digest=?", new String[]{s2});
                ++v5;
                if(hzvs.a.b().a()) {
                    v6 += sQLiteDatabase0.delete("assetsacls", "assets_digest=?", new String[]{s2});
                }
            }
            fdpy fdpy0 = this.d;
            if(hzvs.a.b().h()) {
                Log.i("assets", "onAssetsPurged: Purging unreferenced assets");
                fdpy0.d.keySet().removeAll(ggfp0);
            }
            v7 = 0;
            Iterator iterator0 = hashSet0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                String s3 = (String)object1;
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "doGcAssets: deleting asset file " + s3);
                }
                if(Log.isLoggable("assets", 3)) {
                    Log.d("assets", "removeAsset: digest=" + s3);
                }
                fdyc0.b(s3).delete();
                ++v7;
            }
        }
        if(Log.isLoggable("DataItems", 4)) {
            Log.i("DataItems", "doGcAssets: removed " + v7 + " of " + v2 + " files, " + v5 + " of " + v3 + " asset records, " + v6 + " ACL records");
        }
    }

    // This method was un-flattened
    public final void J(SQLiteDatabase sQLiteDatabase0, fdpl fdpl0, Cursor cursor0, int v, Set set0, Set set1) {
        try {
            HashSet hashSet0 = new HashSet();
            while(true) {
                cursor0 = TWR.getResource$NT(cursor0);
                TWR.declareResource(cursor0);
                TWR.useResource$NT(cursor0);
                if(!cursor0.moveToNext()) {
                    break;
                }
                TWR.useResource$NT(cursor0);
                String s = cursor0.getString(v);
                if(Log.isLoggable("DataItems", 2)) {
                    TWR.useResource$NT(cursor0);
                    Log.v("DataItems", "findMissingAssets: found digest: " + s);
                }
                TWR.useResource$NT(cursor0);
                if(!TextUtils.isEmpty(s)) {
                    TWR.useResource$NT(cursor0);
                    hashSet0.add(s);
                }
            }
            TWR.useResource$NT(cursor0);
            if(Log.isLoggable("DataItems", 3)) {
                TWR.useResource$NT(cursor0);
                Log.d("DataItems", "findMissingAssets: found " + hashSet0.size() + " unique asset digests");
            }
            TWR.useResource$NT(cursor0);
            Iterator iterator0 = hashSet0.iterator();
            while(true) {
                TWR.useResource$NT(cursor0);
                if(!iterator0.hasNext()) {
                    break;
                }
                TWR.useResource$NT(cursor0);
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                if(fdvl.ab(sQLiteDatabase0, s1)) {
                    TWR.useResource$NT(cursor0);
                    if(this.V(sQLiteDatabase0, fdpl0, s1)) {
                        TWR.useResource$NT(cursor0);
                        if(Log.isLoggable("DataItems", 2)) {
                            TWR.useResource$NT(cursor0);
                            Log.v("DataItems", "getAssetPresenceStatus: Asset and ACL present: " + s1);
                        }
                    }
                    else {
                        TWR.useResource$NT(cursor0);
                        if(Log.isLoggable("DataItems", 2)) {
                            TWR.useResource$NT(cursor0);
                            Log.v("DataItems", "getAssetPresenceStatus: Asset present, but ACL missing: " + s1);
                        }
                        TWR.useResource$NT(cursor0);
                        set1.add(s1);
                    }
                }
                else {
                    TWR.useResource$NT(cursor0);
                    if(Log.isLoggable("DataItems", 2)) {
                        TWR.useResource$NT(cursor0);
                        Log.v("DataItems", "getAssetPresenceStatus: Asset missing: " + s1);
                    }
                    TWR.useResource$NT(cursor0);
                    set0.add(s1);
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.moot$NT();
            throw throwable0;
        }
    }

    public final void K(SQLiteDatabase sQLiteDatabase0, List list0) {
        fdvl fdvl0 = this;
        if(!list0.isEmpty()) {
            HashMap hashMap0 = new HashMap();
            ggdi ggdi0 = new ggdi();
            for(Object object0: ggia.f(list0, 100)) {
                String[] arr_s = {TextUtils.join(",", ((List)object0))};
                try(Cursor cursor0 = sQLiteDatabase0.query("appKeyArchiveDataItems", new String[]{"migratingNode", "appkeys_id", "packageName", "signatureDigest"}, "archiveDataItems_id in (?)", arr_s, null, null, null)) {
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        String s = cursor0.getString(0);
                        batl.s(s);
                        fdvl0.g.c();
                        fdvc fdvc0 = (fdvc)fdvl0.g.a.get(s);
                        if(fdvc0 == null) {
                            if(!Log.isLoggable("DataItems", 5)) {
                                continue;
                            }
                            Log.w("DataItems", "[migr-trkr] Tried to look up sync status for non-migrating node: " + s);
                        }
                        else if(fdvc0.b) {
                            Integer integer0 = cursor0.getInt(1);
                            String s1 = cursor0.getString(2);
                            batl.s(s1);
                            String s2 = cursor0.getString(3);
                            batl.s(s2);
                            fdpl fdpl0 = fdpl.a(s1, s2);
                            ggdi0.v(s, integer0);
                            hashMap0.put(integer0, fdpl0);
                        }
                    }
                }
            }
            for(Object object1: ggdi0.g()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                String s3 = (String)map$Entry0.getKey();
                String s4 = fdvl0.g.a(s3);
                if(s4 != null) {
                    Integer integer1 = (Integer)map$Entry0.getValue();
                    fdpl fdpl1 = (fdpl)hashMap0.get(integer1);
                    batl.s(fdpl1);
                    ffmn.a("DataItems", "Delivering archive to app %s because assets arrived.", new Object[]{fdpl1});
                    fdvl0.X(sQLiteDatabase0, s3, s4, integer1.toString(), fdpl1, "assets arrived");
                    fdvl0 = this;
                }
                else if(Log.isLoggable("DataItems", 5)) {
                    Log.w("DataItems", "Node is no longer migrating: " + s3);
                }
            }
        }
    }

    public final void L(String s, String s1) {
        SQLiteDatabase sQLiteDatabase1;
        HashMap hashMap0;
        String s2 = this.g.a(s);
        if(s2 != null) {
            feny feny0 = this.o;
            if(!feny0.h.contains(s)) {
                feny0.b.readLock().lock();
                feny0.b.readLock().unlock();
                Map map0 = this.B();
                ffmn.d("DataItems", "Not delivering app archives yet as not all archive dataitems for node %s have arrived. Controller expected seqId table: %s, our sync table: %s", new Object[]{s, feny0.g.toString(), map0});
                return;
            }
            if(Log.isLoggable("DataItems", 4)) {
                Log.i("DataItems", a.a(s, "deliverAppArchives(", ")"));
            }
            SQLiteDatabase sQLiteDatabase0 = this.c.getReadableDatabase();
            hashMap0 = new HashMap();
            sQLiteDatabase1 = sQLiteDatabase0;
            try(Cursor cursor0 = sQLiteDatabase1.query(true, "appKeyArchiveDataItems", new String[]{"appkeys_id", "packageName", "signatureDigest"}, "migratingNode = ?", new String[]{s}, null, null, null, null)) {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    Integer integer0 = cursor0.getInt(0);
                    String s3 = cursor0.getString(1);
                    batl.s(s3);
                    String s4 = cursor0.getString(2);
                    batl.s(s4);
                    hashMap0.put(integer0, fdpl.a(s3, s4));
                }
            }
            String s5 = s1;
            ffmn.d("DataItems", "maybeDeliverAppArchives(%s) handling %s apps, reason: %s. List of apps: %s", new Object[]{s, hashMap0.size(), s5, hashMap0});
            Collection collection0 = hashMap0.values();
            synchronized(this.o.e) {
                ConcurrentHashMap concurrentHashMap0 = this.o.f;
                Set set0 = (Set)concurrentHashMap0.get(s);
                if(set0 == null) {
                    concurrentHashMap0.put(s, new HashSet(collection0));
                }
                else {
                    ffmn.f("DataServMigrationCtrl", "Cannot switch node %s to denylist mode for apps %s: it is already in denylist mode for apps %s.", new Object[]{s, collection0, set0});
                }
            }
            int v1 = hashMap0.size();
            int v2 = 0;
            for(Object object1: hashMap0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(this.X(sQLiteDatabase1, s, s2, ((Integer)map$Entry0.getKey()).toString(), ((fdpl)map$Entry0.getValue()), s5)) {
                    ++v2;
                }
                else {
                    ffmn.a("DataItems", "Archive for %s was not handled yet so node will not be marked complete", new Object[]{((fdpl)map$Entry0.getValue()).c});
                }
                s5 = s1;
                sQLiteDatabase1 = sQLiteDatabase1;
            }
            if(v2 == v1) {
                ffmn.a("DataItems", "All archives have been delivered for node %s, marking it as complete", new Object[]{s});
                if(this.q) {
                    this.g.b(s);
                    return;
                }
                this.o.a(s);
            }
        }
        else if(Log.isLoggable("DataItems", 5)) {
            Log.w("DataItems", "Attempting to deliver app archives for non-migrating node: " + s);
        }
    }

    public final void M(ArrayList arrayList0) {
        SQLiteDatabase sQLiteDatabase0 = this.c.getReadableDatabase();
        int v = arrayList0.size();
        ArrayList arrayList1 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)arrayList0.get(v1);
            try(Cursor cursor0 = sQLiteDatabase0.query("dataItemsAndAssets", fdxc.a, "dataitems_id=?", new String[]{s}, null, null, null)) {
                if(!cursor0.moveToFirst()) {
                    return;
                }
                fduq fduq0 = fdur.f(cursor0);
                if(arrayList1 == null) {
                    arrayList1 = new ArrayList();
                }
                arrayList1.add(fduq0);
            }
        }
        if(arrayList1 != null) {
            this.N(null, arrayList1);
        }
    }

    public final void N(TimingLogger timingLogger0, ArrayList arrayList0) {
        ArrayList arrayList1;
        int v;
        if(Log.isLoggable("DataItems", 2)) {
            Log.v("DataItems", "notifyDataItemsChanged: " + arrayList0.size());
        }
        fdny.a(fdns.c);
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            v = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            fduq fduq0 = (fduq)object0;
            Uri uri0 = fduq0.b.c;
            String s = uri0.getPath();
            if(s != null && s.startsWith("/setup/sync_marker/")) {
                if(!Objects.equals(uri0.getHost(), this.u()) && !fduq0.c) {
                    String s1 = s.substring(19);
                    fdvd fdvd0 = this.g;
                    if(fdvd0 != null && fdvd0.a(s1) != null) {
                        v = 1;
                    }
                    fdpl fdpl0 = fduq0.a;
                    ffmn.d("DataItems", "Encountered sync marker: sourceNodeId=%s, seqId=%s, appKey=%s, isDeleted=%s, host=%s, path=%s", new Object[]{fduq0.e, ((long)fduq0.f), fdpl0, Boolean.valueOf(fduq0.c), fduq0.b.a, fduq0.b.b});
                    if(!this.h && fdvl.W(s1)) {
                        ffmn.d("DataItems", "Deleting sync marker for synthetic migrating node %s, all archive dataitems have arrived", new Object[]{s1});
                        this.ac(fdpl0, fduq0.b.a, fduq0.b.b);
                    }
                    else {
                        if(Log.isLoggable("DataItems", 4)) {
                            Log.i("DataItems", "syncMarkerEncountered: " + s1);
                        }
                        fdvc fdvc0 = (fdvc)fdvd0.a.get(s1);
                        if(fdvc0 != null) {
                            if(Log.isLoggable("DataItems", 3)) {
                                Log.d("DataItems", "[migr-trkr] recording data transfer complete for node: " + s1);
                            }
                            fdvc0.b = true;
                        }
                        else if(Log.isLoggable("DataItems", 3)) {
                            Log.d("DataItems", "[migr-trkr] trying to record data transfer complete for non-migrating node: " + s1);
                        }
                        ffmn.d("DataItems", "maybe delivering app archives because sync marker was encountered for nodeId %s", new Object[]{s1});
                        this.L(s1, "sync marker encountered");
                        if(v != 0) {
                            ffmn.d("DataItems", "Deleting sync marker from incoming migrating node %s", new Object[]{s1});
                            this.ac(fdpl0, fduq0.b.a, fduq0.b.b);
                        }
                    }
                }
                if(Objects.equals(uri0.getHost(), this.u())) {
                    ffmn.d("DataItems", "Encountered locally written sync marker: %s", new Object[]{fduq0});
                }
                if(fduq0.c) {
                    ffmn.d("DataItems", "Encountered DELETED sync marker: %s", new Object[]{fduq0});
                }
            }
        }
        if(hzyg.h()) {
            this.o.a.readLock().lock();
            try {
                boolean z = hzyg.h() && !this.o.d.isEmpty();
            }
            finally {
                this.o.a.readLock().unlock();
            }
            if(z) {
                arrayList1 = new ArrayList(arrayList0.size());
                int v2 = arrayList0.size();
                while(v < v2) {
                    fduq fduq1 = (fduq)arrayList0.get(v);
                    if(this.o.c(fduq1.a, fduq1.e)) {
                        arrayList1.add(fduq1);
                    }
                    ++v;
                }
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", String.format("Filtered migrating node events. %d/%d passed, %d filtered", arrayList1.size(), arrayList0.size(), ((int)(arrayList0.size() - arrayList1.size()))));
                }
            }
            else {
                arrayList1 = arrayList0;
            }
        }
        else {
            arrayList1 = arrayList0;
        }
        for(Object object1: this.l) {
            fduo fduo0 = (fduo)object1;
            fduo0.o(arrayList1);
            if(timingLogger0 != null) {
                timingLogger0.addSplit("onDataItemChanged:" + fduo0.getClass().getCanonicalName());
            }
        }
    }

    public static void O(Cursor cursor0, fdus fdus0) {
        try(cursor0) {
            cursor0.moveToFirst();
            while(true) {
                if(cursor0.isAfterLast() || fdus0.b()) {
                    break;
                }
                fdus0.a(fdur.f(cursor0));
            }
        }
    }

    public final void P(String s) {
        SQLiteDatabase sQLiteDatabase0;
        try {
            sQLiteDatabase0 = this.c.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            Log.e("DataItems", "Exception getting node db, cannot purge node " + s, sQLiteException0);
            return;
        }
        this.Q(sQLiteDatabase0, s, false);
    }

    final void Q(SQLiteDatabase sQLiteDatabase0, String s, boolean z) {
        hzvs hzvs0 = hzvs.a;
        if(!hzvs0.b().g()) {
            Log.i("DataItems", "purgeNode: node purging is disabled, node=" + s);
            return;
        }
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", "purgeNode: purging data items for node=" + s + ", removeNodeInfo=" + z);
        }
        int v = 0;
        do {
            sQLiteDatabase0.beginTransaction();
            try(Cursor cursor0 = sQLiteDatabase0.query("dataItemsAndAssets", fdxc.a, "host=?", new String[]{s}, null, null, "packageName, signatureDigest, host, path", "100")) {
                int v1 = cursor0.getCount();
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "purgeNode: processing batch, rows=" + v1);
                }
                ArrayList arrayList0 = new ArrayList(100);
                cursor0.moveToFirst();
                while(true) {
                    if(cursor0.isAfterLast()) {
                        break;
                    }
                    arrayList0.add(fdur.i(cursor0));
                    fduq fduq0 = fdur.f(cursor0);
                    if(Log.isLoggable("DataItems", 2)) {
                        Log.v("DataItems", "purgeNode: deleting data and asset refs: " + fduq0.b.b);
                    }
                }
                Iterator iterator0 = arrayList0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    sQLiteDatabase0.delete("assetrefs", "dataitems_id=?", new String[]{((String)object0)});
                    sQLiteDatabase0.delete("dataitems", "_id =?", new String[]{((String)object0)});
                    ++v;
                }
                if(hzvs0.b().d() && v > 0) {
                    if(Log.isLoggable("DataItems", 2)) {
                        Log.v("DataItems", "purgeNode: deleting assets");
                    }
                    this.I(sQLiteDatabase0);
                }
                sQLiteDatabase0.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                sQLiteDatabase0.endTransaction();
                throw throwable0;
            }
            sQLiteDatabase0.endTransaction();
        }
        while(v1 >= 100);
        if(z) {
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "purgeNode: removing node info for node=" + s);
            }
            sQLiteDatabase0.beginTransaction();
            try {
                sQLiteDatabase0.delete("nodeinfo", "node=?", new String[]{s});
                sQLiteDatabase0.setTransactionSuccessful();
            }
            catch(Throwable throwable1) {
                sQLiteDatabase0.endTransaction();
                throw throwable1;
            }
            sQLiteDatabase0.endTransaction();
        }
        if(v > 0) {
            if(Log.isLoggable("DataItems", 2)) {
                Log.v("DataItems", "notifyDataItemsPurged: " + s);
            }
            fdny.a(fdns.c);
            for(Object object1: this.y) {
                ((fdxo)object1).q(s);
            }
            fdny.d(fdns.d, null, null, v);
        }
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", a.s(s, v, "purgeNode: purged ", " items from node: "));
        }
    }

    public final void R(String s, long v, int v1, boolean z, fdus fdus0, ffaz ffaz0) {
        SQLiteDatabase sQLiteDatabase0;
        try {
            sQLiteDatabase0 = this.c.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            Log.e("DataItems", "queryAndProcessDataItemsWithConstraints(): Failed to get the database. Unable to process request.", sQLiteException0);
            return;
        }
        sQLiteDatabase0.beginTransaction();
        try {
            fdvl.O(this.f(s, v, v1, "seqId", z, ffaz0), fdus0);
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    public final void S(fdpl fdpl0, String s, fdpl fdpl1, fdpl fdpl2) {
        int v1;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase1;
        ArrayList arrayList0;
        boolean z;
        HashSet hashSet0;
        SQLiteDatabase sQLiteDatabase0;
        if(fdpl1.equals(fdpl2)) {
            Log.w("DataItems", a.Q(fdpl2, fdpl1, "Called to rename the same AppKey; ", "->"));
            return;
        }
        Log.i("DataItems", a.Q(fdpl2, fdpl1, "[TrustedPeers] Renaming data from: ", " to: "));
        try {
            sQLiteDatabase0 = this.c.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            Log.w("DataItems", "DB Exception in renameAppKeyForNodeDataItems", sQLiteException0);
            goto label_13;
        }
        String s1 = String.valueOf(fdvl.ae(sQLiteDatabase0, fdpl1));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("appkeys_id", Long.valueOf(fdvl.ae(sQLiteDatabase0, fdpl2)));
        Log.i("DataItems", "[TrustedPeers] Renamed " + sQLiteDatabase0.updateWithOnConflict("dataitems", contentValues0, "appkeys_id=? AND host=?", new String[]{s1, s}, 4) + " data items");
    label_13:
        hashSet0 = new HashSet();
        z = hzzf.a.b().b();
        arrayList0 = new ArrayList();
        try(Cursor cursor0 = this.al(fdpl0, fdqk.f(fdpl1, s).build(), true)) {
            cursor0.moveToFirst();
            while(true) {
                if(cursor0.isAfterLast()) {
                    break;
                }
                hashSet0.add(fdqk.q(fdur.f(cursor0)));
            }
        }
        try {
            sQLiteDatabase1 = this.c.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException1) {
            Log.w("DataItems", "DB Exception in renameAppKeyForNodeCapabilities", sQLiteException1);
            goto label_72;
        }
        try {
            sQLiteDatabase1.beginTransaction();
            String s2 = String.valueOf(fdvl.ae(sQLiteDatabase1, fdpl0));
            v1 = 0;
            for(Object object0: hashSet0) {
                String s3 = fdqk.g(fdpl1, s, ((String)object0)).build().getPath();
                batl.s(s3);
                Uri uri0 = fdqk.g(fdpl2, s, ((String)object0)).build();
                String s4 = uri0.getPath();
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("path", s4);
                Uri uri1 = uri0;
                int v2 = sQLiteDatabase1.updateWithOnConflict("dataitems", contentValues1, "appkeys_id=? AND host=? AND path=?", new String[]{s2, s, s3}, 4);
                if(z && v2 > 0) {
                    ffmn.a("DataItems", "Fetching renamed capability (%s dataitems were renamed): %s", new Object[]{v2, uri1});
                    Cursor cursor1 = this.c(fdpl0, uri1);
                    cursor1.moveToFirst();
                    while(!cursor1.isAfterLast()) {
                        fduq fduq0 = fdur.f(cursor1);
                        ffmn.a("DataItems", "Adding capability to deliver: %s", new Object[]{fduq0});
                        arrayList0.add(fduq0);
                    }
                }
                v1 += v2;
                hashSet0 = hashSet0;
                z = z;
            }
            sQLiteDatabase1.setTransactionSuccessful();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "renameAppKeyForNodeCapabilities: success");
            }
        }
        finally {
            sQLiteDatabase1.endTransaction();
        }
        Log.i("DataItems", "[TrustedPeers] Renamed capabilities; [" + v1 + "/" + hashSet0.size() + "]");
        if(z) {
            ffmn.d("DataItems", "Delivering %s renamed capability dataitems to listeners", new Object[]{arrayList0.size()});
            ffmn.e("DataItems", "These capabilities are: %s", new Object[]{arrayList0});
            this.N(new TimingLogger("DataItems", a.X(fdpl2, s, "CapabilityRewrite-", "-")), arrayList0);
        }
        try {
        label_72:
            sQLiteDatabase2 = this.c.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException2) {
            if(Log.isLoggable("DataItems", 5)) {
                Log.w("DataItems", "DB Exception in renameAppKeyForArchivedNodeDataItems", sQLiteException2);
                return;
            }
            return;
        }
        String s5 = String.valueOf(fdvl.ae(sQLiteDatabase2, fdpl1));
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("appkeys_id", Long.valueOf(fdvl.ae(sQLiteDatabase2, fdpl2)));
        int v3 = sQLiteDatabase2.updateWithOnConflict("archiveDataItems", contentValues2, "migratingNode = ? AND appkeys_id = ?", new String[]{s, s5}, 4);
        if(Log.isLoggable("DataItems", 4)) {
            Log.i("DataItems", a.f(v3, "[TrustedPeers] Renamed ", " archived dataitems"));
        }
    }

    public final void T() {
        long v = hzzi.a.i().z();
        Intent intent0 = new Intent("action_database_maintenance").setPackage("com.google.android.gms");
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(this.b, 0, intent0, 0xC000000);
        new bbib(this.b).d("DataServiceDataItems", 2, SystemClock.elapsedRealtime() + v, pendingIntent0, "com.google.android.gms");
    }

    public final void U(SQLiteDatabase sQLiteDatabase0, fduq fduq0) {
        String s = fduq0.e;
        long v = fduq0.f;
        String s1 = fduq0.b.a;
        long v1 = System.currentTimeMillis();
        if(Log.isLoggable("DataItems", 2)) {
            Log.v("DataItems", String.format("updateNodeInfo: node=%s, source=%s, seqId=%d, host=%s, lastActivity=%d, dataItem=%s", this.u(), s, v, s1, v1, fduq0));
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("seqId", Long.valueOf(v));
        contentValues0.put("lastActivityMs", Long.valueOf(v1));
        this.aa(sQLiteDatabase0, s, contentValues0);
    }

    public final boolean V(SQLiteDatabase sQLiteDatabase0, fdpl fdpl0, String s) {
        return DatabaseUtils.longForQuery(sQLiteDatabase0, "SELECT COUNT(*) FROM appKeyAcls WHERE assets_digest=? AND packageName=? AND signatureDigest=?", new String[]{s, fdpl0.b, fdpl0.d}) != 0L;
    }

    static boolean W(String s) {
        return s != null && s.startsWith("mig::");
    }

    final boolean X(SQLiteDatabase sQLiteDatabase0, String s, String s1, String s2, fdpl fdpl0, String s3) {
        fdqk fdqk0;
        ArrayList arrayList0;
        fdpl fdpl2;
        long v;
        fdpl fdpl1 = fdpl0;
        String s4 = ffmr.a(fdpl1.b);
        try {
            v = DatabaseUtils.longForQuery(sQLiteDatabase0, fdxe.a, new String[]{s, s2});
        }
        catch(SQLiteException sQLiteException0) {
            if(Log.isLoggable("DataItems", 5)) {
                Log.w("DataItems", "Failed to query for archive data items with missing assets", sQLiteException0);
            }
            v = -1L;
        }
        if(Long.compare(v, 0L) > 0) {
            ffmn.d("DataItems", "[%s] notifyAppIfArchiveReady(): Archive NOT ready for app %s, %d assets are not present yet", new Object[]{s, s4, v});
            return false;
        }
        if(this.e.l.contains(s)) {
            try {
                fdpl2 = null;
                fdpl2 = fdpn.a(this.b, fdpl1.b);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                ffmn.g("DataItems", illegalArgumentException0, "[%s] Unable to generate app key for %s", new Object[]{s, s4});
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                ffmn.d("DataItems", "[%s] Package not installed %s", new Object[]{s, s4});
            }
            if(fdpl2 == null) {
                ffmn.d("DataItems", "[%s] Deleting data archive: couldn\'t find app %s", new Object[]{s, s4});
                fdvl.ao(sQLiteDatabase0, s, s2, s4);
                return true;
            }
            String s5 = fdpl2.d;
            if(!s5.equals(fdpl1.d)) {
                ffmn.d("DataItems", "[%s] Deleting data archive: package signatures don\'t match %s", new Object[]{s, s4});
                fdvl.ao(sQLiteDatabase0, s, s2, s4);
                return true;
            }
            ffmn.d("DataItems", "notifyAppIfArchiveReady, app=%s, reason=%s", new Object[]{fdpl0, s3});
            String[] arr_s = {s1, s, fdpl2.b, s5};
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "Raw query for getArchiveDataItemsForDataHolderByAppKey:\nSELECT ? AS host, path AS path, data AS data, \'\' AS tags, assetname AS asset_key, assets_digest AS asset_id FROM archiveDataItemsAndAssets WHERE migratingNode = ? AND packageName = ? AND signatureDigest = ?");
                for(int v1 = 0; v1 < 4; ++v1) {
                    Log.d("DataItems", "selection arg: " + arr_s[v1]);
                }
            }
            DataHolder dataHolder0 = new DataHolder(new fdvj(sQLiteDatabase0.rawQuery("SELECT ? AS host, path AS path, data AS data, \'\' AS tags, assetname AS asset_key, assets_digest AS asset_id FROM archiveDataItemsAndAssets WHERE migratingNode = ? AND packageName = ? AND signatureDigest = ?", arr_s)));
            if(hzyg.a.b().m()) {
                this.o.a.readLock().lock();
                try {
                    Set set0 = (Set)this.o.d.get(s);
                    boolean z = set0 == null || set0.contains(fdpl1);
                    ffmn.e("DataServMigrationCtrl", "Checking if events for app %s should be delivered on node %s; result=%s", new Object[]{fdpl1, s, Boolean.valueOf(z)});
                }
                finally {
                    this.o.a.readLock().unlock();
                }
                if(z) {
                    ffmn.d("DataItems", "Not delivering archive a second time for app %s on node %s", new Object[]{fdpl1, s});
                    return true;
                }
            }
            if(Log.isLoggable("DataItems", 4)) {
                Log.i("DataItems", String.format("notifyDataItemArchiveReady[%s]: %d - %s", s, ((int)dataHolder0.i), s4));
            }
            fdny.a(fdns.e);
            for(Object object0: this.m) {
                ffgj ffgj0 = (ffgj)object0;
                String s6 = fdpl1.c;
                String s7 = ffmr.a(s6);
                if(Log.isLoggable("WearableService", 4)) {
                    Log.i("WearableService", String.format("[onNodeMigrated] onDataItemsArchiveReady(%s, %s, %s)", s7, s, ((int)dataHolder0.i)));
                }
                Intent intent0 = new Intent("com.google.android.gms.wearable.NODE_MIGRATED", Uri.parse("wear://dataitems/archive/")).setPackage(s6);
                ffgm ffgm0 = ffgj0.a;
                ffft ffft0 = ffgm0.b(fdpl1);
                if(ffft0 == null) {
                    if(Log.isLoggable("WearableService", 5)) {
                        Log.w("WearableService", "[onNodeMigrated] No matching packages. Dropping archive: " + s7);
                    }
                    dataHolder0.close();
                }
                else {
                    int v3 = ffft0.a(intent0).size();
                    if(v3 == 0) {
                        if(Log.isLoggable("WearableService", 5)) {
                            Log.w("WearableService", "[onNodeMigrated] No listeners found. Dropping archive: " + s7);
                        }
                        dataHolder0.close();
                    }
                    else {
                        if(Log.isLoggable("WearableService", 4)) {
                            Log.i("WearableService", String.format("[onNodeMigrated] Found %d services supporting node migration in package %s", v3, s7));
                        }
                        ffgm0.j(fdpl1, new ffgi(ffgj0, intent0, fdpl1, new AtomicInteger(v3), v3, s7, s, dataHolder0));
                    }
                }
            }
            feny feny0 = this.o;
            if(hzyg.h()) {
                ffmn.d("DataServMigrationCtrl", "Marking app %s as completed for node %s", new Object[]{fdpl1, s});
                ReentrantReadWriteLock reentrantReadWriteLock0 = feny0.a;
                reentrantReadWriteLock0.writeLock().lock();
                try {
                    Set set1 = (Set)feny0.d.get(s);
                    if(set1 == null) {
                        goto label_94;
                    }
                    else {
                        if(!set1.add(fdpl1)) {
                            ffmn.a("DataServMigrationCtrl", "Already marked app %s as completed", new Object[]{fdpl1});
                            goto label_92;
                        }
                        if(Objects.equals(fdpl1, feny0.c)) {
                            ffmn.a("DataServMigrationCtrl", "Not delivering roll-up event for gmscore appKey %s", new Object[]{fdpl1});
                            reentrantReadWriteLock0 = feny0.a;
                            goto label_92;
                        }
                    }
                    goto label_99;
                }
                catch(Throwable throwable0) {
                    feny0.a.writeLock().unlock();
                    throw throwable0;
                }
            label_92:
                reentrantReadWriteLock0.writeLock().unlock();
                return true;
                try {
                label_94:
                    ffmn.f("DataServMigrationCtrl", "Cannot mark app %s as completed - nodeId %s is not migrating", new Object[]{fdpl1, s});
                }
                catch(Throwable throwable0) {
                    feny0.a.writeLock().unlock();
                    throw throwable0;
                }
            label_99:
                reentrantReadWriteLock0.writeLock().unlock();
                synchronized(feny0.e) {
                    Set set2 = (Set)feny0.f.get(s);
                    if(set2 != null && set2.contains(fdpl1)) {
                        set2.remove(fdpl1);
                    }
                    else {
                        ffmn.d("DataServMigrationCtrl", "Removing app %s from denylist for %s, but it is already not present", new Object[]{fdpl1, s});
                    }
                    if(set2 != null && set2.isEmpty()) {
                        feny0.a(s);
                    }
                }
                ffmn.a("DataServMigrationCtrl", "Delivering dataitem and capability roll-ups for app %s on node %s", new Object[]{fdpl1, s});
                fdvl fdvl0 = fdvl.m();
                gftb.check(fdvl0);
                if(!hzyg.h() && Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", String.format("Not delivering rollup for appkey %s and node %s as data item suppression is disabled", fdpl1, s));
                }
                else {
                    try(Cursor cursor0 = fdvl.ak(fdvl0.c.getReadableDatabase(), fdpl0, s, null, false, null, false)) {
                        fdpl1 = fdpl0;
                        arrayList0 = new ArrayList(cursor0.getCount());
                        cursor0.moveToFirst();
                        while(true) {
                            if(cursor0.isAfterLast()) {
                                break;
                            }
                            arrayList0.add(fdur.f(cursor0));
                        }
                        if(Log.isLoggable("DataItems", 4)) {
                            Log.i("DataItems", "[" + s + "] Retrieved " + arrayList0.size() + " records to rollup for package " + ffmr.a(fdpl1.b));
                        }
                    }
                    if(!arrayList0.isEmpty()) {
                        fdvl0.N(new TimingLogger("DataItems", a.X(fdpl1, s, "DataItemRollup-", "-")), arrayList0);
                    }
                }
                fdqk0 = fdqk.m();
                gftb.check(fdqk0);
                HashSet hashSet0 = new HashSet();
                try(Cursor cursor1 = fdqk0.d(fdpl1, s)) {
                    cursor1.moveToFirst();
                    while(true) {
                        if(cursor1.isAfterLast()) {
                            break;
                        }
                        hashSet0.add(fdqk.q(fdur.f(cursor1)));
                    }
                }
                for(Object object2: hashSet0) {
                    fdqk0.y(fdpl1, ((String)object2));
                }
            }
            return true;
        }
        ffmn.d("DataItems", "Archive is not ready yet for nodeId %s as trusted peers data has not yet been processed", new Object[]{s});
        return false;
    }

    public final boolean Y(String s, String s1) {
        SQLiteDatabase sQLiteDatabase0;
        String s4;
        if(!this.h) {
            throw new IllegalStateException("prepareForNodeMigration() called on phone.");
        }
        String s2 = this.u();
        String s3 = s2.equals(s) ? s2 : String.format("mig::%s:%s", s2, s);
        if(Log.isLoggable("DataItems", 4)) {
            s4 = s;
            Log.i("DataItems", a.ai(s1, s4, s2, "prepareForNodeMigration: ", " from ", " to "));
        }
        else {
            s4 = s;
        }
        try {
            sQLiteDatabase0 = this.c.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            if(Log.isLoggable("DataItems", 5)) {
                Log.w("DataItems", "Couldn\'t get writable DB!", sQLiteException0);
            }
            return false;
        }
        String[] arr_s = {s2, s4};
        sQLiteDatabase0.beginTransaction();
        try {
            int v = sQLiteDatabase0.delete("dataitems", "host NOT IN (?, ?)", arr_s);
            if(Log.isLoggable("DataItems", 4)) {
                Log.i("DataItems", a.f(v, "prepareForNodeMigration: deleted ", " extraneous data items before migration"));
            }
            int v1 = sQLiteDatabase0.delete("nodeinfo", "node NOT IN (?, ?)", arr_s);
            if(Log.isLoggable("DataItems", 4)) {
                Log.i("DataItems", a.f(v1, "prepareForNodeMigration: deleted ", " extraneous nodes before migration"));
            }
            if(Log.isLoggable("DataItems", 4)) {
                Log.i("DataItems", a.l(s3, s4, "renameNode: renaming node ", " -> "));
            }
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("node", s3);
            int v2 = sQLiteDatabase0.update("nodeinfo", contentValues0, "node = ?", new String[]{s4});
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "renameNode: updated nodeinfo? " + (v2 > 0));
            }
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("sourceNode", s3);
            int v3 = sQLiteDatabase0.update("dataitems", contentValues1, "sourceNode = ?", new String[]{s4});
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", a.f(v3, "renameNode: updated ", " data item source nodes"));
            }
            sQLiteDatabase0.setTransactionSuccessful();
        }
        catch(Throwable throwable0) {
            sQLiteDatabase0.endTransaction();
            throw throwable0;
        }
        sQLiteDatabase0.endTransaction();
        long v4 = fdvl.ah(sQLiteDatabase0, s3);
        fduq fduq0 = new fduq(this.e.c);
        fduq0.f = v4 + 1L;
        fduq0.e = s3;
        fduq0.b = new fdun(s4, "/setup/sync_marker/" + s3);
        try {
            this.p(fduq0, s3).get();
        }
        catch(ExecutionException | InterruptedException exception0) {
            ffmn.c("DataItems", exception0, "Failed to set synthetic dataitem when preparing for migration", new Object[0]);
        }
        return true;
    }

    public final boolean Z(fduq fduq0, int v, boolean z, String s) {
        return this.u.a(fduq0, v, z, s);
    }

    public final long a(Long long0) {
        return long0 == null ? 0L : ((long)long0);
    }

    final boolean aa(SQLiteDatabase sQLiteDatabase0, String s, ContentValues contentValues0) {
        int v = sQLiteDatabase0.update("nodeinfo", contentValues0, "node=?", new String[]{s});
        if(v == 0) {
            contentValues0.put("node", s);
            if(!contentValues0.containsKey("lastActivityMs")) {
                contentValues0.put("lastActivityMs", Long.valueOf(0L));
            }
            if(!contentValues0.containsKey("seqId")) {
                contentValues0.put("seqId", Long.valueOf(-1L));
            }
            if(!contentValues0.containsKey("enrollmentId")) {
                String s1 = UUID.randomUUID().toString();
                contentValues0.put("enrollmentId", s1);
                if(Log.isLoggable("DataItems", 2)) {
                    Log.v("DataItems", "updateOrInsertNodeInfo, generating enrollmentId, node=" + this.u() + ", enrollmentId=" + s1);
                }
            }
            sQLiteDatabase0.insert("nodeinfo", null, contentValues0);
            return false;
        }
        return v != 0;
    }

    public static final boolean ab(SQLiteDatabase sQLiteDatabase0, String s) {
        try {
            if(DatabaseUtils.longForQuery(sQLiteDatabase0, "SELECT dataPresent FROM assets WHERE digest=?", new String[]{s}) != 0L) {
                return true;
            }
        }
        catch(SQLiteDoneException unused_ex) {
        }
        return false;
    }

    final void ac(fdpl fdpl0, String s, String s1) {
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", a.l(s1, s, "deleteDataItems: ", ", "));
        }
        TimingLogger timingLogger0 = new TimingLogger("DataItemsTiming", "deleteDataItemsByHostAndPath");
        SQLiteDatabase sQLiteDatabase0 = this.c.getWritableDatabase();
        while(true) {
            Cursor cursor0 = fdvl.ad(sQLiteDatabase0, fdpl0, s, s1, false, null, false, "100");
            int v = cursor0.getCount();
            timingLogger0.addSplit("getDataItemsByHostAndPath");
            this.aq(sQLiteDatabase0, cursor0);
            timingLogger0.addSplit("deleteDataItemsByCursorCloseAndNotify");
            if(v < 100) {
                break;
            }
            fdpl0 = fdpl0;
            s = s;
            s1 = s1;
        }
    }

    static final Cursor ad(SQLiteDatabase sQLiteDatabase0, fdpl fdpl0, String s, String s1, boolean z, Boolean boolean0, boolean z1, String s2) {
        String s7;
        String[] arr_s1;
        String[] arr_s;
        String s3 = fdpl0.b;
        String s4 = fdpl0.d;
        String s5 = z1 ? fdvl.w(s1) : s1;
        String s6 = "packageName=? AND signatureDigest=?";
        if(s5 == null && z) {
            arr_s = new String[]{s3, s4};
        }
        else if(s5 == null) {
            arr_s = new String[]{s3, s4};
            s6 = "packageName=? AND signatureDigest=? AND deleted=0";
        }
        else if(z && s == null) {
            s6 = fdvl.r("packageName=? AND signatureDigest=?", z1);
            arr_s = new String[]{s3, s4, s5};
        }
        else {
            if(z && s3 != null) {
                arr_s1 = new String[4];
                arr_s1[0] = s3;
                arr_s1[1] = s4;
                batl.s(s);
                arr_s1[2] = s;
                arr_s1[3] = s5;
                s7 = fdvl.r("packageName=? AND signatureDigest=? AND host=?", z1);
            }
            else if(s == null) {
                arr_s1 = new String[]{s3, s4, s5};
                s7 = fdvl.r("packageName=? AND signatureDigest=? AND deleted=0", z1);
            }
            else {
                arr_s1 = new String[]{s3, s4, s, s5};
                s7 = fdvl.r("packageName=? AND signatureDigest=? AND host=? AND deleted=0", z1);
            }
            arr_s = arr_s1;
            s6 = s7;
        }
        if(boolean0 != null) {
            s6 = boolean0.booleanValue() ? s6 + " AND assetsPresent" + " !=0" : s6 + " AND assetsPresent" + " =0";
        }
        if(Log.isLoggable("DataItems", 3)) {
            String[] arr_s2 = (String[])Arrays.copyOf(arr_s, arr_s.length);
            arr_s2[0] = ffmr.a(arr_s2[0]);
            Log.d("DataItems", "getDataItemsByHostAndPath: " + s6 + " args=" + TextUtils.join(",", arr_s2));
        }
        return sQLiteDatabase0.query("dataItemsAndAssets", fdxc.a, s6, arr_s, null, null, "packageName, signatureDigest, host, path", s2);
    }

    static final long ae(SQLiteDatabase sQLiteDatabase0, fdpl fdpl0) {
        try {
            return DatabaseUtils.longForQuery(sQLiteDatabase0, "SELECT _id FROM appkeys WHERE packageName=? AND signatureDigest=?", new String[]{fdpl0.b, fdpl0.d});
        }
        catch(SQLiteDoneException unused_ex) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("packageName", fdpl0.b);
            contentValues0.put("signatureDigest", fdpl0.d);
            return sQLiteDatabase0.insert("appkeys", "packageName", contentValues0);
        }
    }

    public static final void af(SQLiteDatabase sQLiteDatabase0, String s, String s1, String s2) {
        String s5;
        String s4;
        String s3;
        if(Log.isLoggable("DataItems", 3)) {
            s3 = s;
            s4 = s1;
            s5 = s2;
            Log.d("DataItems", a.ai(s5, s4, s3, "insertAssetRef: ", ":", "->"));
        }
        else {
            s3 = s;
            s4 = s1;
            s5 = s2;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("assets_digest", s5);
        contentValues0.put("dataitems_id", s3);
        contentValues0.put("assetname", s4);
        sQLiteDatabase0.insert("assetrefs", "assetname", contentValues0);
    }

    public static final boolean ag(SQLiteDatabase sQLiteDatabase0, String s) {
        try(Cursor cursor0 = sQLiteDatabase0.query("assetsReadyStatus", fdxb.a, "dataitems_id=?", new String[]{s}, null, null, null)) {
            return cursor0.moveToNext() && cursor0.getLong(1) != 0L;
        }
        return true;
    }

    public static final long ah(SQLiteDatabase sQLiteDatabase0, String s) {
        try(Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT node, seqId FROM nodeinfo WHERE node=?", new String[]{s})) {
            long v;
            for(v = -1L; true; v = cursor0.getLong(1)) {
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        return v;
    }

    public final void ai(int v, fduq fduq0) {
        fdvl.aj(v, (fduq0.c ? 4 : 2), fduq0);
    }

    public static final void aj(int v, int v1, fduq fduq0) {
        int v2 = 2;
        if(hzxv.f()) {
            if(v == 2) {
                v2 = 3;
            }
            fdnf fdnf0 = new fdnf();
            fdnf0.a = v;
            fdnf0.c = v2;
            fdnf0.b = v1;
            fdnf0.b(fduq0);
            fdng fdng0 = fdnf0.a();
            fdnd fdnd0 = fdob.b().c;
            if(fdnd0 != null) {
                fdnd0.a(fdng0);
            }
        }
    }

    static final Cursor ak(SQLiteDatabase sQLiteDatabase0, fdpl fdpl0, String s, String s1, boolean z, Boolean boolean0, boolean z1) {
        return fdvl.ad(sQLiteDatabase0, fdpl0, s, s1, z, boolean0, z1, null);
    }

    private final Cursor al(fdpl fdpl0, Uri uri0, boolean z) {
        String s1;
        String s;
        if(uri0 == null) {
            s = null;
            s1 = null;
        }
        else {
            s = this.t(uri0);
            s1 = uri0.getPath();
        }
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", "getDataItemsByUriHelper: " + fdpl0 + ", " + uri0 + ", " + z);
        }
        Cursor cursor0 = fdvl.ak(this.c.getReadableDatabase(), fdpl0, s, s1, false, Boolean.valueOf(true), z);
        this.am(fdpl0, s, s1, z);
        return cursor0;
    }

    private final void am(fdpl fdpl0, String s, String s1, boolean z) {
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", "requestMissingAssets: " + fdpl0 + ", " + s + ", " + s1);
        }
        SQLiteDatabase sQLiteDatabase0 = this.c.getReadableDatabase();
        try(Cursor cursor0 = fdvl.ak(this.c.getReadableDatabase(), fdpl0, s, s1, false, Boolean.valueOf(false), z)) {
            HashSet hashSet0 = new HashSet();
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                String s2 = cursor0.getString(12);
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "requestMissingAssets: found digest of missing asset, " + s2);
                }
                if(!TextUtils.isEmpty(s2)) {
                    hashSet0.add(s2);
                }
            }
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "requestMissingAssets: found " + hashSet0.size() + " missing assets");
            }
            Iterator iterator0 = hashSet0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                String s3 = (String)object0;
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "requestMissingAssets: calling onAssetMissing " + s3);
                }
                if(!fdvl.ab(sQLiteDatabase0, s3)) {
                    this.d.c(fdpl0, s3);
                }
                else if(!this.V(sQLiteDatabase0, fdpl0, s3)) {
                    this.d.d(fdpl0, s3);
                }
            }
        }
    }

    private static final void an(fduq fduq0, StringBuilder stringBuilder0) {
        stringBuilder0.append(" BUFFERED: [");
        String s = "";
        for(Object object0: fduq0.b.b().values()) {
            stringBuilder0.append(s);
            stringBuilder0.append(((fdpo)object0).b);
            s = ", ";
        }
        stringBuilder0.append("]");
    }

    private static final void ao(SQLiteDatabase sQLiteDatabase0, String s, String s1, String s2) {
        int v = sQLiteDatabase0.delete("archiveDataItems", "migratingNode = ? AND appkeys_id = ?", new String[]{s, s1});
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", String.format("Deleted %d archive rows for %s", v, s2));
        }
    }

    private static final void ap(SQLiteDatabase sQLiteDatabase0, String s, String s1) {
        sQLiteDatabase0.delete("assetrefs", "dataitems_id=? AND assetname=?", new String[]{s, s1});
    }

    private final void aq(SQLiteDatabase sQLiteDatabase0, Cursor cursor0) {
        ArrayList arrayList0;
        try {
            sQLiteDatabase0.beginTransaction();
            try {
                arrayList0 = this.y(sQLiteDatabase0, cursor0);
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
            this.N(null, arrayList0);
        }
        catch(SQLiteException sQLiteException0) {
            Log.w("DataItems", "error while deleting data items by cursor", sQLiteException0);
        }
    }

    public final long b(String s, InputStream inputStream0) {
        AtomicLong atomicLong0 = new AtomicLong(0L);
        try {
            this.s.d(inputStream0, atomicLong0);
            return atomicLong0.get();
        }
        catch(IOException iOException0) {
            Log.w("DataItems", "Save asset data failed for asset: " + s, iOException0);
            if(!hzuz.a.h().k()) {
                return 0L;
            }
            throw iOException0;
        }
    }

    public final Cursor c(fdpl fdpl0, Uri uri0) {
        return this.al(fdpl0, uri0, false);
    }

    public final Cursor d(fdpl fdpl0, Uri uri0) {
        return this.al(fdpl0, uri0, true);
    }

    public final Cursor f(String s, long v, int v1, String s1, boolean z, ffaz ffaz0) {
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", String.format("queryDataItemsWithConstraints: nodeId=%s, seqId=%s, limit=%s, excludeDeleted=%s, connectionRestrictions=%s", s, v, v1, Boolean.valueOf(z), ffaz0));
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        ArrayList arrayList0 = new ArrayList();
        stringBuilder0.append((z ? "sourceNode=? AND seqId > ? AND deleted=0" : "sourceNode=? AND seqId > ?"));
        arrayList0.add(s);
        arrayList0.add(Long.toString(v));
        String s2 = null;
        if(hzys.c()) {
            Objects.requireNonNull(this);
            StringBuilder stringBuilder1 = new StringBuilder();
            ArrayList arrayList1 = new ArrayList();
            if(ffaz0 != null) {
                for(Object object0: ffaz0.b) {
                    ffbk ffbk0 = (ffbk)object0;
                    if((ffbk0.b & 2) == 0) {
                        fduw.a(ffbk0.c, null, stringBuilder1, arrayList1, this);
                    }
                    else {
                        for(Object object1: (ffbk0.d == null ? feyx.a : ffbk0.d).b) {
                            fduw.a(ffbk0.c, ((feyu)object1), stringBuilder1, arrayList1, this);
                        }
                    }
                }
            }
            if(stringBuilder1.length() != 0) {
                stringBuilder0.append(" AND ( ");
                stringBuilder0.append(stringBuilder1.toString());
                stringBuilder0.append(" )");
                arrayList0.addAll(arrayList1);
            }
        }
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", a.c(arrayList0, stringBuilder0, "queryDataItemsWithConstraints: selection=", ", selectionArgs="));
        }
        SQLiteDatabase sQLiteDatabase0 = this.c.getReadableDatabase();
        String[] arr_s = fdxc.a;
        String s3 = stringBuilder0.toString();
        String[] arr_s1 = (String[])arrayList0.toArray(new String[0]);
        if(v1 != -1) {
            s2 = Integer.toString(v1);
        }
        return sQLiteDatabase0.query("dataItemsAndAssets", arr_s, s3, arr_s1, null, null, s1, s2);
    }

    public final DataHolder g(fdpl fdpl0, Uri uri0, boolean z) {
        DataHolder dataHolder0;
        String[] arr_s;
        String s1;
        String s;
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", a.Q(uri0, fdpl0, "getDataItemsHolderByUri: ", ", "));
        }
        SQLiteDatabase sQLiteDatabase0 = this.c.getReadableDatabase();
        sQLiteDatabase0.beginTransaction();
        try {
            if(uri0 == null) {
                s = null;
                s1 = null;
            }
            else {
                s = this.t(uri0);
                s1 = uri0.getPath();
            }
            String s2 = fdpl0.b;
            String s3 = fdpl0.d;
            String s4 = z ? fdvl.w(s1) : s1;
            String s5 = "packageName=? AND signatureDigest=? AND deleted=0";
            if(s4 == null) {
                arr_s = new String[]{s2, s3};
            }
            else if(s == null) {
                arr_s = new String[]{s2, s3, s4};
                s5 = fdvl.r("packageName=? AND signatureDigest=? AND deleted=0", z);
            }
            else {
                arr_s = new String[]{s2, s3, s, s4};
                s5 = fdvl.r("packageName=? AND signatureDigest=? AND host=? AND deleted=0", z);
            }
            String s6 = s5 + " AND assetsPresent" + " !=0";
            String s7 = !hzvs.f() || s != null || s4 == null ? "SELECT host AS host, path AS path, data AS data, \'\' AS tags, assetname AS asset_key, assets_digest AS asset_id FROM dataItemsAndAssets WHERE " + s6 : a.a(s6, "SELECT host AS host, path AS path, data AS data, \'\' AS tags, assetname AS asset_key, assets_digest AS asset_id, sourceNode FROM dataItemsAndAssets WHERE ", " ORDER BY sourceNode ASC");
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "Raw query for getDataItemsForDataHolderByHostAndPath:\n" + s7);
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    Log.d("DataItems", "selection arg: " + arr_s[v1]);
                }
            }
            try(fdvj fdvj0 = new fdvj(sQLiteDatabase0.rawQuery(s7, arr_s))) {
                this.am(fdpl0, s, s1, z);
                dataHolder0 = new DataHolder(fdvj0);
            }
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        return dataHolder0;
    }

    public final fduq h(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0, String s, fduq fduq0, fduq fduq1) {
        String s1;
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", a.Y(fduq0, s, "updateExistingDataItem: ", " to "));
        }
        if(!fduq0.c) {
            if(!fduq1.c) {
                fdun fdun0 = fduq0.b;
                fdun fdun1 = fduq1.b;
                if(Arrays.equals(fdun0.e, fdun1.e) && fdun0.b().size() == fdun1.b().size()) {
                    s1 = "dropping duplicate data item";
                    Iterator iterator0 = fdun0.b().entrySet().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_21;
                        }
                        Object object0 = iterator0.next();
                        fdpo fdpo0 = (fdpo)((Map.Entry)object0).getValue();
                        fdpo fdpo1 = (fdpo)fdun1.b().get(((Map.Entry)object0).getKey());
                        if(fdpo1 == null || !Objects.equals(fdpo0.b, fdpo1.b)) {
                            break;
                        }
                    }
                }
            }
        label_17:
            if(fduq0.e.equals(fduq1.e) && (fduq0.f != -1L && fduq0.f <= fduq1.f)) {
                s1 = "dropping out of order update by sequence id";
            }
            else {
                s1 = fduq0.e.equals(fduq1.e) || (fduq0.h == 0L || fduq0.h > fduq1.h) ? null : "dropping out of order update by timestamp";
            }
        }
        else if(fduq1.c) {
            s1 = "dropping already deleted data item";
        }
        else {
            goto label_17;
        }
    label_21:
        if(s1 == null) {
            this.F(fduq0);
        }
        timingLogger0.addSplit("setup");
        if(fduq0.f != -1L) {
            this.U(sQLiteDatabase0, fduq0);
            timingLogger0.addSplit("updateNodeInfo");
        }
        if(s1 != null) {
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", a.Y(fduq0, s1, "updateExistingDataItem: ", ": "));
            }
            return null;
        }
        if(fduq0.c) {
            sQLiteDatabase0.delete("assetrefs", "dataitems_id=?", new String[]{s});
            timingLogger0.addSplit("delete assetrefs");
            sQLiteDatabase0.update("dataitems", fdur.a(fduq0), "_id =?", new String[]{s});
            timingLogger0.addSplit("update data item");
            return fduq0;
        }
        HashMap hashMap0 = new HashMap();
        for(Object object1: fduq0.b.b().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            String s2 = ((fdpo)map$Entry0.getValue()).b;
            if(s2 == null) {
                Log.i("DataItems", "updateExistingDataItemLocked: null digest.");
            }
            else {
                hashMap0.put(((String)map$Entry0.getKey()), s2);
            }
        }
        for(Object object2: fduq1.b.b().entrySet()) {
            String s3 = (String)((Map.Entry)object2).getKey();
            String s4 = ((fdpo)((Map.Entry)object2).getValue()).b;
            if(!hashMap0.containsKey(s3)) {
                fdvl.ap(sQLiteDatabase0, s, s3);
                timingLogger0.addSplit("deleteAssetRef1");
            }
            else if(((String)hashMap0.get(s3)).equals(s4)) {
                hashMap0.remove(s3);
            }
            else {
                fdvl.ap(sQLiteDatabase0, s, s3);
                timingLogger0.addSplit("deleteAssetRef2");
            }
        }
        boolean z = hzvs.d();
        boolean z1 = true;
        boolean z2 = true;
        for(Object object3: hashMap0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object3;
            fdvl.af(sQLiteDatabase0, s, ((String)map$Entry1.getKey()), ((String)map$Entry1.getValue()));
            if(z) {
                if(z2) {
                    String s5 = (String)map$Entry1.getValue();
                    if(this.V(sQLiteDatabase0, fduq0.a, s5)) {
                        z2 = true;
                        goto label_78;
                    }
                }
                z2 = false;
            }
        label_78:
            timingLogger0.addSplit("insertAssetRef");
        }
        if(!fduq0.c && !fduq0.b.b().isEmpty() && (!z2 || !fdvl.ag(sQLiteDatabase0, s))) {
            z1 = false;
        }
        fduq0.d = z1;
        timingLogger0.addSplit("compute assetsAreReader");
        sQLiteDatabase0.update("dataitems", fdur.a(fduq0), "_id =?", new String[]{s});
        timingLogger0.addSplit("update data item2");
        return fduq0;
    }

    public final fduq i(fduq fduq0, String s) {
        ffew ffew0 = this.e;
        fdpl fdpl0 = fduq0.a;
        if(ffew0.c.equals(fdpl0)) {
            Uri uri0 = fduq0.b.c;
            if(fdqk.A(uri0.getPath())) {
                String s1 = uri0.getAuthority();
                batl.s(s1);
                fdpl fdpl1 = fdqk.i(uri0);
                fdpl fdpl2 = ffew0.a(s1, fdpl1);
                if(!fdpl1.equals(fdpl2)) {
                    String s2 = fdqk.g(fdpl2, s1, fdqk.n(uri0)).build().getPath();
                    return s2 == null ? fduq0 : new fduq(fduq0, null, s2);
                }
            }
            return fduq0;
        }
        fdpl fdpl3 = ffew0.a(s, fdpl0);
        return fdpl3.equals(fdpl0) ? fduq0 : new fduq(fduq0, fdpl3, null);
    }

    public final fduz j(fdpl fdpl0, Uri uri0, boolean z) {
        String s2;
        String s1;
        String s;
        fdny.c(fdns.b, fdpl0.b, fdpl0.c);
        if(uri0 == null) {
            s2 = null;
            s1 = null;
        }
        else {
            try {
                s = this.t(uri0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                Log.d("DataItems", "deleteDataItemsByUri: error while parsing URI", illegalArgumentException0);
                return new fduz(this, fdpl0, illegalArgumentException0);
            }
            s1 = uri0.getPath();
            s2 = s;
        }
        fduz fduz0 = new fduz(this, fdpl0, s2, s1, z);
        this.f.add(fduz0);
        return fduz0;
    }

    public static fdvb k(SQLiteDatabase sQLiteDatabase0, String s) {
        fdvb fdvb0 = new fdvb();
        try(Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT node, enrollmentId FROM nodeinfo WHERE node=?", new String[]{s})) {
            if(cursor0.moveToFirst()) {
                fdvb0.a = true;
                fdvb0.b = cursor0.getString(1);
                if(Log.isLoggable("DataItems", 2)) {
                    Log.v("DataItems", a.l(fdvb0.b, s, "successfully retrieved enrollment id: nodeId=", " enrollmentId="));
                }
            }
        }
        return fdvb0;
    }

    final fdvk l(SQLiteDatabase sQLiteDatabase0, String s, boolean z, Set set0) {
        fdvk fdvk0;
        ArrayList arrayList1;
        int v2;
        boolean z2;
        Set set1;
        boolean z1 = z;
        if(Log.isLoggable("DataItems", 2)) {
            set1 = set0;
            Log.v("DataItems", "writeAssetMetadata: digest=" + s + ", dataPresent=" + z1 + ", owners=" + TextUtils.join(",", set1));
        }
        else {
            set1 = set0;
        }
        try {
            String[] arr_s = {s};
            if(Log.isLoggable("DataItems", 2)) {
                Log.v("DataItems", "  query: SELECT dataPresent FROM assets WHERE digest=?");
                Log.v("DataItems", "  digest: " + s);
            }
            if(DatabaseUtils.longForQuery(sQLiteDatabase0, "SELECT dataPresent FROM assets WHERE digest=?", arr_s) != 0L) {
                goto label_28;
            }
            else if(z1) {
                try {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("dataPresent", Integer.valueOf(1));
                    contentValues0.put("timestampMs", Long.valueOf(System.currentTimeMillis()));
                    sQLiteDatabase0.update("assets", contentValues0, "digest=?", arr_s);
                    z2 = true;
                }
                catch(SQLiteDoneException unused_ex) {
                    z1 = true;
                    goto label_19;
                }
            }
            else {
                goto label_26;
            }
            goto label_29;
        }
        catch(SQLiteDoneException unused_ex) {
        }
    label_19:
        ContentValues contentValues1 = new ContentValues();
        contentValues1.put("digest", s);
        contentValues1.put("dataPresent", Integer.valueOf(((int)z1)));
        contentValues1.put("timestampMs", Long.valueOf(System.currentTimeMillis()));
        sQLiteDatabase0.insert("assets", "digest", contentValues1);
        z2 = z1;
        goto label_29;
    label_26:
        z2 = false;
        goto label_29;
    label_28:
        z2 = false;
    label_29:
        int v = 0;
        for(Object object0: set1) {
            long v1 = fdvl.ae(sQLiteDatabase0, ((fdpl)object0));
            if(Log.isLoggable("DataItems", 2)) {
                Log.v("DataItems", "writing to AssetAcls, digest " + s + ", " + v1);
            }
            if(DatabaseUtils.longForQuery(sQLiteDatabase0, "SELECT COUNT(*) FROM assetsacls WHERE assets_digest=? AND appkeys_id=?", new String[]{s, Long.toString(v1)}) <= 0L) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("appkeys_id", Long.valueOf(v1));
                contentValues2.put("assets_digest", s);
                sQLiteDatabase0.insert("assetsacls", "appkeys_id", contentValues2);
                v2 = 1;
            }
            else {
                v2 = 0;
            }
            v |= v2;
        }
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = sQLiteDatabase0.query("assetsReadyStatus", fdxb.a, "nowReady !=markedReady", null, null, null, null);
        try {
            while(cursor0.moveToNext()) {
                long v3 = cursor0.getLong(1);
                String s1 = cursor0.getString(0);
                batl.s(s1);
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("assetsPresent", Long.valueOf(v3));
                sQLiteDatabase0.update("dataitems", contentValues3, "_id=?", new String[]{s1});
                if(v3 != 0L) {
                    if(Log.isLoggable("DataItems", 3)) {
                        Log.d("DataItems", "marked dataitem assets ready, dataitem " + s1);
                    }
                    arrayList0.add(s1);
                }
            }
            arrayList1 = new ArrayList();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        try {
            Cursor cursor1 = sQLiteDatabase0.query("archiveAssetsReadyStatus", fdwz.a, "nowReady != markedReady", null, null, null, null);
            while(true) {
                try {
                label_66:
                    if(!cursor1.moveToNext()) {
                        break;
                    }
                    long v4 = cursor1.getLong(1);
                    String s2 = cursor1.getString(0);
                    batl.s(s2);
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("assetsPresent", Long.valueOf(v4));
                    sQLiteDatabase0.update("archiveDataItems", contentValues4, "_id=?", new String[]{s2});
                    if(v4 == 0L) {
                        goto label_66;
                    }
                    if(Log.isLoggable("DataItems", 3)) {
                        Log.d("DataItems", "marked archive dataitem assets ready, dataitem " + s2);
                    }
                    arrayList1.add(s2);
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(cursor1, throwable1);
                    throw throwable1;
                }
            }
            cursor1.close();
            fdvk0 = new fdvk(arrayList0, arrayList1, z2, ((boolean)v));
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return fdvk0;
    }

    public static fdvl m() {
        return (fdvl)fdvl.a.get();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        Throwable throwable3;
        Cursor cursor3;
        StringBuilder stringBuilder5;
        String s13;
        String s12;
        String s11;
        fdun fdun3;
        StringBuilder stringBuilder4;
        fdpl fdpl2;
        String s9;
        fduq fduq1;
        Iterator iterator0;
        HashMap hashMap0;
        int v4;
        int v3;
        Object object1;
        StringBuilder stringBuilder3;
        bbpd bbpd2;
        StringBuilder stringBuilder2;
        String s1;
        boolean z2;
        fdpl fdpl1;
        Cursor cursor1;
        int v2;
        int v1;
        int v;
        Object object0;
        StringBuilder stringBuilder0;
        bbpd bbpd1 = bbpd0;
        SQLiteDatabase sQLiteDatabase0 = this.c.getReadableDatabase();
        bbpd1.printf("num batches: %d, num set requests: %d, num archive requests: %d, num delete requests: %d\n", new Object[]{this.x.get(), this.i.get(), this.j.get(), this.k.get()});
        bbpd1.println();
        bbpd1.println("Flags:");
        bbpd1.b();
        bbpd1.c("DataServiceFeature.sortMigratingDataitemsToBottom", Boolean.valueOf(hzvs.f()));
        bbpd1.println();
        bbpd1.c("PhoneSwitchingFeature.suppressDataChanged", Boolean.valueOf(hzyg.h()));
        bbpd1.a();
        bbpd1.println();
        this.g.md(bbpd1, z, z1);
        bbpd1.println();
        this.o.md(bbpd1, z, z1);
        bbpd1.println();
        bbpd1.println("All Data Items:");
        bbpd1.println();
        bbpd1.b();
        Cursor cursor0 = sQLiteDatabase0.query("dataItemsAndAssets", fdxc.a, null, null, null, null, "packageName, signatureDigest, host, path");
        try {
            stringBuilder0 = new StringBuilder();
            cursor0.moveToFirst();
            object0 = null;
            v = 0;
            v1 = 0;
            v2 = 0;
        label_25:
            while(cursor0.isAfterLast()) {
                goto label_87;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        try {
            cursor1 = cursor0;
            fduq fduq0 = fdur.f(cursor1);
            fdpl fdpl0 = fduq0.a;
            if(!fdpl0.equals(object0)) {
                if(object0 == null) {
                    fdpl1 = fdpl0;
                }
                else {
                    fdpl1 = fdpl0;
                    bbpd1.println(object0.toString() + ": " + v + " dataitems (" + v1 + " deleted, " + v2 + " buffered)");
                    bbpd1.b();
                    bbpd1.print(stringBuilder0);
                    bbpd1.a();
                    bbpd1.println();
                }
                stringBuilder0 = new StringBuilder();
                object0 = fdpl1;
                v = 0;
                v1 = 0;
                v2 = 0;
            }
            if(z1) {
                z2 = true;
                goto label_53;
            }
            if(!fduq0.c) {
                z2 = false;
            label_53:
                String s = "";
                if(fduq0.c) {
                    ++v1;
                    s = " DELETED";
                }
                StringBuilder stringBuilder1 = new StringBuilder();
                if(!fduq0.c && !fduq0.d) {
                    ++v2;
                    fdvl.an(fduq0, stringBuilder1);
                }
                fdun fdun0 = fduq0.b;
                if(fdun0 != null) {
                    byte[] arr_b = fdun0.e;
                    if(arr_b != null) {
                        s1 = Integer.toString(arr_b.length);
                        goto label_68;
                    }
                }
                s1 = null;
            label_68:
                String s2 = ffmi.b(fduq0.h);
                String s3 = fduq0.b.b;
                if(z && !z2) {
                    stringBuilder2 = stringBuilder1;
                    s3 = "pathhash=" + Integer.toHexString(s3.hashCode());
                }
                else {
                    stringBuilder2 = stringBuilder1;
                }
                stringBuilder0.append(fduq0.e + ", " + fduq0.f + ", " + fduq0.g + ", " + s2 + ", " + fduq0.b.a + ", " + s3 + ", data " + s1 + ", assets: " + fduq0.b.b().size() + stringBuilder2.toString() + s + "\n");
                bbpd1 = bbpd0;
                cursor0 = cursor1;
                sQLiteDatabase0 = sQLiteDatabase0;
                object0 = object0;
                ++v;
                v1 = v1;
                v2 = v2;
                goto label_25;
            }
            cursor0 = cursor1;
            sQLiteDatabase0 = sQLiteDatabase0;
            goto label_25;
        label_87:
            cursor1 = cursor0;
            if(object0 == null) {
                bbpd2 = bbpd0;
            }
            else {
                bbpd2 = bbpd0;
                bbpd2.println(object0.toString() + ": " + v + " dataitems (" + v1 + " deleted, " + v2 + " buffered)");
                bbpd2.b();
                bbpd2.print(stringBuilder0);
                bbpd2.a();
                bbpd2.println();
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor1, throwable0);
            throw throwable0;
        }
        if(cursor1 != null) {
            cursor1.close();
        }
        bbpd2.a();
        bbpd2.println("All Archive Data Items:");
        bbpd2.b();
        Cursor cursor2 = sQLiteDatabase0.query("archiveDataItemsAndAssets", fdxl.a, null, null, null, null, "migratingNode, packageName, signatureDigest, path");
        try {
            stringBuilder3 = new StringBuilder();
            bbpd2.println("Cursor contains " + cursor2.getCount() + " rows");
            bbpd2.println();
            cursor2.moveToFirst();
            object1 = null;
            v3 = 0;
            v4 = 0;
            while(true) {
            label_114:
                if(cursor2.isAfterLast()) {
                    goto label_222;
                }
                hashMap0 = new HashMap();
                iterator0 = this.g.a.entrySet().iterator();
            label_117:
                if(iterator0.hasNext()) {
                    goto label_215;
                }
                long v5 = cursor2.getLong(3);
                String s4 = cursor2.getString(1);
                batl.s(s4);
                String s5 = cursor2.getString(2);
                batl.s(s5);
                fduq1 = new fduq(fdpl.a(s4, s5));
                String s6 = cursor2.getString(4);
                batl.s(s6);
                String s7 = (String)hashMap0.get(s6);
                if(s7 == null) {
                    s7 = s6;
                }
                String s8 = cursor2.getString(5);
                batl.s(s8);
                fduq1.e = s6;
                fduq1.f = v5;
                fduq1.g = v5;
                fduq1.h = cursor2.getLong(7);
                fduq1.c = false;
                fduq1.d = cursor2.getLong(8) != 0L;
                fduq1.b = new fdun(s7, s8);
                fdun fdun1 = fduq1.b;
                fdun1.e = cursor2.getBlob(6);
                s9 = cursor2.getString(9);
                if(s9 == null) {
                    cursor2.moveToNext();
                    goto label_153;
                }
                break;
            }
        }
        catch(Throwable throwable1) {
            goto label_187;
        }
        try {
            while(v5 == cursor2.getLong(3)) {
                String s10 = cursor2.getString(10);
                batl.s(s10);
                fdun fdun2 = fduq1.b;
                batl.s(s9);
                fdun2.d(s9, new fdpo(null, s10, null));
                if(!cursor2.moveToNext()) {
                    break;
                }
                s9 = cursor2.getString(9);
            }
        }
        catch(Throwable throwable2) {
            goto label_219;
        }
        try {
        label_153:
            fdpl2 = fduq1.a;
            if(!fdpl2.equals(object1)) {
                goto label_155;
            }
            goto label_169;
        }
        catch(Throwable throwable1) {
            goto label_187;
        }
        try {
        label_155:
            if(object1 != null) {
                bbpd2.print(object1);
                bbpd2.print(": ");
                bbpd2.print(v3);
                bbpd2.print(" dataitems (");
                bbpd2.print(v4);
                bbpd2.println(" buffered)");
                bbpd2.b();
                bbpd2.println(stringBuilder3);
                bbpd2.a();
            }
            stringBuilder3 = new StringBuilder();
            object1 = fdpl2;
            v3 = 0;
            v4 = 0;
        }
        catch(Throwable throwable2) {
            goto label_219;
        }
        try {
        label_169:
            stringBuilder4 = new StringBuilder();
            if(!fduq1.d) {
                goto label_171;
            }
            goto label_173;
        }
        catch(Throwable throwable1) {
            goto label_187;
        }
        try {
        label_171:
            ++v4;
            fdvl.an(fduq1, stringBuilder4);
        }
        catch(Throwable throwable2) {
            goto label_219;
        }
        try {
        label_173:
            fdun3 = fduq1.b;
            if(fdun3 != null) {
                goto label_175;
            }
            goto label_179;
        }
        catch(Throwable throwable1) {
            goto label_187;
        }
        try {
        label_175:
            byte[] arr_b1 = fdun3.e;
            if(arr_b1 != null) {
                s11 = Integer.toString(arr_b1.length);
                goto label_180;
            }
        label_179:
            s11 = null;
        }
        catch(Throwable throwable2) {
            goto label_219;
        }
        try {
        label_180:
            s12 = ffmi.b(fduq1.h);
            s13 = fduq1.b.b;
            if(z && !z1) {
                stringBuilder5 = new StringBuilder();
                cursor3 = cursor2;
                goto label_189;
            }
            else {
                goto label_193;
            }
            goto label_194;
        }
        catch(Throwable throwable1) {
        label_187:
            cursor3 = cursor2;
            goto label_235;
        }
        try {
        label_189:
            stringBuilder5.append("pathhash=");
            stringBuilder5.append(Integer.toHexString(s13.hashCode()));
            s13 = stringBuilder5.toString();
            goto label_194;
        label_193:
            cursor3 = cursor2;
        label_194:
            stringBuilder3.append(fduq1.e);
            stringBuilder3.append(", ");
            stringBuilder3.append(fduq1.f);
            stringBuilder3.append(", ");
            stringBuilder3.append(s12);
            stringBuilder3.append(", ");
            stringBuilder3.append(fduq1.b.a);
            stringBuilder3.append(", ");
            stringBuilder3.append(s13);
            stringBuilder3.append(", ");
            stringBuilder3.append("data ");
            stringBuilder3.append(s11);
            stringBuilder3.append(", ");
            stringBuilder3.append("assets: ");
            stringBuilder3.append(fduq1.b.b().size());
            stringBuilder3.append(stringBuilder4);
            stringBuilder3.append("\n");
            cursor2 = cursor3;
            object1 = object1;
            ++v3;
            goto label_114;
        }
        catch(Throwable throwable1) {
            goto label_235;
        }
        try {
        label_215:
            Object object2 = iterator0.next();
            hashMap0.put(((String)((Map.Entry)object2).getKey()), ((fdvc)((Map.Entry)object2).getValue()).a);
            goto label_117;
        }
        catch(Throwable throwable2) {
        label_219:
            throwable3 = throwable2;
            cursor3 = cursor2;
            goto label_236;
        }
        try {
        label_222:
            cursor3 = cursor2;
            if(object1 != null) {
                bbpd2.print(object1);
                bbpd2.print(": ");
                bbpd2.print(v3);
                bbpd2.print(" dataitems (");
                bbpd2.print(v4);
                bbpd2.println(" buffered)");
                bbpd2.b();
                bbpd2.println(stringBuilder3);
                bbpd2.a();
            }
            goto label_242;
        }
        catch(Throwable throwable1) {
        }
    label_235:
        throwable3 = throwable1;
    label_236:
        if(cursor3 != null) {
            try {
                cursor3.close();
            }
            catch(Throwable throwable4) {
                throwable3.addSuppressed(throwable4);
            }
        }
        throw throwable3;
    label_242:
        if(cursor3 != null) {
            cursor3.close();
        }
        bbpd2.a();
    }

    final gmcd n(fduq fduq0, boolean z, String s) {
        gmcd gmcd0;
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", a.Y(fduq0, (s == null ? "internal" : "peer=" + s), "setDataItem: ", ", "));
        }
        if(s == null) {
            gmcd0 = new fdvh(this, fduq0, z, null);
        }
        else {
            String s1 = this.g.a(s);
            gmcd0 = s1 != null && s1.equals(fduq0.b.a) ? new fdvg(this, fduq0, z, s) : new fdvh(this, fduq0, z, s);
        }
        this.f.add(gmcd0);
        return gmcd0;
    }

    public final gmcd o(fdpl fdpl0, fdun fdun0) {
        fdny.c(fdns.a, fdpl0.b, fdpl0.c);
        fduq fduq0 = new fduq(fdpl0);
        fduq0.c = false;
        fduq0.e = this.u();
        fduq0.b = fdun0;
        this.ai(2, fduq0);
        fdoe fdoe0 = fdob.b().d;
        if(fdoe0 != null && hzxv.a.d().m()) {
            fdod fdod0 = new fdod();
            fdoe0.a.d(((gful_cronetEngineProvider)fdod0));
        }
        return this.n(fduq0, true, null);
    }

    public final gmcd p(fduq fduq0, String s) {
        this.ai(4, fduq0);
        return this.n(fduq0, true, s);
    }

    public final File q(String s) {
        return this.s.a(s);
    }

    public static String r(String s, boolean z) {
        return z ? s + " AND path GLOB ?" : s + " AND path =?";
    }

    public static String s(byte[] arr_b) {
        return fdvl.v(fdvl.x().digest(arr_b));
    }

    public final String t(Uri uri0) {
        int v = fdzj.a(uri0);
        if(v == 1) {
            return this.u();
        }
        return v == 2 ? uri0.getHost() : null;
    }

    public final String u() {
        return this.r.a().a;
    }

    public static String v(byte[] arr_b) {
        return new String(Base64.encode(arr_b, 11));
    }

    public static String w(String s) {
        if(s == null) {
            return null;
        }
        String s1 = s.replace("[", "[[]").replace("*", "[*]").replace("?", "[?]");
        return s1.isEmpty() || s1.charAt(s1.length() - 1) != 0x2F ? s1 + "/*" : s1 + "*";
    }

    public static MessageDigest x() {
        try {
            return MessageDigest.getInstance("SHA1");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new IllegalStateException("proper crypto support not installed", noSuchAlgorithmException0);
        }
    }

    public final ArrayList y(SQLiteDatabase sQLiteDatabase0, Cursor cursor0) {
        ArrayList arrayList0 = new ArrayList();
        try(cursor0) {
            cursor0.moveToFirst();
            while(true) {
                if(cursor0.isAfterLast()) {
                    break;
                }
                arrayList0.add(new Pair(fdur.i(cursor0), fdur.f(cursor0)));
            }
        }
        ArrayList arrayList1 = new ArrayList();
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            Pair pair0 = (Pair)arrayList0.get(v1);
            fduq fduq0 = new fduq(((fduq)pair0.second).a);
            fduq0.e = this.u();
            fduq0.c = true;
            fduq0.d = true;
            fduq0.b = new fdun(((fduq)pair0.second).b.a, ((fduq)pair0.second).b.b);
            fduq fduq1 = this.h(new TimingLogger("DataItemsTiming", "deleteDataItemByCursorAndNotify"), sQLiteDatabase0, ((String)pair0.first), fduq0, ((fduq)pair0.second));
            if(fduq1 != null) {
                arrayList1.add(fduq1);
            }
            ++v1;
            this = this;
            sQLiteDatabase0 = sQLiteDatabase0;
        }
        return arrayList1;
    }

    public final Map z(Map map0) {
        Map map1 = this.B();
        Map map2 = new HashMap();
        for(Object object0: map1.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            long v = (long)(((Long)((Map.Entry)object0).getValue()));
            long v1 = map0.containsKey(s) ? ((long)(((Long)map0.get(s)))) : -1L;
            if(v1 < v) {
                ((HashMap)map2).put(s, Long.valueOf(v1));
            }
        }
        return map2;
    }
}

