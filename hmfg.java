public final class hmfg extends hmfj {
    public final int a;
    private static final hmgz d;

    static {
        hmfg.d = hmgz.e(new byte[]{-97, 54});
    }

    public hmfg(byte[] arr_b) {
        this.b = hmgz.e(arr_b);
        this.a = (int)hmgw.c(((hmgz)this.b).a);
    }

    public final hmdk a() {
        hmgz hmgz0 = hmgz.d(((hmgz)this.b));
        return new hmdk(hmfg.d, hmgz0);
    }

    public final hmgz b() {
        return (hmgz)this.b;
    }

    @Override
    public final String toString() {
        hmhe.a().e();
        return "ApplicationTransactionCounter";
    }
}

