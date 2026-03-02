package com.google.android.gms.fonts.service;

import bbdg;
import brun;
import brvf;
import ccmq;
import htcf;

public class FontsChimeraProvider extends brun {
    @Override  // brun
    protected final long a() {
        return htcf.b();
    }

    @Override  // brun
    protected final boolean b() {
        return htcf.a.d().g();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        ccmq.a().a(bbdg.km);
        brvf.a.h(this.getContext());
        return true;
    }
}

