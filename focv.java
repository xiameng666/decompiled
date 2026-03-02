import android.view.View;
import android.view.ViewGroup;

final class focv {
    public final fnir a;
    private final fodo b;
    private final fnfm c;
    private final fodq d;

    public focv(fodo fodo0, fodq fodq0, fnfm fnfm0, fnir fnir0) {
        this.b = fodo0;
        this.d = fodq0;
        this.c = fnfm0;
        this.a = fnir0;
    }

    static void a(fodo fodo0, View view0) {
        if((view0 instanceof fods)) {
            ((fods)view0).b(fodo0);
        }
        if((view0 instanceof ViewGroup)) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                focv.a(fodo0, ((ViewGroup)view0).getChildAt(v1));
            }
        }
    }

    public final void b(View view0, int v, Object object0) {
        focr focr0;
        if(object0 == null) {
            focr0 = new focr(2, null);
        }
        else {
            fnfm fnfm0 = this.c;
            if(fnfm0.j(object0)) {
                String s = fnfm0.d(object0);
                focr0 = s == null || !s.contains("@") ? new focr(2, null) : new focr(1, s);
            }
            else {
                focr0 = new focr(3, null);
            }
        }
        focr focr1 = (focr)view0.getTag(0x7F0B2456);  // id:view_bound_account_tag
        if(!focr0.equals(focr1)) {
            if(focr1 == null) {
                this.d.a(view0, v, focr0);
                focv.d(view0, focr0);
                return;
            }
            if(view0.isAttachedToWindow()) {
                focv.c(this.b, view0);
                this.d.b.e(view0);
                this.d.a(view0, v, focr0);
                focv.a(this.b, view0);
                focv.d(view0, focr0);
            }
        }
    }

    static void c(fodo fodo0, View view0) {
        if((view0 instanceof ViewGroup)) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                focv.c(fodo0, ((ViewGroup)view0).getChildAt(v1));
            }
        }
        if((view0 instanceof fods)) {
            ((fods)view0).mn(fodo0);
        }
    }

    private static void d(View view0, focr focr0) {
        view0.setTag(0x7F0B2456, focr0);  // id:view_bound_account_tag
    }
}

