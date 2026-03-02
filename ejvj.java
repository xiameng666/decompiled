import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.WeeklyPattern;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public final class ejvj extends ejvi {
    private final List b;

    public ejvj(Recurrence recurrence0) {
        super(recurrence0);
        this.b = DesugarCollections.unmodifiableList(new ArrayList(ejvj.d(((RecurrenceEntity)recurrence0).f)));
    }

    @Override  // ejvi
    public final DateTime a(DateTime dateTime0) {
        SortedSet sortedSet0 = ejvj.d(((RecurrenceEntity)this.a).f);
        while(!sortedSet0.contains(Integer.valueOf(ejvd.b(dateTime0))) && this.h(dateTime0)) {
            dateTime0 = ejvd.f(dateTime0, 1);
        }
        return dateTime0;
    }

    @Override  // ejvi
    public final DateTime b(DateTime dateTime0) {
        List list0 = this.b;
        if(list0.size() == 1) {
            return ejvd.g(dateTime0, this.g());
        }
        int v = ejvd.b(dateTime0);
        int v1 = list0.indexOf(Integer.valueOf(v));
        batl.l(v1 >= 0);
        return v1 == list0.size() - 1 ? ejvd.f(ejvd.g(dateTime0, this.g()), -(v - ((int)(((Integer)list0.get(0)))))) : ejvd.f(dateTime0, ((int)(((Integer)list0.get(v1 + 1)))) - v);
    }

    @Override  // ejvi
    public final void c() {
        RecurrenceEntity recurrenceEntity0 = (RecurrenceEntity)this.a;
        batl.b(((int)recurrenceEntity0.a) == 1);
        batl.s(recurrenceEntity0.f);
        batl.s(recurrenceEntity0.f.a());
        batl.b(((boolean)(recurrenceEntity0.f.a().isEmpty() ^ 1)));
    }

    private static SortedSet d(WeeklyPattern weeklyPattern0) {
        SortedSet sortedSet0 = new TreeSet();
        for(Object object0: weeklyPattern0.a()) {
            sortedSet0.add(((Integer)object0));
        }
        return sortedSet0;
    }
}

