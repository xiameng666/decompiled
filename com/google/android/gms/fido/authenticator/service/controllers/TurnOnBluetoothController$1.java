package com.google.android.gms.fido.authenticator.service.controllers;

import android.content.Context;
import android.content.Intent;
import blhc;
import bltb;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class TurnOnBluetoothController.1 extends TracingBroadcastReceiver {
    final bltb a;

    public TurnOnBluetoothController.1(bltb bltb0) {
        Objects.requireNonNull(bltb0);
        this.a = bltb0;
        super("fido");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        this.a.b(blhc.ap);
        this.a.b.a();
        this.a.e();
        this.a.c();
    }
}

