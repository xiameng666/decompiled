package org.webrtc;

import android.content.Context;
import igsd;
import igso;
import igsp;

public class PeerConnectionFactory {
    private long a;
    private volatile igsp b;
    private volatile igsp c;
    private volatile igsp d;

    PeerConnectionFactory(long v) {
        PeerConnectionFactory.b();
        if(v == 0L) {
            throw new RuntimeException("Failed to initialize PeerConnectionFactory!");
        }
        this.a = v;
    }

    public final PeerConnection a(PeerConnection.RTCConfiguration peerConnection$RTCConfiguration0, PeerConnection.Observer peerConnection$Observer0) {
        this.e();
        long v = PeerConnection.nativeCreatePeerConnectionObserver(peerConnection$Observer0);
        if(v != 0L) {
            long v1 = PeerConnectionFactory.nativeCreatePeerConnection(this.a, peerConnection$RTCConfiguration0, null, v, null);
            return v1 == 0L ? null : new PeerConnection(v1);
        }
        return null;
    }

    public static void b() {
        synchronized(igsd.a) {
        }
        if(igsd.b && ContextUtils.getApplicationContext() != null) {
            return;
        }
        throw new IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
    }

    public final void c() {
        this.e();
        PeerConnectionFactory.nativeFreeFactory(this.a);
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = 0L;
    }

    public static void d(igso igso0) {
        ContextUtils.initialize(igso0.a);
        String s = igso0.c;
        synchronized(igsd.a) {
            if(igsd.b) {
                Logging.a("NativeLibrary", "Native library has already been loaded.");
            }
            else {
                Logging.a("NativeLibrary", "Loading native library: " + s);
                Logging.a("NativeLibrary", "Loading library: " + s);
                System.loadLibrary(s);
                igsd.b = true;
            }
        }
        PeerConnectionFactory.nativeInitializeAndroidGlobals();
        PeerConnectionFactory.nativeInitializeFieldTrials(igso0.b);
        Logging.a("PeerConnectionFactory", "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
        PeerConnectionFactory.nativeDeleteLoggable();
    }

    private final void e() {
        if(this.a != 0L) {
            return;
        }
        throw new IllegalStateException("PeerConnectionFactory has been disposed.");
    }

    private static native long nativeCreatePeerConnection(long arg0, PeerConnection.RTCConfiguration arg1, MediaConstraints arg2, long arg3, SSLCertificateVerifier arg4) {
    }

    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(Context arg0, PeerConnectionFactory.Options arg1, long arg2, long arg3, long arg4, long arg5, VideoEncoderFactory arg6, VideoDecoderFactory arg7, long arg8, long arg9, long arg10, long arg11, long arg12) {
    }

    private static native void nativeDeleteLoggable() {
    }

    private static native void nativeFreeFactory(long arg0) {
    }

    private static native void nativeInitializeAndroidGlobals() {
    }

    private static native void nativeInitializeFieldTrials(String arg0) {
    }

    private void onNetworkThreadReady() {
        this.b = igsp.a();
        Logging.a("PeerConnectionFactory", "onNetworkThreadReady");
    }

    private void onSignalingThreadReady() {
        this.d = igsp.a();
        Logging.a("PeerConnectionFactory", "onSignalingThreadReady");
    }

    private void onWorkerThreadReady() {
        this.c = igsp.a();
        Logging.a("PeerConnectionFactory", "onWorkerThreadReady");
    }
}

