import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEntity;

public final class ejve extends ejvi {
    public ejve(Recurrence recurrence0) {
        super(recurrence0);
    }

    @Override  // ejvi
    public final DateTime a(DateTime dateTime0) {
        return dateTime0;
    }

    @Override  // ejvi
    public final DateTime b(DateTime dateTime0) {
        return ejvd.f(dateTime0, this.g());
    }

    @Override  // ejvi
    public final void c() {
        batl.b(((int)((RecurrenceEntity)this.a).a) == 0);
    }
}

