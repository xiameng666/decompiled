public class hmdb {
    public hmgz k;
    public hmgz l;
    public hmgz m;
    protected final hmbb n;
    public int o;
    public int p;

    public hmdb(hmhz hmhz0) {
        hmbb hmbb0 = hmhe.a();
        this.n = hmbb0;
        byte[] arr_b = hmhz0.a;
        if(arr_b == null) {
            throw new hmfq(hmfl.H);
        }
        this.k = hmgz.e(arr_b);
        byte[] arr_b1 = hmhz0.b;
        if(arr_b1 == null) {
            throw new hmfq(hmfl.z);
        }
        if(hmgz.e(arr_b1).i().split("F", -1).length - 1 > 1) {
            hmbb0.a("Invalid padding for PAN detected. Transaction might get declined during authorization.", new Object[0]);
        }
        this.l = hmgz.e(hmhz0.b);
    }
}

