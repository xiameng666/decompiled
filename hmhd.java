import java.util.Calendar;

public final class hmhd {
    public int a;
    public int b;
    public int c;

    public hmhd() {
        this.b();
    }

    public hmhd(int v, int v1, int v2) {
        this.a = v;
        this.c = v1;
        this.b = v2;
    }

    public hmhd(byte[] arr_b) {
        if(arr_b != null) {
            String s = hmgz.e(arr_b).i();
            this.a = Integer.parseInt((s.charAt(0) + s.charAt(1)));
            this.c = Integer.parseInt((s.charAt(2) + s.charAt(3)));
            this.b = Integer.parseInt((s.charAt(4) + s.charAt(5)));
            return;
        }
        this.b();
    }

    public final String a() {
        int v = this.a + 2000;
        String s = (v >= 2010 ? "" : "0") + v % 2000;
        int v1 = this.c;
        if(v1 < 10) {
            s = s + "0";
        }
        String s1 = s + v1;
        int v2 = this.b;
        if(v2 < 10) {
            s1 = s1 + "0";
        }
        return s1 + v2;
    }

    private final void b() {
        Calendar calendar0 = Calendar.getInstance();
        this.a = calendar0.get(1);
        this.c = calendar0.get(2) + 1;
        this.b = calendar0.get(5);
    }
}

