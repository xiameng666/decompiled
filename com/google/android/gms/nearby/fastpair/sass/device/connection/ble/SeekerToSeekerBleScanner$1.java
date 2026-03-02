package com.google.android.gms.nearby.fastpair.sass.device.connection.ble;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import bsap;
import cyhd;
import cyjh;
import cyon;
import cyot;
import fgjk;
import fgnv;
import gftb;
import gfuy;
import j..util.Objects;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import kar;

public class SeekerToSeekerBleScanner.1 extends bsap {
    final cyot a;

    public SeekerToSeekerBleScanner.1(cyot cyot0) {
        Objects.requireNonNull(cyot0);
        this.a = cyot0;
        super("nearby", "SeekerToSeekerBleScanner");
    }

    @Override  // bsap
    public final void b(int v) {
        cyjh.a.g().z("SeekerToSeekerBleScanner: Error while starting ble scanning. Error code %d.", v);
    }

    @Override  // bsap
    public final void c(int v, ScanResult scanResult0) {
        cyot cyot0 = this.a;
        if(cyot0.c != null) {
            ScanRecord scanRecord0 = scanResult0.getScanRecord();
            if(scanRecord0 != null) {
                byte[] arr_b = (byte[])scanRecord0.getServiceData().get(cyon.a);
                if(arr_b != null) {
                    try {
                        boolean z = true;
                        gftb.b(arr_b.length > 2, "Default header bytes do not match");
                        gftb.b((arr_b[0] & 15) == 15, "Default header bytes do not match");
                        gftb.b(cyon.a(arr_b[1], ((byte)1), ((byte)8)) == cyot0.b, "Default header bytes do not match");
                        int v1 = cyon.a(arr_b[0], ((byte)0), ((byte)4));
                        if((v1 + v1 | cyon.a(arr_b[1], ((byte)0), ((byte)1))) != arr_b.length - 2) {
                            z = false;
                        }
                        String s = "NULL";
                        gftb.b(z, "Default header bytes do not match");
                        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 2, arr_b.length);
                        byte[] arr_b2 = cyon.b(((byte[])cyot0.a.a()));
                        if(arr_b2 != null && arr_b2.length == 16) {
                            if(arr_b1 != null && arr_b1.length > 8 && arr_b1.length <= 25) {
                                if(!fgnv.a(Arrays.copyOfRange(arr_b1, 0, 8), Arrays.copyOf(fgnv.b(arr_b2, Arrays.copyOfRange(arr_b1, 8, arr_b1.length)), 8))) {
                                    throw new GeneralSecurityException("Verify HMAC failed, could be incorrect key or bytes packet.");
                                }
                                byte[] arr_b3 = fgjk.a(arr_b2, Arrays.copyOfRange(arr_b1, 8, arr_b1.length));
                                cyjh.a.d().B("SeekerToSeekerBleScanner: Found device. Received bytes: %s.", arr_b3);
                                kar kar0 = cyot0.c;
                                gfuy.e(kar0);
                                kar0.accept(arr_b3);
                                cyot0.b();
                                return;
                            }
                            if(arr_b1 != null) {
                                s = (int)arr_b1.length;
                            }
                            throw new GeneralSecurityException("Bytes packet size is incorrect, bytesPacket.length is " + s.toString());
                        }
                        if(arr_b2 != null) {
                            s = (int)arr_b2.length;
                        }
                        throw new GeneralSecurityException("Incorrect secret for decoding bytes packet, secret.length = " + s.toString());
                    }
                    catch(IllegalArgumentException | GeneralSecurityException | cyhd unused_ex) {
                        cyjh.a.c().x("SeekerToSeekerBleScanner: Error while getting device type ordinal from scan data.");
                    }
                }
            }
        }
    }
}

