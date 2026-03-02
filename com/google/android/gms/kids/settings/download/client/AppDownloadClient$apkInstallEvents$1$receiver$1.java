package com.google.android.gms.kids.settings.download.client;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import cbpb;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ggtj;
import gvht;
import ibuq;
import icha;
import ichm;
import java.util.List;

public final class AppDownloadClient.apkInstallEvents.1.receiver.1 extends TracingBroadcastReceiver {
    final cbpb a;
    final List b;
    final long c;
    final ichm d;

    public AppDownloadClient.apkInstallEvents.1.receiver.1(cbpb cbpb0, List list0, ichm ichm0, long v) {
        this.a = cbpb0;
        this.b = list0;
        this.d = ichm0;
        this.c = v;
        super("app_download");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        if(ibuq.m(intent0.getStringExtra("package_name"), this.a.d)) {
            int v = intent0.getIntExtra("package_event", -1);
            List list0 = this.b;
            long v1 = this.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvht.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvht gvht0 = (gvht)hftp0.b_message;
            gvht0.b |= 2;
            gvht0.d = v;
            long v2 = SystemClock.elapsedRealtime() - v1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvht gvht1 = (gvht)hftp0.b_message;
            gvht1.b |= 1;
            gvht1.c = v2;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            list0.add(((gvht)hftv0));
            if(!icha.c(this.d.b(Integer.valueOf(v)))) {
                ((ggtj)cbpb.b.j()).z("Sending install event %s to UI failed", v);
            }
        }
    }
}

