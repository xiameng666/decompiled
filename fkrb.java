import java.util.concurrent.atomic.AtomicReference;

public final class fkrb implements glzn {
    public final fkre a;
    public final AtomicReference b;
    public final fkua c;
    public final int d;

    public fkrb(fkre fkre0, AtomicReference atomicReference0, fkua fkua0, int v) {
        this.a = fkre0;
        this.b = atomicReference0;
        this.c = fkua0;
        this.d = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        flad flad0 = (flad)this.b.get();
        cmbl cmbl0 = this.a.d;
        if(!((Boolean)cmbl0.a.mr()).booleanValue()) {
            throw new fktt("sync is not enabled");
        }
        int v = this.d;
        cmbo cmbo0 = ((cmbn)cmbl0.b).b();
        if(!cmbo0.c(v)) {
            throw new fktt("sync policy is not enabled");
        }
        if(v == 1) {
            fkqo fkqo0 = cmbl0.c;
            hhgl hhgl0 = cmbo0.a;
            if(hhgl0 == null) {
                throw new IllegalStateException("Unscheduled sync policy is not enabled");
            }
            hhgk hhgk0 = hhgl0.d == null ? hhgk.a : hhgl0.d;
            boolean z = hhgk0.e;
            if((hhgh.a(hhgk0.d) == 0 ? 1 : hhgh.a(hhgk0.d)) - 1 == 2) {
                switch(fkqo0.a.a() - 1) {
                    case 1: {
                        throw new fktq();
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        if(z) {
                            break;
                        }
                        throw new fktq();
                    }
                }
            }
            boolean z1 = hhgk0.c;
        alab1:
            switch((hhgj.a(hhgk0.b) == 0 ? 1 : hhgj.a(hhgk0.b)) - 1) {
                case 2: {
                    switch(fkqo0.a.b() - 1) {
                        case 1: {
                            throw new fktq();
                        }
                        case 2: 
                        case 3: {
                            break alab1;
                        }
                        default: {
                            goto label_22;
                        }
                    }
                }
                case 3: {
                    switch(fkqo0.a.b() - 1) {
                        case 1: 
                        case 2: {
                            throw new fktq();
                        }
                        case 3: {
                            break alab1;
                        }
                        default: {
                        label_22:
                            if(!z1) {
                                throw new fktq();
                            }
                            break alab1;
                        }
                    }
                }
                default: {
                    return this.c.a(flad0);
                }
            }
        }
        return this.c.a(flad0);
    }
}

