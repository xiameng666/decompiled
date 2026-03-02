import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class flji implements Callable {
    public final fljw a;
    public final AccountContext b;

    public flji(fljw fljw0, AccountContext accountContext0) {
        this.a = fljw0;
        this.b = accountContext0;
    }

    @Override
    public final Object call() {
        flqv flqv0 = flqw.a();
        flqv0.a = "register capabilities";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        UUID uUID0 = UUID.randomUUID();
        flzb flzb0 = new flzb(this.a.j.a, this.b, this.a.j.c);
        flvd flvd0 = this.a.j.b;
        gpgz gpgz0 = flvd0.d.d;
        return gpgz0 == null ? ((Void)flvd0.b(uUID0, flzb0, gmbu.i(new flve(hnqi.a(flvd0.d.c))), this.b, flqw0, true).get()) : ((Void)flvd0.b(uUID0, flzb0, gmbu.i(flvd0.d.a(hnqi.a(gpgz0.a(hnyl.e)))), this.b, flqw0, true).get());
    }
}

