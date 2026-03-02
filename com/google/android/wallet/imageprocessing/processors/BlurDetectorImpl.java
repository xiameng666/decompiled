package com.google.android.wallet.imageprocessing.processors;

import android.graphics.Rect;
import android.util.Log;
import com.google.android.wallet.imageprocessing.base.CameraImage;
import gcos;

public class BlurDetectorImpl {
    private final gcos a;
    private int b;
    private int c;
    private byte[] d;
    private byte[] e;

    public BlurDetectorImpl(gcos gcos0) {
        this.a = gcos0;
    }

    public final boolean a(CameraImage cameraImage0, Rect rect0) {
        this.a.b();
        if(rect0 == null) {
            Log.w("BlurDetectorImpl", "isBlurred called with null roi");
            return true;
        }
        if(this.d == null || this.b != cameraImage0.getWidth() || this.c != cameraImage0.getHeight()) {
            this.b = cameraImage0.getWidth();
            int v = cameraImage0.getHeight();
            this.c = v;
            int v1 = this.b;
            this.d = new byte[v1 * 4 * v];
            this.e = new byte[Math.max(v1, v) * 4];
        }
        return this.isBlurryNative(cameraImage0.getData(), cameraImage0.getWidth(), cameraImage0.getHeight(), rect0.left, rect0.top, rect0.right, rect0.bottom, this.d, this.e);
    }

    private native boolean isBlurryNative(byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, byte[] arg9) {
    }
}

