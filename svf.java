import java.util.Arrays;

public final class svf implements svi {
    private final byte[] a;

    public svf(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        byte[] arr_b = (byte[])srb0.a.clone();
        byte[] arr_b1 = this.a;
        if(!Arrays.equals(arr_b, arr_b1)) {
            throw new sqy("AID does not match Seos AID: " + str.b(arr_b1), srg.b);
        }
        srb0.d(srb0.a(), true, true);
        sxk sxk0 = new sxk();
        sxk sxk1 = new sxk();
        sxk1.d(0x84, arr_b1);
        sxk0.c(0x6F, sxk1);
        return new swl(sxk0.b());
    }
}

