package io.github.danushka96.models;

import io.github.danushka96.enums.ServiceNames;

/**
 * @author danushka
 * 11/14/2020
 */
public class SimulcastDestinations {
    private SimulcastDestinationsMetaData metaData;
    private String rtmp_link;
    private String service_name;
    private String stream_key;

    public SimulcastDestinations(SimulcastDestinationsMetaData metaData, String rtmp_link, String service_name, String stream_key) {
        this.metaData = metaData;
        this.rtmp_link = rtmp_link;
        this.service_name = service_name;
        this.stream_key = stream_key;
    }

    public SimulcastDestinationsMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(SimulcastDestinationsMetaData metaData) {
        this.metaData = metaData;
    }

    public String getRtmp_link() {
        return rtmp_link;
    }

    public void setRtmp_link(String rtmp_link) {
        this.rtmp_link = rtmp_link;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getStream_key() {
        return stream_key;
    }

    public void setStream_key(String stream_key) {
        this.stream_key = stream_key;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private SimulcastDestinationsMetaData metaData;
        private String rtmp_link;
        private String service_name;
        private String stream_key;

        public Builder withMetaData(SimulcastDestinationsMetaData metaData) {
            this.metaData = metaData;
            return this;
        }

        /**
         * The RTMP URL of a destination beyond Vimeo where the simulcast should be pushed.
         *
         * @param rtmpLink
         * @return
         */
        public Builder withRTMPLink(String rtmpLink) {
            this.rtmp_link = rtmpLink;
            return this;
        }

        /**
         * The name of the external host of the simulcast.Option descriptions:
         * custom_rtmp - The host is customer-specified.
         * facebook - The host is Facebook Live.
         * livestream - The host is Livestream.
         * periscope - The host is Periscope.
         * youtube - The host is YouTube Live.
         * custom_rtmp
         * facebook
         * livestream
         * periscope
         * youtube
         *
         * @param serviceName
         * @return
         */
        public Builder withServiceName(ServiceNames serviceName) {
            this.service_name = serviceName.getVal();
            return this;
        }

        /**
         * The RTMP URL of a destination beyond Vimeo where the simulcast should be pushed.
         *
         * @param streamKey
         * @return
         */
        public Builder withStreamKey(String streamKey) {
            this.stream_key = streamKey;
            return this;
        }

        public SimulcastDestinations build() {
            return new SimulcastDestinations(metaData, rtmp_link, service_name, stream_key);
        }
    }
}
