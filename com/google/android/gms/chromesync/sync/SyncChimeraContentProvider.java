package com.google.android.gms.chromesync.sync;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import bbdg;
import ccmq;
import com.google.android.chimera.ContentProvider;

public class SyncChimeraContentProvider extends ContentProvider {
    @Override  // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        ccmq.a().a(bbdg.qW);
        return true;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        throw new UnsupportedOperationException();
    }
}

