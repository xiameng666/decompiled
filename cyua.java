import android.content.Context;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

abstract class cyua extends cjtm {
    static final gged_interceptors a;
    final AbstractSafeParcelable b;
    final String c;
    final int d;
    final int e;
    final int f;

    static {
        gged_interceptors.m("android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN");
        cyua.a = gged_interceptors.l("android.permission.BLUETOOTH_CONNECT");
    }

    public cyua(String s, AbstractSafeParcelable abstractSafeParcelable0, String s1, int v, int v1, int v2) {
        super(0x109, s);
        this.b = abstractSafeParcelable0;
        this.c = s1;
        this.d = v;
        this.e = v1;
        this.f = v2;
    }

    final void b(Context context0, int v) {
        this.c(context0, v, 0);
    }

    final void c(Context context0, int v, int v1) {
        cxzx.m(context0, this.f, v, v1);
    }
}

