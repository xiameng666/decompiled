public final class cxhq implements evqc {
    @Override  // evqc
    public final void gv(Exception exception0) {
        if((exception0 instanceof azuh)) {
            ((ggtj)cwfa.a.g().s(exception0)).x("SpotFMA - Registration failed with a ResolvableApiException (Keychain is probably uninitialized). ignoring it.");
            return;
        }
        ((ggtj)cwfa.a.e().s(exception0)).x("SpotFMA - Device registration failed.");
    }
}

