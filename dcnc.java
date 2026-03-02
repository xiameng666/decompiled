import java.util.Arrays;

public final class dcnc implements azsu, azsw {
    public static final dcnc a;
    public final int b;
    private final int c;

    static {
        ggfp.K(Integer.valueOf(0), Integer.valueOf(1));
        dcnc.a = new dcnc(0);
    }

    public dcnc(int v) {
        this.b = v;
        this.c = 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof dcnc)) {
            return false;
        }
        if(bata.b(Integer.valueOf(this.b), Integer.valueOf(((dcnc)object0).b))) {
            Integer integer0 = (int)0;
            return bata.b(integer0, integer0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.b), ((int)0)});
    }
}

