import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.YearlyPattern;
import com.google.android.gms.reminders.model.YearlyPatternEntity;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public final class ejvk extends ejvi {
    private final List b;

    public ejvk(Recurrence recurrence0) {
        super(recurrence0);
        this.b = DesugarCollections.unmodifiableList(new ArrayList(ejvk.d(((RecurrenceEntity)recurrence0).h)));
    }

    @Override  // ejvi
    public final DateTime a(DateTime dateTime0) {
        YearlyPatternEntity yearlyPatternEntity0 = ((RecurrenceEntity)this.a).h;
        SortedSet sortedSet0 = ejvk.d(yearlyPatternEntity0);
        while((!sortedSet0.contains(dateTime0.g()) || !ejvf.f(yearlyPatternEntity0.a(), dateTime0)) && this.h(dateTime0)) {
            dateTime0 = ejvd.f(dateTime0, 1);
        }
        return dateTime0;
    }

    @Override  // ejvi
    public final DateTime b(DateTime dateTime0) {
        DateTime dateTime3;
        DateTime dateTime1 = ejvd.j(dateTime0);
        int v = (int)dateTime0.f();
        DateTime dateTime2;
        while((dateTime2 = ejvf.d(((RecurrenceEntity)this.a).h.a(), dateTime1, v)) == null) {
            List list0 = this.b;
            for(Object object0: list0) {
                Integer integer0 = (Integer)object0;
                if(((int)integer0) <= ((int)((DateTimeEntity)dateTime1).b)) {
                    continue;
                }
                ejuh ejuh0 = new ejuh(dateTime1);
                ejuh0.b = integer0;
                dateTime3 = ejuh0.a();
                goto label_21;
            }
            ejuh ejuh1 = new ejuh(dateTime1);
            ejuh1.b = (Integer)list0.get(0);
            DateTime dateTime4 = ejuh1.a();
            int v1 = this.g();
            Calendar calendar0 = ejvd.k(dateTime4);
            calendar0.add(1, v1);
            dateTime3 = ejvd.h(calendar0);
        label_21:
            dateTime1 = dateTime3;
            v = 0;
        }
        return dateTime2;
    }

    @Override  // ejvi
    public final void c() {
        RecurrenceEntity recurrenceEntity0 = (RecurrenceEntity)this.a;
        batl.b(((int)recurrenceEntity0.a) == 3);
        batl.s(recurrenceEntity0.h);
        batl.s(recurrenceEntity0.h.a());
        batl.s(recurrenceEntity0.h.c());
        batl.b(((boolean)(recurrenceEntity0.h.c().isEmpty() ^ 1)));
        ejvf.e(recurrenceEntity0.h.a());
    }

    private static SortedSet d(YearlyPattern yearlyPattern0) {
        SortedSet sortedSet0 = new TreeSet();
        for(Object object0: yearlyPattern0.c()) {
            sortedSet0.add(((Integer)object0));
        }
        return sortedSet0;
    }
}

