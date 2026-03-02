public final class ifyd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ifyd(String s) {
        String[] arr_s = s.split("\\.");
        this.a = Integer.parseInt(arr_s[0]);
        this.b = Integer.parseInt(arr_s[1]);
        this.c = Integer.parseInt(arr_s[2]);
        this.d = Integer.parseInt(arr_s[3]);
    }

    @Override
    public final String toString() {
        return this.a + "." + this.b + "." + this.c + "." + this.d;
    }
}

