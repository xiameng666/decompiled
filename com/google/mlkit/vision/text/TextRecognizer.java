package com.google.mlkit.vision.text;

import androidx.lifecycle.OnLifecycleEvent;
import azty;
import evql;
import hbtp;
import hbwd;
import lpe;

public interface TextRecognizer extends azty, hbwd {
    evql a(hbtp arg1);

    @Override
    @OnLifecycleEvent(a = lpe.ON_DESTROY)
    void close();
}

