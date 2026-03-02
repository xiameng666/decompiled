import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.model.RestoreResultEntity;

public final class ekmr implements evqc {
    public final ekms a;

    public ekmr(ekms ekms0) {
        this.a = ekms0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Log.w("RestoreResultLD", "Error occurs when calling api to restore contacts!");
        ekms ekms0 = this.a;
        if((exception0 instanceof aztb)) {
            Status status0 = Status.f;
            if(((aztb)exception0).b() == status0.i) {
                ekms0.ii(new RestoreResultEntity(0, 0, status0));
                return;
            }
        }
        ekms0.ii(new RestoreResultEntity(0, 0, Status.d));
    }
}

