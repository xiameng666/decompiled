public final class anv implements ibth {
    public final aob a;

    public anv(aob aob0) {
        this.a = aob0;
    }

    @Override  // ibth
    public final Object a() {
        awt awt0 = this.a.c;
        String s = this.a.b;
        return awt0.a().isCameraDeviceSetupSupported(s) ? awt0.a().getCameraDeviceSetup(s) : null;
    }
}

