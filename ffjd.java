import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.gms.wearable.internal.PackageStorageInfo;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import j..util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

final class ffjd extends ffee {
    final fdiy c;
    final fflv d;

    public ffjd(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("getStorageInformation");
    }

    @Override  // ffee
    public final void a() {
        String s8;
        ApplicationInfo applicationInfo0;
        String s7;
        long v8;
        long v7;
        Map map9;
        Map map8;
        File file2;
        long v6;
        long v5;
        try {
            fdvl fdvl0 = this.d.h;
            PackageManager packageManager0 = this.d.d;
            ArrayList arrayList0 = new ArrayList();
            SQLiteDatabase sQLiteDatabase0 = fdvl0.c.getReadableDatabase();
            Map map0 = fdvl0.A(sQLiteDatabase0, "dataitems", fdxi.a, "appkeys_id");
            Map map1 = fdvl0.A(sQLiteDatabase0, "appkeys", fdxd.a, "_id");
            Map map2 = fdvl0.A(sQLiteDatabase0, "assets", fdxh.a, "digest");
            Map map3 = fdvl0.A(sQLiteDatabase0, "assetsacls", fdxf.a, "assets_digest");
            Map map4 = fdvl0.A(sQLiteDatabase0, "assetrefs", fdxg.a, "assets_digest");
            HashMap hashMap0 = new HashMap();
            Map map5 = map2;
            Map map6 = map1;
            fdiy fdiy0 = this.c;
            ArrayList arrayList1 = arrayList0;
            Cursor cursor0 = sQLiteDatabase0.query("appkeys", null, null, null, null, null, null);
            while(true) {
                try {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    String s = cursor0.getString(0);
                    batl.s(s);
                    String s1 = cursor0.getString(1);
                    batl.s(s1);
                    if(Log.isLoggable("DataItems", 3)) {
                        Log.d("DataItems", "Package id: " + s + ", Package name: " + ffmr.a(s1));
                    }
                    hashMap0.put(s, s1);
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            }
            cursor0.close();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "PackageIdToName: " + hashMap0.toString());
            }
            PackageManager packageManager1 = packageManager0;
            HashMap hashMap1 = new HashMap();
            Map map7 = map4;
            Cursor cursor1 = sQLiteDatabase0.query("assetsacls", null, null, null, null, null, null);
            while(true) {
                try {
                    if(!cursor1.moveToNext()) {
                        break;
                    }
                    String s2 = cursor1.getString(0);
                    batl.s(s2);
                    String s3 = cursor1.getString(1);
                    batl.s(s3);
                    Set set0 = (Set)hashMap1.get(s2);
                    if(set0 == null) {
                        set0 = new HashSet();
                        hashMap1.put(s2, set0);
                    }
                    set0.add(s3);
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(cursor1, throwable1);
                    throw throwable1;
                }
            }
            cursor1.close();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "Package id to digests: " + hashMap1.toString());
            }
            File file0 = fdvl0.c.a.getDatabasePath("node.db");
            long v = file0 == null ? 0L : file0.length();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", a.u(v, "NODE database storage: "));
            }
            Iterator iterator0 = hashMap0.keySet().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    fdiy0.c(new StorageInfoResponse(0, v, arrayList1));
                    return;
                }
                Object object0 = iterator0.next();
                String s4 = (String)object0;
                String s5 = (String)hashMap0.get(s4);
                long v1 = fdvl0.a(((Long)map0.get(s4)));
                long v2 = fdvl0.a(((Long)map6.get(s4)));
                Set set1 = (Set)hashMap1.get(s4);
                if(set1 == null) {
                    map8 = map5;
                    map9 = map7;
                    if(Log.isLoggable("DataItems", 4)) {
                        Log.i("DataItems", "No asset digest found for package: " + s5);
                    }
                    v7 = 0L;
                    v8 = 0L;
                    v5 = 0L;
                    v6 = 0L;
                }
                else {
                    long v3 = 0L;
                    long v4 = 0L;
                    v5 = 0L;
                    v6 = 0L;
                    for(Object object1: set1) {
                        v6 += fdvl0.a(((Long)map5.get(((String)object1))));
                        v5 += fdvl0.a(((Long)map3.get(((String)object1))));
                        v4 += fdvl0.a(((Long)map7.get(((String)object1))));
                        File file1 = fdvl0.s.a(((String)object1));
                        String s6 = (String)object1;
                        if(!Log.isLoggable("DataItems", 3)) {
                            file2 = file1;
                        }
                        else if(file1 == null) {
                            file2 = null;
                            Log.d("DataItems", "No asset file for digest: " + s6);
                        }
                        else {
                            file2 = file1;
                            Log.d("DataItems", "Asset file name: " + file1.getAbsolutePath());
                        }
                        v3 += (file2 == null ? 0L : file2.length());
                        map7 = map7;
                        map5 = map5;
                    }
                    map8 = map5;
                    map9 = map7;
                    v7 = v3;
                    v8 = v4;
                }
                long v9 = v1 + v2 + v6 + v5 + v8 + v7;
                v += v9;
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", dlbc.d(v1, s5, s4, "Id:", ",name:", ",dataitem storage:"));
                    Log.d("DataItems", dlbc.d(v2, s5, s4, "Id:", ",name:", ",appkey storage:"));
                    Log.d("DataItems", dlbc.d(v6, s5, s4, "Id:", ",name:", ",asset storage:"));
                    Log.d("DataItems", dlbc.d(v5, s5, s4, "Id:", ",name:", ",asset acl storage:"));
                    Log.d("DataItems", dlbc.d(v8, s5, s4, "Id:", ",name:", ",asset ref storage:"));
                    s7 = s5;
                    Log.d("DataItems", dlbc.d(v7, s5, s4, "Id:", ",name:", ",asset file storage:"));
                }
                else {
                    s7 = s5;
                }
                try {
                    applicationInfo0 = null;
                    applicationInfo0 = packageManager1.getApplicationInfo(s7, 0);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                if(applicationInfo0 != null) {
                    CharSequence charSequence0 = applicationInfo0.loadLabel(packageManager1);
                    if(charSequence0 != null) {
                        s8 = charSequence0.toString();
                        goto label_126;
                    }
                }
                s8 = s7;
            label_126:
                arrayList1.add(new PackageStorageInfo(s7, s8, v9));
                arrayList1 = arrayList1;
                map7 = map9;
                packageManager1 = packageManager1;
                map5 = map8;
                map6 = map6;
            }
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getStorageInformationInternal: exception during processing", exception0);
            StorageInfoResponse storageInfoResponse0 = new StorageInfoResponse(8, -1L, null);
            this.c.c(storageInfoResponse0);
        }
    }
}

