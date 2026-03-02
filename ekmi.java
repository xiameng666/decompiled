import android.util.Log;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class ekmi implements gmbg {
    final ekmj a;

    public ekmi(ekmj ekmj0) {
        Objects.requireNonNull(ekmj0);
        this.a = ekmj0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        Log.e("RestoreContactsLD", "Fetch restorable contacts for selected backup failed.", throwable0);
        ejze.a().d("error:restore_contacts_v2_activity:no_data");
        ejze.a().e(false);
        ArrayList arrayList0 = new ArrayList();
        this.a.ii(arrayList0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ejze.a().e(true);
        if(((List)object0) != null && !((List)object0).isEmpty()) {
            gged_interceptors gged0 = ekmj.b(((List)object0), this.a.a.getResources());
            this.a.ii(gged0);
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        this.a.ii(arrayList0);
    }
}

