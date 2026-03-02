package com.google.android.chimera;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import luw;
import lux;
import lvb;
import wwc;
import wwf;

@ChimeraApiVersion(added = 0L)
@Deprecated
public class CursorLoader extends AsyncTaskLoader {
    public CursorLoader(Context context0) {
        super(context0);
        this.setProxy(new CursorLoaderProxy(this, context0));
    }

    public CursorLoader(Context context0, Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        super(context0);
        this.setProxy(new CursorLoaderProxy(this, context0, uri0, arr_s, s, arr_s1, s1));
    }

    @Override  // com.google.android.chimera.AsyncTaskLoader
    public luw getContainerLoader() {
        return this.getContainerLoader();
    }

    public lux getContainerLoader() {
        return (lux)this.proxy;
    }

    @Override  // com.google.android.chimera.AsyncTaskLoader
    public lvb getContainerLoader() {
        return this.getContainerLoader();
    }

    public String[] getProjection() {
        return this.getProxyCallbacks().super_getProjection();
    }

    @Override  // com.google.android.chimera.AsyncTaskLoader
    protected wwc getProxyCallbacks() {
        return this.getProxyCallbacks();
    }

    protected wwf getProxyCallbacks() {
        return (wwf)this.proxyCallbacks;
    }

    public String getSelection() {
        return this.getProxyCallbacks().super_getSelection();
    }

    public String[] getSelectionArgs() {
        return this.getProxyCallbacks().super_getSelectionArgs();
    }

    public String getSortOrder() {
        return this.getProxyCallbacks().super_getSortOrder();
    }

    public Uri getUri() {
        return this.getProxyCallbacks().super_getUri();
    }

    public Cursor loadInBackground() {
        return this.getProxyCallbacks().super_loadInBackground();
    }

    @Override  // com.google.android.chimera.AsyncTaskLoader
    public Object loadInBackground() {
        return this.loadInBackground();
    }

    public void setProjection(String[] arr_s) {
        this.getProxyCallbacks().super_setProjection(arr_s);
    }

    public void setSelection(String s) {
        this.getProxyCallbacks().super_setSelection(s);
    }

    public void setSelectionArgs(String[] arr_s) {
        this.getProxyCallbacks().super_setSelectionArgs(arr_s);
    }

    public void setSortOrder(String s) {
        this.getProxyCallbacks().super_setSortOrder(s);
    }

    public void setUri(Uri uri0) {
        this.getProxyCallbacks().super_setUri(uri0);
    }
}

