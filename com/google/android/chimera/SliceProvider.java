package com.google.android.chimera;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.Collection;
import java.util.Set;
import xcv;

@ChimeraApiVersion(added = 0L)
public abstract class SliceProvider extends ContentProvider implements xcv {
    private SliceProvider.ProxyCallbacks a;

    @Override  // com.google.android.chimera.ContentProvider
    public Bundle call(String s, String s1, Bundle bundle0) {
        return this.a.superCall(s, s1, bundle0);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        return this.a.superDelete(uri0, s, arr_s);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri0) {
        return this.a.superGetType(uri0);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        return this.a.superInsert(uri0, contentValues0);
    }

    public Slice onBindSlice(Uri uri0, Set set0) {
        return this.a.superOnBindSlice(uri0, set0);
    }

    public PendingIntent onCreatePermissionRequest(Uri uri0) {
        return this.a.superOnCreatePermissionRequest(uri0);
    }

    public Collection onGetSliceDescendants(Uri uri0) {
        return this.a.superOnGetSliceDescendants(uri0);
    }

    public Uri onMapIntentToUri(Intent intent0) {
        return this.a.superOnMapIntentToUri(intent0);
    }

    public void onSlicePinned(Uri uri0) {
        this.a.superOnSlicePinned(uri0);
    }

    public void onSliceUnpinned(Uri uri0) {
        this.a.superOnSliceUnpinned(uri0);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, Bundle bundle0, CancellationSignal cancellationSignal0) {
        return this.a.superQuery(uri0, arr_s, bundle0, cancellationSignal0);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        return this.a.superQuery(uri0, arr_s, s, arr_s1, s1);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1, CancellationSignal cancellationSignal0) {
        return this.a.superQuery(uri0, arr_s, s, arr_s1, s1, cancellationSignal0);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public void setProxyCallbacks(ContentProvider.ProxyCallbacks contentProvider$ProxyCallbacks0, Context context0) {
        this.a = (SliceProvider.ProxyCallbacks)contentProvider$ProxyCallbacks0;
        super.setProxyCallbacks(contentProvider$ProxyCallbacks0, context0);
    }

    @Override  // com.google.android.chimera.ContentProvider, xcv
    public void setProxyCallbacks(Object object0, Context context0) {
        this.setProxyCallbacks(((ContentProvider.ProxyCallbacks)object0), context0);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        return this.a.superUpdate(uri0, contentValues0, s, arr_s);
    }
}

