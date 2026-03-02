package com.google.android.gms.fido.authenticator.service.controllers;

import android.content.Context;
import android.content.Intent;
import blhc;
import blsz;
import bltb;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import gftb;
import j..util.Objects;

public class TurnOnBluetoothController.2 extends TracingBroadcastReceiver {
    final bltb a;

    public TurnOnBluetoothController.2(bltb bltb0) {
        Objects.requireNonNull(bltb0);
        this.a = bltb0;
        super("fido");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        if(s == null) {
            return;
        }
        switch(s) {
            case "com.google.android.gms.fido.authenticator.service.authenticator_activity_completion": {
                this.a.b(blhc.ar);
                blsz blsz1 = this.a.e;
                gftb.check(blsz1);
                blsz1.a(16);
                return;
            }
            case "com.google.android.gms.fido.authenticator.service.authenticator_activity_state_update": {
                int v = intent0.getIntExtra("turn_on_bluetooth_result", -1);
                this.a.b((v == 0 ? blhc.av : blhc.aw));
                blsz blsz0 = this.a.e;
                gftb.check(blsz0);
                blsz0.a(v);
                return;
            }
            default: {
                throw new IllegalArgumentException("Unknown action in Intent.");
            }
        }
    }
}

