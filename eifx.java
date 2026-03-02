import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanFilter;

public final class eifx extends eifu {
    @Override  // eifu
    public final int a(eigg eigg0) {
        byte[] arr_b = eigg0.b(eigq.a);
        gftb.check(arr_b);
        return fqok.f(ByteString.copyFrom(arr_b)) ? 101 : 102;
    }

    @Override  // eifu
    public final int b(eigg eigg0) {
        return 5;
    }

    @Override  // eifu
    public final ScanFilter c() {
        return new ScanFilter.Builder().setServiceData(eigq.a, new byte[]{0x40}, new byte[]{-16}).build();
    }

    @Override  // eifu
    public final boolean d() {
        return true;
    }

    @Override  // eifu
    public final boolean e() {
        return hrtd.ag();
    }

    @Override  // eifu
    public final boolean f(eigg eigg0) {
        byte[] arr_b = eigg0.b(eigq.a);
        return hrtd.at() ? arr_b != null && arr_b.length != 0 && (arr_b[0] & 0xF0) == 0x40 : arr_b != null;
    }

    @Override  // eifu
    public final boolean g(gwgx gwgx0) {
        return gwgx0.h == 5;
    }

    @Override  // eifu
    public final void h(ProtoLiteBuilder hftp0, eigg eigg0) {
        byte[] arr_b = eigg0.b(eigq.a);
        gftb.check(arr_b);
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        ByteString hfsf1 = fqok.a(hfsf0);
        if(hfsf1.isEmpty()) {
            ((ggtj)eicd.a.j()).B("Bad Finder advertisement detected. Unable to retrieve key. advertisement: %s", hfsf0.toByteArray());
            return;
        }
        ByteString hfsf2 = hfsf1.j(0, 10);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwgx gwgx0 = (gwgx)hftp0.b_message;
        hfsf2.getClass();
        gwgx0.b |= 0x80;
        gwgx0.j = hfsf2;
    }
}

