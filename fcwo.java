public final class fcwo {
    public final int a;
    public final int b;
    private static final fcwo[][] c;

    static {
        fcwo[][] arr2_fcwo = new fcwo[3][3];
        for(int v = 0; v < 3; ++v) {
            for(int v1 = 0; v1 < 3; ++v1) {
                fcwo[] arr_fcwo = arr2_fcwo[v];
                arr_fcwo[v1] = new fcwo(v, v1);
            }
        }
        fcwo.c = arr2_fcwo;
    }

    private fcwo(int v, int v1) {
        fcwo.b(v, v1);
        this.a = v;
        this.b = v1;
    }

    public static fcwo a(int v, int v1) {
        fcwo.b(v, v1);
        return fcwo.c[v][v1];
    }

    private static void b(int v, int v1) {
        if(v < 0 || v > 2) {
            throw new IllegalArgumentException("row must be in range 0-2");
        }
        if(v1 >= 0 && v1 <= 2) {
            return;
        }
        throw new IllegalArgumentException("column must be in range 0-2");
    }

    @Override
    public final String toString() {
        return "(row=" + this.a + ",clmn=" + this.b + ")";
    }
}

