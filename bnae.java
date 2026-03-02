import java.util.Random;

public final class bnae {
    public final int a;
    public volatile byte[] b;
    public final int[] c;
    public final String d;
    public final String e;
    private static final Random f;
    private final bnaf g;

    static {
        bnae.f = gftq.a;
    }

    public bnae(bnaf bnaf0, Integer integer0, byte[] arr_b, int[] arr_v, String s, String s1) {
        this.g = bnaf0;
        this.a = integer0 == null ? bnae.f.nextInt() : ((int)integer0);
        this.b = arr_b;
        this.c = arr_v;
        this.d = s;
        this.e = s1;
    }

    public final bnad a() {
        bnad bnad0 = new bnad();
        bnad0.a = this.g;
        bnad0.b = (int)this.a;
        bnad0.c = this.b;
        bnad0.d = this.c;
        bnad0.e = this.d;
        bnad0.f = this.e;
        return bnad0;
    }
}

