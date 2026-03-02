package com.google.android.gms.quickstart.xos;

import android.content.Intent;
import android.os.Bundle;
import baun;
import ca;
import com.google.android.gms.quickstart.XosLaunchParameters;
import ejlk;
import ejlm;
import ejlq;
import ejna;
import ejnb;
import ejnk;
import ejnq;
import gaiy;
import hxrq;
import lso;
import xni;

public class XosLauncherChimeraActivity extends xni implements ejlm {
    public static final baun j;
    private ejna k;
    private ejnk l;

    static {
        XosLauncherChimeraActivity.j = new baun("QuickStart", new String[]{"XosLauncherActivity"});
    }

    @Override  // ejlm
    public final void a(int v) {
        ejlk ejlk0 = (ejlk)this.l.a.ij();
        if(ejlk0.a()) {
            ejna ejna0 = this.k;
            if(!ejlk0.a()) {
                throw new IllegalStateException("Builder is not ready!");
            }
            ejna0.b(new XosLaunchParameters(ejlk0.a, ejlk0.b, ejlk0.c, ejlk0.d), ejna.a(this.getIntent()));
            this.setResult(999);
            this.finish();
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void finish() {
        super.finish();
        gaiy.a(this.getContainerActivity(), 6);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(!hxrq.a.b().f()) {
            XosLauncherChimeraActivity.j.d("Activity disabled by flag", new Object[0]);
            this.finish();
            return;
        }
        Intent intent0 = this.getIntent();
        if(!intent0.hasExtra("xos-flow-type")) {
            XosLauncherChimeraActivity.j.m("Missing flow type extra", new Object[0]);
            this.finish();
            return;
        }
        ejlq.a(this);
        gaiy.b(this.getContainerActivity(), 6);
        this.setContentView(0x7F0E0897);  // layout:quickstart_fragment_container
        this.k = new ejna(this);
        ejnk ejnk0 = (ejnk)new lso(this).a(ejnk.class);
        this.l = ejnk0;
        ejnb ejnb0 = new ejnb();
        ejnk0.a.g(this, ejnb0);
        ejlk ejlk0 = (ejlk)ejnk0.a.ij();
        ejlk0.a = 1;
        ejlk0.b = intent0.getIntExtra("xos-flow-type", 0);
        ejnk0.a.ii(ejlk0);
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.G(0x7F0B14C5, new ejnq());  // id:fragment_container
        ca0.a();
    }
}

