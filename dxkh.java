import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;

public final class dxkh extends lh {
    public final du e;
    public final bhcg f;
    public dxio g;
    private static final dxjt h;

    static {
        dxkh.h = new dxjt();
    }

    public dxkh(du du0, bhcg bhcg0) {
        super(dxkh.h);
        this.e = du0;
        this.f = bhcg0;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        if(hwgz.d()) {
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E08B1, viewGroup0, false);  // layout:restricted_passes_compose_view
            ibuq.c(view0);
            return new dxkb(this, view0);
        }
        View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E080D, viewGroup0, false);  // layout:privacy_controls_pass_view
        ibuq.c(view1);
        return new dxkg(this, view1);
    }

    @Override  // lh
    public final void e(List list0, List list1) {
        ibuq.f(list0, "previousList");
        ibuq.f(list1, "currentList");
        dxio dxio0 = this.g;
        if(dxio0 != null) {
            ibuq.f(list0, "<unused var>");
            ibuq.f(list1, "currentList");
            View view0 = dxio0.a.ai;
            if(view0 == null) {
                ibuq.j("restrictedPassListTitleBar");
                view0 = null;
            }
            view0.setVisibility((list1.isEmpty() ? 8 : 0));
        }
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        dxkd dxkd0;
        ibuq.f(uq0, "viewHolder");
        if(hwgz.d()) {
            Object object0 = this.c(v);
            ibuq.e(object0, "getItem(...)");
            ibuq.f(((dohf)object0), "itemData");
            fryu fryu0 = new fryu(((dohf)object0).i());
            String s = ((dohf)object0).h();
            fryu fryu1 = s == null ? new fryu("") : new fryu(s);
            fuaz fuaz0 = new fuaz(new fryh(((dohf)object0).f()), null, null, null, 30);
            fubv fubv0 = new fubv(new fryh(0x7F08050E), null, null, null, null, 0x7E);  // drawable:gs_chevron_right_vd_theme_24
            boolean z = hwev.c();
            fuat fuat0 = new fuat(fryu0, fryu1, fuaz0, fubv0, 0, null, new dxjy(((dxkb)uq0), ((dohf)object0)), null, null, false, false, z, null, false, 0x37B0);
            ((ComposeView)((dxkb)uq0).a).a(new gze(0x4C0F2C3, true, new dxka(fuat0)));
            return;
        }
        Object object1 = this.c(v);
        ibuq.e(object1, "getItem(...)");
        ibuq.f(((dohf)object1), "itemData");
        Drawable drawable0 = ((dxkg)uq0).u.getResources().getDrawable(((dohf)object1).f(), ((dxkg)uq0).u.getTheme());
        ((dxkg)uq0).v.setBackground(drawable0);
        String s1 = ((dohf)object1).i();
        ((dxkg)uq0).w.setText(s1);
        ((dxkg)uq0).x.setText(((dohf)object1).h());
        int v1 = ((dohf)object1).h() == null ? 8 : 0;
        ((dxkg)uq0).x.setVisibility(v1);
        View view0 = ((dxkg)uq0).a;
        int v2 = ((dohf)object1).b();
        String s2 = ((dohf)object1).d();
        switch(v2) {
            case 0: {
                dxkd0 = new dxkd(((dxkg)uq0), s2);
                break;
            }
            case 1: 
            case 3: {
                dxkd0 = new dxkc(((dxkg)uq0), s2);
                break;
            }
            case 12: {
                dxkd0 = new dxke(((dxkg)uq0).y, s2, ((dxkg)uq0));
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown or unsupported pass type: " + v2);
            }
        }
        view0.setOnClickListener(dxkd0);
    }
}

