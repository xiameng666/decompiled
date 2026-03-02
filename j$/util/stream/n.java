package j$.util.stream;

import j..util.Objects;
import j..util.Optional;
import j..util.OptionalDouble;
import j..util.OptionalInt;
import j..util.OptionalLong;
import j..util.StringJoiner;
import j..util.function.BiConsumer.-CC;
import j..util.function.BiFunction.-CC;
import j..util.function.Function.-CC;
import j..util.function.Predicate.-CC;
import j..util.y;
import j..util.z;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public final class n implements BiConsumer, BinaryOperator, DoubleBinaryOperator, DoubleFunction, Function, IntBinaryOperator, IntFunction, ObjDoubleConsumer, ObjIntConsumer, Predicate, ToDoubleFunction, ToIntFunction {
    public final int a;

    public n(int v) {
        this.a = v;
        super();
    }

    @Override
    public void accept(Object object0, double f) {
        switch(this.a) {
            case 9: {
                ++((double[])object0)[2];
                Collectors.a(((double[])object0), f);
                ((double[])object0)[3] += f;
                return;
            }
            case 11: {
                ((y)object0).accept(f);
                return;
            }
            default: {
                Collectors.a(((double[])object0), f);
                ((double[])object0)[2] += f;
            }
        }
    }

    @Override
    public void accept(Object object0, int v) {
        ((z)object0).accept(v);
    }

    @Override
    public void accept(Object object0, Object object1) {
        switch(this.a) {
            case 1: {
                ((StringJoiner)object0).add(((CharSequence)object1));
                return;
            }
            case 5: {
                ((LinkedHashSet)object0).add(object1);
                return;
            }
            case 6: {
                ((LinkedHashSet)object0).addAll(((LinkedHashSet)object1));
                return;
            }
            case 7: {
                Collectors.a(((double[])object0), ((double[])object1)[0]);
                Collectors.a(((double[])object0), ((double[])object1)[1]);
                ((double[])object0)[2] += ((double[])object1)[2];
                return;
            }
            case 10: {
                Collectors.a(((double[])object0), ((double[])object1)[0]);
                Collectors.a(((double[])object0), ((double[])object1)[1]);
                ((double[])object0)[2] += ((double[])object1)[2];
                ((double[])object0)[3] += ((double[])object1)[3];
                return;
            }
            case 12: {
                ((y)object0).a(((y)object1));
                return;
            }
            default: {
                ((z)object0).a(((z)object1));
            }
        }
    }

    @Override
    public Predicate and(Predicate predicate0) {
        switch(this.a) {
            case 18: {
                return Predicate.-CC.$default$and(this, predicate0);
            }
            case 19: {
                return Predicate.-CC.$default$and(this, predicate0);
            }
            case 20: {
                return Predicate.-CC.$default$and(this, predicate0);
            }
            default: {
                return Predicate.-CC.$default$and(this, predicate0);
            }
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer0) {
        switch(this.a) {
            case 1: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 5: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 6: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 7: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 10: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 12: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            default: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
        }
    }

    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public Object apply(double f) {
        return f;
    }

    @Override
    public Object apply(int v) {
        switch(this.a) {
            case 15: {
                return new Double[v];
            }
            case 22: {
                return new Object[v];
            }
            case 23: {
                return new Integer[v];
            }
            default: {
                return v;
            }
        }
    }

    @Override
    public Object apply(Object object0) {
        return this.a != 0 ? ((StringJoiner)object0).toString() : object0;
    }

    @Override
    public Object apply(Object object0, Object object1) {
        if(this.a != 2) {
            if(((Set)object0).size() < ((Set)object1).size()) {
                ((Set)object1).addAll(((Set)object0));
                return (Set)object1;
            }
            ((Set)object0).addAll(((Set)object1));
            return (Set)object0;
        }
        ((StringJoiner)object0).getClass();
        Objects.requireNonNull(((StringJoiner)object1));
        if(((StringJoiner)object1).d != null) {
            ((StringJoiner)object1).a();
            return ((StringJoiner)object0).add(((StringJoiner)object1).d[0]);
        }
        return (StringJoiner)object0;
    }

    @Override
    public double applyAsDouble(double f, double f1) {
        return this.a == 8 ? Math.min(f, f1) : Math.max(f, f1);
    }

    @Override
    public double applyAsDouble(Object object0) {
        return (double)(((Double)object0));
    }

    @Override
    public int applyAsInt(int v, int v1) {
        return this.a == 26 ? Math.min(v, v1) : v + v1;
    }

    @Override
    public int applyAsInt(Object object0) {
        return (int)(((Integer)object0));
    }

    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }

    @Override
    public Predicate negate() {
        switch(this.a) {
            case 18: {
                return Predicate.-CC.$default$negate(this);
            }
            case 19: {
                return Predicate.-CC.$default$negate(this);
            }
            case 20: {
                return Predicate.-CC.$default$negate(this);
            }
            default: {
                return Predicate.-CC.$default$negate(this);
            }
        }
    }

    @Override
    public Predicate or(Predicate predicate0) {
        switch(this.a) {
            case 18: {
                return Predicate.-CC.$default$or(this, predicate0);
            }
            case 19: {
                return Predicate.-CC.$default$or(this, predicate0);
            }
            case 20: {
                return Predicate.-CC.$default$or(this, predicate0);
            }
            default: {
                return Predicate.-CC.$default$or(this, predicate0);
            }
        }
    }

    @Override
    public boolean test(Object object0) {
        switch(this.a) {
            case 18: {
                return ((OptionalDouble)object0).isPresent();
            }
            case 19: {
                return ((OptionalInt)object0).isPresent();
            }
            case 20: {
                return ((OptionalLong)object0).a;
            }
            default: {
                return ((Optional)object0).isPresent();
            }
        }
    }
}

