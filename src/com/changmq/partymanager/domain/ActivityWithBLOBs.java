package com.changmq.partymanager.domain;
/**
 * 
 * @ClassName ActivityWithBLOBs
 * @Description TODO
 * @author ChangMQ267
 * @date 2018/08/13
 */
public class ActivityWithBLOBs extends Activity {
    private String aSite;

    private String aAbsent;

    private String aContent;

    private String aText;

    public String getaSite() {
        return aSite;
    }

    public void setaSite(String aSite) {
        this.aSite = aSite == null ? null : aSite.trim();
    }

    public String getaAbsent() {
        return aAbsent;
    }

    public void setaAbsent(String aAbsent) {
        this.aAbsent = aAbsent == null ? null : aAbsent.trim();
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent == null ? null : aContent.trim();
    }

    public String getaText() {
        return aText;
    }

    public void setaText(String aText) {
        this.aText = aText == null ? null : aText.trim();
    }
}