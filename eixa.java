import com.google.android.gms.play.integrity.api.service.IntegrityApiPersistentChimeraService;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eixa implements Function {
    public final IntegrityApiPersistentChimeraService a;

    public eixa(IntegrityApiPersistentChimeraService integrityApiPersistentChimeraService0) {
        this.a = integrityApiPersistentChimeraService0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((eiwr)object0) == this.a.a.get() ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

