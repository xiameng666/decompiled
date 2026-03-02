import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class gawq {
    public final hfta a;
    public final List b;
    public gawp c;
    public gaym d;
    private boolean e;

    public gawq(hfta hfta0) {
        this.b = new ArrayList();
        this.e = true;
        this.a = hfta0;
    }

    protected abstract MessageLite a();

    protected Object b(int v, int v1) {
        throw new UnsupportedOperationException("getValueByFieldNumberAndSubFieldId is not supported yet");
    }

    protected Object c(List list0) {
        throw new UnsupportedOperationException("getValueByFieldReference is not supported yet.");
    }

    protected Object d(List list0) {
        if(list0.size() > 2) {
            throw new UnsupportedOperationException("getValueByNestedFieldList with more than two nested fields is not supported.");
        }
        Integer integer0 = (int)0;
        return this.b(((Integer)gggq.n(list0, 0, integer0)).intValue(), ((Integer)gggq.n(list0, 1, integer0)).intValue());
    }

    protected void e(Bundle bundle0) {
    }

    public final void h(MessageLite hfvm0) {
        this.e = false;
        this.k(hfvm0);
        this.e = true;
    }

    protected void i(int v, Object object0) {
        throw new UnsupportedOperationException("SetValueFromEventRule is not supported by ComponentValue yet.");
    }

    protected void j(List list0, Object object0) {
        int v = 0;
        if(list0.size() >= 2) {
            throw new UnsupportedOperationException("setValueFromEventRule with nested field lists is not supported yet.");
        }
        if(list0.size() == 1) {
            v = (int)(((Integer)list0.get(0)));
        }
        this.i(v, object0);
    }

    protected abstract void k(MessageLite arg1);

    public final void l() {
        this.o(null, gkwv.c);
    }

    public final void m() {
        this.o(null, gkwv.f);
    }

    @Deprecated
    public final void n(garx garx0) {
        this.o(garx0, gkwv.a);
    }

    protected void nD(Bundle bundle0) {
    }

    public final void nE(Collection collection0) {
        this.b.clear();
        this.b.addAll(collection0);
    }

    public final void o(garx garx0, gkwv gkwv0) {
        gawp gawp0 = this.c;
        if(gawp0 != null && this.e) {
            gawp0.nG(garx0, gkwv0);
        }
    }

    protected boolean p() {
        return true;
    }

    public boolean q() {
        return false;
    }

    protected int r(int v) {
        throw new UnsupportedOperationException("getTagByFieldNumberAndSubFieldId is not supported yet");
    }

    final void s(hftr hftr0) {
        MessageLite hfvm0 = this.a();
        hftr0.n(this.a, hfvm0);
    }
}

