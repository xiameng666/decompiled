import android.accounts.Account;
import j..util.function.Function.-CC;
import java.io.IOException;
import java.util.function.Function;

public final class bpvf implements Function {
    public final bpvj a;

    public bpvf(bpvj bpvj0) {
        this.a = bpvj0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Account account0 = (Account)object0;
        try {
            return gfsx.m(acso.e(this.a.d, account0.name));
        }
        catch(acse | IOException unused_ex) {
            ((ggtj)bpvj.a.j()).x("Failed getting the OID of an account.");
            return gfqx.a;
        }
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

