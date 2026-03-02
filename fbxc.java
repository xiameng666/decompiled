import j..util.Objects;
import java.util.ArrayList;

final class fbxc implements bboe {
    final String a;
    final gamm b;
    final guyp c;
    final int d;
    final fbxd e;

    public fbxc(fbxd fbxd0, String s, gamm gamm0, guyp guyp0, int v) {
        this.a = s;
        this.b = gamm0;
        this.c = guyp0;
        this.d = v;
        Objects.requireNonNull(fbxd0);
        this.e = fbxd0;
        super();
    }

    @Override  // bboe
    public final Object a(Object object0) {
        Void void0 = (Void)object0;
        byte[] arr_b = this.c.toBytesArray();
        if(this.d == 3) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(fbxd.a);
            return this.e.c.b(this.a, this.b, arr_b, arrayList0, 30, 17);
        }
        return this.e.c.b(this.a, this.b, arr_b, null, 30, 17);
    }
}

