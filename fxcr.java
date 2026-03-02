import java.util.List;

public final class fxcr implements gfsi {
    public final fxcs a;

    public fxcr(fxcs fxcs0) {
        this.a = fxcs0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        List list0 = ((hecr)object0).a;
        int v = list0.size();
        fxcs fxcs0 = this.a;
        fwze fwze0 = fxcs0.a;
        fvwz fvwz0 = fwze0.mH();
        fvwz0.a(new fvwx(0x93, fvwz0.f(), null, null, 18, ((hecr)object0).c - 1, v));
        if(v > 0) {
            int v1 = v - 1;
            fvvj fvvj0 = null;
            while(v1 >= 0) {
                fvvj0 = ((fvuc)list0.get(v1)).b();
                if(fvvj0 != null) {
                    break;
                }
                --v1;
            }
            if(fwze0.w()) {
                fwze0.m().mR(list0, fvvj0);
                return (hecr)object0;
            }
        }
        else if(fxcs0.b) {
            fwze0.m().mR(list0, fvvc.q(fwze0.f().b()));
        }
        return (hecr)object0;
    }
}

