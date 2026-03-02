import android.accounts.Account;
import j..util.Objects;

final class bwjy extends bwzp {
    final Account[] a;
    final bwjz b;

    public bwjy(bwjz bwjz0, gltq gltq0, Account[] arr_account) {
        this.a = arr_account;
        Objects.requireNonNull(bwjz0);
        this.b = bwjz0;
        super(gltq0, 2);
    }

    @Override  // bwzp
    protected final Object a() {
        this.b.b.B(this.a);
        return null;
    }
}

