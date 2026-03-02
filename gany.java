import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.wallet.ib.IbChimeraActivity;
import java.util.ArrayList;

public final class gany extends gaxs {
    public final gann a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public boolean f;
    public final IbChimeraActivity g;
    private static final String h = "gany";
    private static final clht i;

    static {
        gany.i = new clht(Looper.getMainLooper());
    }

    public gany(gann gann0, IbChimeraActivity ibChimeraActivity0, Bundle bundle0) {
        this.f = false;
        this.g = ibChimeraActivity0;
        this.a = gann0;
        if(bundle0 == null) {
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.b = new ArrayList();
        }
        else {
            Bundle bundle1 = bundle0.getBundle(gany.h);
            if(bundle1 == null) {
                throw new IllegalStateException("State for ActionUiHelperTmp was not properly saved, did you forget to call onSaveInstanceState?");
            }
            this.c = bundle1.getIntegerArrayList("requestCodes");
            this.d = bundle1.getParcelableArrayList("requests");
            this.b = bundle1.getIntegerArrayList("executionIds");
        }
        this.e = new ArrayList();
        for(int v = this.c.size(); v > 0; --v) {
            this.e.add(null);
        }
    }

    // Detected as a lambda impl.
    public final void a() {
        ganw ganw0 = new ganw(this);
        gann gann0 = this.a;
        if(gann0.ah) {
            ganw0.run();
            return;
        }
        gann0.d.add(ganw0);
    }

    public final void b(gano gano0) {
        if(this.f) {
            throw new IllegalStateException("Can\'t start an action due to potential state loss!");
        }
        this.c.add(Integer.valueOf(1001));
        this.d.add(gano0.a);
        this.b.add(Integer.valueOf(0));
        this.e.add(null);
        this.a();
    }

    @Override  // gaxs
    protected final void lv() {
        this.f = true;
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ArrayList arrayList0 = this.e;
            ganm ganm0 = (ganm)arrayList0.get(v1);
            if(ganm0 != null) {
                ganm0.e = null;
            }
            arrayList0.set(v1, null);
        }
    }

    @Override  // gaxs
    protected final void lw() {
        this.f = false;
        ganx ganx0 = () -> {
            ganw ganw0 = new ganw(this);
            gann gann0 = this.a;
            if(gann0.ah) {
                ganw0.run();
                return;
            }
            gann0.d.add(ganw0);
        };
        gany.i.post(ganx0);
    }

    @Override  // gaxs
    public final void lx(Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        bundle1.putIntegerArrayList("executionIds", this.b);
        bundle1.putIntegerArrayList("requestCodes", this.c);
        bundle1.putParcelableArrayList("requests", this.d);
        bundle0.putBundle(gany.h, bundle1);
    }
}

