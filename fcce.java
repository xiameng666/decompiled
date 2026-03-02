import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class fcce extends fccf {
    final ArrayList t;
    public static final int u;
    private static final int[] w;
    private final int x;

    static {
        fcce.w = new int[]{0x7F0406EF};  // attr:internalUicNonFormFieldTextTopBottomMargin
    }

    protected fcce(ViewGroup viewGroup0) {
        super(viewGroup0);
        this.t = new ArrayList();
        TypedArray typedArray0 = this.H().obtainStyledAttributes(fcce.w);
        this.x = typedArray0.getDimensionPixelOffset(0, 0);
        typedArray0.recycle();
    }

    @Override  // fccf
    protected final void D(gdcl gdcl0) {
        super.D(gdcl0);
        this.t.clear();
    }

    @Override  // fccf
    public final void E(gdcl gdcl0, boolean z) {
        ArrayList arrayList0 = this.t;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((gcyd)arrayList0.get(v1)).c().setEnabled(z);
        }
    }

    @Override  // fccf
    protected final void F(hcfc hcfc0, gdcl gdcl0) {
        this.t.ensureCapacity(hcfc0.e.size());
        for(Object object0: hcfc0.e) {
            this.J(((gevs)object0), gdcl0);
        }
    }

    @Override  // fccf
    protected final boolean G(hcfc hcfc0, gdcl gdcl0) {
        ArrayList arrayList0 = this.t;
        int v = arrayList0.size();
        int v1 = hcfc0.e.size();
        int v2 = 0;
        if(v >= v1) {
            while(v2 < v1) {
                fcce.K(((gcyd)arrayList0.get(v2)), ((gevs)hcfc0.e.get(v2)), gdcl0);
                ++v2;
            }
            while(true) {
                --v;
                if(v < v1) {
                    break;
                }
                gcyd gcyd0 = (gcyd)arrayList0.get(v);
                gcjo.c(gcyd0.c(), gcyd0.l().c, gdcl0.a);
                this.v.removeView(gcyd0.c());
                arrayList0.remove(v);
            }
        }
        else {
            arrayList0.ensureCapacity(v1);
            while(v2 < v) {
                fcce.K(((gcyd)arrayList0.get(v2)), ((gevs)hcfc0.e.get(v2)), gdcl0);
                ++v2;
            }
            while(v < v1) {
                this.J(((gevs)hcfc0.e.get(v)), gdcl0);
                ++v;
            }
        }
        return true;
    }

    private final void J(gevs gevs0, gdcl gdcl0) {
        Context context0 = this.H();
        gcjn gcjn0 = gdcl0.a;
        LayoutInflater layoutInflater0 = this.I();
        gcyd gcyd0 = gcyh.c(gevs0, 8, context0, gcjn0, gdcl0.e, layoutInflater0, this.v, this.x, this.x, -1, false, false);
        this.t.add(gcyd0);
    }

    private static void K(gcyd gcyd0, gevs gevs0, gdcl gdcl0) {
        gcjo.c(gcyd0.c(), gcyd0.l().c, gdcl0.a);
        gcyd0.i(gevs0);
        gcjo.b(gcyd0.c(), gevs0.c, gdcl0.a);
    }
}

