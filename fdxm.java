import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import jeb.synthetic.TWR;

public final class fdxm extends bboo {
    public final Context a;
    private final boolean c;
    private final fdye d;
    private final fdyc e;

    public fdxm(Context context0, fdye fdye0, fdyc fdyc0, boolean z) {
        super(context0, "node.db", 14);
        this.a = context0;
        this.d = fdye0;
        this.e = fdyc0;
        this.c = z;
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        fdxm.c(sQLiteDatabase0);
    }

    private static void c(SQLiteDatabase sQLiteDatabase0) {
        fdxm.e(sQLiteDatabase0, "appkeys", "_id INTEGER PRIMARY KEY AUTOINCREMENT,packageName TEXT NOT NULL,signatureDigest TEXT NOT NULL");
        fdxm.e(sQLiteDatabase0, "dataitems", "_id INTEGER PRIMARY KEY AUTOINCREMENT, appkeys_id INTEGER NOT NULL REFERENCES appkeys(_id), host TEXT NOT NULL, path TEXT NOT NULL, seqId INTEGER NOT NULL, deleted INTEGER NOT NULL, sourceNode TEXT NOT NULL, data BLOB, timestampMs INTEGER NOT NULL, assetsPresent INTEGER NOT NULL, v1SourceNode TEXT NOT NULL, v1SeqId INTEGER NOT NULL");
        fdxm.e(sQLiteDatabase0, "archiveDataItems", "_id INTEGER PRIMARY KEY AUTOINCREMENT, migratingNode TEXT NOT NULL, appkeys_id INTEGER NOT NULL REFERENCES appkeys(_id), path TEXT NOT NULL, data BLOB, timestampMs INTEGER NOT NULL, assetsPresent INTEGER NOT NULL");
        fdxm.e(sQLiteDatabase0, "assets", "digest TEXT PRIMARY KEY, dataPresent INTEGER NOT NULL DEFAULT 0, timestampMs INTEGER NOT NULL");
        fdxm.e(sQLiteDatabase0, "assetrefs", "assetname TEXT NOT NULL, dataitems_id INTEGER NOT NULL REFERENCES dataitems(_id), assets_digest TEXT NOT NULL REFERENCES assets(digest)");
        fdxm.e(sQLiteDatabase0, "archiveAssetRefs", "assetname TEXT NOT NULL, archiveDataItems_id INTEGER NOT NULL REFERENCES dataitems(_id), assets_digest TEXT NOT NULL REFERENCES assets(digest)");
        fdxm.e(sQLiteDatabase0, "assetsacls", "appkeys_id INTEGER NOT NULL REFERENCES appkeys(_id), assets_digest TEXT NOT NULL");
        fdxm.e(sQLiteDatabase0, "nodeinfo", "node TEXT NOT NULL PRIMARY KEY, seqId INTEGER, lastActivityMs INTEGER, migratingFrom TEXT DEFAULT NULL, enrollmentId TEXT DEFAULT NULL");
        sQLiteDatabase0.execSQL("CREATE VIEW appKeyDataItems AS SELECT appkeys._id AS appkeys_id, appkeys.packageName AS packageName, appkeys.signatureDigest AS signatureDigest, dataitems._id AS dataitems_id, dataitems.host AS host, dataitems.path AS path, dataitems.seqId AS seqId, dataitems.deleted AS deleted, dataitems.sourceNode AS sourceNode, dataitems.data AS data, dataitems.timestampMs AS timestampMs, dataitems.assetsPresent AS assetsPresent, dataitems.v1SourceNode AS v1SourceNode, dataitems.v1SeqId AS v1SeqId FROM appkeys, dataitems WHERE appkeys._id=dataitems.appkeys_id");
        sQLiteDatabase0.execSQL("CREATE VIEW appKeyAcls AS SELECT appkeys._id AS appkeys_id, appkeys.packageName AS packageName, appkeys.signatureDigest AS signatureDigest, assetsacls.assets_digest AS assets_digest FROM appkeys, assetsacls WHERE _id=appkeys_id");
        sQLiteDatabase0.execSQL("CREATE VIEW dataItemsAndAssets AS SELECT appKeyDataItems.packageName AS packageName, appKeyDataItems.signatureDigest AS signatureDigest, appKeyDataItems.dataitems_id AS dataitems_id, appKeyDataItems.host AS host, appKeyDataItems.path AS path, appKeyDataItems.seqId AS seqId, appKeyDataItems.deleted AS deleted, appKeyDataItems.sourceNode AS sourceNode, appKeyDataItems.data AS data, appKeyDataItems.timestampMs AS timestampMs, appKeyDataItems.assetsPresent AS assetsPresent, assetrefs.assetname AS assetname, assetrefs.assets_digest AS assets_digest, appKeyDataItems.v1SourceNode AS v1SourceNode, appKeyDataItems.v1SeqId AS v1SeqId FROM appKeyDataItems LEFT OUTER JOIN assetrefs ON appKeyDataItems.dataitems_id=assetrefs.dataitems_id");
        sQLiteDatabase0.execSQL("CREATE VIEW assetsReadyStatus AS SELECT dataitems_id AS dataitems_id,  COUNT(*) = SUM(dataPresent) AS nowReady, assetsPresent AS markedReady FROM assetrefs, dataitems LEFT OUTER JOIN assets ON assetrefs.assets_digest=assets.digest WHERE assetrefs.dataitems_id=dataitems._id GROUP BY dataitems_id;");
        sQLiteDatabase0.execSQL("CREATE VIEW archiveAssetsReadyStatus AS SELECT archiveDataItems_id AS archiveDataItems_id,  COUNT(*) = SUM(dataPresent) AS nowReady, assetsPresent AS markedReady FROM archiveAssetRefs, archiveDataItems LEFT OUTER JOIN assets ON archiveAssetRefs.assets_digest=assets.digest WHERE archiveAssetRefs.archiveDataItems_id=archiveDataItems._id GROUP BY archiveDataItems_id;");
        sQLiteDatabase0.execSQL(fdxk.a);
        sQLiteDatabase0.execSQL(fdxl.b);
        fdxm.d(sQLiteDatabase0, true, "appkeys", "NAME_AND_SIG", new String[]{"packageName", "signatureDigest"});
        fdxm.d(sQLiteDatabase0, true, "assetrefs", "ASSET_REFS", new String[]{"assets_digest", "dataitems_id", "assetname"});
        fdxm.d(sQLiteDatabase0, true, "archiveAssetRefs", "ASSET_REFS", new String[]{"assets_digest", "archiveDataItems_id", "assetname"});
        fdxm.d(sQLiteDatabase0, false, "assetrefs", "DATAITEM_ID", new String[]{"dataitems_id"});
        fdxm.d(sQLiteDatabase0, false, "archiveAssetRefs", "DATAITEM_ID", new String[]{"archiveDataItems_id"});
        fdxm.d(sQLiteDatabase0, true, "assets", "DIGEST", new String[]{"digest"});
        fdxm.d(sQLiteDatabase0, true, "assetsacls", "APPKEY_AND_DIGEST", new String[]{"appkeys_id", "assets_digest"});
        fdxm.d(sQLiteDatabase0, true, "dataitems", "APPPKEY_PATH_AND_HOST", new String[]{"appkeys_id", "path", "host"});
        fdxm.d(sQLiteDatabase0, true, "dataitems", "SOURCENODE_AND_SEQID", new String[]{"sourceNode", "seqId"});
        fdxm.d(sQLiteDatabase0, true, "dataitems", "SOURCENODE_DELETED_AND_SEQID", new String[]{"sourceNode", "deleted", "seqId"});
        fdxm.d(sQLiteDatabase0, true, "archiveDataItems", "NODE_APPPKEY_PATH", new String[]{"migratingNode", "appkeys_id", "path"});
    }

    private static void d(SQLiteDatabase sQLiteDatabase0, boolean z, String s, String s1, String[] arr_s) {
        StringBuilder stringBuilder0 = new StringBuilder("CREATE ");
        if(z) {
            stringBuilder0.append("UNIQUE ");
        }
        stringBuilder0.append("INDEX ");
        stringBuilder0.append(s);
        stringBuilder0.append("_");
        stringBuilder0.append(s1);
        stringBuilder0.append(" ON ");
        stringBuilder0.append(s);
        stringBuilder0.append(" (");
        for(int v = 0; v < arr_s.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(arr_s[v]);
        }
        stringBuilder0.append(");");
        sQLiteDatabase0.execSQL(stringBuilder0.toString());
    }

    private static void e(SQLiteDatabase sQLiteDatabase0, String s, String s1) {
        sQLiteDatabase0.execSQL(a.d(s1, s, "CREATE TABLE ", "(", ");"));
    }

    private static void f(SQLiteDatabase sQLiteDatabase0, String s, String s1) {
        sQLiteDatabase0.execSQL(a.l(s1, s, "DROP ", " IF EXISTS "));
    }

    private static void g(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS dataItemRecords");
        sQLiteDatabase0.execSQL("DROP INDEX IF EXISTS dataItemRecords_PackageDataItem");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        synchronized(this) {
            try {
                return super.getReadableDatabase();
            }
            catch(fdxj fdxj0) {
                Log.e("DataItems", "Error during database upgrade, the database will be cleared", fdxj0);
                this.a.deleteDatabase("node.db");
                return super.getReadableDatabase();
            }
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        synchronized(this) {
            try {
                return super.getWritableDatabase();
            }
            catch(fdxj fdxj0) {
                Log.e("DataItems", "Error during database upgrade, the database will be cleared", fdxj0);
                this.a.deleteDatabase("node.db");
                return super.getWritableDatabase();
            }
        }
    }

    @Override  // bboo
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        throw new fdxj();
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        int v14;
        int v13;
        Long long1;
        int v11;
        int v10;
        Cursor cursor2;
        ffbl ffbl0;
        int v9;
        int v8;
        HashMap hashMap6;
        HashSet hashSet4;
        HashMap hashMap5;
        HashSet hashSet3;
        File[] arr_file3;
        int v7;
        int v6;
        byte[] arr_b;
        String s4;
        String s3;
        File[] arr_file2;
        SQLiteDatabase sQLiteDatabase1;
        int v2;
        Log.w("DataItems", a.z(v1, v, "Upgrade Wear db from version ", " to "));
        if(v < 6) {
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "upgradeFromPre6To8");
            }
            fdxm.g(sQLiteDatabase0);
            fdxm.c(sQLiteDatabase0);
            v2 = 8;
        }
        else {
            v2 = v;
        }
        if(v2 == 6) {
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "upgradeFrom6To8");
            }
            long v3 = System.currentTimeMillis();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "create the new tables and views");
            }
            fdxm.c(sQLiteDatabase0);
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "process the app keys");
            }
            HashMap hashMap0 = new HashMap();
            HashMap hashMap1 = new HashMap();
            sQLiteDatabase1 = sQLiteDatabase0;
            ContentValues contentValues0 = new ContentValues();
            HashMap hashMap2 = hashMap0;
            HashMap hashMap3 = hashMap1;
            Cursor cursor0 = sQLiteDatabase1.query(true, "dataItemRecords", new String[]{"packageName, signatureDigest"}, null, null, null, null, "packageName, signatureDigest", null);
            while(true) {
                try {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    String s = cursor0.getString(0);
                    String s1 = cursor0.getString(1);
                    fdpl fdpl0 = fdpl.a(s, s1);
                    contentValues0.put("packageName", s);
                    contentValues0.put("signatureDigest", s1);
                    Long long0 = sQLiteDatabase1.insert("appkeys", "packageName", contentValues0);
                    hashMap2.put(fdpl0, long0);
                    hashMap3.put(long0, new HashMap());
                    if(Log.isLoggable("DataItems", 3)) {
                        Log.d("DataItems", a.ab(fdpl0, "   "));
                    }
                    hashMap2 = hashMap2;
                    hashMap3 = hashMap3;
                    contentValues0 = contentValues0;
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            }
            HashMap hashMap4 = hashMap3;
            cursor0.close();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "read the old assets and save any found");
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet();
            HashSet hashSet2 = new HashSet();
            File[] arr_file = (hrnt.i() ? new File(ccsb.a.b(this.a.getFilesDir(), "assets")) : new File(this.a.getFilesDir(), "assets")).listFiles();
            if(arr_file != null) {
                int v4 = 0;
                while(v4 < arr_file.length) {
                    File file0 = arr_file[v4];
                    if(file0.isDirectory()) {
                        File[] arr_file1 = file0.listFiles();
                        if(arr_file1 == null) {
                            file0.delete();
                        }
                        else {
                            arr_file2 = arr_file;
                            int v5 = 0;
                            while(v5 < arr_file1.length) {
                                File file1 = arr_file1[v5];
                                if(file1.isFile()) {
                                    String s2 = file1.getName();
                                    hashMap5 = hashMap4;
                                    if(s2.endsWith(".asset")) {
                                        try {
                                            s3 = s2.substring(0, s2.length() - 6);
                                            this.e.h(s3, file1);
                                            hashSet0.add(s3);
                                            hashSet1.add(s3);
                                        }
                                        catch(IOException iOException0) {
                                            hashSet3 = hashSet0;
                                            Log.w("DataItems", a.Y(file1, s3, "error saving asset ", " from file "), iOException0);
                                            goto label_107;
                                        }
                                        hashSet3 = hashSet0;
                                    }
                                    else {
                                        hashSet3 = hashSet0;
                                        if(s2.endsWith(".acl")) {
                                            try {
                                                s4 = s2.substring(0, s2.length() - 4);
                                                arr_b = bbpb.e(file1);
                                                file1.delete();
                                                v6 = arr_b.length;
                                            }
                                            catch(IOException iOException1) {
                                                v7 = v4;
                                                arr_file3 = arr_file1;
                                                goto label_105;
                                            }
                                            try {
                                                v7 = v4;
                                                arr_file3 = arr_file1;
                                                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fexb.a), arr_b, 0, v6, hftc.a);
                                                ProtoLiteMessage.P_makeImmutable(hftv0);
                                                Iterator iterator0 = ((fexb)hftv0).b.iterator();
                                                while(true) {
                                                    if(!iterator0.hasNext()) {
                                                        goto label_109;
                                                    }
                                                    Object object0 = iterator0.next();
                                                    hashSet2.add(Pair.create(fdpl.a(((fexi)object0).c, ((fexi)object0).d), s4));
                                                    hashSet1.add(s4);
                                                }
                                            }
                                            catch(IOException iOException1) {
                                            }
                                        label_105:
                                            Log.w("DataItems", a.Y(file1, s4, "error parsing asset acl", " from file "), iOException1);
                                            goto label_109;
                                        }
                                    }
                                }
                                else {
                                    hashSet3 = hashSet0;
                                    hashMap5 = hashMap4;
                                }
                            label_107:
                                v7 = v4;
                                arr_file3 = arr_file1;
                            label_109:
                                ++v5;
                                hashSet0 = hashSet3;
                                hashMap4 = hashMap5;
                                v4 = v7;
                                arr_file1 = arr_file3;
                            }
                            hashSet4 = hashSet0;
                            hashMap6 = hashMap4;
                            v8 = v4;
                            file0.delete();
                            goto label_124;
                        }
                    }
                    hashSet4 = hashSet0;
                    arr_file2 = arr_file;
                    hashMap6 = hashMap4;
                    v8 = v4;
                label_124:
                    v4 = v8 + 1;
                    arr_file = arr_file2;
                    hashSet0 = hashSet4;
                    hashMap4 = hashMap6;
                }
            }
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "write the asset acls");
            }
            contentValues0.clear();
            for(Object object1: hashSet2) {
                fdpl fdpl1 = (fdpl)((Pair)object1).first;
                String s5 = (String)((Pair)object1).second;
                if(hashMap2.containsKey(fdpl1)) {
                    contentValues0.put("appkeys_id", ((Long)hashMap2.get(fdpl1)));
                    contentValues0.put("assets_digest", s5);
                    sQLiteDatabase1.insert("assetsacls", "appkeys_id", contentValues0);
                    if(!Log.isLoggable("DataItems", 3)) {
                        continue;
                    }
                    Log.d("DataItems", a.X(fdpl1, s5, "  added acl for ", ", "));
                }
                else {
                    if(!Log.isLoggable("DataItems", 3)) {
                        continue;
                    }
                    Log.d("DataItems", "  acl processing encountered unknown appkey, skipping: " + fdpl1);
                }
            }
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "reading dataitemrecords for data");
            }
            contentValues0.clear();
            ContentValues contentValues1 = new ContentValues();
            Cursor cursor1 = sQLiteDatabase1.query("dataItemRecords", null, null, null, null, null, null);
            try {
                v9 = cursor1.getColumnIndex("content");
                while(true) {
                label_153:
                    if(!cursor1.moveToNext()) {
                        goto label_215;
                    }
                    try {
                        byte[] arr_b1 = cursor1.getBlob(v9);
                        ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffbl.a), arr_b1, 0, arr_b1.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        ffbl0 = (ffbl)hftv1;
                        goto label_164;
                    }
                    catch(hfur hfur0) {
                    }
                    break;
                }
            }
            catch(Throwable throwable1) {
                goto label_180;
            }
            try {
                cursor2 = cursor1;
                v10 = v9;
                Log.e("DataItems", "Invalid dataItem format", hfur0);
                goto label_209;
            }
            catch(Throwable throwable1) {
                goto label_213;
            }
            try {
            label_164:
                v11 = 0;
                Uri uri0 = Uri.parse(ffbl0.d);
                long1 = (Long)hashMap2.get(fdpl.a(ffbl0.b, ffbl0.c));
                for(Object object2: ffbl0.i) {
                    fexy fexy0 = ((fexz)object2).d;
                    if(fexy0 == null) {
                        fexy0 = fexy.a;
                    }
                    if(!hashSet0.contains(fexy0.c)) {
                        v11 = 1;
                        break;
                    }
                }
                contentValues0.put("appkeys_id", long1);
                contentValues0.put("host", uri0.getHost());
                contentValues0.put("path", uri0.getPath());
            }
            catch(Throwable throwable1) {
            label_180:
                TWR.safeClose$NT(cursor1, throwable1);
                throw throwable1;
            }
            try {
                cursor2 = cursor1;
                contentValues0.put("data", ffbl0.e.toByteArray());
                v10 = v9;
                contentValues0.put("seqId", Long.valueOf(ffbl0.f));
                contentValues0.put("deleted", Integer.valueOf(((int)ffbl0.g)));
                contentValues0.put("sourceNode", ffbl0.h);
                contentValues0.put("assetsPresent", Integer.valueOf(v11 ^ 1));
                contentValues0.put("timestampMs", Long.valueOf(v3));
                contentValues0.put("v1SourceNode", "---");
                contentValues0.put("v1SeqId", Integer.valueOf(-1));
                long v12 = sQLiteDatabase1.insert("dataitems", "appkeys_id", contentValues0);
                ((Map)hashMap4.get(long1)).put(ffbl0.d, Long.valueOf(v12));
                for(Object object3: ffbl0.i) {
                    fexy fexy1 = ((fexz)object3).d;
                    if(fexy1 == null) {
                        fexy1 = fexy.a;
                    }
                    hashSet1.add(fexy1.c);
                    contentValues1.put("dataitems_id", Long.valueOf(v12));
                    contentValues1.put("assetname", ((fexz)object3).c);
                    fexy fexy2 = ((fexz)object3).d;
                    if(fexy2 == null) {
                        fexy2 = fexy.a;
                    }
                    contentValues1.put("assets_digest", fexy2.c);
                    sQLiteDatabase1.insert("assetrefs", "dataitems_id", contentValues1);
                }
            label_209:
                cursor1 = cursor2;
                v9 = v10;
                goto label_153;
            }
            catch(Throwable throwable1) {
            label_213:
                TWR.safeClose$NT(cursor2, throwable1);
                throw throwable1;
            }
        label_215:
            cursor1.close();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "write the assets table");
            }
            contentValues0.clear();
            for(Object object4: hashSet1) {
                contentValues0.put("digest", ((String)object4));
                contentValues0.put("dataPresent", Integer.valueOf(((int)hashSet0.contains(((String)object4)))));
                contentValues0.put("timestampMs", Long.valueOf(v3));
                sQLiteDatabase1.insert("assets", "digest", contentValues0);
            }
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "drop old tables");
            }
            fdxm.g(sQLiteDatabase1);
            v2 = 8;
        }
        else {
            sQLiteDatabase1 = sQLiteDatabase0;
        }
        if(v2 == 7) {
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "upgradeFrom7To8");
            }
            try {
                sQLiteDatabase1.execSQL("savepoint version7");
                fdxm.f(sQLiteDatabase1, "index", "appkeys_NAME_AND_SIG");
                fdxm.f(sQLiteDatabase1, "index", "assetrefs_ASSET_REFS");
                fdxm.f(sQLiteDatabase1, "index", "assets_DIGEST");
                fdxm.f(sQLiteDatabase1, "index", "assetsacls_APPKEY_AND_DIGEST");
                fdxm.f(sQLiteDatabase1, "index", "dataitems_APPKEY_HOST_AND_PATH");
                fdxm.f(sQLiteDatabase1, "view", "appKeyDataItems");
                fdxm.f(sQLiteDatabase1, "view", "appKeyAcls");
                fdxm.f(sQLiteDatabase1, "view", "assetsReadyStatus");
                fdxm.f(sQLiteDatabase1, "view", "dataItemsAndAssets");
                sQLiteDatabase1.execSQL("alter table appkeys rename to appkeys_old");
                sQLiteDatabase1.execSQL("alter table assets rename to assets_old");
                sQLiteDatabase1.execSQL("alter table assetrefs rename to assetrefs_old");
                sQLiteDatabase1.execSQL("alter table assetsacls rename to assetsacls_old");
                sQLiteDatabase1.execSQL("alter table dataitems rename to dataitems_old");
                fdxm.c(sQLiteDatabase1);
                sQLiteDatabase1.execSQL("insert into appkeys select * from appkeys_old");
                sQLiteDatabase1.execSQL("insert into assets select * from assets_old");
                sQLiteDatabase1.execSQL("insert into assetrefs select * from assetrefs_old");
                sQLiteDatabase1.execSQL("insert into assetsacls select * from assetsacls_old");
                sQLiteDatabase1.execSQL("insert into dataitems select *, \'---\', -1 from dataitems_old");
                sQLiteDatabase1.execSQL("drop table appkeys_old");
                sQLiteDatabase1.execSQL("drop table assets_old");
                sQLiteDatabase1.execSQL("drop table assetrefs_old");
                sQLiteDatabase1.execSQL("drop table assetsacls_old");
                sQLiteDatabase1.execSQL("drop table dataitems_old");
            }
            catch(SQLiteException unused_ex) {
                try {
                    Log.e("DataItems", "wearable database upgrade failed, clearing data");
                    sQLiteDatabase1.execSQL(";rollback to version7");
                    fdxm.f(sQLiteDatabase1, "index", "appkeys_NAME_AND_SIG");
                    fdxm.f(sQLiteDatabase1, "index", "assetrefs_ASSET_REFS");
                    fdxm.f(sQLiteDatabase1, "index", "assets_DIGEST");
                    fdxm.f(sQLiteDatabase1, "index", "assetsacls_APPKEY_AND_DIGEST");
                    fdxm.f(sQLiteDatabase1, "index", "dataitems_APPKEY_HOST_AND_PATH");
                    fdxm.f(sQLiteDatabase1, "view", "appKeyDataItems");
                    fdxm.f(sQLiteDatabase1, "view", "appKeyAcls");
                    fdxm.f(sQLiteDatabase1, "view", "assetsReadyStatus");
                    fdxm.f(sQLiteDatabase1, "view", "dataItemsAndAssets");
                    sQLiteDatabase1.execSQL("drop table appkeys");
                    sQLiteDatabase1.execSQL("drop table assets");
                    sQLiteDatabase1.execSQL("drop table assetrefs");
                    sQLiteDatabase1.execSQL("drop table assetsacls");
                    sQLiteDatabase1.execSQL("drop table dataitems");
                    fdxm.c(sQLiteDatabase1);
                    if(this.c) {
                        Log.e("DataItems", "wearable database upgrade failed, clearing device configs");
                        goto label_282;
                    }
                    goto label_290;
                }
                catch(Exception exception0) {
                    goto label_288;
                }
                try {
                label_282:
                    new ffdp(this.a).getWritableDatabase().execSQL("delete from connectionConfigurations");
                    goto label_290;
                }
                catch(Exception exception1) {
                    try {
                        Log.e("DataItems", "failed to clear device configs", exception1);
                        goto label_290;
                    }
                    catch(Exception exception0) {
                    }
                }
            label_288:
                Log.e("DataItems", "failed to clear data", exception0);
                sQLiteDatabase1.execSQL(";rollback to version7");
            }
        label_290:
            v2 = 8;
        }
        if(v2 == 8) {
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "upgradeFrom8To9");
            }
            try {
                v13 = v;
                if(v13 == 8) {
                    fdxm.f(sQLiteDatabase1, "index", "dataitems_APPKEY_HOST_AND_PATH");
                    fdxm.f(sQLiteDatabase1, "view", "appKeyDataItems");
                    fdxm.f(sQLiteDatabase1, "view", "dataItemsAndAssets");
                    sQLiteDatabase1.execSQL("alter table dataitems rename to dataitems_old");
                    fdxm.e(sQLiteDatabase1, "dataitems", "_id INTEGER PRIMARY KEY AUTOINCREMENT, appkeys_id INTEGER NOT NULL REFERENCES appkeys(_id), host TEXT NOT NULL, path TEXT NOT NULL, seqId INTEGER NOT NULL, deleted INTEGER NOT NULL, sourceNode TEXT NOT NULL, data BLOB, timestampMs INTEGER NOT NULL, assetsPresent INTEGER NOT NULL, v1SourceNode TEXT NOT NULL, v1SeqId INTEGER NOT NULL");
                    sQLiteDatabase1.execSQL("insert into dataitems select *, \'---\', -1 from dataitems_old");
                    sQLiteDatabase1.execSQL("drop table dataitems_old");
                    sQLiteDatabase1.execSQL("CREATE VIEW appKeyDataItems AS SELECT appkeys._id AS appkeys_id, appkeys.packageName AS packageName, appkeys.signatureDigest AS signatureDigest, dataitems._id AS dataitems_id, dataitems.host AS host, dataitems.path AS path, dataitems.seqId AS seqId, dataitems.deleted AS deleted, dataitems.sourceNode AS sourceNode, dataitems.data AS data, dataitems.timestampMs AS timestampMs, dataitems.assetsPresent AS assetsPresent, dataitems.v1SourceNode AS v1SourceNode, dataitems.v1SeqId AS v1SeqId FROM appkeys, dataitems WHERE appkeys._id=dataitems.appkeys_id");
                    sQLiteDatabase1.execSQL("CREATE VIEW dataItemsAndAssets AS SELECT appKeyDataItems.packageName AS packageName, appKeyDataItems.signatureDigest AS signatureDigest, appKeyDataItems.dataitems_id AS dataitems_id, appKeyDataItems.host AS host, appKeyDataItems.path AS path, appKeyDataItems.seqId AS seqId, appKeyDataItems.deleted AS deleted, appKeyDataItems.sourceNode AS sourceNode, appKeyDataItems.data AS data, appKeyDataItems.timestampMs AS timestampMs, appKeyDataItems.assetsPresent AS assetsPresent, assetrefs.assetname AS assetname, assetrefs.assets_digest AS assets_digest, appKeyDataItems.v1SourceNode AS v1SourceNode, appKeyDataItems.v1SeqId AS v1SeqId FROM appKeyDataItems LEFT OUTER JOIN assetrefs ON appKeyDataItems.dataitems_id=assetrefs.dataitems_id");
                    fdxm.d(sQLiteDatabase1, true, "dataitems", "APPKEY_HOST_AND_PATH", new String[]{"appkeys_id", "host", "path"});
                    fdxm.d(sQLiteDatabase1, true, "dataitems", "SOURCENODE_AND_SEQID", new String[]{"sourceNode", "seqId"});
                    fdxm.d(sQLiteDatabase1, true, "dataitems", "SOURCENODE_DELETED_AND_SEQID", new String[]{"sourceNode", "deleted", "seqId"});
                    fdxm.d(sQLiteDatabase1, false, "assetrefs", "DATAITEM_ID", new String[]{"dataitems_id"});
                    fdxm.e(sQLiteDatabase1, "nodeinfo", "node TEXT NOT NULL PRIMARY KEY, seqId INTEGER, lastActivityMs INTEGER, migratingFrom TEXT DEFAULT NULL, enrollmentId TEXT DEFAULT NULL");
                }
                String[] arr_s = {this.d.a().a};
                sQLiteDatabase1.execSQL("update dataitems set v1SourceNode = sourceNode");
                sQLiteDatabase1.execSQL("update dataitems set v1SeqId = seqId");
                sQLiteDatabase1.execSQL("update dataitems set sourceNode = ?", arr_s);
                sQLiteDatabase1.execSQL("insert into nodeinfo select ?, max(seqid), 0, NULL, NULL from dataitems", arr_s);
            }
            catch(SQLiteException sQLiteException0) {
                throw new fdxj(sQLiteException0);
            }
            try {
                SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("wearable.data_transport.settings", 0);
                Iterator iterator5 = sharedPreferences0.getAll().keySet().iterator();
                while(true) {
                    if(!iterator5.hasNext()) {
                        goto label_329;
                    }
                    Object object5 = iterator5.next();
                    String s6 = (String)object5;
                    sQLiteDatabase1.execSQL("insert into nodeinfo values(\'" + s6 + "\', " + sharedPreferences0.getLong(s6, -1L) + ", 0, NULL, NULL)");
                    sharedPreferences0 = sharedPreferences0;
                    iterator5 = iterator5;
                }
            }
            catch(Exception exception2) {
                try {
                    Log.w("DataItems", "Failed to initialize sync table", exception2);
                    goto label_329;
                }
                catch(SQLiteException sQLiteException0) {
                }
            }
            throw new fdxj(sQLiteException0);
        label_329:
            v2 = 9;
        }
        else {
            v13 = v;
        }
        if(v2 == 9) {
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "upgradeFrom9To10");
            }
            if(v13 >= 8) {
                try {
                    fdxm.f(sQLiteDatabase1, "index", "dataitems_APPKEY_HOST_AND_PATH");
                    fdxm.d(sQLiteDatabase1, true, "dataitems", "APPPKEY_PATH_AND_HOST", new String[]{"appkeys_id", "path", "host"});
                }
                catch(SQLiteException sQLiteException1) {
                    throw new fdxj(sQLiteException1);
                }
            }
            v2 = 10;
        }
        if(v2 == 10) {
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "upgradeFrom10To12");
            }
            if(v13 >= 9) {
                try {
                    sQLiteDatabase1.execSQL("ALTER TABLE nodeinfo RENAME TO nodeinfo_old");
                    fdxm.e(sQLiteDatabase1, "nodeinfo", "node TEXT NOT NULL PRIMARY KEY, seqId INTEGER, lastActivityMs INTEGER, migratingFrom TEXT DEFAULT NULL, enrollmentId TEXT DEFAULT NULL");
                    sQLiteDatabase1.execSQL("insert into nodeinfo select *, NULL, NULL from nodeinfo_old");
                    sQLiteDatabase1.execSQL("drop table nodeinfo_old");
                }
                catch(SQLiteException sQLiteException2) {
                    throw new fdxj(sQLiteException2);
                }
            }
            v2 = 12;
        }
        if(v2 == 11) {
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "upgradeFrom11To12");
            }
            try {
                sQLiteDatabase1.execSQL("ALTER TABLE nodeinfo RENAME TO nodeinfo_old");
                fdxm.e(sQLiteDatabase1, "nodeinfo", "node TEXT NOT NULL PRIMARY KEY, seqId INTEGER, lastActivityMs INTEGER, migratingFrom TEXT DEFAULT NULL, enrollmentId TEXT DEFAULT NULL");
                sQLiteDatabase1.execSQL("insert into nodeinfo select *, NULL from nodeinfo_old");
                sQLiteDatabase1.execSQL("drop table nodeinfo_old");
            }
            catch(SQLiteException sQLiteException3) {
                throw new fdxj(sQLiteException3);
            }
            v2 = 12;
        }
        switch(v2) {
            case 12: {
                v14 = v13 < 8 ? 0 : 1;
                break;
            }
            case 13: {
                v14 = v13 >= 8 ? 1 : 0;
                break;
            }
            default: {
                goto label_394;
            }
        }
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", String.format("upgradeFrom12or13To14(%d, %d)", v13, v2));
        }
        if(1 == v14) {
            try {
                if(v2 == 13) {
                    sQLiteDatabase1.execSQL("ALTER TABLE dataItemArchive RENAME TO archiveDataItems");
                }
                else {
                    fdxm.e(sQLiteDatabase1, "archiveDataItems", "_id INTEGER PRIMARY KEY AUTOINCREMENT, migratingNode TEXT NOT NULL, appkeys_id INTEGER NOT NULL REFERENCES appkeys(_id), path TEXT NOT NULL, data BLOB, timestampMs INTEGER NOT NULL, assetsPresent INTEGER NOT NULL");
                }
                fdxm.e(sQLiteDatabase1, "archiveAssetRefs", "assetname TEXT NOT NULL, archiveDataItems_id INTEGER NOT NULL REFERENCES dataitems(_id), assets_digest TEXT NOT NULL REFERENCES assets(digest)");
                sQLiteDatabase1.execSQL("CREATE VIEW archiveAssetsReadyStatus AS SELECT archiveDataItems_id AS archiveDataItems_id,  COUNT(*) = SUM(dataPresent) AS nowReady, assetsPresent AS markedReady FROM archiveAssetRefs, archiveDataItems LEFT OUTER JOIN assets ON archiveAssetRefs.assets_digest=assets.digest WHERE archiveAssetRefs.archiveDataItems_id=archiveDataItems._id GROUP BY archiveDataItems_id;");
                sQLiteDatabase1.execSQL(fdxk.a);
                sQLiteDatabase1.execSQL(fdxl.b);
                fdxm.d(sQLiteDatabase1, true, "archiveDataItems", "NODE_APPPKEY_PATH", new String[]{"migratingNode", "appkeys_id", "path"});
                fdxm.d(sQLiteDatabase1, true, "archiveAssetRefs", "ASSET_REFS", new String[]{"assets_digest", "archiveDataItems_id", "assetname"});
                fdxm.d(sQLiteDatabase1, false, "archiveAssetRefs", "DATAITEM_ID", new String[]{"archiveDataItems_id"});
            }
            catch(SQLiteException sQLiteException4) {
                throw new fdxj(sQLiteException4);
            }
        }
        else if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", "upgradeFrom12or13To14 skipped: ancient version so migration is inlined");
        }
        v2 = 14;
    label_394:
        if(v2 != 14) {
            throw new IllegalStateException(a.x(v2, v13, "DB upgrade error, oldVersion: ", ", version: ", ", database_version: 14"));
        }
        sQLiteDatabase1.setVersion(14);
    }
}

