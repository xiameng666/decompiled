import com.google.android.gms.auth.api.signin.service.SignInChimeraService;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class aifh implements Consumer {
    public final aiet a;

    public aifh(aiet aiet0) {
        this.a = aiet0;
    }

    @Override
    public final void accept(Object object0) {
        bxof bxof0 = (bxof)object0;
        Class class0 = bxof0.a.getClass();
        bxnj bxnj0 = (bxnj)SignInChimeraService.b.get(class0);
        batl.s(bxnj0);
        gixr gixr0 = bxok.a(bxnj0, bxof0, this.a.a);
        this.a.b.a(gixr0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

