import com.google.android.gms.usonia.DeviceInfo;
import j..util.Objects;

public final class aufn extends fanx {
    final String a;
    final aufp b;

    public aufn(aufp aufp0, String s) {
        Objects.requireNonNull(aufp0);
        this.b = aufp0;
        super();
        this.a = s;
    }

    @Override  // fanx
    public final void a(DeviceInfo deviceInfo0) {
        aufr aufr0 = this.b.c;
        aujd aujd0 = aufr0.d.c(deviceInfo0.b);
        if(aujd0 != null) {
            aujd0.h(false);
            aufr0.b.l.e(false);
        }
    }

    @Override  // fanx
    public final void b(DeviceInfo deviceInfo0, byte[] arr_b) {
        augi augi0;
        synchronized(this.b.a) {
            if(this.b.b != this) {
                return;
            }
        }
        String s = this.a;
        aufr aufr0 = this.b.c;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)augi.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            augi0 = (augi)hftv0;
        }
        catch(hfur hfur0) {
            aufr0.a.e(hfur0, "Failed to parse CastDirectoryEntry", new Object[0]);
            augi0 = null;
        }
        if(augi0 == null) {
            aufr0.a.d("Failed to handle disovered CastDirectoryEntry", new Object[0]);
            return;
        }
        aufr0.a(deviceInfo0, augi0, s);
    }

    @Override  // fanx
    public final void c() {
    }
}

