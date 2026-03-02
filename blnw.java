import android.util.Base64;
import j..util.Objects;
import java.util.Arrays;

public final class blnw {
    public final int a;
    private final String b;
    private final byte[] c;

    public blnw(String s) {
        batl.q(s);
        this.a = 1;
        this.b = s;
        this.c = null;
    }

    public blnw(byte[] arr_b) {
        batl.b(arr_b != null && arr_b.length == 0x20);
        this.a = 2;
        this.b = null;
        this.c = arr_b;
    }

    public final String a() {
        batl.l(this.a == 2);
        return "android:apk-key-hash:" + Base64.encodeToString(this.c, 11);
    }

    public final String b() {
        batl.l(this.a == 1);
        return this.b;
    }

    public final boolean c(bnae bnae0, String s, bmzv bmzv0) {
        int v = this.a;
        if(v - 1 != 0) {
            batl.l(v == 2);
            if(s.equals("android:apk-key-hash:" + Base64.encodeToString(this.c, 3)) || s.equals(this.a())) {
                bmzv0.b(bnae0, blgt.b);
                return true;
            }
        }
        else if(this.b().startsWith(s)) {
            String s1 = this.b().substring(s.length());
            if(s1.length() == 0 || s1.charAt(0) == 0x2F) {
                bmzv0.b(bnae0, blgt.b);
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof blnw) ? this.a == ((blnw)object0).a && Objects.equals(this.b, ((blnw)object0).b) && Arrays.equals(this.c, ((blnw)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.c);
        return Objects.hash(new Object[]{((int)this.a), this.b, integer0});
    }

    @Override
    public final String toString() {
        return this.a - 1 == 0 ? this.b() : this.a();
    }
}

