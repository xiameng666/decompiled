package com.google.mlkit.vision.document.detect;

import androidx.lifecycle.OnLifecycleEvent;
import azty;
import hbwd;
import lpe;

public interface DocumentDetector extends azty, hbwd {
    @Override
    @OnLifecycleEvent(a = lpe.ON_DESTROY)
    void close();
}

