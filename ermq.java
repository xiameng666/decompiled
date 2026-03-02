import android.app.AlertDialog.Builder;
import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import j..util.Objects;

final class ermq implements AdapterView.OnItemClickListener {
    final ermw a;

    public ermq(ermw ermw0) {
        Objects.requireNonNull(ermw0);
        this.a = ermw0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        if(adapterView0.getItemAtPosition(v) != null) {
            eroh eroh0 = (eroh)adapterView0.getItemAtPosition(v);
            ermw ermw0 = this.a;
            boolean z = ermw0.ag;
            if(z && (ermw0.ah != null && ermw0.ah.a())) {
                ermw.a.d("Already authenticating a selected WiFi, ignore another selection", new Object[0]);
                return;
            }
            ermw0.ah = eroh0;
            String s = eroh0.c;
            if(z || s.equals("PSK") || s.equals("Open")) {
                goto label_14;
            }
            Context context0 = ermw0.getContext();
            if(context0 != null) {
                new AlertDialog.Builder(context0).setTitle(0x7F152EE0).setMessage(0x7F152EDF).setPositiveButton(0x7F1508A8, new erms(ermw0)).create().show();  // string:smartdevice_wifi_cannot_connect_title "Cannot use Wi-Fi network"
                return;
            label_14:
                if(s.equals("Open")) {
                    if(ermw0.ag) {
                        ermw0.C();
                    }
                    ermw0.c.J(ermw0.ah, 2, ermw0.b.getCount());
                    return;
                }
                String s1 = eroh0.a;
                WifiConfiguration wifiConfiguration0 = ermw0.d.d(s1);
                if(wifiConfiguration0 != null && !"*".equals(wifiConfiguration0.preSharedKey)) {
                    if(ermw0.ag) {
                        ermw0.C();
                    }
                    String s2 = erqe.b(wifiConfiguration0.preSharedKey);
                    eroh eroh1 = ermw0.ah;
                    batl.s(s2);
                    eroh1.e = s2;
                    ermw0.c.J(ermw0.ah, 3, ermw0.b.getCount());
                    return;
                }
                erno.y(s1, false).show(ermw0.getChildFragmentManager(), "dialog");
            }
        }
    }
}

