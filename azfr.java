final class azfr implements Comparable {
    public final String a;
    public final azfj b;
    private final boolean c;

    public azfr(String s, azfj azfj0) {
        this.a = s;
        this.b = azfj0;
        this.c = false;
    }

    @Override
    public final int compareTo(Object object0) {
        azfj azfj0 = this.b;
        if(azfj0 == null) {
            return -1;
        }
        azfj azfj1 = ((azfr)object0).b;
        return azfj1 == null ? 1 : azfj0.a(azfj1);
    }
}

