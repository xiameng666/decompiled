public final class cykl implements kar {
    public final cylw a;
    public final int b;
    public final byte[] c;

    public cykl(cylw cylw0, int v, byte[] arr_b) {
        this.a = cylw0;
        this.b = v;
        this.c = arr_b;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ((cyna)object0).p(true);
        boolean z = ((cyna)object0).B();
        int v = this.b;
        if(!z && v != 17) {
            ((ggtj)this.a.n.d().ar(7857)).P("NearbyDeviceManager: Device %s disabled, ignore the eventCode %d", ((cyna)object0).j(), v);
            return;
        }
        ((cyna)object0).o(v, this.c);
    }
}

