import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;
import java.util.List;

public final class acdg extends accz {
    public final acdh f;
    public final int g;
    public final boolean h;
    public String i;
    public String j;
    public int k;
    public final List l;
    public Object[] m;
    public int[] n;
    private final int o;
    private final int p;
    private final boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private final View.OnClickListener u;
    private final View.OnLongClickListener v;
    private final View.OnClickListener w;

    public acdg(acdh acdh0, int v, int v1, boolean z, int v2, boolean z1) {
        this.l = new ArrayList();
        this.f = acdh0;
        this.o = v;
        this.p = v1;
        this.q = z;
        this.g = v2;
        this.h = z1;
        this.u = new acdd(this);
        this.v = new acde(this);
        this.w = new acdf(this);
    }

    @Override  // accz
    public final void I(ContactPerson contactPerson0) {
        this.Z(contactPerson0);
    }

    @Override  // accz
    public final void J(ContactPerson contactPerson0) {
        this.Z(contactPerson0);
    }

    @Override  // accz
    public final void K(ContactPerson contactPerson0, int v) {
        this.Z(contactPerson0);
    }

    @Override  // accz
    protected final void L() {
        this.q();
    }

    @Override  // accz
    protected final void M(boolean z) {
        if(z) {
            this.x(0, this.k + this.l.size());
            return;
        }
        this.w(0, this.k + this.l.size());
    }

    @Override  // accz
    public final void N(boolean z) {
        this.r = z;
    }

    @Override  // accz
    public final void P(boolean z) {
        this.s = z;
    }

    @Override  // accz
    public final void V(boolean z) {
        this.t = z;
        this.q();
    }

    public final void W(String s, String s1) {
        this.i = s;
        this.j = s1;
        this.k = 0;
        if(!TextUtils.isEmpty(s)) {
            ++this.k;
        }
        if(!TextUtils.isEmpty(this.j)) {
            ++this.k;
        }
        this.q();
    }

    private final int X(int v) {
        if(v >= this.k) {
            return 3;
        }
        switch(v) {
            case 0: {
                if(!TextUtils.isEmpty(this.i)) {
                    return 1;
                }
                return TextUtils.isEmpty(this.j) ? -1 : 2;
            }
            case 1: {
                return TextUtils.isEmpty(this.i) || TextUtils.isEmpty(this.j) ? -1 : 2;
            }
            default: {
                return -1;
            }
        }
    }

    private final ContactPerson Y(int v) {
        return (ContactPerson)this.l.get(v);
    }

    private final void Z(ContactPerson contactPerson0) {
        if(!this.a) {
            for(int v = 0; true; ++v) {
                List list0 = this.l;
                if(v >= list0.size()) {
                    break;
                }
                if(acfd.g(contactPerson0, ((ContactPerson)list0.get(v)))) {
                    this.r(this.k + v);
                }
            }
        }
    }

    private static final void aa(acee acee0, String s) {
        acee0.t.setText(s);
    }

    @Override  // tk
    public final int b() {
        if(!this.a) {
            return this.l.isEmpty() ? 0 : this.k + this.l.size();
        }
        return 0;
    }

    @Override  // tk
    public final int dx(int v) {
        switch(this.X(v)) {
            case 1: {
                return 0x7F0E009C;  // layout:appinvite_contextual_selection_header_text
            }
            case 2: {
                return 0x7F0E00A2;  // layout:appinvite_contextual_selection_sub_header_text
            }
            default: {
                return this.o;
            }
        }
    }

    @Override  // tk
    public final long dy(int v) {
        return v < this.k ? ((long)v) : ((long)this.Y(v - this.k).hashCode());
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v, viewGroup0, false);
        switch(v) {
            case 0x7F0E009B: {  // layout:appinvite_contextual_selection_grid_item
                return new acea(view0);
            }
            case 0x7F0E009C:   // layout:appinvite_contextual_selection_header_text
            case 0x7F0E00A2: {  // layout:appinvite_contextual_selection_sub_header_text
                return new acee(view0);
            }
            default: {
                return null;
            }
        }
    }

    @Override  // accz
    public final int f() {
        return this.m == null ? 0 : this.m.length;
    }

    @Override  // android.widget.SectionIndexer
    public final int getPositionForSection(int v) {
        return this.n[v];
    }

    @Override  // android.widget.SectionIndexer
    public final int getSectionForPosition(int v) {
        for(int v1 = 1; true; ++v1) {
            int[] arr_v = this.n;
            if(v1 >= arr_v.length) {
                break;
            }
            if(v < arr_v[v1]) {
                return v1 - 1;
            }
        }
        return this.m.length - 1;
    }

    @Override  // android.widget.SectionIndexer
    public final Object[] getSections() {
        return this.m;
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        boolean z = true;
        switch(this.X(v)) {
            case 1: {
                acdg.aa(((acee)uq0), this.i);
                return;
            }
            case 2: {
                acdg.aa(((acee)uq0), this.j);
                return;
            }
            default: {
                ContactPerson contactPerson0 = this.Y(v - this.k);
                boolean z1 = this.f.N(contactPerson0);
                boolean z2 = this.f.L(contactPerson0);
                acdc.ab(((acea)uq0), contactPerson0, z1, z2, this.t, this.r, this.s, ((accn)this.f).aj, ((accn)this.f).ak, this.e);
                View view0 = ((acea)uq0).a;
                ArrayList arrayList0 = contactPerson0.e;
                view0.setEnabled(((boolean)(arrayList0.isEmpty() ^ 1)));
                view0.setSelected(z1);
                view0.setOnClickListener(this.u);
                view0.setOnLongClickListener(this.v);
                view0.setTag(0x7F0B0BD7, contactPerson0);  // id:appinvite_chip_view_holder_tag_person
                View view1 = ((acea)uq0).C;
                if(view1 != null) {
                    if(!this.r || z2 || arrayList0.size() <= 1) {
                        z = false;
                    }
                    view1.setOnClickListener((z ? this.w : null));
                    view1.setClickable(z);
                }
            }
        }
    }

    @Override  // accz
    public final int n(int v) {
        switch(this.X(v)) {
            case 1: {
                return this.p;
            }
            case 2: {
                return this.p;
            }
            default: {
                return this.q ? this.p : 1;
            }
        }
    }
}

