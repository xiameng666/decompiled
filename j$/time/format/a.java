package j$.time.format;

import j..time.chrono.Chronology;
import j..time.temporal.TemporalField;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class a extends a0 {
    public final z d;

    public a(z z0) {
        this.d = z0;
    }

    @Override  // j$.time.format.a0
    public final String b(Chronology chronology0, TemporalField temporalField0, long v, TextStyle textStyle0, Locale locale0) {
        return this.d.a(v, textStyle0);
    }

    @Override  // j$.time.format.a0
    public final String c(TemporalField temporalField0, long v, TextStyle textStyle0, Locale locale0) {
        return this.d.a(v, textStyle0);
    }

    @Override  // j$.time.format.a0
    public final Iterator d(Chronology chronology0, TemporalField temporalField0, TextStyle textStyle0, Locale locale0) {
        List list0 = (List)this.d.b.get(textStyle0);
        return list0 == null ? null : list0.iterator();
    }

    @Override  // j$.time.format.a0
    public final Iterator e(TemporalField temporalField0, TextStyle textStyle0, Locale locale0) {
        List list0 = (List)this.d.b.get(textStyle0);
        return list0 == null ? null : list0.iterator();
    }
}

