package com.google.android.gms.common.account;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import azrw;
import azrx;
import azry;
import azsk;
import azsl;
import baun;
import bbdg;
import bxjf;
import bxjh;
import ccmq;
import hyex;
import lso;
import xni;

public class SimpleDialogAccountPickerChimeraActivity extends xni {
    public static final baun j;
    public String k;
    public String l;
    public azsk m;
    public bxjh n;
    public ListView o;
    public int p;

    static {
        SimpleDialogAccountPickerChimeraActivity.j = new baun("CommonAccount", new String[]{"SimpleAccountPicker"});
    }

    public SimpleDialogAccountPickerChimeraActivity() {
        this.p = -1;
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        this.n.e(v, v1, intent0);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.jq);
        Intent intent0 = this.getIntent();
        Intent intent1 = null;
        if(intent0 != null) {
            Intent intent2 = azsl.a(intent0, this, false);
            if(intent2 != null) {
                azsk azsk0 = new azsk(intent2, 3);
                this.m = azsk0;
                this.setTheme(azsk0.i);
                this.setTitle(null);
            }
            intent1 = intent2;
        }
        super.onCreate(bundle0);
        if(intent0 == null) {
            SimpleDialogAccountPickerChimeraActivity.j.f("This activity cannot be called without an intent, finishing early", new Object[0]);
            this.finish();
            return;
        }
        if(intent1 == null) {
            SimpleDialogAccountPickerChimeraActivity.j.f("Caller package name could not be determined, finishing early", new Object[0]);
            this.finish();
            return;
        }
        if(bundle0 != null) {
            this.p = bundle0.getInt("key-selected-item", -1);
        }
        this.l = this.m.h;
        this.k = azsl.b(this.getApplication(), this.l);
        bxjf bxjf0 = new bxjf(this.getApplicationContext(), this.l, hyex.d());
        bxjf0.g = this.m.d;
        bxjf0.d(this.m.a);
        bxjf0.b = this.m.b;
        bxjf0.f = this.m.m;
        this.getApplicationContext();
        bxjf0.h = false;
        bxjf0.e = this.m.l;
        bxjh bxjh0 = (bxjh)new lso(this, bxjf0).a(bxjh.class);
        this.n = bxjh0;
        azrw azrw0 = new azrw(this);
        bxjh0.e.g(this, azrw0);
        this.n.f.g(this, new azrx(this));
        this.n.d.g(this, new azry(this));
        this.n.f();
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        this.n.g();
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("key-selected-item", this.p);
    }
}

