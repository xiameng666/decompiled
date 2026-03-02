import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import android.util.TimingLogger;
import j..util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class fdvh extends fdvf {
    final fdvl f;

    public fdvh(fdvl fdvl0, fduq fduq0, boolean z, String s) {
        Objects.requireNonNull(fdvl0);
        this.f = fdvl0;
        super(fdvl0, fduq0, z, s, fdvl0.i);
    }

    @Override  // fdvf
    public final fduq f(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0) {
        boolean z2;
        boolean z3;
        fduq fduq1;
        try(Cursor cursor0 = fdvl.ak(sQLiteDatabase0, this.a.a, this.a.b.a, this.a.b.b, true, null, false)) {
            timingLogger0.addSplit("getDataItemsByHostAndPath");
            boolean z = cursor0.moveToFirst();
            fdvl fdvl0 = this.f;
            if(z) {
                timingLogger0.addSplit("moveToFirst");
                String s = fdur.i(cursor0);
                fduq fduq0 = fdur.f(cursor0);
                timingLogger0.addSplit("toDataItemAndMoveToNext");
                fduq1 = fdvl0.h(timingLogger0, sQLiteDatabase0, s, this.a, fduq0);
                timingLogger0.addSplit("updateExistingDataItem");
                if(Log.isLoggable("DataItems", 3) && fduq1 != null) {
                    Log.d("DataItems", a.q(s, fduq1, "SetDataItemFutureStandard: updated ", ", "));
                    return fduq1;
                }
            }
            else {
                fduq1 = this.a;
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "createNewDataItem: " + fduq1);
                }
                fdvl0.F(fduq1);
                fdvl0.U(sQLiteDatabase0, fduq1);
                fdpl fdpl0 = fduq1.a;
                long v = fdvl.ae(sQLiteDatabase0, fdpl0);
                ContentValues contentValues0 = fdur.a(fduq1);
                contentValues0.put("appkeys_id", Long.valueOf(v));
                contentValues0.put("host", fduq1.b.a);
                contentValues0.put("path", fduq1.b.b);
                contentValues0.put("timestampMs", Long.valueOf(fduq1.h));
                long v1 = sQLiteDatabase0.insert("dataitems", "host", contentValues0);
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "inserted data item row " + v1 + " for " + fduq1);
                }
                String s1 = Long.toString(v1);
                if(fduq1.c) {
                    fduq1.d = true;
                    goto label_78;
                }
                else {
                    boolean z1 = hzvs.d();
                    Iterator iterator0 = fduq1.b.b().entrySet().iterator();
                alab1:
                    while(true) {
                        z2 = true;
                        while(true) {
                            if(!iterator0.hasNext()) {
                                break alab1;
                            }
                            Object object0 = iterator0.next();
                            Map.Entry map$Entry0 = (Map.Entry)object0;
                            String s2 = ((fdpo)map$Entry0.getValue()).b;
                            if(s2 == null) {
                                Log.i("DataItems", "createNewDataItem: null digest.");
                            }
                            else {
                                fdvl.af(sQLiteDatabase0, s1, ((String)map$Entry0.getKey()), s2);
                                if(z1) {
                                    if(z2 && fdvl0.V(sQLiteDatabase0, fdpl0, s2)) {
                                        break;
                                    }
                                    z2 = false;
                                }
                            }
                        }
                    }
                    z3 = fduq1.b.b().isEmpty() || z2 && fdvl.ag(sQLiteDatabase0, s1);
                    fduq1.d = z3;
                    if(z3) {
                    label_78:
                        ContentValues contentValues1 = new ContentValues();
                        contentValues1.put("assetsPresent", Integer.valueOf(1));
                        sQLiteDatabase0.update("dataitems", contentValues1, "_id =?", new String[]{s1});
                    }
                }
                timingLogger0.addSplit("createNewDataItem");
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "SetDataItemFutureStandard: created " + fduq1);
                }
            }
        }
        return fduq1;
    }

    @Override  // fdvf
    public final void h(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0, fduq fduq0, LinkedHashMap linkedHashMap0) {
        HashSet hashSet1;
        HashSet hashSet0;
        if(fduq0.d) {
            hashSet0 = null;
            hashSet1 = null;
        }
        else {
            hashSet0 = new HashSet();
            hashSet1 = new HashSet();
            fdvl fdvl0 = this.f;
            fdpl fdpl0 = fduq0.a;
            String s = fduq0.b.a;
            String s1 = fduq0.b.b;
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "findMissingAssets: find missing assets for " + fdpl0 + ":" + s + ":" + s1);
            }
            fdvl0.J(sQLiteDatabase0, fdpl0, fdvl.ak(sQLiteDatabase0, fdpl0, s, s1, false, Boolean.valueOf(false), false), 12, hashSet0, hashSet1);
            timingLogger0.addSplit("findMissingAssets");
        }
        if(hzvs.a.b().j()) {
            if(!fduq0.d && !fduq0.c && this.b) {
                this.g(timingLogger0, fduq0.a, hashSet0, hashSet1);
            }
            this.q(new fdvi(fduq0, hashSet0, hashSet1));
            if(!fduq0.d && !fduq0.c) {
                return;
            }
            fdvh.e(linkedHashMap0, fduq0);
            return;
        }
        this.q(new fdvi(fduq0, hashSet0, hashSet1));
        if(!fduq0.d && !fduq0.c) {
            if(this.b) {
                this.g(timingLogger0, fduq0.a, hashSet0, hashSet1);
            }
            return;
        }
        fdvh.e(linkedHashMap0, fduq0);
    }

    @Override  // fdvf
    public final void i(SQLiteDatabase sQLiteDatabase0) {
        File file1;
        Iterator iterator1;
        fdvh fdvh0 = this;
        fdpl fdpl0 = fdvh0.a.a;
        fdun fdun0 = fdvh0.a.b;
        if(Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", "processAssetsInDataItem: " + fdun0);
        }
        Iterator iterator0 = fdun0.b().entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            fdpo fdpo0 = (fdpo)map$Entry0.getValue();
            if(Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "  processing " + fdpo0);
            }
            fdvl fdvl0 = fdvh0.f;
            byte[] arr_b = fdpo0.a;
            ParcelFileDescriptor parcelFileDescriptor0 = fdpo0.c;
            if(arr_b == null) {
                iterator1 = iterator0;
                if(parcelFileDescriptor0 != null) {
                    ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0);
                    if(Log.isLoggable("DataItems", 3)) {
                        Log.d("DataItems", "addAsset: " + parcelFileDescriptor$AutoCloseInputStream0.toString());
                    }
                    HashSet hashSet1 = new HashSet();
                    hashSet1.add(fdpl0);
                    hashSet1.addAll(fdvl0.e.g(fdpl0));
                    String s1 = fdvl0.s.d(parcelFileDescriptor$AutoCloseInputStream0, null);
                    fdvk fdvk1 = fdvl0.l(sQLiteDatabase0, s1, true, hashSet1);
                    boolean z1 = fdvk1.c;
                    if(z1 || fdvk1.d) {
                        fdvl0.d.b(s1, z1, fdun0, hashSet1);
                    }
                    fdvl0.K(sQLiteDatabase0, fdvk1.b);
                    fdun0.d(((String)map$Entry0.getKey()), new fdpo(null, s1, null));
                    fdvh0 = this;
                    iterator0 = iterator1;
                    continue;
                }
            }
            else {
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "addRawAsset: " + fdpl0 + ", length: " + arr_b.length);
                }
                HashSet hashSet0 = new HashSet();
                hashSet0.add(fdpl0);
                hashSet0.addAll(fdvl0.e.g(fdpl0));
                fdyc fdyc0 = fdvl0.s;
                String s = new String(Base64.encode(fdyc.f().digest(arr_b), 11));
                if(Log.isLoggable("assets", 3)) {
                    Log.d("assets", "saveAsset: digest=" + s);
                }
                File file0 = fdyc0.b(s);
                if(file0.exists()) {
                    iterator1 = iterator0;
                    if(Log.isLoggable("assets", 3)) {
                        Log.d("assets", "Skipping write: asset file already exists: " + (s + ".asset"));
                    }
                }
                else {
                    if(Log.isLoggable("assets", 3)) {
                        Log.d("assets", String.format("Writing asset to file: %s; size=%d", file0.getName(), ((int)arr_b.length)));
                    }
                    if(hrnt.i()) {
                        iterator1 = iterator0;
                        file1 = new File(ccsb.a.d(file0.getParent(), file0.getName() + ".tmp"));
                    }
                    else {
                        iterator1 = iterator0;
                        file1 = new File(file0.getParent(), file0.getName() + ".tmp");
                    }
                    try {
                        ghjq ghjq0 = new ghjq();
                        try {
                            FileOutputStream fileOutputStream0 = new FileOutputStream(file1);
                            ghjq0.b(fileOutputStream0);
                            fileOutputStream0.write(arr_b);
                        }
                        catch(Exception exception1) {
                            throw ghjq0.a(exception1);
                        }
                        finally {
                            ghjq0.close();
                        }
                    }
                    catch(FileNotFoundException fileNotFoundException0) {
                        Log.e("assets", "Fail to open asset file: " + file1.toString(), fileNotFoundException0);
                    }
                    catch(IOException iOException0) {
                        Log.e("assets", "Fail to write asset to file: " + file1.toString(), iOException0);
                        fdyc.g(file1);
                        throw new IOException("unable to write asset file");
                    }
                    catch(Exception exception0) {
                        Log.e("assets", "General exception", exception0);
                        fdyc.g(file1);
                        throw new IOException("unable to write asset file");
                    }
                    if(!file1.renameTo(file0)) {
                        Log.e("assets", "Fail to move tmp file to asset file: " + file1.toString());
                        fdyc.g(file1);
                        throw new IOException("unable to write asset file");
                    }
                    if(Log.isLoggable("assets", 3)) {
                        Log.d("assets", "Wrote asset file: " + (s + ".asset"));
                    }
                }
                fdvk fdvk0 = fdvl0.l(sQLiteDatabase0, s, true, hashSet0);
                boolean z = fdvk0.c;
                if(z || fdvk0.d) {
                    fdvl0.d.b(s, z, fdun0, hashSet0);
                }
                fdvl0.K(sQLiteDatabase0, fdvk0.b);
                fdun0.d(((String)map$Entry0.getKey()), new fdpo(null, s, null));
            }
            fdvh0 = this;
            iterator0 = iterator1;
        }
    }
}

