import android.util.Log;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfoV2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public final class cuvw {
    public static cuvx a(byte[] arr_b) {
        Integer integer0 = (int)20;
        if(!cuvy.a(arr_b, 20)) {
            Log.i("NC_ConnInfo", "Failed to parse ConnectivityInfo due to incorrect data element type");
            return null;
        }
        int v = arr_b[cuwa.a(arr_b)];
        boolean z = false;
        if(v == 0) {
            cuvc cuvc0 = new cuvc();
            if(cuwa.c(arr_b) <= 0) {
                throw new IllegalArgumentException("The length is 0");
            }
            if(cuwa.e(arr_b) != 20) {
                throw new IllegalArgumentException(String.format("The field type is not %d", integer0));
            }
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            int v1 = cuwa.a(arr_b);
            if(byteArrayInputStream0.read(new byte[v1], 0, v1) != v1) {
                throw new IllegalArgumentException("Failed to read header.");
            }
            if(byteArrayInputStream0.read() != 0) {
                throw new IllegalArgumentException(String.format("The medium type is not %d", ((int)0)));
            }
            int v2 = (byte)byteArrayInputStream0.read();
            if((v2 & 0x40) == 0x40) {
                byte[] arr_b1 = new byte[6];
                if(byteArrayInputStream0.read(arr_b1, 0, 6) != 6) {
                    throw new IllegalArgumentException("Failed to read MAC address.");
                }
                cuvc0.c(arr_b1);
            }
            if((v2 & 0x20) == 0x20) {
                byte[] arr_b2 = new byte[4];
                if(byteArrayInputStream0.read(arr_b2, 0, 4) != 4) {
                    throw new IllegalArgumentException("Failed to read UUID.");
                }
                cuvc0.a = arr_b2;
            }
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            Log.i("NearbyConnections", "Reading actions");
            int v3;
            while((v3 = byteArrayInputStream0.read()) != -1) {
                byteArrayOutputStream0.write(((int)(((byte)v3))));
            }
            byte[] arr_b3 = byteArrayOutputStream0.toByteArray();
            Log.i("NearbyConnections", String.format("Read %d action(s)", ((int)arr_b3.length)));
            Log.i("NearbyConnections", String.format("Actions: %s", cuve.b(arr_b3)));
            if(arr_b3 != null && arr_b3.length > 0) {
                cuvc0.b(arr_b3);
            }
            return cuvc0.a();
        }
        if(v == 1) {
            cuva cuva0 = new cuva();
            if(cuwa.c(arr_b) <= 0) {
                throw new IllegalArgumentException("The length is 0");
            }
            if(cuwa.e(arr_b) != 20) {
                throw new IllegalArgumentException(String.format("The field type is not %d", integer0));
            }
            ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr_b);
            int v4 = cuwa.a(arr_b);
            if(byteArrayInputStream1.read(new byte[v4], 0, v4) != v4) {
                throw new IllegalArgumentException("Failed to read header.");
            }
            if(byteArrayInputStream1.read() != 1) {
                throw new IllegalArgumentException(String.format("The medium type is not %d", ((int)1)));
            }
            int v5 = (byte)byteArrayInputStream1.read();
            if((v5 & 0x40) == 0x40) {
                byte[] arr_b4 = new byte[6];
                if(byteArrayInputStream1.read(arr_b4, 0, 6) != 6) {
                    throw new IllegalArgumentException("Failed to read MAC address.");
                }
                cuva0.d(arr_b4);
            }
            if((v5 & 0x20) == 0x20) {
                int v6 = (byte)byteArrayInputStream1.read();
                byte[] arr_b5 = new byte[v6];
                if(byteArrayInputStream1.read(arr_b5, 0, v6) != v6) {
                    throw new IllegalArgumentException("Failed to read GATT characteristic.");
                }
                cuva0.c(arr_b5);
            }
            if((v5 & 16) == 16) {
                byte[] arr_b6 = new byte[2];
                if(byteArrayInputStream1.read(arr_b6, 0, 2) != 2) {
                    throw new IllegalArgumentException("Failed to read PSM value.");
                }
                cuva0.f(arr_b6);
            }
            if((v5 & 8) == 8) {
                byte[] arr_b7 = new byte[2];
                if(byteArrayInputStream1.read(arr_b7, 0, 2) != 2) {
                    throw new IllegalArgumentException("Failed to read device token.");
                }
                cuva0.e(arr_b7);
            }
            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            int v7;
            while((v7 = byteArrayInputStream1.read()) != -1) {
                byteArrayOutputStream1.write(((int)(((byte)v7))));
            }
            byte[] arr_b8 = byteArrayOutputStream1.toByteArray();
            if(arr_b8 != null && arr_b8.length > 0) {
                cuva0.b(arr_b8);
            }
            return cuva0.a();
        }
        if(v != 2 && v != 3) {
            switch(v) {
                case 4: {
                    cuxp cuxp0 = cuxj.b(arr_b);
                    return cuxp0 == null ? null : new cuxj(cuxp0.a, cuxp0.b, cuxp0.c, cuxp0.d);
                }
                case 5: {
                    cuxp cuxp1 = cuxh.b(arr_b);
                    return cuxp1 == null ? null : new cuxh(cuxp1.a, cuxp1.b, cuxp1.c, cuxp1.d);
                }
                case 6: {
                    if(cuwa.c(arr_b) != 15) {
                        czjr.a.a().b("%s Incorrect size for WiFi Aware Connectivity Info.", "[NC_WifiAwareConnInfo]");
                        return null;
                    }
                    if(cuwa.e(arr_b) != 20) {
                        czjr.a.a().c("[NC_WifiAwareConnInfo]", String.format("Failed to parse connectivity info due to incorrect data element type: %X.", cuwa.e(arr_b)));
                        return null;
                    }
                    int v8 = cuwa.a(arr_b);
                    if(arr_b[v8] == 6) {
                        z = true;
                    }
                    batl.b(z);
                    byte[] arr_b9 = Arrays.copyOfRange(arr_b, v8 + 1, v8 + 5);
                    if(arr_b9.length != 4) {
                        czjr.a.a().b("%s Failed to read service info.", "[NC_WifiAwareConnInfo]");
                        return null;
                    }
                    byte[] arr_b10 = Arrays.copyOfRange(arr_b, v8 + 5, v8 + 13);
                    if(arr_b10.length != 8) {
                        czjr.a.a().b("%s Failed to read password.", "[NC_WifiAwareConnInfo]");
                        return null;
                    }
                    byte[] arr_b11 = Arrays.copyOfRange(arr_b, v8 + 13, v8 + 15);
                    if(arr_b11.length != 2) {
                        czjr.a.a().b("%s Failed to read port.", "[NC_WifiAwareConnInfo]");
                        return null;
                    }
                    return new cuxf(arr_b9, arr_b10, cuve.a(arr_b11));
                }
                default: {
                    Log.i("NC_ConnInfo", String.format("Failed to parse ConnectivityInfo due to wrong medium type: %X.", ((byte)v)));
                    return null;
                }
            }
        }
        if(hvol.ag()) {
            cuxn cuxn0 = new cuxn();
            if(cuwa.c(arr_b) <= 0) {
                throw new IllegalArgumentException("The length is 0");
            }
            if(cuwa.e(arr_b) != 20) {
                throw new IllegalArgumentException(String.format("The field type is not %d", integer0));
            }
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(arr_b);
            int v9 = cuwa.a(arr_b);
            if(byteArrayInputStream2.read(new byte[v9], 0, v9) != v9) {
                throw new IllegalArgumentException("Failed to read header.");
            }
            switch(((byte)byteArrayInputStream2.read())) {
                case 2: {
                    goto label_134;
                }
                case 3: {
                    goto label_139;
                }
            }
            throw new IllegalArgumentException("The medium type is not WIFI_LAN_IPV4 or WIFI_LAN_IPV6");
        label_134:
            byte[] arr_b12 = new byte[4];
            if(byteArrayInputStream2.read(arr_b12, 0, 4) != 4) {
                throw new IllegalArgumentException("Failed to read the IPV4 address.");
            }
            cuxn0.b(arr_b12);
            goto label_142;
        label_139:
            byte[] arr_b13 = new byte[16];
            if(byteArrayInputStream2.read(arr_b13, 0, 16) != 16) {
                throw new IllegalArgumentException("Failed to read the IPV6 address.");
            }
            cuxn0.b(arr_b13);
        label_142:
            byte[] arr_b14 = new byte[2];
            if(byteArrayInputStream2.read(arr_b14, 0, 2) != 2) {
                throw new IllegalArgumentException("Failed to read the port.");
            }
            cuxn0.a = arr_b14;
            byte[] arr_b15 = new byte[6];
            if(byteArrayInputStream2.read(arr_b15, 0, 6) != 6) {
                throw new IllegalArgumentException("Failed to read the BSSID.");
            }
            if(!Arrays.equals(arr_b15, glwl.e(WifiLanConnectivityInfoV2.a))) {
                cuxn0.b = arr_b15;
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int v10;
            while((v10 = byteArrayInputStream2.read()) != -1) {
                byteArrayOutputStream2.write(((int)(((byte)v10))));
            }
            byte[] arr_b16 = byteArrayOutputStream2.toByteArray();
            if(arr_b16 != null && arr_b16.length > 0) {
                cuxn0.c = arr_b16;
            }
            return cuxn0.a();
        }
        cuxl cuxl0 = new cuxl();
        if(cuwa.c(arr_b) <= 0) {
            throw new IllegalArgumentException("The length is 0");
        }
        if(cuwa.e(arr_b) != 20) {
            throw new IllegalArgumentException(String.format("The field type is not %d", integer0));
        }
        ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(arr_b);
        int v11 = cuwa.a(arr_b);
        if(byteArrayInputStream3.read(new byte[v11], 0, v11) != v11) {
            throw new IllegalArgumentException("Failed to read header.");
        }
        if(((byte)byteArrayInputStream3.read()) != 2) {
            throw new IllegalArgumentException(String.format("The medium type is not %d", ((int)2)));
        }
        int v12 = (byte)byteArrayInputStream3.read();
        if((v12 & 0x40) == 0x40) {
            byte[] arr_b17 = new byte[4];
            if(byteArrayInputStream3.read(arr_b17, 0, 4) != 4) {
                throw new IllegalArgumentException("Failed to read the IP address.");
            }
            cuxl0.d(arr_b17);
        }
        if((v12 & 0x20) == 0x20) {
            byte[] arr_b18 = new byte[16];
            if(byteArrayInputStream3.read(arr_b18, 0, 16) != 16) {
                throw new IllegalArgumentException("Failed to read the IP address.");
            }
            cuxl0.d(arr_b18);
        }
        if((v12 & 16) == 16) {
            byte[] arr_b19 = new byte[2];
            if(byteArrayInputStream3.read(arr_b19, 0, 2) != 2) {
                throw new IllegalArgumentException("Failed to read the port.");
            }
            cuxl0.e(arr_b19);
        }
        if((v12 & 8) == 8) {
            byte[] arr_b20 = new byte[6];
            if(byteArrayInputStream3.read(arr_b20, 0, 6) != 6) {
                throw new IllegalArgumentException("Failed to read the BSSID.");
            }
            cuxl0.c(arr_b20);
        }
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        int v13;
        while((v13 = byteArrayInputStream3.read()) != -1) {
            byteArrayOutputStream3.write(((int)(((byte)v13))));
        }
        byte[] arr_b21 = byteArrayOutputStream3.toByteArray();
        if(arr_b21 != null && arr_b21.length > 0) {
            cuxl0.b(arr_b21);
        }
        return cuxl0.a();
    }
}

