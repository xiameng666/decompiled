public final class fekc {
    private final String a;

    public fekc(String s) {
        this.a = s;
    }

    @Override
    public final String toString() {
        return this.a + "@" + this.hashCode();
    }
}

