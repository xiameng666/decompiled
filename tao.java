import java.io.InputStream;
import java.io.Serializable;

public abstract class tao implements Serializable {
    public tam a;
    public tdu b;

    public tao() {
        this.a = null;
    }

    public tal a() {
        return ((szs)this.b).a(this);
    }

    public final tam b() {
        tam tam0 = this.a;
        if(tam0 != null) {
            return tam0;
        }
        throw new IllegalStateException("Application data is not loaded");
    }

    public abstract tar c();

    public final tbt d() {
        tmq tmq0 = (tmq)this.a.d(tmq.a);
        return new tbt(tmq0.a(1, tmq0.e));
    }

    public abstract tkm e(InputStream arg1);

    @Override
    public final String toString() {
        return "dcid=null";
    }
}

