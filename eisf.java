public final class eisf {
    public final gocn[] a;
    public eisn[] b;

    public eisf(gocn[] arr_gocn) {
        if(arr_gocn == null) {
            throw new eipa(29500, "Null RegistrationInfo");
        }
        int v = 0;
        while(v < arr_gocn.length) {
            if(arr_gocn[v] == null) {
                throw new eipa(29500, "Null RegistrationInfo");
            }
            ++v;
            continue;
        }
        this.a = arr_gocn;
    }
}

