import java.util.Set;

public final class ahhp implements glzn {
    public final ahia a;
    public final aerq b;

    public ahhp(ahia ahia0, aerq aerq0) {
        this.a = ahia0;
        this.b = aerq0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((gged_interceptors)object0).isEmpty()) {
            throw bxma.e(0x6F12);
        }
        Set set0 = this.a.d.a();
        return new agzc(this.a.a, this.a.c, ((gged_interceptors)object0), this.a.d.b, set0).c(this.b);
    }
}

