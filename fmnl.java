import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.List;

public final class fmnl extends tk {
    boolean a;
    private final List e;
    private final fmqf f;
    private final fmrq g;

    public fmnl(fmqf fmqf0, fmrq fmrq0, boolean z) {
        this.e = new ArrayList();
        this.f = fmqf0;
        this.g = fmrq0;
        this.a = z;
    }

    @Override  // tk
    public final int b() {
        return this.e.size();
    }

    @Override  // tk
    public final int dx(int v) {
        return 16;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new uq(new fmnk(viewGroup0.getContext()));
    }

    public final void f(List list0) {
        List list1 = this.e;
        list1.clear();
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            fmgt fmgt0 = (fmgt)object0;
            if(fmgt0.d.a().ordinal() != 3) {
            }
            else if(this.f.c() != 0) {
                continue;
            }
            list1.add(fmgt0);
        }
        this.q();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        fmnk fmnk0 = (fmnk)uq0.a;
        fmgt fmgt0 = (fmgt)this.e.get(v);
        MaterialButton materialButton0 = fmnk0.b;
        boolean z = this.a;
        materialButton0.setText(fmgt0.a);
        gfsx gfsx0 = fmgt0.b;
        if(gfsx0.i()) {
            materialButton0.setContentDescription(((CharSequence)gfsx0.d()));
        }
        ColorStateList colorStateList0 = null;
        materialButton0.u(null);
        boolean z1 = fmgt0.h;
        if(z1) {
            if(iaea.j()) {
                colorStateList0 = ColorStateList.valueOf(fyho.b(fmnk0, 0x7F0402DC));  // attr:colorOnPrimary
            }
            materialButton0.w(colorStateList0);
        }
        else {
            materialButton0.w(ColorStateList.valueOf((iaea.j() ? jxm.g(fyho.b(fmnk0, 0x7F0402FC), 38) : fmnk0.getContext().getColor(0x7F0600FD))));  // attr:colorOnSurfaceVariant
        }
        fmni fmni0 = new fmni(fmnk0);
        flbl.b(fmgt0.c, fmni0);
        int v1 = iaea.j() ? fyho.b(fmnk0, 0x7F0402DC) : fmgt0.e;  // attr:colorOnPrimary
        materialButton0.setTextColor(new ColorStateList(fmnk.a, new int[]{v1, (iaea.j() ? jxm.g(fyho.b(fmnk0, 0x7F0402FC), 38) : fmnk0.getContext().getColor(0x7F0600FD))}));  // attr:colorOnSurfaceVariant
        int v2 = iaea.j() ? fyho.b(fmnk0, 0x7F04030C) : fmgt0.f;  // attr:colorPrimary
        materialButton0.B(new ColorStateList(fmnk.a, new int[]{v2, (iaea.j() ? jxm.g(fyho.b(fmnk0, 0x7F040345), 38) : fmnk0.getContext().getColor(0x7F060878))}));  // attr:colorSurfaceVariant
        materialButton0.A(new ColorStateList(fmnk.a, new int[]{(iaea.j() ? 0 : fmgt0.g), 0}));
        materialButton0.setEnabled(z1);
        materialButton0.setOnClickListener(new fmnj(this.f, fmgt0));
        fmnk0.c = z;
        if(z) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)materialButton0.getLayoutParams();
            frameLayout$LayoutParams0.gravity = 0x800003;
            materialButton0.setLayoutParams(frameLayout$LayoutParams0);
        }
        this.g.a(String.valueOf(fmgt0.d.e));
    }

    public final boolean n() {
        return this.e.isEmpty();
    }
}

