public enum azpg {
    UNKNOWN(0),
    UNAUTHORIZED(1),
    AUTHORIZED(2);

    public final int d;

    private azpg(int v1) {
        this.d = v1;
    }

    static azpg a(boolean z) {
        return z ? azpg.c : azpg.b;
    }

    public static azpg b(int v) {
        azpg[] arr_azpg = azpg.values();
        for(int v1 = 0; v1 < arr_azpg.length; ++v1) {
            azpg azpg0 = arr_azpg[v1];
            if(azpg0.d == v) {
                return azpg0;
            }
        }
        return azpg.a;
    }
}

