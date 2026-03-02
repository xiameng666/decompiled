public final class etks {
    public final boolean a;
    public final boolean b;
    public final ethj c;
    public final ethj d;

    public etks() {
        this(null);
    }

    public etks(boolean z, boolean z1, ethj ethj0, ethj ethj1) {
        ibuq.f(ethj0, "deviceListView");
        ibuq.f(ethj1, "alreadyAddedDeviceListView");
        super();
        this.a = z;
        this.b = z1;
        this.c = ethj0;
        this.d = ethj1;
    }

    public etks(byte[] arr_b) {
        this(false, false, new ethj(null), new ethj(null));
    }

    public static etks a(etks etks0, boolean z, boolean z1, ethj ethj0, ethj ethj1, int v) {
        if((v & 1) != 0) {
            z = etks0.a;
        }
        if((v & 2) != 0) {
            z1 = etks0.b;
        }
        if((v & 4) != 0) {
            ethj0 = etks0.c;
        }
        if((v & 8) != 0) {
            ethj1 = etks0.d;
        }
        ibuq.f(ethj0, "deviceListView");
        ibuq.f(ethj1, "alreadyAddedDeviceListView");
        return new etks(z, z1, ethj0, ethj1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof etks)) {
            return false;
        }
        if(this.a != ((etks)object0).a) {
            return false;
        }
        if(this.b != ((etks)object0).b) {
            return false;
        }
        return ibuq.m(this.c, ((etks)object0).c) ? ibuq.m(this.d, ((etks)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return ((etkr.a(this.a) * 0x1F + etkr.a(this.b)) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "RequestTokenizeScreenState(loadedDevices=" + this.a + ", addButtonClicked=" + this.b + ", deviceListView=" + this.c + ", alreadyAddedDeviceListView=" + this.d + ")";
    }
}

