import android.content.Intent;
import android.os.Bundle;

final class ganm {
    public final int a;
    public ganp b;
    public gano c;
    public int d;
    public gany e;
    public ganl f;

    public ganm(int v) {
        this.a = v;
        this.d = 1;
    }

    public ganm(Bundle bundle0) {
        this.a = bundle0.getInt("executionId");
        if(bundle0.containsKey("request")) {
            this.c = new gano(((Intent)gcur.b(bundle0, "request")));
        }
        if(bundle0.containsKey("response")) {
            this.b = new ganp(((Intent)gcur.b(bundle0, "response")));
        }
        this.d = bundle0.getInt("state");
    }
}

