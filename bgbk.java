final class bgbk extends ibuo implements ibts {
    public bgbk(Object object0) {
        super(1, object0, bgeu.class, "setSelectedCredentialFilter", "setSelectedCredentialFilter(Lcom/google/android/gms/credential/manager/screens/credentials/SelectedCredentialFilter;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        bgez bgez0 = (bgez)object0;
        ibuq.f(bgez0, "p0");
        bgeu bgeu0 = (bgeu)this.e;
        ibuq.f(bgez0, "filterValue");
        icbb.b(lsc.a(bgeu0), null, null, new bgeb(bgeu0, bgez0, null), 3);
        return ibom.a;
    }
}

