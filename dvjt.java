import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.ui.callout.Callout;
import j..util.DesugarCalendar;
import j..util.DesugarDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class dvjt implements gfsi {
    public final dvju a;
    public final Valuable b;
    public final Callout c;

    public dvjt(dvju dvju0, Valuable valuable0, Callout callout0) {
        this.a = dvju0;
        this.b = valuable0;
        this.c = callout0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Valuable valuable0 = this.b;
        boolean z = ((gged_interceptors)object0).contains(valuable0.b);
        Callout callout0 = this.c;
        dvju dvju0 = this.a;
        Object object1 = Boolean.valueOf(true);
        if(z) {
            callout0.o(1);
            callout0.n(dvju0.a.getString(0x7F15231B, new Object[]{valuable0.d}));  // string:pay_valuable_activation_failure_callout "Something went wrong. Please contact 
                                                                                   // %1$s for help."
            return object1;
        }
        gtle gtle0 = ((guvw)valuable0.m().d()).f;
        if(gtle0 == null) {
            gtle0 = gtle.a;
        }
        Calendar calendar0 = edmq.a(gtle0);
        if(calendar0 != null && ((long)(((Long)dvju0.b.b().f(Long.valueOf(System.currentTimeMillis()))))) < calendar0.getTimeInMillis()) {
            Date date0 = DesugarDate.from(DesugarCalendar.toInstant(calendar0));
            TimeZone timeZone0 = calendar0.getTimeZone();
            dvju0.e.setTimeZone(timeZone0);
            String s = dvju0.e.format(date0);
            callout0.o(0);
            callout0.n(dvju0.a.getString(0x7F152355, new Object[]{s}));  // string:pay_valuable_validity_info_callout "Your ticket will be ready to use on %1$s"
            return object1;
        }
        return Boolean.valueOf(false);
    }
}

