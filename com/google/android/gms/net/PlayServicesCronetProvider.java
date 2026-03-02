package com.google.android.gms.net;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import azqi;
import azqj;
import batl;
import bjia;
import djit;
import djiw;
import djix;
import java.util.Arrays;
import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine.Builder;
import org.chromium.net.ICronetEngineBuilder;

public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context0) {
        super(context0);
    }

    @Override  // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        CronetEngine.Builder cronetEngine$Builder0;
        new djix("GMS PlayServicesCronetProvider#createBuilder");
        try {
            try {
                djit.b(this.mContext);
            }
            catch(azqj azqj0) {
                throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", azqj0);
            }
            catch(azqi azqi0) {
                throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", azqi0);
            }
            try(djiw djiw0 = new djiw(this.mContext, 37402, 0.01f)) {
                HttpEngineProviderSingleton httpEngineProviderSingleton0 = HttpEngineProviderSingleton.getInstance(this.mContext);
                if(httpEngineProviderSingleton0.shouldUseHttpEngine()) {
                    cronetEngine$Builder0 = httpEngineProviderSingleton0.getHttpEngineProvider().createBuilder();
                    djiw0.a();
                }
                else {
                    bjia bjia0 = djit.a();
                    batl.s(bjia0);
                    ClassLoader classLoader0 = bjia0.g.getClassLoader();
                    batl.s(classLoader0);
                    ExperimentalCronetEngine.Builder experimentalCronetEngine$Builder0 = new ExperimentalCronetEngine.Builder(((ICronetEngineBuilder)PlayServicesCronetProvider.subclassNativeCronetEngine(classLoader0).getConstructor(Context.class).newInstance(this.mContext)));
                    djiw0.a();
                    cronetEngine$Builder0 = experimentalCronetEngine$Builder0;
                }
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", reflectiveOperationException0);
            }
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
        Trace.endSection();
        return cronetEngine$Builder0;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider)object0).mContext);
    }

    @Override  // org.chromium.net.CronetProvider
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override  // org.chromium.net.CronetProvider
    public String getVersion() {
        HttpEngineProviderSingleton httpEngineProviderSingleton0 = HttpEngineProviderSingleton.getInstance(this.mContext);
        if(httpEngineProviderSingleton0.shouldUseHttpEngine()) {
            return httpEngineProviderSingleton0.getHttpEngineProvider().getVersion();
        }
        this.tryToInstallCronetProvider();
        return djit.b;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override  // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        if(HttpEngineProviderSingleton.getInstance(this.mContext).shouldUseHttpEngine()) {
            return true;
        }
        this.tryToInstallCronetProvider();
        return djit.c();
    }

    private static Class subclassNativeCronetEngine(ClassLoader classLoader0) {
        try {
            return classLoader0.loadClass("org.chromium.net.impl.NativeCronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class);
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException(String.format("Failed to subclass native cronet engine!, NativeCronetEngineBuilderImpl Classloader: %s, ICronetEngineBuilder Classloader: %s", classLoader0, ICronetEngineBuilder.class.getClassLoader()), classCastException0);
        }
    }

    private void tryToInstallCronetProvider() {
        try {
            djit.b(this.mContext);
        }
        catch(azqj unused_ex) {
            if(Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
        catch(azqi unused_ex) {
            if(Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        }
    }
}

