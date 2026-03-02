import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class cow implements ibth {
    public final coz a;
    public final gui b;

    public cow(coz coz0, gui gui0) {
        this.a = coz0;
        this.b = gui0;
    }

    @Override  // ibth
    public final Object a() {
        hqv hqv0;
        hqy hqy0;
        Object object0;
        float f = ((Number)this.b.a()).floatValue();
        List list0 = this.a.a;
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            object0 = listIterator0.previous();
            if(!(((float)((cpn)object0).a) <= f)) {
                continue;
            }
            goto label_8;
        }
        object0 = null;
    label_8:
        cpn cpn0 = (cpn)object0;
        if(cpn0 == null) {
            cpn0 = (cpn)ibpo.R(list0);
        }
        float f1 = (f - ((float)cpn0.a)) / ((float)cpn0.b);
        float f2 = 1.0f;
        int v = 0;
        if(cpn0.c != 0) {
            int v1;
            for(v1 = 0; (f1 > 1.0f); ++v1) {
                --f1;
            }
            if(cpn0.e == 2 && v1 % 2 != 0) {
                f1 = 1.0f - f1;
            }
        }
        ibuq.d(cpn0.d, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderPath");
        List list1 = ((cpk)cpn0.d).b;
        int v2 = 0;
        Iterator iterator0 = list1.iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                v2 = -1;
                break;
            }
            Object object1 = iterator0.next();
            if(((cot)object1).a >= f1) {
                break;
            }
            ++v2;
        }
        int v3 = ibwt.g(v2 - 1, 0);
        cie cie0 = ((cot)list1.get(v3 + 1)).c;
        float f3 = (f1 - ((cot)list1.get(v3)).a) / (((cot)list1.get(v3 + 1)).a - ((cot)list1.get(v3)).a);
        if((f3 < 0.0f)) {
            f3 = 0.0f;
        }
        if(f3 <= 1.0f) {
            f2 = f3;
        }
        float f4 = cie0.a(f2);
        List list2 = (List)((cot)list1.get(v3)).b;
        List list3 = (List)((cot)list1.get(v3 + 1)).b;
        int v4 = Math.min(list2.size(), list3.size());
        Object object2 = new ArrayList(v4);
        while(v < v4) {
            Object object3 = list2.get(v);
            hre hre0 = (hre)list3.get(v);
            hre hre1 = (hre)object3;
            if((hre1 instanceof hqy)) {
                if(!(hre0 instanceof hqy)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hqy(jma.b(((hqy)hre1).a, ((hqy)hre0).a, f4), jma.b(((hqy)hre1).b, ((hqy)hre0).b, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqp)) {
                if(!(hre0 instanceof hqp)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hqp(jma.b(((hqp)hre1).a, ((hqp)hre0).a, f4), jma.b(((hqp)hre1).b, ((hqp)hre0).b, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqx)) {
                if(!(hre0 instanceof hqx)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hqx(jma.b(((hqx)hre1).a, ((hqx)hre0).a, f4), jma.b(((hqx)hre1).b, ((hqx)hre0).b, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqo)) {
                if(!(hre0 instanceof hqo)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hqo(jma.b(((hqo)hre1).a, ((hqo)hre0).a, f4), jma.b(((hqo)hre1).b, ((hqo)hre0).b, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqw)) {
                if(!(hre0 instanceof hqw)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hqw(jma.b(((hqw)hre1).a, ((hqw)hre0).a, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqn)) {
                if(!(hre0 instanceof hqn)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hqn(jma.b(((hqn)hre1).a, ((hqn)hre0).a, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hrc)) {
                if(!(hre0 instanceof hrc)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hrc(jma.b(((hrc)hre1).a, ((hrc)hre0).a, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hrd)) {
                if(!(hre0 instanceof hrd)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hrd(jma.b(((hrd)hre1).a, ((hrd)hre0).a, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqv)) {
                if(!(hre0 instanceof hqv)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqv0 = new hqv(jma.b(((hqv)hre1).a, ((hqv)hre0).a, f4), jma.b(((hqv)hre1).b, ((hqv)hre0).b, f4), jma.b(((hqv)hre1).c, ((hqv)hre0).c, f4), jma.b(((hqv)hre1).d, ((hqv)hre0).d, f4), jma.b(((hqv)hre1).e, ((hqv)hre0).e, f4), jma.b(((hqv)hre1).f, ((hqv)hre0).f, f4));
                hqy0 = hqv0;
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqm)) {
                if(!(hre0 instanceof hqm)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqv0 = new hqm(jma.b(((hqm)hre1).a, ((hqm)hre0).a, f4), jma.b(((hqm)hre1).b, ((hqm)hre0).b, f4), jma.b(((hqm)hre1).c, ((hqm)hre0).c, f4), jma.b(((hqm)hre1).d, ((hqm)hre0).d, f4), jma.b(((hqm)hre1).e, ((hqm)hre0).e, f4), jma.b(((hqm)hre1).f, ((hqm)hre0).f, f4));
                hqy0 = hqv0;
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hra)) {
                if(!(hre0 instanceof hra)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hra(jma.b(((hra)hre1).a, ((hra)hre0).a, f4), jma.b(((hra)hre1).b, ((hra)hre0).b, f4), jma.b(((hra)hre1).c, ((hra)hre0).c, f4), jma.b(((hra)hre1).d, ((hra)hre0).d, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqr)) {
                if(!(hre0 instanceof hqr)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hqr(jma.b(((hqr)hre1).a, ((hqr)hre0).a, f4), jma.b(((hqr)hre1).b, ((hqr)hre0).b, f4), jma.b(((hqr)hre1).c, ((hqr)hre0).c, f4), jma.b(((hqr)hre1).d, ((hqr)hre0).d, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqz)) {
                if(!(hre0 instanceof hqz)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hqz(jma.b(((hqz)hre1).a, ((hqz)hre0).a, f4), jma.b(((hqz)hre1).b, ((hqz)hre0).b, f4), jma.b(((hqz)hre1).c, ((hqz)hre0).c, f4), jma.b(((hqz)hre1).d, ((hqz)hre0).d, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqq)) {
                if(!(hre0 instanceof hqq)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hqq(jma.b(((hqq)hre1).a, ((hqq)hre0).a, f4), jma.b(((hqq)hre1).b, ((hqq)hre0).b, f4), jma.b(((hqq)hre1).c, ((hqq)hre0).c, f4), jma.b(((hqq)hre1).d, ((hqq)hre0).d, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hrb)) {
                if(!(hre0 instanceof hrb)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hrb(jma.b(((hrb)hre1).a, ((hrb)hre0).a, f4), jma.b(((hrb)hre1).b, ((hrb)hre0).b, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqs)) {
                if(!(hre0 instanceof hqs)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqy0 = new hqs(jma.b(((hqs)hre1).a, ((hqs)hre0).a, f4), jma.b(((hqs)hre1).b, ((hqs)hre0).b, f4));
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqu)) {
                if(!(hre0 instanceof hqu)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqv0 = new hqu(jma.b(((hqu)hre1).a, ((hqu)hre0).a, f4), jma.b(((hqu)hre1).b, ((hqu)hre0).b, f4), jma.b(((hqu)hre1).c, ((hqu)hre0).c, f4), ((hqu)hre1).d, ((hqu)hre1).e, jma.b(((hqu)hre1).f, ((hqu)hre0).f, f4), jma.b(((hqu)hre1).g, ((hqu)hre0).g, f4));
                hqy0 = hqv0;
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            if((hre1 instanceof hqk)) {
                if(!(hre0 instanceof hqk)) {
                    throw new IllegalArgumentException("start and stop path nodes have different types");
                }
                hqv0 = new hqk(jma.b(((hqk)hre1).a, ((hqk)hre0).a, f4), jma.b(((hqk)hre1).b, ((hqk)hre0).b, f4), jma.b(((hqk)hre1).c, ((hqk)hre0).c, f4), ((hqk)hre1).d, ((hqk)hre1).e, jma.b(((hqk)hre1).f, ((hqk)hre0).f, f4), jma.b(((hqk)hre1).g, ((hqk)hre0).g, f4));
                hqy0 = hqv0;
                ((Collection)object2).add(hqy0);
                ++v;
                continue;
            }
            hqy0 = hql.a;
            if(!ibuq.m(hre1, hqy0)) {
                throw new ibnq();
            }
            ((Collection)object2).add(hqy0);
            ++v;
            continue;
        }
        return object2;
    }
}

