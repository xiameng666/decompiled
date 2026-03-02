import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class aqam extends tk {
    private final List a;

    public aqam() {
        this.a = new ArrayList();
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final int dx(int v) {
        return ((aqan)this.a.get(v)).b;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        int v1 = 0;
        while(v1 < 2) {
            int v2 = new int[]{1, 2}[v1];
            if(v2 == 0) {
                throw null;
            }
            if(v2 == v) {
                return v2 != 1 ? new aqas(viewGroup0) : new aqal(viewGroup0);
            }
            ++v1;
            continue;
        }
        throw new IllegalArgumentException("No valid item type found for the value: " + v);
    }

    public final void f(Collection collection0) {
        this.a.clear();
        this.a.addAll(collection0);
        this.q();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ((aqao)uq0).D(((aqan)this.a.get(v)));
    }
}

