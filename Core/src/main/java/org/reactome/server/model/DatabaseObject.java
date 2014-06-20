package org.reactome.server.model;

// Generated Jul 8, 2011 1:48:55 PM by Hibernate Tools 3.4.0.CR1

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * DatabaseObject generated by hbm2java
 */

@XmlRootElement
public class DatabaseObject implements java.io.Serializable {

    private Long dbId;
    private String displayName;
    private Date timestamp;
    private InstanceEdit created;
    private List<InstanceEdit> modified;
    private StableIdentifier stableIdentifier;

    public DatabaseObject() {
    }

    public List<InstanceEdit> getModified() {
        return modified;
    }

    public void setModified(List<InstanceEdit> modified) {
        this.modified = modified;
    }

    public Long getDbId() {
        return this.dbId;
    }

    public void setDbId(Long dbId) {
        this.dbId = dbId;
    }

    public String getAvailableIdentifier(){
        return stableIdentifier!=null?stableIdentifier.getDisplayName().split("\\.")[0]:dbId.toString();
    }

    @XmlElement
    public String getSchemaClass() {
        return getClass().getSimpleName();
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public InstanceEdit getCreated() {
        return this.created;
    }

    public void setCreated(InstanceEdit created) {
        this.created = created;
    }

    public StableIdentifier getStableIdentifier() {
        return this.stableIdentifier;
    }

    public void setStableIdentifier(StableIdentifier stableIdentifier) {
        this.stableIdentifier = stableIdentifier;
    }
}
