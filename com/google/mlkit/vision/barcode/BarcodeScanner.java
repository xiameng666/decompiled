package com.google.mlkit.vision.barcode;

import androidx.lifecycle.OnLifecycleEvent;
import azty;
import evql;
import hbtp;
import hbwd;
import lpe;

public interface BarcodeScanner extends azty, hbwd {
    evql a(hbtp arg1);

    @Override
    @OnLifecycleEvent(a = lpe.ON_DESTROY)
    void close();
}

