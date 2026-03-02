import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

final class jpo extends ijr implements jpr, keg {
    public final Window a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final gra e;
    private boolean f;

    public jpo(Context context0, Window window0) {
        super(context0, null, 0, 6, null);
        this.a = window0;
        this.e = new ParcelableSnapshotMutableState(jpj.a, gul.a);
        kex.b(this, this);
        kfz.a(this, new jpm(this));
    }

    @Override  // jpr
    public final Window a() {
        return this.a;
    }

    public final void b(gpg gpg0, ibtw ibtw0) {
        super.i(gpg0);
        this.e.b(ibtw0);
        this.f = true;
        this.e();
    }

    @Override  // ijr
    protected final boolean c() {
        return this.f;
    }

    @Override  // ijr
    public final void d(goz goz0, int v) {
        goz goz1 = goz0.ao(0x6770D814);
        int v1 = (v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v;
        if(goz1.ad((v1 & 3) != 2, v1 & 1)) {
            ((ibtw)this.e.a()).a(goz1, Integer.valueOf(0));
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new jpn(this, v);
        }
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        if(!this.c) {
            int v = 0;
            View view1 = this.getChildAt(0);
            int v1 = Math.max(0, view1.getLeft());
            int v2 = Math.max(0, view1.getTop());
            int v3 = Math.max(0, this.getWidth() - view1.getRight());
            int v4 = Math.max(0, this.getHeight() - view1.getBottom());
            if(v1 != 0) {
                v = v1;
            }
            else if(v2 == 0) {
                if(v3 == 0) {
                    return v4 == 0 ? kgq0 : kgq0.p(0, 0, 0, v4);
                }
                return kgq0.p(0, 0, v3, v4);
            }
            return kgq0.p(v, v2, v3, v4);
        }
        return kgq0;
    }

    @Override  // ijr
    public final void g(boolean z, int v, int v1, int v2, int v3) {
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            return;
        }
        int v4 = this.getPaddingLeft() + this.getPaddingRight();
        int v5 = this.getPaddingTop() + this.getPaddingBottom();
        int v6 = view0.getMeasuredWidth();
        int v7 = view0.getMeasuredHeight();
        int v8 = this.getPaddingLeft() + (v2 - v - v6 - v4) / 2;
        int v9 = this.getPaddingTop() + (v3 - v1 - v7 - v5) / 2;
        view0.layout(v8, v9, v6 + v8, v7 + v9);
    }

    @Override  // ijr
    public final void h(int v, int v1) {
        int v11;
        int v2 = 0;
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            super.h(v, v1);
            return;
        }
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getSize(v1);
        int v5 = View.MeasureSpec.getMode(v1);
        int v6 = v5 != 0x80000000 || this.b || this.c || this.a.getAttributes().height != -2 ? v4 : v4 + 1;
        int v7 = this.getPaddingLeft() + this.getPaddingRight();
        int v8 = this.getPaddingTop() + this.getPaddingBottom();
        int v9 = v6 - v8;
        if(v9 >= 0) {
            v2 = v9;
        }
        int v10 = View.MeasureSpec.getMode(v);
        if(v10 != 0) {
            v = View.MeasureSpec.makeMeasureSpec((v3 - v7 >= 0 ? v3 - v7 : 0), 0x80000000);
        }
        if(v5 != 0) {
            v1 = View.MeasureSpec.makeMeasureSpec(v2, 0x80000000);
        }
        view0.measure(v, v1);
        switch(v10) {
            case 0x80000000: {
                v3 = Math.min(v3, view0.getMeasuredWidth() + v7);
                break;
            }
            case 0x40000000: {
                break;
            }
            default: {
                v3 = view0.getMeasuredWidth() + v7;
            }
        }
        switch(v5) {
            case 0x80000000: {
                v11 = Math.min(v4, view0.getMeasuredHeight() + v8);
                break;
            }
            case 0x40000000: {
                v11 = v4;
                break;
            }
            default: {
                v11 = view0.getMeasuredHeight() + v8;
            }
        }
        this.setMeasuredDimension(v3, v11);
        if(!this.c && view0.getMeasuredHeight() + v8 > v4) {
            Window window0 = this.a;
            if(window0.getAttributes().height == -2) {
                window0.addFlags(0x80000000);
                if(!this.b) {
                    window0.setLayout(-1, -1);
                }
            }
        }
    }
}

