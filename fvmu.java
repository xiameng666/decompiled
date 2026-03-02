import android.location.GnssClock;
import android.location.GnssMeasurement;
import android.location.GnssMeasurementsEvent;
import android.os.Build.VERSION;
import j..util.Collection.-EL;

public final class fvmu {
    public static gwrv a(GnssMeasurementsEvent gnssMeasurementsEvent0) {
        gwru gwru0 = (gwru)((ProtoLiteMessage)gwrv.a).v_newBuilder();
        GnssClock gnssClock0 = gnssMeasurementsEvent0.getClock();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwrt.a).v_newBuilder();
        long v = gnssClock0.getTimeNanos();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwrt gwrt0 = (gwrt)hftp0.b_message;
        gwrt0.b |= 2;
        gwrt0.d = v;
        int v1 = gnssClock0.getHardwareClockDiscontinuityCount();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwrt gwrt1 = (gwrt)hftp0.b_message;
        gwrt1.b |= 0x800;
        gwrt1.m = v1;
        if(gnssClock0.hasLeapSecond()) {
            int v2 = gnssClock0.getLeapSecond();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwrt gwrt2 = (gwrt)hftp0.b_message;
            gwrt2.b |= 1;
            gwrt2.c = v2;
        }
        if(gnssClock0.hasTimeUncertaintyNanos()) {
            double f = gnssClock0.getTimeUncertaintyNanos();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwrt gwrt3 = (gwrt)hftp0.b_message;
            gwrt3.b |= 8;
            gwrt3.e = f;
        }
        if(gnssClock0.hasFullBiasNanos()) {
            long v3 = gnssClock0.getFullBiasNanos();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwrt gwrt4 = (gwrt)hftp0.b_message;
            gwrt4.b |= 16;
            gwrt4.f = v3;
        }
        if(gnssClock0.hasBiasNanos()) {
            double f1 = gnssClock0.getBiasNanos();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwrt gwrt5 = (gwrt)hftp0.b_message;
            gwrt5.b |= 0x20;
            gwrt5.g = f1;
        }
        if(gnssClock0.hasBiasUncertaintyNanos()) {
            double f2 = gnssClock0.getBiasUncertaintyNanos();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwrt gwrt6 = (gwrt)hftp0.b_message;
            gwrt6.b |= 0x40;
            gwrt6.h = f2;
        }
        if(gnssClock0.hasDriftNanosPerSecond()) {
            double f3 = gnssClock0.getDriftNanosPerSecond();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwrt gwrt7 = (gwrt)hftp0.b_message;
            gwrt7.b |= 0x80;
            gwrt7.i = f3;
        }
        if(gnssClock0.hasDriftUncertaintyNanosPerSecond()) {
            double f4 = gnssClock0.getDriftUncertaintyNanosPerSecond();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwrt gwrt8 = (gwrt)hftp0.b_message;
            gwrt8.b |= 0x100;
            gwrt8.j = f4;
        }
        if(gnssClock0.hasElapsedRealtimeNanos()) {
            long v4 = gnssClock0.getElapsedRealtimeNanos();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwrt gwrt9 = (gwrt)hftp0.b_message;
            gwrt9.b |= 0x200;
            gwrt9.k = v4;
        }
        if(gnssClock0.hasElapsedRealtimeUncertaintyNanos()) {
            double f5 = gnssClock0.getElapsedRealtimeUncertaintyNanos();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwrt gwrt10 = (gwrt)hftp0.b_message;
            gwrt10.b |= 0x400;
            gwrt10.l = f5;
        }
        gwrt gwrt11 = (gwrt)hftp0.N_build();
        if(!gwru0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwru0).ensureMutable();
        }
        gwrv gwrv0 = (gwrv)gwru0.b_message;
        gwrt11.getClass();
        gwrv0.d = gwrt11;
        gwrv0.b |= 1;
        for(Object object0: gnssMeasurementsEvent0.getMeasurements()) {
            GnssMeasurement gnssMeasurement0 = (GnssMeasurement)object0;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwry.a).v_newBuilder();
            int v5 = gnssMeasurement0.getSvid();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwry gwry0 = (gwry)hftp1.b_message;
            gwry0.b |= 1;
            gwry0.c = v5;
            int v6 = gnssMeasurement0.getConstellationType();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwry gwry1 = (gwry)hftp1.b_message;
            gwry1.b |= 2;
            gwry1.d = v6;
            double f6 = gnssMeasurement0.getTimeOffsetNanos();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwry gwry2 = (gwry)hftp1.b_message;
            gwry2.b |= 4;
            gwry2.e = f6;
            int v7 = gnssMeasurement0.getState();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwry gwry3 = (gwry)hftp1.b_message;
            gwry3.b |= 8;
            gwry3.f = v7;
            long v8 = gnssMeasurement0.getReceivedSvTimeNanos();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwry gwry4 = (gwry)hftp1.b_message;
            gwry4.b |= 16;
            gwry4.g = v8;
            long v9 = gnssMeasurement0.getReceivedSvTimeUncertaintyNanos();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwry gwry5 = (gwry)hftp1.b_message;
            gwry5.b |= 0x20;
            gwry5.h = v9;
            double f7 = gnssMeasurement0.getCn0DbHz();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwry gwry6 = (gwry)hftp1.b_message;
            gwry6.b |= 0x80;
            gwry6.i = f7;
            double f8 = gnssMeasurement0.getPseudorangeRateMetersPerSecond();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwry gwry7 = (gwry)hftp1.b_message;
            gwry7.b |= 0x100;
            gwry7.j = f8;
            double f9 = gnssMeasurement0.getPseudorangeRateUncertaintyMetersPerSecond();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwry gwry8 = (gwry)hftp1.b_message;
            gwry8.b |= 0x200;
            gwry8.k = f9;
            int v10 = gnssMeasurement0.getAccumulatedDeltaRangeState();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwry gwry9 = (gwry)hftp1.b_message;
            gwry9.b |= 0x400;
            gwry9.l = v10;
            if(gnssMeasurement0.getAccumulatedDeltaRangeState() != 0) {
                double f10 = gnssMeasurement0.getAccumulatedDeltaRangeMeters();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwry gwry10 = (gwry)hftp1.b_message;
                gwry10.b |= 0x800;
                gwry10.m = f10;
                double f11 = gnssMeasurement0.getAccumulatedDeltaRangeUncertaintyMeters();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwry gwry11 = (gwry)hftp1.b_message;
                gwry11.b |= 0x1000;
                gwry11.n = f11;
            }
            if(gnssMeasurement0.hasCarrierFrequencyHz()) {
                float f12 = gnssMeasurement0.getCarrierFrequencyHz();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwry gwry12 = (gwry)hftp1.b_message;
                gwry12.b |= 0x2000;
                gwry12.o = f12;
            }
            int v11 = gwrx.a(gnssMeasurement0.getMultipathIndicator());
            if(v11 != 0) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gwry)hftp1.b_message).s = v11 - 1;
                ((gwry)hftp1.b_message).b |= 0x20000;
            }
            if(gnssMeasurement0.hasSnrInDb()) {
                double f13 = gnssMeasurement0.getSnrInDb();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwry gwry13 = (gwry)hftp1.b_message;
                gwry13.b |= 0x40000;
                gwry13.t = f13;
            }
            if(gnssMeasurement0.hasAutomaticGainControlLevelDb()) {
                double f14 = gnssMeasurement0.getAutomaticGainControlLevelDb();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwry gwry14 = (gwry)hftp1.b_message;
                gwry14.b |= 0x80000;
                gwry14.u = f14;
            }
            if(gnssMeasurement0.hasCodeType()) {
                String s = gnssMeasurement0.getCodeType();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwry gwry15 = (gwry)hftp1.b_message;
                s.getClass();
                gwry15.b |= 0x100000;
                gwry15.v = s;
            }
            gwru0.k(((gwry)hftp1.N_build()));
        }
        if(Build.VERSION.SDK_INT >= 33 && huvd.a.f().E()) {
            Iterable iterable0 = (Iterable)Collection.-EL.stream(gnssMeasurementsEvent0.getGnssAutomaticGainControls()).map(new fvmt()).collect(ggaf.a);
            if(!gwru0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwru0).ensureMutable();
            }
            gwrv gwrv1 = (gwrv)gwru0.b_message;
            hfuo hfuo0 = gwrv1.e;
            if(!hfuo0.c()) {
                gwrv1.e = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(iterable0, gwrv1.e);
        }
        return (gwrv)((ProtoLiteBuilder)gwru0).N_build();
    }
}

