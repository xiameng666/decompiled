import j..util.function.Function.-CC;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

public final class eqzg implements Function {
    public final eqtr a;

    public eqzg(eqtr eqtr0) {
        this.a = eqtr0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        bmal bmal0;
        byte[] arr_b = ((ByteString)object0).toByteArray();
        eqtr eqtr0 = this.a;
        blzt blzt0 = eqtr0.a();
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 1, arr_b.length);
        try {
            bmal0 = bmal.b(hhrs.q(arr_b1), blzt0);
        }
        catch(IOException iOException0) {
            throw new IllegalArgumentException("Failed to parse CborValue from received data.", iOException0);
        }
        byte[] arr_b2 = bmal0.i.e();
        bmgw bmgw0 = new bmgw();
        bmgw0.d(arr_b2);
        bmgw0.e(bmal0.k);
        bmgw0.b(bmal0.j);
        bmgw0.c(eqtr0.a.c());
        bmbq bmbq0 = bmal0.l;
        if(bmbq0 != null) {
            bmgw0.f(bmbq0.d);
        }
        return bmgw0.a();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

