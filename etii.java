import android.view.View;
import android.widget.TextView;

public final class etii implements icih {
    final etip a;

    public etii(etip etip0) {
        this.a = etip0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        etip etip0 = this.a;
        View view0 = etip0.a;
        ethl ethl0 = null;
        if(view0 == null) {
            ibuq.j("spinner");
            view0 = null;
        }
        int v = 0;
        view0.setVisibility((((etks)object0).a ? 8 : 0));
        ethl ethl1 = etip0.b;
        if(ethl1 == null) {
            ibuq.j("deviceListViewAdapter");
            ethl1 = null;
        }
        ethl1.q();
        ethl ethl2 = etip0.c;
        if(ethl2 == null) {
            ibuq.j("alreadyAddedDeviceListAdapter");
            ethl2 = null;
        }
        ethl2.q();
        TextView textView0 = etip0.d;
        if(textView0 == null) {
            ibuq.j("alreadyAddedDeviceListTitle");
            textView0 = null;
        }
        ethl ethl3 = etip0.c;
        if(ethl3 == null) {
            ibuq.j("alreadyAddedDeviceListAdapter");
        }
        else {
            ethl0 = ethl3;
        }
        if(ethl0.b() <= 0) {
            v = 8;
        }
        textView0.setVisibility(v);
        return ibom.a;
    }
}

