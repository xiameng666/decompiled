package com.google.android.gms.nearby.fastpair.audio.control;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cyal;
import cyam;
import ggtj;
import gxye;
import gxyf;
import j..util.Objects;

public class ActiveNoiseCancellationModule.1 extends TracingBroadcastReceiver {
    final cyam a;

    public ActiveNoiseCancellationModule.1(cyam cyam0) {
        Objects.requireNonNull(cyam0);
        this.a = cyam0;
        super("nearby", "IndexChangeReceiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(!"com.google.android.gms.nearby.fastpair.ACTION_SET_ANC_INDEX".equals(intent0.getAction())) {
            return;
        }
        if(!intent0.getBooleanExtra("EXTRA_ANC_ENABLED", true)) {
            ((ggtj)this.a.b.d().ar(7713)).x("ActiveNoiseCancellationModule: the ANC is in disabled state, skip updating.");
            return;
        }
        if(intent0.getBooleanExtra("EXTRA_ANC_ACTIVE", false)) {
            ((ggtj)this.a.b.d().ar(0x1E20)).x("ActiveNoiseCancellationModule: the ANC is already active, skip updating.");
            return;
        }
        String s = intent0.getStringExtra("EXTRA_ADDRESS");
        int v = intent0.getIntExtra("EXTRA_ANC_INDEX", -1);
        if(!TextUtils.isEmpty(s) && v >= 0) {
            cyal cyal0 = new cyal(this.a, s, v);
            this.a.e.execute(cyal0);
            return;
        }
        ((ggtj)this.a.b.g().ar(0x1E1F)).P("ActiveNoiseCancellationModule: failed to update ANC index, %s, index=%d", gxyf.b(gxye.a, s), v);
    }
}

