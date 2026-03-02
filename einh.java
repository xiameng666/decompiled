public final class einh implements evpo {
    public final einq a;
    public final fpjk b;

    public einh(einq einq0, fpjk fpjk0) {
        this.a = einq0;
        this.b = fpjk0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        boolean z = evql0.i() instanceof azuo;
        einq einq0 = this.a;
        fpjk fpjk0 = this.b;
        if(z) {
            return einq0.e(fpjk0.c);
        }
        if((evql0.i() instanceof aztb)) {
            aztb aztb0 = (aztb)evql0.i();
            gftb.check(aztb0);
            return aztb0.b() == 0x734A ? einq0.e(fpjk0.c) : evql0;
        }
        return evql0;
    }
}

