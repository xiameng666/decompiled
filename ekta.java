import android.content.ComponentName;
import android.content.Intent;
import com.google.android.chimera.BoundService;
import java.util.Arrays;

final class ekta {
    final int a;
    final int b;
    final ComponentName c;
    final eksl d;

    public ekta(eksl eksl0) {
        this.a = eksl0.a();
        this.b = (int)(eksl0.g == null ? ((int)-1) : eksl0.g);
        this.c = eksl0.a.f();
        eksl0.a.t();
        this.d = eksl0;
    }

    final Intent a() {
        eksl eksl0 = this.d;
        if(eksl0.o()) {
            String s = this.c.getClassName() + ".ACTION_TASK_READY";
            Intent intent0 = BoundService.getStartIntent(eksl0.f, s);
            return intent0 == null ? new Intent(s).setPackage(this.c.getPackageName()) : intent0;
        }
        return new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setComponent(this.c);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ekta) ? this.a == ((ekta)object0).a && this.b == ((ekta)object0).b && this.c.equals(((ekta)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.c});
    }
}

