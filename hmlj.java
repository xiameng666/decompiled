import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class hmlj {
    public final int a;
    public final boolean b;
    public List c;
    public int d;
    public hmkg e;
    public hmli f;
    public final String g;
    public int h;
    public int i;

    public hmlj(String s, int v, boolean z) {
        this.d = 0;
        hmkg hmkg0 = null;
        this.e = null;
        this.f = null;
        this.h = 0;
        this.i = 0;
        this.b = z;
        this.a = v;
        this.c = new ArrayList();
        if(hmlx.k("0")) {
            hmkg0 = new hmkg(new BigDecimal("0"), 10);
        }
        this.e = hmkg0;
        this.g = s;
    }

    public final void a(hmli hmli0) {
        this.c.add(hmli0);
    }

    @Override
    public final String toString() {
        return "FuncInfo{functionName=\'" + this.g + "\', resolvedParams=" + this.c + "}";
    }
}

