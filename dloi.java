import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class dloi implements dlok {
    private static final Set a;
    private static final bboh b;
    private final dqlo c;
    private final dqmp d;
    private final dqmj e;

    static {
        dloi.a = ibqg.c(new gtqj[]{gtqj.b, gtqj.f, gtqj.g, gtqj.d});
        dloi.b = bboh.b("Pay", bbcu.cZ);
    }

    public dloi(dqlo dqlo0, dqmp dqmp0, dqmj dqmj0) {
        this.c = dqlo0;
        this.d = dqmp0;
        this.e = dqmj0;
    }

    @Override  // dlok
    public final List a() {
        List list0 = this.c.a();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            gtkg gtkg0 = (gtkg)object0;
            ibuq.c(gtkg0);
            gtkb gtkb0 = gtkg0.v == null ? gtkb.b : gtkg0.v;
            if((gtls.b(gtkb0.e) == null ? gtls.h : gtls.b(gtkb0.e)) == gtls.b) {
                gtkb gtkb1 = gtkg0.v;
                if((gtkb1 == null ? gtkb.b : gtkb1).g) {
                    if(gtkb1 == null) {
                        gtkb1 = gtkb.b;
                    }
                    if((gtlq.b(gtkb1.c) == null ? gtlq.f : gtlq.b(gtkb1.c)) == gtlq.c) {
                        gtqj gtqj0 = gtqj.b(gtkg0.g) == null ? gtqj.i : gtqj.b(gtkg0.g);
                        if(dloi.a.contains(gtqj0)) {
                            arrayList0.add(object0);
                        }
                    }
                }
            }
        }
        List list1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object1: arrayList0) {
            ibuq.c(((gtkg)object1));
            asca asca0 = asbz.a(((ProtoLiteMessage)asby.a).v_newBuilder());
            String s = ((gtkg)object1).e;
            ibuq.e(s, "getDisplayCardId(...)");
            asca0.b(s);
            ascz ascz0 = ascy.a(((ProtoLiteMessage)ascx.a).v_newBuilder());
            ascz0.b(ascs.b);
            asca0.c(ascz0.a());
            list1.add(asca0.a());
        }
        return list1;
    }

    @Override  // dlok
    public final List b(long v, List list0) {
        fswz fswz0;
        if(v <= 0L) {
            throw new IllegalArgumentException(a.u(v, "targetAndroidId is invalid: "));
        }
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                asby asby0 = (asby)object0;
                ascx ascx0 = asby0.c == 106 ? ((ascx)asby0.d) : ascx.a;
                if((ascs.b(ascx0.e) == null ? ascs.a : ascs.b(ascx0.e)) != ascs.b) {
                    throw new IllegalArgumentException("Invalid data type");
                }
            }
        }
        if(list0.isEmpty()) {
            return ibps.a;
        }
        String s = dqjj.L("DEVICE_TO_DEVICE");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object1: list0) {
            arrayList0.add(((asby)object1).e);
        }
        Set set0 = ibpo.ay(arrayList0);
        List list1 = this.c.a();
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: list1) {
            if(set0.contains(((gtkg)object2).e)) {
                arrayList1.add(object2);
            }
        }
        List list2 = new ArrayList();
        for(Object object3: arrayList1) {
            gtkg gtkg0 = (gtkg)object3;
            ibuq.c(gtkg0);
            try {
                this.d.b(s, gtkg0, 4, 3, 6, Long.valueOf(v));
                fswz0 = null;
            }
            catch(dpuk dpuk0) {
                ((ggtj)((ggtj)dloi.b.j()).s(dpuk0)).A("Failed to move card with ID %s", gtkg0.f);
                fswz0 = fswz.d;
            }
            catch(IOException iOException0) {
                ((ggtj)((ggtj)dloi.b.j()).s(iOException0)).A("Server error while moving card %s", gtkg0.f);
                fswz0 = fswz.c;
            }
            catch(earn earn0) {
                ((ggtj)((ggtj)dloi.b.j()).s(earn0)).A("Error fetching storage key while moving card %s", gtkg0.f);
                fswz0 = fswz.i;
            }
            catch(dqll dqll0) {
                ((ggtj)((ggtj)dloi.b.j()).s(dqll0)).A("Unexpected DB state while moving card %s", gtkg0.f);
                fswz0 = fswz.h;
            }
            catch(dqlk dqlk0) {
                ((ggtj)((ggtj)dloi.b.j()).s(dqlk0)).A("Conflicting initial DB state while moving card %s", gtkg0.f);
                fswz0 = fswz.h;
            }
            catch(dmhl dmhl0) {
                ((ggtj)((ggtj)dloi.b.j()).s(dmhl0)).A("Generic sqlite error while moving card %s", gtkg0.f);
                fswz0 = fswz.h;
            }
            if(fswz0 != null) {
                list2.add(fswz0);
            }
        }
        if(hwhl.a.b().d() && arrayList1.size() - list2.size() > 0) {
            this.e.b();
        }
        return list2;
    }

    @Override  // dlok
    public final void c(List list0) {
    }

    @Override  // dlok
    public final void d(List list0) {
    }
}

