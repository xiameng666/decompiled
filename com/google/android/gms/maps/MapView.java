package com.google.android.gms.maps;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import azpm;
import baqw;
import batl;
import bjgp;
import bjgq;
import bjgr;
import bjgt;
import cpnr;
import cpnt;
import cprj;
import cpsi;

public class MapView extends FrameLayout {
    private final bjgt a;

    public MapView(Context context0) {
        super(context0);
        this.a = new bjgt(this, context0, null);
        this.h();
    }

    public MapView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new bjgt(this, context0, GoogleMapOptions.a(context0, attributeSet0));
        this.h();
    }

    public MapView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new bjgt(this, context0, GoogleMapOptions.a(context0, attributeSet0));
        this.h();
    }

    public MapView(Context context0, GoogleMapOptions googleMapOptions0) {
        super(context0);
        this.a = new bjgt(this, context0, googleMapOptions0);
        this.h();
    }

    public final void a(cpnt cpnt0) {
        batl.h("getMapAsync() must be called on the main thread");
        bjgt bjgt0 = this.a;
        cpnr cpnr0 = bjgt0.c;
        if(cpnr0 != null) {
            cpnr0.a(cpnt0);
            return;
        }
        bjgt0.d.add(cpnt0);
    }

    public final void b(Bundle bundle0) {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitAll().build());
        try {
            bjgp bjgp0 = new bjgp(this.a, bundle0);
            this.a.b(bundle0, bjgp0);
            if(this.a.c == null) {
                Context context0 = this.getContext();
                int v1 = azpm.a.m(context0);
                String s = baqw.c(context0, v1);
                String s1 = baqw.b(context0, v1);
                LinearLayout linearLayout0 = new LinearLayout(this.getContext());
                linearLayout0.setOrientation(1);
                linearLayout0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                this.addView(linearLayout0);
                TextView textView0 = new TextView(this.getContext());
                textView0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView0.setText(s);
                linearLayout0.addView(textView0);
                Intent intent0 = azpm.a.k(context0, v1, null);
                if(intent0 != null) {
                    Button button0 = new Button(context0);
                    button0.setId(0x1020019);
                    button0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button0.setText(s1);
                    linearLayout0.addView(button0);
                    button0.setOnClickListener(new bjgq(context0, intent0));
                }
            }
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    public final void c() {
        bjgt bjgt0 = this.a;
        cpnr cpnr0 = bjgt0.c;
        if(cpnr0 != null) {
            try {
                cpnr0.b.c();
                return;
            }
            catch(RemoteException remoteException0) {
                throw new cpsi(remoteException0);
            }
        }
        bjgt0.a(1);
    }

    public final void d() {
        cpnr cpnr0 = this.a.c;
        if(cpnr0 != null) {
            try {
                cpnr0.b.d();
            }
            catch(RemoteException remoteException0) {
                throw new cpsi(remoteException0);
            }
        }
    }

    public final void e() {
        bjgt bjgt0 = this.a;
        cpnr cpnr0 = bjgt0.c;
        if(cpnr0 != null) {
            try {
                cpnr0.b.e();
                return;
            }
            catch(RemoteException remoteException0) {
                throw new cpsi(remoteException0);
            }
        }
        bjgt0.a(5);
    }

    public final void f() {
        bjgr bjgr0 = new bjgr(this.a);
        this.a.b(null, bjgr0);
    }

    public final void g(Bundle bundle0) {
        bjgt bjgt0 = this.a;
        cpnr cpnr0 = bjgt0.c;
        if(cpnr0 != null) {
            try {
                Bundle bundle1 = new Bundle();
                cprj.b(bundle0, bundle1);
                cpnr0.b.g(bundle1);
                cprj.b(bundle1, bundle0);
                return;
            }
            catch(RemoteException remoteException0) {
                throw new cpsi(remoteException0);
            }
        }
        Bundle bundle2 = bjgt0.a;
        if(bundle2 != null) {
            bundle0.putAll(bundle2);
        }
    }

    private final void h() {
        this.setClickable(true);
    }
}

