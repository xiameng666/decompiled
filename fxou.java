import java.util.Arrays;

public final class fxou {
    public static final fxou a;
    public static final fxou b;
    public final int c;
    public final int d;

    static {
        fxou.a = new fxou(0, -1);
        fxou.b = new fxou(3, 0);
    }

    public fxou(int v, int v1) {
        this.c = v;
        this.d = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fxou) ? this.c == ((fxou)object0).c && this.d == ((fxou)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.c), ((int)this.d)});
    }

    @Override
    public final String toString() {
        return this.c + ":" + this.d;
    }
}

