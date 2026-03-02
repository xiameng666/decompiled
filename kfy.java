import android.view.WindowInsets;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import android.view.WindowInsetsAnimation;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class kfy extends WindowInsetsAnimation.Callback {
    private final kfx a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public kfy(kfx kfx0) {
        super(kfx0.e);
        this.d = new HashMap();
        this.a = kfx0;
    }

    private final kga a(WindowInsetsAnimation windowInsetsAnimation0) {
        HashMap hashMap0 = this.d;
        kga kga0 = (kga)hashMap0.get(windowInsetsAnimation0);
        if(kga0 == null) {
            kga0 = new kga(windowInsetsAnimation0);
            hashMap0.put(windowInsetsAnimation0, kga0);
        }
        return kga0;
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation0) {
        kga kga0 = this.a(windowInsetsAnimation0);
        this.a.d(kga0);
        this.d.remove(windowInsetsAnimation0);
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation0) {
        kga kga0 = this.a(windowInsetsAnimation0);
        this.a.e(kga0);
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final WindowInsets onProgress(WindowInsets windowInsets0, List list0) {
        ArrayList arrayList0 = this.c;
        if(arrayList0 == null) {
            ArrayList arrayList1 = new ArrayList(list0.size());
            this.c = arrayList1;
            this.b = DesugarCollections.unmodifiableList(arrayList1);
        }
        else {
            arrayList0.clear();
        }
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            WindowInsetsAnimation windowInsetsAnimation0 = (WindowInsetsAnimation)list0.get(v);
            kga kga0 = this.a(windowInsetsAnimation0);
            float f = windowInsetsAnimation0.getFraction();
            kga0.a.a.setFraction(f);
            this.c.add(kga0);
        }
        kgq kgq0 = kgq.r(windowInsets0);
        return this.a.c(kgq0, this.b).e();
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation0, WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
        kga kga0 = this.a(windowInsetsAnimation0);
        kfw kfw0 = new kfw(windowInsetsAnimation$Bounds0);
        kfw kfw1 = this.a.b(kga0, kfw0);
        return new WindowInsetsAnimation.Bounds(kfw1.a.a(), kfw1.b.a());
    }
}

