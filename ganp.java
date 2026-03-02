import android.content.Intent;
import android.os.Bundle;

public final class ganp {
    public final Intent a;

    public ganp(Intent intent0) {
        this.a = intent0;
        intent0.setExtrasClassLoader(ganp.class.getClassLoader());
    }

    public final int a() {
        return this.a.getIntExtra("extraErrorCode", -1);
    }

    public final int b() {
        return this.a.getIntExtra("status", 0);
    }

    public static int c(int v) {
        switch(v) {
            case -1: {
                return 0;
            }
            case 0: {
                return 1;
            }
            default: {
                return 2;
            }
        }
    }

    public static Intent d(int v) {
        Intent intent0 = ganp.e(2);
        intent0.putExtra("extraErrorCode", v);
        return intent0;
    }

    public static Intent e(int v) {
        Intent intent0 = new Intent();
        intent0.putExtra("status", v);
        return intent0;
    }

    public static Intent f(Intent intent0) {
        Intent intent1 = ganp.e(5);
        intent1.putExtra("extraResolvableIntent", intent0);
        return intent1;
    }

    public static ganp g(Bundle bundle0) {
        Intent intent0 = (Intent)bundle0.getParcelable("extraActionResponseIntent");
        return intent0 == null ? null : new ganp(intent0);
    }

    public static ganp h(int v) {
        return new ganp(ganp.e(v));
    }

    public static ganp i(Intent intent0) {
        return new ganp(ganp.f(intent0));
    }

    public static ganp j() {
        return ganp.h(2);
    }

    public static ganp k(int v) {
        return new ganp(ganp.d(v));
    }

    public static ganp l(Throwable throwable0) {
        Intent intent0 = new Intent();
        intent0.putExtra("status", 3);
        intent0.putExtra("extraThrowable", throwable0);
        return new ganp(intent0);
    }

    public final Throwable m() {
        return (Throwable)this.a.getSerializableExtra("extraThrowable");
    }
}

