package com.google.android.gms.nearby.sharing.common.repository;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ibom;
import ibuq;
import icgy;
import icha;
import ichm;

public final class RadioStatusRepository.radioChangeEvents.3.receiver.1 extends TracingBroadcastReceiver {
    final ichm a;

    public RadioStatusRepository.radioChangeEvents.3.receiver.1(ichm ichm0) {
        this.a = ichm0;
        super("nearby", "RadioChangeReceiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        String s = intent0.getAction();
        if(s != null) {
            switch(s.hashCode()) {
                case 0x90329445: {
                    if(s.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                        switch(intent0.getIntExtra("wifi_state", 4)) {
                            case 1: 
                            case 3: {
                                goto label_9;
                            }
                        }
                        return;
                    label_9:
                        Object object0 = this.a.b(ibom.a);
                        if(!icha.c(object0) && !(object0 instanceof icgy)) {
                            throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
                        }
                    }
                    break;
                }
                case -1530327060: {
                    if(s.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        switch(intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", 0x80000000)) {
                            case 10: 
                            case 12: {
                                goto label_15;
                            }
                        }
                        return;
                    label_15:
                        Object object1 = this.a.b(ibom.a);
                        if(!icha.c(object1) && !(object1 instanceof icgy)) {
                            throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
                        }
                    }
                    break;
                }
                case 0xBFD4BDCB: {
                    if(s.equals("android.intent.action.AIRPLANE_MODE")) {
                        goto label_21;
                    }
                    break;
                }
                case 0xE1869F52: {
                    if(s.equals("android.location.MODE_CHANGED")) {
                    label_21:
                        Object object2 = this.a.b(ibom.a);
                        if(!icha.c(object2) && !(object2 instanceof icgy)) {
                            throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
                        }
                    }
                    break;
                }
                case 0x186F64D7: {
                    if(s.equals("android.net.wifi.WIFI_AP_STATE_CHANGED")) {
                        switch(intent0.getIntExtra("wifi_state", 4)) {
                            case 11: 
                            case 13: {
                                Object object3 = this.a.b(ibom.a);
                                if(!icha.c(object3) && !(object3 instanceof icgy)) {
                                    throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
                                }
                                break;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
}

