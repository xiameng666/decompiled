package com.google.android.wallet.imageprocessing.processors;

import android.graphics.Rect;
import com.google.android.wallet.imageprocessing.base.CameraImage;
import gcos;

public class StrictCardDetector {
    public final gcos a;

    public StrictCardDetector(gcos gcos0) {
        this.a = gcos0;
    }

    public native StrictCardDetector.Result nativeDetect(CameraImage arg1, Rect arg2, float arg3, float arg4, int arg5) {
    }
}

