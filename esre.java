import j..util.Objects;

final class esre implements essh {
    final esrf a;

    public esre(esrf esrf0) {
        Objects.requireNonNull(esrf0);
        this.a = esrf0;
        super();
    }

    @Override  // essh
    public final int a() {
        switch(this.a.c.a) {
            case -1: {
                return 1;
            }
            case 11: {
                return 6;
            }
            case 12: {
                return 3;
            }
            case 19: 
            case 21: {
                return 5;
            }
            case 26: {
                return 7;
            }
            case 29: {
                return 4;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // essh
    public final String b() {
        return esxg.a(this.a.a.d.toByteArray());
    }

    @Override  // essh
    public final boolean d() {
        return this.a.b.b;
    }

    @Override  // essh
    public final byte[] e(byte[] arr_b) {
        return new byte[0];
    }
}

