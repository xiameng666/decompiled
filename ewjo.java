import java.util.Arrays;

public final class ewjo implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        byte[] arr_b = (byte[])object0;
        byte[] arr_b1 = (byte[])object1;
        ibuq.f(arr_b, "a");
        ibuq.f(arr_b1, "b");
        String s = Arrays.toString(arr_b);
        ibuq.e(s, "toString(...)");
        String s1 = Arrays.toString(arr_b1);
        ibuq.e(s1, "toString(...)");
        return s.compareTo(s1);
    }
}

