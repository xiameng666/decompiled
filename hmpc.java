public final class hmpc {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public hmpc(boolean z, boolean z1, boolean z2) {
        this.a = z;
        this.b = z1;
        this.c = z2;
    }

    public final int a() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = "0";
        stringBuilder0.append((this.a ? "1" : "0"));
        stringBuilder0.append((this.b ? "1" : "0"));
        if(this.c) {
            s = "1";
        }
        stringBuilder0.append(s);
        return Integer.parseInt(stringBuilder0.toString(), 2);
    }
}

