public final class eusu implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        int v2;
        int v1;
        int v = 15;
        switch(((dpfp)object0).b) {
            case 0: {
                v1 = 16;
                break;
            }
            case 1: {
                v1 = 2;
                break;
            }
            case 2: {
                v1 = 3;
                break;
            }
            case 3: {
                v1 = 4;
                break;
            }
            case 4: {
                v1 = 1;
                break;
            }
            case 5: {
                v1 = 5;
                break;
            }
            case 6: {
                v1 = 6;
                break;
            }
            case 7: {
                v1 = 7;
                break;
            }
            case 8: {
                v1 = 8;
                break;
            }
            case 9: {
                v1 = 9;
                break;
            }
            case 10: {
                v1 = 10;
                break;
            }
            case 11: {
                v1 = 11;
                break;
            }
            case 12: {
                v1 = 12;
                break;
            }
            case 13: {
                v1 = 13;
                break;
            }
            case 14: {
                v1 = 14;
                break;
            }
            case 15: {
                v1 = 15;
                break;
            }
            default: {
                v1 = 0;
            }
        }
        if(v1 != 0) {
            switch(v1 - 1) {
                case 0: {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftiw.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftit.a).v_newBuilder();
                    dpfm dpfm0 = ((dpfp)object0).b == 4 ? ((dpfm)((dpfp)object0).c) : dpfm.a;
                    if(dpfm0.b == 3) {
                        switch(((int)(((Integer)dpfm0.c)))) {
                            case 0: {
                                v2 = 2;
                                break;
                            }
                            case 1: {
                                v2 = 3;
                                break;
                            }
                            case 2: {
                                v2 = 4;
                                break;
                            }
                            case 3: {
                                v2 = 5;
                                break;
                            }
                            case 4: {
                                v2 = 6;
                                break;
                            }
                            case 5: {
                                v2 = 7;
                                break;
                            }
                            case 6: {
                                v2 = 8;
                                break;
                            }
                            case 7: {
                                v2 = 9;
                                break;
                            }
                            default: {
                                v2 = 0;
                            }
                        }
                        if(v2 == 0) {
                            v2 = 1;
                        }
                    }
                    else {
                        v2 = 2;
                    }
                    switch(v2 - 2) {
                        case 1: {
                            v = 14;
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            v = 16;
                            break;
                        }
                        case 4: {
                            v = 17;
                            break;
                        }
                        case 5: {
                            v = 18;
                            break;
                        }
                        case 6: {
                            v = 4;
                            break;
                        }
                        case 7: {
                            v = 3;
                            break;
                        }
                        default: {
                            v = 2;
                        }
                    }
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ftit ftit0 = (ftit)hftp1.b_message;
                    ftit0.b = ftis.b(v);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ftiw ftiw0 = (ftiw)hftp0.b_message;
                    ftit ftit1 = (ftit)hftp1.N_build();
                    ftit1.getClass();
                    ftiw0.c = ftit1;
                    ftiw0.b = 1;
                    return ((ftiw)hftp0.N_build()).toBytesArray();
                }
                case 5: {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ftiw.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ftim.a).v_newBuilder();
                    dpfh dpfh0 = ((dpfp)object0).b == 6 ? ((dpfh)((dpfp)object0).c) : dpfh.a;
                    gtgg gtgg0 = dpfh0.c == null ? gtgg.a : dpfh0.c;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ftim ftim0 = (ftim)hftp3.b_message;
                    gtgg0.getClass();
                    ftim0.c = gtgg0;
                    ftim0.b |= 1;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ftiw ftiw1 = (ftiw)hftp2.b_message;
                    ftim ftim1 = (ftim)hftp3.N_build();
                    ftim1.getClass();
                    ftiw1.c = ftim1;
                    ftiw1.b = 7;
                    return ((ftiw)hftp2.N_build()).toBytesArray();
                }
                case 6: {
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)ftiw.a).v_newBuilder();
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)ftio.a).v_newBuilder();
                    gtid gtid0 = gtid.a;
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gtid0).v_newBuilder();
                    if(((dpfp)object0).b == 7) {
                        gtid0 = (gtid)((dpfp)object0).c;
                    }
                    hfuo hfuo0 = gtid0.b;
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gtid gtid1 = (gtid)hftp6.b_message;
                    hfuo hfuo1 = gtid1.b;
                    if(!hfuo1.c()) {
                        gtid1.b = ProtoLiteMessage.E(hfuo1);
                    }
                    hfrj.E(hfuo0, gtid1.b);
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ftio ftio0 = (ftio)hftp5.b_message;
                    gtid gtid2 = (gtid)hftp6.N_build();
                    gtid2.getClass();
                    ftio0.c = gtid2;
                    ftio0.b |= 1;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ftiw ftiw2 = (ftiw)hftp4.b_message;
                    ftio ftio1 = (ftio)hftp5.N_build();
                    ftio1.getClass();
                    ftiw2.c = ftio1;
                    ftiw2.b = 8;
                    return ((ftiw)hftp4.N_build()).toBytesArray();
                }
                case 7: {
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)ftiw.a).v_newBuilder();
                    ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)ftiq.a).v_newBuilder();
                    dpfo dpfo0 = ((dpfp)object0).b == 8 ? ((dpfo)((dpfp)object0).c) : dpfo.a;
                    gtmn gtmn0 = gtmn.b(dpfo0.b) == null ? gtmn.j : gtmn.b(dpfo0.b);
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    ftiq ftiq0 = (ftiq)hftp8.b_message;
                    ftiq0.b = gtmn0.a();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ftiw ftiw3 = (ftiw)hftp7.b_message;
                    ftiq ftiq1 = (ftiq)hftp8.N_build();
                    ftiq1.getClass();
                    ftiw3.c = ftiq1;
                    ftiw3.b = 9;
                    return ((ftiw)hftp7.N_build()).toBytesArray();
                }
                case 8: {
                    ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)ftiw.a).v_newBuilder();
                    ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)ftir.a).v_newBuilder();
                    gtjd gtjd0 = ((dpfp)object0).b == 9 ? ((gtjd)((dpfp)object0).c) : gtjd.a;
                    if(!hftp10.b_message.isImmutable()) {
                        hftp10.ensureMutable();
                    }
                    ftir ftir0 = (ftir)hftp10.b_message;
                    gtjd0.getClass();
                    ftir0.c = gtjd0;
                    ftir0.b |= 1;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    ftiw ftiw4 = (ftiw)hftp9.b_message;
                    ftir ftir1 = (ftir)hftp10.N_build();
                    ftir1.getClass();
                    ftiw4.c = ftir1;
                    ftiw4.b = 10;
                    return ((ftiw)hftp9.N_build()).toBytesArray();
                }
                default: {
                    return ftiw.a.toBytesArray();
                }
            }
        }
        throw null;
    }
}

