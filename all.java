import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.text.TextUtils;

public final class all {
    public int a;
    public Bitmap b;
    public String c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public boolean h;
    public int i;
    private boolean j;

    public all() {
        this.a = -1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = true;
        this.j = false;
        this.i = 0;
    }

    public final alm a() {
        String s;
        if(TextUtils.isEmpty(this.d)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        int v = this.i;
        if((v & 0xFFFEFFFF) != 15 && (v & 0xFFFEFFFF) != 0xFF && (v & 0xFFFEFFFF) != 0x8000 && (v & 0xFFFEFFFF) != 0x800F && ((v & 0xFFFEFFFF) != 0 && (v & 0xFFFEFFFF) != 0x80FF)) {
            StringBuilder stringBuilder0 = new StringBuilder("Authenticator combination is unsupported on API ");
            stringBuilder0.append(Build.VERSION.SDK_INT);
            stringBuilder0.append(": ");
            int v1 = this.i;
            switch(0xFFFEFFFF & v1) {
                case 15: {
                    s = "BIOMETRIC_STRONG";
                    break;
                }
                case 0xFF: {
                    s = "BIOMETRIC_WEAK";
                    break;
                }
                case 0x8000: {
                    s = "DEVICE_CREDENTIAL";
                    break;
                }
                case 0x800F: {
                    s = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
                    break;
                }
                case 0x80FF: {
                    s = "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
                    break;
                }
                default: {
                    s = String.valueOf(v1);
                }
            }
            if((v1 & 0x10000) == 0x10000) {
                if(v1 != 0x10000) {
                    s = s + " | ";
                }
                s = s + "IDENTITY_CHECK";
            }
            stringBuilder0.append(s);
            throw new IllegalArgumentException(stringBuilder0.toString());
        }
        boolean z = v == 0 ? this.j : ams.b(v);
        if(TextUtils.isEmpty(this.g) && !z) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if(!TextUtils.isEmpty(this.g) && z) {
            throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
        }
        return new alm(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.j, this.i);
    }

    @Deprecated
    public final void b() {
        this.j = true;
    }
}

