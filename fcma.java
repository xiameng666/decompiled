import android.bluetooth.BluetoothDevice;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fcma implements Function {
    public final fcmc a;
    public final String b;
    public final evqp c;

    public fcma(fcmc fcmc0, String s, evqp evqp0) {
        this.a = fcmc0;
        this.b = s;
        this.c = evqp0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        BluetoothDevice bluetoothDevice0 = (BluetoothDevice)object0;
        String s = bluetoothDevice0.getAddress();
        Object object1 = this.a.b.h(s);
        ((evql)object1).b(new fclz(this.b, bluetoothDevice0, this.c));
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

