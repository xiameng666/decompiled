import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class fvre {
    public final List a;
    private final fwyd b;
    private final fvqn c;

    public fvre(List list0, fwyd fwyd0, fvqn fvqn0) {
        this.a = list0;
        this.b = fwyd0;
        this.c = fvqn0;
    }

    public final long a(Calendar calendar0, boolean z) {
        boolean z1;
        fvrd fvrd0 = this.d(calendar0);
        if(fvrd0 == null) {
            Calendar calendar1 = (Calendar)calendar0.clone();
            calendar1.add(5, 1);
            fvsl.f(calendar1, 0L);
            fvrd0 = this.d(calendar1);
            z1 = true;
        }
        else {
            z1 = false;
        }
        Calendar calendar2 = (Calendar)calendar0.clone();
        if(z1) {
            calendar2.add(5, 1);
        }
        gftb.check(fvrd0);
        fvsl.f(calendar2, (z ? fvrd0.a.b : fvrd0.a.c));
        return calendar2.getTimeInMillis() - this.b.a();
    }

    public final long b(Calendar calendar0) {
        return this.a(calendar0, false);
    }

    public final fvrc c(Calendar calendar0, boolean z, int v) {
        fvrd fvrd0;
        fvrb fvrb0;
        boolean z1;
        fvsl fvsl0 = null;
        if(z) {
            z1 = true;
            fvrb0 = fvrb.c;
            fvrd0 = null;
        }
        else {
            fvrd0 = huvd.r() ? this.e(calendar0, v) : this.d(calendar0);
            if(fvrd0 == null) {
                z1 = false;
                fvrb0 = null;
            }
            else {
                z1 = fvrd0.a.i(calendar0);
                fvrb0 = z1 ? fvrd0.b : null;
            }
        }
        if(fvrd0 != null) {
            fvsl0 = fvrd0.a;
        }
        return new fvrc(z1, fvrb0, fvsl0);
    }

    private final fvrd d(Calendar calendar0) {
        fvrd fvrd0 = this.e(calendar0, 14);
        if(huvd.r()) {
            fvrd fvrd1 = this.e(calendar0, 22);
            return fvrd0 == null || fvrd1 != null && fvsl.a.compare(fvrd0.a, fvrd1.a) >= 0 ? fvrd1 : fvrd0;
        }
        return fvrd0;
    }

    private final fvrd e(Calendar calendar0, int v) {
        fvrg fvrg0;
        long v1;
        Calendar calendar1 = calendar0;
        if(!huvd.r()) {
            v1 = this.c.d();
        }
        else if(v == 0) {
            v1 = this.c.d();
        }
        else {
            v1 = this.c.u(v);
        }
        if(Long.compare(v1, -1L) == 0) {
            v1 = 0L;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(v1);
        if(calendar2.after(calendar1)) {
            calendar2.add(12, -5);
            if(calendar2.after(calendar1)) {
                calendar2.setTimeInMillis(0L);
            }
        }
        boolean z = fvsl.j(calendar1, calendar2);
        List list0 = this.a;
        for(Object object0: list0) {
            fvsl fvsl0 = (fvsl)object0;
            if(!fvsl0.g(calendar1) && (!z || !fvsl0.i(calendar2))) {
                long v2 = this.b.a();
                if(fvsl0.equals(list0.get(0))) {
                    Map map0 = this.c.l();
                    if(map0 != null) {
                        switch(calendar1.get(7)) {
                            case 1: 
                            case 7: {
                                break;
                            }
                            default: {
                                Calendar calendar3 = (Calendar)calendar1.clone();
                                fvsl.f(calendar3, fvsl0.b);
                                if((new Random(calendar3.getTimeInMillis() ^ v2).nextDouble() <= 0.8)) {
                                    fvrg0 = new fvrg(fvsl0, ((gged_interceptors)map0.get(calendar1.getTimeZone().getID())), 2, calendar1, v2);
                                    calendar1 = calendar0;
                                    goto label_36;
                                }
                            }
                        }
                    }
                }
                calendar1 = calendar0;
                fvrg0 = new fvrg(fvsl0, null, 1, calendar1, v2);
            label_36:
                fvsl fvsl1 = null;
                gged_interceptors gged0 = fvrg0.b;
                int v3 = gged0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    fvsl fvsl2 = (fvsl)gged0.get(v4);
                    if(!fvsl2.g(calendar1)) {
                        fvsl1 = fvsl2;
                        break;
                    }
                }
                if(fvsl1 != null) {
                    return fvrg0.c == 1 ? new fvrd(fvsl1, fvrb.a) : new fvrd(fvsl1, fvrb.b);
                }
            }
        }
        return null;
    }
}

