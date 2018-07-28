package it.xdnl.hazelcast.monitor.agent.product;

import it.xdnl.chat.typescript.annotation.TypescriptDTO;

@TypescriptDTO
public class DistributedObjectSummary {
    private String partitionKey;
    private String name;

    public DistributedObjectSummary() {
    }

    public DistributedObjectSummary(final String name, final String partitionKey) {
        this.name = name;
        this.partitionKey = partitionKey;
    }

    public String getPartitionKey() {
        return partitionKey;
    }

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}