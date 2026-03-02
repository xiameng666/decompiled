import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.SingleDateSelector;
import j..time.Instant;
import j..time.LocalDate;
import j..time.ZoneOffset;

public final class dxai {
    public static final bboh a;

    static {
        dxai.a = bboh.b("Pay", bbcu.cZ);
    }

    public static final long a(hjih hjih0) {
        LocalDate localDate0 = LocalDate.of(hjih0.b, hjih0.c, hjih0.d);
        ibuq.e(localDate0, "of(...)");
        return localDate0.atStartOfDay(ZoneOffset.systemDefault()).toInstant().toEpochMilli();
    }

    public static final hjih b(long v) {
        LocalDate localDate0 = Instant.ofEpochMilli(v).atZone(ZoneOffset.UTC).toLocalDate();
        ibuq.e(localDate0, "toLocalDate(...)");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjih.a).v_newBuilder();
        int v1 = localDate0.getYear();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hjih)hftp0.b_message).b = v1;
        int v2 = localDate0.getMonthValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hjih)hftp0.b_message).c = v2;
        int v3 = localDate0.getDayOfMonth();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hjih)hftp0.b_message).d = v3;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hjih)hftv0;
    }

    public static final void c(dxcw dxcw0, Context context0, RowSecondary rowSecondary0) {
        Month month0;
        hjih hjih0 = dxcw0.k.c == null ? hjih.a : dxcw0.k.c;
        ibuq.e(hjih0, "getDate(...)");
        long v = dxai.a(hjih0);
        SingleDateSelector singleDateSelector0 = new SingleDateSelector();
        DateValidatorPointForward dateValidatorPointForward0 = new DateValidatorPointForward(0x8000000000000000L);
        CalendarConstraints calendarConstraints0 = fyhv.a(fyhv.a, fyhv.b, null, 0, dateValidatorPointForward0);
        Long.valueOf(v).getClass();
        singleDateSelector0.a = fyjp.a(v);
        if(calendarConstraints0.d == null) {
            if(singleDateSelector0.e().isEmpty()) {
            label_13:
                month0 = Month.f();
                if(!fyiy.a(month0, calendarConstraints0)) {
                    month0 = calendarConstraints0.a;
                }
            }
            else {
                Object object0 = singleDateSelector0.e().iterator().next();
                month0 = Month.d(((Long)object0).longValue());
                if(!fyiy.a(month0, calendarConstraints0)) {
                    goto label_13;
                }
            }
            calendarConstraints0.d = month0;
        }
        fyiz fyiz0 = new fyiz();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("OVERRIDE_THEME_RES_ID", 0);
        bundle0.putParcelable("DATE_SELECTOR_KEY", singleDateSelector0);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints0);
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle0.putInt("TITLE_TEXT_RES_ID_KEY", 0x7F151919);  // string:mtrl_picker_date_header_title "Select Date"
        bundle0.putCharSequence("TITLE_TEXT_KEY", null);
        bundle0.putInt("INPUT_MODE_KEY", 0);
        bundle0.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", 0);
        bundle0.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", null);
        bundle0.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
        bundle0.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
        bundle0.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", 0);
        bundle0.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", null);
        bundle0.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
        bundle0.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
        fyiz0.setArguments(bundle0);
        dxag dxag0 = new dxag(new dxaf(fyiz0, context0, dxcw0, rowSecondary0));
        fyiz0.ag.add(dxag0);
        ibuq.d(context0, "null cannot be cast to non-null type com.google.android.chimerax.fragment.app.FragmentActivity");
        fyiz0.show(((xob)context0).getSupportFragmentManager(), "date_picker");
    }
}

