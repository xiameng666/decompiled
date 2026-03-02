import java.util.Arrays;

public final class sxb {
    public static sxa a(ssy ssy0, byte[] arr_b, ssi ssi0) {
        ssg ssg0 = ssg.b(ssy0);
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, ssi0.j(), arr_b.length);
        srk srk0 = srk.b;
        if(arr_b1.length != srk0.a() && arr_b1.length != srk0.b()) {
            srk srk1 = srk.a;
            if(arr_b1.length == srk1.a()) {
                srk0 = srk1;
            }
            else if(arr_b1.length == srk1.b()) {
                srk0 = srk1;
            }
        }
        int v = arr_b1.length - srk0.d;
        byte[] arr_b2 = Arrays.copyOfRange(arr_b1, v, arr_b1.length);
        byte[] arr_b3 = Arrays.copyOfRange(arr_b1, 0, v);
        int v1 = arr_b.length - srk0.d;
        return new sxa(ssg0, ssi0, srk0, arr_b3, arr_b2, Arrays.copyOfRange(arr_b, 0, v1), Arrays.copyOfRange(arr_b, v1, arr_b.length));
    }
}

