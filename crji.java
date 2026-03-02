import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

public final class crji extends crlv {
    public char a;
    public long b;
    public final crjg c;
    public final crjg d;
    public final crjg e;
    public final crjg f;
    public final crjg g;
    public final crjg h;
    public final crjg i;
    public final crjg j;
    public final crjg k;
    private String l;

    public crji(crkt crkt0) {
        super(crkt0);
        this.a = '\u0000';
        this.b = -1L;
        this.c = new crjg(this, 6, false, false);
        this.d = new crjg(this, 6, true, false);
        this.e = new crjg(this, 6, false, true);
        this.f = new crjg(this, 5, false, false);
        this.g = new crjg(this, 5, true, false);
        this.h = new crjg(this, 5, false, true);
        this.i = new crjg(this, 4, false, false);
        this.j = new crjg(this, 3, false, false);
        this.k = new crjg(this, 2, false, false);
    }

    protected static Object a(String s) {
        return s == null ? null : new crjh(s);
    }

    static String b(boolean z, String s, Object object0, Object object1, Object object2) {
        String s1 = crji.c(z, object0);
        String s2 = crji.c(z, object1);
        String s3 = crji.c(z, object2);
        StringBuilder stringBuilder0 = new StringBuilder();
        String s4 = "";
        if(s == null) {
            s = "";
        }
        if(!TextUtils.isEmpty(s)) {
            stringBuilder0.append(s);
            s4 = ": ";
        }
        String s5 = ", ";
        if(!TextUtils.isEmpty(s1)) {
            stringBuilder0.append(s4);
            stringBuilder0.append(s1);
            s4 = ", ";
        }
        if(TextUtils.isEmpty(s2)) {
            s5 = s4;
        }
        else {
            stringBuilder0.append(s4);
            stringBuilder0.append(s2);
        }
        if(!TextUtils.isEmpty(s3)) {
            stringBuilder0.append(s5);
            stringBuilder0.append(s3);
        }
        return stringBuilder0.toString();
    }

    static String c(boolean z, Object object0) {
        String s = "";
        if(object0 == null) {
            return "";
        }
        if((object0 instanceof Integer)) {
            object0 = (long)(((int)(((Integer)object0))));
        }
        if((object0 instanceof Long)) {
            if(!z) {
                return object0.toString();
            }
            if(Math.abs(((Long)object0).longValue()) < 100L) {
                return object0.toString();
            }
            String s1 = String.valueOf(Math.abs(((Long)object0).longValue()));
            long v1 = Math.round(Math.pow(10.0, s1.length() - 1));
            long v2 = Math.round(Math.pow(10.0, s1.length()) - 1.0);
            StringBuilder stringBuilder0 = new StringBuilder();
            if(object0.toString().charAt(0) == 45) {
                s = "-";
            }
            stringBuilder0.append(s);
            stringBuilder0.append(v1);
            stringBuilder0.append("...");
            stringBuilder0.append(s);
            stringBuilder0.append(v2);
            return stringBuilder0.toString();
        }
        if((object0 instanceof Boolean)) {
            return object0.toString();
        }
        if((object0 instanceof Throwable)) {
            StringBuilder stringBuilder1 = new StringBuilder((z ? ((Throwable)object0).getClass().getName() : ((Throwable)object0).toString()));
            String s2 = crji.d(crkt.class.getCanonicalName());
            StackTraceElement[] arr_stackTraceElement = ((Throwable)object0).getStackTrace();
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                if(!stackTraceElement0.isNativeMethod()) {
                    String s3 = stackTraceElement0.getClassName();
                    if(s3 != null && crji.d(s3).equals(s2)) {
                        stringBuilder1.append(": ");
                        stringBuilder1.append(stackTraceElement0);
                        return stringBuilder1.toString();
                    }
                }
            }
            return stringBuilder1.toString();
        }
        if((object0 instanceof crjh)) {
            return ((crjh)object0).a;
        }
        return z ? "-" : object0.toString();
    }

    static String d(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        int v = s.lastIndexOf(46);
        return v == -1 ? "" : s.substring(0, v);
    }

    @Override  // crlv
    protected final boolean e() {
        return false;
    }

    public final String f() {
        long v1;
        if(this.ap().c != null) {
            crjv crjv0 = this.ap().c;
            crjx crjx0 = crjv0.e;
            crjx0.n();
            crjx0.n();
            long v = crjv0.a();
            if(v == 0L) {
                crjv0.b();
                v1 = 0L;
            }
            else {
                v1 = Math.abs(v - System.currentTimeMillis());
            }
            long v2 = crjv0.d;
            if(v1 < v2) {
                return null;
            }
            if(v1 > v2 + v2) {
                crjv0.b();
                return null;
            }
            String s = crjx0.b().getString(crjv0.c, null);
            long v3 = crjx0.b().getLong(crjv0.b, 0L);
            crjv0.b();
            Pair pair0 = s == null || v3 <= 0L ? crjx.a : new Pair(s, v3);
            return pair0 == null || pair0 == crjx.a ? null : pair0.second + ":" + ((String)pair0.first);
        }
        return null;
    }

    protected final String g() {
        synchronized(this) {
            if(this.l == null) {
                this.l = this.am().q();
            }
            batl.s(this.l);
        }
        return this.l;
    }

    protected final void h(int v, boolean z, boolean z1, String s, Object object0, Object object1, Object object2) {
        if(!z && this.j(v)) {
            this.i(v, crji.b(false, s, object0, object1, object2));
        }
        if(!z1 && v >= 5) {
            batl.s(s);
            crkq crkq0 = this.y.g;
            if(crkq0 == null) {
                this.i(6, "Scheduler not set. Not logging error/warn");
                return;
            }
            if(!crkq0.q()) {
                this.i(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            crkq0.f(new crjf(this, v, s, object0, object1, object2));
        }
    }

    protected final void i(int v, String s) {
        Log.println(v, this.g(), s);
    }

    protected final boolean j(int v) {
        return Log.isLoggable(this.g(), v);
    }
}

