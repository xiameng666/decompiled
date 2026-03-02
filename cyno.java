public final class cyno implements kar {
    public final cyoi a;
    public final fgta b;
    public final boolean c;

    public cyno(cyoi cyoi0, fgta fgta0, boolean z) {
        this.a = cyoi0;
        this.b = fgta0;
        this.c = z;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ((ggtj)this.a.o.d().ar(0x1F17)).X("SassDeviceConnectionHelper: Revert switch for TriangleCallingSwitch with connectionStateBeforeConnect=%s, isProviderAvailableBeforeConnect=%b, resumeMedia=%b", this.b, Boolean.valueOf(this.a.n), Boolean.valueOf(this.c));
        this.a.l(false, this.c, ((Boolean)object0).booleanValue(), this.a.n);
    }
}

