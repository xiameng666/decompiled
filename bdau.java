import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class bdau extends tk {
    public static final bboh a;
    public gqlt e;
    public final bdak f;
    private final boolean g;

    static {
        bdau.a = bboh.b("CredentialGroupsAdapter", bbcu.cX);
    }

    public bdau(bdak bdak0, boolean z) {
        this.f = bdak0;
        this.g = z;
    }

    @Override  // tk
    public final int b() {
        return this.e == null ? 0 : ((ggna)this.e.c).c;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        viewGroup0.getContext();
        return hsam.f() ? new bdat(layoutInflater0.inflate(0x7F0E0858, viewGroup0, false)) : new bdat(layoutInflater0.inflate(0x7F0E0859, viewGroup0, false));  // layout:pwm_credential_group
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        gftb.check(this.e);
        gqmd gqmd0 = (gqmd)this.e.c.get(v);
        int v1 = this.b();
        String s = this.e.b.c;
        boolean z = false;
        boolean z1 = true;
        if(v == 0) {
            z = true;
        }
        if(v1 != 1) {
            z1 = false;
        }
        ((bdat)uq0).D(gqmd0, z, z1, s, this.g);
        bdal bdal0 = new bdal(this, ((bdat)uq0));
        ((bdat)uq0).v.setOnClickListener(bdal0);
        bdam bdam0 = new bdam(this, gqmd0);
        ((bdat)uq0).C.setOnClickListener(bdam0);
        bdan bdan0 = new bdan(this, gqmd0);
        ((bdat)uq0).D.setOnClickListener(bdan0);
        bdao bdao0 = new bdao(this, gqmd0);
        ((bdat)uq0).w.setOnClickListener(bdao0);
        bdap bdap0 = new bdap(this, gqmd0);
        ((bdat)uq0).x.setOnClickListener(bdap0);
        bdaq bdaq0 = new bdaq(this, gqmd0);
        ((bdat)uq0).E.setOnClickListener(bdaq0);
    }
}

