import android.view.View;
import android.view.ViewParent;

public final class kec {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public kec(View view0) {
        this.d = view0;
    }

    public final void a(boolean z) {
        if(this.a) {
            this.d.stopNestedScroll();
        }
        this.a = z;
    }

    public final void b() {
        this.c(0);
    }

    public final void c(int v) {
        ViewParent viewParent0 = this.n(v);
        if(viewParent0 != null) {
            kfp.d(viewParent0, this.d, v);
            this.o(v, null);
        }
    }

    public final boolean d(float f, float f1, boolean z) {
        if(this.a) {
            return this.b == null ? false : kfp.e(this.b, this.d, f, f1, z);
        }
        return false;
    }

    public final boolean e(float f, float f1) {
        if(this.a) {
            return this.b == null ? false : kfp.f(this.b, this.d, f, f1);
        }
        return false;
    }

    public final boolean f(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.g(v, v1, arr_v, arr_v1, 0);
    }

    public final boolean g(int v, int v1, int[] arr_v, int[] arr_v1, int v2) {
        int v5;
        int v4;
        if(this.a) {
            ViewParent viewParent0 = this.n(v2);
            if(viewParent0 == null) {
                return false;
            }
            if(v != 0) {
                goto label_12;
            }
            if(v1 != 0) {
                v = 0;
                goto label_12;
            }
            if(arr_v1 != null) {
                arr_v1[0] = 0;
                arr_v1[1] = 0;
                return false;
            label_12:
                if(arr_v1 == null) {
                    arr_v1 = null;
                    v5 = 0;
                    v4 = 0;
                }
                else {
                    this.d.getLocationInWindow(arr_v1);
                    int v3 = arr_v1[0];
                    v4 = arr_v1[1];
                    v5 = v3;
                }
                if(arr_v == null) {
                    arr_v = this.p();
                }
                arr_v[0] = 0;
                arr_v[1] = 0;
                View view0 = this.d;
                kfp.a(viewParent0, view0, v, v1, arr_v, v2);
                if(arr_v1 != null) {
                    view0.getLocationInWindow(arr_v1);
                    arr_v1[0] -= v5;
                    arr_v1[1] -= v4;
                }
                return arr_v[0] != 0 || arr_v[1] != 0;
            }
        }
        return false;
    }

    public final boolean h(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.i(v, v1, v2, v3, arr_v, 0, null);
    }

    public final boolean i(int v, int v1, int v2, int v3, int[] arr_v, int v4, int[] arr_v1) {
        int v11;
        int v10;
        int v8;
        int v7;
        int v6;
        int v5;
        int[] arr_v2;
        if(this.a) {
            ViewParent viewParent0 = this.n(v4);
            if(viewParent0 == null) {
                return false;
            }
            if(v != 0) {
                goto label_30;
            }
            if(v1 != 0) {
                goto label_24;
            }
            if(v2 != 0) {
                goto label_18;
            }
            if(v3 != 0) {
                arr_v2 = arr_v;
                v5 = 0;
                v6 = 0;
                v7 = v3;
                v8 = 0;
                goto label_35;
            }
            if(arr_v != null) {
                arr_v[0] = 0;
                arr_v[1] = 0;
                return false;
            label_18:
                arr_v2 = arr_v;
                v5 = 0;
                v7 = v3;
                v8 = v2;
                v6 = 0;
                goto label_35;
            label_24:
                arr_v2 = arr_v;
                v7 = v3;
                v8 = v2;
                v6 = v1;
                v5 = 0;
                goto label_35;
            label_30:
                v5 = v;
                arr_v2 = arr_v;
                v7 = v3;
                v8 = v2;
                v6 = v1;
            label_35:
                if(arr_v2 == null) {
                    arr_v2 = null;
                    v11 = 0;
                    v10 = 0;
                }
                else {
                    this.d.getLocationInWindow(arr_v2);
                    int v9 = arr_v2[0];
                    v10 = arr_v2[1];
                    v11 = v9;
                }
                if(arr_v1 == null) {
                    arr_v1 = this.p();
                    arr_v1[0] = 0;
                    arr_v1[1] = 0;
                }
                View view0 = this.d;
                kfp.b(viewParent0, view0, v5, v6, v8, v7, v4, arr_v1);
                if(arr_v2 != null) {
                    view0.getLocationInWindow(arr_v2);
                    arr_v2[0] -= v11;
                    arr_v2[1] -= v10;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return this.k(0);
    }

    public final boolean k(int v) {
        return this.n(v) != null;
    }

    public final boolean l(int v) {
        return this.m(v, 0);
    }

    public final boolean m(int v, int v1) {
        if(!this.k(v1)) {
            if(this.a) {
                View view0 = this.d;
                ViewParent viewParent0 = view0.getParent();
                View view1 = view0;
                while(viewParent0 != null) {
                    if(kfp.g(viewParent0, view1, view0, v, v1)) {
                        this.o(v1, viewParent0);
                        kfp.c(viewParent0, view1, view0, v, v1);
                        return true;
                    }
                    if((viewParent0 instanceof View)) {
                        view1 = (View)viewParent0;
                    }
                    viewParent0 = viewParent0.getParent();
                }
            }
            return false;
        }
        return true;
    }

    private final ViewParent n(int v) {
        return v == 0 ? this.b : this.c;
    }

    private final void o(int v, ViewParent viewParent0) {
        if(v != 0) {
            this.c = viewParent0;
            return;
        }
        this.b = viewParent0;
    }

    private final int[] p() {
        if(this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }
}

