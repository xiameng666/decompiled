import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings.Builder;
import android.bluetooth.le.AdvertiseSettings;
import android.content.Context;
import android.os.ParcelUuid;
import android.os.SystemClock;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;

public final class cyor {
    public long a;
    private final Context b;
    private final kba c;
    private final byte d;
    private final AdvertiseCallback e;

    public cyor(Context context0, kba kba0, byte b) {
        this.e = new cyoq(this);
        this.b = context0;
        this.c = kba0;
        this.d = b;
    }

    public final void a() {
        SecureRandom secureRandom0 = new SecureRandom();
        byte[] arr_b = new byte[4];
        secureRandom0.nextBytes(arr_b);
        this.b(arr_b);
    }

    public final void b(byte[] arr_b) {
        if(this.a > 0L && SystemClock.elapsedRealtime() - this.a <= hvpg.ai()) {
            cyjh.a.d().x("SeekerToSeekerBleAdvertiser: Another advertising is on progress. Skip this advertise request");
            return;
        }
        cupu cupu0 = cupu.b(this.b, "SeekerToSeekerBleAdvertiser");
        if(cupu0 == null) {
            cyjh.a.g().x("SeekerToSeekerBleAdvertiser: Error while initializing ble advertiser.");
            return;
        }
        AdvertiseSettings advertiseSettings0 = new AdvertiseSettings.Builder().setAdvertiseMode(1).setTxPowerLevel(2).setTimeout(((int)hvpg.ai())).setConnectable(false).build();
        try {
            AdvertiseData.Builder advertiseData$Builder0 = new AdvertiseData.Builder();
            ParcelUuid parcelUuid0 = cyon.a;
            byte[] arr_b1 = cyon.b(((byte[])this.c.a()));
            if(arr_b1 == null || arr_b1.length != 16) {
                String s = arr_b1 == null ? "NULL" : ((int)arr_b1.length);
                throw new GeneralSecurityException("Incorrect secret for encoding bytes packet, secret.length = " + s.toString());
            }
            byte[] arr_b2 = fgjk.c(arr_b1, arr_b);
            byte[] arr_b3 = glwl.d(new byte[][]{Arrays.copyOf(fgnv.b(arr_b1, arr_b2), 8), arr_b2});
            gftb.b(arr_b3.length < 0x20, "firstByteLengthBits length overflow!");
            AdvertiseData advertiseData0 = advertiseData$Builder0.addServiceData(parcelUuid0, glwl.d(new byte[][]{new byte[]{((byte)(arr_b3.length >> 1 << 4 | 15)), ((byte)(this.d | (arr_b3.length & 1) << 7))}, arr_b3})).setIncludeDeviceName(false).build();
        }
        catch(GeneralSecurityException | cyhd unused_ex) {
            cyjh.a.g().x("SeekerToSeekerBleAdvertiser: Error while encrypting advertise data.");
            return;
        }
        cust cust0 = cyjh.a;
        cust0.d().x("SeekerToSeekerBleAdvertiser: Start ble advertising.");
        if(!cupu0.c(advertiseSettings0, advertiseData0, this.e)) {
            cust0.g().x("SeekerToSeekerBleAdvertiser: Error while starting ble advertising.");
        }
    }
}

