import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.google.android.chimera.android.Activity;

final class deuh extends ibsl implements ibtw {
    final dixi a;
    final ActivityResult b;
    final Activity c;
    final Context d;

    public deuh(dixi dixi0, ActivityResult activityResult0, Activity activity0, Context context0, ibrl ibrl0) {
        this.a = dixi0;
        this.b = activityResult0;
        this.c = activity0;
        this.d = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deuh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new deuh(this.a, this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        demv demv0 = new demv(dizg.a(this.b.b));
        this.a.a(demv0);
        Intent intent0 = this.c == null ? null : this.c.getIntent();
        this.a.a(new dfgd(intent0, this.d));
        return ibom.a;
    }
}

