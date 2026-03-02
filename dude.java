import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dude implements evqf {
    public final duew a;

    public dude(duew duew0) {
        this.a = duew0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        duew duew0 = this.a;
        dnxz dnxz0 = duew0.ao;
        hjrn hjrn0 = ((ProtoSafeParcelable)object0) == null ? null : ((hjrn)ftqe.c(((ProtoSafeParcelable)object0), ((MessageLite)hjrn.a)));
        if(hjrn0 != null) {
            String s = "TAG_SPLASH_DIALOG_FRAGMENT";
            dnzp dnzp0 = (dnzp)duew0.getChildFragmentManager().h("TAG_SPLASH_DIALOG_FRAGMENT");
            dnyl dnyl0 = (dnyl)duew0.getChildFragmentManager().h("TAG_BOTTOM_SHEET_FRAGMENT");
            ca ca0 = new ca(duew0.getChildFragmentManager());
            if(dnzp0 != null) {
                ca0.o(dnzp0);
            }
            if(dnyl0 != null) {
                ca0.o(dnyl0);
            }
            de de0 = dnxz0.a(hjrn0);
            if(de0 != null) {
                if((de0 instanceof dnyl)) {
                    s = "TAG_BOTTOM_SHEET_FRAGMENT";
                }
                ca0.v(de0, s);
                ca0.g();
            }
        }
    }
}

