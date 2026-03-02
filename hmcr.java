import java.util.List;

public final class hmcr {
    public final hmcz a;
    public final hmcw b;
    public final hmcw c;
    public hmgz d;
    public hmgz e;
    public hmgz f;
    public hmgz g;

    public hmcr(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, byte[] arr_b4, byte[] arr_b5, List list0, boolean z) {
        this.a = new hmcz(arr_b, list0);
        this.b = new hmcw(arr_b1, false);
        this.c = new hmcw(arr_b1, true);
        if(arr_b2 == null && !z) {
            throw new hmfq(hmfl.p);
        }
        if(arr_b3 == null) {
            throw new hmfq(hmfl.o);
        }
        this.e = hmgz.e(arr_b3);
        if(arr_b4 != null) {
            this.f = hmgz.e(arr_b4);
        }
        if(arr_b5 != null) {
            this.g = hmgz.e(arr_b5);
        }
        if(arr_b2 != null) {
            this.d = hmgz.e(arr_b2);
        }
    }
}

