/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.nest.internal.data;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * Default properties shared across all nest devices.
 *
 * @author David Bennett
 */
public class BaseNestDevice {
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName("name")
    private String name;
    @SerializedName("name_long")
    private String nameLong;
    @SerializedName("last_connection")
    private Date lastConnection;
    @SerializedName("is_online")
    private boolean isOnline;
    @SerializedName("software_version")
    private String softwareVersion;
    @SerializedName("structure_id")
    private String structureId;
    @SerializedName("where_id")
    private String whereId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public Date getLastConnection() {
        return lastConnection;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public String getNameLong() {
        return nameLong;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public String getStructureId() {
        return structureId;
    }

    public String getWhereId() {
        return whereId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
        result = prime * result + (isOnline ? 1231 : 1237);
        result = prime * result + ((lastConnection == null) ? 0 : lastConnection.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((nameLong == null) ? 0 : nameLong.hashCode());
        result = prime * result + ((softwareVersion == null) ? 0 : softwareVersion.hashCode());
        result = prime * result + ((structureId == null) ? 0 : structureId.hashCode());
        result = prime * result + ((whereId == null) ? 0 : whereId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BaseNestDevice other = (BaseNestDevice) obj;
        if (deviceId == null) {
            if (other.deviceId != null) {
                return false;
            }
        } else if (!deviceId.equals(other.deviceId)) {
            return false;
        }
        if (isOnline != other.isOnline) {
            return false;
        }
        if (lastConnection == null) {
            if (other.lastConnection != null) {
                return false;
            }
        } else if (!lastConnection.equals(other.lastConnection)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (nameLong == null) {
            if (other.nameLong != null) {
                return false;
            }
        } else if (!nameLong.equals(other.nameLong)) {
            return false;
        }
        if (softwareVersion == null) {
            if (other.softwareVersion != null) {
                return false;
            }
        } else if (!softwareVersion.equals(other.softwareVersion)) {
            return false;
        }
        if (structureId == null) {
            if (other.structureId != null) {
                return false;
            }
        } else if (!structureId.equals(other.structureId)) {
            return false;
        }
        if (whereId == null) {
            if (other.whereId != null) {
                return false;
            }
        } else if (!whereId.equals(other.whereId)) {
            return false;
        }
        return true;
    }

}
