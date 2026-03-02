import android.widget.Toast;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.model.RestoreResultEntity;

public final class ekjx implements lqj {
    public final ekjy a;

    public ekjx(ekjy ekjy0) {
        this.a = ekjy0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ejze ejze0 = ejze.a();
        int v = ((RestoreResultEntity)object0).c.equals(Status.b) ? 3 : 4;
        ekjy ekjy0 = this.a;
        ejze0.r(v, ekjy0.b.g(), ekjy0.b.c, ekjy0.b.b);
        if(((RestoreResultEntity)object0).c.equals(Status.b)) {
            for(Object object1: ekjy0.c) {
                ejyy ejyy0 = (ejyy)object1;
                String s = ejyy.a(ejyy0.k) ? Long.toString(ejyy0.b.longValue()) : ejyy0.a;
                String s1 = ekjy0.b.i();
                ekaq ekaq0 = ekjy0.b.g;
                ekaq.e(ekaq0.b.b(new ekad(s1, s, System.currentTimeMillis()), ekaq0.a));
            }
            ekjy0.a.b();
            return;
        }
        Toast.makeText(ekjy0.requireContext(), 0x7F1528C5, 1).show();  // string:romanesco_restore_retry_later "Something went wrong, please try again later"
        ekjy0.a.b();
    }
}

