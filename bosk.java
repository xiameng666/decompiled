import java.util.concurrent.Callable;

public final class bosk implements Callable {
    public final bosm a;
    public final gmcd b;
    public final gmcd c;

    public bosk(bosm bosm0, gmcd gmcd0, gmcd gmcd1) {
        this.a = bosm0;
        this.b = gmcd0;
        this.c = gmcd1;
    }

    @Override
    public final Object call() {
        String s9;
        String s6;
        int v3;
        String s5;
        String s3;
        String s2;
        String s1;
        fqzl fqzl0 = (fqzl)gmbu.r(this.b);
        StringBuilder stringBuilder0 = new StringBuilder();
        bosm.b(stringBuilder0, "First start-up time", (((ProtoLiteMessage)(fqzl0.x == null ? hfwn.a : fqzl0.x)).equals(hfyn.c) ? "Not set" : hfyn.o((fqzl0.x == null ? hfwn.a : fqzl0.x))));
        String s = "Disabled";
        bosm.b(stringBuilder0, "Find My Device", (fqzl0.e ? "Enabled" : "Disabled"));
        if(fqzl0.c != 22) {
            s1 = "Not set (default)";
        }
        else if(((fqza)fqzl0.d).e) {
            s1 = "Enrolled";
        }
        else {
            s1 = "Denied";
        }
        bosm.b(stringBuilder0, "Last Known Location tracking enrollment", s1);
        if((fqzl0.c == 22 ? ((fqza)fqzl0.d) : fqza.a).e) {
            fqza fqza0 = fqzl0.c == 22 ? ((fqza)fqzl0.d) : fqza.a;
            if(fqza0.c == 2) {
                int v = fqyv.a(((Integer)fqza0.d).intValue());
                if(v == 0) {
                    s2 = "NONE";
                }
                else {
                    switch(v) {
                        case 1: {
                            s2 = "NONE";
                            break;
                        }
                        case 2: {
                            s2 = "FMD_SETTINGS_LKL_TOGGLE";
                            break;
                        }
                        case 4: {
                            s2 = "NOTIFICATION_KEYCHAIN_INITIALIZATION_SIGN_IN";
                            break;
                        }
                        case 5: {
                            s2 = "RESTORED_FROM_SERVER";
                            break;
                        }
                        case 6: {
                            s2 = "NOTIFICATION_KEYCHAIN_INITIALIZATION_LSKF_ENTRY";
                            break;
                        }
                        case 7: {
                            s2 = "SETUP_WIZARD";
                            break;
                        }
                        default: {
                            s2 = "null";
                        }
                    }
                }
            }
            else {
                s2 = "NONE";
            }
            bosm.b(stringBuilder0, "Last Known Location tracking enrollment method", s2);
        }
        int v1 = fqzl0.c;
        if((v1 == 22 ? ((fqza)fqzl0.d) : fqza.a).c == 4) {
            fqza fqza1 = v1 == 22 ? ((fqza)fqzl0.d) : fqza.a;
            if(fqza1.c == 4) {
                int v2 = fqyx.a(((Integer)fqza1.d).intValue());
                if(v2 == 0) {
                    s3 = "DEFAULT_UNSPECIFIED";
                }
                else {
                    switch(v2) {
                        case 1: {
                            s3 = "DEFAULT_UNSPECIFIED";
                            break;
                        }
                        case 2: {
                            s3 = "FMD_SETTINGS";
                            break;
                        }
                        case 3: {
                            s3 = "LEGACY_NOTIFICATION";
                            break;
                        }
                        case 4: {
                            s3 = "NOTIFICATION_SWIPED_AWAY";
                            break;
                        }
                        case 5: {
                            s3 = "NO_THANK_YOU";
                            break;
                        }
                        default: {
                            s3 = "SERVER_SIDE";
                        }
                    }
                }
            }
            else {
                s3 = "DEFAULT_UNSPECIFIED";
            }
            bosm.b(stringBuilder0, "Last Known Location tracking enrollment denied by", s3);
        }
        String s4 = "None";
        switch(fqzl0.c) {
            case 22: {
                break;
            }
            case 0x1F: {
                fqyt fqyt0 = (fqyt)fqzl0.d;
                bosm.b(stringBuilder0, "Last Known Location tracking auto-enrollment blocker", (fqys.b(fqyt0.c) == null ? fqys.a : fqys.b(fqyt0.c)).name());
                bosm.b(stringBuilder0, "Last Known Location tracking auto-enrollment blocker time", ((fqyt0.b & 2) == 0 ? "None" : hfyn.o((fqyt0.d == null ? hfwn.a : fqyt0.d))));
                break;
            }
            default: {
                bosm.b(stringBuilder0, "Last Known Location tracking auto-enrollment blocker", "Not set (default)");
            }
        }
        bosm.b(stringBuilder0, "Finder network state", (gtas.b(fqzl0.g) == null ? gtas.a : gtas.b(fqzl0.g)).name());
        bosm.b(stringBuilder0, "Last Finder network enabling time (high traffic)", ((fqzl0.b & 16) == 0 ? "None" : hfyn.o((fqzl0.i == null ? hfwn.a : fqzl0.i))));
        bosm.b(stringBuilder0, "Last Finder network enabling time (all locations)", ((fqzl0.b & 8) == 0 ? "None" : hfyn.o((fqzl0.h == null ? hfwn.a : fqzl0.h))));
        bosm.b(stringBuilder0, "Self-provisioned device", ((fqzl0.b & 0x20) == 0 ? "Missing" : "Exists"));
        bosm.b(stringBuilder0, "Self-provisioned device last validation", ((fqzl0.b & 0x40) == 0 ? "None" : hfyn.o((fqzl0.k == null ? hfwn.a : fqzl0.k))));
        bosm.b(stringBuilder0, "Self provisioning state", (fqyi.b(fqzl0.r) == null ? fqyi.a : fqyi.b(fqzl0.r)).name());
        if(((fqzl0.t == null ? fqxr.a : fqzl0.t).b & 1) == 0) {
            s5 = "None";
        }
        else {
            fqxr fqxr0 = fqzl0.t == null ? fqxr.a : fqzl0.t;
            s5 = hfyn.o((fqxr0.c == null ? hfwn.a : fqxr0.c)) + ((fqzl0.t == null ? fqxr.a : fqzl0.t).d ? " (temporarily)" : " (permanently)");
        }
        bosm.b(stringBuilder0, "Self provisioning notification forbidden time", s5);
        if((fqzl0.b & 0x1000) != 0) {
            switch((fqzl0.t == null ? fqxr.a : fqzl0.t).e) {
                case 0: {
                    v3 = 2;
                    break;
                }
                case 1: {
                    v3 = 3;
                    break;
                }
                case 2: {
                    v3 = 4;
                    break;
                }
                default: {
                    v3 = 0;
                }
            }
            if(v3 == 0) {
                s6 = "UNRECOGNIZED";
            }
            else {
                switch(v3) {
                    case 2: {
                        s6 = "DEFAULT_UNKNOWN";
                        break;
                    }
                    case 3: {
                        s6 = "SWIPED_AWAY";
                        break;
                    }
                    default: {
                        s6 = "DECLINED";
                    }
                }
            }
            bosm.b(stringBuilder0, "Self provisioning notification forbid method", s6);
        }
        String s7 = (fqzl0.b & 0x800) == 0 ? "None" : hfyn.o((fqzl0.s == null ? hfwn.a : fqzl0.s));
        gmcd gmcd0 = this.c;
        bosm.b(stringBuilder0, "Unreported no eligible account for client provisioning arrival time", s7);
        bosm.b(stringBuilder0, "Self-provisioned devices pending deletion", Integer.toString(fqzl0.l.size()));
        if(bpya.a(this.a.a)) {
            s = "Enabled";
        }
        bosm.b(stringBuilder0, "Location services", s);
        bosm.b(stringBuilder0, "Number of devices in the device cache", Integer.toString(((Integer)gmbu.r(gmcd0)).intValue()));
        String s8 = "RETRIEVED";
        if((fqzl0.b & 0x2000) == 0) {
            bosm.b(stringBuilder0, "Last LKL owner key sync time", "Never");
        }
        else {
            fqzk fqzk0 = fqzl0.u == null ? fqzk.a : fqzl0.u;
            bosm.b(stringBuilder0, "LKL domain name", fqzk0.c);
            int v4 = fqzi.a(fqzk0.d);
            if(v4 == 0) {
                s9 = "UNKNOWN";
            }
            else {
                switch(v4) {
                    case 1: {
                        s9 = "UNKNOWN";
                        break;
                    }
                    case 2: {
                        s9 = "CREATABLE";
                        break;
                    }
                    case 3: {
                        s9 = "RETRIEVABLE";
                        break;
                    }
                    case 4: {
                        s9 = "UNRETRIEVABLE";
                        break;
                    }
                    case 5: {
                        s9 = "RETRIEVED";
                        break;
                    }
                    default: {
                        s9 = "TO_BE_RESET";
                    }
                }
            }
            bosm.b(stringBuilder0, "LKL domain state", s9);
            if(fqzk0.e.size() > 0) {
                bosm.b(stringBuilder0, "Retrieved LKL domain key versions", gggq.s(fqzk0.e));
            }
            if((fqzk0.b & 4) != 0) {
                s4 = Integer.toString(fqzk0.f);
            }
            bosm.b(stringBuilder0, "Installed LKL owner key version", s4);
            bosm.b(stringBuilder0, "LKL owner key versions in use", gggq.s(fqzk0.g));
            bosm.b(stringBuilder0, "Exported LKL owner key versions", gggq.s(gggq.j(fqzk0.h, new bosl())));
            if((fqzk0.b & 8) != 0) {
                bosm.b(stringBuilder0, "Keychain readiness state for creating LSKF domain", fqzk0.i);
            }
            if((fqzk0.b & 16) != 0) {
                bosm.b(stringBuilder0, "Keychain readiness state for silently creating account password domain", Boolean.toString(fqzk0.j));
            }
            bosm.b(stringBuilder0, "Last LKL owner key sync time", hfyn.o((fqzk0.k == null ? hfwn.a : fqzk0.k)));
        }
        if(hsxo.f() && (fqzl0.b & 2) != 0) {
            fqyp fqyp0 = fqzl0.f == null ? fqyp.b : fqzl0.f;
            String s10 = fqyp0.h ? "Last post-LKL-enrollment Keychain maintenance user engagement " : "Last pre-LKL-enrollment Keychain maintenance user engagement ";
            String s11 = "UNSPECIFIED";
            switch((fqyo.a(fqyp0.e) == 0 ? 1 : fqyo.a(fqyp0.e))) {
                case 1: {
                    s8 = "UNSPECIFIED";
                    break;
                }
                case 2: {
                    s8 = "NOTIFIED";
                    break;
                }
                case 3: {
                    s8 = "DECLINED_FROM_NOTIFICATION";
                    break;
                }
                case 4: {
                    s8 = "ACTIVITY_OPENED";
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    s8 = "RESET";
                    break;
                }
                case 7: {
                    s8 = "KNOWLEDGE_FACTOR_ADDED";
                    break;
                }
                case 8: {
                    s8 = "DECLINED_FROM_ACTIVITY";
                    break;
                }
                case 9: {
                    s8 = "CANCELLED";
                    break;
                }
                default: {
                    s8 = "CANCELLED_AFTER_ACTIVITY_OPENED";
                }
            }
            bosm.b(stringBuilder0, s10 + "state", s8);
            int v5 = fqyk.a(fqyp0.g);
            if(v5 != 0) {
                switch(v5) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        s11 = "SIGN_IN";
                        break;
                    }
                    case 3: {
                        s11 = "LSKF_CHALLENGE";
                        break;
                    }
                    default: {
                        s11 = "LOCK_SCREEN_REQUIRED";
                    }
                }
            }
            bosm.b(stringBuilder0, s10 + "required input", s11);
            bosm.b(stringBuilder0, s10 + "time", hfyn.o((fqyp0.d == null ? hfwn.a : fqyp0.d)));
        }
        return stringBuilder0.toString();
    }
}

