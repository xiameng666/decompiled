public final class clcg {
    public static clcf a(clbd clbd0, ckcq ckcq0) {
        clay clay0 = new clay(ckcq0, clca.a);
        clay0.a(clbd0);
        return new claz(clay0);
    }

    public static clcf b(clbd clbd0, clbb clbb0, ckcq ckcq0) {
        clay clay0 = new clay(ckcq0, clca.a);
        clay0.a(clbd0);
        clay0.b = gfsx.m(clbb0);
        ckcq ckcq1 = ((cldm)clbb0).e;
        ckkp ckkp0 = ckkp.a;
        if(!ckkp0.equals(ckcq1)) {
            if(ckkp0.equals(clay0.a)) {
                clay0.a = ckcq1;
                return new claz(clay0);
            }
            gftb.q(clay0.a.equals(ckcq1));
        }
        return new claz(clay0);
    }

    public static clcf c(String s, ckcq ckcq0) {
        clbc clbc0 = new clbc(null);
        clbc0.b(s);
        return clcg.b(new clbd(clbc0), cldm.a, ckcq0);
    }

    public static clcf d(String s, String s1, ckcq ckcq0) {
        clbc clbc0 = new clbc(null);
        clbc0.b(s);
        clbd clbd0 = new clbd(clbc0);
        clba clba0 = new clba(null);
        clba0.b(s1);
        return clcg.b(clbd0, new cldm(clba0), ckcq0);
    }

    @Deprecated
    public static clcf e(String s, clbk clbk0, clbj clbj0) {
        gftb.check(clbk0);
        gftb.check(clbj0);
        return new clcu(s, ckkp.a, clcd.a);
    }

    public static clcf f(String s, ckcq ckcq0, clbk clbk0, clbj clbj0) {
        gftb.check(clbk0);
        gftb.check(clbj0);
        return new clcu(s, ckcq0, clcd.a);
    }
}

