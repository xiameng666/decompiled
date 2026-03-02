public final class igoy extends igne {
    public final igng a;
    public final igps b;
    public igpz c;

    public igoy(igps igps0, byte[] arr_b) {
        byte[] arr_b1;
        this.b = igps0;
        if(arr_b == null) {
            arr_b1 = null;
        }
        else {
            byte[] arr_b2 = new byte[arr_b.length];
            System.arraycopy(arr_b, 0, arr_b2, 0, arr_b.length);
            arr_b1 = arr_b2;
        }
        this.a = new igng(arr_b1);
    }

    @Override  // igne
    public final ignj a() {
        return this.a;
    }
}

