package modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "url",
    "green",
    "bytes",
    "cleanerThan",
    "statistics",
    "timestamp",})
public class Common {

    @JsonProperty("url")
    private String url;
    @JsonProperty("green")
    private Boolean green;
    @JsonProperty("bytes")
    private int bytes;
    @JsonProperty("cleanerThan")
    private String cleanerThan;
    @JsonProperty("statistics")
    private Statistics statistics;
    @JsonProperty("timestamp")
    private long timestamp;

    public Common(String url, Boolean green, int bytes, String cleanerThan, Statistics statistics, long timestamp) {
        this.url = url;
        this.green = green;
        this.bytes = bytes;
        this.cleanerThan = cleanerThan;
        this.statistics = statistics;
        this.timestamp = timestamp;
    }

    public Common() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getGreen() {
        return green;
    }

    public void setGreen(Boolean green) {
        this.green = green;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public String getCleanerThan() {
        return cleanerThan;
    }

    public void setCleanerThan(String cleanerThan) {
        this.cleanerThan = cleanerThan;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Common{" + "url=" + url + ", green=" + green + ", bytes=" + bytes + ", cleanerThan=" + cleanerThan + ", statistics=" + statistics + ", timestamp=" + timestamp + '}';
    }

}
