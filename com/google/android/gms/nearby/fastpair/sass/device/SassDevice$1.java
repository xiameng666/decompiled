package com.google.android.gms.nearby.fastpair.sass.device;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cymt;
import cymu;
import cyna;
import gfqz;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class SassDevice.1 extends TracingBroadcastReceiver {
    final Executor a;
    public final cyna b;

    public SassDevice.1(cyna cyna0, Executor executor0) {
        this.a = executor0;
        Objects.requireNonNull(cyna0);
        this.b = cyna0;
        super("nearby", "ConfigReceiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0 != null && intent0.hasExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ADDRESS")) {
            String s = intent0.getStringExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ADDRESS");
            if(!TextUtils.isEmpty(s) && gfqz.e(this.b.b.a.getAddress(), s)) {
                if("com.google.android.gms.nearby.fastpair.sass.device.ACTION_MULTI_POINT_CONFIG_CHANGE_BY_USER".equals(intent0.getAction())) {
                    if(intent0.hasExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ENABLE_MULTIPOINT")) {
                        cymt cymt0 = new cymt(this, intent0);
                        this.a.execute(cymt0);
                    }
                }
                else if("com.google.android.gms.nearby.fastpair.sass.device.ACTION_SWITCH_PREFERENCE_CHANGE_BY_USER".equals(intent0.getAction())) {
                    ArrayList arrayList0 = intent0.getIntegerArrayListExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_SWITCH_PREFERENCE_LIST");
                    if(arrayList0 != null) {
                        cymu cymu0 = new cymu(this, arrayList0);
                        this.a.execute(cymu0);
                    }
                }
            }
        }
    }
}

