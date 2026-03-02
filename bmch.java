import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import jeb.synthetic.TWR;

public final class bmch {
    static final byte[] a;
    public final UsbDevice b;
    public final int c;
    public byte d;
    public UsbDeviceConnection e;
    private static final bboh f;
    private final UsbManager g;

    static {
        bmch.f = bnaa.e("HidFidoDevice");
        bmch.a = new byte[]{6, (byte)0xD0, -15};
    }

    private bmch(UsbDevice usbDevice0, UsbManager usbManager0, int v) {
        this.b = usbDevice0;
        this.g = usbManager0;
        this.c = v;
        this.d = 0;
    }

    public final int a() {
        byte[] arr_b1;
        byte[] arr_b = new byte[8];
        new SecureRandom().nextBytes(arr_b);
        try {
            bmcf bmcf0 = bmcf.c;
            this.d(new bmcj(-1, bmcf0, arr_b));
            do {
                bmcj bmcj0 = this.c();
                arr_b1 = bmcj0.c();
            }
            while(bmcj0.d != bmcf0.i || arr_b1.length != 17 || !Arrays.equals(arr_b, Arrays.copyOf(arr_b1, 8)));
            int v = ByteBuffer.wrap(arr_b1, 8, 4).getInt();
            this.d = arr_b1[16];
            return v;
        }
        catch(IOException iOException0) {
            throw new bmcm("I/O error during channel allocation", iOException0);
        }
    }

    public static bmch b(UsbDevice usbDevice0, UsbManager usbManager0) {
        bmch bmch0;
        int v2;
        int v1;
        byte[] arr_b;
        Map.Entry map$Entry0;
        TreeMap treeMap0;
        batl.s(usbDevice0);
        batl.s(usbManager0);
        try {
            treeMap0 = new TreeMap();
            for(int v = 0; v < usbDevice0.getInterfaceCount(); ++v) {
                UsbInterface usbInterface0 = usbDevice0.getInterface(v);
                if(usbInterface0.getInterfaceClass() == 3) {
                    treeMap0.put(Integer.valueOf(v), usbInterface0);
                }
            }
        }
        catch(bmcm bmcm0) {
            throw new bmcm("Device (" + usbDevice0.getDeviceId() + ") is not an HID device", bmcm0);
        }
        if(!treeMap0.isEmpty()) {
            UsbDeviceConnection usbDeviceConnection0 = usbManager0.openDevice(usbDevice0);
            if(usbDeviceConnection0 == null) {
                throw new bmcm("Unable to open device (" + usbDevice0.getDeviceId() + ")");
            }
            try {
                Iterator iterator0 = treeMap0.entrySet().iterator();
                while(true) {
                label_14:
                    if(!iterator0.hasNext()) {
                        goto label_55;
                    }
                    Object object0 = iterator0.next();
                    map$Entry0 = (Map.Entry)object0;
                    if(bmch.g(usbDeviceConnection0, ((UsbInterface)map$Entry0.getValue()))) {
                        arr_b = new byte[34];
                        v1 = -1;
                        v2 = 0;
                        break;
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_53;
            }
            while(true) {
                if(v2 >= 5 || v1 == 34) {
                    goto label_49;
                }
                try {
                    v1 = usbDeviceConnection0.controlTransfer(0x81, 6, 0x2200, ((Integer)map$Entry0.getKey()).intValue(), arr_b, 34, 1000);
                    if(hsub.a.b().j()) {
                        if(v1 > 0) {
                            byte[] arr_b1 = Arrays.copyOf(arr_b, 3);
                            if(Arrays.equals(bmch.a, arr_b1)) {
                                ((ggtj)bmch.f.h()).z("Device (%s) has a valid FIDO descriptor", usbDevice0.getDeviceId());
                                bmch0 = new bmch(usbDevice0, usbManager0, ((int)(((Integer)map$Entry0.getKey()))));
                                goto label_37;
                            }
                        }
                        ((ggtj)bmch.f.j()).z("Device (%s) has an invalid FIDO descriptor. Retrying...", usbDevice0.getDeviceId());
                    }
                    else {
                        if(v1 == 34) {
                            byte[] arr_b2 = Arrays.copyOf(arr_b, 3);
                            if(Arrays.equals(bmch.a, arr_b2)) {
                                ((ggtj)bmch.f.h()).z("Device (%s) has a valid FIDO descriptor", usbDevice0.getDeviceId());
                                bmch0 = new bmch(usbDevice0, usbManager0, ((int)(((Integer)map$Entry0.getKey()))));
                                goto label_37;
                            }
                        }
                        goto label_41;
                    }
                    goto label_47;
                }
                catch(Throwable throwable1) {
                    goto label_44;
                }
                try {
                label_37:
                    map$Entry0.getValue();
                    usbDeviceConnection0.releaseInterface(((UsbInterface)map$Entry0.getValue()));
                }
                catch(Throwable throwable0) {
                    break;
                }
                usbDeviceConnection0.close();
                return bmch0;
                try {
                label_41:
                    ((ggtj)bmch.f.j()).z("Device (%s) has an invalid FIDO descriptor. Retrying...", usbDevice0.getDeviceId());
                    goto label_47;
                }
                catch(Throwable throwable1) {
                    try {
                    label_44:
                        map$Entry0.getValue();
                        usbDeviceConnection0.releaseInterface(((UsbInterface)map$Entry0.getValue()));
                        throw throwable1;
                    label_47:
                        ++v2;
                        continue;
                    label_49:
                        map$Entry0.getValue();
                        usbDeviceConnection0.releaseInterface(((UsbInterface)map$Entry0.getValue()));
                        goto label_14;
                    }
                    catch(Throwable throwable0) {
                    }
                    break;
                }
            }
        label_53:
            TWR.safeClose$NT(usbDeviceConnection0, throwable0);
            throw throwable0;
        label_55:
            usbDeviceConnection0.close();
            throw new bmcm("Device (" + usbDevice0.getDeviceId() + ") is not a U2F or CTAP2 device");
        }
        try {
            throw new bmcm("No HID interfaces");
        }
        catch(bmcm bmcm0) {
            throw new bmcm("Device (" + usbDevice0.getDeviceId() + ") is not an HID device", bmcm0);
        }
    }

    public final bmcj c() {
        UsbDeviceConnection usbDeviceConnection0 = this.e;
        if(usbDeviceConnection0 == null) {
            usbDeviceConnection0 = bmch.f(this.g, this.b, this.c);
            this.e = usbDeviceConnection0;
        }
        UsbInterface usbInterface0 = this.b.getInterface(this.c);
        for(int v = 0; v < usbInterface0.getEndpointCount(); ++v) {
            if(usbInterface0.getEndpoint(v).getDirection() == 0x80) {
                UsbEndpoint usbEndpoint0 = usbInterface0.getEndpoint(v);
                byte[] arr_b = new byte[0x40];
                bmch.e(usbDeviceConnection0, usbEndpoint0, arr_b);
                bmcj bmcj0 = new bmcj(arr_b);
                while(!bmcj0.b()) {
                    bmch.e(usbDeviceConnection0, usbEndpoint0, arr_b);
                    try {
                        if(bmcj0.b()) {
                            throw new bmcl("Message already complete");
                        }
                        int v1 = Math.min(59, bmcj0.b - bmcj0.e);
                        int v2 = ByteBuffer.wrap(Arrays.copyOf(arr_b, 4)).getInt();
                        int v3 = arr_b[4];
                        int v4 = bmcj0.c;
                        if(v2 != v4) {
                            throw new bmcl("Provided packet\'s channel id does not match message\'s channel id");
                        }
                        int v5 = bmcj0.f;
                        if(v3 != v5) {
                            throw new bmcl("Provided packet\'s sequence is not the next sequence in the message");
                        }
                        bmcj0.f = (byte)(v5 + 1);
                        bmcg bmcg0 = new bmcg(v4, ((byte)v5), Arrays.copyOfRange(arr_b, 5, v1 + 5));
                        bmcj0.a.add(bmcg0);
                        bmcj0.e += v1;
                    }
                    catch(bmcl unused_ex) {
                    }
                }
                return bmcj0;
            }
        }
        throw new bmcm("No IN endpoint");
    }

    public final void d(bmcj bmcj0) {
        UsbDeviceConnection usbDeviceConnection0 = this.e;
        if(usbDeviceConnection0 == null) {
            usbDeviceConnection0 = bmch.f(this.g, this.b, this.c);
            this.e = usbDeviceConnection0;
        }
        UsbInterface usbInterface0 = this.b.getInterface(this.c);
        for(int v = 0; v < usbInterface0.getEndpointCount(); ++v) {
            if(usbInterface0.getEndpoint(v).getDirection() == 0) {
                UsbEndpoint usbEndpoint0 = usbInterface0.getEndpoint(v);
                for(Object object0: bmcj0.a()) {
                    bmch.e(usbDeviceConnection0, usbEndpoint0, ((bmck)object0).a());
                }
                return;
            }
        }
        throw new bmcm("No OUT endpoint");
    }

    static final void e(UsbDeviceConnection usbDeviceConnection0, UsbEndpoint usbEndpoint0, byte[] arr_b) {
        for(int v = 0; v < 5; ++v) {
            int v1 = usbDeviceConnection0.bulkTransfer(usbEndpoint0, arr_b, arr_b.length, 1000);
            if(v1 == arr_b.length) {
                ghjc.f.o(arr_b);
                return;
            }
            ((ggtj)bmch.f.i()).F("Transferred (%d) bytes instead of (%d), retrying.", v1, arr_b.length);
        }
        throw new bmcm("Error during message transfer");
    }

    private static UsbDeviceConnection f(UsbManager usbManager0, UsbDevice usbDevice0, int v) {
        UsbDeviceConnection usbDeviceConnection0 = null;
        for(int v1 = 0; v1 < 5 && usbDeviceConnection0 == null; ++v1) {
            usbDeviceConnection0 = usbManager0.openDevice(usbDevice0);
        }
        if(usbDeviceConnection0 == null) {
            throw new bmcm("Unable to open device (" + usbDevice0.getDeviceId() + ")");
        }
        if(bmch.g(usbDeviceConnection0, usbDevice0.getInterface(v))) {
            return usbDeviceConnection0;
        }
        throw new bmcm("Unable to claim interface for device (" + usbDevice0.getDeviceId() + ")");
    }

    private static boolean g(UsbDeviceConnection usbDeviceConnection0, UsbInterface usbInterface0) {
        for(int v = 0; v < 5; ++v) {
            if(usbDeviceConnection0.claimInterface(usbInterface0, true)) {
                return true;
            }
        }
        ((ggtj)bmch.f.j()).B("Unable to claim Usb interface: %s", usbInterface0);
        return false;
    }
}

