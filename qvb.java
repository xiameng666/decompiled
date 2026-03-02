public final class qvb {
    public final int a;
    public final int b;
    public final int c;
    public int d;
    public byte[] e;
    public int f;

    public qvb(byte[] arr_b) {
        this.a = arr_b[0] & 0xFF;
        int v = arr_b[1];
        this.b = arr_b[2] & 0xFF;
        this.c = arr_b[3] & 0xFF;
        this.f = 1;
        if(arr_b.length > 5) {
            this.f = 3;
            int v1 = arr_b[4] & 0xFF;
            this.d = v1;
            if(arr_b.length != v1 + 5 && arr_b.length != v1 + 6) {
                throw new qux(0x6700);
            }
            byte[] arr_b1 = new byte[v1];
            this.e = arr_b1;
            System.arraycopy(arr_b, 5, arr_b1, 0, v1);
            if(arr_b.length > this.d + 5) {
                this.f = 4;
                int v2 = arr_b[arr_b.length - 1];
            }
        }
        else if(arr_b.length == 5) {
            this.f = 2;
            int v3 = arr_b[4];
        }
    }
}

