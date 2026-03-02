import java.util.List;

public final class hmcs {
    public hmda a;
    public hmct b;
    public hmcu c;
    public hmdc d;

    public hmcs(hmie hmie0, List list0, List list1) {
        if(hmie0.a() == null) {
            throw new hmfq(hmfl.L);
        }
        if(hmie0.b() == null && hmie0.c() == null) {
            throw new hmfq(hmfl.e);
        }
        hmda hmda0 = new hmda(hmie0);
        this.a = hmda0;
        if(hmda0.c) {
            this.b = new hmct(hmie0, hmda0, list0, list1);
        }
        if(this.a.d) {
            this.c = new hmcu(hmie0);
        }
    }
}

