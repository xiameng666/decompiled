import android.content.Intent;
import android.os.Bundle;

final class gang {
    public final int a;
    public ganp b;
    public gano c;
    public gank d;
    public int e;
    public ganv f;
    public ganf g;

    public gang(int v) {
        this.a = v;
        this.e = 1;
    }

    public gang(Bundle bundle0) {
        this.a = bundle0.getInt("executionId");
        if(bundle0.containsKey("request")) {
            this.c = new gano(((Intent)gcur.b(bundle0, "request")));
        }
        if(bundle0.containsKey("response")) {
            this.b = new ganp(((Intent)gcur.b(bundle0, "response")));
        }
        this.e = bundle0.getInt("state");
    }

    public gang(gbfk gbfk0) {
        int v;
        this.a = gbfk0.a;
        this.c = new gano(((Intent)gcur.b(gbfk0.c, "request")));
        Bundle bundle0 = gbfk0.d;
        if(bundle0 == null) {
            v = 1;
        }
        else {
            ganp ganp0 = ganp.g(bundle0);
            if(ganp0 == null) {
                v = gbfk0.b;
            }
            else {
                this.b = ganp0;
                v = 4;
            }
        }
        this.e = v;
    }
}

