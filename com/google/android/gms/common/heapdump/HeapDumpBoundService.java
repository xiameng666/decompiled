package com.google.android.gms.common.heapdump;

import bapg;
import baph;
import bbcu;
import bbll;
import bboh;
import bbqc;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import ggtj;
import hrpz;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class HeapDumpBoundService extends GmsTaskBoundService {
    public static final bboh a;
    public final String b;
    ScheduledFuture c;
    private final ScheduledExecutorService d;

    static {
        HeapDumpBoundService.a = bboh.b("HeapDumpBoundServiceLogger", bbcu.dH);
    }

    protected HeapDumpBoundService(String s) {
        this(s, new bbll(1, 10), new baph());
    }

    public HeapDumpBoundService(String s, ScheduledExecutorService scheduledExecutorService0, baph baph0) {
        this.d = scheduledExecutorService0;
        this.b = s;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        if(!this.e()) {
            ggtj ggtj0 = (ggtj)((ggtj)HeapDumpBoundService.a.h()).ar(1700);
            String s = bbqc.b();
            Boolean boolean0 = Boolean.valueOf(this.e());
            ggtj0.X("%s: Flag need to be true to proceed. Task skipped. Enable heapdump collection on %s process: %b ", this.b, s, boolean0);
            return 0;
        }
        if((new Random().nextDouble() >= hrpz.a.b().a())) {
            ((ggtj)((ggtj)HeapDumpBoundService.a.h()).ar(0x6A3)).B("%s: This device is not part of the selected sample. Task skipped.", this.b);
            return 0;
        }
        this.d();
        return 0;
    }

    final void d() {
        synchronized(this) {
            if(this.c != null) {
                ((ggtj)((ggtj)HeapDumpBoundService.a.h()).ar(1704)).B("%s: Cancel the previous scheduled task.", this.b);
                this.c.cancel(false);
            }
            bapg bapg0 = new bapg(this);
            long v1 = Math.max(0L, hrpz.a.b().c());
            this.c = this.d.schedule(bapg0, v1, TimeUnit.SECONDS);
        }
    }

    public abstract boolean e();
}

