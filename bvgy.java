public final class bvgy implements ibts {
    public final String a;
    public final clob b;

    public bvgy(String s, clob clob0) {
        this.a = s;
        this.b = clob0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((cmdi)object0), "it");
        clob clob0 = this.b;
        String s = this.a;
        if(s != null) {
            clob0.b.a.putExtra("extra.accountName", s);
            clob0.b.a.putExtra("authAccount", s);
        }
        clob0.b.a.putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_ITEM_ID", clob0.a.bz);
        cmdj.a(((cmdi)object0), clob0.b.a, 0);
        return ibom.a;
    }
}

