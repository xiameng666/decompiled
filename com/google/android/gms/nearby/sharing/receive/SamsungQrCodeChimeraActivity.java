package com.google.android.gms.nearby.sharing.receive;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import bbdg;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import dcvz;
import ddhu;
import dhjs;
import dhqo;
import dhqq;
import dhqu;
import dhqv;
import dhqw;
import dhrl;
import dhrv;
import dhsb;
import gze;
import ibnn;
import ibuk;
import ibuq;
import icbb;
import iceb;
import iced;
import lpt;
import lsd;

@GmsCoreVeId(261020)
public final class SamsungQrCodeChimeraActivity extends dhjs {
    public dhrl f;
    private final ibnn g;
    private iced h;

    public SamsungQrCodeChimeraActivity() {
        dhqo dhqo0 = new dhqo(this);
        this.g = new lsd(new ibuk(dhsb.class), new dhqv(this), dhqo0, new dhqw(this));
    }

    public final dhsb b() {
        return (dhsb)this.g.a();
    }

    private final void c() {
        QrCodeMetadata qrCodeMetadata0 = ddhu.a(this.getIntent().getData(), false);
        if(qrCodeMetadata0 == null) {
            dcvz.a.e().h("Invalid QR code in intent %s", this.getIntent().getData());
            this.finish();
            return;
        }
        iced iced0 = this.h;
        if(iced0 != null) {
            iceb.a(iced0);
        }
        this.h = icbb.b(lpt.a(this), null, null, new dhqq(this, qrCodeMetadata0, null), 3);
    }

    @Override  // dhjs
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.az);
        super.onCreate(bundle0);
        dcvz.a.d().h("SamsungQrCodeChimeraActivity onCreate: %s", this.getIntent().getData());
        this.c();
        ComposeView composeView0 = new ComposeView(this, null, 0, 6, null);
        composeView0.a(new gze(1128799075, true, new dhqu(this)));
        this.setContentView(composeView0);
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        super.onNewIntent(intent0);
        dcvz.a.d().h("SamsungQrCodeChimeraActivity onNewIntent: %s", intent0.getData());
        this.setIntent(intent0);
        this.c();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        dcvz.a.d().h("SamsungQrCodeChimeraActivity onWindowFocusChanged: %s", Boolean.valueOf(z));
        if(z && ((dhrv)this.b().e.b()).a()) {
            this.finish();
        }
    }
}

