import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public final class swl implements swj {
    private final byte[] a;
    private final srg b;
    private final boolean c;

    public swl() {
        this(swv.b);
    }

    public swl(byte[] arr_b) {
        this(arr_b, srg.a);
    }

    public swl(byte[] arr_b, srg srg0) {
        this(arr_b, srg0, false);
    }

    public swl(byte[] arr_b, srg srg0, boolean z) {
        this.a = arr_b;
        this.b = srg0;
        this.c = z;
    }

    @Override  // swj
    public final swk a(srb srb0, boolean z) {
        stk[] arr_stk;
        if(z) {
            sqx sqx0 = srb0.c;
            if(sqx0.d()) {
                srg srg0 = this.b;
                byte[] arr_b = this.a;
                sxd sxd0 = sqx0.h;
                if(!sxd0.d()) {
                    throw new IllegalStateException("BUG: Secured response requested but authentication is not complete");
                }
                stl stl0 = (stl)sxd0.b();
                stk stk0 = new stk(sti.d, srg0.b());
                if(arr_b.length == 0) {
                    arr_stk = new stk[]{stk0};
                }
                else {
                    stk[] arr_stk1 = new stk[2];
                    byte[] arr_b1 = stl0.a.h(arr_b, stl0.c, true);
                    arr_stk1[0] = new stk(sti.a, arr_b1);
                    arr_stk1[1] = stk0;
                    arr_stk = arr_stk1;
                }
                stj stj0 = new stj(Arrays.asList(arr_stk));
                byte[] arr_b2 = stj0.b();
                stl.b(stl0.d(3), stl0.d);
                stl0.e = 3;
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                stq.a(stl0.d, byteArrayOutputStream0);
                stq.a(stl0.c(arr_b2), byteArrayOutputStream0);
                byte[] arr_b3 = byteArrayOutputStream0.toByteArray();
                byte[] arr_b4 = stf.b(stl0.b.e(arr_b3));
                stk stk1 = new stk(sti.c, arr_b4);
                stj0.a.add(stk1);
                return new swk(srg0, stj0.b());
            }
            return this.c ? new swk(this.b, this.a) : new swk((this.b == srg.a ? srg.r : this.b), swv.b);
        }
        return new swk(this.b, this.a);
    }
}

