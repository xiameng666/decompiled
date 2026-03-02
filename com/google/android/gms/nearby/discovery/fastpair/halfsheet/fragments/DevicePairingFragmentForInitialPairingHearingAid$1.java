package com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cxbk;
import j..util.Objects;

public class DevicePairingFragmentForInitialPairingHearingAid.1 extends TracingBroadcastReceiver {
    final cxbk a;

    public DevicePairingFragmentForInitialPairingHearingAid.1(cxbk cxbk0) {
        Objects.requireNonNull(cxbk0);
        this.a = cxbk0;
        super("CsisSetMemberAvailable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "android.bluetooth.action.CSIS_SET_MEMBER_AVAILABLE")) {
            this.a.ah.d().x("DevicePairingFragment: abort CSIS set member available");
            this.abortBroadcast();
        }
    }
}

