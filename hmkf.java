import j..util.DesugarTimeZone;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public final class hmkf implements Comparable {
    public Calendar a;
    public SimpleDateFormat b;
    public int c;
    public Locale d;
    public String e;
    public String f;

    public hmkf(long v) {
        this(v, "UTC", "yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX", hmke.e);
    }

    public hmkf(long v, String s, String s1, String s2) {
        this(v, s, s1, hmlx.j(s2));
    }

    public hmkf(long v, String s, String s1, Locale locale0) {
        this.c = 8;
        this.d = hmke.e;
        Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone(s), locale0);
        this.a = calendar0;
        calendar0.clear();
        this.a.setTimeInMillis(v);
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s1, locale0);
        this.b = simpleDateFormat0;
        simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone(s));
        this.e = s1;
        this.f = s;
        this.d = locale0;
    }

    public hmkf(String s, String s1, String s2, Locale locale0) {
        this.c = 8;
        this.d = hmke.e;
        try {
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s2, locale0);
            this.b = simpleDateFormat0;
            simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone(s1));
            Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone(s1), locale0);
            this.a = calendar0;
            calendar0.clear();
            this.a.setTime(this.b.parse(s));
            this.e = s2;
            this.f = s1;
            this.d = locale0;
        }
        catch(Exception exception0) {
            throw new hmki(exception0.getMessage());
        }
    }

    public hmkf(ByteBuffer byteBuffer0) {
        this(byteBuffer0, "UTC", "yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX", false, hmke.e);
    }

    public hmkf(ByteBuffer byteBuffer0, String s, String s1, boolean z, Locale locale0) {
        this.c = 8;
        this.d = hmke.e;
        if(z) {
            this.c = 7;
            byte[] arr_b = byteBuffer0.array();
            byte[][] arr2_b = {new byte[]{20}, arr_b};
            int v = 0;
            for(int v1 = 0; v1 < 2; ++v1) {
                v += arr2_b[v1].length;
            }
            byte[] arr_b1 = new byte[v];
            int v2 = 0;
            for(int v3 = 0; v3 < 2; ++v3) {
                byte[] arr_b2 = arr2_b[v3];
                System.arraycopy(arr_b2, 0, arr_b1, v2, arr_b2.length);
                v2 += arr_b2.length;
            }
            Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone(s), locale0);
            this.a = calendar0;
            calendar0.clear();
            Calendar calendar1 = this.a;
            int v4 = arr_b1[0];
            int v5 = arr_b1[1];
            int v6 = arr_b1[2] - 1;
            int v7 = arr_b1[3];
            int v8 = arr_b1[4];
            int v9 = arr_b1[5];
            int v10 = arr_b1[6];
            calendar1.set(Integer.valueOf((v4 + v5)).intValue(), v6, v7, v8, v9, v10);
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s1, locale0);
            this.b = simpleDateFormat0;
            simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone(s));
        }
        else {
            this.c = byteBuffer0.capacity();
            byte[] arr_b3 = hmlx.l(byteBuffer0.array(), 8);
            Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone(s), locale0);
            this.a = calendar2;
            calendar2.clear();
            this.a.setTimeInMillis(ByteBuffer.wrap(arr_b3).getLong());
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(s1, locale0);
            this.b = simpleDateFormat1;
            simpleDateFormat1.setTimeZone(DesugarTimeZone.getTimeZone(s));
        }
        this.e = s1;
        this.f = s;
        this.d = locale0;
    }

    public final int a(hmkf hmkf0) {
        return this.a.compareTo(hmkf0.a);
    }

    public final hmkg b() {
        return new hmkg(new BigDecimal(this.a.getTimeInMillis()), 6);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((hmkf)object0));
    }

    @Override
    public final String toString() {
        return this.b.format(this.a.getTime());
    }
}

