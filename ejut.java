import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.internal.ref.TaskRef;
import com.google.android.gms.reminders.model.Task;

public final class ejut extends bakl {
    public ejut(DataHolder dataHolder0) {
        super(dataHolder0);
    }

    @Override  // bakl
    public final Object c(int v) {
        return this.d(v);
    }

    public final Task d(int v) {
        return new TaskRef(this.a, v);
    }
}

