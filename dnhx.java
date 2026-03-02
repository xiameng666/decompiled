import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class dnhx extends tk {
    public final dmsn a;
    public dxev e;
    public hkhs f;
    private static final bboh g;
    private static final int h;

    static {
        dnhx.g = bboh.b("Pay", bbcu.cZ);
        dnhx.h = ((ghfw)ghgf.e().d(dnhx.class.getCanonicalName())).a;
    }

    public dnhx(dmsn dmsn0) {
        this.a = dmsn0;
    }

    @Override  // tk
    public final int b() {
        return this.f == null ? 0 : 1;
    }

    @Override  // tk
    public final int dx(int v) {
        return dnhx.h;
    }

    @Override  // tk
    public final long dy(int v) {
        return (long)dnhx.h;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new dnhw(this, LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E06D9, viewGroup0, false));  // layout:pay_fop_detail_tokenize
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        dxev dxev0 = this.e;
        if(dxev0 != null && (dxev0.b & 1) != 0) {
            Context context0 = ((dnhw)uq0).t.getContext();
            ((dnhw)uq0).t.setText(context0.getString(0x7F151E2F, new Object[]{(dxev0.c == null ? hkhr.b : dxev0.c).i}));  // string:pay_fops_set_up_nfc_message "Set up %1$s to make faster, more secure purchases 
                                                                                                                          // with your phone"
            hkhs hkhs0 = ((dnhw)uq0).v.f;
            if(hkhs0 != null) {
                dnhv dnhv0 = new dnhv(((dnhw)uq0), dxev0, hkhs0);
                ((dnhw)uq0).u.setOnClickListener(dnhv0);
            }
            return;
        }
        ((ggtj)dnhx.g.j()).x("Attempt to bindViewHolder without payment method.");
    }
}

