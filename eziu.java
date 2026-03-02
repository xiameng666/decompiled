import android.bluetooth.BluetoothAdapter;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eziu implements Function {
    public final String a;

    public eziu(String s) {
        this.a = s;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((BluetoothAdapter)object0).getRemoteDevice(this.a);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

