import java.util.Arrays;

public final class fuxf {
    public final long a;
    public final fuxe b;
    public final fuxe c;

    public fuxf(long v, fuxe fuxe0, fuxe fuxe1) {
        this.a = v;
        this.b = fuxe0;
        this.c = fuxe1;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fuxf) && this.a == ((fuxf)object0).a) {
            fuxe fuxe0 = this.b;
            if(fuxe0 == null && ((fuxf)object0).b == null) {
            label_6:
                fuxe fuxe2 = this.c;
                if(fuxe2 == null && ((fuxf)object0).c == null) {
                    return true;
                }
                if(fuxe2 != null) {
                    fuxe fuxe3 = ((fuxf)object0).c;
                    return fuxe3 == null ? false : fuxe2.equals(fuxe3);
                }
            }
            else if(fuxe0 != null) {
                fuxe fuxe1 = ((fuxf)object0).b;
                if(fuxe1 != null && fuxe0.equals(fuxe1)) {
                    goto label_6;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), this.b, this.c});
    }
}

