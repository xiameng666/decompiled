package com.google.android.openscreen;

import android.util.Log;
import fzdu;

public final class OpenScreen {
    public static boolean a;
    public static boolean b;

    public final fzdu a(int v, int v1, int v2, int v3, int v4, int v5, byte[] arr_b, byte[] arr_b1, int v6) {
        try {
            return new fzdu(this, this.createOpenScreenSender(v, v1, v2, v3, v4, v5, arr_b, arr_b1, v6));
        }
        catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
            Log.e("OpenScreen", "Native library isn\'t initialized.", unsatisfiedLinkError0);
            return new fzdu(this, -1);
        }
    }

    public final native int createOpenScreenSender(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, byte[] arg8, int arg9) {
    }

    public final native int createSenderSessionNative(String arg1, String arg2, int arg3) {
    }

    public final native int enqueueFrame(int arg1, int arg2, int arg3, long arg4, long arg5, boolean arg6, int arg7, long arg8, long arg9, byte[] arg10) {
    }

    public final native int getEstimatedNetworkBandwidthNative(int arg1) {
    }

    public final native int getNextFrameId(int arg1) {
    }

    public final native byte[] getSenderStatsNative(int arg1) {
    }

    public final native int initializeNative() {
    }

    public final native void releaseOpenScreenSender(int arg1) {
    }

    public final native void releaseSenderSessionNative(int arg1) {
    }

    public final native void shutdownNative() {
    }
}

