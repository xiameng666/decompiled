import com.google.android.gms.wearable.internal.ParcelableBackupDevice;
import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.List;
import java.util.function.Function;

public final class ffhd implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return (ParcelableBackupDevice[])Collection.-EL.stream(((List)object0)).map(new ffgv()).toArray(new ffgw());
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

