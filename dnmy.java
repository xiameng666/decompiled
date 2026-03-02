import android.view.View;

public final class dnmy implements keg {
    public final dnnk a;

    public dnmy(dnnk dnnk0) {
        this.a = dnnk0;
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        ibuq.f(view0, "v");
        boolean z = kgq0.x(8);
        int v = kgq0.f(8).e;
        int v1 = kgq0.f(2).e;
        if(!z || v <= 0) {
            v = v1;
        }
        dnnk dnnk0 = this.a;
        View view1 = dnnk0.ag;
        View view2 = null;
        if(view1 == null) {
            ibuq.j("bottomActionBar");
            view1 = null;
        }
        View view3 = dnnk0.ag;
        if(view3 == null) {
            ibuq.j("bottomActionBar");
            view3 = null;
        }
        int v2 = view3.getPaddingLeft();
        View view4 = dnnk0.ag;
        if(view4 == null) {
            ibuq.j("bottomActionBar");
            view4 = null;
        }
        int v3 = view4.getPaddingTop();
        View view5 = dnnk0.ag;
        if(view5 == null) {
            ibuq.j("bottomActionBar");
        }
        else {
            view2 = view5;
        }
        view1.setPadding(v2, v3, view2.getPaddingRight(), v);
        return kgq0;
    }
}

