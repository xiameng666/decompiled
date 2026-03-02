package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import aqjl;
import aqql;
import avzf;
import bbdg;
import bbnp;
import ccmq;

public class CallLogFlagSetter extends avzf {
    private static final aqql a;
    private final aqjl b;

    static {
        CallLogFlagSetter.a = new aqql(new String[]{"CallLogFlagSetter"});
    }

    public CallLogFlagSetter() {
        this.b = aqjl.a;
    }

    @Override  // avzf
    protected final void d(Intent intent0, boolean z) {
        if(bbnp.d(this)) {
            CallLogFlagSetter.a.h("Not enabling call log backup; current device is a sidewinder device.", new Object[0]);
            return;
        }
        aqjl aqjl0 = this.b;
        if(aqjl0.k(this)) {
            CallLogFlagSetter.a.h("backup_enabled flag already enabled.", new Object[0]);
            return;
        }
        if(!aqjl0.m(this)) {
            CallLogFlagSetter.a.h("Not enabling because user_full_data_backup_aware not set.", new Object[0]);
            return;
        }
        CallLogFlagSetter.a.h("Enabling backup_enabled flag.", new Object[0]);
        aqjl0.b(this, true);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.mi);
    }
}

