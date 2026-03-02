import android.content.Context;
import android.graphics.Typeface;
import java.util.Objects;

public final class jdh {
    private final Context a;

    public jdh(Context context0) {
        this.a = context0.getApplicationContext();
    }

    public final Object a(jdy jdy0, ibrl ibrl0) {
        jdg jdg0;
        if((ibrl0 instanceof jdg)) {
            jdg0 = (jdg)ibrl0;
            int v = jdg0.d;
            if((v & 0x80000000) == 0) {
                jdg0 = new jdg(this, ibrl0);
            }
            else {
                jdg0.d = v - 0x80000000;
            }
        }
        else {
            jdg0 = new jdg(this, ibrl0);
        }
        Object object0 = jdg0.b;
        Object object1 = ibrx.a;
        switch(jdg0.d) {
            case 0: {
                ibnx.b(object0);
                if((jdy0 instanceof jdf)) {
                    jdg0.d = 1;
                    Object object2 = ((jdf)jdy0).a.b(this.a, ((jdf)jdy0), jdg0);
                    return object2 == object1 ? object1 : object2;
                }
                if((jdy0 instanceof jfd)) {
                    jdg0.a = jdy0;
                    jdg0.d = 2;
                    icbk icbk0 = new icbk(ibsc.c(jdg0), 1);
                    icbk0.z();
                    jdi jdi0 = new jdi(icbk0, ((jfd)jdy0));
                    jxi.c(this.a, ((jfd)jdy0).a, jdi0);
                    object0 = icbk0.k();
                    if(object0 == object1) {
                        ibsi.b(jdg0);
                    }
                    return object0 != object1 ? jfc.a(((Typeface)object0), ((jfd)jdy0).b, this.a) : object1;
                }
                Objects.toString(jdy0);
                throw new IllegalArgumentException("Unknown font type: " + jdy0);
            }
            case 1: {
                ibnx.b(object0);
                return object0;
            }
            case 2: {
                jdy0 = jdg0.a;
                ibnx.b(object0);
                return jfc.a(((Typeface)object0), ((jfd)jdy0).b, this.a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(jdy jdy0) {
        if((jdy0 instanceof jdf)) {
            return ((jdf)jdy0).a.a(this.a, ((jdf)jdy0));
        }
        return (jdy0 instanceof jfd) ? jfc.a(jdj.a(((jfd)jdy0), this.a), ((jfd)jdy0).b, this.a) : null;
    }
}

