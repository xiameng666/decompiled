import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import j..util.Objects;
import java.util.List;

final class czag extends czar {
    final OnEndpointFoundParams a;
    final cuwd b;

    public czag(czaj czaj0, OnEndpointFoundParams onEndpointFoundParams0, cuwd cuwd0) {
        this.a = onEndpointFoundParams0;
        this.b = cuwd0;
        Objects.requireNonNull(czaj0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        OnEndpointFoundParams onEndpointFoundParams0 = this.a;
        if(czaj.g(onEndpointFoundParams0)) {
            BluetoothDevice bluetoothDevice0 = onEndpointFoundParams0.d;
            cuvq cuvq0 = new cuvq();
            cuvq0.d("__UNRECOGNIZED_BLUETOOTH_DEVICE__");
            if(bluetoothDevice0 != null) {
                String s = bluetoothDevice0.getAddress();
                byte[] arr_b = null;
                if(!TextUtils.isEmpty(s)) {
                    byte[] arr_b1 = new byte[6];
                    List list0 = gfud.e(':').n(s);
                    if(list0.size() == 6) {
                        for(int v = 0; v < 6; ++v) {
                            arr_b1[v] = Integer.decode(("0x" + ((String)list0.get(v)))).byteValue();
                        }
                        arr_b = arr_b1;
                    }
                }
                if(arr_b != null) {
                    cuvc cuvc0 = new cuvc();
                    cuvc0.c(arr_b);
                    cuvq0.c(cuvc0.a());
                }
            }
            ((cvxs)object0).a(cuvq0.a());
            return;
        }
        ((cvxs)object0).a(this.b);
    }
}

