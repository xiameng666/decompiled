import java.util.HashSet;

public final class cyle implements Runnable {
    public final cylw a;

    public cyle(cylw cylw0) {
        this.a = cylw0;
    }

    @Override
    public final void run() {
        cylw cylw0 = this.a;
        ((ggtj)cylw0.n.d().ar(7848)).x("NearbyDeviceManager: Geller updated, check duplicated account keys");
        for(Object object0: new HashSet(cylw0.a)) {
            cyna cyna0 = (cyna)object0;
            String s = cyna0.k();
            if(cylw0.p.A(s)) {
                ((ggtj)cylw0.n.d().ar(7849)).B("NearbyDeviceManager: Dedupe account key for %s", cyna0.j());
                cyna0.b.d = (byte[])cyna0.b.c.a();
                cylw0.v(cyna0.b.a);
            }
        }
    }
}

