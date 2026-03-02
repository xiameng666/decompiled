public final class ehss {
    public final ehtf a;
    public ehtb b;
    public ehtb c;

    public ehss(ehtf ehtf0) {
        this.a = ehtf0;
    }

    public static String a(float[] arr_f, gged_interceptors gged0) {
        for(int v = 0; v < 14; ++v) {
            if((arr_f[v] < ((float)(((Float)((gfsz)gged0.get(v)).a))))) {
                return v + "_BELOW; ";
            }
            if((arr_f[v] > ((float)(((Float)((gfsz)gged0.get(v)).b))))) {
                return v + "_ABOVE; ";
            }
        }
        return null;
    }
}

