import java.util.Comparator;

public final class acdr {
    public final int[] a;
    public final boolean b;
    public final Comparator c;

    public acdr(String[] arr_s, boolean z) {
        this.c = new acdq(this);
        String[] arr_s1 = acfd.i(arr_s);
        this.a = new int[]{acdr.a("google", arr_s1), acdr.a("email", arr_s1), acdr.a("phone", arr_s1)};
        this.b = z;
    }

    private static int a(String s, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(s.equals(arr_s[v])) {
                return v;
            }
        }
        return 0x7FFFFFFF;
    }
}

