import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;

public final class gatc implements ViewTreeObserver.OnGlobalLayoutListener, gasw, gasz {
    public gata a;
    final CoordinatorLayout b;
    public final ArrayList c;
    public final ArrayList d;
    public long[] e;
    public final ArrayList f;
    private int g;

    public gatc(CoordinatorLayout coordinatorLayout0) {
        this.c = new ArrayList(0);
        this.d = new ArrayList(1);
        this.f = new ArrayList();
        this.b = coordinatorLayout0;
        coordinatorLayout0.setClipChildren(false);
        coordinatorLayout0.setClipToPadding(false);
        gaxl.a();
        if(!hzmb.e()) {
            coordinatorLayout0.setImportantForAutofill(8);
        }
    }

    public final View a() {
        ArrayList arrayList0 = this.d;
        int v = arrayList0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            gass gass0 = ((gatb)arrayList0.get(v)).f;
            View view0 = gass0.y(gass0).s();
            if(view0 != null) {
                return view0;
            }
        }
        return this.b;
    }

    @Override  // gasw
    public final boolean aC() {
        return true;
    }

    @Override  // gasw
    public final boolean aH() {
        return true;
    }

    @Override  // gasw
    public final gass aR(gass gass0, gaso gaso0) {
        return null;
    }

    public final void b() {
        this.d.clear();
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gass gass0 = ((gatb)arrayList0.get(v1)).f;
            gass0.an(null);
            this.a.f(gass0.e);
        }
        arrayList0.clear();
    }

    public final void c(gatb gatb0) {
        ArrayList arrayList0 = this.d;
        if(!arrayList0.contains(gatb0)) {
            arrayList0.add(gatb0);
            gatb0.c(true);
            if(gatb0.b) {
                for(int v = arrayList0.size() - 2; v >= 0; --v) {
                    ((gatb)arrayList0.get(v)).c(false);
                }
            }
            this.d();
        }
    }

    public final void d() {
        float f = -1.0f;
        gatb gatb0 = null;
        int v = 0;
        boolean z = false;
        int v1 = -1;
        float f1 = -1.0f;
        gatb gatb1 = null;
        while(true) {
            ArrayList arrayList0 = this.d;
            if(v >= arrayList0.size()) {
                break;
            }
            gatb gatb2 = v <= 0 ? null : ((gatb)arrayList0.get(v - 1));
            gatb gatb3 = (gatb)arrayList0.get(v);
            if(gatb3.a) {
                if(v != arrayList0.size() - 1) {
                    gatb3.b(4);
                }
                else if(gatb2 != null && gatb2.a) {
                    if(gatb1 == null) {
                        gatb1 = null;
                    }
                    else if(gatb1.b) {
                        gatb3.b(3);
                        goto label_26;
                    }
                    gatb3.b(2);
                }
                else {
                    gatb3.b(1);
                }
            label_26:
                if(gatb1 == null) {
                    gatb1 = gatb3;
                }
                float f2 = gatb3.c;
                if((f2 >= 0.0f)) {
                    f1 = f2;
                }
                gaxl.a();
                int v2 = gatb3.d;
                if(v2 != -1) {
                    v1 = v2;
                }
                z = gatb3.e;
            }
            else {
                gatb3.b(5);
            }
            ++v;
        }
        if(gatb1 != null) {
            if(gatb1.b) {
                gatb0 = gatb1;
            }
            else {
                gatb0 = gatb1;
                f = f1;
            }
        }
        CoordinatorLayout coordinatorLayout0 = this.b;
        Window window0 = gawo.a(coordinatorLayout0);
        if(window0 != null) {
            WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
            if((f > 0.0f)) {
                windowManager$LayoutParams0.flags |= 2;
                windowManager$LayoutParams0.dimAmount = f;
            }
            else {
                windowManager$LayoutParams0.flags &= -3;
                windowManager$LayoutParams0.dimAmount = 0.0f;
            }
            window0.setAttributes(windowManager$LayoutParams0);
        }
        gaxl.a();
        if(v1 != -1 && gatb0 != null) {
            Window window1 = gawo.a(coordinatorLayout0);
            if(window1 != null) {
                window1.setNavigationBarColor(v1);
            }
        }
        if(gatb0 != null) {
            Window window2 = gawo.a(coordinatorLayout0);
            if(coordinatorLayout0 != null && window2 != null && z) {
                kfv.a(window2, false);
                coordinatorLayout0.setFitsSystemWindows(false);
            }
        }
    }

    @Override  // gasz
    public final void g(gass gass0, View view0) {
    }

    public final long[] h() {
        ArrayList arrayList0 = this.d;
        int v = arrayList0.size();
        long[] arr_v = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = ((gatb)arrayList0.get(v1)).a();
        }
        return arr_v;
    }

    @Override  // gasz
    public final void nP(View view0) {
        this.b.removeView(view0);
    }

    @Override  // gasz
    public final void nv(gass gass0, View view0, int v) {
        this.b.addView(view0, v);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect0 = new Rect();
        CoordinatorLayout coordinatorLayout0 = this.b;
        coordinatorLayout0.getWindowVisibleDisplayFrame(rect0);
        int v = Math.max(coordinatorLayout0.getContext().getResources().getDisplayMetrics().heightPixels - (rect0.bottom - rect0.top), 0);
        if(v != this.g) {
            View view0 = coordinatorLayout0.findFocus();
            if(view0 != null) {
                view0.invalidate();
                view0.requestLayout();
            }
            this.g = v;
        }
    }

    @Override  // gasw
    public final gass y(gass gass0) {
        return gass0;
    }
}

