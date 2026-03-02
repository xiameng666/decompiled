final class ggxk {
    public static double a(int v, ggxl ggxl0) {
        return v - 1 == 0 ? ggxl0.a : ggxl0.b;
    }

    public static void b(int v, ggxl ggxl0, double f) {
        if(v - 1 != 0) {
            ggxl0.b = f;
            return;
        }
        ggxl0.a = f;
    }
}

