public final class bmpo {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Boolean d;
    public final String e;

    public bmpo() {
        throw null;
    }

    public bmpo(Integer integer0, Integer integer1, Integer integer2, Boolean boolean0, String s) {
        this.a = integer0;
        this.b = integer1;
        this.c = integer2;
        this.d = boolean0;
        this.e = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bmpo)) {
            Integer integer0 = this.a;
            if(integer0 != null) {
                if(integer0.equals(((bmpo)object0).a)) {
                label_8:
                    Integer integer1 = this.b;
                    if(integer1 != null) {
                        if(integer1.equals(((bmpo)object0).b)) {
                        label_13:
                            Integer integer2 = this.c;
                            if(integer2 != null) {
                                if(integer2.equals(((bmpo)object0).c)) {
                                label_18:
                                    Boolean boolean0 = this.d;
                                    if(boolean0 == null) {
                                        if(((bmpo)object0).d == null) {
                                            return this.e == null ? ((bmpo)object0).e == null : this.e.equals(((bmpo)object0).e);
                                        }
                                    }
                                    else if(boolean0.equals(((bmpo)object0).d)) {
                                        return this.e == null ? ((bmpo)object0).e == null : this.e.equals(((bmpo)object0).e);
                                    }
                                }
                            }
                            else if(((bmpo)object0).c == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((bmpo)object0).b == null) {
                        goto label_13;
                    }
                }
            }
            else if(((bmpo)object0).a == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        String s = this.e;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((v1 ^ 0xD5009D89) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "AuthenticatorUiResponse{responseMessage=null, retries=" + this.a + ", maxPinLength=" + this.b + ", minPinLength=" + this.c + ", powerCycleRequired=" + this.d + ", pinRequirementUrl=" + this.e + "}";
    }
}

