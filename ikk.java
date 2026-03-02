import android.os.Bundle;
import android.view.autofill.AutofillId;
import java.util.List;

final class ikk extends ibur implements ibth {
    final ili a;

    public ikk(ili ili0) {
        this.a = ili0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        Object object2;
        int v4;
        Boolean boolean4;
        ihy ihy1;
        ise ise0;
        Object object1;
        int v5;
        ili ili0 = this.a;
        hgo hgo0 = ili0.o;
        bxt bxt0 = hgo0.i;
        Boolean boolean0 = Boolean.valueOf(false);
        if(bxt0.b != 0) {
            hgo0.e = System.currentTimeMillis();
            int[] arr_v = bxt0.a;
            int v = bxt0.b;
            int v1 = 0;
            while(v1 < v) {
                ili ili1 = hgo0.a;
                ify ify0 = (ify)ili1.aa.a(arr_v[v1]);
                if(ify0 != null && hgo0.n()) {
                    ity ity0 = ify0.u();
                    Boolean boolean1 = ity0 == null ? null : ((Boolean)itz.a(ity0, iuz.C));
                    if(hgo0.l == 1 && ibuq.m(boolean1, Boolean.valueOf(true))) {
                        itj itj0 = (itj)itz.a(ity0, itw.l);
                        if(itj0 != null) {
                            ibts ibts0 = (ibts)itj0.b;
                            if(ibts0 != null) {
                                Boolean boolean2 = (Boolean)ibts0.a(boolean0);
                            }
                        }
                    }
                    else if(hgo0.l == 2 && ibuq.m(boolean1, boolean0)) {
                        itj itj1 = (itj)itz.a(ity0, itw.l);
                        if(itj1 != null) {
                            ibts ibts1 = (ibts)itj1.b;
                            if(ibts1 != null) {
                                Boolean boolean3 = (Boolean)ibts1.a(Boolean.valueOf(true));
                            }
                        }
                    }
                    ify ify1 = ify0.n();
                    int v2 = Math.max(0, (ify1 == null ? -1 : ify1.y().indexOf(ify0)));
                    int v3 = ify0.c;
                    if(hgo0.n()) {
                        isc isc0 = hgo0.h;
                        isb isb0 = isd.a(ili1);
                        ify ify2 = ify0.n();
                        if(ify2 == null) {
                        label_47:
                            v5 = v;
                            object1 = isb0.a;
                        }
                        else {
                            ibuq.c(isc0);
                            v5 = v;
                            Object object0 = isc0.a(((long)ify2.c));
                            if(object0 == null) {
                                boolean4 = boolean0;
                                goto label_98;
                            }
                            else {
                                object1 = object0;
                                goto label_49;
                            }
                            goto label_47;
                        }
                    label_49:
                        ibuq.c(isc0);
                        boolean4 = boolean0;
                        ise0 = isc0.b(((AutofillId)object1), ((long)ify0.c));
                        ity ity1 = ify0.u();
                        if(ity1 == null || !ity1.f(iuz.J)) {
                            Bundle bundle0 = ise0.a();
                            v4 = v5;
                            if(bundle0 != null) {
                                bundle0.putLong("android.view.contentcapture.EventTimestamp", hgo0.e);
                                bundle0.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", v2);
                            }
                            if(ity1 != null) {
                                String s = (String)itz.a(ity1, iuz.y);
                                if(s != null) {
                                    ise0.f(ify0.c, s);
                                }
                                if(((Boolean)itz.a(ity1, iuz.m)) != null) {
                                    ise0.b("android.widget.ViewGroup");
                                }
                                List list0 = (List)itz.a(ity1, iuz.A);
                                if(list0 != null) {
                                    ise0.b("android.widget.TextView");
                                    ise0.d(jlz.c(list0, "\n", null, null, null, 62));
                                }
                                iwj iwj0 = (iwj)itz.a(ity1, iuz.E);
                                if(iwj0 != null) {
                                    ise0.b("android.widget.EditText");
                                    ise0.d(iwj0);
                                }
                                List list1 = (List)itz.a(ity1, iuz.a);
                                if(list1 != null) {
                                    ise0.c(jlz.c(list1, "\n", null, null, null, 62));
                                }
                                its its0 = (its)itz.a(ity1, iuz.x);
                                if(its0 != null) {
                                    String s1 = iql.d(its0.a);
                                    if(s1 != null) {
                                        ise0.b(s1);
                                    }
                                }
                                jbe jbe0 = iql.c(ity1);
                                if(jbe0 != null) {
                                    float f = jbe0.a.g.dX();
                                    float f1 = jbe0.a.g.dY();
                                    ise0.g(jlp.a(jbe0.a.b.g()) * f * f1);
                                }
                            }
                            ije ije0 = ify0.t();
                            if(ije0 != null) {
                                ihy ihy0 = ien.e(ije0, 8);
                                if(ihy0 != null) {
                                    ihy1 = ihy0;
                                    goto label_93;
                                }
                            }
                            ihy1 = ify0.r();
                        label_93:
                            if(!ihy1.t()) {
                                ihy1 = null;
                            }
                            hka hka0 = ihy1 == null ? hka.a : ify0.l(ihy1);
                            ise0.e(((int)hka0.b), ((int)hka0.c), ((int)(hka0.d - hka0.b)), ((int)(hka0.e - hka0.c)));
                            goto label_100;
                        }
                    label_98:
                        v4 = v5;
                    }
                    else {
                        boolean4 = boolean0;
                        v4 = v;
                    }
                    ise0 = null;
                label_100:
                    hgo0.g(v3, ise0);
                }
                else {
                    boolean4 = boolean0;
                    v4 = v;
                }
                ++v1;
                v = v4;
                boolean0 = boolean4;
            }
            bxt0.d();
        }
        bxt bxt1 = hgo0.j;
        int v6 = bxt1.b;
        if(v6 != 0) {
            int[] arr_v1 = bxt1.a;
            int v7 = 0;
            while(v7 < v6) {
                int v8 = arr_v1[v7];
                ify ify3 = (ify)hgo0.a.aa.a(v8);
                if(ify3 != null) {
                    ity ity2 = ify3.u();
                    if(ity2 != null) {
                        List list2 = (List)itz.a(ity2, iuz.A);
                        if(list2 != null) {
                            object2 = (iwj)ibpo.T(list2);
                            goto label_125;
                        }
                    }
                }
                object2 = null;
            label_125:
                hgo0.l(v8, String.valueOf(object2));
                ++v7;
            }
            bxt1.d();
        }
        hgo0.j();
        ili0.Q = false;
        return ibom.a;
    }
}

