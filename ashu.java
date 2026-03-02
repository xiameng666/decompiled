import com.google.android.gms.backup.settings.component.EnhancedBackupOptInChimeraActivity;
import j..util.Objects;
import java.util.concurrent.ExecutorService;

public final class ashu implements aqzl {
    final EnhancedBackupOptInChimeraActivity a;

    public ashu(EnhancedBackupOptInChimeraActivity enhancedBackupOptInChimeraActivity0) {
        Objects.requireNonNull(enhancedBackupOptInChimeraActivity0);
        this.a = enhancedBackupOptInChimeraActivity0;
        super();
    }

    @Override  // aqzl
    public final Object a() {
        boolean z1;
        EnhancedBackupOptInChimeraActivity enhancedBackupOptInChimeraActivity0 = this.a;
        asxb asxb0 = enhancedBackupOptInChimeraActivity0.q;
        boolean z = asxb0 == null ? new aqpj(enhancedBackupOptInChimeraActivity0.getApplicationContext()).a() : asxb0.b();
        enhancedBackupOptInChimeraActivity0.m = z;
        baun baun0 = EnhancedBackupOptInChimeraActivity.j;
        baun0.j("Got ETU status  = isDeviceEtu : " + z, new Object[0]);
        asxb asxb1 = enhancedBackupOptInChimeraActivity0.q;
        if(asxb1 == null) {
            if(hqil.v() || hqil.w()) {
                baun0.j("Photos filtering for opt-in is enabled.", new Object[0]);
                if(enhancedBackupOptInChimeraActivity0.getApplicationContext() != null && enhancedBackupOptInChimeraActivity0.getApplicationContext().getPackageManager() != null) {
                    int v = aqsl.a(enhancedBackupOptInChimeraActivity0.getApplicationContext().getPackageManager()).c().ordinal();
                    if(v != 1 && v != 2 && v != 3) {
                        switch(v) {
                            case 4: {
                                if(hqil.w()) {
                                    goto label_26;
                                }
                                else {
                                    goto label_25;
                                }
                                break;
                            }
                            case 5: {
                                goto label_26;
                            }
                            default: {
                                goto label_25;
                            }
                        }
                    }
                    else {
                        goto label_26;
                    }
                }
                else {
                    goto label_26;
                }
            }
            else {
            label_25:
                if(!enhancedBackupOptInChimeraActivity0.m && !hqil.A() && (!hqil.t() || !enhancedBackupOptInChimeraActivity0.q())) {
                label_26:
                    z1 = false;
                }
                else {
                    z1 = true;
                }
            }
        }
        else if(asxb1.a() || hqil.t() && enhancedBackupOptInChimeraActivity0.q()) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        enhancedBackupOptInChimeraActivity0.n = z1;
        baun0.j("shouldGetPhotos=%s", new Object[]{Boolean.valueOf(z1)});
        if(enhancedBackupOptInChimeraActivity0.l == null) {
            ExecutorService executorService0 = enhancedBackupOptInChimeraActivity0.k;
            enhancedBackupOptInChimeraActivity0.l = aqnb.f(enhancedBackupOptInChimeraActivity0.getApplicationContext(), executorService0, enhancedBackupOptInChimeraActivity0.n);
        }
        if(!enhancedBackupOptInChimeraActivity0.q()) {
            baun0.j("Skipping photos opt-in status check", new Object[0]);
            return Boolean.valueOf(false);
        }
        if(!enhancedBackupOptInChimeraActivity0.n) {
            baun0.f("ShouldGetPhotos is false in the Photos Opt-in flow.", new Object[0]);
            enhancedBackupOptInChimeraActivity0.p.k(2);
            return Boolean.valueOf(true);
        }
        baun0.j("Checking if user is already opted into photos backup", new Object[0]);
        aqvc aqvc0 = aqvd.a();
        aqvc0.c(7);
        aqvd aqvd0 = aqvc0.a();
        if(enhancedBackupOptInChimeraActivity0.o.c(aqvd0) != null) {
            baun0.m("User already opted in to photos backup, skipping opt-in and routing to backup settings", new Object[0]);
            enhancedBackupOptInChimeraActivity0.p.k(3);
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }

    @Override  // aqzl
    public final void b(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            this.a.b();
            return;
        }
        EnhancedBackupOptInChimeraActivity enhancedBackupOptInChimeraActivity0 = this.a;
        if(!enhancedBackupOptInChimeraActivity0.k.isShutdown() && !enhancedBackupOptInChimeraActivity0.isDestroyed()) {
            if(enhancedBackupOptInChimeraActivity0.l == null) {
                ExecutorService executorService0 = enhancedBackupOptInChimeraActivity0.k;
                enhancedBackupOptInChimeraActivity0.l = aqnb.f(enhancedBackupOptInChimeraActivity0.getApplicationContext(), executorService0, enhancedBackupOptInChimeraActivity0.m);
            }
            if(cchj.b(enhancedBackupOptInChimeraActivity0.getApplicationContext()).p("com.google").length == 0) {
                enhancedBackupOptInChimeraActivity0.n(new atbb());
                return;
            }
            enhancedBackupOptInChimeraActivity0.p();
        }
    }
}

