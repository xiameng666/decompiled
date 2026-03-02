import android.widget.Toast;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.model.RestoreResultEntity;

public final class ekja implements lqj {
    public final ekjb a;

    public ekja(ekjb ekjb0) {
        this.a = ekjb0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ejze ejze0 = ejze.a();
        int v = ((RestoreResultEntity)object0).c.equals(Status.b) ? 3 : 4;
        ekjb ekjb0 = this.a;
        ejze0.r(v, ekjb0.b.g(), ekjb0.b.c, ekjb0.a.j());
        if(((RestoreResultEntity)object0).c.equals(Status.b)) {
            ekjb0.a.e();
            return;
        }
        Toast.makeText(ekjb0.requireContext(), 0x7F1528C5, 1).show();  // string:romanesco_restore_retry_later "Something went wrong, please try again later"
        ekjb0.a.e();
    }
}

