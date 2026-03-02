public final class albu {
    private final albs a;

    public albu(albs albs0) {
        this.a = albs0;
    }

    public final void a(hfjb hfjb0, int v) {
        String s2;
        String s1;
        String s;
        albo albo0 = new albo(hfjb0);
        albr albr0 = new albr(((gful_cronetEngineProvider)new albq(((gful_cronetEngineProvider)new albp(hfjb0, v)))));
        baun baun0 = albs.a;
        baun0.j("%s", new Object[]{((gful_cronetEngineProvider)albo0).mr()});
        gzzp gzzp0 = (gzzp)((ProtoLiteBuilder)((gful_cronetEngineProvider)albr0).mr()).N_build();
        albs albs0 = this.a;
        if(albs0.a()) {
            boolean z = true;
            cdzd cdzd0 = albs0.b;
            if(cdzd0 != null) {
                hfja hfja0 = gzzp0.c == 1 ? ((hfja)gzzp0.d) : hfja.a;
                if(((hfja0.d == null ? hfjd.a : hfja0.d).b & 0x40) == 0) {
                    if(((gzzp0.c == 1 ? ((hfja)gzzp0.d) : hfja.a).b & 16) == 0) {
                        z = false;
                    }
                    s2 = String.format("Generic ExoLogEvent. hasNetworkEvent=%s", Boolean.valueOf(z));
                }
                else {
                    hfja hfja1 = gzzp0.c == 1 ? ((hfja)gzzp0.d) : hfja.a;
                    hfjd hfjd0 = hfja1.d == null ? hfjd.a : hfja1.d;
                    hfji hfji0 = hfjd0.d == null ? hfji.a : hfjd0.d;
                    int v1 = hfjf.a(hfji0.d);
                    if(v1 != 0 && v1 != 1) {
                        switch(v1) {
                            case 5: {
                                s = "CONNECTION_STATE_SIGNALING_CREATE_SIGNALING";
                                break;
                            }
                            case 6: {
                                s = "CONNECTION_STATE_CREATE_CONNECTION_COMPONENT";
                                break;
                            }
                            case 7: {
                                s = "CONNECTION_STATE_DELETING_DUPLICATE_CONNECTION_COMPONENT";
                                break;
                            }
                            case 8: {
                                s = "CONNECTION_STATE_DELETED_DUPLICATE_CONNECTION_COMPONENT";
                                break;
                            }
                            case 9: {
                                s = "CONNECTION_STATE_APP_SESSION_INITIALIZED";
                                break;
                            }
                            case 10: {
                                s = "CONNECTION_STATE_WEB_RTC_START";
                                break;
                            }
                            case 11: {
                                s = "CONNECTION_STATE_WEB_RTC_ADD_LOCAL_STREAM";
                                break;
                            }
                            case 12: {
                                s = "CONNECTION_STATE_WEB_RTC_OFFER_GENERATED";
                                break;
                            }
                            case 13: {
                                s = "CONNECTION_STATE_SIGNALING_MESSAGE_SENT_TO_SIGNALING";
                                break;
                            }
                            case 14: {
                                s = "CONNECTION_STATE_WEB_RTC_SIGNAL_RECEIVED_FROM_GUEST";
                                break;
                            }
                            case 15: {
                                s = "CONNECTION_STATE_WEB_RTC_ANSWER_APPLIED";
                                break;
                            }
                            case 16: {
                                s = "CONNECTION_STATE_WEB_RTC_OFFER_APPLIED";
                                break;
                            }
                            case 17: {
                                s = "CONNECTION_STATE_CLOSE_CONNECTION_COMPONENT";
                                break;
                            }
                            case 18: {
                                s = "CONNECTION_STATE_INNER_WEB_RTC_STATE_CHANGED";
                                break;
                            }
                            case 19: {
                                s = "CONNECTION_STATE_INNER_WEB_RTC_ICE_CHANGED";
                                break;
                            }
                            case 20: {
                                s = "CONNECTION_STATE_INNER_WEB_RTC_SIGNALING_CHANGED";
                                break;
                            }
                            case 21: {
                                s = "CONNECTION_STATE_APP_LAUNCH_START";
                                break;
                            }
                            case 22: {
                                s = "CONNECTION_STATE_TOP_APP_CHANGED";
                                break;
                            }
                            case 23: {
                                s = "CONNECTION_STATE_VIDEO_FRAME_SENT";
                                break;
                            }
                            case 24: {
                                s = "CONNECTION_STATE_ACTIVE_CONNECTIONS_ESTABLISHED";
                                break;
                            }
                            case 25: {
                                s = "CONNECTION_STATE_WEB_VERSION_ACQUIRED";
                                break;
                            }
                            default: {
                                s = "null";
                            }
                        }
                    }
                    else {
                        s = "CONNECTION_STATE_UNKNOWN";
                    }
                    switch(hfjh.a(hfji0.c)) {
                        case 0: 
                        case 1: {
                            s1 = "UNKNOWN";
                            break;
                        }
                        case 2: {
                            s1 = "CONNECTION_STATE";
                            break;
                        }
                        default: {
                            s1 = "SESSION";
                        }
                    }
                    s2 = String.format("webrtc_event {connection_state:%s, event_type:%s, inner_web_rtc_state:%s, session_id:%s}", s, s1, hfji0.f, ((long)hfji0.e));
                }
                baun0.h("CC-LOG- logging event=%s", new Object[]{s2});
                cdzd0.c(((ProtoLiteMessage)gzzp0)).a();
            }
        }
    }
}

