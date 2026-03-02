public final class hmfz {
    public final boolean a;
    public final hmbb b;

    public hmfz() {
        this.b = hmhe.a();
        this.a = true;
    }

    public final hmgz a(hmhi hmhi0, hmgz hmgz0, hmgz hmgz1, hmgz hmgz2) {
        try {
            hmgz hmgz3 = hmgz.e(hmfz.b(hmgz0));
            hmgz3.v(hmgz1);
            hmgz3.v(hmgz2);
            return hmgz.e(hmhi0.f(hmgz3.a));
        }
        catch(RuntimeException unused_ex) {
            this.b.a("Exception from crypto during transaction id generation.", new Object[0]);
            return new hmgz(0);
        }
    }

    public static final byte[] b(hmgz hmgz0) {
        String s = hmgz0.i().replaceAll("F", "");
        if(s.length() % 2 != 0) {
            s = s + "F";
        }
        return new hmgz(s).a;
    }
}

