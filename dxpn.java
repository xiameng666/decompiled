public final class dxpn {
    public final boolean a;
    public final dymg b;

    public dxpn() {
        this(null);
    }

    public dxpn(boolean z, dymg dymg0) {
        this.a = z;
        this.b = dymg0;
    }

    public dxpn(byte[] arr_b) {
        this(false, null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dxpn)) {
            return false;
        }
        return this.a == ((dxpn)object0).a ? ibuq.m(this.b, ((dxpn)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        dymg dymg0 = this.b;
        if(dymg0 == null) {
            return this.a ? 0x9511 : 0x95CB;
        }
        if(((ProtoLiteMessage)dymg0).isImmutable()) {
            int v = ((ProtoLiteMessage)dymg0).s();
            return this.a ? 0x9511 + v : 0x95CB + v;
        }
        int v1 = dymg0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)dymg0).s();
            dymg0.memoizedHashCode = v1;
        }
        return this.a ? 0x9511 + v1 : 0x95CB + v1;
    }

    @Override
    public final String toString() {
        return "LowBalanceNotificationSetUpScreenState(notificationsEnabled=" + this.a + ", selectedBalance=" + this.b + ")";
    }
}

