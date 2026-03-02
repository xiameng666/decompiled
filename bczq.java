import android.content.Context;

public final class bczq {
    public final Context a;
    public final fnle b;

    public bczq(Context context0, fnle fnle0) {
        this.a = context0;
        this.b = fnle0;
    }

    public final fnle a(ibth ibth0, ibth ibth1) {
        Context context0 = this.a;
        fnrd fnrd0 = fnre.a();
        fnrd0.b("Manage passwords on this device");
        fnrd0.b = context0.getDrawable(0x7F0804B6);  // drawable:gs_account_circle_full_vd_theme_24
        fnrd0.d = new bczr(ibth0);
        fnrd0.c(208243);
        fnre fnre0 = fnrd0.a();
        fnle fnle0 = this.b;
        if(hsam.f()) {
            gged_interceptors gged0 = gged_interceptors.l(fnsc.a(context0, new bczs(ibth1)));
            ibuq.e(gged0, "of(...)");
            fnld fnld0 = new fnld(fnle0);
            fnqu fnqu0 = new fnqu(fnle0.e);
            fnsb fnsb0 = fnqx.a();
            fnsb0.c(gged_interceptors.l(fnre0));
            fnqu0.c = fnsb0.a();
            fnqu0.b(gged0);
            fnld0.c = fnqu0.a();
            return fnld0.a();
        }
        fnld fnld1 = new fnld(fnle0);
        fnqu fnqu1 = new fnqu(fnle0.e);
        fnsb fnsb1 = fnqx.a();
        fnsb1.c(gged_interceptors.l(fnre0));
        fnqu1.c = fnsb1.a();
        fnld1.c = fnqu1.a();
        return fnld1.a();
    }
}

