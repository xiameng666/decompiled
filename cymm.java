public final class cymm implements Runnable {
    public final cyna a;

    public cymm(cyna cyna0) {
        this.a = cyna0;
    }

    @Override
    public final void run() {
        cyna cyna0 = this.a;
        if(!cyna0.i) {
            ((ggtj)cyna0.o.g().ar(7891)).x("SassDevice: onDeviceSettingsChange called when !initializingCompleted");
            return;
        }
        cyjq cyjq0 = cyna0.d();
        if(hvpg.bJ()) {
            ((ggtj)cyna0.o.d().ar(7890)).X("SassDevice %s: onDeviceSettingsChange from %s to %s", cyna0.j(), (cyna0.k == null ? "null" : cyrc.b(cyna0.k)), cyrc.b(cyjq0));
        }
        cyna0.y();
        cyjq cyjq1 = cyna0.k;
        if(cyjq1 != null) {
            gfuy.e(cyjq1);
            boolean z = cyjq0.d;
            cyjq cyjq2 = cyna0.k;
            gfuy.e(cyjq2);
            if(z != cyjq2.d) {
                ((ggtj)cyna0.o.g().ar(7889)).B("SassDevice: Try to reconnect event stream for SASS enable state change to %b", Boolean.valueOf(cyjq0.d));
                cylx cylx0 = new cylx(cyna0);
                cyqk.a(cyna0.q.a(fgmh.o, new byte[]{0}), new cymp(cyna0, cylx0), cyna0.e);
            }
            cyjq cyjq3 = cyna0.k;
            gfuy.e(cyjq3);
            cynb cynb0 = cyna0.b;
            cxzo cxzo0 = cyna0.a.f;
            if(hvpp.ak()) {
                cxyw cxyw0 = new cxyw(cxzo0, cyjq3, cyjq0, cynb0.e);
                cxzo0.e.post(cxyw0);
            }
            else {
                cxzo0.j.f().x("SassLogger_logDeviceSettingsChange: disable logging");
            }
        }
        boolean z1 = cyjq0.d;
        cyjq cyjq4 = cyna0.k;
        gfuy.e(cyjq4);
        if(z1 != cyjq4.d) {
            cyna0.l();
        }
        cyna0.k = cyjq0;
        cyna0.m();
        gxvy.d(cyna0.a.a, "links");
    }
}

