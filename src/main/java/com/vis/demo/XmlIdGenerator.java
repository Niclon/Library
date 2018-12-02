package com.vis.demo;

public class XmlIdGenerator {
    private static long rid = 0;
    private static long sid = 0;
    private static long did = 0;

    public static long getNewRid() {
        rid+=1;
        return rid;
    }

    public static long getNewSid() {
        sid+=1;
        return sid;
    }

    public static long getNewDid() {
        did+=1;
        return did;
    }
}
