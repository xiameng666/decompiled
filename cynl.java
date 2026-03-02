import java.util.concurrent.Executor;

public final class cynl extends cyoi {
    public boolean a;
    private boolean q;
    private final Runnable r;
    private final Runnable s;

    public cynl(cyqx cyqx0, cynb cynb0, cylu cylu0, kba kba0, bbqb bbqb0, cyom cyom0, Executor executor0, Runnable runnable0, Runnable runnable1) {
        super(cyqx0, cynb0, cylu0, kba0, bbqb0, cyom0, executor0);
        this.r = runnable0;
        this.s = runnable1;
    }

    @Override  // cyoi
    public final gmcd a(int v, boolean z, boolean z1) {
        boolean z3;
        int v1;
        boolean z2;
        if(this.d(v)) {
            ggtj ggtj0 = (ggtj)this.o.g().ar(0x1EF0);
            String s = fgjo.c(this.c.a);
            ggtj0.B("MultiPointConnectionHelper: Ignore connectAndSetActive to %s since it is already connected and active", gxyf.b(gxye.a, s));
            return gmbu.i(new cyql(cyqm.a, 1));
        }
        if(this.s(v)) {
            this.q = true;
            if(v != 1) {
                v1 = v;
                z2 = false;
            }
            else if(z) {
                z2 = true;
                v1 = 1;
            }
            else {
                v1 = 1;
                z2 = false;
            }
            if(z2) {
                z3 = z2;
            }
            else {
                cync cync0 = this.f.a();
                z3 = cync0 != null && !cync0.b && !cync0.c;
            }
            if(z3) {
                ((ggtj)this.o.d().ar(0x1EEF)).x("MultiPointConnectionHelper: SwitchActive to this seeker to revert HFP switch active");
            }
            return !z || !this.e.a(fgtg.a) ? this.c(v1, true, false, z3, z, false) : this.c(v1, true, true, z3, z, false);
        }
        this.q = false;
        boolean z4 = ((fgta)this.d.a()).f().a();
        gmcd gmcd0 = this.i(v, z, z1);
        if(!z) {
            if(z4 && v == 2) {
                v = 2;
                gmbu.t(gmcd0, new cynk(this, v, z), this.m);
                return gmcd0;
            }
            return gmcd0;
        }
        gmbu.t(gmcd0, new cynk(this, v, z), this.m);
        return gmcd0;
    }

    @Override  // cyoi
    public final gmcd b(boolean z, boolean z1, boolean z2) {
        if(this.q) {
            return ((int)z) ? this.c(2, false, z1, ((boolean)(((int)z) ^ 1)), true, false) : this.c(1, false, z1, ((boolean)(((int)z) ^ 1)), true, false);
        }
        return this.j(z1, z2);
    }

    public final gmcd c(int v, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        gmcd gmcd0;
        int v3;
        int v1 = 1;
        boolean z5 = this.v();
        int v2 = 0;
        if(this.a) {
            v3 = v;
            v1 = 0;
        }
        else if(z2) {
            v3 = v;
        }
        else if(!z || z3) {
            v3 = v;
            if(v3 == 2) {
                v3 = 2;
            }
            else {
                v1 = 0;
            }
        }
        else {
            v3 = v;
            v1 = 0;
        }
        fgtb[] arr_fgtb = new fgtb[fgtd.values().length];
        fgtd[] arr_fgtd = fgtd.values();
        for(int v4 = 0; v2 < arr_fgtd.length; ++v4) {
            fgtd fgtd0 = arr_fgtd[v2];
            arr_fgtb[v4] = new fgtb(fgtd0.name(), fgtd0.e);
            ++v2;
        }
        fgtc fgtc0 = new fgtc(arr_fgtb);
        fgtc0.y(fgtd.a, ((int)z));
        fgtc0.y(fgtd.b, ((int)z1));
        fgtc0.y(fgtd.c, ((int)z2));
        fgtc0.y(fgtd.d, v1);
        cylu cylu0 = this.p;
        byte[] arr_b = fgtc0.p();
        if(cylu0.b() == null) {
            ((ggtj)this.o.g().ar(0x1EFD)).x("MultiPointConnectionHelper: Trying to SwitchActive but event stream is not connected! Trigger reconnect");
            gmcd0 = glzd.f(cylu0.a(fgmh.h, arr_b), new cyng(this), this.m);
        }
        else {
            gmcd0 = cylu0.a(fgmh.h, arr_b);
        }
        ggtj ggtj0 = (ggtj)this.o.d().ar(0x1EFC);
        String s = fgjo.c(this.c.a);
        ggtj0.ab("MultiPointConnectionHelper: setActiveThroughEventStream called with %s, switchToThisDevice=%b, resumePlay=%b, rejectSco=%b, disconnectBluetooth=%b, profile=%d, isRevert=%b", gxyf.b(gxye.a, s), Boolean.valueOf(z), Boolean.valueOf(z1), Boolean.valueOf(z2), Boolean.valueOf(((boolean)v1)), Integer.valueOf(v3), Boolean.valueOf(z3));
        this.f.d(gmcd0, (z ? 4 : 5), z3, v3);
        cyqk.a(gmcd0, new cynh(this, z, z3, z4, v3, z5), this.m);
        return gmcd0;
    }

    @Override  // cyoi
    public final boolean d(int v) {
        if(!this.s(v)) {
            return false;
        }
        kba kba0 = this.d;
        switch(((fgta)kba0.a()).f().ordinal()) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return true;
            }
            case 5: 
            case 6: 
            case 8: 
            case 9: {
                return v == 1 ? true : ((fgta)kba0.a()).a() != 0;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // cyoi
    public final boolean e() {
        return true;
    }

    @Override  // cyoi
    public final void f(fgtc fgtc0) {
        ((ggtj)this.o.d().ar(0x1EF2)).X("MultiPointConnectionHelper: Received NotifyMultipointSwitchEvent message with reason=%d, target=%d, targetName=%s", Byte.valueOf(fgtc0.z()), Byte.valueOf(fgtc0.A()), fgtc0.B());
        cyom cyom0 = this.f;
        cync cync0 = cyom0.a();
        int v = 5;
        int v1 = 1;
        if(fgtc0.A() == 2) {
            cyqx cyqx0 = this.b;
            cxzo cxzo0 = cyqx0.f;
            cxzo0.j("logProviderActiveDeviceChange", new cxyo(cxzo0, this.c));
            this.r.run();
            if(cync0 == null) {
                cync0 = null;
            label_15:
                if(this.x(fgtc0)) {
                    ((ggtj)this.o.d().ar(7930)).x("MultiPointConnectionHelper: Suppress MoveToOtherDeviceNotification.");
                    return;
                }
                int v2 = fgtc0.z() == 2 ? 1 : 2;
                if(hvpg.bq()) {
                    cxzo0.a();
                    int v3 = cuul.a.nextInt();
                    String s = cwfb.z.b(v3);
                    this.o(cwfa.a(cwfa.c(s, cxlb.k), s));
                }
                ((ggtj)this.o.d().ar(0x1EF9)).B("MultiPointConnectionHelper: [%s] SwitchActive to other seeker message received through event stream", gxyf.b(gxye.q, "START"));
                cyfo.c(cyqx0.a, cyfr.a);
                this.w(v2);
            }
            else if(cync0.b) {
                ((ggtj)this.o.d().ar(0x1EFB)).x("MultiPointConnectionHelper: receive notifyMultipointSwitchEvent which is reverted by notification");
            }
            else {
                goto label_15;
            }
        }
        else if(cync0 == null) {
            cync0 = null;
        label_33:
            if(cync0 != null && cync0.b) {
                ((ggtj)this.o.d().ar(0x1EF7)).x("MultiPointConnectionHelper: receive notifyMultipointSwitchEvent set active to this seeker for revert from this seeker");
            }
            else if(!cynl.y(fgtc0, cync0)) {
                ((ggtj)this.o.d().ar(0x1EF4)).x("MultiPointConnectionHelper: receive notifyMultipointSwitchEvent set active to this seeker by the provider");
                this.q = true;
                if(this.x(fgtc0)) {
                    ((ggtj)this.o.d().ar(0x1EF6)).x("MultiPointConnectionHelper: Suppress RevertSwitchingNotification.");
                    return;
                }
                boolean z = fgtc0.z() != 2;
                if(hvpg.bq()) {
                    this.b.f.a();
                    int v4 = cuul.a.nextInt();
                    String s1 = cwfb.z.b(v4);
                    this.o(cwfa.a(cwfa.c(s1, cxlb.k), s1));
                }
                ((ggtj)this.o.d().ar(0x1EF5)).B("MultiPointConnectionHelper: [%s] SwitchActive to this seeker message received through event stream", gxyf.b(gxye.q, "START"));
                cynb cynb0 = this.c;
                cxzo cxzo1 = this.b.f;
                if(hvpp.ak() && hvpg.a.aY().hq()) {
                    cxyu cxyu0 = new cxyu(cxzo1, z, cynb0);
                    cxzo1.e.post(cxyu0);
                }
                else {
                    cxzo1.j.f().x("SassLogger_detectProviderTriggerSwitchActive: disable logging");
                }
                if(!z) {
                    this.s.run();
                }
                this.p(new cyni(this, z, this.v()), false);
            }
        }
        else if(cync0.l == 5) {
            ((ggtj)this.o.d().ar(0x1EF8)).x("MultiPointConnectionHelper: receive notifyMultipointSwitchEvent set active to this seeker for revert from other seeker");
        }
        else {
            goto label_33;
        }
        if(!cynl.y(fgtc0, cync0)) {
            ((ggtj)this.o.d().ar(0x1EF3)).x("MultiPointConnectionHelper: Add switch log for this NotifyMultipointSwitchEvent message");
            gmcd gmcd0 = gmbu.i(new cyql(cyqm.a, 1));
            if(fgtc0.A() != 2) {
                v = 4;
            }
            if(fgtc0.z() != 2) {
                v1 = 2;
            }
            cyom0.c(gmcd0, v, v1);
        }
    }

    private final boolean x(fgtc fgtc0) {
        int v = fgtc0.z();
        ggtj ggtj0 = (ggtj)this.o.d().ar(0x1EFE);
        bbqb bbqb0 = this.e;
        fgtg fgtg0 = fgtg.a;
        Boolean boolean0 = Boolean.valueOf(bbqb0.a(fgtg0));
        fgtg fgtg1 = fgtg.b;
        ggtj0.Y("MultiPointConnectionHelper: Check if HUN should be suppressed for this NotifyMultipointSwitchEvent message when isMusicActiveBeforeOnThisSeeker=%b, isMusicActiveBeforeOnOtherSeeker=%b, isMusicActiveNow=%b, lastConnectionStateIdle=%b", boolean0, Boolean.valueOf(bbqb0.a(fgtg1)), Boolean.valueOf(this.r()), Boolean.valueOf(((fgta)this.d.a()).f().b()));
        if(fgtc0.A() == 2) {
            return !bbqb0.a(fgtg0);
        }
        return bbqb0.a(fgtg1) ? v != 2 && !this.r() : true;
    }

    private static final boolean y(fgtc fgtc0, cync cync0) {
        if(cync0 == null) {
            return false;
        }
        return fgtc0.z() == 2 == cync0.c ? false : (fgtc0.A() == 2 ? 1 : 0) == (cync0.l == 5 ? 1 : 0);
    }
}

