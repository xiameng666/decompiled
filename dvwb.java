import android.os.Parcelable;
import com.google.android.gms.pay.ProtoSafeParcelable;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dvwb implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return (gtyt)ftqe.c(((ProtoSafeParcelable)(((Parcelable)object0))), ((MessageLite)gtyt.a));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

