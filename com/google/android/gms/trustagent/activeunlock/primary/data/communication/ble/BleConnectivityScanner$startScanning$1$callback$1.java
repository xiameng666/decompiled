package com.google.android.gms.trustagent.activeunlock.primary.data.communication.ble;

import android.bluetooth.le.ScanResult;
import bsap;
import exrw;
import ggtj;
import iccl;
import icgz;
import ichm;

public final class BleConnectivityScanner.startScanning.1.callback.1 extends bsap {
    final exrw a;
    final ichm b;

    public BleConnectivityScanner.startScanning.1.callback.1(ichm ichm0, exrw exrw0) {
        this.b = ichm0;
        this.a = exrw0;
        super("trustagent", "BleScanner");
    }

    @Override  // bsap
    public final void b(int v) {
        iccl.h(this.b, "Failed with errorCode: " + v);
    }

    @Override  // bsap
    public final void c(int v, ScanResult scanResult0) {
        if(v == 1 && scanResult0 != null && (this.b.b(scanResult0) instanceof icgz)) {
            ((ggtj)this.a.a.j()).x("Failed to send scan result");
        }
    }
}

