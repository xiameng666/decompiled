import com.google.firebase.appindexing.internal.ActionImpl;

public final class bwrw extends Exception {
    public final glrs a;
    public final glrq b;
    public final ActionImpl c;

    public bwrw(glrq glrq0, ActionImpl actionImpl0, glrs glrs0) {
        super("Action and Object URLs must match.");
        this.b = glrq0;
        this.c = actionImpl0;
        this.a = glrs0;
    }

    public bwrw(glrq glrq0, String s, ActionImpl actionImpl0, glrs glrs0, Throwable throwable0) {
        super(s, throwable0);
        this.b = glrq0;
        this.c = actionImpl0;
        this.a = glrs0;
    }

    public bwrw(String s, ActionImpl actionImpl0, glrs glrs0) {
        super(s);
        this.b = glrq.d;
        this.c = actionImpl0;
        this.a = glrs0;
    }

    public bwrw(String s, glrs glrs0) {
        super(s);
        this.b = glrq.d;
        this.c = null;
        this.a = glrs0;
    }
}

