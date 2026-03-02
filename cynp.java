public final class cynp implements kar {
    public final cyoi a;
    public final fgta b;
    public final boolean c;
    public final int d;

    public cynp(cyoi cyoi0, fgta fgta0, boolean z, int v) {
        this.a = cyoi0;
        this.b = fgta0;
        this.c = z;
        this.d = v;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ((ggtj)this.a.o.d().ar(0x1F12)).X("SassDeviceConnectionHelper: Revert switch with connectionStateBeforeConnect=%s, isProviderAvailableBeforeConnect=%b, resumeMedia=%b", this.b, Boolean.valueOf(this.a.n), Boolean.valueOf(this.c));
        this.a.l(this.d == 2, this.c, ((Boolean)object0).booleanValue(), this.a.n);
    }
}

