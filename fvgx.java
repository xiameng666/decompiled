import java.util.HashMap;
import java.util.Map;

public abstract class fvgx {
    public gxmd b;
    protected fvhw c;
    protected Map d;

    public fvgx() {
        this.d = new HashMap();
    }

    public abstract boolean a(fvhw arg1);

    public final fvhd b(fvel fvel0) {
        fvhd fvhd0 = (fvhd)this.d.get(fvel0.a);
        return fvhd0 == null || !fvhd0.f(fvel0.b.bQ) ? null : fvhd0;
    }
}

