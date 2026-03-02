import android.content.Context;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.model.SourcedContactPerson;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class acbw extends cjtm {
    private final acbo A;
    private static final bboh a;
    private final baqr b;
    private final acbk c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Map i;
    private final String j;
    private final String n;
    private final List o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final byte[] t;
    private final int u;
    private final int v;
    private final String w;
    private final String x;
    private final int y;
    private final String z;

    static {
        acbw.a = bboh.b("AppInvite", bbcu.aK);
    }

    public acbw(baqr baqr0, acbk acbk0, String s, String s1, String s2, String s3, String s4, Map map0, String s5, String s6, List list0, String s7, String s8, String s9, String s10, byte[] arr_b, int v, int v1, String s11, String s12, int v2, String s13, acbo acbo0) {
        super(106, "AppInviteCreateInvitations");
        this.b = baqr0;
        this.c = acbk0;
        this.d = s;
        this.e = s1;
        this.f = s2;
        this.g = s3;
        this.h = s4;
        this.i = map0;
        this.j = s5;
        this.n = s6;
        this.p = s7;
        this.q = s8;
        this.r = s9;
        this.s = s10;
        this.t = arr_b;
        this.u = v;
        this.v = v1;
        this.w = s11;
        this.x = s12;
        this.y = v2;
        this.z = s13;
        this.A = acbo0;
        this.o = new ArrayList();
        for(Object object0: list0) {
            SourcedContactPerson sourcedContactPerson0 = new SourcedContactPerson(((ContactPerson)object0), 0);
            this.o.add(sourcedContactPerson0);
        }
    }

    @Override  // cjtm
    public final void f(Context context0) {
        Status status1;
        ArrayList arrayList1;
        ArrayList arrayList0;
        Status status0;
        if(hour.f()) {
            ((ggtj)acbw.a.i()).x("AppInviteCreateInvitationsOperationDisabled");
            acbo acbo0 = this.A;
            if(acbo0 != null) {
                acbo0.a(Status.f, null);
            }
        }
        else {
            try {
                hijm hijm0 = this.c.b(this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z);
                if(hijm0 != null && !hijm0.b.isEmpty()) {
                    status0 = Status.b;
                    arrayList0 = new ArrayList();
                    try {
                        Iterator iterator0 = hijm0.b.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                break;
                            }
                            Object object0 = iterator0.next();
                            hika hika0 = (hika)object0;
                            if(((hika0.c == null ? hikg.a : hika0.c).b & 1) != 0) {
                                arrayList0.add((hika0.c == null ? hikg.a : hika0.c).c);
                            }
                        }
                    }
                    catch(acbd acbd0) {
                        arrayList1 = arrayList0;
                        goto label_27;
                    }
                    catch(acax unused_ex) {
                        arrayList1 = arrayList0;
                        goto label_31;
                    }
                }
                else {
                    status0 = Status.d;
                    arrayList0 = null;
                }
                goto label_34;
            }
            catch(acbd acbd0) {
                arrayList1 = null;
            label_27:
                if(acbd0.b()) {
                    status1 = new Status(4);
                }
                else {
                    goto label_31;
                }
                goto label_32;
            }
            catch(acax unused_ex) {
                arrayList1 = null;
            }
        label_31:
            status1 = new Status(8);
        label_32:
            arrayList0 = arrayList1;
            status0 = status1;
        label_34:
            acbo acbo1 = this.A;
            if(acbo1 != null) {
                acbo1.a(status0, arrayList0);
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        acbo acbo0 = this.A;
        if(acbo0 != null) {
            acbo0.a(status0, null);
        }
    }
}

