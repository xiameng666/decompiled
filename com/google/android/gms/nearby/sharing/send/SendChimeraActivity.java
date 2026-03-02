package com.google.android.gms.nearby.sharing.send;

import a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import bbdg;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import cuui;
import dagger.Lazy;
import dcpn;
import dcvf;
import dfre;
import dfrf;
import dhwg;
import dhxf;
import dhzy;
import dhzz;
import diaa;
import diab;
import dibd;
import dieu;
import dife;
import digh;
import digo;
import diwz;
import dixf;
import gze;
import hvqz;
import hvrc;
import ibnf;
import ibnn;
import ibuk;
import ibuq;
import iced;
import iceg;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kfv;
import lsd;
import lso;

@GmsCoreVeId(0x3FBA1)
public final class SendChimeraActivity extends dhwg {
    public final boolean f;
    public dieu g;
    public Lazy h;
    public ibnf i;
    public dcpn j;
    private final ibnn k;

    public SendChimeraActivity() {
        this.f = hvqz.a.b().aG();
        dhzz dhzz0 = new dhzz(this);
        this.k = new lsd(new ibuk(digo.class), new diaa(this), dhzz0, new diab(this));
    }

    public final dcpn b() {
        dcpn dcpn0 = this.j;
        if(dcpn0 != null) {
            return dcpn0;
        }
        ibuq.j("analyticsLogger");
        return null;
    }

    public final dieu c() {
        dieu dieu0 = this.g;
        if(dieu0 != null) {
            return dieu0;
        }
        ibuq.j("sendScreenPresenter");
        return null;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        String s1;
        Integer integer0;
        ibuq.f(s, "prefix");
        ibuq.f(printWriter0, "writer");
        if(hvrc.d()) {
            integer0 = ((digh)this.i()).a();
        }
        else {
            integer0 = ibuq.m(this.getIntent().getAction(), "android.intent.action.REMOTE_COPY") ? ((int)1) : ((int)0);
        }
        int v = integer0.intValue();
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        printWriter0.write(s);
        printWriter0.write("SendActivity\n");
        printWriter0.write(s);
        printWriter0.write("  UI State: ");
        printWriter0.write(((dife)this.c().e.b()).toString());
        printWriter0.write("\n");
        printWriter0.write(s);
        Uri uri0 = this.getReferrer();
        printWriter0.write(a.a((uri0 == null ? null : uri0.getHost()), "  Referrer package name: ", "\n"));
        printWriter0.write(s);
        switch(v) {
            case 0: {
                s1 = "NEARBY_SHARE";
                break;
            }
            case 1: {
                s1 = "REMOTE_COPY";
                break;
            }
            case 2: {
                s1 = "WIFI_CREDENTIAL";
                break;
            }
            case 3: {
                s1 = "APP_SHARE";
                break;
            }
            case 4: {
                s1 = "QUICK_SETTING_FILE_SHARE";
                break;
            }
            case 5: {
                s1 = "SETUP_WIZARD";
                break;
            }
            case 6: {
                s1 = "NEARBY_SHARE_WITH_QR_CODE";
                break;
            }
            case 7: {
                s1 = "REDIRECTED_FROM_BLUETOOTH_SHARE";
                break;
            }
            default: {
                s1 = a.f(v, "UNKNOWN[", "]");
            }
        }
        printWriter0.write(a.a(s1, "  Usecase: ", "\n"));
        printWriter0.flush();
    }

    public final digo f() {
        return (digo)this.k.a();
    }

    public final ibnf i() {
        ibnf ibnf0 = this.i;
        if(ibnf0 != null) {
            return ibnf0;
        }
        ibuq.j("sendUseCase");
        return null;
    }

    @Override  // dhwg
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.az);
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        ibuq.e(intent0, "getIntent(...)");
        Intent intent1 = dfrf.a(this, intent0, dfre.b);
        if(intent1 != null) {
            this.startActivity(intent1);
            this.finish();
            return;
        }
        if(hvqz.J()) {
            Lazy lazy0 = this.h;
            if(lazy0 == null) {
                ibuq.j("sendHatsMixin");
                lazy0 = null;
            }
            lazy0.get();
        }
        dcvf.b(this);
        kfv.a(this.getWindow(), false);
        diwz diwz0 = new diwz(new dixf(this, cuui.f()));
        this.getOnBackPressedDispatcher().b(new dhxf(this));
        dcpn dcpn0 = dcpn.f(this);
        ibuq.f(dcpn0, "<set-?>");
        this.j = dcpn0;
        if(bundle0 == null) {
            digo digo0 = this.f();
            Intent intent2 = this.getIntent();
            ibuq.e(intent2, "getIntent(...)");
            digo0.c(intent2);
        }
        ComposeView composeView0 = new ComposeView(this, null, 0, 6, null);
        composeView0.a(new gze(0xCC373F9A, true, new dhzy(this, diwz0, composeView0)));
        this.setContentView(composeView0);
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        super.onNewIntent(intent0);
        this.setIntent(intent0);
        this.f().c(intent0);
        if(hvqz.J()) {
            dibd dibd0 = (dibd)new lso(this).b(new ibuk(dibd.class));
            iced iced0 = dibd0.b();
            Object object0 = dibd0.a.getAndSet(iced0);
            ibuq.e(object0, "getAndSet(...)");
            iceg.b(((iced)object0), "new intent");
        }
    }
}

