import java.util.Map;

public final class czvu implements Runnable {
    public final czwf a;
    public final byte[] b;

    public czvu(czwf czwf0, byte[] arr_b) {
        this.a = czwf0;
        this.b = arr_b;
    }

    @Override
    public final void run() {
        czwf czwf0 = this.a;
        Map map0 = czwf0.f;
        String s = bbmu.c(this.b);
        czlg czlg0 = (czlg)map0.remove(s);
        if(czlg0 != null) {
            cunf cunf0 = czkq.a;
            cunf0.b().i("[%s] Received a DISCONNECTION frame to disconnect virtual socket for salted service ID Hash Key %s", "MultiplexSocket", s);
            bbpb.b(czlg0);
            if(map0.isEmpty()) {
                cunf0.b().h("[%s] Close the physical socket because all services disconnected.", "MultiplexSocket");
                czmk.A(czwf0.b, "PhysicalSocket", czwf0.b.a);
            }
            return;
        }
        czkq.a.e().i("[%s] Received a DISCONNECTION frame but there\'s no alive socket to disconnect for service ID Hash Key %s.", "MultiplexSocket", s);
    }
}

