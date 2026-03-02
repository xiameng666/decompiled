import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.setupdesign.GlifRecyclerLayout;
import com.google.android.setupdesign.items.ItemGroup;
import java.util.Map;

public final class erky extends du implements gahi {
    public static final baun a;
    public gafh ag;
    public gahk ah;
    public ItemGroup ai;
    final Map aj;
    public boolean ak;
    public boolean al;
    public final Runnable am;
    private epzz an;
    private View ao;
    private boolean ap;
    private final eqcr aq;
    private final Runnable ar;
    private final Runnable as;
    public erkw b;
    public Handler c;
    public GlifRecyclerLayout d;

    static {
        erky.a = new erqc(new String[]{"Setup", "UI", "RecyclerLayoutDiscoveryFragment"});
    }

    public erky() {
        this.aj = new bxd();
        this.ak = false;
        this.ap = false;
        this.al = false;
        this.aq = new erkq(this);
        this.am = new erkr(this);
        this.ar = new erks(this);
        this.as = new erkt(this);
    }

    final void A() {
        if(this.al) {
            return;
        }
        eqcr eqcr0 = this.aq;
        long v = hyge.a.b().a();
        if(v > 0L && !this.ak) {
            eqcr0 = new epwr(new clht(Looper.getMainLooper()), v, eqcr0, new erkv(this));
        }
        this.an.k(eqcr0);
        this.al = true;
        this.b.n();
    }

    public final void B() {
        erky.a.d("startSearching", new Object[0]);
        this.ap = false;
        this.d.L(0x7F152EC7);  // string:smartdevice_searching_for_devices "Searching for devices"
        this.y(true);
        this.ag.f(8);
        this.A();
        this.c.removeCallbacks(this.am);
        this.c.postDelayed(this.as, 25000L);
    }

    public final void C() {
        erky.a.d("Stopping scan", new Object[0]);
        this.an.l();
        this.al = false;
    }

    @Override  // gahi
    public final void a(gagz gagz0) {
        if((gagz0 instanceof erkx)) {
            erkw erkw0 = this.b;
            int v = this.ah.b();
            erkw0.m(((erkx)gagz0).a, v, false);
            return;
        }
        Object[] arr_object = {gagz0.getClass().getSimpleName()};
        erky.a.f("Unknown item in the target devices list, type: %s.", arr_object);
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        try {
            this.b = (erkw)context0;
        }
        catch(ClassCastException classCastException0) {
            throw new RuntimeException("Containing activity must implement DiscoveryFragment.Listener", classCastException0);
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        erky.a.d("onCreate", new Object[0]);
        super.onCreate(bundle0);
        if(bundle0 != null) {
            this.ak = bundle0.getBoolean("didAutoConnect");
        }
        Context context0 = this.getContext();
        if(context0 != null) {
            this.an = new epzz(context0);
        }
        this.c = new clht();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        if(hoxb.d()) {
            Context context0 = this.getContext();
            batl.s(context0);
            layoutInflater0 = layoutInflater0.cloneInContext(context0);
            layoutInflater0.setFactory2(new bagp());
        }
        GlifRecyclerLayout glifRecyclerLayout0 = (GlifRecyclerLayout)layoutInflater0.inflate(0x7F0E09ED, viewGroup0, false);  // layout:smartdevice_setup_discovery_recycler_layout
        this.d = glifRecyclerLayout0;
        gaff gaff0 = (gaff)glifRecyclerLayout0.t(gaff.class);
        gafg gafg0 = new gafg(this.d.getContext());
        gafg0.b(0x7F152EC6);  // string:smartdevice_search_again "Search again"
        gafg0.b = new erku(this);
        gafg0.c = 5;
        gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
        gafh gafh0 = gafg0.a();
        this.ag = gafh0;
        gaff0.c(gafh0);
        this.ag.f(8);
        gagd gagd0 = new gagd();
        gagd0.e(new ColorDrawable(this.d.getResources().getColor(0x106000D)));
        gaih gaih0 = this.d.a;
        gaih0.a.ah(gaih0.c);
        gaih0.c = gagd0;
        gaih0.a.A(gaih0.c);
        gaih0.e();
        return this.d;
    }

    @Override  // du
    public final void onPause() {
        erky.a.d("onPause", new Object[0]);
        this.c.removeCallbacks(this.am);
        this.c.removeCallbacks(this.ar);
        this.c.removeCallbacks(this.as);
        this.C();
        super.onPause();
    }

    @Override  // du
    public final void onResume() {
        erky.a.d("onResume", new Object[0]);
        super.onResume();
        this.ai.i();
        this.aj.clear();
        this.c.postDelayed(this.ar, 300L);
        this.c.postDelayed(this.as, 25000L);
        this.B();
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putBoolean("didAutoConnect", this.ak);
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        erky.a.d("onViewCreated", new Object[0]);
        this.d.O(true);
        this.ao = this.d.z();
        gahk gahk0 = (gahk)this.d.c();
        this.ah = gahk0;
        gahk0.h = this;
        this.ai = (ItemGroup)gahk0.G(0x7F0B2247);  // id:target_device_item_group
    }

    public final void y(boolean z) {
        View view0 = this.ao;
        if(z) {
            view0.setVisibility(0);
            return;
        }
        view0.setVisibility(4);
    }

    public final void z() {
        if(!this.ap) {
            this.ap = true;
            this.d.L(0x7F152E47);  // string:smartdevice_choose_device "Choose your device"
            this.c.removeCallbacks(this.as);
            if(hyim.a.e().K()) {
                this.c.postDelayed(this.am, 5000L);
            }
        }
    }
}

