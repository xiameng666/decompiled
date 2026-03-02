import java.util.List;

public final class cpm implements hsp {
    public gui a;
    public gui b;
    public gui c;
    public gui d;
    public gui e;
    public gui f;
    public gui g;
    public gui h;
    public gui i;
    public gui j;
    public gui k;
    public gui l;
    public gui m;
    public gui n;
    public gui o;
    public gui p;

    @Override  // hsp
    public final Object a(htv htv0, Object object0) {
        if((htv0 instanceof htk)) {
            gui gui0 = this.a;
            return gui0 == null ? object0 : ((Number)gui0.a()).floatValue();
        }
        if((htv0 instanceof hti)) {
            gui gui1 = this.b;
            return gui1 == null ? object0 : ((Number)gui1.a()).floatValue();
        }
        if((htv0 instanceof htj)) {
            gui gui2 = this.c;
            return gui2 == null ? object0 : ((Number)gui2.a()).floatValue();
        }
        if((htv0 instanceof htl)) {
            gui gui3 = this.d;
            return gui3 == null ? object0 : ((Number)gui3.a()).floatValue();
        }
        if((htv0 instanceof htm)) {
            gui gui4 = this.e;
            return gui4 == null ? object0 : ((Number)gui4.a()).floatValue();
        }
        if((htv0 instanceof htq)) {
            gui gui5 = this.f;
            return gui5 == null ? object0 : ((Number)gui5.a()).floatValue();
        }
        if((htv0 instanceof htr)) {
            gui gui6 = this.g;
            return gui6 == null ? object0 : ((Number)gui6.a()).floatValue();
        }
        if((htv0 instanceof hth)) {
            gui gui7 = this.h;
            if(gui7 == null) {
                return object0;
            }
            Object object1 = (List)gui7.a();
            return object1 == null ? object0 : object1;
        }
        if((htv0 instanceof htf)) {
            gui gui8 = this.i;
            return gui8 == null ? object0 : new hmy(((hll)gui8.a()).j);
        }
        if((htv0 instanceof htg)) {
            gui gui9 = this.m;
            return gui9 == null ? object0 : ((Number)gui9.a()).floatValue();
        }
        if((htv0 instanceof htn)) {
            gui gui10 = this.j;
            return gui10 == null ? object0 : new hmy(((hll)gui10.a()).j);
        }
        if((htv0 instanceof htp)) {
            gui gui11 = this.k;
            return gui11 == null ? object0 : ((Number)gui11.a()).floatValue();
        }
        if((htv0 instanceof hto)) {
            gui gui12 = this.l;
            return gui12 == null ? object0 : ((Number)gui12.a()).floatValue();
        }
        if((htv0 instanceof htu)) {
            gui gui13 = this.n;
            return gui13 == null ? object0 : ((Number)gui13.a()).floatValue();
        }
        if((htv0 instanceof hts)) {
            gui gui14 = this.o;
            return gui14 == null ? object0 : ((Number)gui14.a()).floatValue();
        }
        if(!(htv0 instanceof htt)) {
            throw new ibnq();
        }
        gui gui15 = this.p;
        return gui15 != null ? ((Number)gui15.a()).floatValue() : object0;
    }
}

