import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class dnia extends tk {
    public final dmsn a;
    public dxev e;
    public hkhs f;
    private static final int g;

    static {
        bboh.b("Pay", bbcu.cZ);
        ghfz ghfz0 = ghgf.e();
        String s = new ibuk(dnia.class).b();
        ibuq.d(s, "null cannot be cast to non-null type kotlin.CharSequence");
        dnia.g = ((ghfw)ghfz0.d(s)).a;
    }

    public dnia(dmsn dmsn0) {
        this.a = dmsn0;
    }

    @Override  // tk
    public final int b() {
        return this.f == null ? 0 : 1;
    }

    @Override  // tk
    public final int dx(int v) {
        return dnia.g;
    }

    @Override  // tk
    public final long dy(int v) {
        return (long)dnia.g;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E06D9, viewGroup0, false);  // layout:pay_fop_detail_tokenize
        ibuq.c(view0);
        return new dnhz(this, view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(uq0, "viewHolder");
        dxev dxev0 = this.e;
        if(dxev0 != null) {
            Context context0 = ((dnhz)uq0).t.getContext();
            ((dnhz)uq0).t.setText(context0.getString(0x7F151E2F, new Object[]{(dxev0.c == null ? hkhr.b : dxev0.c).i}));  // string:pay_fops_set_up_nfc_message "Set up %1$s to make faster, more secure purchases 
                                                                                                                          // with your phone"
            dnia dnia0 = ((dnhz)uq0).v;
            if(dnia0.f != null) {
                dnhy dnhy0 = new dnhy(dnia0, dxev0);
                ((dnhz)uq0).u.setOnClickListener(dnhy0);
            }
        }
    }
}

