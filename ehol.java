final class ehol extends ibuo implements ibts {
    public ehol(Object object0) {
        super(1, object0, ehpn.class, "openAppPermissionsLearnMoreUseCase", "openAppPermissionsLearnMoreUseCase(Lcom/google/android/chimerax/fragment/app/FragmentActivity;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((xob)object0), "p0");
        ehpn ehpn0 = (ehpn)this.e;
        ibuq.f(((xob)object0), "activity");
        ehpm ehpm0 = ehpn.b;
        ibuq.f(((xob)object0), "activity");
        String s = hxil.a.b().a();
        if(s.length() == 0) {
            ((ggtj)ehpm.a.j()).x("no link found for app permissions");
            return ibom.a;
        }
        ehpm0.a(((xob)object0), s);
        return ibom.a;
    }
}

