public final class focr {
    public final String a;
    public final int b;

    public focr() {
        throw null;
    }

    public focr(int v, String s) {
        this.b = v;
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof focr) && this.b == ((focr)object0).b) {
            return this.a == null ? ((focr)object0).a == null : this.a.equals(((focr)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? (this.b ^ 1000003) * 1000003 : (this.b ^ 1000003) * 1000003 ^ this.a.hashCode();
    }

    @Override
    public final String toString() {
        switch(this.b) {
            case 1: {
                return "AuthChannel{type=GAIA, account=" + this.a + "}";
            }
            case 2: {
                return "AuthChannel{type=ANONYMOUS, account=" + this.a + "}";
            }
            default: {
                return "AuthChannel{type=PSEUDONYMOUS, account=" + this.a + "}";
            }
        }
    }
}

