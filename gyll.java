public abstract class gyll {
    private final gyll[] a;
    public final String e;

    public gyll(String s, gyll[] arr_gyll) {
        this.e = s;
        this.a = arr_gyll;
    }

    public abstract long a();

    public gyll b() {
        for(int v = 0; true; ++v) {
            gyll[] arr_gyll = this.a;
            if(v >= arr_gyll.length) {
                break;
            }
            gyll gyll0 = arr_gyll[v];
            if(!gyll0.c()) {
                return gyll0;
            }
        }
        return null;
    }

    public abstract boolean c();

    public abstract boolean d();
}

