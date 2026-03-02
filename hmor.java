import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public final class hmor {
    public final List a;
    public final hmoq b;

    public hmor() {
        this.a = new LinkedList();
        hmoq hmoq0 = new hmoq();
        this.b = hmoq0;
        hmoq0.d = 15;
    }

    public final hmni a(int v) {
        for(Object object0: this.a) {
            hmni hmni0 = (hmni)object0;
            if(hmni0.b.b == v) {
                return v == 0 ? null : hmni0;
            }
        }
        return null;
    }

    public final JSONObject b() {
        return this.b.g;
    }

    public final boolean c() {
        return (this.b.d & 2) != 0;
    }

    public final boolean d() {
        return this.b.k.equals("DESFireEV2");
    }

    public final byte[] e() {
        return this.b.a;
    }

    public static final hmnr f(hmno hmno0) {
        hmnr hmnr0 = hmno0.e(hmnr.b(0, 0));
        if(hmnr0 != null) {
            return hmnr0;
        }
        new hmnr(2, new byte[24], true).c = hmnr.b(0, 0);
        throw new UnsupportedOperationException("Adding key is not supported.");
    }
}

