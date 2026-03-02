import android.bluetooth.BluetoothDevice;
import android.graphics.Bitmap;
import android.os.ParcelUuid;
import java.util.Arrays;
import java.util.List;

public final class cynb {
    public final BluetoothDevice a;
    public final Bitmap b;
    public final kba c;
    public byte[] d;
    public final String e;
    public final kba f;
    private final kba g;
    private final kba h;
    private final kba i;
    private final kba j;

    public cynb(BluetoothDevice bluetoothDevice0, kba kba0, Bitmap bitmap0, kba kba1, String s, kba kba2, kba kba3, kba kba4, kba kba5) {
        this.a = bluetoothDevice0;
        this.g = kba0;
        this.b = bitmap0;
        this.c = kba1;
        this.e = s;
        this.h = kba2;
        this.d = (byte[])kba1.a();
        this.i = kba3;
        this.f = kba4;
        this.j = kba5;
    }

    public final fgta a() {
        return (fgta)this.i.a();
    }

    public final String b() {
        return hvpg.bJ() ? this.a.getAddress() : fgjo.c(this.a);
    }

    public final String c() {
        return (String)this.g.a();
    }

    public final List d() {
        return this.j.a();
    }

    public final boolean e() {
        BluetoothDevice bluetoothDevice0 = this.a;
        ParcelUuid[] arr_parcelUuid = gxuo.u(bluetoothDevice0);
        if(arr_parcelUuid.length == 0) {
            cyjh.a.d().B("DeviceInfo: %s isLeAudioSupported=false, no Uuids", fgjo.c(bluetoothDevice0));
            return false;
        }
        boolean z = Arrays.asList(arr_parcelUuid).contains(fgki.d);
        cyjh.a.f().S("DeviceInfo: %s isLeAudioSupported=%b", fgjo.c(bluetoothDevice0), z);
        return z;
    }

    public final boolean f() {
        return ((Boolean)this.h.a()).booleanValue();
    }

    @Override
    public final String toString() {
        return hvpg.bJ() ? "Sass device - address:" + this.a + ", name:" + this.c() + (hvpg.bJ() ? ", accountKey:" + cyne.b(this.d) : "") + ", modelId:" + (gfta.c(this.e) ? "unknown" : this.e) + ", support LEA:" + this.e() + ", additional devices:" + fgjo.a(this.d()) : "Sass device - address:" + this.b() + ", name:" + this.c() + (hvpg.bJ() ? ", accountKey:" + cyne.b(this.d) : "") + ", modelId:" + (gfta.c(this.e) ? "unknown" : this.e) + ", support LEA:" + this.e() + ", additional devices:" + fgjo.a(this.d());
    }
}

