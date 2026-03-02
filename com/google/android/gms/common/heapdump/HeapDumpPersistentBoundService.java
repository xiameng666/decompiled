package com.google.android.gms.common.heapdump;

import baph;
import bbdg;
import ccmq;
import hrpz;
import java.util.concurrent.ScheduledExecutorService;

public final class HeapDumpPersistentBoundService extends HeapDumpBoundService {
    public HeapDumpPersistentBoundService() {
        super("HeapDumpPersistentBoundService");
    }

    HeapDumpPersistentBoundService(ScheduledExecutorService scheduledExecutorService0, baph baph0) {
        super("HeapDumpPersistentBoundService", scheduledExecutorService0, baph0);
    }

    @Override  // com.google.android.gms.common.heapdump.HeapDumpBoundService
    public final boolean e() {
        return hrpz.d();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final void onCreate() {
        super.onCreate();
        ccmq.a().a(bbdg.kX);
    }
}

