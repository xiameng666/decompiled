import android.graphics.PointF;
import android.view.View;

public class sy extends ua {
    private sw b;
    private sw c;

    @Override  // ua
    public final int a(tx tx0, int v, int v1) {
        int v8;
        sw sw0;
        View view0 = null;
        int v2 = tx0.at();
        if(v2 != 0) {
            if(tx0.ae()) {
                sw0 = this.h(tx0);
            }
            else {
                sw0 = tx0.ad() ? this.g(tx0) : null;
            }
            if(sw0 != null) {
                int v3 = tx0.ar();
                int v4 = 0;
                int v6 = 0x80000000;
                int v7 = 0x7FFFFFFF;
                View view1 = null;
                for(int v5 = 0; true; ++v5) {
                    v8 = 1;
                    if(v5 >= v3) {
                        break;
                    }
                    View view2 = tx0.az(v5);
                    if(view2 != null) {
                        int v9 = sy.i(view2, sw0);
                        if(v9 <= 0 && v9 > v6) {
                            view1 = view2;
                            v6 = v9;
                        }
                        if(v9 >= 0 && v9 < v7) {
                            view0 = view2;
                            v7 = v9;
                        }
                    }
                }
                if(!tx0.ad()) {
                    v = v1;
                }
                int v10 = v <= 0 ? 0 : 1;
                if(v10 != 0 && view0 != null) {
                    return tx.bl(view0);
                }
                if(v10 == 0 && view1 != null) {
                    return tx.bl(view1);
                }
                if(1 == v10) {
                    view0 = view1;
                }
                if(view0 != null) {
                    int v11 = tx.bl(view0);
                    int v12 = tx0.at();
                    if((tx0 instanceof ul)) {
                        PointF pointF0 = ((ul)tx0).O(v12 - 1);
                        if(pointF0 != null && ((pointF0.x < 0.0f) || (pointF0.y < 0.0f))) {
                            v4 = 1;
                        }
                    }
                    if(v4 == v10) {
                        v8 = -1;
                    }
                    int v13 = v11 + v8;
                    return v13 < 0 || v13 >= v2 ? -1 : v13;
                }
            }
        }
        return -1;
    }

    @Override  // ua
    public final um b(tx tx0) {
        return !(tx0 instanceof ul) ? null : new sx(this, this.a.getContext());
    }

    @Override  // ua
    public View c(tx tx0) {
        if(tx0.ae()) {
            return sy.j(tx0, this.h(tx0));
        }
        return tx0.ad() ? sy.j(tx0, this.g(tx0)) : null;
    }

    @Override  // ua
    public final int[] d(tx tx0, View view0) {
        int[] arr_v = new int[2];
        arr_v[0] = tx0.ad() ? sy.i(view0, this.g(tx0)) : 0;
        if(tx0.ae()) {
            arr_v[1] = sy.i(view0, this.h(tx0));
            return arr_v;
        }
        arr_v[1] = 0;
        return arr_v;
    }

    private final sw g(tx tx0) {
        if(this.c == null || this.c.a != tx0) {
            this.c = new su(tx0);
        }
        return this.c;
    }

    private final sw h(tx tx0) {
        if(this.b == null || this.b.a != tx0) {
            this.b = new sv(tx0);
        }
        return this.b;
    }

    private static final int i(View view0, sw sw0) {
        return sw0.d(view0) + sw0.b(view0) / 2 - (sw0.j() + sw0.k() / 2);
    }

    private static final View j(tx tx0, sw sw0) {
        int v = tx0.ar();
        View view0 = null;
        if(v == 0) {
            return null;
        }
        int v1 = sw0.j() + sw0.k() / 2;
        int v2 = 0;
        for(int v3 = 0x7FFFFFFF; v2 < v; v3 = v4 >= v3 ? v3 : v4) {
            View view1 = tx0.az(v2);
            int v4 = Math.abs(sw0.d(view1) + sw0.b(view1) / 2 - v1);
            if(v4 < v3) {
                view0 = view1;
            }
            ++v2;
        }
        return view0;
    }
}

