final class aarl extends ibuo implements ibts {
    public aarl(Object object0) {
        super(1, object0, aarm.class, "mapWelcomeHeader", "mapWelcomeHeader(Lcom/google/android/gms/accountsettings/mg/poc/model/data/ResourceInfo;)Lcom/google/internal/identity/accountsettings/mobile/v1/WelcomeHeader;", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((zho)object0), "p0");
        aarm aarm0 = (aarm)this.e;
        grxr grxr0 = ((zho)object0).a;
        Object object1 = grxr0.c == 4 ? ((gsak)grxr0.d) : gsak.a;
        ibuq.e(object1, "getWelcomeHeader(...)");
        return object1;
    }
}

