package com.google.android.gmscore.integ.modules.nearby.src.jni.webrtc;

import igsa;
import org.webrtc.Logging;

public final class NearbyAudioEncoderFactoryFactory implements igsa {
    @Override  // igsa
    public final long a() {
        Logging.a("NearbyAudioEncoderFactoryFactory", "Creating native NearbyEncoderFactory.");
        return NearbyAudioEncoderFactoryFactory.nativeCreateNearbyAudioEncoderFactory();
    }

    public static NearbyAudioEncoderFactoryFactory b() {
        Logging.a("NearbyAudioEncoderFactoryFactory", "Creating instance.");
        return new NearbyAudioEncoderFactoryFactory();
    }

    private static native long nativeCreateNearbyAudioEncoderFactory() {
    }
}

