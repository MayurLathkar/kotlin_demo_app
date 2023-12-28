package app.yulu.bike.models;

import com.google.gson.annotations.SerializedName;

public class HasOpenJourneyRequest {

    @SerializedName("appVersion")
    private String appVersion;
    @SerializedName("device_name")
    private String device_name;
    @SerializedName("device_version")
    private String device_version;
    @SerializedName("latitude")
    private String latitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @SerializedName("longitude")
    private String longitude;

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    public String getDevice_version() {
        return device_version;
    }

    public void setDevice_version(String device_version) {
        this.device_version = device_version;
    }
}
