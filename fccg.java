import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.wallet.ui.common.InfoMessageView;
import java.util.ArrayList;

public final class fccg extends fccf {
    final ArrayList t;
    public static final int u;

    public fccg(LinearLayout linearLayout0) {
        super(linearLayout0);
        this.t = new ArrayList();
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
            ((InfoMessageView)arrayList0.get(v1)).setEnabled(z);
        }
    }

    @Override  // fccf
    protected final void F(hcfc hcfc0, gdcl gdcl0) {
        LayoutInflater layoutInflater0 = this.I();
        this.t.ensureCapacity(hcfc0.c.size());
        for(Object object0: hcfc0.c) {
            this.J(((gfgr)object0), layoutInflater0);
        }
        this.K((hcfb.a(hcfc0.h) == 0 ? 1 : hcfb.a(hcfc0.h)));
    }

    @Override  // fccf
    protected final boolean G(hcfc hcfc0, gdcl gdcl0) {
        ArrayList arrayList0 = this.t;
        int v = arrayList0.size();
        int v1 = hcfc0.c.size();
        int v2 = 0;
        if(v >= v1) {
            while(v2 < v1) {
                ((InfoMessageView)arrayList0.get(v2)).p(((gfgr)hcfc0.c.get(v2)));
                ++v2;
            }
            while(true) {
                --v;
                if(v < v1) {
                    break;
                }
                this.v.removeView(((View)arrayList0.get(v)));
                arrayList0.remove(v);
            }
        }
        else {
            LayoutInflater layoutInflater0 = this.I();
            arrayList0.ensureCapacity(v1);
            while(v2 < v) {
                ((InfoMessageView)arrayList0.get(v2)).p(((gfgr)hcfc0.c.get(v2)));
                ++v2;
            }
            while(v < v1) {
                this.J(((gfgr)hcfc0.c.get(v)), layoutInflater0);
                ++v;
            }
        }
        this.K((hcfb.a(hcfc0.h) == 0 ? 1 : hcfb.a(hcfc0.h)));
        return true;
    }

    private final void J(gfgr gfgr0, LayoutInflater layoutInflater0) {
        InfoMessageView infoMessageView0 = fbey.a(null, gfgr0, layoutInflater0, null, null, this.v, 0, 0, -1);
        this.t.add(infoMessageView0);
    }

    private final void K(int v) {
        int v1 = -1;
        switch(v - 1) {
            case 1: {
                v1 = 0x800013;
                break;
            }
            case 2: {
                v1 = 0x800015;
            }
        }
        ArrayList arrayList0 = this.t;
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            InfoMessageView infoMessageView0 = (InfoMessageView)arrayList0.get(v3);
            if(infoMessageView0.q != v1) {
                infoMessageView0.q = v1;
                if(infoMessageView0.g != null) {
                    infoMessageView0.t();
                }
            }
        }
    }
}

