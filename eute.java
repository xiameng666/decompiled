public final class eute implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        String s;
        int v4;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dpfp.a).v_newBuilder();
        int v = ((hksl)object0).b;
        int v1 = hksk.a(v);
        if(v1 != 0) {
            int v2 = 9;
            int v3 = 1;
            switch(v1 - 1) {
                case 0: {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dpfm.a).v_newBuilder();
                    if(((hksl)object0).b == 1) {
                        switch(((int)(((Integer)((hksl)object0).c)))) {
                            case 0: {
                                v4 = 2;
                                break;
                            }
                            case 1: {
                                v4 = 3;
                                break;
                            }
                            case 2: {
                                v4 = 4;
                                break;
                            }
                            case 3: {
                                v4 = 5;
                                break;
                            }
                            case 4: {
                                v4 = 6;
                                break;
                            }
                            case 5: {
                                v4 = 7;
                                break;
                            }
                            case 6: {
                                v4 = 8;
                                break;
                            }
                            case 7: {
                                v4 = 9;
                                break;
                            }
                            case 8: {
                                v4 = 10;
                                break;
                            }
                            case 9: {
                                v4 = 11;
                                break;
                            }
                            default: {
                                v4 = 0;
                            }
                        }
                        if(v4 != 0) {
                            v3 = v4;
                        }
                    }
                    else {
                        v3 = 2;
                    }
                    switch(v3 - 2) {
                        case 3: {
                            v2 = 3;
                            break;
                        }
                        case 4: {
                            v2 = 4;
                            break;
                        }
                        case 5: {
                            v2 = 5;
                            break;
                        }
                        case 6: {
                            v2 = 6;
                            break;
                        }
                        case 7: {
                            v2 = 7;
                            break;
                        }
                        case 8: {
                            v2 = 8;
                            break;
                        }
                        case 9: {
                            break;
                        }
                        default: {
                            v2 = 2;
                        }
                    }
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((dpfm)hftp1.b_message).c = (int)(v2 - 2);
                    ((dpfm)hftp1.b_message).b = 3;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dpfp dpfp0 = (dpfp)hftp0.b_message;
                    dpfm dpfm0 = (dpfm)hftp1.N_build();
                    dpfm0.getClass();
                    dpfp0.c = dpfm0;
                    dpfp0.b = 4;
                    return ((dpfp)hftp0.N_build()).toBytesArray();
                }
                case 1: {
                    hksb hksb0 = v == 3 ? ((hksb)((hksl)object0).c) : hksb.a;
                    gtid gtid0 = hksb0.b == null ? gtid.a : hksb0.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dpfp dpfp1 = (dpfp)hftp0.b_message;
                    gtid0.getClass();
                    dpfp1.c = gtid0;
                    dpfp1.b = 7;
                    return ((dpfp)hftp0.N_build()).toBytesArray();
                }
                case 2: {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dpfo.a).v_newBuilder();
                    hksf hksf0 = ((hksl)object0).b == 4 ? ((hksf)((hksl)object0).c) : hksf.a;
                    gtmn gtmn0 = gtmn.b(hksf0.b) == null ? gtmn.j : gtmn.b(hksf0.b);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    dpfo dpfo0 = (dpfo)hftp2.b_message;
                    dpfo0.b = gtmn0.a();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dpfp dpfp2 = (dpfp)hftp0.b_message;
                    dpfo dpfo1 = (dpfo)hftp2.N_build();
                    dpfo1.getClass();
                    dpfp2.c = dpfo1;
                    dpfp2.b = 8;
                    return ((dpfp)hftp0.N_build()).toBytesArray();
                }
                case 3: {
                    hksh hksh0 = v == 5 ? ((hksh)((hksl)object0).c) : hksh.a;
                    gtjd gtjd0 = hksh0.b == null ? gtjd.a : hksh0.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dpfp dpfp3 = (dpfp)hftp0.b_message;
                    gtjd0.getClass();
                    dpfp3.c = gtjd0;
                    dpfp3.b = 9;
                    return ((dpfp)hftp0.N_build()).toBytesArray();
                }
                case 4: {
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)dpfh.a).v_newBuilder();
                    hkrz hkrz0 = ((hksl)object0).b == 6 ? ((hkrz)((hksl)object0).c) : hkrz.a;
                    gtgg gtgg0 = hkrz0.b == null ? gtgg.a : hkrz0.b;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    dpfh dpfh0 = (dpfh)hftp3.b_message;
                    gtgg0.getClass();
                    dpfh0.c = gtgg0;
                    dpfh0.b |= 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dpfp dpfp4 = (dpfp)hftp0.b_message;
                    dpfh dpfh1 = (dpfh)hftp3.N_build();
                    dpfh1.getClass();
                    dpfp4.c = dpfh1;
                    dpfp4.b = 6;
                    return ((dpfp)hftp0.N_build()).toBytesArray();
                }
                case 6: {
                    return ((dpfp)hftp0.N_build()).toBytesArray();
                }
                default: {
                    switch(hksk.a(v)) {
                        case 1: {
                            s = "ERROR";
                            break;
                        }
                        case 2: {
                            s = "IDV_LIST_ACTIVATION_METHODS_RESPONSE";
                            break;
                        }
                        case 3: {
                            s = "IDV_SELECT_ACTIVATION_METHOD_RESPONSE";
                            break;
                        }
                        case 4: {
                            s = "IDV_SUBMIT_ACTIVATION_CODE_RESPONSE";
                            break;
                        }
                        case 5: {
                            s = "IDV_GET_SELECTED_ACTIVATION_METHOD_RESPONSE";
                            break;
                        }
                        case 6: {
                            s = "IDV_QUERY_TOKEN_STATE_RESPONSE";
                            break;
                        }
                        case 7: {
                            s = "IDV_DELETE_TOKEN_RESPONSE";
                            break;
                        }
                        case 8: {
                            s = "FETCH_DEVICE_ATTESTATION_TOKEN_RESPONSE";
                            break;
                        }
                        case 9: {
                            s = "FETCH_SUPERVISED_DEVICE_CONTEXT_RESPONSE";
                            break;
                        }
                        case 10: {
                            s = "FETCH_SUPERVISED_WALLET_INFOS_RESPONSE";
                            break;
                        }
                        case 11: {
                            s = "FETCH_TRANSACTION_NOTIFICATION_RENDERING_CONTEXT_RESPONSE";
                            break;
                        }
                        case 12: {
                            s = "RESPONSE_NOT_SET";
                            break;
                        }
                        default: {
                            s = "null";
                        }
                    }
                    throw new IllegalArgumentException("Unsupported response: " + s);
                }
            }
        }
        throw null;
    }
}

