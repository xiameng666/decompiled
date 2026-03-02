import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;

public final class eqmh {
    public final ProtoLiteBuilder a;
    private final Context b;

    public eqmh(Context context0) {
        gftb.check(context0);
        this.b = context0;
        this.a = ((ProtoLiteMessage)gjnn.a).v_newBuilder();
    }

    public final gjnn a() {
        return (gjnn)this.a.N_build();
    }

    public final void b() {
        Context context0 = this.b;
        PackageManager packageManager0 = context0.getPackageManager();
        erqj erqj0 = erqj.a(context0);
        if(erqj0 == null) {
            ProtoLiteBuilder hftp0 = this.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjnn)hftp0.b_message).c = 1;
            ((gjnn)hftp0.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjnn)hftp0.b_message).d = 1;
            ((gjnn)hftp0.b_message).b |= 2;
        }
        else if(erqj0.d()) {
            ProtoLiteBuilder hftp1 = this.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gjnn)hftp1.b_message).c = 3;
            ((gjnn)hftp1.b_message).b |= 1;
        }
        else {
            ProtoLiteBuilder hftp2 = this.a;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gjnn)hftp2.b_message).c = 2;
            ((gjnn)hftp2.b_message).b |= 1;
        }
        if(erqj0 != null) {
            if(!packageManager0.hasSystemFeature("android.hardware.bluetooth_le")) {
                ProtoLiteBuilder hftp3 = this.a;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((gjnn)hftp3.b_message).d = 1;
                ((gjnn)hftp3.b_message).b |= 2;
            }
            else if(erqj0.d()) {
                ProtoLiteBuilder hftp4 = this.a;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ((gjnn)hftp4.b_message).d = 3;
                ((gjnn)hftp4.b_message).b |= 2;
            }
            else {
                ProtoLiteBuilder hftp5 = this.a;
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ((gjnn)hftp5.b_message).d = 2;
                ((gjnn)hftp5.b_message).b |= 2;
            }
        }
        NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context0);
        erqm erqm0 = nfcAdapter0 == null ? null : new erqm(nfcAdapter0);
        if(erqm0 == null) {
            ProtoLiteBuilder hftp6 = this.a;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ((gjnn)hftp6.b_message).e = 1;
            ((gjnn)hftp6.b_message).b |= 4;
        }
        else if(erqm0.a()) {
            ProtoLiteBuilder hftp7 = this.a;
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            ((gjnn)hftp7.b_message).e = 3;
            ((gjnn)hftp7.b_message).b |= 4;
        }
        else {
            ProtoLiteBuilder hftp8 = this.a;
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            ((gjnn)hftp8.b_message).e = 2;
            ((gjnn)hftp8.b_message).b |= 4;
        }
        WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
        if(wifiManager0 == null) {
            ProtoLiteBuilder hftp9 = this.a;
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            ((gjnn)hftp9.b_message).f = 1;
            ((gjnn)hftp9.b_message).b |= 8;
        }
        else if(wifiManager0.isWifiEnabled()) {
            ProtoLiteBuilder hftp10 = this.a;
            if(!hftp10.b_message.isImmutable()) {
                hftp10.ensureMutable();
            }
            ((gjnn)hftp10.b_message).f = 3;
            ((gjnn)hftp10.b_message).b |= 8;
        }
        else {
            ProtoLiteBuilder hftp11 = this.a;
            if(!hftp11.b_message.isImmutable()) {
                hftp11.ensureMutable();
            }
            ((gjnn)hftp11.b_message).f = 2;
            ((gjnn)hftp11.b_message).b |= 8;
        }
        LocationManager locationManager0 = (LocationManager)context0.getSystemService("location");
        if(locationManager0 == null) {
            ProtoLiteBuilder hftp12 = this.a;
            if(!hftp12.b_message.isImmutable()) {
                hftp12.ensureMutable();
            }
            ((gjnn)hftp12.b_message).g = 1;
            ((gjnn)hftp12.b_message).b |= 16;
        }
        else if(locationManager0.isProviderEnabled("gps")) {
            ProtoLiteBuilder hftp13 = this.a;
            if(!hftp13.b_message.isImmutable()) {
                hftp13.ensureMutable();
            }
            ((gjnn)hftp13.b_message).g = 4;
            ((gjnn)hftp13.b_message).b |= 16;
        }
        else if(locationManager0.isProviderEnabled("network")) {
            ProtoLiteBuilder hftp14 = this.a;
            if(!hftp14.b_message.isImmutable()) {
                hftp14.ensureMutable();
            }
            ((gjnn)hftp14.b_message).g = 3;
            ((gjnn)hftp14.b_message).b |= 16;
        }
        else {
            ProtoLiteBuilder hftp15 = this.a;
            if(!hftp15.b_message.isImmutable()) {
                hftp15.ensureMutable();
            }
            ((gjnn)hftp15.b_message).g = 2;
            ((gjnn)hftp15.b_message).b |= 16;
        }
        ProtoLiteBuilder hftp16 = this.a;
        boolean z = erpk.a(context0);
        if(!hftp16.b_message.isImmutable()) {
            hftp16.ensureMutable();
        }
        gjnn gjnn0 = (gjnn)hftp16.b_message;
        gjnn0.b |= 0x40;
        gjnn0.h = z;
    }
}

