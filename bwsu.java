import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;

public abstract class bwsu {
    private final bwry a;
    private final bwts b;
    private final bwsx c;
    private final boolean d;

    public bwsu(bwry bwry0, bwts bwts0, bwsx bwsx0, boolean z) {
        this.a = bwry0;
        this.b = bwts0;
        this.c = bwsx0;
        this.d = z;
    }

    protected abstract Object a();

    protected abstract void b(Status arg1, Object arg2);

    protected void c(String s, glrs glrs0, Object object0) {
        try {
            this.b(new Status(bwsz.b(glrs0), s), object0);
        }
        catch(RemoteException remoteException0) {
            bwne.w(remoteException0, "Client died during %s", new Object[]{this.a.a()});
            if(glrs0 == glrs.a) {
                glrs0 = glrs.f;
            }
        }
        this.a.b(this.b, glrs0, this.d);
    }

    public final Pair e(bwsy bwsy0) {
        glrs glrs0;
        String s;
        try {
            s = bwsy0.getMessage() == null ? "(no message)" : bwsy0.getMessage();
            glrs0 = bwsy0.a;
            Thing thing0 = bwsy0.b;
            if(thing0 != null) {
                s = a.r(thing0.d, s, " The invalid indexable url is: ");
            }
            goqs.b(String.format("Invalid Indexable detected: %s", s));
            this.c.c(this.a.a, this.a.c, glrs0, bwsy0.getMessage(), thing0, null);
            return new Pair(s, glrs0);
        }
        catch(Exception unused_ex) {
            huax.h();
            bwne.x();
            return new Pair(s, glrs0);
        }
    }

    public final void f() {
        glrs glrs1;
        Object object1;
        Object object0;
        String s = "(no message)";
        String s1 = this.a.a();
        glrs glrs0 = glrs.a;
        String s2 = this.a.a;
        bwne.d("Handling %s request from %s", s1, s2);
        try {
            object0 = null;
            object1 = null;
            object1 = this.a();
            goto label_17;
        }
        catch(bwsy bwsy0) {
            goto label_21;
        }
        catch(bwrw bwrw0) {
            goto label_28;
        }
        catch(bwtf bwtf0) {
            goto label_47;
        }
        catch(bwta bwta0) {
            goto label_54;
            try {
            label_17:
                bwne.d("%s from %s finished successfully", s1, s2);
                goto label_71;
            }
            catch(bwsy bwsy0) {
            }
            catch(bwrw bwrw0) {
                goto label_27;
            }
            catch(bwtf bwtf0) {
                goto label_46;
            }
            catch(bwta bwta0) {
                goto label_53;
            }
            catch(Exception exception0) {
                goto label_67;
            }
            object0 = object1;
        label_21:
            bwne.w(bwsy0, "%s from %s failed", new Object[]{s1, s2});
            Pair pair0 = this.e(bwsy0);
            String s3 = (String)pair0.first;
            glrs0 = (glrs)pair0.second;
            goto label_63;
        label_27:
            object0 = object1;
        label_28:
            bwne.w(bwrw0, "%s from %s failed", new Object[]{s1, s2});
            String s4 = bwrw0.getMessage();
            if(s4 != null) {
                s = s4;
            }
            try {
                glrs1 = bwrw0.a;
                ActionImpl actionImpl0 = bwrw0.c;
                if(actionImpl0 != null) {
                    s = a.r(actionImpl0.c, s, " The invalid action url is: ");
                }
                goqs.b(String.format("Invalid Action detected: %s", s));
                this.c.c(this.a.a, this.a.c, glrs1, bwrw0.getMessage(), null, actionImpl0);
            }
            catch(Exception unused_ex) {
                huax.h();
                bwne.x();
            }
            Pair pair1 = new Pair(s, glrs1);
            s3 = (String)pair1.first;
            glrs0 = (glrs)pair1.second;
            goto label_63;
        label_46:
            object0 = object1;
        label_47:
            bwne.w(bwtf0, "%s from %s failed", new Object[]{s1, s2});
            glrs0 = glrs.d;
            object1 = object0;
            object0 = bwtf0.getMessage();
            goto label_71;
        label_53:
            object0 = object1;
        label_54:
            bwne.w(bwta0, "%s from %s failed", new Object[]{s1, s2});
            String s5 = bwta0.getMessage();
            if(s5 != null) {
                s = s5;
            }
            goqs.b(String.format("Native Index error detected: %s", s));
            this.c.c(this.a.a, this.a.c, bwta0.a, bwta0.getMessage(), null, null);
            Pair pair2 = new Pair(s, bwta0.a);
            s3 = (String)pair2.first;
            glrs0 = (glrs)pair2.second;
        label_63:
            object1 = object0;
            object0 = s3;
        }
        catch(Exception exception0) {
        label_67:
            bwne.w(exception0, "%s from %s failed", new Object[]{s1, s2});
            glrs0 = glrs.e;
            huax.h();
            bwne.x();
        }
    label_71:
        this.c(((String)object0), glrs0, object1);
    }
}

