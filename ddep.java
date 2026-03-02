public final class ddep {
    public static final void a(String s, String s1, dcvg dcvg0, hel hel0, goz goz0, int v, int v1) {
        String s5;
        String s4;
        int v2;
        goz goz1 = goz0.ao(0x8575F7BB);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (goz1.Z(dcvg0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (goz1.X(hel0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            if((v1 & 8) != 0) {
                hel0 = hei.i;
            }
            String s2 = "waiting...";
            if(dcvg0 == null) {
                s5 = "waiting...";
            }
            else {
                String s3 = "unknown";
                switch(dcvg0.a) {
                    case 0: {
                        s4 = "legacy";
                        break;
                    }
                    case 1: {
                        s4 = "instant";
                        break;
                    }
                    default: {
                        s4 = "unknown";
                    }
                }
                switch(dcvg0.b) {
                    case 1: {
                        s3 = "MDNS";
                        break;
                    }
                    case 2: {
                        s3 = "Bluetooth";
                        break;
                    }
                    case 3: {
                        s3 = "Wifi_HOTSPOT";
                        break;
                    }
                    case 4: {
                        s3 = "BLE";
                        break;
                    }
                    case 5: {
                        s3 = "Wifi_LAN";
                        break;
                    }
                    case 6: {
                        s3 = "Wifi_AWARE";
                        break;
                    }
                    case 7: {
                        s3 = "NFC";
                        break;
                    }
                    case 8: {
                        s3 = "Wifi_DIRECT";
                        break;
                    }
                    case 9: {
                        s3 = "Web_RTC";
                        break;
                    }
                    case 10: {
                        s3 = "BLE_L2CAP";
                        break;
                    }
                    case 11: {
                        s3 = "USB";
                        break;
                    }
                    case 12: {
                        s3 = "WEB_RTC_NON_CELLULAR";
                    }
                }
                s5 = a.r(s3, s4, ".");
            }
            if(dcvg0 != null) {
                s2 = dcvh.a(dcvg0.c) + "(M) " + dcvh.a(dcvg0.d) + "(L) " + dcvh.a(dcvg0.e) + "(R)";
            }
            ddep.b((s + "\nReferrer: " + (s1 == null ? "N/A" : s1) + "\nMedium: " + s5 + "\nChannel: " + s2), hel0, goz1, v2 >> 6 & 0x70);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddel(s, s1, dcvg0, hel0, v, v1);
        }
    }

    public static final void b(String s, hel hel0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x8110A356);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hel0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x40957, gzf.e(-346809896, new ddeo(hel0, s), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddek(s, hel0, v);
        }
    }
}

