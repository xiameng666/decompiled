import java.util.ArrayList;
import java.util.List;

public class hmoe {
    public byte[] a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public byte[][] g;
    public final List h;
    public int i;

    public hmoe() {
        this.c = 0xEEEE;
        this.h = new ArrayList();
    }

    public hmoe a() {
        hmoe hmoe0 = new hmoe();
        hmoe0.e = this.e;
        hmoe0.d = this.d;
        hmoe0.c = this.c;
        hmoe0.d(((byte[])this.a.clone()));
        hmoe0.i = this.i;
        hmoe0.b = this.b;
        hmoe0.f = this.f;
        if(this.f != 5 && this.h.contains("additionalAccessRights")) {
            hmoe0.c(this.g);
        }
        return hmoe0;
    }

    public void b(hmoe hmoe0) {
        this.e = hmoe0.e;
        this.d = hmoe0.d;
        this.c = hmoe0.c;
        this.d(((byte[])hmoe0.a.clone()));
        this.i = hmoe0.i;
        this.b = hmoe0.b;
        this.f = hmoe0.f;
        if(hmoe0.f != 5 && hmoe0.h.contains("additionalAccessRights")) {
            this.c(hmoe0.g);
        }
    }

    public final void c(byte[][] arr2_b) {
        this.g = arr2_b;
        this.h.add("additionalAccessRights");
    }

    public void d(byte[] arr_b) {
        byte[] arr_b1 = this.a;
        if(arr_b1 != null) {
            if(arr_b.length > arr_b1.length) {
                throw new IllegalStateException("file length is less than the data length provided.");
            }
            System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
            return;
        }
        this.a = arr_b;
    }
}

