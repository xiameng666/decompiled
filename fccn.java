import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import java.util.Locale;

public final class fccn extends tk implements gcjk {
    public final fccm a;
    public final gdcl e;
    public final byi f;
    final byi g;
    boolean h;
    private int i;

    public fccn(fccm fccm0, gdcl gdcl0) {
        this.f = new byi();
        this.g = new byi();
        this.a = fccm0;
        this.e = gdcl0;
    }

    @Override  // tk
    public final int b() {
        return this.a.c;
    }

    @Override  // tk
    public final int dx(int v) {
        hcfc hcfc0 = this.a.b(v);
        hcff hcff0 = this.a.c(v);
        boolean z = false;
        boolean z1 = hcfc0.c.size() > 0;
        boolean z2 = hcfc0.e.size() > 0;
        int v1 = fbdd.a(z1);
        if((hcfc0.b & 2) != 0) {
            z = true;
        }
        if(v1 + fbdd.a(z2) + fbdd.a(z) != 1) {
            return fcco.b(hcfc0, hcff0) + 1000;
        }
        if(z1) {
            return hcfc0.c.size() == 1 ? 1 : 2;
        }
        if(z2) {
            return 4;
        }
        return z ? 3 : fcco.b(hcfc0, hcff0) + 1000;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        Context context0 = viewGroup0.getContext();
        switch(v) {
            case 1: 
            case 2: {
                LinearLayout linearLayout0 = new LinearLayout(context0);
                linearLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                linearLayout0.setOrientation(1);
                return new fccg(linearLayout0);
            }
            case 3: {
                int v1 = this.i + 1;
                this.i = v1;
                FrameLayout frameLayout0 = new FrameLayout(context0);
                frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new fcch(frameLayout0, String.format(Locale.US, "simple-form-tag-%d", v1));
            }
            case 4: {
                FlexboxLayout flexboxLayout0 = new FlexboxLayout(context0);
                flexboxLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new fcce(flexboxLayout0);
            }
            default: {
                return null;
            }
        }
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        hcfc hcfc0 = this.a.b(v);
        gdcl gdcl0 = this.e;
        hcff hcff0 = this.a.c(v);
        if(!((fccf)uq0).G(hcfc0, gdcl0)) {
            ((fccf)uq0).D(gdcl0);
            ((fccf)uq0).F(hcfc0, gdcl0);
        }
        ((fccf)uq0).E(gdcl0, this.h);
        if(hcfe.a(hcff0.d) == 3) {
            byi byi0 = this.f;
            if(((gcji)byi0.d(hcff0.b)) == null) {
                gcji gcji0 = new gcji();
                gcjo.b(gcji0, hcff0.b, gdcl0.a);
                byi0.h(hcff0.b, gcji0);
            }
        }
        for(Object object0: hcfc0.f) {
            gevv gevv0 = (gevv)object0;
            byi byi1 = this.g;
            if(byi1.d(gevv0.c) == null) {
                fbzw fbzw0 = new fbzw(gevv0, gdcl0);
                fbzw0.c(gdcl0.a);
                byi1.h(gevv0.c, fbzw0);
            }
        }
    }

    @Override  // gcjk
    public final void lr() {
        byi byi0 = this.f;
        int v = byi0.b();
        for(int v2 = 0; v2 < v; ++v2) {
            long v3 = byi0.c(v2);
            gcjo.c(((gcji)byi0.f(v2)), v3, this.e.a);
        }
        byi0.g();
        byi byi1 = this.g;
        int v4 = byi1.b();
        for(int v1 = 0; v1 < v4; ++v1) {
            long v5 = byi1.c(v1);
            gcjo.c(((gcys)byi1.f(v1)), v5, this.e.a);
        }
        byi1.g();
    }
}

