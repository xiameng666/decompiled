import java.io.ByteArrayOutputStream;

public final class sry extends ssj {
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public final sri g;
    public final srx h;
    public final srj i;
    public final ssy j;
    public final ssy k;

    static {
        sry.a = str.c("82");
        sry.b = str.c("A1");
        sry.c = str.c("92");
        sry.d = str.c("91");
        sry.e = str.c("80");
        sry.f = str.c("A0");
    }

    public sry(ssg ssg0, ssc ssc0, sri sri0, srx srx0, srj srj0) {
        super(ssg0, ssc0);
        this.g = sri0;
        this.h = srx0;
        this.i = srj0;
        this.j = null;
        this.k = null;
    }

    public sry(ssg ssg0, ssc ssc0, sri sri0, ssy ssy0, ssy ssy1) {
        super(ssg0, ssc0);
        this.g = sri0;
        this.j = ssy0;
        this.k = ssy1;
        this.h = null;
        this.i = null;
    }

    @Override  // ssx, ssw
    public final byte[] a() {
        byte[] arr_b3;
        byte[] arr_b = stf.a(this.g.a.c);
        srx srx0 = this.h;
        if(srx0 == null) {
            byte[] arr_b4 = this.j.e();
            byte[] arr_b5 = this.k.e();
            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            stq.a(sry.e, byteArrayOutputStream1);
            stq.b(arr_b.length, byteArrayOutputStream1);
            stq.a(arr_b, byteArrayOutputStream1);
            stq.a(sry.d, byteArrayOutputStream1);
            stq.b(arr_b4.length, byteArrayOutputStream1);
            stq.a(arr_b4, byteArrayOutputStream1);
            stq.a(sry.c, byteArrayOutputStream1);
            stq.b(arr_b5.length, byteArrayOutputStream1);
            stq.a(arr_b5, byteArrayOutputStream1);
            arr_b3 = byteArrayOutputStream1.toByteArray();
        }
        else {
            byte[] arr_b1 = srx0.c();
            byte[] arr_b2 = this.i.b();
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            stq.a(sry.e, byteArrayOutputStream0);
            stq.b(arr_b.length, byteArrayOutputStream0);
            stq.a(arr_b, byteArrayOutputStream0);
            stq.a(sry.b, byteArrayOutputStream0);
            stq.b(arr_b1.length, byteArrayOutputStream0);
            stq.a(arr_b1, byteArrayOutputStream0);
            stq.a(sry.a, byteArrayOutputStream0);
            stq.b(arr_b2.length, byteArrayOutputStream0);
            stq.a(arr_b2, byteArrayOutputStream0);
            arr_b3 = byteArrayOutputStream0.toByteArray();
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        stq.a(((ssc)this.m).g(), byteArrayOutputStream2);
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        stq.a(sry.f, byteArrayOutputStream3);
        stq.b(arr_b3.length, byteArrayOutputStream3);
        stq.a(arr_b3, byteArrayOutputStream3);
        stq.a(byteArrayOutputStream3.toByteArray(), byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }
}

