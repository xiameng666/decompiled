import android.text.TextUtils;
import java.util.List;

public abstract class gaww extends gawq {
    public String e;

    public gaww(hfta hfta0) {
        super(hfta0);
        this.e = "";
    }

    @Override  // gawq
    public final Object b(int v, int v1) {
        return this.e;
    }

    @Override  // gawq
    protected final Object c(List list0) {
        return this.e;
    }

    @Override  // gawq
    protected final Object d(List list0) {
        return this.e;
    }

    @Override  // gawq
    public final void i(int v, Object object0) {
        this.u((object0 == null ? "" : object0.toString()));
    }

    @Override  // gawq
    public final void j(List list0, Object object0) {
        this.i(((Integer)gggq.o(list0, Integer.valueOf(0))).intValue(), object0);
    }

    public void t(String s, garx garx0, gkwv gkwv0) {
        if(!TextUtils.equals(s, this.e)) {
            this.e = s;
            this.o(garx0, gkwv0);
        }
    }

    public final void u(String s) {
        this.t(s, null, gkwv.c);
    }

    public final void v(String s) {
        this.t(s, null, gkwv.f);
    }

    public final void w(String s) {
        this.t(s, null, gkwv.e);
    }
}

