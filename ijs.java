public abstract class ijs implements ijx {
    protected String a;
    private final int[] b;

    public ijs() {
        this.b = new int[2];
    }

    protected final String a() {
        String s = this.a;
        if(s != null) {
            return s;
        }
        ibuq.j("text");
        return null;
    }

    protected final int[] b(int v, int v1) {
        if(v >= 0 && v1 >= 0 && v != v1) {
            this.b[0] = v;
            this.b[1] = v1;
            return this.b;
        }
        return null;
    }
}

