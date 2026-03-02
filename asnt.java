import java.util.function.Supplier;

public final class asnt implements Supplier {
    public final asnw a;

    public asnt(asnw asnw0) {
        this.a = asnw0;
    }

    @Override
    public final Object get() {
        boolean z = true;
        switch(this.a.c.f()) {
            case 3: 
            case 5: {
                break;
            }
            default: {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}

