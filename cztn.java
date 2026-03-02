import com.google.android.gms.nearby.connection.v3.dct.BleL2CapPsm;
import com.google.android.gms.nearby.connection.v3.dct.DeviceInfo;
import com.google.android.gms.nearby.connection.v3.dct.DevicePlatform;
import com.google.android.gms.nearby.connection.v3.dct.ServiceIdHash;
import com.google.android.gms.nearby.connection.v3.dct.SessionId;
import com.google.android.gms.nearby.connection.v3.dct.SupportedServices;
import com.google.android.gms.nearby.connection.v3.dct.TransmitPower;
import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public final class cztn {
    public static final Charset a;
    public int b;
    public SessionId c;
    public DevicePlatform d;
    public TransmitPower e;
    public BleL2CapPsm f;
    public ServiceIdHash g;
    public SupportedServices h;
    public DeviceInfo i;

    static {
        cztn.a = Charset.forName("UTF-8");
    }

    public cztn() {
        this.b = 1;
    }

    public final byte[] a() {
        gftb.check(this.c);
        gftb.check(this.d);
        gftb.check(this.e);
        gftb.check(this.f);
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(this.b << 5 & 0xE0);
            SessionId sessionId0 = this.c;
            if(sessionId0 != null) {
                byteArrayOutputStream0.write(sessionId0.a());
            }
            DevicePlatform devicePlatform0 = this.d;
            if(devicePlatform0 != null) {
                byteArrayOutputStream0.write(devicePlatform0.a());
            }
            TransmitPower transmitPower0 = this.e;
            if(transmitPower0 != null) {
                byteArrayOutputStream0.write(transmitPower0.a());
            }
            BleL2CapPsm bleL2CapPsm0 = this.f;
            if(bleL2CapPsm0 != null) {
                byteArrayOutputStream0.write(bleL2CapPsm0.a());
            }
            ServiceIdHash serviceIdHash0 = this.g;
            if(serviceIdHash0 != null) {
                byteArrayOutputStream0.write(serviceIdHash0.a());
            }
            SupportedServices supportedServices0 = this.h;
            if(supportedServices0 != null) {
                byteArrayOutputStream0.write(supportedServices0.a());
            }
            DeviceInfo deviceInfo0 = this.i;
            if(deviceInfo0 != null) {
                byteArrayOutputStream0.write(deviceInfo0.a());
            }
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException unused_ex) {
            czkq.a.b().p("Failed to write BLE Advertisement bytes.", new Object[0]);
            return null;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof cztn) && this.b == ((cztn)object0).b) {
            SessionId sessionId0 = this.c;
            if(sessionId0 == null) {
                if(((cztn)object0).c == null) {
                label_6:
                    DevicePlatform devicePlatform0 = this.d;
                    if(devicePlatform0 == null) {
                        if(((cztn)object0).d == null) {
                        label_11:
                            TransmitPower transmitPower0 = this.e;
                            if(transmitPower0 == null) {
                                if(((cztn)object0).e == null) {
                                label_16:
                                    BleL2CapPsm bleL2CapPsm0 = this.f;
                                    if(bleL2CapPsm0 == null) {
                                        if(((cztn)object0).f == null) {
                                        label_21:
                                            ServiceIdHash serviceIdHash0 = this.g;
                                            if(serviceIdHash0 == null) {
                                                if(((cztn)object0).g == null) {
                                                label_26:
                                                    SupportedServices supportedServices0 = this.h;
                                                    if(supportedServices0 != null) {
                                                        if(supportedServices0.equals(((cztn)object0).h)) {
                                                            return this.i == null ? ((cztn)object0).i == null : this.i.equals(((cztn)object0).i);
                                                        }
                                                    }
                                                    else if(((cztn)object0).h == null) {
                                                        return this.i == null ? ((cztn)object0).i == null : this.i.equals(((cztn)object0).i);
                                                    }
                                                }
                                            }
                                            else if(serviceIdHash0.equals(((cztn)object0).g)) {
                                                goto label_26;
                                            }
                                        }
                                    }
                                    else if(bleL2CapPsm0.equals(((cztn)object0).f)) {
                                        goto label_21;
                                    }
                                }
                            }
                            else if(transmitPower0.equals(((cztn)object0).e)) {
                                goto label_16;
                            }
                        }
                    }
                    else if(devicePlatform0.equals(((cztn)object0).d)) {
                        goto label_11;
                    }
                }
            }
            else if(sessionId0.equals(((cztn)object0).c)) {
                goto label_6;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override
    public final String toString() {
        return "DctAdvertisement{version=" + this.b + ", sessionId=" + this.c + ", platform=" + this.d + ", txPower=" + this.e + ", psm=" + this.f + ", serviceIdHash=" + this.g + ", supportedServices=" + this.h + ", deviceInfo=" + this.i + "}";
    }
}

