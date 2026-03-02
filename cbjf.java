import android.text.format.DateFormat;

public final class cbjf extends cbjm {
    private static final bboh a;

    static {
        cbjf.a = bboh.b("ShowClockTimePickerMessageHandler", bbcu.ac);
    }

    public cbjf(xob xob0, Integer integer0) {
        super(xob0, ((int)DateFormat.is24HourFormat(xob0)), integer0);
    }

    @Override  // cbjm
    public final Object a(ByteString hfsf0, ibrl ibrl0) {
        ((ggtj)cbjf.a.h()).x("Show clock time picker.");
        return cbjm.b(this, hfsf0, ibrl0);
    }
}

