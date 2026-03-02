public final class hmpi extends hmpf {
    public hmpi(byte[] arr_b, Integer integer0) {
        if(arr_b.length != 16) {
            throw new hmou("Invalid data length, data length must be 16.");
        }
        this.a = arr_b;
    }

    @Override  // hmpf
    public final void a(byte[] arr_b) {
        if(arr_b == null || arr_b.length != 16) {
            throw new hmoy(12);
        }
        this.a = arr_b;
    }

    @Override  // hmpf
    public final byte[] b() {
        return this.a;
    }
}

