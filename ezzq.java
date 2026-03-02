@Deprecated
public final class ezzq extends ezyn {
    public static final fagu g;

    static {
        ezzq.g = new fagu("file_path", "");
    }

    public ezzq(fagj fagj0) {
        super("reboot", fagj0);
    }

    @Override  // ezyj
    public final ezyi a() {
        if(ezwc.f()) {
            fagi fagi0 = new fagi();
            String s = (String)this.c(ezzq.g);
            fagi0.e(ezyv.h, s);
            return new ezyi("ab-reboot", fagi0.a());
        }
        fagi fagi1 = new fagi();
        String s1 = (String)this.c(ezzq.g);
        fagi1.e(ezzk.g, s1);
        return new ezyi("non-ab-reboot", fagi1.a());
    }
}

