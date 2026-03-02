import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import java.util.Calendar;
import java.util.SortedSet;
import java.util.TreeSet;

public final class ejvf extends ejvi {
    public ejvf(Recurrence recurrence0) {
        super(recurrence0);
    }

    @Override  // ejvi
    public final DateTime a(DateTime dateTime0) {
        while(!ejvf.f(((RecurrenceEntity)this.a).g, dateTime0) && this.h(dateTime0)) {
            dateTime0 = ejvd.f(dateTime0, 1);
        }
        return dateTime0;
    }

    @Override  // ejvi
    public final DateTime b(DateTime dateTime0) {
        DateTime dateTime1 = ejvd.j(dateTime0);
        int v = (int)dateTime0.f();
        DateTime dateTime2;
        while((dateTime2 = ejvf.d(((RecurrenceEntity)this.a).g, dateTime1, v)) == null) {
            int v1 = this.g();
            Calendar calendar0 = ejvd.k(dateTime1);
            calendar0.add(2, v1);
            dateTime1 = ejvd.h(calendar0);
            v = 0;
        }
        return dateTime2;
    }

    @Override  // ejvi
    public final void c() {
        RecurrenceEntity recurrenceEntity0 = (RecurrenceEntity)this.a;
        batl.b(((int)recurrenceEntity0.a) == 2);
        batl.s(recurrenceEntity0.g);
        ejvf.e(recurrenceEntity0.g);
    }

    static DateTime d(MonthlyPattern monthlyPattern0, DateTime dateTime0, int v) {
        for(Object object0: ejvf.k(monthlyPattern0, dateTime0)) {
            Integer integer0 = (Integer)object0;
            if(((int)integer0) > v) {
                ejuh ejuh0 = new ejuh(dateTime0);
                ejuh0.c = integer0;
                return ejuh0.a();
            }
        }
        if(monthlyPattern0.a() != null) {
            int v1 = (int)monthlyPattern0.c();
            DateTime dateTime1 = v1 <= 0 ? ejvf.i(dateTime0, monthlyPattern0.a().intValue(), v1) : ejvf.j(dateTime0, monthlyPattern0.a().intValue(), v1);
            return dateTime1 == null || ((int)((DateTimeEntity)dateTime1).c) <= v ? null : dateTime1;
        }
        return null;
    }

    static void e(MonthlyPattern monthlyPattern0) {
        boolean z = true;
        int v = monthlyPattern0.d() == null || monthlyPattern0.d().isEmpty() ? 0 : 1;
        int v1 = monthlyPattern0.a() != null || monthlyPattern0.c() != null ? 1 : 0;
        batl.b(v != v1);
        if(v != 0) {
            for(Object object0: monthlyPattern0.d()) {
                int v2 = (int)(((Integer)object0));
                batl.b(v2 != 0);
                batl.b(Math.abs(v2) <= 0x1F);
            }
        }
        if(v1 != 0) {
            batl.s(monthlyPattern0.a());
            if(((int)monthlyPattern0.c()) == 0) {
                z = false;
            }
            batl.b(z);
        }
    }

    static boolean f(MonthlyPattern monthlyPattern0, DateTime dateTime0) {
        if(ejvf.k(monthlyPattern0, dateTime0).contains(dateTime0.f())) {
            return true;
        }
        if(monthlyPattern0.a() != null) {
            int v = (int)monthlyPattern0.c();
            DateTime dateTime1 = v <= 0 ? ejvf.i(dateTime0, monthlyPattern0.a().intValue(), v) : ejvf.j(dateTime0, monthlyPattern0.a().intValue(), v);
            return dateTime1 != null && ejvd.a(dateTime1, dateTime0) == 0;
        }
        return false;
    }

    private static DateTime i(DateTime dateTime0, int v, int v1) {
        batl.l(v1 < 0);
        ejuh ejuh0 = new ejuh(dateTime0);
        ejuh0.c = ejvd.c(dateTime0);
        DateTime dateTime1 = ejuh0.a();
        DateTime dateTime2 = ejvd.i(dateTime1, v);
        DateTime dateTime3 = bata.b(((DateTimeEntity)dateTime1).b, ((DateTimeEntity)dateTime2).b) ? ejvd.g(dateTime2, v1 + 1) : ejvd.g(dateTime2, v1);
        Integer integer0 = dateTime0.g();
        return bata.b(((DateTimeEntity)dateTime3).b, integer0) ? dateTime3 : null;
    }

    private static DateTime j(DateTime dateTime0, int v, int v1) {
        DateTime dateTime1 = ejvd.j(dateTime0);
        DateTime dateTime2 = ejvd.i(dateTime1, v);
        DateTime dateTime3 = bata.b(((DateTimeEntity)dateTime1).b, ((DateTimeEntity)dateTime2).b) ? ejvd.g(dateTime2, v1 - 1) : ejvd.g(dateTime2, v1);
        Integer integer0 = dateTime0.g();
        return bata.b(((DateTimeEntity)dateTime3).b, integer0) ? dateTime3 : null;
    }

    private static SortedSet k(MonthlyPattern monthlyPattern0, DateTime dateTime0) {
        int v = ejvd.c(dateTime0);
        SortedSet sortedSet0 = new TreeSet();
        if(monthlyPattern0.d() != null) {
            for(Object object0: monthlyPattern0.d()) {
                int v1 = (int)(((Integer)object0));
                if(v1 <= 0) {
                    v1 = v1 + v + 1;
                }
                if(v1 > 0 && v1 <= v) {
                    ((TreeSet)sortedSet0).add(Integer.valueOf(v1));
                }
            }
        }
        return sortedSet0;
    }
}

