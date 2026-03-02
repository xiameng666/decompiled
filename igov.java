public final class igov extends igne implements igpb {
    private final igps a;
    private final byte[] b;
    private ignf c;

    public igov(igps igps0, byte[] arr_b) {
        this.c = null;
        this.a = igps0;
        this.b = arr_b;
        if(igpn.b(igps0)) {
            this.c = igov.h;
            return;
        }
        if(!igpn.a(igps0)) {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        this.c = igov.i;
    }

    @Override  // igne
    public final ignj a() {
        ignc ignc0 = new ignc();
        if(this.c.equals(igov.h)) {
            ignc0.a(new igoz(this.a.e).a());
            ignc0.a(new igoz(this.a.f).a());
        }
        else if(this.c.equals(igov.i)) {
            ignc0.a(new igoz(this.a.e).a());
            ignc0.a(new igoz(this.a.f).a());
        }
        byte[] arr_b = this.b;
        if(arr_b != null) {
            ignc0.a(new ignl(arr_b));
        }
        return new ignk(ignc0);
    }
}

