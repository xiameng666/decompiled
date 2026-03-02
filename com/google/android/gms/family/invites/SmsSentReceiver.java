package com.google.android.gms.family.invites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import java.util.Locale;

public final class SmsSentReceiver extends TracingBroadcastReceiver {
    private final ResultReceiver a;

    public SmsSentReceiver(ResultReceiver resultReceiver0) {
        super("family");
        this.a = resultReceiver0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(!"com.google.android.gms.family.invites".equals(intent0.getAction())) {
            Log.e("Family", String.format(Locale.US, "[SmsSentReceiver] Intent action didn\'t match, ignoring"));
            return;
        }
        int v = this.getResultCode();
        Contact contact0 = new Contact();
        contact0.b = intent0.getStringExtra("display-name");
        contact0.a = intent0.getStringExtra("phone");
        contact0.f = intent0.getStringExtra("invitation-id");
        contact0.e = intent0.getStringExtra("invitation-message");
        contact0.d = intent0.getIntExtra("contact-id", -1);
        contact0.h = intent0.getIntExtra("num-messages", 1);
        intent0.getStringExtra("invitation-id");
        Bundle bundle0 = new Bundle();
        if(v == -1) {
            bundle0.putInt("result-code", 4);
        }
        else {
            bundle0.putInt("result-code", 3);
        }
        bundle0.putParcelable("contact", contact0);
        this.a.send(-1, bundle0);
    }
}

