package org.chromium.net.impl;

import android.content.Context;
import ifwq;
import ifws;
import ifyn;
import java.util.Arrays;
import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine.Builder;

public class JavaCronetProvider extends CronetProvider {
    public JavaCronetProvider(Context context0) {
        super(context0);
    }

    @Override  // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        if(HttpEngineNativeProvider.a()) {
            ifws ifws0 = (ifws)ifwq.a(this.mContext, false).a().get("Cronet_ForceHttpEngineInFallback");
            if(ifws0 != null && ifws0.a()) {
                return new HttpEngineNativeProvider(this.mContext).createBuilder();
            }
        }
        return new ExperimentalCronetEngine.Builder(new ifyn(this.mContext));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof JavaCronetProvider) && this.mContext.equals(((JavaCronetProvider)object0).mContext);
    }

    @Override  // org.chromium.net.CronetProvider
    public final String getName() {
        return "Fallback-Cronet-Provider";
    }

    @Override  // org.chromium.net.CronetProvider
    public final String getVersion() {
        return "140.0.7289.0";
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.mContext});
    }

    @Override  // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return true;
    }
}

