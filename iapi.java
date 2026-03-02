import java.nio.charset.StandardCharsets;

final class iapi implements iaoe {
    @Override  // iaoe
    public final Object a(byte[] arr_b) {
        int v2;
        int v = arr_b.length;
        int v1 = 0;
        if(v == 1) {
            if(arr_b[0] == 0x30) {
                return iapk.b;
            }
            v = 1;
        }
        switch(v) {
            case 1: {
                v2 = 0;
                goto label_14;
            }
            case 2: {
                int v3 = arr_b[0];
                if(v3 >= 0x30 && v3 <= 57) {
                    v2 = (v3 - 0x30) * 10;
                    v1 = 1;
                label_14:
                    int v4 = arr_b[v1];
                    if(v4 >= 0x30 && v4 <= 57) {
                        int v5 = v2 + (v4 - 0x30);
                        return v5 >= iapk.a.size() ? iapk.d.f("Unknown code " + new String(arr_b, StandardCharsets.US_ASCII)) : ((iapk)iapk.a.get(v5));
                    }
                }
                break;
            }
            default: {
                return iapk.d.f("Unknown code " + new String(arr_b, StandardCharsets.US_ASCII));
            }
        }
        return iapk.d.f("Unknown code " + new String(arr_b, StandardCharsets.US_ASCII));
    }

    @Override  // iaoe
    public final byte[] b(Object object0) {
        return ((iapk)object0).t.s;
    }
}

