package com.smnirjhor.academics;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Entity
public class Academics {
    @Id
    private String academicsId;
    private String academicsName;
    private String academicsInfo;

    public Academics() {
    }

    public Academics(String academicsId, String academicsName, String academicsInfo) {
        this.academicsId = academicsId;
        this.academicsName = academicsName;
        this.academicsInfo = academicsInfo;
    }

    public String getAcademicsId() {
        return academicsId;
    }

    public void setAcademicsId(String academicsId) {
        this.academicsId = academicsId;
    }

    public String getAcademicsName() {
        return academicsName;
    }

    public void setAcademicsName(String academicsName) {
        this.academicsName = academicsName;
    }

    public String getAcademicsInfo() {
        return academicsInfo;
    }

    public void setAcademicsInfo(String academicsInfo) {
        this.academicsInfo = academicsInfo;
    }
}
