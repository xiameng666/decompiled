package com.google.android.gms.common.systemhealthutils.restart;

import bacq;
import bamh;
import bamn;
import bbqc;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import glhg;
import hrsw;
import java.util.concurrent.TimeUnit;

public abstract class GmsRestartChimeraService extends GmsTaskChimeraService {
    private final bamn a;

    public GmsRestartChimeraService() {
        this(new bamn());
    }

    public GmsRestartChimeraService(bamn bamn0) {
        this.a = bamn0;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        if(Long.compare(TimeUnit.MILLISECONDS.toSeconds(bbqc.a()), hrsw.b()) < 0) {
            bacq.a(this);
            return 0;
        }
        if(hrsw.g() && this.d()) {
            bamn bamn0 = this.a;
            glhg glhg0 = glhg.h;
            if(hrsw.g()) {
                bamh bamh0 = new bamh();
                bamh0.b = this;
                bamh0.a = glhg0;
                bamn0.b(bamh0.a());
            }
        }
        return 0;
    }

    public abstract boolean d();
}

