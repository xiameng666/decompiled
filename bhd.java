import j..util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class bhd implements bav {
    public final Deque a;
    public bfx b;
    public bgw c;
    public final List d;
    public boolean e;
    final bbv f;

    public bhd(bbv bbv0) {
        this.a = new ArrayDeque();
        this.e = false;
        boj.b();
        this.f = bbv0;
        this.d = new ArrayList();
    }

    public final void a() {
        boj.b();
        bcf bcf0 = new bcf("Camera is closed.", null);
        Deque deque0 = this.a;
        Iterator iterator0 = deque0.iterator();
        if(!iterator0.hasNext()) {
            deque0.clear();
            ArrayList arrayList0 = new ArrayList(this.d);
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                bgw bgw0 = (bgw)arrayList0.get(v1);
                boj.b();
                if(!bgw0.b.isDone()) {
                    bgw0.b(bcf0);
                    bgw.f();
                }
            }
            return;
        }
        Object object0 = iterator0.next();
        bhe bhe0 = (bhe)object0;
        throw null;
    }

    // Detected as a lambda impl.
    public final void b() {
        int v1;
        bhe bhe1;
        bjl bjl1;
        boj.b();
        if(!this.c() && !this.e) {
            bfx bfx0 = this.b;
            boj.b();
            if(bfx0.d.a() != 0) {
                bhe bhe0 = (bhe)this.a.poll();
                if(bhe0 != null) {
                    bgw bgw0 = new bgw(bhe0, this);
                    boolean z = true;
                    kay.c(((boolean)(this.c() ^ 1)));
                    this.c = bgw0;
                    bgw0.a().hB(new bha(this), bol.a());
                    this.d.add(bgw0);
                    boj.b();
                    bhb bhb0 = new bhb(this, bgw0);
                    Executor executor0 = bol.a();
                    bgw0.b.hB(bhb0, executor0);
                    bfx bfx1 = this.b;
                    gmcd gmcd0 = bgw0.a();
                    boj.b();
                    baq baq0 = new baq(Arrays.asList(new bjp[]{new bjp()}));
                    bjl bjl0 = (bjl)Objects.requireNonNull(((bjl)blq.c(bfx1.b, bkk.c, baq0)));
                    int v = bfx.a;
                    bfx.a = v + 1;
                    ArrayList arrayList0 = new ArrayList();
                    String s = String.valueOf(bjl0.hashCode());
                    for(Object object0: ((List)Objects.requireNonNull(bjl0.a()))) {
                        bjm bjm0 = new bjm();
                        bjm0.b = bfx1.c.f;
                        bjm0.f(bfx1.c.e);
                        bjm0.c(bhe0.j());
                        bfp bfp0 = bfx1.e;
                        bjm0.g(bfp0.a());
                        List list0 = bfp0.h;
                        if(list0.size() > 1) {
                            bka bka0 = bfp0.d;
                            if(bka0 != null) {
                                bjm0.g(bka0);
                            }
                        }
                        bka bka1 = bfp0.e;
                        if(bka1 == null) {
                            z = 0;
                        }
                        if(z) {
                            bjm0.g(((bka)Objects.requireNonNull(bka1)));
                        }
                        bjm0.c = z;
                        if(!brh.b(bfp0.g) && bfp0.g != 0x20) {
                            bjl1 = bjl0;
                            bhe1 = bhe0;
                        }
                        else {
                            if(bra.a()) {
                                Integer integer0 = bhe0.c();
                                bjm0.e(bjo.a, integer0);
                            }
                            bjr bjr0 = bjo.b;
                            bjl1 = bjl0;
                            bhe1 = bhe0;
                            if(bhe0.g() == null || !bok.m(bhe0.e(), bfp0.f)) {
                                v1 = bhe1.b();
                            }
                            else if(bhe1.a() == 0) {
                                v1 = 100;
                            }
                            else {
                                v1 = 0x5F;
                            }
                            bjm0.e(bjr0, Integer.valueOf(v1));
                        }
                        bjm0.f(((bjp)object0).a.e);
                        bjm0.h(s, Integer.valueOf(0));
                        bjm0.e.c("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(v));
                        bjm0.d(bfp0.a);
                        z = true;
                        if(list0.size() > 1) {
                            bhl bhl0 = bfp0.b;
                            if(bhl0 != null) {
                                bjm0.d(bhl0);
                            }
                        }
                        arrayList0.add(bjm0.b());
                        bfx1 = bfx1;
                        bjl0 = bjl1;
                        bhe0 = bhe1;
                    }
                    kau kau0 = new kau(new bfd(arrayList0, bgw0), new bgt(bjl0, bhe0, bgw0, gmcd0, v));
                    bfd bfd0 = (bfd)Objects.requireNonNull(((bfd)kau0.a));
                    bgt bgt0 = (bgt)Objects.requireNonNull(((bgt)kau0.b));
                    bfx bfx2 = this.b;
                    boj.b();
                    bfx2.e.l.accept(bgt0);
                    boj.b();
                    bce bce0 = this.f.a;
                    AtomicReference atomicReference0 = bce0.b;
                    synchronized(atomicReference0) {
                        if(atomicReference0.get() == null) {
                            atomicReference0.set(Integer.valueOf(bce0.a()));
                        }
                    }
                    boj.b();
                    gmcd gmcd1 = bpt.f(this.f.a.B().f(bfd0.a, this.f.a.a, this.f.a.c), new bbu(), bol.a());
                    bpt.j(gmcd1, new bhc(this, bfd0), bow.a());
                    boj.b();
                    if(bgw0.g != null) {
                        z = 0;
                    }
                    kay.d(z, "CaptureRequestFuture can only be set once.");
                    bgw0.g = gmcd1;
                }
            }
        }
    }

    public final boolean c() {
        return this.c != null;
    }

    @Override  // bav
    public final void k(bcn bcn0) {
        bow.a().execute(() -> {
            int v1;
            bhe bhe1;
            bjl bjl1;
            boj.b();
            if(!this.c() && !this.e) {
                bfx bfx0 = this.b;
                boj.b();
                if(bfx0.d.a() != 0) {
                    bhe bhe0 = (bhe)this.a.poll();
                    if(bhe0 != null) {
                        bgw bgw0 = new bgw(bhe0, this);
                        boolean z = true;
                        kay.c(((boolean)(this.c() ^ 1)));
                        this.c = bgw0;
                        bgw0.a().hB(new bha(this), bol.a());
                        this.d.add(bgw0);
                        boj.b();
                        bhb bhb0 = new bhb(this, bgw0);
                        Executor executor0 = bol.a();
                        bgw0.b.hB(bhb0, executor0);
                        bfx bfx1 = this.b;
                        gmcd gmcd0 = bgw0.a();
                        boj.b();
                        baq baq0 = new baq(Arrays.asList(new bjp[]{new bjp()}));
                        bjl bjl0 = (bjl)Objects.requireNonNull(((bjl)blq.c(bfx1.b, bkk.c, baq0)));
                        int v = bfx.a;
                        bfx.a = v + 1;
                        ArrayList arrayList0 = new ArrayList();
                        String s = String.valueOf(bjl0.hashCode());
                        for(Object object0: ((List)Objects.requireNonNull(bjl0.a()))) {
                            bjm bjm0 = new bjm();
                            bjm0.b = bfx1.c.f;
                            bjm0.f(bfx1.c.e);
                            bjm0.c(bhe0.j());
                            bfp bfp0 = bfx1.e;
                            bjm0.g(bfp0.a());
                            List list0 = bfp0.h;
                            if(list0.size() > 1) {
                                bka bka0 = bfp0.d;
                                if(bka0 != null) {
                                    bjm0.g(bka0);
                                }
                            }
                            bka bka1 = bfp0.e;
                            if(bka1 == null) {
                                z = 0;
                            }
                            if(z) {
                                bjm0.g(((bka)Objects.requireNonNull(bka1)));
                            }
                            bjm0.c = z;
                            if(!brh.b(bfp0.g) && bfp0.g != 0x20) {
                                bjl1 = bjl0;
                                bhe1 = bhe0;
                            }
                            else {
                                if(bra.a()) {
                                    Integer integer0 = bhe0.c();
                                    bjm0.e(bjo.a, integer0);
                                }
                                bjr bjr0 = bjo.b;
                                bjl1 = bjl0;
                                bhe1 = bhe0;
                                if(bhe0.g() == null || !bok.m(bhe0.e(), bfp0.f)) {
                                    v1 = bhe1.b();
                                }
                                else if(bhe1.a() == 0) {
                                    v1 = 100;
                                }
                                else {
                                    v1 = 0x5F;
                                }
                                bjm0.e(bjr0, Integer.valueOf(v1));
                            }
                            bjm0.f(((bjp)object0).a.e);
                            bjm0.h(s, Integer.valueOf(0));
                            bjm0.e.c("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(v));
                            bjm0.d(bfp0.a);
                            z = true;
                            if(list0.size() > 1) {
                                bhl bhl0 = bfp0.b;
                                if(bhl0 != null) {
                                    bjm0.d(bhl0);
                                }
                            }
                            arrayList0.add(bjm0.b());
                            bfx1 = bfx1;
                            bjl0 = bjl1;
                            bhe0 = bhe1;
                        }
                        kau kau0 = new kau(new bfd(arrayList0, bgw0), new bgt(bjl0, bhe0, bgw0, gmcd0, v));
                        bfd bfd0 = (bfd)Objects.requireNonNull(((bfd)kau0.a));
                        bgt bgt0 = (bgt)Objects.requireNonNull(((bgt)kau0.b));
                        bfx bfx2 = this.b;
                        boj.b();
                        bfx2.e.l.accept(bgt0);
                        boj.b();
                        bce bce0 = this.f.a;
                        AtomicReference atomicReference0 = bce0.b;
                        synchronized(atomicReference0) {
                            if(atomicReference0.get() == null) {
                                atomicReference0.set(Integer.valueOf(bce0.a()));
                            }
                        }
                        boj.b();
                        gmcd gmcd1 = bpt.f(this.f.a.B().f(bfd0.a, this.f.a.a, this.f.a.c), new bbu(), bol.a());
                        bpt.j(gmcd1, new bhc(this, bfd0), bow.a());
                        boj.b();
                        if(bgw0.g != null) {
                            z = 0;
                        }
                        kay.d(z, "CaptureRequestFuture can only be set once.");
                        bgw0.g = gmcd1;
                    }
                }
            }
        });
    }
}

