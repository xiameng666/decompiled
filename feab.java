import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageOptions;

public final class feab implements jqv {
    public final feah a;
    public final String b;
    public final fezx c;

    public feab(feah feah0, String s, fezx fezx0) {
        this.a = feah0;
        this.b = s;
        this.c = fezx0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        feac feac0 = new feac(this.a, jqt0);
        fdpl fdpl0 = ffgp.a;
        byte[] arr_b = this.c.toBytesArray();
        MessageOptions messageOptions0 = new MessageOptions(1);
        if(this.a.f.g(fdpl0, this.b, "/wifi_connect_immediate", arr_b, feac0, null, messageOptions0) == -1) {
            jqt0.b(new Status(4000));
        }
        return "syncWifiCredential future";
    }
}

