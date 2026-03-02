import java.util.List;

public final class dgfy {
    public final List a;
    public final dgfx b;

    public dgfy(List list0, dgfx dgfx0) {
        ibuq.f(list0, "sharedKey");
        ibuq.f(dgfx0, "keyType");
        super();
        this.a = list0;
        this.b = dgfx0;
        switch(dgfx0.ordinal()) {
            case 0: {
                if(list0.size() != 35) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                break;
            }
            case 1: {
                if(!hvqz.H() || list0.size() < 12) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                break;
            }
            default: {
                throw new ibnq();
            }
        }
    }

    public dgfy(byte[] arr_b, dgfx dgfx0) {
        ibuq.f(arr_b, "sharedKey");
        ibuq.f(dgfx0, "keyType");
        this(ibpg.J(arr_b), dgfx0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgfy)) {
            return false;
        }
        return ibuq.m(this.a, ((dgfy)object0).a) ? this.b == ((dgfy)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "QrCodeMetadata(sharedKey=" + this.a + ", keyType=" + this.b + ")";
    }
}

