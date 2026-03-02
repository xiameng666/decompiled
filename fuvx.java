import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

public final class fuvx {
    public final int a;
    public final boolean b;
    public final fvte c;

    public fuvx(fvte fvte0, boolean z) {
        Iterator iterator0;
        this.c = fvte0;
        this.b = z;
        int v = 100;
        if(fvte0.b() == 0x420) {
            fvte0.g();
        }
        else {
            String[] arr_s = {fvte0.g(), fvte0.f()};
            int v1 = 0;
        alab2:
            while(true) {
                if(v1 >= 2) {
                    int v2 = fvte0.c();
                    int v3 = fvte0.b();
                    if(v2 != 0x200 && v2 != 0x300 && v2 != 0x800 && v2 != 0x900) {
                    alab1:
                        switch(v3) {
                            case 1060: 
                            case 1068: 
                            case 1096: 
                            case 0x704: 
                            case 0x70C: 
                            case 0x714: {
                                break;
                            }
                            default: {
                                if(v2 != 0x100) {
                                    if(v3 != 1048) {
                                        iterator0 = Arrays.asList(new String[]{fvte0.g(), fvte0.f()}).iterator();
                                    label_26:
                                        while(iterator0.hasNext()) {
                                            Object object0 = iterator0.next();
                                            String s = (String)object0;
                                            if(s == null || !fuvy.e.contains(s.toLowerCase(Locale.US)) && !fuvy.e(s, fuvy.c, fuvy.d)) {
                                                continue;
                                            }
                                            break alab1;
                                        }
                                        fvte0.g();
                                        v = 50;
                                        break alab2;
                                    }
                                }
                                else if(v3 == 0x100) {
                                    iterator0 = Arrays.asList(new String[]{fvte0.g(), fvte0.f()}).iterator();
                                    goto label_26;
                                }
                            }
                        }
                    }
                    fvte0.g();
                    fvte0.f();
                    v = 0;
                    break;
                }
                if(fuvy.e(arr_s[v1], fuvy.a, fuvy.b)) {
                    fvte0.g();
                    fvte0.f();
                    break;
                }
                ++v1;
            }
        }
        this.a = v;
    }

    public final boolean a() {
        return this.a > 90;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BluetoothDeviceParams [name=");
        stringBuilder0.append(this.c.g());
        stringBuilder0.append(", alias=");
        stringBuilder0.append(this.c.f());
        stringBuilder0.append(", deviceClass=");
        stringBuilder0.append(this.c.b());
        stringBuilder0.append(", address=");
        stringBuilder0.append(this.c.e());
        stringBuilder0.append(", isVehicle=");
        String s = "n";
        stringBuilder0.append((this.a() ? "y" : "n"));
        stringBuilder0.append("(static=");
        stringBuilder0.append(this.a);
        stringBuilder0.append("), connected=");
        if(this.b) {
            s = "y";
        }
        stringBuilder0.append(s);
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

