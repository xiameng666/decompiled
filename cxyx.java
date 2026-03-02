public final class cxyx implements kar {
    @Override  // kar
    public final void accept(Object object0) {
        ((cxym)object0).f.d().B("SassLogSession_logSwitchBackByOtherDevice: %s", fgjo.c(((cxym)object0).e));
        ProtoLiteBuilder hftp0 = ((cxym)object0).h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gypt gypt0 = (gypt)hftp0.b_message;
        gypt0.b |= 0x40;
        gypt0.i = true;
    }
}

