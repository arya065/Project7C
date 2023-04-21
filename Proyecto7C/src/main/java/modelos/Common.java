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
    private String green;
    @JsonProperty("bytes")
    private int bytes;
    @JsonProperty("cleanerThan")
    private String cleanerThan;
    @JsonProperty("statistics")
    private Statistics statistics;
    @JsonProperty("timestamp")
    private long timestamp;

    public Common(String url, String green, int bytes, String cleanerThan, Statistics statistics, long timestamp) {
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

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
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
        return "\n" + "url=" + url + ", \n" + "green=" + green + ", \n" + "bytes=" + bytes + ", \n"
                + "cleanerThan=" + cleanerThan + ", \n"
                + "statistics:"+ "\n" + statistics + "timestamp=" + timestamp + "\n";
    }

}
