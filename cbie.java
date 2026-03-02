import android.accounts.Account;
import android.app.Application;
import java.util.Arrays;
import java.util.List;

final class cbie extends ibsl implements ibtw {
    int a;
    final cbij b;
    final Account c;
    final int d;

    public cbie(cbij cbij0, Account account0, int v, ibrl ibrl0) {
        this.b = cbij0;
        this.c = account0;
        this.d = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbie)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbie(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            try {
                List list0 = this.b.d == null ? ibpo.b("https://accounts.google.com") : this.b.d;
                cbvz cbvz0 = cbwb.a;
                if(cbvz.b == null) {
                    synchronized(cbvz0) {
                        if(cbvz.b == null) {
                            cbvz.b = new cbwa();
                        }
                    }
                }
                Application application0 = this.b.a();
                String[] arr_s = (String[])list0.toArray(new String[0]);
                String[] arr_s1 = (String[])Arrays.copyOf(arr_s, arr_s.length);
                ibuq.f(application0, "context");
                ibuq.f(arr_s1, "urls");
                actb actb0 = new actb(application0);
                String[] arr_s2 = (String[])Arrays.copyOf(arr_s1, arr_s1.length);
                return actb0.b(this.c, arr_s2);
            }
            catch(acsz acsz0) {
                int v2 = this.d;
                if(v2 <= 0) {
                    throw acsz0;
                }
                ((ggtj)cbij.a.j()).B("Couldn\'t get and set cookies for %s with recoverable exception. Retrying", this.c.name);
                this.a = 1;
                if(this.b.c(this.c, v2 - 1, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

