import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class cpxu extends cjtm {
    public final azxs a;
    private final fjtv b;
    private final cpws c;

    public cpxu(fjtv fjtv0, cpws cpws0, azxs azxs0, azug azug0) {
        super(0x98, "ResetOperation", azug0);
        this.b = fjtv0;
        this.c = cpws0;
        this.a = azxs0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gmbu.t(fkjd.g(this.b.r.a()).i(new fjsd(this.b), this.b.n).i(new fjsf(this.b), this.b.n).i(new fjsg(this.b), this.b.n), new cpxt(this), gmap.a);
        cpws cpws0 = this.c;
        if(cpws0 != null) {
            cpws0.b.getSharedPreferences("gms_icing_mdd_overrider_groups", 0).edit().clear().commit();
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

