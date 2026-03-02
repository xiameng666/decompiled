import com.google.android.gms.reminders.model.DailyPatternEntity;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;
import java.util.Iterator;

abstract class ejvi implements Iterator {
    final Recurrence a;
    private final Integer b;
    private final DateTime c;
    private int d;
    private DateTime e;

    public ejvi(Recurrence recurrence0) {
        boolean z = false;
        this.d = 0;
        this.e = null;
        this.a = recurrence0;
        Integer integer0 = ((RecurrenceEntity)recurrence0).b;
        batl.b(integer0 == null || ((int)integer0) > 0);
        batl.s(((RecurrenceEntity)recurrence0).c);
        batl.s(((RecurrenceEntity)recurrence0).c.a());
        DailyPatternEntity dailyPatternEntity0 = ((RecurrenceEntity)recurrence0).e;
        if(dailyPatternEntity0 != null) {
            batl.b(dailyPatternEntity0.a() != null || dailyPatternEntity0.d() != null);
        }
        if(((RecurrenceEntity)recurrence0).c.a() != null) {
            Boolean boolean0 = ((RecurrenceEntity)recurrence0).c.a().d();
            batl.b(boolean0 == null || !boolean0.booleanValue());
        }
        if(((RecurrenceEntity)recurrence0).d.c() != null) {
            Boolean boolean1 = ((RecurrenceEntity)recurrence0).d.c().d();
            batl.b(boolean1 == null || !boolean1.booleanValue());
        }
        batl.s(((RecurrenceEntity)recurrence0).d);
        RecurrenceEndEntity recurrenceEndEntity0 = ((RecurrenceEntity)recurrence0).d;
        batl.b(recurrenceEndEntity0.c() != null || recurrenceEndEntity0.e() != null);
        if(recurrenceEndEntity0.e() != null) {
            if(((int)recurrenceEndEntity0.e()) > 0) {
                z = true;
            }
            batl.b(z);
        }
        this.b = recurrenceEndEntity0.e();
        this.c = recurrenceEndEntity0.c();
        this.c();
        RecurrenceStartEntity recurrenceStartEntity0 = ((RecurrenceEntity)recurrence0).c;
        if(recurrenceStartEntity0.a() == null) {
            throw new IllegalArgumentException("recurrence_start must have start_date_time");
        }
        this.e = this.a(recurrenceStartEntity0.a());
    }

    public abstract DateTime a(DateTime arg1);

    public abstract DateTime b(DateTime arg1);

    public abstract void c();

    final int g() {
        Integer integer0 = ((RecurrenceEntity)this.a).b;
        return integer0 == null ? 1 : ((int)integer0);
    }

    final boolean h(DateTime dateTime0) {
        return this.c == null ? true : ejvd.a(dateTime0, this.c) <= 0;
    }

    @Override
    public final boolean hasNext() {
        batl.l(this.e != null);
        batl.l(this.b != null || this.c != null);
        return this.b == null || this.d < ((int)this.b) ? this.c == null || ejvd.a(this.e, this.c) <= 0 : false;
    }

    @Override
    public final Object next() {
        batl.l(this.hasNext());
        Object object0 = this.e;
        DailyPatternEntity dailyPatternEntity0 = ((RecurrenceEntity)this.a).e;
        if(dailyPatternEntity0 != null) {
            ejuh ejuh0 = new ejuh(((DateTime)object0));
            if(Boolean.TRUE.equals(dailyPatternEntity0.c())) {
                ejuh0.e = dailyPatternEntity0.c();
            }
            if(dailyPatternEntity0.a() != null) {
                ejuh0.c(dailyPatternEntity0.a());
            }
            if(dailyPatternEntity0.d() != null) {
                ejuh0.b(dailyPatternEntity0.d());
            }
            object0 = ejuh0.a();
        }
        this.e = this.b(this.e);
        ++this.d;
        return object0;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

