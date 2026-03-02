package com.google.autofill.detection.ml;

import ancu;
import ancy;
import gdxo;
import gdxp;
import j..util.Collection.-EL;
import j..util.OptionalDouble;

public final class NumericalDataProducer implements DoubleDataProducer {
    private static final int CURRENT_VERSION = 1;
    private static final int NIBBLE_SIZE = 4;
    public static final gdxp READER = null;
    private static final int TYPE_MASK_CLASS = 15;
    private static final int TYPE_MASK_FLAGS = 0xFFF000;
    private static final int TYPE_MASK_VARIATION = 0xFF0;
    final NumericalDataProducer.NumberProducer numberProducer;

    static {
        NumericalDataProducer.READER = new NumericalDataProducer.1();
    }

    public NumericalDataProducer(NumericalDataProducer.NumberProducer numericalDataProducer$NumberProducer0) {
        this.numberProducer = numericalDataProducer$NumberProducer0;
    }

    @Override  // com.google.autofill.detection.ml.DoubleDataProducer
    public OptionalDouble produce(ancu ancu0) {
        switch(this.numberProducer.ordinal()) {
            case 0: {
                return ancu0.v == null ? OptionalDouble.of(ancu0.c & 15) : OptionalDouble.empty();
            }
            case 1: {
                return ancu0.v == null ? OptionalDouble.of((ancu0.c & 0xFF0) >>> 4) : OptionalDouble.empty();
            }
            case 2: {
                return ancu0.v == null ? OptionalDouble.of(ancu0.c >>> 12 & 0xFFF) : OptionalDouble.empty();
            }
            case 3: {
                return OptionalDouble.of(ancu0.f);
            }
            case 4: {
                if(ancu0.x.i()) {
                    return ancu0.x.i() ? OptionalDouble.of(Collection.-EL.stream(((ancu)ancu0.x.d()).y).filter(new ancy(ancu0)).count()) : OptionalDouble.of(0.0);
                }
                return OptionalDouble.empty();
            }
            case 5: {
                while(ancu0.x.i()) {
                    ancu0 = (ancu)ancu0.x.d();
                }
                return OptionalDouble.of(ancu0.a());
            }
            case 6: {
                return OptionalDouble.of(ancu0.n);
            }
            case 7: {
                return OptionalDouble.of(ancu0.m);
            }
            case 8: {
                return ancu0.g == null ? OptionalDouble.empty() : OptionalDouble.of(ancu0.g.length);
            }
            default: {
                throw new RuntimeException(null, null);
            }
        }
    }

    @Override
    public String toString() {
        return "NumericalDataProducer [ numberProducer = " + this.numberProducer.name() + " ]";
    }

    @Override  // gdxq
    public void writeToBundle(gdxo gdxo0) {
        gdxo0.l(1);
        gdxo0.l(this.numberProducer.getKey());
    }
}

