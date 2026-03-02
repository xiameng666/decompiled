import java.util.Map;

public final class tqm extends tge {
    static {
    }

    public tqm(Map map0) {
        super(map0);
    }

    @Override  // tge
    public final thj c() {
        tsh tsh0 = (tsh)this.a.get(tsh.a);
        byte[] arr_b = thj.a;
        if(tsh0.f(new tfg(arr_b))) {
            return new thj(tsh0.b(arr_b));
        }
        throw new IllegalStateException("Missing PAN");
    }

    public final thc g() {
        return new thc(((tsc)this.d(tsc.a)).d);
    }

    public final tqr h() {
        return ((trz)this.d(trz.a)).h();
    }
}

