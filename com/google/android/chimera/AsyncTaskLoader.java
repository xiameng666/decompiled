package com.google.android.chimera;

import android.content.Context;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import luw;
import lvb;
import wwc;

@ChimeraApiVersion(added = 0L)
@Deprecated
public abstract class AsyncTaskLoader extends Loader {
    public AsyncTaskLoader(Context context0) {
        super(context0);
        this.setProxy(new AsyncTaskLoaderProxy(this, context0));
    }

    public void cancelLoadInBackground() {
        this.getProxyCallbacks().super_cancelLoadInBackground();
    }

    public luw getContainerLoader() {
        return (luw)this.proxy;
    }

    @Override  // com.google.android.chimera.Loader
    public lvb getContainerLoader() {
        return this.getContainerLoader();
    }

    protected wwc getProxyCallbacks() {
        return (wwc)this.proxyCallbacks;
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.getProxyCallbacks().super_isLoadInBackgroundCanceled();
    }

    public abstract Object loadInBackground();

    public void onCanceled(Object object0) {
        this.getProxyCallbacks().super_onCanceled(object0);
    }

    protected Object onLoadInBackground() {
        return this.getProxyCallbacks().super_onLoadInBackground();
    }

    public void setUpdateThrottle(long v) {
        this.getProxyCallbacks().super_setUpdateThrottle(v);
    }

    public void waitForLoader() {
    }
}

