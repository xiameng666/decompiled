package com.google.android.gms.smartdevice.setup.ui;

import ProtoLiteMessage;
import android.nfc.NdefMessage;
import android.os.Bundle;
import android.os.Parcelable;
import bagv;
import baun;
import ca;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;
import eqny;
import eqqx;
import erlc;
import erld;
import ernf;
import erng;
import erqc;
import erqj;
import gftb;
import hftc;
import hfur;
import xnj;

@GmsCoreVeId(0x3FDAA)
public class D2DSourceNfcHandlerChimeraActivity extends xnj implements erlc, ernf {
    SourceLogManager h;
    private static final baun i;
    private eqny j;
    private boolean k;

    static {
        D2DSourceNfcHandlerChimeraActivity.i = new erqc(new String[]{"D2DSourceNfcHandlerActivity"});
    }

    private final void k() {
        erld.y(1, "Something went wrong", null, "OK", null, false).show(this.gy(), null);
    }

    private final void l(eqny eqny0) {
        D2DDevice d2DDevice0 = new D2DDevice();
        d2DDevice0.c = "unknown target device";
        d2DDevice0.a.add(Integer.valueOf(3));
        d2DDevice0.b = 1;
        d2DDevice0.a.add(Integer.valueOf(2));
        d2DDevice0.d = eqny0.b;
        d2DDevice0.a.add(Integer.valueOf(4));
        d2DDevice0.e = 0;
        d2DDevice0.a.add(Integer.valueOf(5));
        this.k = true;
        this.startActivity(D2DSetupChimeraActivity.o(this, d2DDevice0, 1, this.j.d, this.h));
    }

    @Override  // xnj
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        eqny eqny0 = null;
        bagv.f(this, null);
        this.setContentView(0x7F0E09E1);  // layout:smartdevice_fragment_container
        Parcelable[] arr_parcelable = this.getIntent().getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        if(arr_parcelable == null) {
            this.k();
            return;
        }
        NdefMessage ndefMessage0 = (NdefMessage)arr_parcelable[0];
        if(ndefMessage0 != null && ndefMessage0.getRecords().length != 0) {
            byte[] arr_b = ndefMessage0.getRecords()[0].getPayload();
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)eqny.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                eqny0 = (eqny)hftv0;
            }
            catch(hfur hfur0) {
                D2DSourceNfcHandlerChimeraActivity.i.g("Invalid BootstrapInfo proto.", hfur0, new Object[0]);
            }
            if(eqny0 == null) {
                this.k();
                return;
            }
            this.j = eqny0;
            if(eqny0.c == 0) {
                D2DSourceNfcHandlerChimeraActivity.i.f("Google Play services on target device is too old.", new Object[0]);
                this.k();
                return;
            }
            erqj erqj0 = erqj.a(this);
            if(erqj0 != null && erqj0.d()) {
                D2DSourceNfcHandlerChimeraActivity.i.d("Bluetooth already enabled. Skipping consent screen.", new Object[0]);
                this.l(this.j);
                this.finish();
                return;
            }
            if(bundle0 == null) {
                SourceLogManager sourceLogManager0 = new SourceLogManager(this);
                this.h = sourceLogManager0;
                sourceLogManager0.h(1, eqqx.a(this));
                erng erng0 = erng.y("Getting started", "To set up your other device, your phone\'s Bluetooth will be turned on, if it isn\'t on already", "Next");
                ca ca0 = new ca(this.gy());
                ca0.G(0x7F0B14C5, erng0);  // id:fragment_container
                ca0.a();
                return;
            }
            SourceLogManager sourceLogManager1 = (SourceLogManager)bundle0.getParcelable("smartdevice.sourceLogManager");
            gftb.check(sourceLogManager1);
            this.h = sourceLogManager1;
            sourceLogManager1.e = this;
            return;
        }
        this.k();
    }

    @Override  // xnj
    protected final void onDestroy() {
        super.onDestroy();
        if(!this.k && this.isFinishing()) {
            this.h.a();
        }
    }

    @Override  // xnj
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putParcelable("smartdevice.sourceLogManager", this.h);
    }

    @Override  // erlc
    public final void v(int v, int v1) {
        this.finish();
    }

    @Override  // ernf
    public final void y(int v) {
        if(v == 0) {
            this.h.d();
            this.l(this.j);
        }
        else {
            D2DSourceNfcHandlerChimeraActivity.i.f("Unknown text fragment id: " + v, new Object[0]);
        }
        this.finish();
    }
}

