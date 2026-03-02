import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class bxpb {
    public final fm a;
    public BottomSheetBehavior b;
    public int c;
    public int d;
    public long e;
    private final View f;
    private final int g;
    private final kba h;
    private int i;

    public bxpb(fm fm0, View view0, int v, kba kba0, Bundle bundle0) {
        this.c = 0x7F0B1143;  // id:dialog_container_1
        this.i = 0x7F0B1144;  // id:dialog_container_2
        this.a = fm0;
        this.f = view0;
        this.g = v;
        this.h = kba0;
        this.e = 150L;
        if(bundle0 != null) {
            this.c = bundle0.getInt("key_current_container_id");
            this.i = bundle0.getInt("key_next_container_id");
        }
    }

    public final void a(du du0, String s) {
        fm fm0 = this.a;
        du du1 = fm0.g(this.c);
        if(du1 != null) {
            this.f.findViewById(this.i).setVisibility(4);
        }
        BottomSheetBehavior bottomSheetBehavior0 = this.b;
        if(bottomSheetBehavior0 != null) {
            int v = this.d;
            if(v > 0 || du1 == null) {
                bottomSheetBehavior0.I(v);
            }
            this.b.K(4);
        }
        ca ca0 = new ca(fm0);
        ca0.u(this.i, du0, s);
        ca0.f();
        int v1 = this.c;
        this.c = this.i;
        this.i = v1;
    }

    public final void b(int v) {
        this.c(v, -1);
    }

    public final void c(int v, int v1) {
        long v2 = v1 >= 0 ? ((long)v1) : ((long)(((Long)this.h.a())));
        int v3 = Math.min(v, ((int)(((long)this.g) * v2 / 100L)));
        du du0 = this.a.g(this.i);
        du du1 = this.a.g(this.c);
        if(du1 != null && du1.getView() != null) {
            if(du0 == null) {
                BottomSheetBehavior bottomSheetBehavior0 = this.b;
                if(bottomSheetBehavior0 != null) {
                    bottomSheetBehavior0.I(v3);
                }
            }
            else {
                du1.getView().setAlpha(0.0f);
                this.f.findViewById(this.c).setVisibility(0);
                int v4 = this.d;
                BottomSheetBehavior bottomSheetBehavior1 = this.b;
                if(bottomSheetBehavior1 != null && v4 == 0) {
                    v4 = bottomSheetBehavior1.t();
                }
                ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{v4, v3});
                valueAnimator0.addUpdateListener(new bxoy(this, du0, du1));
                valueAnimator0.setDuration(this.e);
                valueAnimator0.addListener(new bxoz(this, du0));
                valueAnimator0.start();
            }
        }
    }

    public final void d(Bundle bundle0) {
        bundle0.putInt("key_current_container_id", this.c);
        bundle0.putInt("key_next_container_id", this.i);
    }

    public final void e(BottomSheetBehavior bottomSheetBehavior0) {
        this.b = bottomSheetBehavior0;
        bottomSheetBehavior0.w(new bxpa(this, bottomSheetBehavior0));
    }
}

