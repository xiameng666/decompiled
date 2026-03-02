import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class dwip extends tk {
    public final dwiz a;
    private final gvbz e;
    private final gvby f;

    public dwip(gvbz gvbz0, gvby gvby0, dwiz dwiz0) {
        ibuq.f(gvbz0, "categoryOptions");
        ibuq.f(gvby0, "initialCheckedCategoryInfo");
        ibuq.f(dwiz0, "viewModel");
        super();
        this.e = gvbz0;
        this.f = gvby0;
        this.a = dwiz0;
        if((gvby0.b & 1) != 0 && dwiz0.a == null) {
            hfuo hfuo0 = gvbz0.b;
            ibuq.e(hfuo0, "getUcpCategoryOptionsList(...)");
            int v = 0;
            Iterator iterator0 = hfuo0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    v = -1;
                    break;
                }
                Object object0 = iterator0.next();
                if(((gvby)object0).c == this.f.c) {
                    break;
                }
                ++v;
            }
            dwiz0.a = v;
        }
    }

    @Override  // tk
    public final int b() {
        return this.e.b.size();
    }

    @Override  // tk
    public final int dx(int v) {
        return 1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        if(v != 1) {
            throw new IllegalArgumentException("Unknown view type: " + v);
        }
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0CFA, viewGroup0, false);  // layout:wallet_edit_pass_category_option
        ibuq.e(view0, "inflate(...)");
        return new dwio(view0);
    }

    public final gvby f() {
        Integer integer0 = this.a.a;
        return integer0 == null || ((int)integer0) < 0 ? null : ((gvby)this.e.b.get(integer0.intValue()));
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        boolean z;
        fule fule0;
        ibuq.f(uq0, "viewHolder");
        if((uq0 instanceof dwio)) {
            gvby gvby0 = (gvby)this.e.b.get(v);
            ibuq.e(gvby0, "getUcpCategoryOptions(...)");
            if(v == 0) {
                fule0 = fule.b;
            }
            else {
                fule0 = v == this.b() - 1 ? fule.d : fule.c;
            }
            Integer integer0 = this.a.a;
            if(integer0 == null) {
                z = false;
            }
            else if(v == ((int)integer0)) {
                z = true;
            }
            else {
                z = false;
            }
            dwim dwim0 = new dwim(uq0, this);
            ibuq.f(gvby0, "categoryOption");
            ibuq.f(fule0, "position");
            if(hwfk.av()) {
                ((dwio)uq0).t.setVisibility(8);
                ((dwio)uq0).u.setVisibility(0);
                ftzv ftzv0 = ((dwio)uq0).u.h;
                String s = gvby0.d;
                ibuq.e(s, "getLabel(...)");
                ftzv ftzv1 = ftzv.c(ftzv0, new fryu(s), new fubb(z), z, fule0, true, new dwin(dwim0, ((dwio)uq0)), 0xC56);
                ((dwio)uq0).u.g(ftzv1);
                return;
            }
            ((dwio)uq0).u.setVisibility(8);
            ((dwio)uq0).t.setVisibility(0);
            ((dwio)uq0).t.setText(gvby0.d);
            ((dwio)uq0).t.setChecked(z);
            ((dwio)uq0).t.setOnClickListener(dwim0);
        }
    }
}

