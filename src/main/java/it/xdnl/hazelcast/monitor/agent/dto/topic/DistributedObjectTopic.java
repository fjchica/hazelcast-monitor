package it.xdnl.hazelcast.monitor.agent.dto.topic;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import it.xdnl.hazelcast.monitor.agent.producer.DistributedObjectTopicProducer;

/**
 * Topic for a specific distributed object
 */
public class DistributedObjectTopic extends AbstractTopic {
    public static final String TOPIC_TYPE = DistributedObjectTopicProducer.TOPIC_TYPE;
    private DistributedObjectType distributedObjectType;
    private String objectName;

    @JsonCreator
    public DistributedObjectTopic(@JsonProperty("instanceName") final String instanceName, @JsonProperty("objectName") final String objectName) {
        super(TOPIC_TYPE, instanceName);
        this.objectName = objectName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public DistributedObjectType getDistributedObjectType() {
        return distributedObjectType;
    }

    public void setDistributedObjectType(DistributedObjectType distributedObjectType) {
        this.distributedObjectType = distributedObjectType;
    }
}
