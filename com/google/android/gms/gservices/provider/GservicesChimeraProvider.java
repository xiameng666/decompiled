package com.google.android.gms.gservices.provider;

import a;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.util.Log;
import azql;
import bbou;
import bbpd;
import bwft;
import bwfu;
import bwfv;
import bwfy;
import com.google.android.chimera.ContentProvider;
import fftn;
import ggfp;
import hqvp;
import j..util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.TreeMap;
import jeb.synthetic.TWR;

public class GservicesChimeraProvider extends ContentProvider {
    public static final Uri a;
    public static final Uri b;
    private static final ggfp c;
    private static final String[] d;
    private static final String[] e;
    private boolean f;
    private boolean g;
    private bwfy h;
    private bwfv i;

    static {
        GservicesChimeraProvider.a = Uri.parse("content://com.google.android.gsf.gservices/override");
        GservicesChimeraProvider.b = Uri.parse("content://com.google.android.gsf.gservices/settings_default");
        GservicesChimeraProvider.c = ggfp.L("saved_system", "saved_secure", "saved_global");
        GservicesChimeraProvider.d = new String[]{"key", "value"};
        GservicesChimeraProvider.e = new String[]{"name", "value"};
    }

    public GservicesChimeraProvider() {
        this.f = false;
        this.g = false;
    }

    private final void a(MatrixCursor matrixCursor0, String[] arr_s) {
        this.h.f(arr_s, new bwft(matrixCursor0));
    }

    private final void b() {
        if(this.f) {
            this.c(Settings.System.CONTENT_URI, "system:", "saved_system");
        }
        if(this.g) {
            this.c(Settings.Secure.CONTENT_URI, "secure:", "saved_secure");
            if(UserHandle.myUserId() == 0) {
                this.c(Settings.Global.CONTENT_URI, "global:", "saved_global");
            }
        }
    }

    private final void c(Uri uri0, String s, String s1) {
        String s6;
        SQLiteDatabase sQLiteDatabase0 = this.i.getWritableDatabase();
        ContentResolver contentResolver0 = this.getContext().getContentResolver();
        HashMap hashMap0 = new HashMap();
        MatrixCursor matrixCursor0 = new MatrixCursor(GservicesChimeraProvider.d);
        this.a(matrixCursor0, new String[]{s});
        while(true) {
            try {
                if(!matrixCursor0.moveToNext()) {
                    break;
                }
                hashMap0.put(matrixCursor0.getString(0).substring(s.length()), matrixCursor0.getString(1));
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(matrixCursor0, throwable0);
                throw throwable0;
            }
        }
        matrixCursor0.close();
        ContentValues contentValues0 = new ContentValues();
        String[] arr_s = new String[1];
        Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT name, value FROM " + s1, null);
        SQLiteStatement sQLiteStatement0 = null;
        try {
            while(cursor0.moveToNext()) {
                String s2 = cursor0.getString(0);
                String s3 = cursor0.getString(1);
                if(hashMap0.containsKey(s2)) {
                    contentValues0.put("name", s2);
                    contentValues0.put("value", ((String)hashMap0.get(s2)));
                    contentResolver0.insert(uri0, contentValues0);
                    hashMap0.remove(s2);
                }
                else {
                    if(sQLiteStatement0 == null) {
                        sQLiteStatement0 = sQLiteDatabase0.compileStatement(a.a(s1, "DELETE FROM ", " WHERE name = ?"));
                    }
                    if(s3 == null) {
                        arr_s[0] = s2;
                        contentResolver0.delete(uri0, "name=?", arr_s);
                    }
                    else {
                        contentValues0.put("name", s2);
                        contentValues0.put("value", s3);
                        contentResolver0.insert(uri0, contentValues0);
                    }
                    sQLiteStatement0.bindString(1, s2);
                    sQLiteStatement0.execute();
                }
            }
        }
        finally {
            cursor0.close();
            if(sQLiteStatement0 != null) {
                sQLiteStatement0.close();
            }
        }
        if(!hashMap0.isEmpty()) {
            try(SQLiteStatement sQLiteStatement1 = sQLiteDatabase0.compileStatement(a.a(s1, "INSERT OR REPLACE INTO ", " (name, value) VALUES (?, ?)"))) {
                Iterator iterator0 = hashMap0.entrySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    String s4 = (String)((Map.Entry)object0).getKey();
                    String s5 = (String)((Map.Entry)object0).getValue();
                    Cursor cursor1 = contentResolver0.query(Uri.withAppendedPath(uri0, s4), new String[]{"value"}, null, null, null);
                    if(cursor1 != null) {
                        try {
                            s6 = cursor1.moveToNext() ? cursor1.getString(0) : null;
                        }
                        finally {
                            cursor1.close();
                        }
                        sQLiteStatement1.bindString(1, s4);
                        if(s6 == null) {
                            sQLiteStatement1.bindNull(2);
                        }
                        else {
                            sQLiteStatement1.bindString(2, s6);
                        }
                        sQLiteStatement1.execute();
                        contentValues0.put("name", s4);
                        contentValues0.put("value", s5);
                        contentResolver0.insert(uri0, contentValues0);
                    }
                }
            }
        }
    }

    private final boolean d() {
        return bbou.a(this.getContext());
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        if(!this.d()) {
            GservicesChimeraProvider.e("dump");
        }
        bbpd bbpd0 = new bbpd(printWriter0, "  ");
        SQLiteDatabase sQLiteDatabase0 = this.i.getReadableDatabase();
        if(Objects.equals(Build.TYPE, "userdebug") || Objects.equals(Build.TYPE, "eng")) {
            try(SQLiteStatement sQLiteStatement0 = sQLiteDatabase0.compileStatement("SELECT " + GservicesChimeraProvider.e[1] + " FROM main WHERE " + GservicesChimeraProvider.e[0] + "=\'android_id\'")) {
                try {
                    bbpd0.println("AndroidId: " + Long.toHexString(Long.valueOf(sQLiteStatement0.simpleQueryForString()).longValue()).toLowerCase(Locale.US));
                }
                catch(SQLiteDoneException unused_ex) {
                    bbpd0.println("AndroidId not found.");
                }
            }
        }
        bbpd0.println("Gservices overrides:");
        bbpd0.b();
        String[] arr_s1 = GservicesChimeraProvider.e;
        Cursor cursor0 = sQLiteDatabase0.query(false, "overrides", arr_s1, null, null, null, null, null, null);
        if(cursor0 != null) {
            cursor0.moveToFirst();
            while(!cursor0.isAfterLast()) {
                String s = cursor0.getString(cursor0.getColumnIndex(arr_s1[0]));
                if(cursor0.isNull(cursor0.getColumnIndex(arr_s1[1]))) {
                    bbpd0.c(s, "null");
                }
                else {
                    bbpd0.c(s, cursor0.getString(cursor0.getColumnIndex(arr_s1[1])));
                }
                bbpd0.println();
                cursor0.moveToNext();
            }
            cursor0.close();
        }
    }

    private static final void e(String s) {
        Log.w("GservicesProvider", String.format("Provider is only supported on API 35+. But there is an unexpected method call %s. Current SDK_INT is %d and CODENAME is %s", s, ((int)Build.VERSION.SDK_INT), Build.VERSION.CODENAME));
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri0) {
        return null;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        if(!this.d()) {
            GservicesChimeraProvider.e("onCreate");
            return false;
        }
        Context context0 = this.getContext();
        int v = Process.myUid();
        int v1 = Process.myPid();
        this.f = context0.checkPermission("android.permission.WRITE_SETTINGS", v1, v) == 0;
        this.g = context0.checkPermission("android.permission.WRITE_SECURE_SETTINGS", v1, v) == 0;
        if(Log.isLoggable("GservicesProvider", 4)) {
            Log.i("GservicesProvider", String.format("Gservices pushing to system: %s; secure/global: %s", Boolean.valueOf(this.f), Boolean.valueOf(this.g)));
        }
        bwfy bwfy0 = bwfy.c(context0, false);
        this.h = bwfy0;
        this.i = bwfy0.b();
        return true;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        if(!this.d()) {
            GservicesChimeraProvider.e("query");
            return null;
        }
        Cursor cursor0 = new MatrixCursor(GservicesChimeraProvider.d);
        if(arr_s1 != null) {
            String s2 = uri0.getLastPathSegment();
            if(s2 == null) {
                bwfy bwfy0 = this.h;
                Context context0 = this.getContext();
                int v1 = Binder.getCallingUid();
                String s3 = this.getCallingPackage();
                TreeMap treeMap0 = bwfy0.d();
                for(int v = 0; v < arr_s1.length; ++v) {
                    String s4 = arr_s1[v];
                    hqvp hqvp0 = hqvp.a;
                    if(!hqvp0.b().b()) {
                    }
                    else if(s4.equals("android_id") && v1 != Process.myUid()) {
                        if(s3 == null) {
                            bwfu.a(s4, (hqvp0.b().c() ? "0" : null), ((MatrixCursor)cursor0));
                            continue;
                        }
                        else if(!azql.c(context0).g(s3)) {
                            if(hqvp0.b().a()) {
                                if(bwfy0.a == null) {
                                    bwfy0.a = (DevicePolicyManager)context0.getSystemService("device_policy");
                                }
                                if(bwfy0.a == null || !bwfy0.a.isDeviceOwnerApp(s3) && !bwfy0.a.isProfileOwnerApp(s3)) {
                                    Log.w("GservicesPersistence", a.a(s3, "Package ", " is not approved to access the device ID"));
                                    bwfu.a(s4, (hqvp0.b().c() ? "0" : null), ((MatrixCursor)cursor0));
                                    continue;
                                }
                            }
                            else {
                                Log.w("GservicesPersistence", a.a(s3, "Package ", " is not approved to access the device ID"));
                                bwfu.a(s4, (hqvp0.b().c() ? "0" : null), ((MatrixCursor)cursor0));
                                continue;
                            }
                        }
                    }
                    bwfu.a(s4, ((String)treeMap0.get(s4)), ((MatrixCursor)cursor0));
                }
                return cursor0;
            }
            if(s2.equals(fftn.b.getLastPathSegment())) {
                this.a(((MatrixCursor)cursor0), arr_s1);
                return cursor0;
            }
            if(s2.equals(GservicesChimeraProvider.b.getLastPathSegment())) {
                if(arr_s1.length != 1) {
                    Log.w("GservicesProvider", "Settings default table query only supports query for single table.");
                    return cursor0;
                }
                String s5 = arr_s1[0];
                if(!GservicesChimeraProvider.c.contains(s5)) {
                    Log.w("GservicesProvider", String.format("Unexpected settings default table name: %s", s5));
                    return cursor0;
                }
                try(Cursor cursor1 = this.i.getReadableDatabase().rawQuery("SELECT name, value FROM " + s5, null)) {
                    while(true) {
                        if(!cursor1.moveToNext()) {
                            break;
                        }
                        ((MatrixCursor)cursor0).addRow(new String[]{cursor1.getString(0), cursor1.getString(1)});
                    }
                }
                return cursor0;
            }
        }
        return cursor0;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        if(!this.d()) {
            GservicesChimeraProvider.e("update");
            return 0;
        }
        String s1 = uri0.getLastPathSegment();
        if(Objects.equals(s1, "main")) {
            ContentResolver contentResolver0 = this.getContext().getContentResolver();
            SQLiteDatabase sQLiteDatabase0 = this.i.getWritableDatabase();
            sQLiteDatabase0.beginTransaction();
            try {
                sQLiteDatabase0.execSQL("DELETE FROM main");
                if(contentValues0 != null) {
                    SQLiteStatement sQLiteStatement0 = sQLiteDatabase0.compileStatement("INSERT INTO main (name, value) VALUES (?, ?)");
                    try {
                        for(Object object0: contentValues0.valueSet()) {
                            String s2 = (String)((Map.Entry)object0).getKey();
                            String s3 = (String)((Map.Entry)object0).getValue();
                            if(s3 != null) {
                                sQLiteStatement0.bindString(1, s2);
                                sQLiteStatement0.bindString(2, s3);
                                sQLiteStatement0.execute();
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(sQLiteStatement0, throwable0);
                        throw throwable0;
                    }
                    if(sQLiteStatement0 != null) {
                        sQLiteStatement0.close();
                    }
                }
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
            this.h.e();
            this.b();
            contentResolver0.notifyChange(fftn.a, null, 0x8000);
            if(Log.isLoggable("GservicesProvider", 4)) {
                Log.i("GservicesProvider", "main update completed");
            }
        }
        else if(Objects.equals(s1, "main_diff")) {
            Log.i("GservicesProvider", "updating main diff");
            ContentResolver contentResolver1 = this.getContext().getContentResolver();
            if(contentValues0 != null) {
                SQLiteDatabase sQLiteDatabase1 = this.i.getWritableDatabase();
                SQLiteStatement sQLiteStatement1 = sQLiteDatabase1.compileStatement("INSERT OR REPLACE INTO main (name, value) VALUES (?, ?)");
                SQLiteStatement sQLiteStatement2 = sQLiteDatabase1.compileStatement("DELETE FROM main WHERE name = ?");
                try {
                    for(Object object1: contentValues0.valueSet()) {
                        String s4 = (String)((Map.Entry)object1).getKey();
                        String s5 = (String)((Map.Entry)object1).getValue();
                        if(s5 == null) {
                            sQLiteStatement2.bindString(1, s4);
                            sQLiteStatement2.execute();
                        }
                        else {
                            sQLiteStatement1.bindString(1, s4);
                            sQLiteStatement1.bindString(2, s5);
                            sQLiteStatement1.execute();
                        }
                    }
                }
                finally {
                    sQLiteStatement1.close();
                    sQLiteStatement2.close();
                }
            }
            this.h.e();
            this.b();
            contentResolver1.notifyChange(fftn.a, null, 0x8000);
            if(Log.isLoggable("GservicesProvider", 4)) {
                Log.i("GservicesProvider", "main difference update completed");
            }
        }
        else if(Objects.equals(s1, "override")) {
            ContentResolver contentResolver2 = this.getContext().getContentResolver();
            SQLiteDatabase sQLiteDatabase2 = this.i.getWritableDatabase();
            if(contentValues0 != null && !contentValues0.isEmpty()) {
                SQLiteStatement sQLiteStatement3 = sQLiteDatabase2.compileStatement("INSERT OR REPLACE INTO overrides (name, value) VALUES (?, ?)");
                try {
                    SQLiteStatement sQLiteStatement4 = sQLiteDatabase2.compileStatement("DELETE FROM overrides WHERE name = ?");
                    try {
                        for(Object object2: contentValues0.valueSet()) {
                            String s6 = (String)((Map.Entry)object2).getKey();
                            String s7 = (String)((Map.Entry)object2).getValue();
                            if(s7 == null) {
                                sQLiteStatement4.bindString(1, s6);
                                sQLiteStatement4.execute();
                            }
                            else {
                                sQLiteStatement3.bindString(1, s6);
                                sQLiteStatement3.bindString(2, s7);
                                sQLiteStatement3.execute();
                            }
                        }
                    }
                    catch(Throwable throwable2) {
                        TWR.safeClose$NT(sQLiteStatement4, throwable2);
                        throw throwable2;
                    }
                    if(sQLiteStatement4 != null) {
                        sQLiteStatement4.close();
                    }
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(sQLiteStatement3, throwable1);
                    throw throwable1;
                }
                if(sQLiteStatement3 != null) {
                    sQLiteStatement3.close();
                }
                this.i.a = true;
            }
            else {
                sQLiteDatabase2.execSQL("DELETE FROM overrides");
                this.i.a = false;
            }
            this.h.e();
            this.b();
            contentResolver2.notifyChange(fftn.a, null, 0x8000);
            if(Log.isLoggable("GservicesProvider", 4)) {
                Log.i("GservicesProvider", "override update completed");
            }
        }
        else {
            Log.w("GservicesProvider", String.format("bad Gservices update URI: %s", uri0));
        }
        this.getContext().sendBroadcast(new Intent("com.google.gservices.intent.action.GSERVICES_CHANGED"));
        return 0;
    }
}

