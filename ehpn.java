public final class ehpn {
    public static final ehpn a;
    public static final ehpm b;

    static {
        ehpn.a = new ehpn();
        ehpn.b = new ehpm(new ehmh(new cjmo(ehlb.a)), new ehpl());
    }

    public final void a(xob xob0, hgiq hgiq0) {
        ibuq.f(xob0, "activity");
        ibuq.f(hgiq0, "userServiceId");
        ehpm ehpm0 = ehpn.b;
        ibuq.f(xob0, "activity");
        ibuq.f(hgiq0, "userServiceId");
        ibuq.f(hgiq0, "userServiceId");
        String s = ehpm0.b.a.a(hgiq0);
        if(s == null || s.length() == 0) {
            s = hxil.c();
        }
        if(s.length() == 0) {
            ((ggtj)ehpm.a.j()).B("no link found for service %s", hgiq0);
            return;
        }
        ehpm0.a(xob0, s);
    }
}

