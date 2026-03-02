import com.google.android.material.materialswitch.MaterialSwitch;

public final class bfzr implements bfna {
    public final MaterialSwitch a;
    public final bdzc b;
    public final cmeb c;

    public bfzr(MaterialSwitch materialSwitch0, bdzc bdzc0, cmeb cmeb0) {
        this.a = materialSwitch0;
        this.b = bdzc0;
        this.c = cmeb0;
    }

    @Override  // bfna
    public final void a() {
    }

    @Override  // bfna
    public final void b() {
        boolean z = this.a.isChecked();
        icbb.b(lsc.a(this.b), null, null, new bdzb(this.b, z, null), 3);
        this.b.a.e((z ? gqtg.t : gqtg.s));
        fhvu fhvu0 = fhvv.a(z);
        this.c.b(gltz.e, fhvu0);
    }
}

