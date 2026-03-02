package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fxfs;
import j..util.Objects;

public class ScreenStateListener.1 extends TracingBroadcastReceiver {
    final fxfs a;

    public ScreenStateListener.1(fxfs fxfs0) {
        Objects.requireNonNull(fxfs0);
        this.a = fxfs0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        boolean z;
        fxfs fxfs0;
        if(intent0 != null && intent0.getAction() != null) {
            intent0.getAction();
            String s = intent0.getAction();
            switch(s.hashCode()) {
                case 0x81271581: {
                    if(s.equals("android.intent.action.SCREEN_OFF")) {
                        fxfs0 = this.a;
                        z = false;
                        fxfs0.a = z;
                        return;
                    }
                    break;
                }
                case 0xA953D76D: {
                    if(s.equals("android.intent.action.SCREEN_ON")) {
                        fxfs0 = this.a;
                        z = true;
                        fxfs0.a = z;
                        return;
                    }
                    break;
                }
            }
        }
    }
}

