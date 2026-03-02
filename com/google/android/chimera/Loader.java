package com.google.android.chimera;

import android.content.Context;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import lvb;
import wwp;

@ChimeraApiVersion(added = 0L)
@Deprecated
public abstract class Loader {
    private WeakHashMap a;
    private WeakHashMap b;
    protected lvb proxy;
    protected wwp proxyCallbacks;

    public Loader(Context context0) {
        Fragment.deprecationCheck();
        this.setProxy(new LoaderProxy(this, context0));
    }

    public void abandon() {
        this.proxyCallbacks.super_abandon();
    }

    public boolean cancelLoad() {
        return this.proxyCallbacks.super_cancelLoad();
    }

    public void commitContentChanged() {
        this.proxyCallbacks.super_commitContentChanged();
    }

    public String dataToString(Object object0) {
        return this.proxyCallbacks.super_dataToString(object0);
    }

    public void deliverCancellation() {
        this.proxyCallbacks.super_deliverCancellation();
    }

    public void deliverResult(Object object0) {
        this.proxyCallbacks.super_deliverResult(object0);
    }

    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        this.proxyCallbacks.super_dump(s, fileDescriptor0, printWriter0, arr_s);
    }

    public void forceLoad() {
        this.proxyCallbacks.super_forceLoad();
    }

    public static wwp getCallbacksUnsafe(lvb lvb0) {
        return (wwp)lvb0;
    }

    public lvb getContainerLoader() {
        return this.proxy;
    }

    public Context getContext() {
        return this.proxyCallbacks.super_getContext();
    }

    public int getId() {
        return this.proxyCallbacks.super_getId();
    }

    public boolean isAbandoned() {
        return this.proxyCallbacks.super_isAbandoned();
    }

    public boolean isReset() {
        return this.proxyCallbacks.super_isReset();
    }

    public boolean isStarted() {
        return this.proxyCallbacks.super_isStarted();
    }

    protected void onAbandon() {
        this.proxyCallbacks.super_onAbandon();
    }

    protected boolean onCancelLoad() {
        return this.proxyCallbacks.super_onCancelLoad();
    }

    public void onContentChanged() {
        this.proxyCallbacks.super_onContentChanged();
    }

    protected void onForceLoad() {
        this.proxyCallbacks.super_onForceLoad();
    }

    protected void onReset() {
        this.proxyCallbacks.super_onReset();
    }

    protected void onStartLoading() {
        this.proxyCallbacks.super_onStartLoading();
    }

    protected void onStopLoading() {
        this.proxyCallbacks.super_onStopLoading();
    }

    public void registerListener(int v, Loader.OnLoadCompleteListener loader$OnLoadCompleteListener0) {
        Loader.OnLoadCompleteListenerWrapper loader$OnLoadCompleteListenerWrapper0;
        synchronized(this) {
            if(this.a == null) {
                this.a = new WeakHashMap();
            }
            WeakReference weakReference0 = (WeakReference)this.a.get(loader$OnLoadCompleteListener0);
            if(weakReference0 == null) {
                loader$OnLoadCompleteListenerWrapper0 = new Loader.OnLoadCompleteListenerWrapper(loader$OnLoadCompleteListener0);
                this.a.put(loader$OnLoadCompleteListener0, new WeakReference(loader$OnLoadCompleteListenerWrapper0));
            }
            else {
                loader$OnLoadCompleteListenerWrapper0 = (Loader.OnLoadCompleteListenerWrapper)weakReference0.get();
                if(loader$OnLoadCompleteListenerWrapper0 == null) {
                    loader$OnLoadCompleteListenerWrapper0 = new Loader.OnLoadCompleteListenerWrapper(loader$OnLoadCompleteListener0);
                    this.a.put(loader$OnLoadCompleteListener0, new WeakReference(loader$OnLoadCompleteListenerWrapper0));
                }
            }
            this.proxyCallbacks.super_registerListener(v, loader$OnLoadCompleteListenerWrapper0);
        }
    }

    public void registerOnLoadCanceledListener(Loader.OnLoadCanceledListener loader$OnLoadCanceledListener0) {
        Loader.OnLoadCanceledListenerWrapper loader$OnLoadCanceledListenerWrapper0;
        synchronized(this) {
            if(this.b == null) {
                this.b = new WeakHashMap();
            }
            WeakReference weakReference0 = (WeakReference)this.b.get(loader$OnLoadCanceledListener0);
            if(weakReference0 == null) {
                loader$OnLoadCanceledListenerWrapper0 = new Loader.OnLoadCanceledListenerWrapper(loader$OnLoadCanceledListener0);
                this.b.put(loader$OnLoadCanceledListener0, new WeakReference(loader$OnLoadCanceledListenerWrapper0));
            }
            else {
                loader$OnLoadCanceledListenerWrapper0 = (Loader.OnLoadCanceledListenerWrapper)weakReference0.get();
                if(loader$OnLoadCanceledListenerWrapper0 == null) {
                    loader$OnLoadCanceledListenerWrapper0 = new Loader.OnLoadCanceledListenerWrapper(loader$OnLoadCanceledListener0);
                    this.b.put(loader$OnLoadCanceledListener0, new WeakReference(loader$OnLoadCanceledListenerWrapper0));
                }
            }
            this.proxyCallbacks.super_registerOnLoadCanceledListener(loader$OnLoadCanceledListenerWrapper0);
        }
    }

    public void reset() {
        this.proxyCallbacks.super_reset();
    }

    public void rollbackContentChanged() {
        this.proxyCallbacks.super_rollbackContentChanged();
    }

    protected void setProxy(lvb lvb0) {
        this.proxy = lvb0;
        this.proxyCallbacks = (wwp)lvb0;
    }

    public final void startLoading() {
        this.proxy.startLoading();
    }

    public void stopLoading() {
        this.proxyCallbacks.super_stopLoading();
    }

    public boolean takeContentChanged() {
        return this.proxyCallbacks.super_takeContentChanged();
    }

    @Override
    public String toString() {
        return this.proxyCallbacks.super_toString();
    }

    public void unregisterListener(Loader.OnLoadCompleteListener loader$OnLoadCompleteListener0) {
        synchronized(this) {
            WeakReference weakReference0 = (WeakReference)this.a.remove(loader$OnLoadCompleteListener0);
            Loader.OnLoadCompleteListenerWrapper loader$OnLoadCompleteListenerWrapper0 = weakReference0 == null ? null : ((Loader.OnLoadCompleteListenerWrapper)weakReference0.get());
            if(loader$OnLoadCompleteListenerWrapper0 != null) {
                this.proxyCallbacks.super_unregisterListener(loader$OnLoadCompleteListenerWrapper0);
            }
        }
    }

    public void unregisterOnLoadCanceledListener(Loader.OnLoadCanceledListener loader$OnLoadCanceledListener0) {
        synchronized(this) {
            WeakReference weakReference0 = (WeakReference)this.b.remove(loader$OnLoadCanceledListener0);
            Loader.OnLoadCanceledListenerWrapper loader$OnLoadCanceledListenerWrapper0 = weakReference0 == null ? null : ((Loader.OnLoadCanceledListenerWrapper)weakReference0.get());
            if(loader$OnLoadCanceledListenerWrapper0 != null) {
                this.proxyCallbacks.super_unregisterOnLoadCanceledListener(loader$OnLoadCanceledListenerWrapper0);
            }
        }
    }
}

