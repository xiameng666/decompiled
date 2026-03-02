package com.google.android.gmscore.integ.modules.nearby.src.jni.webrtc;

import igrz;

public final class NearbyAudioDecoderFactoryFactory implements igrz {
    @Override  // igrz
    public final long a() {
        return NearbyAudioDecoderFactoryFactory.nativeCreateNearbyAudioDecoderFactory();
    }

    private static native long nativeCreateNearbyAudioDecoderFactory() {
    }
}

