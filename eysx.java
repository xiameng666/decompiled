public final class eysx {
    public final eysw a;
    public final String b;
    public final ibth c;
    public final ibth d;

    public eysx(eysw eysw0, String s, ibth ibth0) {
        this(eysw0, s, ibth0, null);
    }

    public eysx(eysw eysw0, String s, ibth ibth0, ibth ibth1) {
        ibuq.f(eysw0, "type");
        super();
        this.a = eysw0;
        this.b = s;
        this.c = ibth0;
        this.d = ibth1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eysx)) {
            return false;
        }
        if(this.a != ((eysx)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((eysx)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((eysx)object0).c) ? ibuq.m(this.d, ((eysx)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c.hashCode()) * 0x1F;
        ibth ibth0 = this.d;
        if(ibth0 != null) {
            v = ibth0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "UserAcknowledgableDialogUiState(type=" + this.a + ", deviceName=" + this.b + ", acknowledge=" + this.c + ", dismiss=" + this.d + ")";
    }
}

